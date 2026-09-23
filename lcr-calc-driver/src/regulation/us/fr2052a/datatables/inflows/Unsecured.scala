package regulation.us.fr2052a.datatables.inflows

/** Generated based on US.FR2052A.DataTables.Inflows.Unsecured
*/
object Unsecured{

  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CashItemsInTheProcessOfCollection extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object ExcessOperationalBalances extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object OffshorePlacements extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object OnshorePlacements extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object OtherLoans extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object OutstandingDrawsOnUnsecuredRevolvingFacilities extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object RequiredOperationalBalances extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
    
    case object ShortTermInvestments extends regulation.us.fr2052a.datatables.inflows.Unsecured.Product{}
  
  }
  
  val CashItemsInTheProcessOfCollection: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.CashItemsInTheProcessOfCollection.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.CashItemsInTheProcessOfCollection
  
  val ExcessOperationalBalances: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.ExcessOperationalBalances.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.ExcessOperationalBalances
  
  val OffshorePlacements: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OffshorePlacements.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OffshorePlacements
  
  val OnshorePlacements: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OnshorePlacements.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OnshorePlacements
  
  val OtherLoans: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OtherLoans.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OtherLoans
  
  val OutstandingDrawsOnUnsecuredRevolvingFacilities: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OutstandingDrawsOnUnsecuredRevolvingFacilities.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.OutstandingDrawsOnUnsecuredRevolvingFacilities
  
  val RequiredOperationalBalances: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.RequiredOperationalBalances.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.RequiredOperationalBalances
  
  val ShortTermInvestments: regulation.us.fr2052a.datatables.inflows.Unsecured.Product.ShortTermInvestments.type  = regulation.us.fr2052a.datatables.inflows.Unsecured.Product.ShortTermInvestments
  
  final case class Unsecured(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.inflows.Unsecured.Product,
    counterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Counterparty.Counterparty],
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    maturityOptionality: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityOptionality.MaturityOptionality],
    effectiveMaturityBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket],
    encumbranceType: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType],
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    riskWeight: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.RiskWeight.RiskWeight],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  def iU1: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.OnshorePlacements : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU2: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.OffshorePlacements : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU3: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.RequiredOperationalBalances : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU4: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.ExcessOperationalBalances : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU5: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.OutstandingDrawsOnUnsecuredRevolvingFacilities : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU6: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.OtherLoans : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU7: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.CashItemsInTheProcessOfCollection : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def iU8: regulation.us.fr2052a.datatables.inflows.Unsecured.Product =
    (regulation.us.fr2052a.datatables.inflows.Unsecured.ShortTermInvestments : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.OnshorePlacements : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.OffshorePlacements : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.RequiredOperationalBalances : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.ExcessOperationalBalances : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.OutstandingDrawsOnUnsecuredRevolvingFacilities : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.OtherLoans : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.CashItemsInTheProcessOfCollection : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Unsecured.ShortTermInvestments : regulation.us.fr2052a.datatables.inflows.Unsecured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Unsecured.Product])
    }

}