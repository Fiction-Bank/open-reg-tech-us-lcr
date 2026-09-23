package regulation.us.fr2052a.datatables.outflows

/** Generated based on US.FR2052A.DataTables.Outflows.Deposits
*/
object Deposits{

  final case class Deposits(
    currency: regulation.us.fr2052a.fields.Currency.Currency,
    converted: regulation.us.fr2052a.fields.Converted.Converted,
    reportingEntity: regulation.us.fr2052a.fields.ReportingEntity.ReportingEntity,
    product: regulation.us.fr2052a.datatables.outflows.Deposits.Product,
    counterparty: regulation.us.fr2052a.fields.Counterparty.Counterparty,
    gSIB: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.GSIB.GSIB],
    maturityAmount: regulation.us.fr2052a.fields.MaturityAmount.MaturityAmount,
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket,
    maturityOptionality: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityOptionality.MaturityOptionality],
    collateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass],
    collateralValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralValue.CollateralValue],
    insured: regulation.us.fr2052a.fields.Insured.Insured,
    trigger: regulation.us.fr2052a.fields.Trigger.Trigger,
    rehypothecated: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.Rehypothecated.Rehypothecated],
    businessLine: regulation.us.fr2052a.fields.BusinessLine.BusinessLine,
    internal: regulation.us.fr2052a.fields.Internal.Internal,
    internalCounterparty: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.InternalCounterparty.InternalCounterparty]
  ){}
  
  sealed trait Product {
  
    
  
  }
  
  object Product{
  
    case object ExcessBalancesInOperationalAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object LessStableAffiliatedSweepAccountBalances extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object NonAffiliatedSweepAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object NonOperationalAccountBalances extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object NonReciprocalBrokeredAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object NonTransactionalNonRelationshipAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object NonTransactionalRelationshipAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object OperationalAccountBalances extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object OperationalEscrowAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object OtherAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object OtherProductSweepAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object OtherThirdPartyDeposits extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object ReciprocalAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object StableAffiliatedSweepAccountBalances extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
    
    case object TransactionalAccounts extends regulation.us.fr2052a.datatables.outflows.Deposits.Product{}
  
  }
  
  val ExcessBalancesInOperationalAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.ExcessBalancesInOperationalAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.ExcessBalancesInOperationalAccounts
  
  val LessStableAffiliatedSweepAccountBalances: regulation.us.fr2052a.datatables.outflows.Deposits.Product.LessStableAffiliatedSweepAccountBalances.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.LessStableAffiliatedSweepAccountBalances
  
  val NonAffiliatedSweepAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonAffiliatedSweepAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonAffiliatedSweepAccounts
  
  val NonOperationalAccountBalances: regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonOperationalAccountBalances.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonOperationalAccountBalances
  
  val NonReciprocalBrokeredAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonReciprocalBrokeredAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonReciprocalBrokeredAccounts
  
  val NonTransactionalNonRelationshipAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonTransactionalNonRelationshipAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonTransactionalNonRelationshipAccounts
  
  val NonTransactionalRelationshipAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonTransactionalRelationshipAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.NonTransactionalRelationshipAccounts
  
  val OperationalAccountBalances: regulation.us.fr2052a.datatables.outflows.Deposits.Product.OperationalAccountBalances.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.OperationalAccountBalances
  
  val OperationalEscrowAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.OperationalEscrowAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.OperationalEscrowAccounts
  
  val OtherAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherAccounts
  
  val OtherProductSweepAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherProductSweepAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherProductSweepAccounts
  
  val OtherThirdPartyDeposits: regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherThirdPartyDeposits.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.OtherThirdPartyDeposits
  
  val ReciprocalAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.ReciprocalAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.ReciprocalAccounts
  
  val StableAffiliatedSweepAccountBalances: regulation.us.fr2052a.datatables.outflows.Deposits.Product.StableAffiliatedSweepAccountBalances.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.StableAffiliatedSweepAccountBalances
  
  val TransactionalAccounts: regulation.us.fr2052a.datatables.outflows.Deposits.Product.TransactionalAccounts.type  = regulation.us.fr2052a.datatables.outflows.Deposits.Product.TransactionalAccounts
  
  def oD1: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.TransactionalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD10: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.LessStableAffiliatedSweepAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD11: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.NonAffiliatedSweepAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD12: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.OtherProductSweepAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD13: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.ReciprocalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD14: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.OtherThirdPartyDeposits : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD15: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.OtherAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD2: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.NonTransactionalRelationshipAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD3: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.NonTransactionalNonRelationshipAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD4: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.OperationalAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD5: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.ExcessBalancesInOperationalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD6: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.NonOperationalAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD7: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.OperationalEscrowAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD8: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.NonReciprocalBrokeredAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def oD9: regulation.us.fr2052a.datatables.outflows.Deposits.Product =
    (regulation.us.fr2052a.datatables.outflows.Deposits.StableAffiliatedSweepAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)
  
  def productFromID(
    id: morphir.sdk.Basics.Int
  ): morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product] =
    id match {
      case 1 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.TransactionalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 2 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.NonTransactionalRelationshipAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 3 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.NonTransactionalNonRelationshipAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 4 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.OperationalAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 5 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.ExcessBalancesInOperationalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 6 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.NonOperationalAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 7 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.OperationalEscrowAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 8 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.NonReciprocalBrokeredAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 9 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.StableAffiliatedSweepAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 10 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.LessStableAffiliatedSweepAccountBalances : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 11 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.NonAffiliatedSweepAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 12 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.OtherProductSweepAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 13 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.ReciprocalAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 14 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.OtherThirdPartyDeposits : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case 15 => 
        (morphir.sdk.Maybe.Just((regulation.us.fr2052a.datatables.outflows.Deposits.OtherAccounts : regulation.us.fr2052a.datatables.outflows.Deposits.Product)) : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
      case _ => 
        (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.datatables.outflows.Deposits.Product])
    }

}