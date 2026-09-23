package regulation.us.lcr

/** Generated based on US.LCR.Weights
*/
object Weights{

  type Weight = regulation.us.lcr.Ratio.Ratio
  
  def sectionWeight(
    rule: regulation.us.lcr.Rule.Rule
  ): regulation.us.lcr.Weights.Weight =
    if (morphir.sdk.List.member(rule)(regulation.us.lcr.Rule.eligibleLevel1LiquidAssets)) {
      regulation.us.lcr.Ratio.percent(morphir.sdk.Basics.Int(100))
    } else if (morphir.sdk.List.member(rule)(regulation.us.lcr.Rule.eligibleLevel2ALiquidAssets)) {
      regulation.us.lcr.Ratio.percent(morphir.sdk.Basics.Int(85))
    } else if (morphir.sdk.List.member(rule)(regulation.us.lcr.Rule.eligibleLevel2BLiquidAssets)) {
      regulation.us.lcr.Ratio.percent(morphir.sdk.Basics.Int(50))
    } else {
      regulation.us.lcr.Ratio.unit
    }

}