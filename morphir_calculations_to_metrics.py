#!/usr/bin/env python3
"""
morphir_calculations_to_metrics.py — Fiction Bank / open-reg-tech-us-lcr

Reads morphir-ir.json and generates a YAML file describing DataHub Metric
entities for the calculations in src/Regulation/US/LCR/Calculations.elm --
the "Metrics (and associated lineage), and the relationships between them"
half of the Morphir-IR-driven pipeline (the Glossary Terms half is
morphir_fields_to_glossary.py).

DataHub has no native YAML+CLI spec for the Metric entity (unlike
dataproduct/structured-properties/business-glossary), so this generates a
small custom YAML schema of our own, loaded by load_lcr_metrics.py via
DataHub's OpenAPI v2 entity API.

What's fully automated from the IR:
  - Discovery: every value in the Calculations module whose output type is
    Balance/Float (a numeric result) and takes at least one argument becomes
    a candidate metric -- excludes pure constants (t0) and non-numeric
    lookups.
  - Description: each metric's Elm doc comment, when present.
  - Metric-to-metric relationships (metricRelationships.derivedFrom): a real
    call-graph walk of each metric's Morphir Value body, collecting
    References to other candidate metrics in the SAME module.
  - Dataset lineage (metricUpstreams): detected structurally, by checking
    whether a metric's transitive same-module call closure references
    us.lcr.hqlaamountvalues (-> the HQLA assets table) or
    us.fr2052a.datatables / us.lcr.aggregatedrulebalances / us.lcr.rules
    (-> the outflow/inflow schedule tables). This is a real property of the
    reference graph, not a per-metric hardcoded list.

What's still curated (small, explicit, documented below -- genuinely not
derivable from the IR without also deeply parsing the HQLAAmountValues /
AggregatedRuleBalances modules' own field-level logic):
  - EXTERNAL_MODULE_TABLES: which FR 2052a physical tables a referenced
    external module implies.
  - GLOSSARY_TERM_LINKS: which of the 4 already-existing lcr-terms.ttl
    business concepts (LiquidityCoverageRatio, HQLAStock, NetCashOutflow,
    MaturityMismatchAddOn) each metric corresponds to. Per DataHub's own
    Metric model, a metric without a mapped business term simply carries no
    glossaryTerms association and relies on metricInfo.description instead
    -- not every metric needs one.

Usage:
    python morphir_calculations_to_metrics.py [--ir morphir-ir.json] [--out generated/lcr-calculations-metrics.yml]
"""

import argparse
import json
from pathlib import Path

import yaml

MODULE_FLAT = "us.lcr.calculations"
GLOSSARY_PREFIX = "regulation.lcr"

# Curated: external module -> FR 2052a dataset(s) it implies a metric reads.
# (See module docstring -- this is the one piece of physical-structure
# knowledge not mechanically derivable from Calculations.elm's own IR without
# also parsing HQLAAmountValues/AggregatedRuleBalances/Rules in depth.)
EXTERNAL_MODULE_TABLES = {
    "us.lcr.hqlaamountvalues": ["fr2052a.inflows.assets"],
    "us.fr2052a.datatables": [
        "fr2052a.outflows.deposits", "fr2052a.outflows.secured",
        "fr2052a.outflows.wholesale", "fr2052a.outflows.other",
        "fr2052a.inflows.secured", "fr2052a.inflows.unsecured", "fr2052a.inflows.other",
    ],
    "us.lcr.aggregatedrulebalances": [
        "fr2052a.outflows.deposits", "fr2052a.outflows.secured",
        "fr2052a.outflows.wholesale", "fr2052a.outflows.other",
        "fr2052a.inflows.secured", "fr2052a.inflows.unsecured", "fr2052a.inflows.other",
    ],
    "us.lcr.rules": [
        "fr2052a.outflows.deposits", "fr2052a.outflows.secured",
        "fr2052a.outflows.wholesale", "fr2052a.outflows.other",
        "fr2052a.inflows.secured", "fr2052a.inflows.unsecured", "fr2052a.inflows.other",
    ],
}

