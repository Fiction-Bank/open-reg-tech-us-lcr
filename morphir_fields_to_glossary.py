#!/usr/bin/env python3
"""
morphir_fields_to_glossary.py — Fiction Bank / open-reg-tech-us-lcr

Reads morphir-ir.json and generates a DataHub business-glossary YAML file
(DataHub's native `datahub-business-glossary` ingestion source format) for
every field defined under src/Regulation/US/FR2052A/Fields/*.elm.

This is the "official" architecture per the FDO team: the Morphir IR is the
single source of truth for FR 2052a field definitions -- including their
type info (enums / named constant codes, e.g. CollateralClass's ~90 asset
codes) -- and DataHub glossary content is *generated* from it, not
hand-authored, so it can never drift from the actual regulatory model.

Generated output: generated/fr2052a-fields-glossary.yml
DO NOT HAND-EDIT that file -- re-run this script after `npm run morphir-elm-make`
recompiles morphir-ir.json, then load it with:
    datahub ingest -c ingestion/fr2052a-fields-glossary-recipe.yml

Term URNs are pinned (via each term's `id:`) to urn:li:glossaryTerm:regulation.lcr.<snake_case_name>
so they exactly match what morphir_to_datahub.py already tags the 13 FR 2052a
data table schema fields with -- this script is what actually DEFINES those
terms; morphir_to_datahub.py only references them.

Usage:
    python morphir_fields_to_glossary.py [--ir morphir-ir.json] [--out generated/fr2052a-fields-glossary.yml]
"""

import argparse
import json
from pathlib import Path

import yaml

FIELDS_PREFIX = "us.fr2052a.fields."
GLOSSARY_PREFIX = "regulation.lcr"
TOP_NODE_NAME = "FR2052AFields"


def _flat_path(mod_path: list) -> str:
    return ".".join("".join(p) for p in mod_path)


def _snake(parts: list) -> str:
    return "_".join(parts)


def _pascal(parts: list) -> str:
    return "".join(w.capitalize() for w in parts)


def _human(parts: list) -> str:
    return " ".join(w.capitalize() for w in parts)


def _term_urn(local: str) -> str:
    return f"urn:li:glossaryTerm:{GLOSSARY_PREFIX}.{local}"


def _native_type_of(type_expr: list) -> str:
    if type_expr[0] == "Reference":
        ref = type_expr[2]
        local = ref[2] if len(ref) >= 3 else []
        mod_parts = ref[1] if len(ref) >= 2 else []
        mod_flat = "".join(w for part in mod_parts for w in part) if mod_parts else ""
        if mod_flat in ("string", "sdk.string"):
            return "String"
        if mod_flat in ("basics", "sdk.basics"):
            if local and local[0] in ("float", "int"):
                return local[0].capitalize()
            if local and local[0] == "bool":
                return "Boolean"
        return _pascal(local) if local else "Unknown"
    if type_expr[0] == "Unit":
        return "Unit"
    return type_expr[0]


def _literal_value(body: list):
    if not body or body[0] != "Literal":
        return None
    lit = body[2]
    if lit[0] in ("StringLiteral", "IntLiteral", "FloatLiteral", "BoolLiteral", "CharLiteral"):
        return lit[1]
    return None


