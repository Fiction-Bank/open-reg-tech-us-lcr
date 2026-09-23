package regulation.us.fr2052a.datatables.inflows

/** Generated based on US.FR2052A.DataTables.Inflows.Assets
*/
object Assets{

  final case class Assets(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.inflows.Assets.Product,
    subProduct: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct.SubProduct],
    marketValue: regulation.us.fr2052a.fields.MarketValue.MarketValue,
    lendableValue: regulation.us.fr2052a.fields.LendableValue.LendableValue,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    collateralClass: regulation.us.fr2052a.fields.CollateralClass.CollateralClass,
    treasuryControl: regulation.us.fr2052a.fields.TreasuryControl.TreasuryControl,
    accountingDesignation: regulation.us.fr2052a.fields.AccountingDesignation.AccountingDesignation,
    effectiveMaturityBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket],
    encumbranceType: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType],
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object Capacity extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object EncumberedAssets extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object ForwardAssetPurchases extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object RestrictedReserveBalances extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object UnencumberedAssets extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object UnrestrictedReserveBalances extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
    
    case object UnsettledAssetPurchases extends regulation.us.fr2052a.datatables.inflows.Assets.Product{}
  
  }
  
  val Capacity: regulation.us.fr2052a.datatables.inflows.Assets.Product.Capacity.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.Capacity
  
  val EncumberedAssets: regulation.us.fr2052a.datatables.inflows.Assets.Product.EncumberedAssets.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.EncumberedAssets
  
  val ForwardAssetPurchases: regulation.us.fr2052a.datatables.inflows.Assets.Product.ForwardAssetPurchases.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.ForwardAssetPurchases
  
  val RestrictedReserveBalances: regulation.us.fr2052a.datatables.inflows.Assets.Product.RestrictedReserveBalances.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.RestrictedReserveBalances
  
  val UnencumberedAssets: regulation.us.fr2052a.datatables.inflows.Assets.Product.UnencumberedAssets.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.UnencumberedAssets
  
  val UnrestrictedReserveBalances: regulation.us.fr2052a.datatables.inflows.Assets.Product.UnrestrictedReserveBalances.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.UnrestrictedReserveBalances
  
  val UnsettledAssetPurchases: regulation.us.fr2052a.datatables.inflows.Assets.Product.UnsettledAssetPurchases.type  = regulation.us.fr2052a.datatables.inflows.Assets.Product.UnsettledAssetPurchases
  
  def iA1: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.UnencumberedAssets : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA2: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.Capacity : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA3: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.UnrestrictedReserveBalances : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA4: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.RestrictedReserveBalances : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA5: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.UnsettledAssetPurchases : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA6: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.ForwardAssetPurchases : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def iA7: regulation.us.fr2052a.datatables.inflows.Assets.Product =
    (regulation.us.fr2052a.datatables.inflows.Assets.EncumberedAssets : regulation.us.fr2052a.datatables.inflows.Assets.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.UnencumberedAssets : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.Capacity : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.UnrestrictedReserveBalances : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.RestrictedReserveBalances : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.UnsettledAssetPurchases : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.ForwardAssetPurchases : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Assets.EncumberedAssets : regulation.us.fr2052a.datatables.inflows.Assets.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Assets.Product])
    }

}