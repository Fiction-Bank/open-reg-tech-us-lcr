#!/usr/bin/env python3
"""
Reads morphir-ir.json and pushes DataHub MCPs for the 13 FR 2052A logical model tables.

Usage:
    python3 morphir_to_datahub.py [--ir morphir-ir.json] \
        [--server http://localhost:8080] [--token <pat>]
"""
import argparse
import json
from pathlib import Path

from datahub.emitter.mcp import MetadataChangeProposalWrapper
from datahub.emitter.rest_emitter import DatahubRestEmitter
from datahub.metadata.schema_classes import (
    AuditStampClass,
    DataPlatformInstanceClass,
    DatasetPropertiesClass,
    DomainsClass,
    GlossaryTermAssociationClass,
    GlossaryTermsClass,
    NumberTypeClass,
    OtherSchemaClass,
    SchemaFieldClass,
    SchemaFieldDataTypeClass,
    SchemaMetadataClass,
    StatusClass,
    StringTypeClass,
    SubTypesClass,
)

# ---------------------------------------------------------------------------
# Helpers: decode Morphir name lists → strings
# ---------------------------------------------------------------------------

def _pascal(parts: list) -> str:
    return "".join(w.capitalize() for w in parts)

def _camel(parts: list) -> str:
    words = list(parts)
    return words[0] + "".join(w.capitalize() for w in words[1:])

def _path_str(mod_path: list) -> str:
    return ".".join("".join(p) for p in mod_path)

def _human(parts: list) -> str:
    return " ".join(w.capitalize() for w in parts)

def _snake(parts: list) -> str:
    return "_".join(parts)

def _lcr_term_urn(fname_parts: list) -> str:
    return f"urn:li:glossaryTerm:regulation.lcr.{'_'.join(fname_parts)}"

# ---------------------------------------------------------------------------
# Table modules we want — the 13 FR 2052A leaf data tables
# ---------------------------------------------------------------------------

TABLE_MODULES = {
    "us.fr2052a.datatables.inflows.assets":                 ("Inflows",      "Assets"),
    "us.fr2052a.datatables.inflows.secured":                ("Inflows",      "Secured"),
    "us.fr2052a.datatables.inflows.unsecured":              ("Inflows",      "Unsecured"),
    "us.fr2052a.datatables.inflows.other":                  ("Inflows",      "Other"),
    "us.fr2052a.datatables.outflows.deposits":              ("Outflows",     "Deposits"),
    "us.fr2052a.datatables.outflows.secured":               ("Outflows",     "Secured"),
    "us.fr2052a.datatables.outflows.wholesale":             ("Outflows",     "Wholesale"),
    "us.fr2052a.datatables.outflows.other":                 ("Outflows",     "Other"),
    "us.fr2052a.datatables.supplemental.balancesheet":      ("Supplemental", "Balance Sheet"),
    "us.fr2052a.datatables.supplemental.derivativescollateral": ("Supplemental", "Derivatives Collateral"),
    "us.fr2052a.datatables.supplemental.foreignexchange":   ("Supplemental", "Foreign Exchange"),
    "us.fr2052a.datatables.supplemental.liquidityriskmeasurement": ("Supplemental", "Liquidity Risk Measurement"),
    "us.fr2052a.datatables.supplemental.informational":     ("Supplemental", "Informational"),
}

# All fields map to regulation.lcr glossary terms by name.

PLATFORM = "lcr"
PLATFORM_URN = "urn:li:dataPlatform:lcr"
ENV = "PROD"
AUDIT_STAMP = {"time": 0, "actor": "urn:li:corpuser:datahub"}


# ---------------------------------------------------------------------------
# Type resolution: Morphir type expr → DataHub SchemaField
# ---------------------------------------------------------------------------

def _resolve_type(tpe: list, nullable: bool = False) -> tuple:
    """Return (nativeType, datahubTypeTag, isNullable, description)."""
    kind = tpe[0]

    if kind == "Maybe":
        inner = tpe[2][0] if isinstance(tpe[2], list) else tpe[2]
        native, tag, _, desc = _resolve_type(inner, nullable=True)
        return native, tag, True, desc

    if kind == "Reference":
        ref_path = tpe[2]             # [[pkgPath], [modPath...], [localName]]
        if len(ref_path) >= 3:
            local = "".join(ref_path[2])
            mod   = "".join(w for part in ref_path[1] for w in part)
        else:
            local = str(ref_path)
            mod   = ""

        # Morphir SDK primitives
        if mod in ("string", "sdk.string"):
            return "String", "StringType", nullable, ""
        if mod in ("basics", "sdk.basics"):
            if local in ("float", "int"):
                return local.capitalize(), "NumberType", nullable, ""
            if local == "bool":
                return "Boolean", "BooleanType", nullable, ""
        if mod == "sdk.maybe":
            return "String", "StringType", True, ""

        # Domain type — use the local name
        return _human(ref_path[2] if len(ref_path) >= 3 else [local]), "StringType", nullable, ""

    if kind == "Unit":
        return "Unit", "NullType", nullable, ""

    return kind, "StringType", nullable, ""


def _field_type_class(tag: str):
    return NumberTypeClass() if tag == "NumberType" else StringTypeClass()


# ---------------------------------------------------------------------------
# Extract schema fields from a Record TypeAlias
# ---------------------------------------------------------------------------

