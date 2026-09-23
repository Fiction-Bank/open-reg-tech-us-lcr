package regulation.us.lcr.inflows

/** Generated based on US.LCR.Inflows.Unsecured
*/
object Unsecured{

  def rule104Section33C(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU5,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU6
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(c)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule106Section33D1(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU1,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU2,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU4,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU5,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU6,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(d)(1)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule109Section33D2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU1,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU2,
      regulation.us.fr2052a.datatables.inflows.Unsecured.iU6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(d)(2)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((flow: regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Unsecured.rule109Section33D2(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Unsecured.rule106Section33D1(fromDate)(flow))(regulation.us.lcr.inflows.Unsecured.rule104Section33C(fromDate)(flow)))))(list)

}