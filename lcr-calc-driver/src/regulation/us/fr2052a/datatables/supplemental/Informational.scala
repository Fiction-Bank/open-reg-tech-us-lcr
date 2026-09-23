package regulation.us.fr2052a.datatables.supplemental

/** Generated based on US.FR2052A.DataTables.Supplemental.Informational
*/
object Informational{

  final case class Informational(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.supplemental.Informational.Product,
    marketValue: regulation.us.fr2052a.fields.MarketValue.MarketValue,
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object FRB23ACapacity extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
    
    case object GrossClientWiresPaid extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
    
    case object GrossClientWiresReceived extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
    
    case object LongMarketValueClientAssets extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
    
    case object ShortMarketValueClientAssets extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
    
    case object SubsidiaryLiquidityNotTransferrable extends regulation.us.fr2052a.datatables.supplemental.Informational.Product{}
  
  }
  
  val FRB23ACapacity: regulation.us.fr2052a.datatables.supplemental.Informational.Product.FRB23ACapacity.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.FRB23ACapacity
  
  val GrossClientWiresPaid: regulation.us.fr2052a.datatables.supplemental.Informational.Product.GrossClientWiresPaid.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.GrossClientWiresPaid
  
  val GrossClientWiresReceived: regulation.us.fr2052a.datatables.supplemental.Informational.Product.GrossClientWiresReceived.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.GrossClientWiresReceived
  
  val LongMarketValueClientAssets: regulation.us.fr2052a.datatables.supplemental.Informational.Product.LongMarketValueClientAssets.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.LongMarketValueClientAssets
  
  val ShortMarketValueClientAssets: regulation.us.fr2052a.datatables.supplemental.Informational.Product.ShortMarketValueClientAssets.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.ShortMarketValueClientAssets
  
  val SubsidiaryLiquidityNotTransferrable: regulation.us.fr2052a.datatables.supplemental.Informational.Product.SubsidiaryLiquidityNotTransferrable.type  = regulation.us.fr2052a.datatables.supplemental.Informational.Product.SubsidiaryLiquidityNotTransferrable
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.LongMarketValueClientAssets : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.ShortMarketValueClientAssets : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.GrossClientWiresReceived : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.GrossClientWiresPaid : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.FRB23ACapacity : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.Informational.SubsidiaryLiquidityNotTransferrable : regulation.us.fr2052a.datatables.supplemental.Informational.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.Informational.Product])
    }
  
  def sI1: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.LongMarketValueClientAssets : regulation.us.fr2052a.datatables.supplemental.Informational.Product)
  
  def sI2: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.ShortMarketValueClientAssets : regulation.us.fr2052a.datatables.supplemental.Informational.Product)
  
  def sI3: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.GrossClientWiresReceived : regulation.us.fr2052a.datatables.supplemental.Informational.Product)
  
  def sI4: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.GrossClientWiresPaid : regulation.us.fr2052a.datatables.supplemental.Informational.Product)
  
  def sI5: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.FRB23ACapacity : regulation.us.fr2052a.datatables.supplemental.Informational.Product)
  
  def sI6: regulation.us.fr2052a.datatables.supplemental.Informational.Product =
    (regulation.us.fr2052a.datatables.supplemental.Informational.SubsidiaryLiquidityNotTransferrable : regulation.us.fr2052a.datatables.supplemental.Informational.Product)

}