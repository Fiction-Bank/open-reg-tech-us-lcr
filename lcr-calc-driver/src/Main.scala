import java.sql.{Connection, DriverManager, PreparedStatement}
import java.security.KeyFactory
import java.security.spec.PKCS8EncodedKeySpec
import java.time.LocalDate
import java.util.Base64
import scala.collection.mutable
import scala.io.Source

import morphir.sdk.Maybe.{Maybe, Just, Nothing => MNothing}
import regulation.us.fr2052a.DataTables.{DataTables, Inflows, Outflows, Supplemental}
import regulation.us.fr2052a.fields.MaturityBucket.{MaturityBucket => MB, Day, DayRange, Open, Perpetual}
import regulation.us.fr2052a.datatables.{inflows => IN, outflows => OUT, supplemental => SUP}
import regulation.us.lcr.Calculations

/** Real daily LCR calculation: reads the 13 FR2052a landing tables out of
  * FICTION_BANK.LCR, maps each row into the Morphir-generated case classes
  * (Morphir -> Scala backend), and calls the genuine FR 2052a/LCR business
  * logic (regulation.us.lcr.Calculations.lcr) to compute a real ratio.
  *
  * This is the middle-office risk calculation step in the front -> middle ->
  * back office chain: sec-lending/TraderX positions land here via the 6G dbt
  * mapping, this driver computes the ratio, and a separate Airflow task
  * freezes the result into LCR_REGULATORY_FILING (the back-office gate).
  */
object Main {

