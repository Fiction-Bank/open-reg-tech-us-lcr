package regulation.us.lcr

/** Generated based on US.LCR.HQLAAmountValues
*/
object HQLAAmountValues{

  def assetExchangeUnwindCollateralValuesWithLevel1CollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""33(f)(2)(i)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def assetExchangeUnwindCollateralValuesWithLevel2ACollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""21(c)(todo)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def assetExchangeUnwindCollateralValuesWithLevel2BCollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""21(c)(1)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def assetExchangeUnwindMaturityAmountsWithLevel1SubProduct(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""21(c)(todo)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def assetExchangeUnwindMaturityAmountsWithLevel2ASubProduct(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""32(j)(3)(ii)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def assetExchangeUnwindMaturityAmountsWithLevel2BSubProduct(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""32(j)(3)(iii)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def level1HQLAAdditiveValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level1InflowAssets: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Assets.Assets] = morphir.sdk.List.filter(((a: regulation.us.fr2052a.datatables.inflows.Assets.Assets) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(a.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel1)))(data.inflows.assets)
    
    val level1InflowSecured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Secured.Secured] = morphir.sdk.List.filter(((s: regulation.us.fr2052a.datatables.inflows.Secured.Secured) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(s.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel1)))(data.inflows.secured)
    
    val level1Inflows: regulation.us.fr2052a.DataTables.Inflows = regulation.us.fr2052a.DataTables.Inflows(
      assets = level1InflowAssets,
      other = morphir.sdk.List(
      
      ),
      secured = level1InflowSecured,
      unsecured = morphir.sdk.List(
      
      )
    )
    
    val level1SupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = morphir.sdk.List.filter(((d: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(d.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel1)))(data.supplemental.derivativesCollateral)
    
    val level1Supplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level1SupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val inflowAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """33(c)""",
      """33(d)(1)""",
      """33(d)(2)""",
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(level1Inflows))
    
    val supplementalAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)""",
      """20(a)(1)-C"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level1Supplementals))
    
