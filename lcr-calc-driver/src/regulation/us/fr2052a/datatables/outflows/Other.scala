package regulation.us.fr2052a.datatables.outflows

/** Generated based on US.FR2052A.DataTables.Outflows.Other
*/
object Other{

  final case class Other(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.outflows.Other.Product,
    counterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Counterparty.Counterparty],
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    collateralValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralValue.CollateralValue],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CollateralCalledForDelivery extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object CreditFacilities extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object DerivativePayables extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object ExcessMargin extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object InterestDividendsPayable extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object LiquidityFacilities extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object LossOfRehypothecationRightsDueToA1NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object LossOfRehypothecationRightsDueToA2NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object LossOfRehypothecationRightsDueToA3NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object LossOfRehypothecationRightsDueToAChangeInFinancialCondition extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object MTMImpactOnDerivativePositions extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object Net30DayDerivativePayables extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object OtherCashOutflows extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object OtherOutflowsRelatedToStructuredTransactions extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object RetailMortgageCommitments extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TBAPurchases extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TotalCollateralRequiredDueToA1NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TotalCollateralRequiredDueToA2NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TotalCollateralRequiredDueToA3NotchDowngrade extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TotalCollateralRequiredDueToAChangeInFinancialCondition extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object TradeFinanceInstruments extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
    
    case object UnfundedTermMargin extends regulation.us.fr2052a.datatables.outflows.Other.Product{}
  
  }
  
  val CollateralCalledForDelivery: regulation.us.fr2052a.datatables.outflows.Other.Product.CollateralCalledForDelivery.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.CollateralCalledForDelivery
  
  val CreditFacilities: regulation.us.fr2052a.datatables.outflows.Other.Product.CreditFacilities.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.CreditFacilities
  
  val DerivativePayables: regulation.us.fr2052a.datatables.outflows.Other.Product.DerivativePayables.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.DerivativePayables
  
  val ExcessMargin: regulation.us.fr2052a.datatables.outflows.Other.Product.ExcessMargin.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.ExcessMargin
  
  val InterestDividendsPayable: regulation.us.fr2052a.datatables.outflows.Other.Product.InterestDividendsPayable.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.InterestDividendsPayable
  
  val LiquidityFacilities: regulation.us.fr2052a.datatables.outflows.Other.Product.LiquidityFacilities.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.LiquidityFacilities
  
  val LossOfRehypothecationRightsDueToA1NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA1NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA1NotchDowngrade
  
  val LossOfRehypothecationRightsDueToA2NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA2NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA2NotchDowngrade
  
  val LossOfRehypothecationRightsDueToA3NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA3NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToA3NotchDowngrade
  
  val LossOfRehypothecationRightsDueToAChangeInFinancialCondition: regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToAChangeInFinancialCondition.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.LossOfRehypothecationRightsDueToAChangeInFinancialCondition
  
  val MTMImpactOnDerivativePositions: regulation.us.fr2052a.datatables.outflows.Other.Product.MTMImpactOnDerivativePositions.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.MTMImpactOnDerivativePositions
  
  val Net30DayDerivativePayables: regulation.us.fr2052a.datatables.outflows.Other.Product.Net30DayDerivativePayables.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.Net30DayDerivativePayables
  
  val OtherCashOutflows: regulation.us.fr2052a.datatables.outflows.Other.Product.OtherCashOutflows.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.OtherCashOutflows
  
  val OtherOutflowsRelatedToStructuredTransactions: regulation.us.fr2052a.datatables.outflows.Other.Product.OtherOutflowsRelatedToStructuredTransactions.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.OtherOutflowsRelatedToStructuredTransactions
  
  val RetailMortgageCommitments: regulation.us.fr2052a.datatables.outflows.Other.Product.RetailMortgageCommitments.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.RetailMortgageCommitments
  
  val TBAPurchases: regulation.us.fr2052a.datatables.outflows.Other.Product.TBAPurchases.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TBAPurchases
  
  val TotalCollateralRequiredDueToA1NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA1NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA1NotchDowngrade
  
  val TotalCollateralRequiredDueToA2NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA2NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA2NotchDowngrade
  
  val TotalCollateralRequiredDueToA3NotchDowngrade: regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA3NotchDowngrade.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToA3NotchDowngrade
  
  val TotalCollateralRequiredDueToAChangeInFinancialCondition: regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToAChangeInFinancialCondition.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TotalCollateralRequiredDueToAChangeInFinancialCondition
  
  val TradeFinanceInstruments: regulation.us.fr2052a.datatables.outflows.Other.Product.TradeFinanceInstruments.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.TradeFinanceInstruments
  
  val UnfundedTermMargin: regulation.us.fr2052a.datatables.outflows.Other.Product.UnfundedTermMargin.type  = regulation.us.fr2052a.datatables.outflows.Other.Product.UnfundedTermMargin
  
  def oO1: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.DerivativePayables : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO10: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA2NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO11: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA3NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO12: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToAChangeInFinancialCondition : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO13: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA1NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO14: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA2NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO15: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA3NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO16: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToAChangeInFinancialCondition : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO17: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.ExcessMargin : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO18: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.UnfundedTermMargin : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO19: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.InterestDividendsPayable : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO2: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.CollateralCalledForDelivery : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO20: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.Net30DayDerivativePayables : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO21: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.OtherOutflowsRelatedToStructuredTransactions : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO22: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.OtherCashOutflows : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO3: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TBAPurchases : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO4: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.CreditFacilities : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO5: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.LiquidityFacilities : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO6: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.RetailMortgageCommitments : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO7: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.TradeFinanceInstruments : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO8: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.MTMImpactOnDerivativePositions : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def oO9: regulation.us.fr2052a.datatables.outflows.Other.Product =
    (regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA1NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.DerivativePayables : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.CollateralCalledForDelivery : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TBAPurchases : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.CreditFacilities : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.LiquidityFacilities : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.RetailMortgageCommitments : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TradeFinanceInstruments : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.MTMImpactOnDerivativePositions : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA1NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA2NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 11 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToA3NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 12 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.LossOfRehypothecationRightsDueToAChangeInFinancialCondition : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 13 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA1NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 14 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA2NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 15 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToA3NotchDowngrade : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 16 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.TotalCollateralRequiredDueToAChangeInFinancialCondition : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 17 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.ExcessMargin : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 18 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.UnfundedTermMargin : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 19 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.InterestDividendsPayable : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 20 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.Net30DayDerivativePayables : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 21 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.OtherOutflowsRelatedToStructuredTransactions : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case 22 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Other.OtherCashOutflows : regulation.us.fr2052a.datatables.outflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Other.Product])
    }

}