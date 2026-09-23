package regulation.us.lcr

/** Generated based on US.LCR.AggregatedRuleBalances
*/
object AggregatedRuleBalances{

  def aggregateRuleBalances(
    ruleBalances: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance]
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.Aggregate.aggregate(((key: regulation.us.lcr.Rules.RuleName) =>
      ((balances: morphir.sdk.Aggregate.Aggregation[regulation.us.lcr.Rules.RuleBalance, morphir.sdk.Key.Key0] => regulation.us.lcr.Basics.Balance) =>
        (regulation.us.lcr.Rules.RuleBalance(
          key,
          balances(morphir.sdk.Aggregate.sumOf(((x: regulation.us.lcr.Rules.RuleBalance) =>
            x.amount)))
        ) : regulation.us.lcr.Rules.RuleBalance))))(morphir.sdk.Aggregate.groupBy(((x: regulation.us.lcr.Rules.RuleBalance) =>
      x.rule))(ruleBalances))
  
  def applyInflowRules(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    inflows: regulation.us.fr2052a.DataTables.Inflows
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.inflows.Assets.toRuleBalances(fromDate)(inflows.assets),
      regulation.us.lcr.inflows.Unsecured.toRuleBalances(fromDate)(inflows.unsecured),
      regulation.us.lcr.inflows.Secured.toRuleBalances(fromDate)(inflows.secured),
      regulation.us.lcr.inflows.Other.toRuleBalances(fromDate)(inflows.other)
    ))
  
  def applyOutflowRules(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    outflows: regulation.us.fr2052a.DataTables.Outflows
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      regulation.us.lcr.outflows.Deposits.toRuleBalances(fromDate)(outflows.deposits),
      regulation.us.lcr.outflows.Secured.toRuleBalances(fromDate)(outflows.secured),
      regulation.us.lcr.outflows.Wholesale.toRuleBalances(fromDate)(outflows.wholesale),
      regulation.us.lcr.outflows.Other.toRuleBalances(fromDate)(outflows.other)
    ))
  
  def applySupplementalRules(
    supplementals: regulation.us.fr2052a.DataTables.Supplemental
  ): morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance] =
    morphir.sdk.List.concat(morphir.sdk.List(
      morphir.sdk.List.concatMap(((d: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral) =>
        regulation.us.lcr.supplemental.DerivativesCollateral.applyRules(d)))(supplementals.derivativesCollateral),
      morphir.sdk.List.concatMap(((l: regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement) =>
        regulation.us.lcr.supplemental.LiquidityRiskMeasurement.applyRules(l)))(supplementals.liquidityRiskMeasurement)
    ))
  
  def groupAndSum(
    ruleBalances: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance]
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.AggregatedRuleBalances.sum(regulation.us.lcr.AggregatedRuleBalances.aggregateRuleBalances(ruleBalances))
  
  def inflowValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    inflows: regulation.us.fr2052a.DataTables.Inflows
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.AggregatedRuleBalances.groupAndSum(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(inflows))
  
  def outflowValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    outflows: regulation.us.fr2052a.DataTables.Outflows
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.AggregatedRuleBalances.groupAndSum(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(outflows))
  
  def sum(
    ruleBalances: morphir.sdk.List.List[regulation.us.lcr.Rules.RuleBalance]
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.List.sum(morphir.sdk.List.map(((x: regulation.us.lcr.Rules.RuleBalance) =>
      x.amount))(ruleBalances))
  
  def supplementalValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    flows: regulation.us.fr2052a.DataTables.Supplemental
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.AggregatedRuleBalances.groupAndSum(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(flows))

}