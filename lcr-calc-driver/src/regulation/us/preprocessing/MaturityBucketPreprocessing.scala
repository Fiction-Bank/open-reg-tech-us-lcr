package regulation.us.preprocessing

/** Generated based on US.Preprocessing.MaturityBucketPreprocessing
*/
object MaturityBucketPreprocessing{

  sealed trait InflowsProductCategory {
  
    
  
  }
  
  object InflowsProductCategory{
  
    final case class Assets(
      arg1: regulation.us.fr2052a.datatables.inflows.Assets.Product
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory{}
    
    final case class Other(
      arg1: regulation.us.fr2052a.datatables.inflows.Other.Product
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory{}
    
    final case class Secured(
      arg1: regulation.us.fr2052a.datatables.inflows.Secured.Product
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory{}
    
    final case class Unsecured(
      arg1: regulation.us.fr2052a.datatables.inflows.Unsecured.Product
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory{}
  
  }
  
  val Assets: regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Assets.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Assets
  
  val Other: regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Other.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Other
  
  val Secured: regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Secured.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Secured
  
  val Unsecured: regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Unsecured.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory.Unsecured
  
  sealed trait MaturityBucket {
  
    
  
  }
  
  object MaturityBucket{
  
    final case class Day(
      arg1: morphir.sdk.Basics.Int
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
    
    final case class DayRange(
      arg1: morphir.sdk.Basics.Int,
      arg2: morphir.sdk.Basics.Int
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
    
    case object Open extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
    
    case object Perpetual extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
    
    final case class YearAbove(
      arg1: morphir.sdk.Basics.Int
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
    
    final case class YearRange(
      arg1: morphir.sdk.Basics.Int,
      arg2: morphir.sdk.Basics.Int
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket{}
  
  }
  
  val Day: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Day.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Day
  
  val DayRange: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.DayRange.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.DayRange
  
  val Open: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Open.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Open
  
  val Perpetual: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Perpetual.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.Perpetual
  
  val YearAbove: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.YearAbove.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.YearAbove
  
  val YearRange: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.YearRange.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket.YearRange
  
  sealed trait MaturityBucketBankCategory {
  
    
  
  }
  
  object MaturityBucketBankCategory{
  
    case object USCategoryIIIOrCategoryIVBankingOrganizationsWithWSTWFGreaterThan50BAndFBOSIdentifiedAsCategoryIIIOrIVWithWSTWFGreaterThan50B extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory{}
    
    case object USCategoryIOrCategoryIIBankingOrganizationsAndFBOSIdentifiedAsCategoryII extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory{}
    
    case object USCategoryIVBankingOrganizationsWithWSTWFLessThan50BAndFBOSIdentifiedAsCategoryIVWithWSTWFLessThan50B extends regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory{}
  
  }
  
  val USCategoryIIIOrCategoryIVBankingOrganizationsWithWSTWFGreaterThan50BAndFBOSIdentifiedAsCategoryIIIOrIVWithWSTWFGreaterThan50B: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIIIOrCategoryIVBankingOrganizationsWithWSTWFGreaterThan50BAndFBOSIdentifiedAsCategoryIIIOrIVWithWSTWFGreaterThan50B.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIIIOrCategoryIVBankingOrganizationsWithWSTWFGreaterThan50BAndFBOSIdentifiedAsCategoryIIIOrIVWithWSTWFGreaterThan50B
  
  val USCategoryIOrCategoryIIBankingOrganizationsAndFBOSIdentifiedAsCategoryII: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIOrCategoryIIBankingOrganizationsAndFBOSIdentifiedAsCategoryII.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIOrCategoryIIBankingOrganizationsAndFBOSIdentifiedAsCategoryII
  
  val USCategoryIVBankingOrganizationsWithWSTWFLessThan50BAndFBOSIdentifiedAsCategoryIVWithWSTWFLessThan50B: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIVBankingOrganizationsWithWSTWFLessThan50BAndFBOSIdentifiedAsCategoryIVWithWSTWFLessThan50B.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory.USCategoryIVBankingOrganizationsWithWSTWFLessThan50BAndFBOSIdentifiedAsCategoryIVWithWSTWFLessThan50B
  
  sealed trait ProductType {
  
    
  
  }
  
  object ProductType{
  
    final case class Inflows(
      arg1: regulation.us.preprocessing.MaturityBucketPreprocessing.InflowsProductCategory
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType{}
    
    case object OutflowOrSupplemental extends regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType{}
  
  }
  
  val Inflows: regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType.Inflows.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType.Inflows
  
  val OutflowOrSupplemental: regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType.OutflowOrSupplemental.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType.OutflowOrSupplemental
  
  sealed trait TPlusN {
  
    
  
  }
  
  object TPlusN{
  
    case object IsOpen extends regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN{}
    
    case object IsPerpetual extends regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN{}
    
    final case class NumDays(
      arg1: morphir.sdk.Basics.Int
    ) extends regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN{}
  
  }
  
  val IsOpen: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.IsOpen.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.IsOpen
  
  val IsPerpetual: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.IsPerpetual.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.IsPerpetual
  
  val NumDays: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.NumDays.type  = regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN.NumDays
  
  def get30DayBucket(
    day: morphir.sdk.Basics.Int
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(90)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(120)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(91),
        morphir.sdk.Basics.Int(120)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(120)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(150)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(121),
        morphir.sdk.Basics.Int(150)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(151),
        morphir.sdk.Basics.Int(179)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def get90DayBucket(
    day: morphir.sdk.Basics.Int
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(179)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(270)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(180),
        morphir.sdk.Basics.Int(270)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(271),
        morphir.sdk.Basics.Int(364)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def getBucketCaseOne(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    bucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.NumDays(day) => 
        if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(0)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(60)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.Day(day) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(60)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(90)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.getWeeklyBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(90)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(179)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get30DayBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(179)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(364)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get90DayBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(364)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(5))))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.getYearlyBucket(day)
        } else {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.YearAbove(morphir.sdk.Basics.Int(5)) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsOpen => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsPerpetual => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Perpetual : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def getBucketCaseThree(
    days: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  )(
    productType: regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    productType match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.Inflows(inflowsProductCategory) => 
        inflowsProductCategory match {
          case regulation.us.preprocessing.MaturityBucketPreprocessing.Assets(a) => 
            if (regulation.us.preprocessing.MaturityBucketPreprocessing.rule3A(a)) {
              regulation.us.preprocessing.MaturityBucketPreprocessing.rule3ABucket(days)
            } else {
              regulation.us.preprocessing.MaturityBucketPreprocessing.inflowBuckets(days)
            }
          case regulation.us.preprocessing.MaturityBucketPreprocessing.Unsecured(u) => 
            if (regulation.us.preprocessing.MaturityBucketPreprocessing.rule3BU(u)) {
              regulation.us.preprocessing.MaturityBucketPreprocessing.rule3BBucket(days)
            } else {
              regulation.us.preprocessing.MaturityBucketPreprocessing.inflowBuckets(days)
            }
          case regulation.us.preprocessing.MaturityBucketPreprocessing.Secured(s) => 
            if (regulation.us.preprocessing.MaturityBucketPreprocessing.rule3BS(s)) {
              regulation.us.preprocessing.MaturityBucketPreprocessing.rule3BBucket(days)
            } else {
              regulation.us.preprocessing.MaturityBucketPreprocessing.inflowBuckets(days)
            }
          case regulation.us.preprocessing.MaturityBucketPreprocessing.Other(o) => 
            regulation.us.preprocessing.MaturityBucketPreprocessing.inflowBuckets(days)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.OutflowOrSupplemental => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.outflowAndSupplementalBuckets(days)
    }
  
  def getBucketCaseTwo(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  )(
    productType: regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    productType match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.Inflows(inflowsProductCategory) => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.inflowBuckets(bucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.OutflowOrSupplemental => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.outflowAndSupplementalBuckets(bucket)
    }
  
  def getWeeklyBucket(
    day: morphir.sdk.Basics.Int
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(60)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(67)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(61),
        morphir.sdk.Basics.Int(67)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(67)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(74)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(68),
        morphir.sdk.Basics.Int(74)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(74)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(82)))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(75),
        morphir.sdk.Basics.Int(82)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
        morphir.sdk.Basics.Int(83),
        morphir.sdk.Basics.Int(90)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def getYearlyBucket(
    day: morphir.sdk.Basics.Int
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(364)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(2))))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.YearRange(
        morphir.sdk.Basics.Int(1),
        morphir.sdk.Basics.Int(2)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(2))))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(3))))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.YearRange(
        morphir.sdk.Basics.Int(2),
        morphir.sdk.Basics.Int(3)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(3))))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.multiply(morphir.sdk.Basics.Int(365))(morphir.sdk.Basics.Int(4))))) {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.YearRange(
        morphir.sdk.Basics.Int(3),
        morphir.sdk.Basics.Int(4)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    } else {
      (regulation.us.preprocessing.MaturityBucketPreprocessing.YearRange(
        morphir.sdk.Basics.Int(4),
        morphir.sdk.Basics.Int(5)
      ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def inflowBuckets(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    bucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.NumDays(day) => 
        if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(0)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(60)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.Day(day) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(60)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(90)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.getWeeklyBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(90)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(179)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get30DayBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(179)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(364)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get90DayBucket(day)
        } else {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.YearAbove(morphir.sdk.Basics.Int(5)) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsOpen => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsPerpetual => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Perpetual : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def isLessThanOrEqual30Days(
    maturityBucket: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket
  ): morphir.sdk.Basics.Bool =
    maturityBucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.Day(n) => 
        morphir.sdk.Basics.lessThanOrEqual(n)(morphir.sdk.Basics.Int(30))
      case _ => 
        false
    }
  
  def maturityBucketTailoring(
    days: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  )(
    maturityBucketBankCategory: regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucketBankCategory
  )(
    productType: regulation.us.preprocessing.MaturityBucketPreprocessing.ProductType
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    maturityBucketBankCategory match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.USCategoryIOrCategoryIIBankingOrganizationsAndFBOSIdentifiedAsCategoryII => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.getBucketCaseOne(days)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.USCategoryIIIOrCategoryIVBankingOrganizationsWithWSTWFGreaterThan50BAndFBOSIdentifiedAsCategoryIIIOrIVWithWSTWFGreaterThan50B => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.getBucketCaseTwo(days)(productType)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.USCategoryIVBankingOrganizationsWithWSTWFLessThan50BAndFBOSIdentifiedAsCategoryIVWithWSTWFLessThan50B => 
        regulation.us.preprocessing.MaturityBucketPreprocessing.getBucketCaseThree(days)(productType)
    }
  
  def outflowAndSupplementalBuckets(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    bucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.NumDays(day) => 
        if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(0)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(60)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.Day(day) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(60)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(90)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.getWeeklyBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(90)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(179)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get30DayBucket(day)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(179)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(364)))) {
          regulation.us.preprocessing.MaturityBucketPreprocessing.get90DayBucket(day)
        } else {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.YearRange(
            morphir.sdk.Basics.Int(1),
            morphir.sdk.Basics.Int(2)
          ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsOpen => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsPerpetual => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Perpetual : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def rule3A(
    product: regulation.us.fr2052a.datatables.inflows.Assets.Product
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(product)(morphir.sdk.List(
      regulation.us.fr2052a.datatables.inflows.Assets.iA1,
      regulation.us.fr2052a.datatables.inflows.Assets.iA2,
      regulation.us.fr2052a.datatables.inflows.Assets.iA7
    ))
  
  def rule3ABucket(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    bucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.NumDays(day) => 
        if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(0)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(182)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(182)))(morphir.sdk.Basics.lessThan(day)(morphir.sdk.Basics.Int(365)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.DayRange(
            morphir.sdk.Basics.Int(271),
            morphir.sdk.Basics.Int(364)
          ) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.YearAbove(morphir.sdk.Basics.Int(5)) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsOpen => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsPerpetual => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Perpetual : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def rule3BBucket(
    bucket: regulation.us.preprocessing.MaturityBucketPreprocessing.TPlusN
  ): regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket =
    bucket match {
      case regulation.us.preprocessing.MaturityBucketPreprocessing.NumDays(day) => 
        if (morphir.sdk.Basics.and(morphir.sdk.Basics.greaterThan(day)(morphir.sdk.Basics.Int(0)))(morphir.sdk.Basics.lessThanOrEqual(day)(morphir.sdk.Basics.Int(30)))) {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.Day(morphir.sdk.Basics.Int(30)) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        } else {
          (regulation.us.preprocessing.MaturityBucketPreprocessing.YearAbove(morphir.sdk.Basics.Int(5)) : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
        }
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsOpen => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Open : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
      case regulation.us.preprocessing.MaturityBucketPreprocessing.IsPerpetual => 
        (regulation.us.preprocessing.MaturityBucketPreprocessing.Perpetual : regulation.us.preprocessing.MaturityBucketPreprocessing.MaturityBucket)
    }
  
  def rule3BS(
    securedProduct: regulation.us.fr2052a.datatables.inflows.Secured.Product
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(securedProduct)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Secured.iS7))
  
  def rule3BU(
    unsecuredProduct: regulation.us.fr2052a.datatables.inflows.Unsecured.Product
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.List.member(unsecuredProduct)(morphir.sdk.List(regulation.us.fr2052a.datatables.inflows.Unsecured.iU6))

}