package regulation.us.lcr

/** Generated based on US.LCR.SubProduct
*/
object SubProduct{

  sealed trait SubProduct {
  
    
  
  }
  
  object SubProduct{
  
    case object CurrencyAndCoin extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object FHLBSystem extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object Level1HQLA extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object Level2AHQLA extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object Level2BHQLA extends regulation.us.lcr.SubProduct.SubProduct{}
    
    final case class MajorCentralBank(
      arg1: regulation.us.lcr.MajorCentralBank.MajorCentralBank
    ) extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object OtherCentralBank extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object OtherGovernmentSponsoredEntity extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object RehypothecatableUnencumbered extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object UnsettledForward extends regulation.us.lcr.SubProduct.SubProduct{}
    
    case object UnsettledRegularWay extends regulation.us.lcr.SubProduct.SubProduct{}
  
  }
  
  val CurrencyAndCoin: regulation.us.lcr.SubProduct.SubProduct.CurrencyAndCoin.type  = regulation.us.lcr.SubProduct.SubProduct.CurrencyAndCoin
  
  val FHLBSystem: regulation.us.lcr.SubProduct.SubProduct.FHLBSystem.type  = regulation.us.lcr.SubProduct.SubProduct.FHLBSystem
  
  val Level1HQLA: regulation.us.lcr.SubProduct.SubProduct.Level1HQLA.type  = regulation.us.lcr.SubProduct.SubProduct.Level1HQLA
  
  val Level2AHQLA: regulation.us.lcr.SubProduct.SubProduct.Level2AHQLA.type  = regulation.us.lcr.SubProduct.SubProduct.Level2AHQLA
  
  val Level2BHQLA: regulation.us.lcr.SubProduct.SubProduct.Level2BHQLA.type  = regulation.us.lcr.SubProduct.SubProduct.Level2BHQLA
  
  val MajorCentralBank: regulation.us.lcr.SubProduct.SubProduct.MajorCentralBank.type  = regulation.us.lcr.SubProduct.SubProduct.MajorCentralBank
  
  val OtherCentralBank: regulation.us.lcr.SubProduct.SubProduct.OtherCentralBank.type  = regulation.us.lcr.SubProduct.SubProduct.OtherCentralBank
  
  val OtherGovernmentSponsoredEntity: regulation.us.lcr.SubProduct.SubProduct.OtherGovernmentSponsoredEntity.type  = regulation.us.lcr.SubProduct.SubProduct.OtherGovernmentSponsoredEntity
  
  val RehypothecatableUnencumbered: regulation.us.lcr.SubProduct.SubProduct.RehypothecatableUnencumbered.type  = regulation.us.lcr.SubProduct.SubProduct.RehypothecatableUnencumbered
  
  val UnsettledForward: regulation.us.lcr.SubProduct.SubProduct.UnsettledForward.type  = regulation.us.lcr.SubProduct.SubProduct.UnsettledForward
  
  val UnsettledRegularWay: regulation.us.lcr.SubProduct.SubProduct.UnsettledRegularWay.type  = regulation.us.lcr.SubProduct.SubProduct.UnsettledRegularWay

}