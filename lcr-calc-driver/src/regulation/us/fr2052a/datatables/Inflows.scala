package regulation.us.fr2052a.datatables

/** Generated based on US.FR2052A.DataTables.Inflows
*/
object Inflows{

  sealed trait Inflows {
  
    
  
  }
  
  object Inflows{
  
    final case class Assets(
      arg1: regulation.us.fr2052a.datatables.inflows.Assets.Assets
    ) extends regulation.us.fr2052a.datatables.Inflows.Inflows{}
    
    final case class Other(
      arg1: regulation.us.fr2052a.datatables.inflows.Other.Other
    ) extends regulation.us.fr2052a.datatables.Inflows.Inflows{}
    
    final case class Secured(
      arg1: regulation.us.fr2052a.datatables.inflows.Secured.Secured
    ) extends regulation.us.fr2052a.datatables.Inflows.Inflows{}
    
    final case class Unsecured(
      arg1: regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured
    ) extends regulation.us.fr2052a.datatables.Inflows.Inflows{}
  
  }
  
  val Assets: regulation.us.fr2052a.datatables.Inflows.Inflows.Assets.type  = regulation.us.fr2052a.datatables.Inflows.Inflows.Assets
  
  val Other: regulation.us.fr2052a.datatables.Inflows.Inflows.Other.type  = regulation.us.fr2052a.datatables.Inflows.Inflows.Other
  
  val Secured: regulation.us.fr2052a.datatables.Inflows.Inflows.Secured.type  = regulation.us.fr2052a.datatables.Inflows.Inflows.Secured
  
  val Unsecured: regulation.us.fr2052a.datatables.Inflows.Inflows.Unsecured.type  = regulation.us.fr2052a.datatables.Inflows.Inflows.Unsecured

}