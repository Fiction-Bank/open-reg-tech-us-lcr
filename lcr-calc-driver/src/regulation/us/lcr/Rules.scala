package regulation.us.lcr

/** Generated based on US.LCR.Rules
*/
object Rules{

  final case class RuleBalance(
    rule: regulation.us.lcr.Rules.RuleName,
    amount: regulation.us.lcr.Basics.Balance
  ){}
  
  type RuleName = morphir.sdk.String.String
  
  type Weight = morphir.sdk.Basics.Float
  
  def findAll(
    rules: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleName]
  )(
    flows: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filter(((ruleBalance: regulation.us.lcr.Rules.RuleBalance) =>
      morphir.sdk.List.member(ruleBalance.rule)(rules)))(flows)
  
  def matchAndSum(
    rules: morphir.sdk.List.List[morphir.sdk.String.String]
  )(
    flows: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance]
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.List.sum(morphir.sdk.List.map(((x: regulation.us.lcr.Rules.RuleBalance) =>
      x.amount))(regulation.us.lcr.Rules.findAll(rules)(flows)))
  
  def orElse[B](
    check: morphir.sdk.Maybe.Maybe[B]
  )(
    fallback: morphir.sdk.Maybe.Maybe[B]
  ): morphir.sdk.Maybe.Maybe[B] =
    check match {
      case morphir.sdk.Maybe.Just(value) => 
        (morphir.sdk.Maybe.Just(value) : morphir.sdk.Maybe.Maybe[B])
      case morphir.sdk.Maybe.Nothing => 
        fallback
    }

}