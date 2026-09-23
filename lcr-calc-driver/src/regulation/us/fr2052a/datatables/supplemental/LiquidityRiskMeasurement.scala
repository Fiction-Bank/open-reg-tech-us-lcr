package regulation.us.fr2052a.datatables.supplemental

/** Generated based on US.FR2052A.DataTables.Supplemental.LiquidityRiskMeasurement
*/
object LiquidityRiskMeasurement{

  final case class LiquidityRiskMeasurement(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product,
    marketValue: regulation.us.fr2052a.fields.MarketValue.MarketValue,
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty]
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object LiquidityCoverageRatio extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object NetStableFundingRatio extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object SubsidiaryFundingAvailableForTransfer extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object SubsidiaryFundingThatCannotBeTransferred extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object SubsidiaryLiquidityAvailableForTransfer extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object SubsidiaryLiquidityThatCannotBeTransferred extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
    
    case object UnencumberedAssetHedgesEarlyTerminationOutflows extends regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product{}
  
  }
  
  val AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets
  
  val LiquidityCoverageRatio: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.LiquidityCoverageRatio.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.LiquidityCoverageRatio
  
  val NetStableFundingRatio: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.NetStableFundingRatio.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.NetStableFundingRatio
  
  val NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker
  
  val StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker
  
  val SubsidiaryFundingAvailableForTransfer: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryFundingAvailableForTransfer.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryFundingAvailableForTransfer
  
  val SubsidiaryFundingThatCannotBeTransferred: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryFundingThatCannotBeTransferred.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryFundingThatCannotBeTransferred
  
  val SubsidiaryLiquidityAvailableForTransfer: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryLiquidityAvailableForTransfer.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryLiquidityAvailableForTransfer
  
  val SubsidiaryLiquidityThatCannotBeTransferred: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryLiquidityThatCannotBeTransferred.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.SubsidiaryLiquidityThatCannotBeTransferred
  
  val UnencumberedAssetHedgesEarlyTerminationOutflows: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.UnencumberedAssetHedgesEarlyTerminationOutflows.type  = regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product.UnencumberedAssetHedgesEarlyTerminationOutflows
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryLiquidityThatCannotBeTransferred : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryLiquidityAvailableForTransfer : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.UnencumberedAssetHedgesEarlyTerminationOutflows : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityCoverageRatio : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryFundingThatCannotBeTransferred : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryFundingAvailableForTransfer : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.NetStableFundingRatio : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product])
    }
  
  def sL1: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryLiquidityThatCannotBeTransferred : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL10: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.NetStableFundingRatio : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL2: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryLiquidityAvailableForTransfer : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL3: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.UnencumberedAssetHedgesEarlyTerminationOutflows : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL4: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.NonStructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL5: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.StructuredDebtMaturingInGreaterThan30DaysPrimaryMarketMaker : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL6: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityCoverageRatio : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL7: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryFundingThatCannotBeTransferred : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL8: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.SubsidiaryFundingAvailableForTransfer : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)
  
  def sL9: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product =
    (regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.AdditionalFundingRequirementForOffBalanceSheetRehypothecatedAssets : regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.Product)

}