package regulation.us.fr2052a.datatables.inflows

/** Generated based on US.FR2052A.DataTables.Inflows.Other
*/
object Other{

  final case class Other(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.inflows.Other.Product,
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    collateralValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralValue.CollateralValue],
    treasuryControl: regulation.us.fr2052a.fields.TreasuryControl.TreasuryControl,
    counterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Counterparty.Counterparty],
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CollateralCalledForReceipt extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object DerivativeReceivables extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object InterestAndDividendsReceivable extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object LockUpBalance extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object Net30DayDerivativeReceivables extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object OtherCashInflows extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object TBASales extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
    
    case object UndrawnCommittedFacilitiesPurchased extends regulation.us.fr2052a.datatables.inflows.Other.Product{}
  
  }
  
  val CollateralCalledForReceipt: regulation.us.fr2052a.datatables.inflows.Other.Product.CollateralCalledForReceipt.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.CollateralCalledForReceipt
  
  val DerivativeReceivables: regulation.us.fr2052a.datatables.inflows.Other.Product.DerivativeReceivables.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.DerivativeReceivables
  
  val InterestAndDividendsReceivable: regulation.us.fr2052a.datatables.inflows.Other.Product.InterestAndDividendsReceivable.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.InterestAndDividendsReceivable
  
  val LockUpBalance: regulation.us.fr2052a.datatables.inflows.Other.Product.LockUpBalance.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.LockUpBalance
  
  val Net30DayDerivativeReceivables: regulation.us.fr2052a.datatables.inflows.Other.Product.Net30DayDerivativeReceivables.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.Net30DayDerivativeReceivables
  
  val OtherCashInflows: regulation.us.fr2052a.datatables.inflows.Other.Product.OtherCashInflows.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.OtherCashInflows
  
  val PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities: regulation.us.fr2052a.datatables.inflows.Other.Product.PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities
  
  val TBASales: regulation.us.fr2052a.datatables.inflows.Other.Product.TBASales.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.TBASales
  
  val UndrawnCommittedFacilitiesPurchased: regulation.us.fr2052a.datatables.inflows.Other.Product.UndrawnCommittedFacilitiesPurchased.type  = regulation.us.fr2052a.datatables.inflows.Other.Product.UndrawnCommittedFacilitiesPurchased
  
  def iO1: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.DerivativeReceivables : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO2: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.CollateralCalledForReceipt : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO3: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.TBASales : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO4: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.UndrawnCommittedFacilitiesPurchased : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO5: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.LockUpBalance : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO6: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.InterestAndDividendsReceivable : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO7: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.Net30DayDerivativeReceivables : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO8: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def iO9: regulation.us.fr2052a.datatables.inflows.Other.Product =
    (regulation.us.fr2052a.datatables.inflows.Other.OtherCashInflows : regulation.us.fr2052a.datatables.inflows.Other.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.DerivativeReceivables : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.CollateralCalledForReceipt : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.TBASales : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.UndrawnCommittedFacilitiesPurchased : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.LockUpBalance : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.InterestAndDividendsReceivable : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.Net30DayDerivativeReceivables : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.PrincipalPaymentsReceivableOnUnencumberedInvestmentSecurities : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Other.OtherCashInflows : regulation.us.fr2052a.datatables.inflows.Other.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Other.Product])
    }

}