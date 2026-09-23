package regulation.us.lcr

/** Generated based on US.LCR.AmountCalculations
*/
object AmountCalculations{

  def applyNote4(
    collateralClass: regulation.us.fr2052a.fields.CollateralClass.CollateralClass
  )(
    collateralValue: regulation.us.fr2052a.fields.CollateralValue.CollateralValue
  )(
    amount: morphir.sdk.Basics.Float
  ): morphir.sdk.Basics.Float =
    if (morphir.sdk.Basics.equal(collateralClass)(regulation.us.fr2052a.fields.CollateralClass.g2Q)) {
      morphir.sdk.Basics.subtract(amount)(morphir.sdk.Basics.multiply(collateralValue)(morphir.sdk.Basics.Float(0.85)))
    } else if (morphir.sdk.Basics.equal(collateralClass)(regulation.us.fr2052a.fields.CollateralClass.s1Q)) {
      morphir.sdk.Basics.subtract(amount)(collateralValue)
    } else {
      amount
    }
  
  def excludeUnsecuredWholesaleLending(
    amount: morphir.sdk.Basics.Float
  )(
    collateralValue: regulation.us.fr2052a.fields.CollateralValue.CollateralValue
  ): morphir.sdk.Basics.Float =
    morphir.sdk.Basics.min(amount)(collateralValue)
  
  def note4(
    maybeCollateralClass: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralClass.CollateralClass]
  )(
    maybeCollateralValue: morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.CollateralValue.CollateralValue]
  )(
    amount: morphir.sdk.Basics.Float
  ): morphir.sdk.Basics.Float =
    (maybeCollateralClass, maybeCollateralValue) match {
      case (morphir.sdk.Maybe.Just(collateralClass), morphir.sdk.Maybe.Just(collateralValue)) => 
        regulation.us.lcr.AmountCalculations.applyNote4(collateralClass)(collateralValue)(amount)
      case _ => 
        amount
    }
  
  def unsecuredWholesaleLending(
    amount: morphir.sdk.Basics.Float
  )(
    collateralValue: regulation.us.fr2052a.fields.CollateralValue.CollateralValue
  ): morphir.sdk.Basics.Float =
    if (morphir.sdk.Basics.greaterThan(amount)(collateralValue)) {
      morphir.sdk.Basics.subtract(amount)(collateralValue)
    } else {
      morphir.sdk.Basics.Float(0)
    }

}