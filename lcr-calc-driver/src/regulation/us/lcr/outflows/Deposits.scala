package regulation.us.lcr.outflows

/** Generated based on US.LCR.Outflows.Deposits
*/
object Deposits{

  def applyRule72Section32J1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    if (regulation.us.lcr.outflows.Deposits.matchRule72Section32J1Iv(fromDate)(deposits)) {
      regulation.us.lcr.outflows.Deposits.rule72Section32J1IvAmount(deposits)
    } else {
      morphir.sdk.List(
      
      )
    }
  
  def applyRules(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule10Section32A1(deposits))("""32(a)(1)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule11Section32A2(deposits))("""32(a)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule12Section32A3(deposits))("""32(a)(3)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule13Section32A4(deposits))("""32(a)(4)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule14Section32A5(deposits))("""32(a)(5)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule39Section32G1(fromDate)(deposits))("""32(g)(1)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule40Section32G2(fromDate)(deposits))("""32(g)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule41Section32G3(deposits))("""32(g)(3)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule42Section32G4(deposits))("""32(g)(4)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule43Section32G5(deposits))("""32(g)(5)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule44Section32G6(deposits))("""32(g)(6)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule45Section32G7(deposits))("""32(g)(7)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule46Section32G8(deposits))("""32(g)(8)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule47Section32G9(deposits))("""32(g)(9)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule48Section32H1I(fromDate)(deposits))("""32(h)(1)(i)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule49Section32H1IiA(fromDate)(deposits))("""32(h)(1)(ii)(A)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule52Section32H1IiB(fromDate)(deposits))("""32(h)(1)(ii)(B)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule53Section32H2(fromDate)(deposits))("""32(h)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule57Section32H3(fromDate)(deposits))("""32(h)(3)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule58Section32H4(fromDate)(deposits))("""32(h)(4)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule59Section32H4(fromDate)(deposits))("""32(h)(4)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule60Section32H5(fromDate)(deposits))("""32(h)(5)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule64Section32J1I(fromDate)(deposits))("""32(j)(1)(i)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule67Section32J1Ii(fromDate)(deposits))("""32(j)(1)(ii)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule70Section32J1Iii(fromDate)(deposits))("""32(j)(1)(iii)""")(deposits.maturityAmount),
      regulation.us.lcr.outflows.Deposits.applyRule72Section32J1Iv(fromDate)(deposits),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule73Section32J1Iv(fromDate)(deposits))("""32(j)(1)(iv)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule77Section32J1Vi(fromDate)(deposits))("""32(j)(1)(vi)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule78Section32J1Vi(fromDate)(deposits))("""32(j)(1)(vi)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule81Section32J2(fromDate)(deposits))("""32(j)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule83Section32J2(fromDate)(deposits))("""32(j)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule84Section32J2(fromDate)(deposits))("""32(j)(2)""")(deposits.maturityAmount),
      regulation.us.lcr.Rule.applyRule(regulation.us.lcr.outflows.Deposits.matchRule98Section32K(fromDate)(deposits))("""32(k)""")(deposits.maturityAmount)
    ))
  
  def matchRule10Section32A1(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD1,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD2
    ))
  
  def matchRule11Section32A2(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD1,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD2,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD3
    ))
  
  def matchRule12Section32A3(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD14))
  
  def matchRule13Section32A4(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD14))
  
  def matchRule14Section32A5(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD15))
  
  def matchRule39Section32G1(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD8)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Basics.notEqual(deposits.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))))
  
  def matchRule40Section32G2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD8)))(regulation.us.fr2052a.fields.MaturityBucket.isGreaterThan30Days(fromDate)(deposits.maturityBucket))
  
  def matchRule41Section32G3(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD8)))(morphir.sdk.Basics.equal(deposits.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket)))
  
  def matchRule42Section32G4(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD8)))(morphir.sdk.Basics.equal(deposits.maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket)))
  
  def matchRule43Section32G5(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD13))
  
  def matchRule44Section32G6(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD13))
  
  def matchRule45Section32G7(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD9,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD10
    ))
  
  def matchRule46Section32G8(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD11))
  
  def matchRule47Section32G9(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD9,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD10,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD11
    ))
  
  def matchRule48Section32H1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule49Section32H1IiA(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule52Section32H1IiB(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD8,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD9,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD10,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD11,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD13
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule53Section32H2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD8,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD9,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD10,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD11,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD13
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule57Section32H3(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD4)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule58Section32H4(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD4)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule59Section32H4(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD7)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule60Section32H5(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD14,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD15
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isOther(_class)))(deposits.collateralClass))))
  
  def matchRule64Section32J1I(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class)))(deposits.collateralClass))))
  
  def matchRule67Section32J1Ii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2A(_class)))(deposits.collateralClass))))
  
  def matchRule70Section32J1Iii(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))))(deposits.collateralClass))))
  
  def matchRule72Section32J1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.counterparty)(morphir.sdk.List(
      (regulation.us.fr2052a.fields.Counterparty.NonFinancialCorporate : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.PublicSectorEntity : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.OtherSupranational : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.PensionFund : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.Bank : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.BrokerDealer : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.InvestmentCompanyOrAdvisor : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.FinancialMarketUtility : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.OtherSupervisedNonBankFinancialEntity : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.NonRegulatedFund : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.DebtIssuingSpecialPurposeEntity : regulation.us.fr2052a.fields.Counterparty.Counterparty),
      (regulation.us.fr2052a.fields.Counterparty.Other : regulation.us.fr2052a.fields.Counterparty.Counterparty)
    )))(morphir.sdk.Basics.and(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(deposits.collateralClass)))(morphir.sdk.Basics.equal(deposits.rehypothecated)((morphir.sdk.Maybe.Just(true) : morphir.sdk.Maybe.Maybe[morphir.sdk.Basics.Bool]))))))
  
  def matchRule73Section32J1Iv(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class)))(deposits.collateralClass))))
  
  def matchRule77Section32J1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class))))(deposits.collateralClass))))
  
  def matchRule78Section32J1Vi(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class))))(deposits.collateralClass))))
  
  def matchRule81Section32J2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6
    )))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))))(deposits.collateralClass))))
  
  def matchRule83Section32J2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD4)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(if (regulation.us.fr2052a.fields.Insured.isFDICInsured(deposits.insured)) {
      morphir.sdk.Maybe.withDefault(true)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
        morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel1(_class))))(deposits.collateralClass))
    } else {
      morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
        morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))))(deposits.collateralClass))
    }))
  
  def matchRule84Section32J2(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(regulation.us.fr2052a.datatables.outflows.Deposits.oD7)))(morphir.sdk.Basics.and(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))(morphir.sdk.Maybe.withDefault(false)(morphir.sdk.Maybe.map(((_class: regulation.us.fr2052a.fields.CollateralClass.CollateralClass) =>
      morphir.sdk.Basics.or(regulation.us.fr2052a.fields.CollateralClass.isHQLALevel2B(_class))(morphir.sdk.Basics.not(regulation.us.fr2052a.fields.CollateralClass.isHQLA(_class)))))(deposits.collateralClass))))
  
  def matchRule98Section32K(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.and(morphir.sdk.List.member(deposits.product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.outflows.Deposits.oD4,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD5,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD6,
      regulation.us.fr2052a.datatables.outflows.Deposits.oD7
    )))(regulation.us.fr2052a.fields.MaturityBucket.isLessThanOrEqual30Days(fromDate)(deposits.maturityBucket))
  
  def rule72Section32J1IvAmount(
    deposits: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    deposits.collateralValue match {
      case morphir.sdk.Maybe.Just(collateralValue) => 
        if (morphir.sdk.Basics.lessThan(collateralValue)(deposits.maturityAmount)) {
          morphir.sdk.List(
            (regulation.us.lcr.Rules.RuleBalance(
              """32(h)""",
              morphir.sdk.Basics.subtract(deposits.maturityAmount)(collateralValue)
            ) : regulation.us.lcr.Rules.RuleBalance),
            (regulation.us.lcr.Rules.RuleBalance(
              """32(j)(1)(iv))""",
              deposits.maturityAmount
            ) : regulation.us.lcr.Rules.RuleBalance)
          )
        } else {
          morphir.sdk.List((regulation.us.lcr.Rules.RuleBalance(
            """32(j)(1)(iv))""",
            deposits.maturityAmount
          ) : regulation.us.lcr.Rules.RuleBalance))
        }
      case _ => 
        morphir.sdk.List(
        
        )
    }
  
  def toRuleBalances(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flows: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Deposits.Deposits]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.filter(((rb: regulation.us.lcr.Rules.RuleBalance) =>
      morphir.sdk.Basics.notEqual(rb.rule)("""""")))(morphir.sdk.List.map(((flow: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits) =>
      regulation.us.lcr.Rules.RuleBalance(
        amount = flow.maturityAmount,
        rule = if (regulation.us.lcr.outflows.Deposits.matchRule10Section32A1(flow)) {
          """32(a)(1)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule11Section32A2(flow)) {
          """32(a)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule12Section32A3(flow)) {
          """32(a)(3)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule13Section32A4(flow)) {
          """32(a)(4)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule14Section32A5(flow)) {
          """32(a)(5)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule39Section32G1(fromDate)(flow)) {
          """32(g)(1)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule40Section32G2(fromDate)(flow)) {
          """32(g)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule41Section32G3(flow)) {
          """32(g)(3)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule42Section32G4(flow)) {
          """32(g)(4)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule43Section32G5(flow)) {
          """32(g)(5)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule44Section32G6(flow)) {
          """32(g)(6)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule45Section32G7(flow)) {
          """32(g)(7)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule46Section32G8(flow)) {
          """32(g)(8)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule47Section32G9(flow)) {
          """32(g)(9)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule48Section32H1I(fromDate)(flow)) {
          """32(h)(1)(i)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule49Section32H1IiA(fromDate)(flow)) {
          """32(h)(1)(ii)(A)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule52Section32H1IiB(fromDate)(flow)) {
          """32(h)(1)(ii)(B)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule53Section32H2(fromDate)(flow)) {
          """32(h)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule57Section32H3(fromDate)(flow)) {
          """32(h)(3)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule58Section32H4(fromDate)(flow)) {
          """32(h)(4)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule59Section32H4(fromDate)(flow)) {
          """32(h)(4)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule60Section32H5(fromDate)(flow)) {
          """32(h)(5)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule64Section32J1I(fromDate)(flow)) {
          """32(j)(1)(i)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule67Section32J1Ii(fromDate)(flow)) {
          """32(j)(1)(ii)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule70Section32J1Iii(fromDate)(flow)) {
          """32(j)(1)(iii)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule72Section32J1Iv(fromDate)(flow)) {
          """32(j)(1)(iv)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule73Section32J1Iv(fromDate)(flow)) {
          """32(j)(1)(iv)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule77Section32J1Vi(fromDate)(flow)) {
          """32(j)(1)(vi)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule78Section32J1Vi(fromDate)(flow)) {
          """32(j)(1)(vi)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule81Section32J2(fromDate)(flow)) {
          """32(j)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule83Section32J2(fromDate)(flow)) {
          """32(j)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule84Section32J2(fromDate)(flow)) {
          """32(j)(2)"""
        } else if (regulation.us.lcr.outflows.Deposits.matchRule98Section32K(fromDate)(flow)) {
          """32(k)"""
        } else {
          """"""
        }
      )))(flows))

}