def _extract_fields(record_expr: list) -> list:
    """Parse a ['Record', {}, [{name, tpe}, ...]] into DataHub SchemaFieldClass objects."""
    if record_expr[0] != "Record":
        return []

    fields = []
    for field in record_expr[2]:
        fname_parts = field["name"]
        tpe = field["tpe"]

        fname_camel = _camel(fname_parts)
        native, tag, nullable, _ = _resolve_type(tpe)

        glossary_terms = GlossaryTermsClass(
            terms=[GlossaryTermAssociationClass(urn=_lcr_term_urn(fname_parts))],
            auditStamp=AuditStampClass(time=0, actor="urn:li:corpuser:datahub"),
        )

        fields.append(SchemaFieldClass(
            fieldPath=fname_camel,
            type=SchemaFieldDataTypeClass(type=_field_type_class(tag)),
            nativeDataType=native,
            nullable=nullable,
            description=f"FR 2052A field: {_human(fname_parts)}",
            isPartOfKey=False,
            recursive=False,
            glossaryTerms=glossary_terms,
        ))


    return fields


# ---------------------------------------------------------------------------
# Build DataHub MCPs for a single table
# ---------------------------------------------------------------------------

def _dataset_urn(table_id: str) -> str:
    return f"urn:li:dataset:({PLATFORM_URN},{table_id},{ENV})"


def _table_mcps(mod_flat: str, section: str, table_name: str,
                record_expr: list, custom_types: dict, domain_urn: str = "") -> list:
    table_id    = f"fr2052a.{section.lower()}.{table_name.lower().replace(' ', '_')}"
    dataset_urn = _dataset_urn(table_id)
    display_name = f"FR 2052A — {section} — {table_name}"

    fields = _extract_fields(record_expr)

    enum_notes = []
    for tname, variants in custom_types.items():
        values = ", ".join(_pascal(v) for v in variants[:10])
        suffix = f" (+{len(variants)-10} more)" if len(variants) > 10 else ""
        enum_notes.append(f"**{_pascal(tname)}**: {values}{suffix}")

    description = (
        f"Logical model for the FR 2052A {section} — {table_name} data table, "
        f"derived from the Morphir/Elm LCR reference implementation.\n\n"
        + ("\n".join(enum_notes) if enum_notes else "")
    ).strip()

    return [
        MetadataChangeProposalWrapper(entityUrn=dataset_urn,
            aspect=DatasetPropertiesClass(
                name=display_name,
                description=description,
                externalUrl="https://github.com/acryldata/open-reg-tech-us-lcr",
                customProperties={"section": section, "table": table_name,
                                  "morphir_module": mod_flat, "source": "morphir-ir.json"},
            )),
        MetadataChangeProposalWrapper(entityUrn=dataset_urn,
            aspect=SubTypesClass(typeNames=["Logical Model"])),
        MetadataChangeProposalWrapper(entityUrn=dataset_urn,
            aspect=DataPlatformInstanceClass(platform=PLATFORM_URN)),
        MetadataChangeProposalWrapper(entityUrn=dataset_urn,
            aspect=SchemaMetadataClass(
                schemaName=table_id,
                platform=PLATFORM_URN,
                version=0,
                hash="",
                platformSchema=OtherSchemaClass(rawSchema=""),
                fields=fields,
            )),
        MetadataChangeProposalWrapper(entityUrn=dataset_urn,
            aspect=StatusClass(removed=False)),
        *(
            [MetadataChangeProposalWrapper(entityUrn=dataset_urn,
                aspect=DomainsClass(domains=[domain_urn]))]
            if domain_urn else []
        ),
    ]


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--ir",     default="morphir-ir.json")
    parser.add_argument("--server", default="http://localhost:8080")
    parser.add_argument("--token",  default="")
    parser.add_argument("--domain", default="",
                        help="DataHub domain URN to tag each dataset (omit to skip domain aspect)")
    args = parser.parse_args()

    ir = json.loads(Path(args.ir).read_text())
    modules = ir["distribution"][3]["modules"]

    emitter = DatahubRestEmitter(gms_server=args.server, token=args.token or None)

    total_mcps = 0
    found = []

    for mod_path, mod_body in modules:
        flat = _path_str(mod_path)
        if flat not in TABLE_MODULES:
            continue

        section, table_name = TABLE_MODULES[flat]
        found.append(flat)
        types = mod_body["value"]["types"]

        record_expr = None
        custom_types = {}

        for tname, tbody in types:
            defn = tbody["value"]["value"]
            if defn[0] == "TypeAliasDefinition":
                te = defn[2]
                if te[0] == "Record":
                    record_expr = te
            elif defn[0] == "CustomTypeDefinition":
                ctor_list = defn[2].get("value", [])
                custom_types[tuple(tname)] = [c[0] for c in ctor_list]

        if record_expr is None:
            print(f"  SKIP {flat}: no Record alias found")
            continue

        mcps = _table_mcps(flat, section, table_name, record_expr, custom_types, domain_urn=args.domain)
        for mcp in mcps:
            emitter.emit(mcp)
        total_mcps += len(mcps)
        print(f"  OK   {flat} → {len(_extract_fields(record_expr))} fields emitted")

    missing = set(TABLE_MODULES) - set(found)
    if missing:
        print(f"\nWARNING: modules not found in IR: {missing}")

    print(f"\nEmitted {total_mcps} MCPs for {len(found)} tables to {args.server}")


if __name__ == "__main__":
    main()
