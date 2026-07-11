"""
Fiction Bank LCR Calculation DAG — stub file.

This is a demo/sandbox stub representing what the LCR team's calculation
pipeline would look like in production. It is NOT intended to be executed as-is.

Pipeline: Validate FR 2052a inputs → run Morphir deterministic LCR calc →
          emit lineage → publish LCR report.

The LCR calculation engine is the open-reg-tech-us-lcr project: Morphir Elm
compiled to JavaScript, providing a fully deterministic, auditable LCR result.

Triggered by: fiction_bank_finance_eod (via TriggerDagRunOperator)
"""

from __future__ import annotations

import logging
from datetime import datetime, timedelta

from airflow import DAG
from airflow.operators.bash import BashOperator
from airflow.operators.python import PythonOperator
from airflow.operators.trigger_dagrun import TriggerDagRunOperator  # noqa: F401 — available for future use
from airflow.sensors.external_task import ExternalTaskSensor

# ---------------------------------------------------------------------------
# DataHub lineage operator — optional dependency.
# If datahub is not installed in the Airflow environment, fall back to a
# no-op PythonOperator that logs the lineage payload for visibility.
# ---------------------------------------------------------------------------
try:
    from datahub.integrations.airflow.operators import DatahubEmitterOperator

    DATAHUB_AVAILABLE = True
except ImportError:  # pragma: no cover
    DatahubEmitterOperator = None  # type: ignore[assignment,misc]
    DATAHUB_AVAILABLE = False

DATAHUB_CONNECTION_ID = "datahub_rest_default"

log = logging.getLogger(__name__)

# ---------------------------------------------------------------------------
# Default args
# ---------------------------------------------------------------------------
default_args = {
    "owner": "lcr-team",
    "retries": 2,
    "retry_delay": timedelta(minutes=5),
    "email_on_failure": False,
    "email_on_retry": False,
}

# ---------------------------------------------------------------------------
# FR 2052a table URNs (all 13 sections populated by the dbt 6G mapping)
# ---------------------------------------------------------------------------
FR2052A_URNS: list[str] = [
    # Inflows
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.inflows.assets,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.inflows.other,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.inflows.secured,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.inflows.unsecured,PROD)",
    # Outflows
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.outflows.deposits,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.outflows.other,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.outflows.secured,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.outflows.wholesale,PROD)",
    # Supplemental
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.supplemental.balance_sheet,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.supplemental.derivatives_collateral,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.supplemental.foreign_exchange,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.supplemental.informational,PROD)",
    "urn:li:dataset:(urn:li:dataPlatform:lcr,fr2052a.supplemental.liquidity_risk_measurement,PROD)",
]

URN_LCR_OUTPUT = (
    "urn:li:dataset:(urn:li:dataPlatform:logical,"
    "FINANCE.LIQUIDITY.lcr_entity_snapshots,PROD)"
)

# Human-readable table names mirroring the URN list above (for validation logs)
FR2052A_TABLE_NAMES: list[str] = [
    "fr2052a.inflows.assets",
    "fr2052a.inflows.other",
    "fr2052a.inflows.secured",
    "fr2052a.inflows.unsecured",
    "fr2052a.outflows.deposits",
    "fr2052a.outflows.other",
    "fr2052a.outflows.secured",
    "fr2052a.outflows.wholesale",
    "fr2052a.supplemental.balance_sheet",
    "fr2052a.supplemental.derivatives_collateral",
    "fr2052a.supplemental.foreign_exchange",
    "fr2052a.supplemental.informational",
    "fr2052a.supplemental.liquidity_risk_measurement",
]


