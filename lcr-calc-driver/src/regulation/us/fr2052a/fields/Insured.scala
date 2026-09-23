package regulation.us.fr2052a.fields

/** Generated based on US.FR2052A.Fields.Insured
*/
object Insured{

  sealed trait Insured {
  
    
  
  }
  
  object Insured{
  
    case object FDIC extends regulation.us.fr2052a.fields.Insured.Insured{}
    
    case object Other extends regulation.us.fr2052a.fields.Insured.Insured{}
    
    case object Uninsured extends regulation.us.fr2052a.fields.Insured.Insured{}
  
  }
  
  val FDIC: regulation.us.fr2052a.fields.Insured.Insured.FDIC.type  = regulation.us.fr2052a.fields.Insured.Insured.FDIC
  
  val Other: regulation.us.fr2052a.fields.Insured.Insured.Other.type  = regulation.us.fr2052a.fields.Insured.Insured.Other
  
  val Uninsured: regulation.us.fr2052a.fields.Insured.Insured.Uninsured.type  = regulation.us.fr2052a.fields.Insured.Insured.Uninsured
  
  def isFDICInsured(
    insured: regulation.us.fr2052a.fields.Insured.Insured
  ): morphir.sdk.Basics.Bool =
    morphir.sdk.Basics.equal(insured)((regulation.us.fr2052a.fields.Insured.FDIC : regulation.us.fr2052a.fields.Insured.Insured))

}