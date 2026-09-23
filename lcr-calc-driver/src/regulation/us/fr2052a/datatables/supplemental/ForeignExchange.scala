package regulation.us.fr2052a.datatables.supplemental

/** Generated based on US.FR2052A.DataTables.Supplemental.ForeignExchange
*/
object ForeignExchange{

  final case class ForeignExchange(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product,
    maturityAmountCurrency1: regulation.us.fr2052a.fields.MaturityAmountCurrency1.MaturityAmountCurrency1,
    maturityAmountCurrency2: regulation.us.fr2052a.fields.MaturityAmountCurrency2.MaturityAmountCurrency2,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    foreignExchangeOptionDirection: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForeignExchangeOptionDirection.ForeignExchangeOptionDirection],
    forwardStartAmountCurrency1: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmountCurrency1.ForwardStartAmountCurrency1],
    forwardStartAmountCurrency2: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmountCurrency2.ForwardStartAmountCurrency2],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    counterparty: regulation.us.fr2052a.fields.Counterparty.Counterparty,
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    settlement: regulation.us.fr2052a.fields.Settlement.Settlement,
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine,
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty]
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object ForwardsAndFutures extends regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product{}
    
    case object Spot extends regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product{}
    
    case object Swaps extends regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product{}
  
  }
  
  val ForwardsAndFutures: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.ForwardsAndFutures.type  = regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.ForwardsAndFutures
  
  val Spot: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.Spot.type  = regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.Spot
  
  val Swaps: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.Swaps.type  = regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product.Swaps
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Spot : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.ForeignExchange.ForwardsAndFutures : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Swaps : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product])
    }
  
  def sFX1: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product =
    (regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Spot : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)
  
  def sFX2: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product =
    (regulation.us.fr2052a.datatables.supplemental.ForeignExchange.ForwardsAndFutures : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)
  
  def sFX3: regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product =
    (regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Swaps : regulation.us.fr2052a.datatables.supplemental.ForeignExchange.Product)

}