# Curated: metric name-tuple -> existing lcr-terms.ttl local term name.
GLOSSARY_TERM_LINKS = {
    ("lcr",): "LiquidityCoverageRatio",
    ("hqla", "amount"): "HQLAStock",
    ("total", "net", "cash", "outflows"): "NetCashOutflow",
    ("maturity", "mismatch", "add", "on"): "MaturityMismatchAddOn",
}

NUMERIC_OUTPUT_TYPES = {"balance", "float"}

# morphir-sdk operators recognized by the expression renderer below, keyed by
# "<module>.<localName>" (see _sdk_key). Anything not in these maps still
# renders -- as a generic function call using its humanized name -- so the
# renderer never fails on an unrecognized reference, it just gets less pretty.
SDK_BINARY_OPS = {
    "basics.add": "+", "basics.subtract": "-",
    "basics.multiply": "*", "basics.divide": "/",
}
SDK_FUNC_NAMES = {
    "basics.max": "max", "basics.min": "min",
    "list.sum": "sum", "list.maximum": "maximum", "list.range": "range",
}
SDK_NEGATE = "basics.negate"
SDK_IDENTITY_CASTS = {"basics.float", "basics.int"}  # numeric casts: unwrap to the inner arg

MAX_EXPR_LEN = 400


def _flat_path(mod_path: list) -> str:
    return ".".join("".join(p) for p in mod_path)


def _merge_acronyms(parts) -> list:
    """Morphir splits camelCase runs of capitals into single-letter parts
    (e.g. HQLA -> ['h','q','l','a']). Re-merge consecutive 1-char parts into
    one (word, is_acronym) pair so names render as 'HQLA' rather than
    'H Q L A'."""
    merged = []
    buf = []
    for p in parts:
        if len(p) == 1 and p.isalpha():
            buf.append(p)
        else:
            if buf:
                merged.append(("".join(buf), True))
                buf = []
            merged.append((p, False))
    if buf:
        merged.append(("".join(buf), True))
    return merged


def _pascal(parts) -> str:
    return "".join(w.upper() if is_acr else w.capitalize() for w, is_acr in _merge_acronyms(parts))


def _human(parts) -> str:
    return " ".join(w.upper() if is_acr else w.capitalize() for w, is_acr in _merge_acronyms(parts))


def _find_refs(node, acc: list) -> None:
    if isinstance(node, list):
        if len(node) >= 3 and node[0] == "Reference":
            acc.append(node[2])
        for item in node:
            _find_refs(item, acc)
    elif isinstance(node, dict):
        for v in node.values():
            _find_refs(v, acc)


def _output_local_type(value_def: dict):
    out = value_def.get("outputType")
    if out and out[0] == "Reference":
        ref = out[2]
        return "".join(ref[2]) if len(ref) >= 3 else None
    return out[0] if out else None


def _camel(parts) -> str:
    """Like _pascal but lowercases the leading word -- for parameter/field
    names in rendered expressions, to read as Elm identifiers rather than
    the Pascal-cased metric/type names."""
    merged = _merge_acronyms(parts)
    out = []
    for i, (w, is_acr) in enumerate(merged):
        if is_acr:
            out.append(w.upper())
        elif i == 0:
            out.append(w)
        else:
            out.append(w.capitalize())
    return "".join(out)


def _sdk_key(ref) -> str:
    """'<module>.<localName>' for a Reference's fully-qualified name, e.g.
    ["basics", "add"] -> "basics.add". Only meaningful for morphir-sdk refs
    (short, undotted module paths); regulation-module refs always flatten to
    multi-segment paths like 'us.lcr.basics', so there's no collision risk."""
    return f"{_flat_path(ref[1])}.{''.join(ref[2])}"


def _unwind_apply(node):
    """Collapse a curried Apply chain -- Apply(Apply(Apply(f,a),b),c) -- into
    (f, [a, b, c])."""
    args = []
    while isinstance(node, list) and node[0] == "Apply":
        args.insert(0, node[3])
        node = node[2]
    return node, args