def build_glossary(ir: dict) -> dict:
    modules = ir["distribution"][3]["modules"]
    field_mods = [
        (mp, mb) for mp, mb in modules if _flat_path(mp).startswith(FIELDS_PREFIX)
    ]

    top_terms = []
    value_nodes = []
    seen_pascal_names = set()

    def _unique_pascal(parts: list) -> str:
        name = _pascal(parts)
        if name in seen_pascal_names:
            name = name + "_" + _snake(parts)
        seen_pascal_names.add(name)
        return name

    for mod_path, mod_body in sorted(field_mods, key=lambda x: _flat_path(x[0])):
        flat = _flat_path(mod_path)
        mod_name_parts = list(mod_path[-1])
        mod_key = "".join(mod_name_parts)
        mod_doc = (mod_body["value"].get("doc") or "").strip()
        types = mod_body["value"]["types"]
        values = mod_body["value"]["values"]

        primary_type = None  # ("alias", native_type, doc) or ("enum", [ctor_parts...], doc)
        secondary_enums = []  # [(tname_parts, [ctor_parts...], doc), ...]

        for tname, tbody in types:
            defn = tbody["value"]["value"]
            is_primary = "".join(tname) == mod_key
            tdoc = tbody["value"].get("doc", "")
            if defn[0] == "TypeAliasDefinition":
                if is_primary:
                    primary_type = ("alias", _native_type_of(defn[2]), tdoc)
            elif defn[0] == "CustomTypeDefinition":
                ctors = [c[0] for c in defn[2].get("value", [])]
                if is_primary:
                    primary_type = ("enum", ctors, tdoc)
                else:
                    secondary_enums.append((list(tname), ctors, tdoc))

        if primary_type is None:
            print(f"  SKIP {flat}: no primary type matching module name found")
            continue

        field_human_name = _human(mod_name_parts)
        field_pascal_name = _unique_pascal(mod_name_parts)
        term_urn_local = _snake(mod_name_parts)

        const_values = []
        for vname, vbody in values:
            vdefn = vbody["value"]["value"]
            if vdefn.get("inputTypes"):
                continue  # function, not a named constant
            lit = _literal_value(vdefn.get("body", []))
            if lit is None:
                continue
            vdoc = (vbody["value"].get("doc") or "").strip()
            const_values.append((list(vname), lit, vdoc))

        kind, detail, ptype_doc = primary_type
        description = mod_doc or ptype_doc or f"FR 2052a field: {field_human_name}"

        term = {
            "id": _term_urn(term_urn_local),
            "name": field_human_name,
            "description": description,
            "custom_properties": {
                "morphir_module": flat,
                "native_type": detail if kind == "alias" else "Enum",
            },
        }

        value_refs = []
        value_node_terms = []

        if kind == "enum":
            for ctor_parts in detail:
                ctor_name = _unique_pascal(ctor_parts)
                value_node_terms.append({
                    "id": _term_urn(f"{term_urn_local}.{_snake(ctor_parts)}"),
                    "name": ctor_name,
                    "description": _human(ctor_parts),
                })
                value_refs.append(f"{TOP_NODE_NAME}.{field_pascal_name}Values.{ctor_name}")

        for vname, lit, vdoc in const_values:
            vname_pascal = _unique_pascal(vname)
            value_node_terms.append({
                "id": _term_urn(f"{term_urn_local}.{_snake(vname)}"),
                "name": vname_pascal,
                "description": vdoc or str(lit),
                "custom_properties": {"code": str(lit)},
            })
            value_refs.append(f"{TOP_NODE_NAME}.{field_pascal_name}Values.{vname_pascal}")

        if value_refs:
            term["values"] = value_refs
            value_nodes.append({
                "name": f"{field_pascal_name}Values",
                "description": f"Named values of {field_human_name}.",
                "terms": value_node_terms,
            })

        top_terms.append(term)

        for tname_parts, ctors, tdoc in secondary_enums:
            sec_pascal = _unique_pascal(tname_parts)
            sec_key = _snake(tname_parts)
            sec_term = {
                "id": _term_urn(sec_key),
                "name": sec_pascal,
                "description": (tdoc or f"Related classification used by {field_human_name}").strip(),
                "custom_properties": {
                    "morphir_module": flat,
                    "native_type": "Enum",
                    "related_field": field_pascal_name,
                },
            }
            ctor_refs = []
            ctor_terms = []
            for ctor_parts in ctors:
                ctor_name = _unique_pascal(ctor_parts)
                ctor_terms.append({
                    "id": _term_urn(f"{sec_key}.{_snake(ctor_parts)}"),
                    "name": ctor_name,
                    "description": _human(ctor_parts),
                })
                ctor_refs.append(f"{TOP_NODE_NAME}.{sec_pascal}Values.{ctor_name}")
            sec_term["values"] = ctor_refs
            value_nodes.append({
                "name": f"{sec_pascal}Values",
                "description": f"Named values of {sec_pascal}.",
                "terms": ctor_terms,
            })
            top_terms.append(sec_term)

    return {
        "version": "1",
        "source": (
            "Generated from morphir-ir.json (src/Regulation/US/FR2052A/Fields/*.elm) "
            "by morphir_fields_to_glossary.py -- DO NOT HAND-EDIT this file."
        ),
        "owners": {"groups": ["Regulatory Reporting Technology"]},
        "url": "https://github.com/Fiction-Bank/open-reg-tech-us-lcr",
        "nodes": [
            {
                "name": TOP_NODE_NAME,
                "id": "urn:li:glossaryNode:regulation.lcr.fields",
                "description": (
                    "FR 2052a field-level definitions, generated from the Morphir IR "
                    "(src/Regulation/US/FR2052A/Fields/*.elm)."
                ),
                "terms": top_terms,
                "nodes": value_nodes,
            }
        ],
    }


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--ir", default="morphir-ir.json", type=Path)
    parser.add_argument("--out", default="generated/fr2052a-fields-glossary.yml", type=Path)
    args = parser.parse_args()

    ir = json.loads(args.ir.read_text())
    glossary = build_glossary(ir)

    args.out.parent.mkdir(parents=True, exist_ok=True)
    with args.out.open("w") as f:
        f.write("# GENERATED FILE -- DO NOT HAND-EDIT.\n")
        f.write("# Regenerate with: python morphir_fields_to_glossary.py\n")
        f.write("# Source of truth: src/Regulation/US/FR2052A/Fields/*.elm (via morphir-ir.json)\n")
        yaml.safe_dump(glossary, f, sort_keys=False, width=100, allow_unicode=True)

    top_terms = glossary["nodes"][0]["terms"]
    value_node_count = sum(len(n["terms"]) for n in glossary["nodes"][0]["nodes"])
    print(f"Wrote {args.out}")
    print(f"  {len(top_terms)} field-level terms")
    print(f"  {value_node_count} enum/constant value terms across {len(glossary['nodes'][0]['nodes'])} value groups")


if __name__ == "__main__":
    main()
