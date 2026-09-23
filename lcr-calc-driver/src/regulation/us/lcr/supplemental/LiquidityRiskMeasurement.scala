package regulation.us.lcr.supplemental

/** Generated based on US.LCR.Supplemental.LiquidityRiskMeasurement
*/
object LiquidityRiskMeasurement{

  def applyRules(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule4Section22B3L1(flow))("""22(b)(3)L1""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule4Section22B3L2A(flow))("""22(b)(3)L2a""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule4Section22B3L2B(flow))("""22(b)(3)L2b""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule5Section22A3L1(flow))("""22(a)(3)L1""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule5Section22A3L2A(flow))("""22(a)(3)L2a""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule5Section22A3L2B(flow))("""22(a)(3)L2b""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule62Section32I1(flow))("""32(i)(1)""")(flow.marketValue),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.supplemental.LiquidityRiskMeasurement.matchRule63Section32I2(flow))("""32(i)(2)""")(flow.marketValue)
    ))
  
  def matchRule4Section22B3L1(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.product)(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL1))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class)))(flow.collateralClass)))
  
  def matchRule4Section22B3L2A(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.product)(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL1))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(flow.collateralClass)))
  
  def matchRule4Section22B3L2B(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.Basics.equal(flow.product)(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL1))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(flow.collateralClass)))
  
  def matchRule5Section22A3L1(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL3)))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class)))(flow.collateralClass)))
  
  def matchRule5Section22A3L2A(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL3)))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(flow.collateralClass)))
  
  def matchRule5Section22A3L2B(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL3)))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(flow.collateralClass)))
  
  def matchRule62Section32I1(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL4))
  
  def matchRule63Section32I2(
    flow: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(flow.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.sL5))

}