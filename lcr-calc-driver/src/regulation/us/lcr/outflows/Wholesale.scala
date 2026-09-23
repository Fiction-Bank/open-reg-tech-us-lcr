package regulation.us.lcr.outflows

/** Generated based on US.LCR.Outflows.Wholesale
*/
object Wholesale{

  def rule17Section32A5(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Wholesale.oW18)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(a)(5)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule50Section32H1IiA(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW9,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW10,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW17,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW18
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(1)(ii)(A)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule54Section32H2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW9,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW10,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW17,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW18
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(2)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule56Section32H2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW8,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW11,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW12,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW13,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW14,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW15,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW16
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(2)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule61Section32H5(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Wholesale.oW19)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(5)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule66Section32J1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW1,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW2,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW3,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW4,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW5,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW6,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class)))(wholesale.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(i)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule69Section32J1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW1,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW2,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW3,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW4,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW5,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW6,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(wholesale.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(ii)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule75Section32J1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW1,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW2,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW3,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW4,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW5,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW6,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(wholesale.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(iv)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule80Section32J1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    wholesale: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(wholesale.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW1,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW2,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW3,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW4,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW5,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW6,
      regulation.us.fr2052a.datatables.outflows.Wholesale.oW7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(wholesale.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class))))(wholesale.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(wholesale.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(wholesale.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(vi)""",
        wholesale.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((flow: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule80Section32J1Vi(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule75Section32J1Iv(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule69Section32J1Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule66Section32J1I(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule61Section32H5(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule56Section32H2(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule54Section32H2(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Wholesale.rule50Section32H1IiA(fromDate)(flow))(regulation.us.lcr.outflows.Wholesale.rule17Section32A5(fromDate)(flow)))))))))))(list)

}