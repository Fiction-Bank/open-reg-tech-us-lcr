package regulation.us.fr2052a.datatables.outflows

/** Generated based on US.FR2052A.DataTables.Outflows.Secured
*/
object Secured{

  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CollateralSwaps extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object CustomerShorts extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object DollarRolls extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object ExceptionalCentralBankOperations extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object FHLBAdvances extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object FirmShorts extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object OtherSecuredFinancingTransactions extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object Repo extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object SecuritiesLending extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object SyntheticCustomerShorts extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
    
    case object SyntheticFirmFinancing extends regulation.us.fr2052a.datatables.outflows.Secured.Product{}
  
  }
  
  val CollateralSwaps: regulation.us.fr2052a.datatables.outflows.Secured.Product.CollateralSwaps.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.CollateralSwaps
  
  val CustomerShorts: regulation.us.fr2052a.datatables.outflows.Secured.Product.CustomerShorts.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.CustomerShorts
  
  val DollarRolls: regulation.us.fr2052a.datatables.outflows.Secured.Product.DollarRolls.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.DollarRolls
  
  val ExceptionalCentralBankOperations: regulation.us.fr2052a.datatables.outflows.Secured.Product.ExceptionalCentralBankOperations.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.ExceptionalCentralBankOperations
  
  val FHLBAdvances: regulation.us.fr2052a.datatables.outflows.Secured.Product.FHLBAdvances.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.FHLBAdvances
  
  val FirmShorts: regulation.us.fr2052a.datatables.outflows.Secured.Product.FirmShorts.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.FirmShorts
  
  val OtherSecuredFinancingTransactions: regulation.us.fr2052a.datatables.outflows.Secured.Product.OtherSecuredFinancingTransactions.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.OtherSecuredFinancingTransactions
  
  val Repo: regulation.us.fr2052a.datatables.outflows.Secured.Product.Repo.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.Repo
  
  val SecuritiesLending: regulation.us.fr2052a.datatables.outflows.Secured.Product.SecuritiesLending.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.SecuritiesLending
  
  val SyntheticCustomerShorts: regulation.us.fr2052a.datatables.outflows.Secured.Product.SyntheticCustomerShorts.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.SyntheticCustomerShorts
  
  val SyntheticFirmFinancing: regulation.us.fr2052a.datatables.outflows.Secured.Product.SyntheticFirmFinancing.type  = regulation.us.fr2052a.datatables.outflows.Secured.Product.SyntheticFirmFinancing
  
  final case class Secured(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.outflows.Secured.Product,
    subProduct: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct.SubProduct],
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    maturityOptionality: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityOptionality.MaturityOptionality],
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    collateralClass: regulation.us.fr2052a.fields.CollateralClass.CollateralClass,
    collateralValue: regulation.us.fr2052a.fields.CollateralValue.CollateralValue,
    treasuryControl: regulation.us.fr2052a.fields.TreasuryControl.TreasuryControl,
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine,
    settlement: regulation.us.fr2052a.fields.Settlement.Settlement,
    rehypothecated: regulation.us.fr2052a.fields.Rehypothecated.Rehypothecated,
    counterparty: regulation.us.fr2052a.fields.Counterparty.Counterparty,
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB]
  ){}
  
  def oS1: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.Repo : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS10: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.SyntheticFirmFinancing : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS11: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.OtherSecuredFinancingTransactions : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS2: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.SecuritiesLending : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS3: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.DollarRolls : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS4: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.CollateralSwaps : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS5: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.FHLBAdvances : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS6: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.ExceptionalCentralBankOperations : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS7: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.CustomerShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS8: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.FirmShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def oS9: regulation.us.fr2052a.datatables.outflows.Secured.Product =
    (regulation.us.fr2052a.datatables.outflows.Secured.SyntheticCustomerShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.Repo : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.SecuritiesLending : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.DollarRolls : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.CollateralSwaps : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.FHLBAdvances : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.ExceptionalCentralBankOperations : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.CustomerShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.FirmShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.SyntheticCustomerShorts : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.SyntheticFirmFinancing : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case 11 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Secured.OtherSecuredFinancingTransactions : regulation.us.fr2052a.datatables.outflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Secured.Product])
    }

}