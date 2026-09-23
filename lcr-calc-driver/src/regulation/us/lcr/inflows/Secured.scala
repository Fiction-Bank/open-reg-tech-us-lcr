package regulation.us.lcr.inflows

/** Generated based on US.LCR.Inflows.Secured
*/
object Secured{

  def rule105Section33C(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(c)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule108Section33D1(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isOther(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(d)(1)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule110Section33D2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isOther(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(d)(2)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule113Section33F1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.equal(flow.unencumbered)(false))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(i)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule114Section33F1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(ii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule115Section33F1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(false))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(ii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule116Section33F1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.equal(flow.treasuryControl)(false)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(ii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule117Section33F1Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(iii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule118Section33F1Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(iii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule119Section33F1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(iv)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule120Section33F1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(iv)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule121Section33F1V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(v)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule122Section33F1V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(v)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule123Section33F1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6,
      regulation.us.fr2052a.datatables.inflows.Secured.iS7,
      regulation.us.fr2052a.datatables.inflows.Secured.iS8
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(vi)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule124Section33F1Vii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS5)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(1)(vii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule125Section33F2I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(i)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule126Section33F2Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(ii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule127Section33F2Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(iii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule128Section33F2Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(iv)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule129Section33F2V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.or(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(regulation.us.fr2052a.fields.CollateralClass.isOther(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(v)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule130Section33F2Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(vi)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule131Section33F2Vii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(vii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule132Section33F2Viii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.or(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(regulation.us.fr2052a.fields.CollateralClass.isOther(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(viii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule133Section33F2Ix(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(ix)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule134Section33F2X(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.or(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass)))(regulation.us.fr2052a.fields.CollateralClass.isOther(flow.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """33(f)(2)(x)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule2Section20A1(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS4,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isCash(flow.collateralClass))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(a)(1)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule2Section20B1(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS4,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(b)(1)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule2Section20C1(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS4,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EffectiveMaturityBucket.EffectiveMaturityBucket])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(c)(1)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule7Section21ATodo(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Secured.iS1,
      regulation.us.fr2052a.datatables.inflows.Secured.iS2,
      regulation.us.fr2052a.datatables.inflows.Secured.iS3,
      regulation.us.fr2052a.datatables.inflows.Secured.iS4,
      regulation.us.fr2052a.datatables.inflows.Secured.iS5,
      regulation.us.fr2052a.datatables.inflows.Secured.iS6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.notEqual(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket]))))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(b)(todo)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule85Section32J3I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(i)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule86Section32J3Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(ii)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule87Section32J3Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(iii)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule88Section32J3Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isNonHQLA(subProduct))(regulation.us.fr2052a.fields.SubProduct.isNoCollateralPledged(subProduct))))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(iv)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule89Section32J3V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLA(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(v)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule9Section21CTodo(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLA(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLA(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(flow.unencumbered)(true))(morphir.sdk.Basics.notEqual(flow.effectiveMaturityBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket]))))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(c)(todo)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule90Section32J3Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(vi)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule91Section32J3Vii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isNonHQLA(subProduct))(regulation.us.fr2052a.fields.SubProduct.isNoCollateralPledged(subProduct))))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(vii)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule92Section32J3Viii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLA(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(viii)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule93Section32J3Ix(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isNonHQLA(subProduct))(regulation.us.fr2052a.fields.SubProduct.isNoCollateralPledged(subProduct))))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        true
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(bucket))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket)))
    })(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(ix)""",
        flow.collateralValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule94Section32J3X(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel1(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(x)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule95Section32J3Xi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(xi)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule96Section32J3Xii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(xii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule97Section32J3Xiii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS4)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isNonHQLA(subProduct))(regulation.us.fr2052a.fields.SubProduct.isNoCollateralPledged(subProduct))))(flow.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.and(flow.effectiveMaturityBucket match {
      case morphir.sdk.Maybe.Nothing => 
        false
      case morphir.sdk.Maybe.Just(bucket) => 
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(bucket))(regulation.us.fr2052a.fields.MaturityBucket.isOpen(bucket))
    })(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(3)(iii)""",
        flow.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Secured.Secured]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((flow: regulation.us.fr2052a.datatables.inflows.Secured.Secured) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule134Section33F2X(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule133Section33F2Ix(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule132Section33F2Viii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule131Section33F2Vii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule130Section33F2Vi(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule129Section33F2V(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule128Section33F2Iv(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule127Section33F2Iii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule126Section33F2Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule125Section33F2I(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule124Section33F1Vii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule123Section33F1Vi(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule122Section33F1V(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule121Section33F1V(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule120Section33F1Iv(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule119Section33F1Iv(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule118Section33F1Iii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule117Section33F1Iii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule116Section33F1Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule115Section33F1Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule114Section33F1Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule113Section33F1I(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule110Section33D2(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule108Section33D1(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule105Section33C(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule97Section32J3Xiii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule96Section32J3Xii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule95Section32J3Xi(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule94Section32J3X(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule93Section32J3Ix(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule92Section32J3Viii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule91Section32J3Vii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule90Section32J3Vi(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule89Section32J3V(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule88Section32J3Iv(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule87Section32J3Iii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule86Section32J3Ii(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule85Section32J3I(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule9Section21CTodo(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule7Section21ATodo(fromDate)(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule2Section20C1(flow))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.inflows.Secured.rule2Section20B1(flow))(regulation.us.lcr.inflows.Secured.rule2Section20A1(flow)))))))))))))))))))))))))))))))))))))))))))))(list)

}