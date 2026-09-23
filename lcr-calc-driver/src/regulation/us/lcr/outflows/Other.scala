package regulation.us.lcr.outflows

/** Generated based on US.LCR.Outflows.Other
*/
object Other{

  def rule101Section32L(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO19)))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(l)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule102Section32L(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO22)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(other.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(other.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(l)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule15Section32A5(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO22)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(other.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(other.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(a)(5)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule18Section32B(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO21)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(other.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(other.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(b)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule19Section32C(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO20))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(c)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule20Section32D(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO6)))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(d)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule21Section32E1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5
    )))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(i)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule22Section32E1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(ii)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule23Section32E1Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO4)))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(iii)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule24Section32E1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(iv)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule25Section32E1V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(v)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule26Section32E1V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(v)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule27Section32E1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO4)))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(vi)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule28Section32E1Vii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(vii)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule29Section32E1Viii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(viii)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule30Section32E1Ix(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(other.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Other.oO4,
      regulation.us.fr2052a.datatables.outflows.Other.oO5,
      regulation.us.fr2052a.datatables.outflows.Other.oO18
    )))(morphir.sdk.Basics.or(morphir.sdk.Basics.equal(other.product)(regulation.us.fr2052a.datatables.outflows.Other.oO18))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(other.maturityBucket)))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(e)(1)(ix)""",
        regulation.us.lcr.AmountCalculations.note4(other.collateralClass)(other.collateralValue)(other.maturityAmount)
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule31Section32F1(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO16))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(f)(1)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule32Section32F1(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO12))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(f)(1)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule34Section32F3(
    other: regulation.us.fr2052a.datatables.outflows.Other.Other
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.List.member(other.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Other.oO8))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(f)(3)""",
        other.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Other.Other]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((other: regulation.us.fr2052a.datatables.outflows.Other.Other) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule102Section32L(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule101Section32L(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule34Section32F3(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule32Section32F1(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule31Section32F1(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule30Section32E1Ix(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule29Section32E1Viii(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule28Section32E1Vii(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule27Section32E1Vi(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule26Section32E1V(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule25Section32E1V(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule24Section32E1Iv(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule23Section32E1Iii(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule22Section32E1Ii(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule21Section32E1I(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule20Section32D(fromDate)(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule19Section32C(other))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Other.rule18Section32B(fromDate)(other))(regulation.us.lcr.outflows.Other.rule15Section32A5(other)))))))))))))))))))))(list)

}