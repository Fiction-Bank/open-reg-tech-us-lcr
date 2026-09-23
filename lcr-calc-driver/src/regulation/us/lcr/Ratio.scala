package regulation.us.lcr

/** Generated based on US.LCR.Ratio
*/
object Ratio{

  final case class Ratio(
    arg1: morphir.sdk.Basics.Int,
    arg2: morphir.sdk.Basics.Int
  ){}
  
  def applyTo(
    value: morphir.sdk.Basics.Float
  ): regulation.us.lcr.Ratio.Ratio => morphir.sdk.Basics.Float =
    ({
      case regulation.us.lcr.Ratio.Ratio(numerator, denominator) => 
        morphir.sdk.Basics.divide(morphir.sdk.Basics.multiply(value)(morphir.sdk.Basics.toFloat(numerator)))(morphir.sdk.Basics.toFloat(denominator))
    } : regulation.us.lcr.Ratio.Ratio => morphir.sdk.Basics.Float)
  
  def percent(
    n: morphir.sdk.Basics.Int
  ): regulation.us.lcr.Ratio.Ratio =
    (regulation.us.lcr.Ratio.Ratio(
      n,
      morphir.sdk.Basics.Int(100)
    ) : regulation.us.lcr.Ratio.Ratio)
  
  def unit: regulation.us.lcr.Ratio.Ratio =
    (regulation.us.lcr.Ratio.Ratio(
      morphir.sdk.Basics.Int(1),
      morphir.sdk.Basics.Int(1)
    ) : regulation.us.lcr.Ratio.Ratio)

}