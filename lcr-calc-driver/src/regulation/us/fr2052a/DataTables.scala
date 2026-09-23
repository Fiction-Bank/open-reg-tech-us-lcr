package regulation.us.fr2052a

/** Generated based on US.FR2052A.DataTables
*/
object DataTables{

  final case class DataTables(
    inflows: regulation.us.fr2052a.DataTables.Inflows,
    outflows: regulation.us.fr2052a.DataTables.Outflows,
    supplemental: regulation.us.fr2052a.DataTables.Supplemental
  ){}
  
  final case class Inflows(
    assets: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Assets.Assets],
    unsecured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Unsecured.Unsecured],
    secured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Secured.Secured],
    other: morphir.sdk.List.List[regulation.us.fr2052a.datatables.inflows.Other.Other]
  ){}
  
  final case class Outflows(
    deposits: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Deposits.Deposits],
    wholesale: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Wholesale.Wholesale],
    secured: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Secured.Secured],
    other: morphir.sdk.List.List[regulation.us.fr2052a.datatables.outflows.Other.Other]
  ){}
  
  final case class Supplemental(
    informational: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.Informational.Informational],
    derivativesCollateral: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.DerivativesCollateral.DerivativesCollateral],
    liquidityRiskMeasurement: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.LiquidityRiskMeasurement.LiquidityRiskMeasurement],
    balanceSheet: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.BalanceSheet.BalanceSheet],
    foreignExchange: morphir.sdk.List.List[regulation.us.fr2052a.datatables.supplemental.ForeignExchange.ForeignExchange]
  ){}

}