def _render_pattern(node) -> str:
    if not isinstance(node, list) or not node:
        return "_"
    tag = node[0]
    if tag == "WildcardPattern":
        return "_"
    if tag == "AsPattern":
        return _camel(tuple(node[3]))
    if tag == "ConstructorPattern":
        ctor_fq, sub_patterns = node[2], node[3]
        ctor_name = "".join(ctor_fq[2]).capitalize() if len(ctor_fq) >= 3 else "?"
        if not sub_patterns:
            return ctor_name
        return f"{ctor_name}({', '.join(_render_pattern(p) for p in sub_patterns)})"
    return "_"


def _render_expr(node, candidates) -> str:
    """Best-effort pretty-printer for a Morphir Value body -- renders the
    Elm-level formula (operators, function calls, field access, case/let) as
    readable pseudo-code. This is NOT SQL -- the source calculations are Elm,
    not a query language, so fabricating a fake ANSI_SQL/Snowflake dialect
    string here would be the same anti-pattern ADR-0004 fixed elsewhere
    (asserting an identity the data doesn't actually have). Loaded under
    dialect OTHER in load_lcr_metrics.py instead."""
    if not isinstance(node, list) or not node:
        return "?"
    tag = node[0]

    if tag == "Apply":
        head, args = _unwind_apply(node)
        rendered_args = [_render_expr(a, candidates) for a in args]
        if isinstance(head, list) and head and head[0] == "Reference":
            ref = head[2]
            mod_flat = _flat_path(ref[1])
            local = tuple(ref[2])
            key = f"{mod_flat}.{''.join(local)}"
            if key in SDK_BINARY_OPS and len(rendered_args) == 2:
                return f"({rendered_args[0]} {SDK_BINARY_OPS[key]} {rendered_args[1]})"
            if key == SDK_NEGATE and len(rendered_args) == 1:
                return f"(-{rendered_args[0]})"
            if key in SDK_FUNC_NAMES:
                return f"{SDK_FUNC_NAMES[key]}({', '.join(rendered_args)})"
            if key in SDK_IDENTITY_CASTS:
                return rendered_args[0] if rendered_args else "?"
            if key == "list.map" and len(rendered_args) == 2:
                return f"map({rendered_args[0]}, {rendered_args[1]})"
            name = _pascal(local)
            return f"{name}({', '.join(rendered_args)})" if rendered_args else name
        head_str = _render_expr(head, candidates)
        return f"{head_str}({', '.join(rendered_args)})" if rendered_args else head_str

    if tag == "Reference":
        ref = node[2]
        local = tuple(ref[2])
        return _pascal(local)

    if tag == "Variable":
        return _camel(tuple(node[2]))

    if tag == "Literal":
        return str(node[2][1])

    if tag == "Field":
        return f"{_render_expr(node[2], candidates)}.{_camel(tuple(node[3]))}"

    if tag == "List":
        items = [_render_expr(i, candidates) for i in node[2]]
        if len(items) > 5:
            return "[" + ", ".join(items[:5]) + ", ...]"
        return "[" + ", ".join(items) + "]"

    if tag == "Lambda":
        return f"({_render_pattern(node[2])} -> {_render_expr(node[3], candidates)})"

    if tag == "LetDefinition":
        var_name = _camel(tuple(node[2]))
        val_body = (node[3] or {}).get("body")
        val_str = _render_expr(val_body, candidates) if val_body is not None else "?"
        return f"let {var_name} = {val_str} in {_render_expr(node[4], candidates)}"

    if tag == "PatternMatch":
        subj_str = _render_expr(node[2], candidates)
        cases = node[3]
        case_strs = [f"{_render_pattern(p)} -> {_render_expr(e, candidates)}" for p, e in cases[:4]]
        more = "" if len(cases) <= 4 else f"; ... ({len(cases) - 4} more)"
        return f"case {subj_str} of {'; '.join(case_strs)}{more}"

    return "…"


def _render_expr_truncated(node, candidates) -> str:
    text = _render_expr(node, candidates)
    if len(text) > MAX_EXPR_LEN:
        return text[:MAX_EXPR_LEN] + " ..."
    return text


