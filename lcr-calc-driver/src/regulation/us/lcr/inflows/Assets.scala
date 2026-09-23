package regulation.us.lcr.inflows

/** Generated based on US.LCR.Inflows.Assets
*/
object Assets{

  def rule1Section20A1(
    flow: regulation.us.fr2052a.datatables.inflows.Assets.Assets
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Assets.iA1,
      regulation.us.fr2052a.datatables.inflows.Assets.iA2
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.notEqual(flow.subProduct)((morphir.sdk.Maybe.Just(regulation.us.fr2052a.fields.SubProduct.currencyAndCoin) : morphir.sdk.Maybe.Maybe[morphir.sdk.String.String])))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(flow.collateralClass))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isCash(flow.collateralClass))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.encumbranceType)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType])))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(a)(1)""",
        flow.marketValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule1Section20A1C(
    flow: regulation.us.fr2052a.datatables.inflows.Assets.Assets
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Assets.iA3)))(morphir.sdk.Basics.and(morphir.sdk.Basics.notEqual(flow.subProduct)((morphir.sdk.Maybe.Just(regulation.us.fr2052a.fields.SubProduct.currencyAndCoin) : morphir.sdk.Maybe.Maybe[morphir.sdk.String.String])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isOpen(flow.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isCash(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.encumbranceType)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType])))(morphir.sdk.Basics.equal(flow.treasuryControl)(true))))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(a)(1)-C""",
        flow.marketValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule1Section20B1(
    flow: regulation.us.fr2052a.datatables.inflows.Assets.Assets
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Assets.iA1,
      regulation.us.fr2052a.datatables.inflows.Assets.iA2
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.notEqual(flow.subProduct)((morphir.sdk.Maybe.Just(regulation.us.fr2052a.fields.SubProduct.currencyAndCoin) : morphir.sdk.Maybe.Maybe[morphir.sdk.String.String])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.encumbranceType)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType])))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(b)(1)""",
        flow.marketValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule1Section20C1(
    flow: regulation.us.fr2052a.datatables.inflows.Assets.Assets
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Assets.iA1,
      regulation.us.fr2052a.datatables.inflows.Assets.iA2
    )))(morphir.sdk.Basics.and(morphir.sdk.Basics.notEqual(flow.subProduct)((morphir.sdk.Maybe.Just(regulation.us.fr2052a.fields.SubProduct.currencyAndCoin) : morphir.sdk.Maybe.Maybe[morphir.sdk.String.String])))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.encumbranceType)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.EncumbranceType.EncumbranceType])))(morphir.sdk.Basics.equal(flow.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(c)(1)""",
        flow.marketValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule107Section33D1(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flow: regulation.us.fr2052a.datatables.inflows.Assets.Assets
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Assets.iA3)))(morphir.sdk.Basics.and(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(flow.maturityBucket))(morphir.sdk.Basics.notEqual(flow.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isCash(flow.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(flow.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """20(d)(1)""",
        flow.marketValue
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    assetsList: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Assets.Assets]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filter(((rb: regulation.us.lcr.Rules.RuleBalance) =>
      morphir.sdk.Basics.notEqual(rb.rule)("""""")))(morphir.sdk.List.map(((asset: regulation.us.fr2052a.datatables.inflows.Assets.Assets) =>
      regulation.us.lcr.Rules.RuleBalance(
        amount = asset.marketValue,
        rule = if (morphir.sdk.Basics.notEqual(regulation.us.lcr.inflows.Assets.rule1Section20A1C(asset))((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance]))) {
          """20(a)(1)-C"""
        } else if (morphir.sdk.Basics.notEqual(regulation.us.lcr.inflows.Assets.rule1Section20A1(asset))((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance]))) {
          """20(a)(1)"""
        } else if (morphir.sdk.Basics.notEqual(regulation.us.lcr.inflows.Assets.rule1Section20B1(asset))((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance]))) {
          """20(b)(1)"""
        } else if (morphir.sdk.Basics.notEqual(regulation.us.lcr.inflows.Assets.rule1Section20C1(asset))((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance]))) {
          """20(c)(1)"""
        } else if (morphir.sdk.Basics.notEqual(regulation.us.lcr.inflows.Assets.rule107Section33D1(fromDate)(asset))((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance]))) {
          """33(d)(1)"""
        } else {
          """"""
        }
      )))(assetsList))

}