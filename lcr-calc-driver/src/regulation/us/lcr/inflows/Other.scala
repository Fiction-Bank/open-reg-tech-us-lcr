package regulation.us.lcr.inflows

/** Generated based on US.LCR.Inflows.Other
*/
object Other{

  def rule111X33E(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Other.iO6,
      regulation.us.fr2052a.datatables.inflows.Other.iO8
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class))))(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(e)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule112X33E(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Other.iO6,
      regulation.us.fr2052a.datatables.inflows.Other.iO8
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.equal(flow.treasuryControl)(false))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(3)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule33B(
    flow: regulation.us.fr2052a.datatables.inflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Other.iO7))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(b)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule33G(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Other.iO5)))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(g)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule33H(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Other.iO9)))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(h)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Other.Other]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((flow: regulation.us.fr2052a.datatables.inflows.Other.Other) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Other.rule33H(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Other.rule33G(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Other.rule112X33E(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Other.rule111X33E(fromDate)(flow))(regulation.us.lcr.inflows.Other.rule33B(flow)))))))(list)

}