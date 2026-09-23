package regulation.us.fr2052a.datatables.supplemental

/** Generated based on US.FR2052A.DataTables.Supplemental.BalanceSheet
*/
object BalanceSheet{

  final case class BalanceSheet(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    collectionReference: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollectionReference.CollectionReference],
    product: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product,
    productReference: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ProductReference.ProductReference],
    subProductReference: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProductReference.SubProductReference],
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    effectiveMaturityBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket],
    encumbranceType: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType],
    marketValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MarketValue.MarketValue],
    maturityAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount],
    collateralValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralValue.CollateralValue],
    counterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Counterparty.Counterparty],
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    riskWeight: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.RiskWeight.RiskWeight],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty]
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CarryingValueAdjustment extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
    
    case object CounterpartyNetting extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
    
    case object NonPerformingAssets extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
    
    case object OtherAssets extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
    
    case object OtherLiabilities extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
    
    case object RegulatoryCapitalElement extends regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product{}
  
  }
  
  val CarryingValueAdjustment: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.CarryingValueAdjustment.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.CarryingValueAdjustment
  
  val CounterpartyNetting: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.CounterpartyNetting.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.CounterpartyNetting
  
  val NonPerformingAssets: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.NonPerformingAssets.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.NonPerformingAssets
  
  val OtherAssets: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.OtherAssets.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.OtherAssets
  
  val OtherLiabilities: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.OtherLiabilities.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.OtherLiabilities
  
  val RegulatoryCapitalElement: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.RegulatoryCapitalElement.type  = regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product.RegulatoryCapitalElement
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.RegulatoryCapitalElement : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.OtherLiabilities : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.NonPerformingAssets : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.OtherAssets : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.CounterpartyNetting : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.BalanceSheet.CarryingValueAdjustment : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product])
    }
  
  def sB1: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.RegulatoryCapitalElement : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)
  
  def sB2: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.OtherLiabilities : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)
  
  def sB3: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.NonPerformingAssets : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)
  
  def sB4: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.OtherAssets : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)
  
  def sB5: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.CounterpartyNetting : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)
  
  def sB6: regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product =
    (regulation.us.fr2052a.datatables.supplemental.BalanceSheet.CarryingValueAdjustment : regulation.us.fr2052a.datatables.supplemental.BalanceSheet.Product)

}