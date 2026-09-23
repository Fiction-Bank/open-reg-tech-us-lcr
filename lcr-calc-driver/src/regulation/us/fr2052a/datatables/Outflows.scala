package regulation.us.fr2052a.datatables

/** Generated based on US.FR2052A.DataTables.Outflows
*/
object Outflows{

  sealed trait Outflows {
  
    
  
  }
  
  object Outflows{
  
    final case class Deposits(
      arg1: regulation.us.fr2052a.datatables.outflows.Deposits.Deposits
    ) extends regulation.us.fr2052a.datatables.Outflows.Outflows{}
    
    final case class Other(
      arg1: regulation.us.fr2052a.datatables.outflows.Other.Other
    ) extends regulation.us.fr2052a.datatables.Outflows.Outflows{}
    
    final case class Secured(
      arg1: regulation.us.fr2052a.datatables.outflows.Secured.Secured
    ) extends regulation.us.fr2052a.datatables.Outflows.Outflows{}
    
    final case class Wholesale(
      arg1: regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale
    ) extends regulation.us.fr2052a.datatables.Outflows.Outflows{}
  
  }
  
  val Deposits: regulation.us.fr2052a.datatables.Outflows.Outflows.Deposits.type  = regulation.us.fr2052a.datatables.Outflows.Outflows.Deposits
  
  val Other: regulation.us.fr2052a.datatables.Outflows.Outflows.Other.type  = regulation.us.fr2052a.datatables.Outflows.Outflows.Other
  
  val Secured: regulation.us.fr2052a.datatables.Outflows.Outflows.Secured.type  = regulation.us.fr2052a.datatables.Outflows.Outflows.Secured
  
  val Wholesale: regulation.us.fr2052a.datatables.Outflows.Outflows.Wholesale.type  = regulation.us.fr2052a.datatables.Outflows.Outflows.Wholesale

}