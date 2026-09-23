package regulation.us.lcr

/** Generated based on US.LCR.Calculations
*/
object Calculations{

  sealed trait BankCategory {
  
    
  
  }
  
  object BankCategory{
  
    case object CategoryIIBoardRegulatedInstitution extends regulation.us.lcr.Calculations.BankCategory{}
    
    case object CategoryIIIBoardRegulatedInstitution75BillionOrMore extends regulation.us.lcr.Calculations.BankCategory{}
    
    case object CategoryIIIBoardRegulatedInstitutionLessThan75Billion extends regulation.us.lcr.Calculations.BankCategory{}
    
    case object CategoryIVBoardRegulatedInstitution extends regulation.us.lcr.Calculations.BankCategory{}
    
    case object GlobalSystemicallyImportantBHCOrGSIBDepositoryInstitution extends regulation.us.lcr.Calculations.BankCategory{}
  
  }
  
  val CategoryIIBoardRegulatedInstitution: regulation.us.lcr.Calculations.BankCategory.CategoryIIBoardRegulatedInstitution.type  = regulation.us.lcr.Calculations.BankCategory.CategoryIIBoardRegulatedInstitution
  
  val CategoryIIIBoardRegulatedInstitution75BillionOrMore: regulation.us.lcr.Calculations.BankCategory.CategoryIIIBoardRegulatedInstitution75BillionOrMore.type  = regulation.us.lcr.Calculations.BankCategory.CategoryIIIBoardRegulatedInstitution75BillionOrMore
  
  val CategoryIIIBoardRegulatedInstitutionLessThan75Billion: regulation.us.lcr.Calculations.BankCategory.CategoryIIIBoardRegulatedInstitutionLessThan75Billion.type  = regulation.us.lcr.Calculations.BankCategory.CategoryIIIBoardRegulatedInstitutionLessThan75Billion
  
  val CategoryIVBoardRegulatedInstitution: regulation.us.lcr.Calculations.BankCategory.CategoryIVBoardRegulatedInstitution.type  = regulation.us.lcr.Calculations.BankCategory.CategoryIVBoardRegulatedInstitution
  
  val GlobalSystemicallyImportantBHCOrGSIBDepositoryInstitution: regulation.us.lcr.Calculations.BankCategory.GlobalSystemicallyImportantBHCOrGSIBDepositoryInstitution.type  = regulation.us.lcr.Calculations.BankCategory.GlobalSystemicallyImportantBHCOrGSIBDepositoryInstitution
  
