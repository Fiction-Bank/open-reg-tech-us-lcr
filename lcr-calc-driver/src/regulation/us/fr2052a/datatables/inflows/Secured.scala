package regulation.us.fr2052a.datatables.inflows

/** Generated based on US.FR2052A.DataTables.Inflows.Secured
*/
object Secured{

  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object CollateralSwaps extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object DollarRolls extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object MarginLoans extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object OtherSecuredLoansNonRehypothecatable extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object OtherSecuredLoansRehypothecatable extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object OutstandingDrawsOnSecuredRevolvingFacilities extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object ReverseRepo extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object SecuritiesBorrowing extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object SyntheticCustomerLongs extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
    
    case object SyntheticFirmSourcing extends regulation.us.fr2052a.datatables.inflows.Secured.Product{}
  
  }
  
  val CollateralSwaps: regulation.us.fr2052a.datatables.inflows.Secured.Product.CollateralSwaps.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.CollateralSwaps
  
  val DollarRolls: regulation.us.fr2052a.datatables.inflows.Secured.Product.DollarRolls.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.DollarRolls
  
  val MarginLoans: regulation.us.fr2052a.datatables.inflows.Secured.Product.MarginLoans.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.MarginLoans
  
  val OtherSecuredLoansNonRehypothecatable: regulation.us.fr2052a.datatables.inflows.Secured.Product.OtherSecuredLoansNonRehypothecatable.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.OtherSecuredLoansNonRehypothecatable
  
  val OtherSecuredLoansRehypothecatable: regulation.us.fr2052a.datatables.inflows.Secured.Product.OtherSecuredLoansRehypothecatable.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.OtherSecuredLoansRehypothecatable
  
  val OutstandingDrawsOnSecuredRevolvingFacilities: regulation.us.fr2052a.datatables.inflows.Secured.Product.OutstandingDrawsOnSecuredRevolvingFacilities.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.OutstandingDrawsOnSecuredRevolvingFacilities
  
  val ReverseRepo: regulation.us.fr2052a.datatables.inflows.Secured.Product.ReverseRepo.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.ReverseRepo
  
  val SecuritiesBorrowing: regulation.us.fr2052a.datatables.inflows.Secured.Product.SecuritiesBorrowing.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.SecuritiesBorrowing
  
  val SyntheticCustomerLongs: regulation.us.fr2052a.datatables.inflows.Secured.Product.SyntheticCustomerLongs.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.SyntheticCustomerLongs
  
  val SyntheticFirmSourcing: regulation.us.fr2052a.datatables.inflows.Secured.Product.SyntheticFirmSourcing.type  = regulation.us.fr2052a.datatables.inflows.Secured.Product.SyntheticFirmSourcing
  
  final case class Secured(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.inflows.Secured.Product,
    subProduct: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct.SubProduct],
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    maturityOptionality: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityOptionality.MaturityOptionality],
    effectiveMaturityBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket],
    encumbranceType: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType],
    forwardStartAmount: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount],
    forwardStartBucket: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket],
    collateralClass: regulation.us.fr2052a.fields.CollateralClass.CollateralClass,
    collateralValue: regulation.us.fr2052a.fields.CollateralValue.CollateralValue,
    unencumbered: regulation.us.fr2052a.fields.Unencumbered.Unencumbered,
    treasuryControl: regulation.us.fr2052a.fields.TreasuryControl.TreasuryControl,
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty],
    riskWeight: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.RiskWeight.RiskWeight],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine,
    settlement: regulation.us.fr2052a.fields.Settlement.Settlement,
    counterparty: regulation.us.fr2052a.fields.Counterparty.Counterparty,
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB]
  ){}
  
  def iS1: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.ReverseRepo : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS10: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.SyntheticFirmSourcing : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS2: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.SecuritiesBorrowing : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS3: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.DollarRolls : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS4: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.CollateralSwaps : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS5: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.MarginLoans : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS6: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.OtherSecuredLoansRehypothecatable : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS7: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.OutstandingDrawsOnSecuredRevolvingFacilities : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS8: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.OtherSecuredLoansNonRehypothecatable : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def iS9: regulation.us.fr2052a.datatables.inflows.Secured.Product =
    (regulation.us.fr2052a.datatables.inflows.Secured.SyntheticCustomerLongs : regulation.us.fr2052a.datatables.inflows.Secured.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.ReverseRepo : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.SecuritiesBorrowing : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.DollarRolls : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.CollateralSwaps : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.MarginLoans : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.OtherSecuredLoansRehypothecatable : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.OutstandingDrawsOnSecuredRevolvingFacilities : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.OtherSecuredLoansNonRehypothecatable : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.SyntheticCustomerLongs : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.inflows.Secured.SyntheticFirmSourcing : regulation.us.fr2052a.datatables.inflows.Secured.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.inflows.Secured.Product])
    }

}