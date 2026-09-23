package regulation.us.fr2052a.fields

/** Generated based on US.FR2052A.Fields.SubProduct
*/
object SubProduct{

  type SubProduct = morphir.sdk.String.String
  
  def currencyAndCoin: morphir.sdk.String.String =
    """Currency and Coin"""
  
  def customerLong: morphir.sdk.String.String =
    """Customer long"""
  
  def firmLong: morphir.sdk.String.String =
    """firm long"""
  
  def isCurrencyAndCoin(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.currencyAndCoin)
  
  def isCustomerLong(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.customerLong)
  
  def isFirmLong(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.firmLong)
  
  def isHQLA(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct))(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct))(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))
  
  def isHQLALevel1(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.level1)
  
  def isHQLALevel2A(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.level2A)
  
  def isHQLALevel2B(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.level2B)
  
  def isNoCollateralPledged(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.noCollateralPledged)
  
  def isNonHQLA(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.nonHQLA)
  
  def isRehypothecateableCollateralUnencumbered(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.rehypothecateableCollateralUnencumbered)
  
  def isSpecificCentralBank(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.specificCentralBank)
  
  def isSubProduct(
    subProduct: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.SubProduct.SubProduct]
  )(
    filter: regulation.us.fr2052a.fields.SubProduct.SubProduct => morphir.sdk.Basics.Bool
  ): morphir.sdk.Basics.Bool =
    subProduct match {
      case morphir.sdk.Maybe.Just(sp) => 
        filter(sp)
      case morphir.sdk.Maybe.Nothing => 
        false
    }
  
  def isUnsettledForward(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.unsettledForward)
  
  def isUnsettledRegularWay(
    subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(subProduct)(regulation.us.fr2052a.fields.SubProduct.unsettledRegularWay)
  
  def level1: morphir.sdk.String.String =
    """Level 1"""
  
  def level2A: morphir.sdk.String.String =
    """Level 2a"""
  
  def level2B: morphir.sdk.String.String =
    """Level 2b"""
  
  def noCollateralPledged: morphir.sdk.String.String =
    """No Collateral Pledged"""
  
  def nonHQLA: morphir.sdk.String.String =
    """Non-HQLA"""
  
  def rehypothecateableCollateralUnencumbered: morphir.sdk.String.String =
    """Rehypothecateable Collateral Unencumbered"""
  
  def specificCentralBank: morphir.sdk.String.String =
    """Specific central bank"""
  
  def unsettledForward: morphir.sdk.String.String =
    """Unsettled (Forward)"""
  
  def unsettledRegularWay: morphir.sdk.String.String =
    """Unsettled (Regular Way)"""

}