  def adjustedExcessHQLA(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.add(regulation.us.lcr.Calculations.adjustedLevel2CapExcessAmount(data))(regulation.us.lcr.Calculations.adjustedLevel2BCapExcessAmount(data))
  
  def adjustedLevel1HQLAAdditiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(regulation.us.lcr.HQLAAmountValues.level1HQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.securedLendingUnwindMaturityAmounts(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.securedLendingUnwindCollateralValuesWithLevel1CollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.securedFundingUnwindMaturityAmounts(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.securedFundingUnwindCollateralValuesWithLevel1CollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindMaturityAmountsWithLevel1SubProduct(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindCollateralValuesWithLevel1CollateralClass(regulation.us.lcr.Calculations.t0)(data))
  
  def adjustedLevel2AHQLAAdditiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2AHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.securedLendingUnwindCollateralValuesWithLevel2ACollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.securedFundingUnwindCollateralValuesWithLevel2ACollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindMaturityAmountsWithLevel2ASubProduct(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindCollateralValuesWithLevel2ACollateralClass(regulation.us.lcr.Calculations.t0)(data))
  
  def adjustedLevel2BCapExcessAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.subtract(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.5))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel2BHQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level2BHQLASubtractiveValues(data)))))(regulation.us.lcr.Calculations.adjustedLevel2CapExcessAmount(data)))(morphir.sdk.Basics.add(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.1765))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel1HQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level1HQLASubtractiveValues(data))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.85))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel2AHQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLASubtractiveValues(data)))))
  
  def adjustedLevel2BHQLAAdditiveValues(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2BHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.securedLendingUnwindCollateralValuesWithLevel2BCollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.securedFundingUnwindCollateralValuesWithLevel2BCollateralClass(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindMaturityAmountsWithLevel2BSubProduct(regulation.us.lcr.Calculations.t0)(data)))(regulation.us.lcr.HQLAAmountValues.assetExchangeUnwindCollateralValuesWithLevel2BCollateralClass(regulation.us.lcr.Calculations.t0)(data))
  
  def adjustedLevel2CapExcessAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.85))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel2AHQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.5))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel2BHQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level2BHQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.6667))(morphir.sdk.Basics.subtract(regulation.us.lcr.Calculations.adjustedLevel1HQLAAdditiveValues(data))(regulation.us.lcr.HQLAAmountValues.level1HQLASubtractiveValues(data))))
  
  def cumulativeOutflowAmountFromOneToM(
    m: morphir.sdk.Basics.Int
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val applicableBuckets: morphir.sdk.List.List[morphir.sdk.Basics.Int] = morphir.sdk.List.range(morphir.sdk.Basics.Int(1))(m)
    
    def outflowAmount(
      fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
    ): regulation.us.lcr.Basics.Balance =
      regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
        """32(g)(1)""",
        """32(g)(2)""",
        """32(g)(3)""",
        """32(g)(4)""",
        """32(g)(5)""",
        """32(g)(6)""",
        """32(g)(7)""",
        """32(g)(8)""",
        """32(g)(9)""",
        """32(h)(1)""",
        """32(h)(2)""",
        """32(h)(5)""",
        """32(j)""",
        """32(k)""",
        """32(l)"""
      ))(regulation.us.lcr.AggregatedRuleBalances.applyOutflowRules(fromDate)(data.outflows))
    
    def inflowAmount(
      fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
    ): regulation.us.lcr.Basics.Balance =
      regulation.us.lcr.Rules.matchAndSum(morphir.sdk.List(
        """33(c)""",
        """33(d)""",
        """33(e)""",
        """33(f)"""
      ))(regulation.us.lcr.AggregatedRuleBalances.applyInflowRules(fromDate)(data.inflows))
    
    morphir.sdk.List.sum(morphir.sdk.List.map(((fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate) =>
      morphir.sdk.Basics.subtract(outflowAmount(fromDate))(inflowAmount(fromDate))))(applicableBuckets))
  }
  
  def hqlaAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): morphir.sdk.Basics.Float =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level1HQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level1HQLASubtractiveValues(data)))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.85))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2AHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.5))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2BHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data)))))(morphir.sdk.Basics.max(regulation.us.lcr.Calculations.unadjustedExcessHQLA(data))(regulation.us.lcr.Calculations.adjustedExcessHQLA(data)))
  
  def largestNetCumulativeMaturityOutflowAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance = {
    val maturityBuckets: morphir.sdk.List.List[morphir.sdk.Basics.Int] = morphir.sdk.List.range(morphir.sdk.Basics.Int(1))(morphir.sdk.Basics.Int(30))
    
    val cumulativeOutflows: morphir.sdk.List.List[regulation.us.lcr.Basics.Balance] = morphir.sdk.List.map(((m: morphir.sdk.Basics.Int) =>
      regulation.us.lcr.Calculations.cumulativeOutflowAmountFromOneToM(m)(data)))(maturityBuckets)
    
    val maxVal: morphir.sdk.Maybe.Maybe[regulation.us.lcr.Basics.Balance] = morphir.sdk.List.maximum(cumulativeOutflows)
    
    maxVal match {
      case morphir.sdk.Maybe.Just(v) => 
        v
      case morphir.sdk.Maybe.Nothing => 
        morphir.sdk.Basics.negate(morphir.sdk.Basics.Float(1))
    }
  }
  
  def lcr(
    bankCategory: regulation.us.lcr.Calculations.BankCategory
  )(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): morphir.sdk.Basics.Float =
    morphir.sdk.Basics.divide(regulation.us.lcr.Calculations.hqlaAmount(data))(regulation.us.lcr.Calculations.totalNetCashOutflows(data)(bankCategory))
  
  def level2BCapExcessAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.5))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2BHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2BHQLASubtractiveValues(data)))))(regulation.us.lcr.Calculations.level2CapExcessAmount(data)))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.1765))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level1HQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level1HQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.85))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2AHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLASubtractiveValues(data))))
  
  def level2CapExcessAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.add(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.85))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2AHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2AHQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.5))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level2BHQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level2BHQLASubtractiveValues(data)))))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.6667))(morphir.sdk.Basics.subtract(regulation.us.lcr.HQLAAmountValues.level1HQLAAdditiveValues(regulation.us.lcr.Calculations.t0)(data))(regulation.us.lcr.HQLAAmountValues.level1HQLASubtractiveValues(data))))
  
  def maturityMismatchAddOn(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.subtract(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(regulation.us.lcr.Calculations.largestNetCumulativeMaturityOutflowAmount(data)))(morphir.sdk.Basics.max(morphir.sdk.Basics.Float(0))(regulation.us.lcr.Calculations.netDay30CumulativeMaturityOutflowAmount(data)))
  
  def netDay30CumulativeMaturityOutflowAmount(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    regulation.us.lcr.Calculations.cumulativeOutflowAmountFromOneToM(morphir.sdk.Basics.Int(30))(data)
  
  def outflowAdjustmentPercentage(
    bankCategory: regulation.us.lcr.Calculations.BankCategory
  ): morphir.sdk.Basics.Float =
    bankCategory match {
      case regulation.us.lcr.Calculations.GlobalSystemicallyImportantBHCOrGSIBDepositoryInstitution => 
        morphir.sdk.Basics.Float(1)
      case regulation.us.lcr.Calculations.CategoryIIBoardRegulatedInstitution => 
        morphir.sdk.Basics.Float(1)
      case regulation.us.lcr.Calculations.CategoryIIIBoardRegulatedInstitution75BillionOrMore => 
        morphir.sdk.Basics.Float(1)
      case regulation.us.lcr.Calculations.CategoryIIIBoardRegulatedInstitutionLessThan75Billion => 
        morphir.sdk.Basics.Float(0.85)
      case regulation.us.lcr.Calculations.CategoryIVBoardRegulatedInstitution => 
        morphir.sdk.Basics.Float(0.7)
    }
  
  def t0: regulation.us.fr2052a.fields.MaturityBucket.FromDate =
    morphir.sdk.Basics.Int(0)
  
  def totalNetCashOutflows(
    data: regulation.us.fr2052a.DataTables.DataTables
  )(
    bankCategory: regulation.us.lcr.Calculations.BankCategory
  ): morphir.sdk.Basics.Float =
    morphir.sdk.Basics.multiply(regulation.us.lcr.Calculations.outflowAdjustmentPercentage(bankCategory))(morphir.sdk.Basics.add(morphir.sdk.Basics.subtract(regulation.us.lcr.AggregatedRuleBalances.outflowValues(regulation.us.lcr.Calculations.t0)(data.outflows))(morphir.sdk.Basics.min(regulation.us.lcr.AggregatedRuleBalances.inflowValues(regulation.us.lcr.Calculations.t0)(data.inflows))(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Float(0.75))(regulation.us.lcr.AggregatedRuleBalances.outflowValues(regulation.us.lcr.Calculations.t0)(data.outflows)))))(regulation.us.lcr.Calculations.maturityMismatchAddOn(data)))
  
  def unadjustedExcessHQLA(
    data: regulation.us.fr2052a.DataTables.DataTables
  ): regulation.us.lcr.Basics.Balance =
    morphir.sdk.Basics.add(regulation.us.lcr.Calculations.level2CapExcessAmount(data))(regulation.us.lcr.Calculations.level2BCapExcessAmount(data))

}