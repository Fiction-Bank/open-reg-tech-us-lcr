package regulation.us.lcr.outflows

/** Generated based on US.LCR.Outflows.Secured
*/
object Secured{

  def rule100Section32K(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Secured.oS6)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isSpecificCentralBank(subProduct)))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(k)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule16Section32A5(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(a)(5)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule51Section32H1IiA(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS6,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isOther(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(1)(ii)(A)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule55Section32H2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isOther(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket]))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(h)(2)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule65Section32J1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS6,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(i)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule68Section32J1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS6,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(ii)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule71Section32J1Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS6,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(secured.collateralClass))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(secured.collateralClass))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(iii)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule74Section32J1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(iv)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule76Section32J1V(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Secured.oS7)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isCustomerLong(subProduct)))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(secured.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(v)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule79Section32J1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isCustomerLong(subProduct))(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct)))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(secured.collateralClass)))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(1)(vi)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule8Section21BTodo(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS4,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS6,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(morphir.sdk.Basics.not(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.SubProduct.isUnsettledRegularWay(subProduct))(regulation.us.fr2052a.fields.SubProduct.isUnsettledForward(subProduct))))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLA(secured.collateralClass))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))(morphir.sdk.Basics.equal(secured.treasuryControl)(true)))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """21(b)(todo)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule82Section32J2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3,
      regulation.us.fr2052a.datatables.outflows.Secured.oS5,
      regulation.us.fr2052a.datatables.outflows.Secured.oS7,
      regulation.us.fr2052a.datatables.outflows.Secured.oS11
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.notEqual(secured.product)(regulation.us.fr2052a.datatables.outflows.Secured.oS7))(regulation.us.fr2052a.fields.SubProduct.isFirmLong(subProduct))))(secured.subProduct)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(secured.collateralClass))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(secured.collateralClass))))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(j)(2)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def rule99Section32K(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured
  ): morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance] =
    if (morphir.sdk.Basics.and(morphir.sdk.List.member(secured.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Secured.oS1,
      regulation.us.fr2052a.datatables.outflows.Secured.oS2,
      regulation.us.fr2052a.datatables.outflows.Secured.oS3
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(secured.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.Basics.equal(secured.forwardStartAmount)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartAmount.ForwardStartAmount])))(morphir.sdk.Basics.equal(secured.forwardStartBucket)((morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.fr2052a.fields.ForwardStartBucket.ForwardStartBucket])))))) {
      (morphir.sdk.Maybe.Just((regulation.us.lcr.Rules.RuleBalance(
        """32(k)""",
        secured.maturityAmount
      ) : regulation.us.lcr.Rules.RuleBalance)) : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[regulation.us.lcr.Rules.RuleBalance])
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    list: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Secured.Secured]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filterMap(((secured: regulation.us.fr2052a.datatables.outflows.Secured.Secured) =>
      regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule100Section32K(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule99Section32K(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule82Section32J2(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule79Section32J1Vi(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule76Section32J1V(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule74Section32J1Iv(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule71Section32J1Iii(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule68Section32J1Ii(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule65Section32J1I(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule55Section32H2(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule51Section32H1IiA(fromDate)(secured))(regulation.us.lcr.Rules.orElse(regulation.us.lcr.outflows.Secured.rule16Section32A5(secured))(regulation.us.lcr.outflows.Secured.rule8Section21BTodo(fromDate)(secured)))))))))))))))(list)

}