    morphir.sdk.Basics.add(inflowAmount)(supplementalAmount)
  }
  
  def level1HQLASubtractiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level1SupplementalLiquidityRiskMeasurement: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement] = data.supplemental.liquidityRiskMeasurement
    
    val level1Supplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = morphir.sdk.List(
      
      ),
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = level1SupplementalLiquidityRiskMeasurement
    )
    
    val level1SupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = data.supplemental.derivativesCollateral
    
    val level1SupplementalsDerivatives: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level1SupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val liquidityRiskAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """22(b)(3)L1""",
      """22(a)(3)L1"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level1Supplementals))
    
    val derivativesCollateralAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""22(b)(5)L1"""))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level1SupplementalsDerivatives))
    
    morphir.sdk.Basics.add(derivativesCollateralAmount)(liquidityRiskAmount)
  }
  
  def level2AHQLAAdditiveValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level2AInflowAssets: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Assets.Assets] = morphir.sdk.List.filter(((a: regulation.us.fr2052a.datatables.inflows.Assets.Assets) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(a.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A)))(data.inflows.assets)
    
    val level2AInflowSecured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Secured.Secured] = morphir.sdk.List.filter(((s: regulation.us.fr2052a.datatables.inflows.Secured.Secured) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(s.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A)))(data.inflows.secured)
    
    val level2AInflows: regulation.us.fr2052a.DataTables.Inflows = regulation.us.fr2052a.DataTables.Inflows(
      assets = level2AInflowAssets,
      other = morphir.sdk.List(
      
      ),
      secured = level2AInflowSecured,
      unsecured = morphir.sdk.List(
      
      )
    )
    
    val level2ASupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = morphir.sdk.List.filter(((d: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(d.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2A)))(data.supplemental.derivativesCollateral)
    
    val level2ASupplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level2ASupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val inflowAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """33(c)""",
      """33(d)(1)""",
      """33(d)(2)""",
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(level2AInflows))
    
    val supplementalAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)""",
      """20(a)(1)C"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2ASupplementals))
    
    morphir.sdk.Basics.add(inflowAmount)(supplementalAmount)
  }
  
  def level2AHQLASubtractiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level2ASupplementalLiquidityRiskMeasurement: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement] = data.supplemental.liquidityRiskMeasurement
    
    val level2ASupplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = morphir.sdk.List(
      
      ),
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = level2ASupplementalLiquidityRiskMeasurement
    )
    
    val level2ASupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = data.supplemental.derivativesCollateral
    
    val level2ASupplementalsDerivatives: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level2ASupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val liquidityRiskAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """22(b)(3)L2a""",
      """22(a)(3)L2a"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2ASupplementals))
    
    val derivativesCollateralAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""22(b)(5)L2a"""))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2ASupplementalsDerivatives))
    
    morphir.sdk.Basics.add(derivativesCollateralAmount)(liquidityRiskAmount)
  }
  
  def level2BHQLAAdditiveValues(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level2BInflowAssets: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Assets.Assets] = morphir.sdk.List.filter(((a: regulation.us.fr2052a.datatables.inflows.Assets.Assets) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(a.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B)))(data.inflows.assets)
    
    val level2BInflowSecured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Secured.Secured] = morphir.sdk.List.filter(((s: regulation.us.fr2052a.datatables.inflows.Secured.Secured) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(s.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B)))(data.inflows.secured)
    
    val level2BInflows: regulation.us.fr2052a.DataTables.Inflows = regulation.us.fr2052a.DataTables.Inflows(
      assets = level2BInflowAssets,
      other = morphir.sdk.List(
      
      ),
      secured = level2BInflowSecured,
      unsecured = morphir.sdk.List(
      
      )
    )
    
    val level2BSupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = morphir.sdk.List.filter(((d: regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral) =>
      regulation.us.fr2052a.fields.SubProduct.isSubProduct(d.subProduct)(regulation.us.fr2052a.fields.SubProduct.isHQLALevel2B)))(data.supplemental.derivativesCollateral)
    
    val level2BSupplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level2BSupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val inflowAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """33(c)""",
      """33(d)(1)""",
      """33(d)(2)""",
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(level2BInflows))
    
    val supplementalAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """20(a)(1)""",
      """20(b)(1)""",
      """20(c)(1)""",
      """20(a)(1)C"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2BSupplementals))
    
    morphir.sdk.Basics.add(inflowAmount)(supplementalAmount)
  }
  
  def level2BHQLASubtractiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val level2BSupplementalLiquidityRiskMeasurement: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement] = data.supplemental.liquidityRiskMeasurement
    
    val level2BSupplementals: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = morphir.sdk.List(
      
      ),
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = level2BSupplementalLiquidityRiskMeasurement
    )
    
    val level2BSupplementalDerivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral] = data.supplemental.derivativesCollateral
    
    val level2BSupplementalsDerivatives: regulation.us.fr2052a.DataTables.Supplemental = regulation.us.fr2052a.DataTables.Supplemental(
      balanceSheet = morphir.sdk.List(
      
      ),
      derivativesCollateral = level2BSupplementalDerivativesCollateral,
      foreignExchange = morphir.sdk.List(
      
      ),
      informational = morphir.sdk.List(
      
      ),
      liquidityRiskMeasurement = morphir.sdk.List(
      
      )
    )
    
    val liquidityRiskAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
      """22(b)(3)L2b""",
      """22(a)(3)L2b"""
    ))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2BSupplementals))
    
    val derivativesCollateralAmount: regulation.us.lcr.Basics.Balance = regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""22(b)(5)L2b"""))(regulation.us.lcr.AggregatedRuleBalances.applySupplementalRules(level2BSupplementalsDerivatives))
    
    morphir.sdk.Basics.add(derivativesCollateralAmount)(liquidityRiskAmount)
  }
  
  def securedFundingUnwindCollateralValuesWithLevel1CollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""32(j)(1)(i)"""))(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(data.outflows))
  
  def securedFundingUnwindCollateralValuesWithLevel2ACollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""32(j)(1)(ii)"""))(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(data.outflows))
  
  def securedFundingUnwindCollateralValuesWithLevel2BCollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""32(j)(1)(iv)"""))(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(data.outflows))
  
  def securedFundingUnwindMaturityAmounts(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""21(b)(todo)"""))(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(data.outflows))
  
  def securedLendingUnwindCollateralValuesWithLevel1CollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""33(f)(1)(iii)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def securedLendingUnwindCollateralValuesWithLevel2ACollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""33(f)(1)(iv)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def securedLendingUnwindCollateralValuesWithLevel2BCollateralClass(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""33(f)(1)(v)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
  
  def securedLendingUnwindMaturityAmounts(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List("""21(a)(todo)"""))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))

}