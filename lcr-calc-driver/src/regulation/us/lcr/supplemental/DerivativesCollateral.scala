package regulation.us.lcr.supplemental

/** Generated based on US.LCR.Supplemental.DerivativesCollateral
*/
object DerivativesCollateral{

  def applyRules(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule3Section20A1C(flow))("""20(a)(1)C""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule3Section20A1(flow))("""20(a)(1)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule3Section20B1(flow))("""20(b)(1)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule3Section20C1(flow))("""20(c)(1)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule6Section22B5L1(flow))("""22(b)(5)L1""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule6Section22B5L2A(flow))("""22(b)(5)L2a""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule6Section22B5L2B(flow))("""22(b)(5)L2b""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule33Section32F2(flow))("""32(f)(2)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule35Section32F4(flow))("""32(f)(4)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule36Section32F4(flow))("""32(f)(4)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule37Section32F5(flow))("""32(f)(5)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.DerivativesCollateral.matchRule38Section32F6(flow))("""32(f)(6)""")(flow.marketValue)
    ))
  
  def matchRule3Section20A1(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC7,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC10
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isRehypothecateableCollateralUnencumbered(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.and(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isCash(_class)))))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool])))))
  
  def matchRule3Section20A1C(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC7,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC10
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isRehypothecateableCollateralUnencumbered(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isCash(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool])))))
  
  def matchRule3Section20B1(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC7,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC10
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isRehypothecateableCollateralUnencumbered(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool])))))
  
  def matchRule3Section20C1(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC7,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC10
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((subProduct: regulation.us.fr2052a.fields.SubProduct.SubProduct) =>
      regulation.us.fr2052a.fields.SubProduct.isRehypothecateableCollateralUnencumbered(subProduct)))(flow.subProduct)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool])))))
  
  def matchRule33Section32F2(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC5,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC6,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC8,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC9
    )))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class))))(flow.collateralClass)))
  
  def matchRule35Section32F4(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC15)))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.or(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))(regulation.us.fr2052a.fields.CollateralClass.isOther(_class))))(flow.collateralClass)))
  
  def matchRule36Section32F4(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC15)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(false) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool]))))
  
  def matchRule37Section32F5(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC16))
  
  def matchRule38Section32F6(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(flow.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC18,
      regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC20
    ))
  
  def matchRule6Section22B5L1(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC15)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool]))))
  
  def matchRule6Section22B5L2A(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC15)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool]))))
  
  def matchRule6Section22B5L2B(
    flow: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.sDC15)))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(flow.collateralClass)))(morphir.sdk.Basics.equal(flow.treasuryControl)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool]))))
  
  def rule20A1(
    assets: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral
  ): morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Float] =
    if (regulation.us.lcr.supplemental.DerivativesCollateral.matchRule3Section20A1(assets)) {
      (morphir.sdk.Maybe.Just(assets.marketValue) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Float])
    } else {
      (morphir.sdk.Maybe.Nothing : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Float])
    }

}