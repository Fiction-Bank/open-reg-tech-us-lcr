package regulation.us.fr2052a.datatables.supplemental

/** Generated based on US.FR2052A.DataTables.Supplemental.DerivativesCollateral
*/
object DerivativesCollateral{

  final case class DerivativesCollateral(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product,
    subProduct: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct.SubProduct],
    subProduct2: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct2.SubProduct2],
    marketValue: regulation.us.fr2052a.fields.MarketValue.MarketValue,
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    collateralLevel: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralLevel.CollateralLevel],
    counterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Counterparty.Counterparty],
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    effectiveMaturityBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket],
    encumbranceType: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType],
    nettingEligible: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.NettingEligible.NettingEligible],
    treasuryControl: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.TreasuryControl.TreasuryControl],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CollateralDisputesDeliverables extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object CollateralDisputesReceivables extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object DerivativeCCPDefaultFundContribution extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object DerivativeCollateralSubstitutionCapacity extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object DerivativeCollateralSubstitutionRisk extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object DerivativeSettlementPaymentsDelivered extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object DerivativeSettlementPaymentsReceived extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object GrossDerivativeAssetValues extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object GrossDerivativeLiabilityValues extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object InitialMarginPostedCustomer extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object InitialMarginPostedHouse extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object InitialMarginReceived extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object OtherCCPPledgesAndContributions extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object OtherCollateralSubstitutionCapacity extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object OtherCollateralSubstitutionRisk extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object RequiredCollateralDeliverables extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object SleeperCollateralDeliverables extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object SleeperCollateralReceivables extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object VariationMarginPostedCustomer extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object VariationMarginPostedHouse extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
    
    case object VariationMarginReceived extends regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product{}
  
  }
  
  val CollateralDisputesDeliverables: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.CollateralDisputesDeliverables.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.CollateralDisputesDeliverables
  
  val CollateralDisputesReceivables: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.CollateralDisputesReceivables.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.CollateralDisputesReceivables
  
  val DerivativeCCPDefaultFundContribution: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCCPDefaultFundContribution.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCCPDefaultFundContribution
  
  val DerivativeCollateralSubstitutionCapacity: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCollateralSubstitutionCapacity.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCollateralSubstitutionCapacity
  
  val DerivativeCollateralSubstitutionRisk: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCollateralSubstitutionRisk.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeCollateralSubstitutionRisk
  
  val DerivativeSettlementPaymentsDelivered: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeSettlementPaymentsDelivered.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeSettlementPaymentsDelivered
  
  val DerivativeSettlementPaymentsReceived: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeSettlementPaymentsReceived.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.DerivativeSettlementPaymentsReceived
  
  val GrossDerivativeAssetValues: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.GrossDerivativeAssetValues.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.GrossDerivativeAssetValues
  
  val GrossDerivativeLiabilityValues: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.GrossDerivativeLiabilityValues.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.GrossDerivativeLiabilityValues
  
  val InitialMarginPostedCustomer: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginPostedCustomer.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginPostedCustomer
  
  val InitialMarginPostedHouse: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginPostedHouse.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginPostedHouse
  
  val InitialMarginReceived: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginReceived.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.InitialMarginReceived
  
  val OtherCCPPledgesAndContributions: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCCPPledgesAndContributions.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCCPPledgesAndContributions
  
  val OtherCollateralSubstitutionCapacity: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCollateralSubstitutionCapacity.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCollateralSubstitutionCapacity
  
  val OtherCollateralSubstitutionRisk: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCollateralSubstitutionRisk.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.OtherCollateralSubstitutionRisk
  
  val RequiredCollateralDeliverables: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.RequiredCollateralDeliverables.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.RequiredCollateralDeliverables
  
  val SleeperCollateralDeliverables: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.SleeperCollateralDeliverables.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.SleeperCollateralDeliverables
  
  val SleeperCollateralReceivables: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.SleeperCollateralReceivables.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.SleeperCollateralReceivables
  
  val VariationMarginPostedCustomer: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginPostedCustomer.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginPostedCustomer
  
  val VariationMarginPostedHouse: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginPostedHouse.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginPostedHouse
  
  val VariationMarginReceived: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginReceived.type  = regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product.VariationMarginReceived
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.GrossDerivativeAssetValues : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.GrossDerivativeLiabilityValues : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeSettlementPaymentsDelivered : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeSettlementPaymentsReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginPostedHouse : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginPostedCustomer : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginPostedHouse : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginPostedCustomer : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 11 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCCPDefaultFundContribution : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 12 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCCPPledgesAndContributions : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 13 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.CollateralDisputesDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 14 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.CollateralDisputesReceivables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 15 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.SleeperCollateralDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 16 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.RequiredCollateralDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 17 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.SleeperCollateralReceivables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 18 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCollateralSubstitutionRisk : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 19 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCollateralSubstitutionCapacity : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 20 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCollateralSubstitutionRisk : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case 21 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCollateralSubstitutionCapacity : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product])
    }
  
  def sDC1: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.GrossDerivativeAssetValues : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC10: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC11: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCCPDefaultFundContribution : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC12: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCCPPledgesAndContributions : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC13: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.CollateralDisputesDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC14: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.CollateralDisputesReceivables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC15: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.SleeperCollateralDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC16: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.RequiredCollateralDeliverables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC17: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.SleeperCollateralReceivables : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC18: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCollateralSubstitutionRisk : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC19: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeCollateralSubstitutionCapacity : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC2: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.GrossDerivativeLiabilityValues : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC20: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCollateralSubstitutionRisk : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC21: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.OtherCollateralSubstitutionCapacity : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC3: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeSettlementPaymentsDelivered : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC4: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativeSettlementPaymentsReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC5: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginPostedHouse : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC6: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginPostedCustomer : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC7: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.InitialMarginReceived : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC8: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginPostedHouse : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)
  
  def sDC9: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product =
    (regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.VariationMarginPostedCustomer : regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.Product)

}