# ---------------------------------------------------------------------------
# Helper: build a lineage emitter task, falling back to a log-only stub
# ---------------------------------------------------------------------------
def _make_lineage_task(
    task_id: str,
    upstream_urns: list[str],
    downstream_urns: list[str],
    dag: DAG,
):
    """Return a DatahubEmitterOperator or a fallback PythonOperator."""
    if DATAHUB_AVAILABLE and DatahubEmitterOperator is not None:
        return DatahubEmitterOperator(
            task_id=task_id,
            datahub_conn_id=DATAHUB_CONNECTION_ID,
            # In production: mces=[build_lineage_mcp(upstream_urns, downstream_urns)]
            mces=[],
            dag=dag,
        )

    def _log_lineage(**context):
        log.info(
            "[datahub-stub] lineage emit skipped (datahub package not installed)\n"
            "  upstream  : %s\n"
            "  downstream: %s",
            upstream_urns,
            downstream_urns,
        )

    return PythonOperator(
        task_id=task_id,
        python_callable=_log_lineage,
        dag=dag,
    )


# ---------------------------------------------------------------------------
# Task callables
# ---------------------------------------------------------------------------
def _validate_fr2052a_inputs(**context):
    """Validate all 13 FR 2052a tables have rows for today's reporting_date."""
    ds = context["ds"]
    log.info("Validating FR 2052a inputs for reporting_date=%s", ds)
    for table_name in FR2052A_TABLE_NAMES:
        # STUB: In production this would run a COUNT query against each table
        # and raise AirflowException if any table returns 0 rows.
        log.info("  [ok] %s — rows present for %s (stub)", table_name, ds)
    log.info("All %d FR 2052a tables validated.", len(FR2052A_TABLE_NAMES))


def _publish_lcr_report(**context):
    """Publish the LCR ratio summary for today's run."""
    ds = context["ds"]
    # STUB: In production this would query FINANCE.LIQUIDITY.lcr_entity_snapshots
    # and publish the ratio breakdown to the risk reporting layer.
    log.info("LCR ratio published for %s: entity_count=N", ds)


# ---------------------------------------------------------------------------
# DAG definition
# ---------------------------------------------------------------------------
with DAG(
    dag_id="fiction_bank_lcr_calculation",
    description=(
        "LCR calculation pipeline — reads the 13 FR 2052a tables populated by "
        "the 6G dbt mapping and runs the Morphir deterministic LCR calculation, "
        "writing results to FINANCE.LIQUIDITY.lcr_entity_snapshots."
    ),
    schedule_interval=None,  # Triggered by fiction_bank_finance_eod
    start_date=datetime(2025, 1, 1),
    catchup=False,
    default_args=default_args,
    tags=["lcr", "regulatory", "morphir"],
) as dag:

    # 1. Wait for Finance EOD dbt tests to pass before reading FR 2052a tables
    wait_for_6g_mapping = ExternalTaskSensor(
        task_id="wait_for_6g_mapping",
        external_dag_id="fiction_bank_finance_eod",
        external_task_id="run_dbt_test_6g",
        timeout=3600,
        poke_interval=60,
        mode="reschedule",
    )

    # 2. Validate all 13 FR 2052a tables have data for the reporting date
    validate_fr2052a_inputs = PythonOperator(
        task_id="validate_fr2052a_inputs",
        python_callable=_validate_fr2052a_inputs,
    )

    # 3. Run Morphir deterministic LCR calculation
    # Morphir Elm compiled to JS — deterministic LCR calc from open-reg-tech-us-lcr
    run_morphir_lcr = BashOperator(
        task_id="run_morphir_lcr",
        bash_command=(
            "node dist/index.js "
            "--reporting-date {{ ds }} "
            "--output-table FINANCE.LIQUIDITY.lcr_entity_snapshots"
        ),
    )

    # 4. Emit lineage: all 13 FR 2052a tables → lcr_entity_snapshots
    emit_lcr_lineage = _make_lineage_task(
        task_id="emit_lcr_lineage",
        upstream_urns=FR2052A_URNS,
        downstream_urns=[URN_LCR_OUTPUT],
        dag=dag,
    )

    # 5. Publish LCR report / ratio summary
    publish_lcr_report = PythonOperator(
        task_id="publish_lcr_report",
        python_callable=_publish_lcr_report,
    )

    # ---------------------------------------------------------------------------
    # Task dependency chain
    # ---------------------------------------------------------------------------
    (
        wait_for_6g_mapping
        >> validate_fr2052a_inputs
        >> run_morphir_lcr
        >> emit_lcr_lineage
        >> publish_lcr_report
    )