  // ---------------------------------------------------------------------
  // Snowflake connectivity (key-pair auth, JSON result format to avoid the
  // Arrow/JDK25 module-system crash — see TestJdbc.scala precedent).
  // ---------------------------------------------------------------------
  def loadPrivateKey(path: String): java.security.PrivateKey = {
    val pem = Source.fromFile(path).mkString
    val der = pem
      .replace("-----BEGIN PRIVATE KEY-----", "")
      .replace("-----END PRIVATE KEY-----", "")
      .replaceAll("\\s", "")
    KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder.decode(der)))
  }

  def connect(): Connection = {
    Class.forName("net.snowflake.client.jdbc.SnowflakeDriver")
    val props = new java.util.Properties()
    props.put("user", sys.env.getOrElse("SNOWFLAKE_USER", "SVC_FICTION_BANK_ETL"))
    props.put("role", sys.env.getOrElse("SNOWFLAKE_ROLE", "FICTION_BANK_ETL_LOADER"))
    props.put("warehouse", sys.env.getOrElse("SNOWFLAKE_WAREHOUSE", "COMPUTE_WH"))
    props.put("JDBC_QUERY_RESULT_FORMAT", "JSON")
    val keyPath = sys.env.getOrElse("SNOWFLAKE_PRIVATE_KEY_PATH", sys.env("HOME") + "/.tokens/snowflake_svc_etl_loader_p8.pem")
    props.put("privateKey", loadPrivateKey(keyPath))
    val account = sys.env.getOrElse("SNOWFLAKE_ACCOUNT", "XAA48144")
    DriverManager.getConnection(s"jdbc:snowflake://$account.snowflakecomputing.com", props)
  }

  def rowsForDate(conn: Connection, table: String, reportingDate: String): List[Map[String, AnyRef]] = {
    val ps: PreparedStatement = conn.prepareStatement(
      s"SELECT * FROM FICTION_BANK.LCR.$table WHERE REPORTING_DATE = ? AND IS_CURRENT = TRUE"
    )
    ps.setString(1, reportingDate)
    val rs = ps.executeQuery()
    val meta = rs.getMetaData
    val cols = (1 to meta.getColumnCount).map(meta.getColumnName)
    val buf = mutable.ListBuffer[Map[String, AnyRef]]()
    while (rs.next()) buf += cols.map(c => c -> rs.getObject(c)).toMap
    rs.close(); ps.close()
    buf.toList
  }

  // ---------------------------------------------------------------------
  // Generic field converters (DB column -> Morphir field value)
  // ---------------------------------------------------------------------
  def str(m: Map[String, AnyRef], c: String): String =
    Option(m.getOrElse(c, null)).map(_.toString).getOrElse("")

  def optStr(m: Map[String, AnyRef], c: String): Maybe[String] =
    Option(m.getOrElse(c, null)).map(v => Just(v.toString): Maybe[String]).getOrElse(MNothing)

  private def toFloat(v: AnyRef): Double = v match {
    case n: Number => n.doubleValue()
    case s         => s.toString.toDouble
  }

  def flt(m: Map[String, AnyRef], c: String): Double =
    Option(m.getOrElse(c, null)).map(toFloat).getOrElse(0.0d)

  def optFlt(m: Map[String, AnyRef], c: String): Maybe[Double] =
    Option(m.getOrElse(c, null)).map(v => Just(toFloat(v)): Maybe[Double]).getOrElse(MNothing)

  private def toBool(v: AnyRef): Boolean = v match {
    case b: java.lang.Boolean => b.booleanValue()
    case s                    => s.toString.equalsIgnoreCase("true")
  }

  def bool(m: Map[String, AnyRef], c: String): Boolean =
    Option(m.getOrElse(c, null)).exists(toBool)

  def optBool(m: Map[String, AnyRef], c: String): Maybe[Boolean] =
    Option(m.getOrElse(c, null)).map(v => Just(toBool(v)): Maybe[Boolean]).getOrElse(MNothing)

  // ---------------------------------------------------------------------
  // Reflection-based closed-enum resolution.
  //
  // Morphir's Scala backend exposes every case (case object, or a per-table
  // "Product" case) as a flat, capitalized, zero-arg accessor method directly
  // on the enclosing module (e.g. Currency$.USD(), Assets$.UnencumberedAssets()).
  // Every other generated helper (isCash, productFromID, allClasses, ...) is
  // lowerCamelCase, so filtering on a capitalized method name reliably finds
  // just the case accessors without needing to know the case names in advance.
  // ---------------------------------------------------------------------
  private val caseCache = mutable.Map[String, Map[String, AnyRef]]()

  def caseAccessors(moduleClassName: String): Map[String, AnyRef] =
    caseCache.getOrElseUpdate(
      moduleClassName, {
        val cls = Class.forName(moduleClassName + "$")
        val instance = cls.getField("MODULE$").get(null)
        cls.getMethods.toList
          .filter(m => m.getParameterCount == 0 && m.getName.nonEmpty && m.getName.head.isUpper && m.getDeclaringClass == cls)
          .map(m => m.getName -> m.invoke(instance))
          .toMap
      }
    )

  private def norm(s: String): String = s.toUpperCase.replaceAll("[^A-Z0-9]", "")

  def resolveCase(moduleClassName: String, dbValue: String, label: String): AnyRef = {
    val cases = caseAccessors(moduleClassName)
    cases
      .get(dbValue)
      .orElse(cases.find { case (k, _) => norm(k) == norm(dbValue) }.map(_._2))
      .getOrElse {
        val fallback = cases.toList.sortBy(_._1).head
        System.err.println(s"WARN: no case match for $label='$dbValue' in $moduleClassName; defaulting to ${fallback._1}")
        fallback._2
      }
  }

  def enumField[T <: AnyRef](m: Map[String, AnyRef], c: String, moduleClassName: String): T =
    resolveCase(moduleClassName, str(m, c), c).asInstanceOf[T]

  def optEnumField[T <: AnyRef](m: Map[String, AnyRef], c: String, moduleClassName: String): Maybe[T] =
    Option(m.getOrElse(c, null))
      .map(v => Just(resolveCase(moduleClassName, v.toString, c).asInstanceOf[T]): Maybe[T])
      .getOrElse(MNothing)

  // ---------------------------------------------------------------------
  // MaturityBucket: a real algebraic sum type (Day/DayRange/Open/Perpetual/
  // YearAbove/YearRange), not a closed enum, so it can't go through
  // caseAccessors — parsed by hand from the bucket-label convention used by
  // the 6G dbt mapping (see finance/src/ddl/lcr.sql column comments).
  // ---------------------------------------------------------------------
  def maturityBucketOf(label: String): MB = label match {
    case null | "OPEN"        => Open
    case "PERPETUAL"          => Perpetual
    case "OVERNIGHT"          => Day(1)
    case "2_30_DAY"           => DayRange(2, 30)
    case "31_90_DAY"          => DayRange(31, 90)
    case "OVER_90_DAY"        => DayRange(91, 3650)
    case other =>
      System.err.println(s"WARN: unrecognized MATURITY_BUCKET '$other'; defaulting to Open")
      Open
  }

  def mb(m: Map[String, AnyRef], c: String): MB =
    maturityBucketOf(Option(m.getOrElse(c, null)).map(_.toString).orNull)

  def optMb(m: Map[String, AnyRef], c: String): Maybe[MB] =
    Option(m.getOrElse(c, null)).map(v => Just(maturityBucketOf(v.toString)): Maybe[MB]).getOrElse(MNothing)

  private val CURRENCY = "regulation.us.fr2052a.fields.Currency"
  private val COUNTERPARTY = "regulation.us.fr2052a.fields.Counterparty"
  private val INSURED = "regulation.us.fr2052a.fields.Insured"

  // ---------------------------------------------------------------------
  // Per-table row -> case class builders
  // ---------------------------------------------------------------------
  def buildAssets(m: Map[String, AnyRef]): IN.Assets.Assets =
    IN.Assets.Assets(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.inflows.Assets"),
      subProduct = optStr(m, "SUB_PRODUCT"),
      marketValue = flt(m, "MARKET_VALUE"),
      lendableValue = str(m, "LENDABLE_VALUE"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      collateralClass = str(m, "COLLATERAL_CLASS"),
      treasuryControl = bool(m, "TREASURY_CONTROL"),
      accountingDesignation = str(m, "ACCOUNTING_DESIGNATION"),
      effectiveMaturityBucket = optMb(m, "EFFECTIVE_MATURITY_BUCKET"),
      encumbranceType = optStr(m, "ENCUMBRANCE_TYPE"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildInflowsOther(m: Map[String, AnyRef]): IN.Other.Other =
    IN.Other.Other(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.inflows.Other"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      collateralValue = optFlt(m, "COLLATERAL_VALUE"),
      treasuryControl = bool(m, "TREASURY_CONTROL"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildInflowsSecured(m: Map[String, AnyRef]): IN.Secured.Secured =
    IN.Secured.Secured(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.inflows.Secured"),
      subProduct = optStr(m, "SUB_PRODUCT"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      maturityOptionality = optStr(m, "MATURITY_OPTIONALITY"),
      effectiveMaturityBucket = optMb(m, "EFFECTIVE_MATURITY_BUCKET"),
      encumbranceType = optStr(m, "ENCUMBRANCE_TYPE"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      collateralClass = str(m, "COLLATERAL_CLASS"),
      collateralValue = flt(m, "COLLATERAL_VALUE"),
      unencumbered = bool(m, "UNENCUMBERED"),
      treasuryControl = bool(m, "TREASURY_CONTROL"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      riskWeight = optStr(m, "RISK_WEIGHT"),
      businessLine = str(m, "BUSINESS_LINE"),
      settlement = str(m, "SETTLEMENT"),
      counterparty = enumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB")
    )

  def buildUnsecured(m: Map[String, AnyRef]): IN.Unsecured.Unsecured =
    IN.Unsecured.Unsecured(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.inflows.Unsecured"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      maturityOptionality = optStr(m, "MATURITY_OPTIONALITY"),
      effectiveMaturityBucket = optMb(m, "EFFECTIVE_MATURITY_BUCKET"),
      encumbranceType = optStr(m, "ENCUMBRANCE_TYPE"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      riskWeight = optStr(m, "RISK_WEIGHT"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildDeposits(m: Map[String, AnyRef]): OUT.Deposits.Deposits =
    OUT.Deposits.Deposits(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.outflows.Deposits"),
      counterparty = enumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      maturityOptionality = optStr(m, "MATURITY_OPTIONALITY"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      collateralValue = optFlt(m, "COLLATERAL_VALUE"),
      insured = enumField(m, "INSURED", INSURED),
      trigger = str(m, "OUTFLOW_TRIGGER"),
      rehypothecated = optBool(m, "REHYPOTHECATED"),
      businessLine = str(m, "BUSINESS_LINE"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY")
    )

  def buildOutflowsOther(m: Map[String, AnyRef]): OUT.Other.Other =
    OUT.Other.Other(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.outflows.Other"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      collateralValue = optFlt(m, "COLLATERAL_VALUE"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildOutflowsSecured(m: Map[String, AnyRef]): OUT.Secured.Secured =
    OUT.Secured.Secured(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.outflows.Secured"),
      subProduct = optStr(m, "SUB_PRODUCT"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      maturityOptionality = optStr(m, "MATURITY_OPTIONALITY"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      collateralClass = str(m, "COLLATERAL_CLASS"),
      collateralValue = flt(m, "COLLATERAL_VALUE"),
      treasuryControl = bool(m, "TREASURY_CONTROL"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE"),
      settlement = str(m, "SETTLEMENT"),
      rehypothecated = bool(m, "REHYPOTHECATED"),
      counterparty = enumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB")
    )

  def buildWholesale(m: Map[String, AnyRef]): OUT.Wholesale.Wholesale =
    OUT.Wholesale.Wholesale(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.outflows.Wholesale"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      maturityAmount = flt(m, "MATURITY_AMOUNT"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      maturityOptionality = optStr(m, "MATURITY_OPTIONALITY"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      collateralValue = optFlt(m, "COLLATERAL_VALUE"),
      forwardStartAmount = optFlt(m, "FORWARD_START_AMOUNT"),
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      lossAbsorbency = optStr(m, "LOSS_ABSORBENCY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildBalanceSheet(m: Map[String, AnyRef]): SUP.BalanceSheet.BalanceSheet =
    SUP.BalanceSheet.BalanceSheet(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      collectionReference = optStr(m, "COLLECTION_REFERENCE"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.supplemental.BalanceSheet"),
      productReference = optStr(m, "PRODUCT_REFERENCE"),
      subProductReference = optStr(m, "SUB_PRODUCT_REFERENCE"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      effectiveMaturityBucket = optMb(m, "EFFECTIVE_MATURITY_BUCKET"),
      encumbranceType = optStr(m, "ENCUMBRANCE_TYPE"),
      marketValue = optFlt(m, "MARKET_VALUE"),
      maturityAmount = optFlt(m, "MATURITY_AMOUNT"),
      collateralValue = optFlt(m, "COLLATERAL_VALUE"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      riskWeight = optStr(m, "RISK_WEIGHT"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY")
    )

  def buildDerivativesCollateral(m: Map[String, AnyRef]): SUP.DerivativesCollateral.DerivativesCollateral =
    SUP.DerivativesCollateral.DerivativesCollateral(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral"),
      subProduct = optStr(m, "SUB_PRODUCT"),
      subProduct2 = optStr(m, "SUB_PRODUCT2"),
      marketValue = flt(m, "MARKET_VALUE"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      collateralLevel = optStr(m, "COLLATERAL_LEVEL"),
      counterparty = optEnumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      effectiveMaturityBucket = optMb(m, "EFFECTIVE_MATURITY_BUCKET"),
      encumbranceType = optStr(m, "ENCUMBRANCE_TYPE"),
      nettingEligible = optStr(m, "NETTING_ELIGIBLE"),
      treasuryControl = optBool(m, "TREASURY_CONTROL"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildForeignExchange(m: Map[String, AnyRef]): SUP.ForeignExchange.ForeignExchange =
    SUP.ForeignExchange.ForeignExchange(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.supplemental.ForeignExchange"),
      // MATURITY_AMOUNT_CCY1/2 are modeled physically as notional amounts, but
      // the Morphir schema types these fields as Currency (the leg's
      // denomination), not a Float — defaulting both legs to the row's own
      // reporting currency since no second-currency leg is captured yet.
      maturityAmountCurrency1 = enumField(m, "CURRENCY", CURRENCY),
      maturityAmountCurrency2 = enumField(m, "CURRENCY", CURRENCY),
      maturityBucket = mb(m, "MATURITY_BUCKET"),
      foreignExchangeOptionDirection = optStr(m, "FX_OPTION_DIRECTION"),
      forwardStartAmountCurrency1 = MNothing,
      forwardStartAmountCurrency2 = MNothing,
      forwardStartBucket = optMb(m, "FORWARD_START_BUCKET"),
      counterparty = enumField(m, "COUNTERPARTY", COUNTERPARTY),
      gSIB = optStr(m, "GSIB"),
      settlement = str(m, "SETTLEMENT"),
      businessLine = str(m, "BUSINESS_LINE"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY")
    )

  def buildInformational(m: Map[String, AnyRef]): SUP.Informational.Informational =
    SUP.Informational.Informational(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.supplemental.Informational"),
      marketValue = flt(m, "MARKET_VALUE"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY"),
      businessLine = str(m, "BUSINESS_LINE")
    )

  def buildLiquidityRiskMeasurement(m: Map[String, AnyRef]): SUP.LiquidityRiskMeasurement.LiquidityRiskMeasurement =
    SUP.LiquidityRiskMeasurement.LiquidityRiskMeasurement(
      currency = enumField(m, "CURRENCY", CURRENCY),
      converted = bool(m, "CONVERTED"),
      reportingEntity = str(m, "REPORTING_ENTITY"),
      product = enumField(m, "PRODUCT", "regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement"),
      marketValue = flt(m, "MARKET_VALUE"),
      collateralClass = optStr(m, "COLLATERAL_CLASS"),
      internal = str(m, "INTERNAL"),
      internalCounterparty = optStr(m, "INTERNAL_COUNTERPARTY")
    )

  // ---------------------------------------------------------------------
  // Main
  // ---------------------------------------------------------------------
  def main(args: Array[String]): Unit = {
    val reportingDate = args.headOption.getOrElse(LocalDate.now().toString)
    println(s"Running LCR calculation for REPORTING_DATE=$reportingDate")

    val conn = connect()
    try {
      val data = DataTables(
        inflows = Inflows(
          assets = rowsForDate(conn, "FR2052A_INFLOWS_ASSETS", reportingDate).map(buildAssets),
          unsecured = rowsForDate(conn, "FR2052A_INFLOWS_UNSECURED", reportingDate).map(buildUnsecured),
          secured = rowsForDate(conn, "FR2052A_INFLOWS_SECURED", reportingDate).map(buildInflowsSecured),
          other = rowsForDate(conn, "FR2052A_INFLOWS_OTHER", reportingDate).map(buildInflowsOther)
        ),
        outflows = Outflows(
          deposits = rowsForDate(conn, "FR2052A_OUTFLOWS_DEPOSITS", reportingDate).map(buildDeposits),
          wholesale = rowsForDate(conn, "FR2052A_OUTFLOWS_WHOLESALE", reportingDate).map(buildWholesale),
          secured = rowsForDate(conn, "FR2052A_OUTFLOWS_SECURED", reportingDate).map(buildOutflowsSecured),
          other = rowsForDate(conn, "FR2052A_OUTFLOWS_OTHER", reportingDate).map(buildOutflowsOther)
        ),
        supplemental = Supplemental(
          informational = rowsForDate(conn, "FR2052A_SUPPLEMENTAL_INFORMATIONAL", reportingDate).map(buildInformational),
          derivativesCollateral =
            rowsForDate(conn, "FR2052A_SUPPLEMENTAL_DERIVATIVES_COLLATERAL", reportingDate).map(buildDerivativesCollateral),
          liquidityRiskMeasurement =
            rowsForDate(conn, "FR2052A_SUPPLEMENTAL_LIQUIDITY_RISK_MEASUREMENT", reportingDate).map(buildLiquidityRiskMeasurement),
          balanceSheet = rowsForDate(conn, "FR2052A_SUPPLEMENTAL_BALANCE_SHEET", reportingDate).map(buildBalanceSheet),
          foreignExchange = rowsForDate(conn, "FR2052A_SUPPLEMENTAL_FOREIGN_EXCHANGE", reportingDate).map(buildForeignExchange)
        )
      )

      val rowCount =
        data.inflows.assets.size + data.inflows.unsecured.size + data.inflows.secured.size + data.inflows.other.size +
          data.outflows.deposits.size + data.outflows.wholesale.size + data.outflows.secured.size + data.outflows.other.size +
          data.supplemental.informational.size + data.supplemental.derivativesCollateral.size +
          data.supplemental.liquidityRiskMeasurement.size + data.supplemental.balanceSheet.size + data.supplemental.foreignExchange.size
      println(s"Loaded $rowCount row(s) across 13 FR2052a tables for $reportingDate")

      val bankCategoryName = sys.env.getOrElse("LCR_BANK_CATEGORY", "CategoryIVBoardRegulatedInstitution")
      val bankCategory = resolveCase("regulation.us.lcr.Calculations", bankCategoryName, "LCR_BANK_CATEGORY")
        .asInstanceOf[Calculations.BankCategory]

      val hqla: Double = Calculations.hqlaAmount(data)
      val outflows: Double = Calculations.totalNetCashOutflows(data)(bankCategory)
      val ratio: Double = if (outflows == 0.0d) Double.NaN else Calculations.lcr(bankCategory)(data)

      println(f"HQLA amount:              $hqla%,.2f")
      println(f"Total net cash outflows:  $outflows%,.2f")
      println(f"LCR ratio:                $ratio%.4f")

      val insert = conn.prepareStatement(
        """INSERT INTO FICTION_BANK.LCR.LCR_RATIO_RESULT
          |(REPORTING_DATE, BANK_CATEGORY, HQLA_AMOUNT, TOTAL_NET_CASH_OUTFLOWS, LCR_RATIO, CALCULATED_AT)
          |SELECT ?, ?, ?, ?, ?, CURRENT_TIMESTAMP()""".stripMargin
      )
      insert.setString(1, reportingDate)
      insert.setString(2, bankCategoryName)
      insert.setDouble(3, hqla)
      insert.setDouble(4, outflows)
      insert.setDouble(5, ratio)
      val n = insert.executeUpdate()
      insert.close()
      println(s"Wrote $n row(s) to FICTION_BANK.LCR.LCR_RATIO_RESULT")
    } finally {
      conn.close()
    }
  }
}
