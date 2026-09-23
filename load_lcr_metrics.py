#!/usr/bin/env python3
"""
load_lcr_metrics.py — Fiction Bank / open-reg-tech-us-lcr

Loads generated/lcr-calculations-metrics.yml (produced by
morphir_calculations_to_metrics.py) into DataHub as Metric entities, via
DataHub's OpenAPI v2 entity API -- there is no native YAML+CLI spec for the
Metric entity (unlike dataproduct/structured-properties/business-glossary),
and the local datahub Python SDK checkout doesn't yet have typed classes for
it either (the entity is newer than the pinned SDK), so this talks to
POST /openapi/v2/entity/metric directly.

Kept local to open-reg-tech-us-lcr / the Regulatory Reporting domain, same
as push_data_products.py's Data Products and morphir_fields_to_glossary.py's
Glossary Terms.

Usage:
    python load_lcr_metrics.py [--metrics generated/lcr-calculations-metrics.yml]
        --server http://localhost:9080 --token <token>
    python load_lcr_metrics.py --dry-run

Environment variables (alternative to CLI args):
    DATAHUB_GMS_URL   DataHub GMS URL (default: http://localhost:9080)
    DATAHUB_GMS_TOKEN DataHub access token
"""

import argparse
import os
import sys
import time
from pathlib import Path

import requests
import yaml

PLATFORM = "urn:li:dataPlatform:lcr"
PATH = "regulation.us.lcr.calculations"
DOMAIN_URN = "urn:li:domain:1210"  # Regulatory Reporting
ACTOR = "urn:li:corpuser:datahub"
GLOSSARY_PREFIX = "regulation.lcr"


def _metric_urn(metric_id: str) -> str:
    return f"urn:li:metric:({PLATFORM},{PATH},{metric_id})"


def _dataset_urn(table_name: str) -> str:
    return f"urn:li:dataset:(urn:li:dataPlatform:lcr,{table_name},PROD)"


def _glossary_term_urn(local_name: str) -> str:
    return f"urn:li:glossaryTerm:{GLOSSARY_PREFIX}.{local_name}"


def build_payload(metric: dict, now_ms: int) -> dict:
    audit_stamp = {"time": now_ms, "actor": ACTOR}

    payload = {
        "urn": _metric_urn(metric["id"]),
        "metricKey": {
            "value": {"__type": "MetricKey", "platform": PLATFORM, "path": PATH, "id": metric["id"]}
        },
        "metricInfo": {
            "value": {
                "__type": "MetricInfo",
                "name": metric["name"],
                "description": metric["description"],
                # dialect OTHER, not ANSI_SQL/SNOWFLAKE/etc: this is a rendering of
                # the real Elm/Morphir formula (see morphir_calculations_to_metrics.py's
                # _render_expr), not a SQL query -- asserting a SQL dialect that
                # doesn't actually back this expression would repeat ADR-0004's
                # fabricated-identity anti-pattern for a different aspect.
                "expression": {
                    "dialects": [{"dialect": "OTHER", "expression": metric["expression"]}]
                },
            }
        },
        "domains": {"value": {"__type": "Domains", "domains": [DOMAIN_URN]}},
    }

    if metric.get("glossary_term"):
        payload["glossaryTerms"] = {
            "value": {
                "__type": "GlossaryTerms",
                "terms": [{"urn": _glossary_term_urn(metric["glossary_term"])}],
                "auditStamp": audit_stamp,
            }
        }

    if metric.get("dataset_upstreams"):
        payload["metricUpstreams"] = {
            "value": {
                "__type": "MetricUpstreams",
                "datasetUpstreams": [
                    {"destinationUrn": _dataset_urn(t)} for t in metric["dataset_upstreams"]
                ],
            }
        }

    if metric.get("derived_from"):
        payload["metricRelationships"] = {
            "value": {
                "__type": "MetricRelationships",
                "derivedFrom": [
                    {"destinationUrn": _metric_urn(dep)} for dep in metric["derived_from"]
                ],
                "relatedMetrics": [],
            }
        }

    return payload


def run(metrics_file: Path, server: str, token: str, dry_run: bool) -> None:
    data = yaml.safe_load(metrics_file.read_text())
    metrics = data["metrics"]
    now_ms = int(time.time() * 1000)

    print(f"DataHub server : {server}")
    print(f"Metrics file   : {metrics_file}")
    print(f"Dry run        : {dry_run}")
    print()

    payloads = [build_payload(m, now_ms) for m in metrics]

    for m, payload in zip(metrics, payloads):
        if dry_run:
            print(f"  DRY  {payload['urn']}")
            print(f"       glossaryTerm={m.get('glossary_term')}  "
                  f"derivedFrom={m.get('derived_from')}  "
                  f"datasetUpstreams={len(m.get('dataset_upstreams') or [])}")

    if dry_run:
        return

    headers = {"Authorization": f"Bearer {token}", "Content-Type": "application/json"}
    resp = requests.post(f"{server}/openapi/v2/entity/metric", json=payloads, headers=headers)

    if resp.status_code == 200:
        for m in metrics:
            print(f"  OK   {_metric_urn(m['id'])}")
    else:
        print(f"  [ERROR] {resp.status_code}: {resp.text[:500]}")
        sys.exit(1)

    print()
    print("=== Summary ===")
    print(f"  Metrics created/updated: {len(metrics)}")


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    parser.add_argument("--metrics", default="generated/lcr-calculations-metrics.yml", type=Path)
    parser.add_argument("--server", default=os.environ.get("DATAHUB_GMS_URL", "http://localhost:9080"))
    parser.add_argument("--token", default=os.environ.get("DATAHUB_GMS_TOKEN"))
    parser.add_argument("--dry-run", action="store_true")
    args = parser.parse_args()

    if not args.dry_run and not args.token:
        print("ERROR: --token or DATAHUB_GMS_TOKEN required (or pass --dry-run)", file=sys.stderr)
        sys.exit(1)

    run(metrics_file=args.metrics, server=args.server, token=args.token, dry_run=args.dry_run)


if __name__ == "__main__":
    main()