def build_metrics(ir: dict) -> list:
    modules = ir["distribution"][3]["modules"]
    calc_mod = next(
        mb for mp, mb in modules if _flat_path(mp) == MODULE_FLAT
    )
    values = {tuple(name): body for name, body in calc_mod["value"]["values"]}

    # 1. Discover candidate metrics by type signature.
    candidates = {}
    for name, vbody in values.items():
        vdef = vbody["value"]["value"]
        out_local = _output_local_type(vdef)
        if out_local in NUMERIC_OUTPUT_TYPES and len(vdef.get("inputTypes", [])) >= 1:
            candidates[name] = vbody

    # 2. Same-module call graph + external module reference set, per metric.
    same_module_calls = {}
    external_modules = {}
    for name, vbody in candidates.items():
        body = vbody["value"]["value"].get("body", [])
        refs = []
        _find_refs(body, refs)
        same_calls = set()
        ext_mods = set()
        for r in refs:
            if len(r) < 3:
                continue
            mod_flat = _flat_path(r[1])
            local = tuple(r[2])
            if mod_flat == MODULE_FLAT and local in candidates and local != name:
                same_calls.add(local)
            elif mod_flat != MODULE_FLAT and mod_flat in EXTERNAL_MODULE_TABLES:
                ext_mods.add(mod_flat)
        same_module_calls[name] = same_calls
        external_modules[name] = ext_mods

    # 3. Transitive closure of external-module touches (through same-module calls).
    def transitive_external(name, seen=None):
        seen = seen or set()
        if name in seen:
            return set()
        seen.add(name)
        result = set(external_modules.get(name, set()))
        for dep in same_module_calls.get(name, set()):
            result |= transitive_external(dep, seen)
        return result

    # 4. Build metric records.
    metrics = []
    for name, vbody in sorted(candidates.items()):
        doc = (vbody["value"].get("doc") or "").strip()
        pascal_name = _pascal(name)
        snake_id = "_".join(name)

        derived_from = sorted("_".join(d) for d in same_module_calls[name])

        ext_touch = transitive_external(name)
        dataset_upstreams = []
        if not derived_from:
            # Only leaf-ish metrics (no metric-to-metric derivation captured)
            # get direct dataset lineage -- matches DataHub's own guidance:
            # a metric composed from other metrics shouldn't ALSO shortcut
            # straight to the underlying datasets.
            seen_tables = set()
            for mod in ext_touch:
                for t in EXTERNAL_MODULE_TABLES[mod]:
                    seen_tables.add(t)
            dataset_upstreams = sorted(seen_tables)

        glossary_term = GLOSSARY_TERM_LINKS.get(name)
        expression = _render_expr_truncated(vbody["value"]["value"].get("body"), candidates)

        metrics.append({
            "id": snake_id,
            "name": pascal_name,
            "description": doc or f"LCR calculation: {_human(name)}",
            "glossary_term": glossary_term,
            "derived_from": derived_from,
            "dataset_upstreams": dataset_upstreams,
            "expression": expression,
        })

    return metrics


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--ir", default="morphir-ir.json", type=Path)
    parser.add_argument("--out", default="generated/lcr-calculations-metrics.yml", type=Path)
    args = parser.parse_args()

    ir = json.loads(args.ir.read_text())
    metrics = build_metrics(ir)

    args.out.parent.mkdir(parents=True, exist_ok=True)
    with args.out.open("w") as f:
        f.write("# GENERATED FILE -- DO NOT HAND-EDIT.\n")
        f.write("# Regenerate with: python morphir_calculations_to_metrics.py\n")
        f.write("# Source of truth: src/Regulation/US/LCR/Calculations.elm (via morphir-ir.json)\n")
        f.write("# Load into DataHub with: python load_lcr_metrics.py\n")
        yaml.safe_dump({"metrics": metrics}, f, sort_keys=False, width=100)

    with_terms = sum(1 for m in metrics if m["glossary_term"])
    with_derived = sum(1 for m in metrics if m["derived_from"])
    with_upstreams = sum(1 for m in metrics if m["dataset_upstreams"])
    print(f"Wrote {args.out}")
    print(f"  {len(metrics)} metrics discovered")
    print(f"  {with_terms} linked to a glossary term")
    print(f"  {with_derived} with metric-to-metric derivedFrom")
    print(f"  {with_upstreams} with dataset-level metricUpstreams")


if __name__ == "__main__":
    main()
