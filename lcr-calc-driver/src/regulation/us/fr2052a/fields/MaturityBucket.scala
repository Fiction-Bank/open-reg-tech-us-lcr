package regulation.us.fr2052a.fields

/** Generated based on US.FR2052A.Fields.MaturityBucket
*/
object MaturityBucket{

  type FromDate = morphir.sdk.Basics.Int
  
  sealed trait MaturityBucket {
  
    
  
  }
  
  object MaturityBucket{
  
    final case class Day(
      arg1: morphir.sdk.Basics.Int
    ) extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
    
    final case class DayRange(
      arg1: morphir.sdk.Basics.Int,
      arg2: morphir.sdk.Basics.Int
    ) extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
    
    case object Open extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
    
    case object Perpetual extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
    
    final case class YearAbove(
      arg1: morphir.sdk.Basics.Int
    ) extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
    
    final case class YearRange(
      arg1: morphir.sdk.Basics.Int,
      arg2: morphir.sdk.Basics.Int
    ) extends regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket{}
  
  }
  
  val Day: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Day.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Day
  
  val DayRange: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.DayRange.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.DayRange
  
  val Open: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Open.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Open
  
  val Perpetual: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Perpetual.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.Perpetual
  
  val YearAbove: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.YearAbove.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.YearAbove
  
  val YearRange: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.YearRange.type  = regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket.YearRange
  
  def isGreaterThan30Days(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket
  ): morphir.sdk.Basics.Bool =
    maturityBucket match {
      case regulation.us.fr2052a.fields.MaturityBucket.Day(n) => 
        morphir.sdk.Basics.greaterThan(morphir.sdk.Basics.subtract(n)(fromDate))(morphir.sdk.Basics.Int(30))
      case _ => 
        true
    }
  
  def isLessThanOrEqual30Days(
    fromDate: regulation.us.fr2052a.fields.MaturityBucket.FromDate
  )(
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket
  ): morphir.sdk.Basics.Bool =
    maturityBucket match {
      case regulation.us.fr2052a.fields.MaturityBucket.Day(n) => 
        morphir.sdk.Basics.lessThanOrEqual(morphir.sdk.Basics.subtract(n)(fromDate))(morphir.sdk.Basics.Int(30))
      case _ => 
        false
    }
  
  def isOpen(
    maturityBucket: regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(maturityBucket)((regulation.us.fr2052a.fields.MaturityBucket.Open : regulation.us.fr2052a.fields.MaturityBucket.MaturityBucket))

}