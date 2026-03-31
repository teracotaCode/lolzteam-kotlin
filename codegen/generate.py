#!/usr/bin/env python3
"""Code generator for Lolzteam API Kotlin SDK from OpenAPI 3.1 JSON schemas.

Generates:
  - Response model data classes (@Serializable, all fields nullable with defaults)
  - Enum classes with @Serializable
  - Client class with API groups using Ktor

Usage:
    python generate.py --schema <path> --output-dir <dir> --package <name>
"""

import argparse
import json
import os
import re
import sys
import textwrap
from collections import defaultdict
from typing import Any, Dict, List, Optional, Set, Tuple


# ── Naming Helpers ──────────────────────────────────────────────────────────

def to_pascal_case(s: str) -> str:
    """Convert string to PascalCase."""
    # Remove array notation
    s = re.sub(r'\[\]', '', s)
    # Handle dots (e.g., OAuth.Token -> OAuthToken)
    s = s.replace('.', '_')
    # Remove any non-alphanumeric except separators
    s = re.sub(r'[^a-zA-Z0-9_\-\s]', '', s)
    # Handle hyphens, spaces, underscores
    parts = re.split(r'[\-_\s]+', s)
    result = ''.join(p[0].upper() + p[1:] if p else '' for p in parts)
    # Ensure starts with a letter
    if result and not result[0].isalpha():
        result = 'V' + result
    return result


def to_camel_case(s: str) -> str:
    """Convert string to camelCase."""
    pascal = to_pascal_case(s)
    if not pascal:
        return pascal
    return pascal[0].lower() + pascal[1:]


def to_snake_case(s: str) -> str:
    """Convert string to snake_case."""
    s = re.sub(r'([A-Z]+)([A-Z][a-z])', r'\1_\2', s)
    s = re.sub(r'([a-z\d])([A-Z])', r'\1_\2', s)
    return s.replace('-', '_').replace(' ', '_').replace('.', '_').lower()


def sanitize_kotlin_name(name: str) -> str:
    """Make a string safe as a Kotlin identifier."""
    # Remove [] from parameter names like tag_id[]
    name = re.sub(r'\[\]', '', name)
    result = re.sub(r'[^a-zA-Z0-9_]', '_', name)
    if result and result[0].isdigit():
        result = '_' + result
    # Kotlin keywords
    keywords = {'val', 'var', 'fun', 'class', 'object', 'when', 'is', 'in',
                'as', 'if', 'else', 'for', 'while', 'do', 'return', 'break',
                'continue', 'throw', 'try', 'catch', 'finally', 'null', 'true',
                'false', 'this', 'super', 'package', 'import', 'typealias',
                'typeof', 'interface', 'abstract', 'override', 'open', 'internal',
                'private', 'protected', 'public', 'out', 'type'}
    if result in keywords:
        result = '`' + result + '`'
    return result


def sanitize_enum_entry(val_: str) -> str:
    """Make a string safe as a Kotlin enum constant."""
    s = str(val_)
    # Handle negative numbers specifically
    if re.match(r'^-\d', s):
        s = 'NEG_' + s[1:]
    s = s.upper().replace('-', '_').replace(' ', '_').replace('.', '_')
    s = re.sub(r'[^A-Z0-9_]', '_', s)
    if s and s[0].isdigit():
        s = 'V_' + s
    if not s:
        s = 'UNKNOWN'
    return s


# ── Schema Processing ───────────────────────────────────────────────────────

# API type mismatch overrides — real API returns different types than spec
# The Lolzteam API (PHP-based) frequently returns types that differ from the spec.
# These overrides force specific fields to use flexible types that can handle
# the actual API responses without deserialization failures.
FIELD_TYPE_OVERRIDES = {
    # float/double mismatches
    'priceWithSellerFee': 'Double',
    'roblox_credit_balance': 'Double',
    # Fields that can be dict or list (PHP arrays serialize unpredictably)
    'thread_tags': 'kotlinx.serialization.json.JsonElement',
    'Skin': 'kotlinx.serialization.json.JsonElement',
    'WeaponSkins': 'kotlinx.serialization.json.JsonElement',
    'supercellBrawlers': 'kotlinx.serialization.json.JsonElement',
    'r6Skins': 'kotlinx.serialization.json.JsonElement',
    'tags': 'kotlinx.serialization.json.JsonElement',
    'values': 'kotlinx.serialization.json.JsonElement',
    # Fields where spec type is completely wrong vs actual API
    'discord_nitro_type': 'kotlinx.serialization.json.JsonElement',
    'instagram_id': 'kotlinx.serialization.json.JsonElement',
    'socialclub_games': 'kotlinx.serialization.json.JsonElement',
    'steam_bans': 'kotlinx.serialization.json.JsonElement',
    'guarantee': 'kotlinx.serialization.json.JsonElement',
    'cs2PremierElo': 'kotlinx.serialization.json.JsonElement',
    'base_params': 'kotlinx.serialization.json.JsonElement',
    # Already known flexible fields
    'feedback_data': 'kotlinx.serialization.json.JsonElement',
    'imap_data': 'kotlinx.serialization.json.JsonElement',
    'restore_data': 'kotlinx.serialization.json.JsonElement',
    'telegram_client': 'kotlinx.serialization.json.JsonElement',
    'backgrounds': 'kotlinx.serialization.json.JsonElement',
    'steam_full_games': 'kotlinx.serialization.json.JsonElement',
    # Schema says object but API returns array
    'fieldChoices': 'kotlinx.serialization.json.JsonElement',
    # API returns false when no price, number otherwise
    'autoBuyPrice': 'kotlinx.serialization.json.JsonElement',
    'autoBuyPriceCheckDate': 'kotlinx.serialization.json.JsonElement',
    # Schema says object but API returns array
    'lolInventory': 'kotlinx.serialization.json.JsonElement',
    # Schema says object but API returns array/string
    'calculator': 'kotlinx.serialization.json.JsonElement',
    'providers': 'kotlinx.serialization.json.JsonElement',
    'proxy': 'kotlinx.serialization.json.JsonElement',
    'valorantInventory': 'kotlinx.serialization.json.JsonElement',
}

def _all_keys_numeric(props: Dict[str, Any]) -> bool:
    """Check if ALL property keys in a schema are purely numeric.

    When an OpenAPI object schema has all-numeric keys (e.g. {"97491": ..., "193431": ...}),
    it's example data from a dynamic dictionary keyed by IDs, not a real schema.
    """
    if not props:
        return False
    return all(k.isdigit() for k in props.keys())


class SchemaProcessor:
    """Process OpenAPI schema into Kotlin types."""

    def __init__(self, spec: Dict[str, Any], package_name: str):
        self.spec = spec
        self.package_name = package_name
        self.models: Dict[str, str] = {}  # class_name -> kotlin code
        self.enums: Dict[str, str] = {}   # class_name -> kotlin code
        self.generated_names: Set[str] = set()
        self.inline_model_counter = 0
        # Dedup cache: signature -> existing class name
        self._model_sig_cache: Dict[str, str] = {}
        self._enum_sig_cache: Dict[str, str] = {}

    def _build_object_signature(self, schema: Dict[str, Any]) -> Optional[str]:
        """Build a content-based signature for an object schema for deduplication."""
        props = schema.get('properties', {})
        if not props:
            return None
        parts = []
        for pname in sorted(props.keys()):
            pschema = props[pname]
            # Use a simplified type signature
            ptype = self._schema_type_sig(pschema)
            parts.append(f"{pname}:{ptype}")
        return "obj:" + "|".join(parts)

    def _schema_type_sig(self, schema: Dict[str, Any]) -> str:
        """Get a simple type signature string for dedup purposes."""
        if '$ref' in schema:
            return f"ref:{schema['$ref']}"
        st = schema.get('type', 'any')
        if isinstance(st, list):
            st = '|'.join(sorted(st))
        if 'enum' in schema:
            return f"enum:{st}:{tuple(str(v) for v in schema['enum'])}"
        if st == 'array':
            items = schema.get('items', {})
            return f"array:{self._schema_type_sig(items)}"
        if st == 'object' and 'properties' in schema:
            inner = []
            for k in sorted(schema['properties'].keys()):
                inner.append(f"{k}:{self._schema_type_sig(schema['properties'][k])}")
            return "obj:" + "|".join(inner)
        return st

    def resolve_ref(self, ref: str) -> Dict[str, Any]:
        """Resolve a $ref pointer."""
        parts = ref.lstrip('#/').split('/')
        obj = self.spec
        for p in parts:
            obj = obj[p]
        return obj

    def resolve_schema(self, schema: Dict[str, Any]) -> Dict[str, Any]:
        """Resolve a schema, following $ref if present."""
        if '$ref' in schema:
            return self.resolve_ref(schema['$ref'])
        return schema

    def unique_name(self, base: str) -> str:
        """Generate a unique class name."""
        # Ensure name starts with a letter
        if base and (base[0].isdigit() or not base[0].isalpha()):
            base = 'Type' + base
        if not base:
            base = 'UnnamedType'
        name = base
        counter = 2
        while name in self.generated_names:
            name = f"{base}{counter}"
            counter += 1
        self.generated_names.add(name)
        return name

    def schema_to_kotlin_type(self, schema: Dict[str, Any], parent_name: str = "",
                                field_name: str = "") -> str:
        """Convert an OpenAPI schema to a Kotlin type string."""
        if '$ref' in schema:
            ref_schema = self.resolve_ref(schema['$ref'])
            ref_name = schema['$ref'].split('/')[-1]
            # For simple type refs (int, string without enum), inline the type
            ref_type = ref_schema.get('type', 'object')
            if isinstance(ref_type, list):
                ref_type_list = [t for t in ref_type if t != 'null']
                ref_type = ref_type_list[0] if ref_type_list else 'string'
            if ref_type in ('string', 'integer', 'number', 'boolean') and 'enum' not in ref_schema:
                return self.schema_to_kotlin_type(ref_schema, parent_name, field_name)
            # Process the referenced schema if not already done
            if ref_name not in self.generated_names:
                self.process_component_schema(ref_name, ref_schema)
            kt_name = to_pascal_case(ref_name)
            return kt_name

        # Handle oneOf/anyOf - use first type or JsonElement
        if 'oneOf' in schema or 'anyOf' in schema:
            variants = schema.get('oneOf') or schema.get('anyOf', [])
            if len(variants) == 1:
                return self.schema_to_kotlin_type(variants[0], parent_name, field_name)
            # If all are simple types, use the most general
            return "kotlinx.serialization.json.JsonElement"

        # Handle allOf - merge properties
        if 'allOf' in schema:
            merged = {}
            for sub in schema['allOf']:
                resolved = self.resolve_schema(sub)
                merged.update(resolved.get('properties', {}))
            if merged:
                schema = dict(schema)
                schema['properties'] = merged
                schema['type'] = 'object'

        schema_type = schema.get('type', 'object')

        # Handle type arrays like ["string", "integer"]
        if isinstance(schema_type, list):
            # Filter out 'null'
            non_null = [t for t in schema_type if t != 'null']
            if len(non_null) == 1:
                schema_type = non_null[0]
            else:
                return "kotlinx.serialization.json.JsonElement"

        # Enum handling
        if 'enum' in schema:
            enum_values = schema['enum']
            # Large enums (>50 entries) -> just use the base type for compiler sanity
            if len(enum_values) > 50:
                if schema_type in ('integer', 'number'):
                    return 'Int'
                return 'String'
            enum_vals = tuple(str(v) for v in enum_values)
            enum_sig = f"enum:{schema_type}:{enum_vals}"
            if enum_sig in self._enum_sig_cache:
                return self._enum_sig_cache[enum_sig]
            enum_name = to_pascal_case(field_name) if field_name else to_pascal_case(parent_name + "Value")
            enum_name = self.unique_name(enum_name)
            self.generate_enum(enum_name, enum_values, schema_type)
            self._enum_sig_cache[enum_sig] = enum_name
            return enum_name

        if schema_type == 'string':
            fmt = schema.get('format', '')
            if fmt == 'binary':
                return "ByteArray"
            return "String"
        elif schema_type == 'integer':
            fmt = schema.get('format', '')
            if fmt == 'int64':
                return "Long"
            # Use Long by default to avoid overflow with large IDs
            return "Long"
        elif schema_type == 'number':
            fmt = schema.get('format', '')
            if fmt == 'float':
                return "Float"
            return "Double"
        elif schema_type == 'boolean':
            return "Boolean"
        elif schema_type == 'array':
            items = schema.get('items', {})
            resolved_items = self.resolve_schema(items)
            # If array items are a dynamic-dict object (all-numeric keys),
            # the whole field should be JsonElement because PHP serializes
            # numeric-keyed arrays unpredictably as either JSON objects or arrays.
            if (resolved_items.get('type', 'object') == 'object'
                    and 'properties' in resolved_items
                    and _all_keys_numeric(resolved_items.get('properties', {}))):
                return "kotlinx.serialization.json.JsonElement"
            item_type = self.schema_to_kotlin_type(items, parent_name, field_name + "Item" if field_name else "Item")
            return f"List<{item_type}>"
        elif schema_type == 'object':
            props = schema.get('properties', {})
            if not props:
                # Check for additionalProperties
                add_props = schema.get('additionalProperties')
                if isinstance(add_props, dict) and add_props:
                    val_type = self.schema_to_kotlin_type(add_props, parent_name, field_name)
                    return f"Map<String, {val_type}>"
                return "kotlinx.serialization.json.JsonElement"

            # Dynamic dict detection: if ALL property keys are numeric,
            # this is example data from a dynamic dictionary, not a real schema.
            # Emit JsonElement to handle both dict and empty array from PHP.
            if _all_keys_numeric(props):
                return "kotlinx.serialization.json.JsonElement"

            # Build a signature for deduplication
            sig = self._build_object_signature(schema)
            if sig and sig in self._model_sig_cache:
                return self._model_sig_cache[sig]

            # Inline object -> generate a model
            model_name = to_pascal_case(parent_name + to_pascal_case(field_name)) if field_name else to_pascal_case(parent_name)
            if not model_name:
                self.inline_model_counter += 1
                model_name = f"InlineModel{self.inline_model_counter}"
            model_name = self.unique_name(model_name)
            self.generate_model(model_name, schema)
            if sig:
                self._model_sig_cache[sig] = model_name
            return model_name
        else:
            return "kotlinx.serialization.json.JsonElement"

    def generate_enum(self, name: str, values: list, base_type: str = 'string'):
        """Generate an enum class."""
        lines = []
        lines.append("@Serializable")
        lines.append(f"enum class {name} {{")

        entries = []
        seen_entries: set = set()
        for v in values:
            entry_name = sanitize_enum_entry(str(v))
            # Deduplicate entry names
            if entry_name in seen_entries:
                counter = 2
                while f"{entry_name}_{counter}" in seen_entries:
                    counter += 1
                entry_name = f"{entry_name}_{counter}"
            seen_entries.add(entry_name)
            serial_val = str(v)
            entries.append(f'    @SerialName("{serial_val}")\n    {entry_name}')

        lines.append(",\n\n".join(entries))
        lines.append("}")

        self.enums[name] = "\n".join(lines)

    def generate_model(self, name: str, schema: Dict[str, Any]):
        """Generate a data class for an object schema."""
        if name in self.models:
            return

        props = schema.get('properties', {})
        if not props:
            # Empty object
            self.models[name] = f"@Serializable\nclass {name}"
            return

        lines = []
        lines.append("@Serializable")
        lines.append(f"data class {name}(")

        fields = []
        seen_fields: set = set()
        for prop_name, prop_schema in props.items():
            resolved = self.resolve_schema(prop_schema)
            if prop_name in FIELD_TYPE_OVERRIDES:
                kt_type = FIELD_TYPE_OVERRIDES[prop_name]
            else:
                kt_type = self.schema_to_kotlin_type(resolved, name, prop_name)
            kt_field = sanitize_kotlin_name(to_camel_case(prop_name))

            # Skip duplicate field names (snake_case vs camelCase collisions)
            if kt_field in seen_fields:
                continue
            seen_fields.add(kt_field)

            # All fields are nullable with null default
            field_line = f'    @SerialName("{prop_name}")\n    val {kt_field}: {kt_type}? = null'
            fields.append(field_line)

        lines.append(",\n\n".join(fields))
        lines.append(")")

        self.models[name] = "\n".join(lines)

    def process_component_schema(self, ref_name: str, schema: Dict[str, Any]):
        """Process a component schema into a model or enum."""
        pascal_name = to_pascal_case(ref_name)

        if pascal_name in self.generated_names:
            return
        self.generated_names.add(pascal_name)

        schema_type = schema.get('type', 'object')
        if isinstance(schema_type, list):
            non_null = [t for t in schema_type if t != 'null']
            schema_type = non_null[0] if non_null else 'string'

        if 'enum' in schema:
            self.generate_enum(pascal_name, schema['enum'], schema_type)
        elif schema_type == 'object' or 'properties' in schema:
            # Skip dynamic dict schemas (all-numeric property keys)
            props = schema.get('properties', {})
            if props and _all_keys_numeric(props):
                return  # Will be treated as JsonElement when referenced
            self.generate_model(pascal_name, schema)
        # Simple type aliases: we skip these, they'll be inlined

    def process_all_components(self):
        """Process all component schemas."""
        schemas = self.spec.get('components', {}).get('schemas', {})
        for name, schema in schemas.items():
            self.process_component_schema(name, schema)

    def process_response_schema(self, op_id: str, schema: Dict[str, Any]) -> str:
        """Process a response schema and return the Kotlin type name."""
        resolved = self.resolve_schema(schema)
        response_name = to_pascal_case(op_id) + "Response"
        return self.schema_to_kotlin_type(resolved, response_name)


# ── Endpoint Processing ─────────────────────────────────────────────────────

def resolve_parameter(spec: Dict, param: Dict) -> Dict:
    """Resolve a parameter, handling $ref."""
    if '$ref' in param:
        parts = param['$ref'].lstrip('#/').split('/')
        obj = spec
        for p in parts:
            obj = obj[p]
        return obj
    return param


def get_response_schema(operation: Dict) -> Optional[Dict]:
    """Get the response schema for a 200 response."""
    responses = operation.get('responses', {})
    resp_200 = responses.get('200', responses.get('201', {}))
    content = resp_200.get('content', {})
    json_content = content.get('application/json', {})
    return json_content.get('schema')


def get_request_body_schema(operation: Dict) -> Optional[Dict]:
    """Get the request body schema."""
    rb = operation.get('requestBody', {})
    content = rb.get('content', {})
    # Try JSON first, then form data
    for ct in ['application/json', 'multipart/form-data']:
        if ct in content:
            return content[ct].get('schema')
    return None


class EndpointInfo:
    """Parsed endpoint information."""
    def __init__(self):
        self.method: str = ""
        self.path: str = ""
        self.operation_id: str = ""
        self.tags: List[str] = []
        self.summary: str = ""
        self.description: str = ""
        self.path_params: List[Dict] = []
        self.query_params: List[Dict] = []
        self.body_params: List[Dict] = []
        self.body_schema: Optional[Dict] = None
        self.response_schema: Optional[Dict] = None
        self.has_multipart: bool = False
        self.is_array_body: bool = False
        self.response_is_text: bool = False


def parse_endpoints(spec: Dict) -> List[EndpointInfo]:
    """Parse all endpoints from the spec."""
    endpoints = []
    for path, methods in spec.get('paths', {}).items():
        for method, operation in methods.items():
            if not isinstance(operation, dict):
                continue
            if method.lower() in ('parameters', 'summary', 'description'):
                continue

            ep = EndpointInfo()
            ep.method = method.upper()
            ep.path = path
            ep.operation_id = operation.get('operationId', '')
            ep.tags = operation.get('tags', ['Default'])
            ep.summary = operation.get('summary', '')
            ep.description = operation.get('description', '')

            # Parameters
            for param in operation.get('parameters', []):
                param = resolve_parameter(spec, param)
                loc = param.get('in', 'query')
                if loc == 'path':
                    ep.path_params.append(param)
                elif loc == 'query':
                    ep.query_params.append(param)

            # Request body
            rb = operation.get('requestBody', {})
            content = rb.get('content', {})
            if 'multipart/form-data' in content:
                ep.has_multipart = True
                body_schema = content['multipart/form-data'].get('schema', {})
            elif 'application/json' in content:
                body_schema = content['application/json'].get('schema', {})
            else:
                body_schema = None

            if body_schema:
                ep.body_schema = body_schema
                # Check if body schema is an array (e.g. batch endpoints)
                if body_schema.get('type') == 'array':
                    ep.is_array_body = True
                # Extract body params from properties
                elif 'properties' in body_schema:
                    for pname, pschema in body_schema['properties'].items():
                        ep.body_params.append({
                            'name': pname,
                            'schema': pschema,
                            'required': pname in body_schema.get('required', [])
                        })
                elif 'oneOf' in body_schema:
                    # Handle oneOf in request body - take all properties from all variants
                    seen = set()
                    for variant in body_schema['oneOf']:
                        for pname, pschema in variant.get('properties', {}).items():
                            if pname not in seen:
                                seen.add(pname)
                                ep.body_params.append({
                                    'name': pname,
                                    'schema': pschema,
                                    'required': False
                                })

            # Detect text/html response
            resp_200 = operation.get('responses', {}).get('200', {})
            resp_200_content = resp_200.get('content', {})
            if 'text/html' in resp_200_content and 'application/json' not in resp_200_content:
                ep.response_is_text = True
            else:
                ep.response_schema = get_response_schema(operation)
            endpoints.append(ep)

    return endpoints


# ── Code Generation ─────────────────────────────────────────────────────────

def generate_method_name(operation_id: str) -> str:
    """Generate a Kotlin method name from operation ID."""
    # e.g., Category.Steam -> steam, Threads.Create -> create
    parts = operation_id.split('.')
    if len(parts) >= 2:
        # Use everything after the first part
        method_parts = parts[1:]
        name = to_camel_case('_'.join(method_parts))
    else:
        name = to_camel_case(parts[0])
    return sanitize_kotlin_name(name)


def param_to_kotlin_type(schema: Dict, processor: SchemaProcessor, parent: str, name: str) -> str:
    """Convert a parameter schema to Kotlin type."""
    resolved = processor.resolve_schema(schema)
    return processor.schema_to_kotlin_type(resolved, parent, name)


def generate_service_class(
    tag: str,
    endpoints: List[EndpointInfo],
    processor: SchemaProcessor,
    package_name: str,
    is_market: bool = False
) -> str:
    """Generate a service class for a group of endpoints."""
    class_name = to_pascal_case(tag) + "Service"
    base_url_var = "marketBaseUrl" if is_market else "forumBaseUrl"

    lines = []

    for ep in endpoints:
        if not ep.operation_id:
            continue

        method_name = generate_method_name(ep.operation_id)

        # Determine return type
        if ep.response_is_text:
            return_type = "String"
        elif ep.response_schema:
            return_type = processor.process_response_schema(ep.operation_id, ep.response_schema)
        else:
            return_type = "SaveChangesResponse"

        # Build parameter list
        params = []
        # For array body schemas (e.g. batch), add a jobs parameter
        if ep.is_array_body:
            params.append(('jobs', 'List<Map<String, Any?>>', True, ''))
        # Path params first (required)
        for p in ep.path_params:
            p_name = sanitize_kotlin_name(to_camel_case(p.get('name', 'param')))
            p_schema = p.get('schema', {'type': 'string'})
            # For path parameters, resolve $ref and check for union types
            resolved_path_schema = processor.resolve_schema(p_schema)
            path_type = resolved_path_schema.get('type', 'string')
            if isinstance(path_type, list):
                # Union types like ["string", "integer"] should be String for path params
                p_type = 'String'
            else:
                p_type = param_to_kotlin_type(p_schema, processor, ep.operation_id, p.get('name', 'param'))
            params.append((p_name, p_type, True, p.get('name', '')))

        # Collect binary field names for multipart handling
        binary_fields = set()
        if ep.has_multipart:
            for bp in ep.body_params:
                p_schema = bp.get('schema', {'type': 'string'})
                resolved_bp = processor.resolve_schema(p_schema)
                if resolved_bp.get('format') == 'binary':
                    binary_fields.add(bp['name'])

        # Required body params
        for bp in ep.body_params:
            if bp.get('required'):
                p_name = sanitize_kotlin_name(to_camel_case(bp['name']))
                p_schema = bp.get('schema', {'type': 'string'})
                p_type = param_to_kotlin_type(p_schema, processor, ep.operation_id, bp['name'])
                # For multipart binary fields: accept ByteArray as required param
                if bp['name'] in binary_fields:
                    params.append((p_name, 'ByteArray', True, bp['name']))
                    continue
                params.append((p_name, p_type, True, bp['name']))

        # Optional query params
        for p in ep.query_params:
            p_name = sanitize_kotlin_name(to_camel_case(p.get('name', 'param')))
            p_schema = p.get('schema', {'type': 'string'})
            p_type = param_to_kotlin_type(p_schema, processor, ep.operation_id, p.get('name', 'param'))
            params.append((p_name, f"{p_type}?", False, p.get('name', '')))

        # Optional body params
        for bp in ep.body_params:
            if not bp.get('required'):
                p_name = sanitize_kotlin_name(to_camel_case(bp['name']))
                p_schema = bp.get('schema', {'type': 'string'})
                p_type = param_to_kotlin_type(p_schema, processor, ep.operation_id, bp['name'])
                # For multipart binary fields (optional): accept ByteArray?
                if bp['name'] in binary_fields:
                    params.append((p_name, 'ByteArray?', False, bp['name']))
                    continue
                params.append((p_name, f"{p_type}?", False, bp['name']))

        # Build method signature
        param_strs = []
        for p_name, p_type, required, _ in params:
            if required:
                param_strs.append(f"        {p_name}: {p_type}")
            else:
                param_strs.append(f"        {p_name}: {p_type} = null")

        # Documentation
        doc = ep.summary or ep.description or f"{ep.method} {ep.path}"
        doc_line = doc.replace('\n', ' ').strip()[:120]
        lines.append(f"    /**")
        lines.append(f"     * {doc_line}")
        lines.append(f"     *")
        lines.append(f"     * `{ep.method} {ep.path}`")
        lines.append(f"     */")

        if param_strs:
            lines.append(f"    suspend fun {method_name}(")
            lines.append(",\n".join(param_strs))
            lines.append(f"    ): {return_type} {{")
        else:
            lines.append(f"    suspend fun {method_name}(): {return_type} {{")

        # Build path with substitutions
        path_expr = ep.path
        for p in ep.path_params:
            orig = '{' + p.get('name', '') + '}'
            kt_name = sanitize_kotlin_name(to_camel_case(p.get('name', 'param')))
            path_expr = path_expr.replace(orig, f'${{{kt_name}}}')

        # Build query params map
        query_entries = []
        for p in ep.query_params:
            orig_name = p.get('name', '')
            kt_name = sanitize_kotlin_name(to_camel_case(orig_name))
            query_entries.append(f'            "{orig_name}" to {kt_name}')

        # Build body map and binary map
        body_entries = []
        binary_entries = []
        for bp in ep.body_params:
            orig_name = bp['name']
            kt_name = sanitize_kotlin_name(to_camel_case(orig_name))
            if orig_name in binary_fields:
                binary_entries.append((orig_name, kt_name))
                continue
            body_entries.append(f'            "{orig_name}" to {kt_name}')

        # Method body
        http_method = ep.method.lower()

        if ep.has_multipart and binary_fields:
            # Multipart upload with binary files: use postMultipart
            lines.append(f'        return client.postMultipart(')
            lines.append(f'            path = "{path_expr}",')
            # textParts: all non-binary body fields
            if body_entries:
                lines.append(f'            textParts = mapOf(')
                lines.append(',\n'.join(body_entries))
                lines.append(f'            ),')
            else:
                lines.append(f'            textParts = emptyMap(),')
            # binaryParts: binary fields -> Pair(filename, bytes)
            bin_entries_str = []
            for orig_name, kt_name in binary_entries:
                bin_entries_str.append(
                    f'            "{orig_name}" to Pair("{orig_name}", {kt_name})'
                )
            lines.append(f'            binaryParts = mapOf(')
            lines.append(',\n'.join(bin_entries_str))
            lines.append(f'            )')
            lines.append(f'        )')
        elif ep.has_multipart and not binary_fields and body_entries:
            # Multipart form-data without binary fields: use postMultipart with text parts only
            lines.append(f'        return client.postMultipart(')
            lines.append(f'            path = "{path_expr}",')
            lines.append(f'            textParts = mapOf(')
            lines.append(',\n'.join(body_entries))
            lines.append(f'            )')
            lines.append(f'        )')
        elif ep.is_array_body:
            # Array body (e.g. batch endpoints)
            if query_entries:
                lines.append(f'        return client.postJsonRaw(')
                lines.append(f'            path = "{path_expr}",')
                lines.append(f'            params = mapOf(')
                lines.append(',\n'.join(query_entries))
                lines.append(f'            ),')
                lines.append(f'            jsonBody = jobs')
                lines.append(f'        )')
            else:
                lines.append(f'        return client.postJsonRaw(')
                lines.append(f'            path = "{path_expr}",')
                lines.append(f'            jsonBody = jobs')
                lines.append(f'        )')
        elif http_method in ('post', 'put', 'delete') and body_entries:
            if query_entries:
                lines.append(f'        return client.{http_method}(')
                lines.append(f'            path = "{path_expr}",')
                lines.append(f'            params = mapOf(')
                lines.append(',\n'.join(query_entries))
                lines.append(f'            ),')
                lines.append(f'            body = mapOf(')
                lines.append(',\n'.join(body_entries))
                lines.append(f'            )')
                lines.append(f'        )')
            else:
                lines.append(f'        return client.{http_method}(')
                lines.append(f'            path = "{path_expr}",')
                lines.append(f'            body = mapOf(')
                lines.append(',\n'.join(body_entries))
                lines.append(f'            )')
                lines.append(f'        )')
        elif query_entries:
            lines.append(f'        return client.{http_method}(')
            lines.append(f'            path = "{path_expr}",')
            lines.append(f'            params = mapOf(')
            lines.append(',\n'.join(query_entries))
            lines.append(f'            )')
            lines.append(f'        )')
        else:
            if http_method in ('post', 'put', 'delete'):
                lines.append(f'        return client.{http_method}(path = "{path_expr}")')
            else:
                lines.append(f'        return client.{http_method}(path = "{path_expr}")')

        lines.append("    }")
        lines.append("")

    return class_name, "\n".join(lines)


def generate_client_class(
    api_name: str,
    tag_services: Dict[str, Tuple[str, str]],
    package_name: str,
    base_url: str
) -> str:
    """Generate the main client class."""
    client_class = f"{api_name}Client"

    lines = []
    lines.append(f"package {package_name}")
    lines.append("")
    lines.append("import com.lolzteam.runtime.*")
    lines.append(f"import {package_name}.models.*")
    lines.append("import kotlinx.serialization.json.JsonElement")
    lines.append("import java.io.Closeable")
    lines.append("")
    lines.append("/**")
    lines.append(f" * {api_name} API client for Lolzteam.")
    lines.append(" *")
    lines.append(f" * Base URL: {base_url}")
    lines.append(" */")
    lines.append(f"class {client_class}(")
    lines.append(f"    private val token: String,")
    lines.append(f"    private val baseUrl: String = \"{base_url}\",")
    lines.append(f"    private val retryConfig: RetryConfig = RetryConfig.DEFAULT,")
    lines.append(f"    private val rateLimitConfig: RateLimitConfig = RateLimitConfig.DEFAULT,")
    lines.append(f"    private val proxyConfig: ProxyConfig? = null,")
    lines.append(f"    private val timeoutMs: Long = 30_000L")
    lines.append(") : Closeable {")
    lines.append("")
    lines.append("    private val client = LolzteamHttpClient(")
    lines.append("        baseUrl = baseUrl,")
    lines.append("        token = token,")
    lines.append("        retryConfig = retryConfig,")
    lines.append("        rateLimitConfig = rateLimitConfig,")
    lines.append("        proxyConfig = proxyConfig,")
    lines.append("        timeoutMs = timeoutMs")
    lines.append("    )")
    lines.append("")

    # Service properties
    for tag, (class_name, _) in sorted(tag_services.items()):
        prop_name = to_camel_case(tag)
        lines.append(f"    /** {tag} API endpoints. */")
        lines.append(f"    val {prop_name} = {class_name}(client)")
        lines.append("")

    lines.append("    override fun close() {")
    lines.append("        client.close()")
    lines.append("    }")
    lines.append("}")
    lines.append("")

    # Service classes
    for tag, (class_name, methods_code) in sorted(tag_services.items()):
        lines.append(f"/**")
        lines.append(f" * {tag} API service.")
        lines.append(f" */")
        lines.append(f"class {class_name}(private val client: LolzteamHttpClient) {{")
        lines.append("")
        lines.append(methods_code)
        lines.append("}")
        lines.append("")

    return "\n".join(lines)


def generate_enums_file(package_name: str, processor: SchemaProcessor) -> str:
    """Generate the enums file."""
    lines = []
    lines.append(f"package {package_name}.models")
    lines.append("")
    lines.append("import kotlinx.serialization.Serializable")
    lines.append("import kotlinx.serialization.SerialName")
    lines.append("")

    for name, code in sorted(processor.enums.items()):
        lines.append(code)
        lines.append("")

    return "\n".join(lines)


def generate_models_chunk_file(package_name: str, chunk: List[tuple]) -> str:
    """Generate a models file for a chunk of models."""
    lines = []
    lines.append(f"package {package_name}.models")
    lines.append("")
    lines.append("import kotlinx.serialization.Serializable")
    lines.append("import kotlinx.serialization.SerialName")
    lines.append("import kotlinx.serialization.json.JsonElement")
    lines.append("")

    for name, code in chunk:
        lines.append(code)
        lines.append("")

    return "\n".join(lines)


def generate_models_file(package_name: str, processor: SchemaProcessor) -> str:
    """Generate a single combined models file (for small schemas)."""
    lines = []
    lines.append(f"package {package_name}.models")
    lines.append("")
    lines.append("import kotlinx.serialization.Serializable")
    lines.append("import kotlinx.serialization.SerialName")
    lines.append("import kotlinx.serialization.json.JsonElement")
    lines.append("")

    for name, code in sorted(processor.enums.items()):
        lines.append(code)
        lines.append("")

    for name, code in sorted(processor.models.items()):
        lines.append(code)
        lines.append("")

    return "\n".join(lines)


# ── Main ────────────────────────────────────────────────────────────────────

def main():
    parser = argparse.ArgumentParser(description="Generate Kotlin API code from OpenAPI schema")
    parser.add_argument('--schema', required=True, help='Path to OpenAPI JSON schema')
    parser.add_argument('--output-dir', required=True, help='Output directory')
    parser.add_argument('--package', required=True, help='Kotlin package name')
    args = parser.parse_args()

    with open(args.schema, 'r') as f:
        spec = json.load(f)

    package_name = args.package
    output_dir = args.output_dir

    # Determine API name and base URL
    title = spec.get('info', {}).get('title', '')
    if 'market' in title.lower() or 'market' in args.schema.lower():
        api_name = "Market"
        base_url = "https://prod-api.lzt.market"
    else:
        api_name = "Forum"
        base_url = "https://prod-api.lolz.live"

    print(f"Generating {api_name} API client...")
    print(f"  Package: {package_name}")
    print(f"  Output: {output_dir}")

    processor = SchemaProcessor(spec, package_name)

    # Process all component schemas first
    processor.process_all_components()

    # Parse endpoints
    endpoints = parse_endpoints(spec)
    print(f"  Endpoints: {len(endpoints)}")

    # Group by tag
    tag_endpoints: Dict[str, List[EndpointInfo]] = defaultdict(list)
    for ep in endpoints:
        tag = ep.tags[0] if ep.tags else 'Default'
        tag_endpoints[tag].append(ep)

    print(f"  Tags: {list(tag_endpoints.keys())}")

    # Process all response schemas (this populates models)
    for ep in endpoints:
        if ep.response_schema:
            processor.process_response_schema(ep.operation_id, ep.response_schema)

    # Add SaveChangesResponse for endpoints without a response schema
    # Find existing SystemInfo model (reused from response models)
    system_info_type = None
    for mname in processor.models:
        if 'systeminfo' in mname.lower() and 'resp' in mname.lower():
            system_info_type = mname
            break
    if not system_info_type:
        for mname in processor.models:
            if 'systeminfo' in mname.lower():
                system_info_type = mname
                break
    save_changes_code_lines = [
        '@Serializable',
        'data class SaveChangesResponse(',
        '    @SerialName("status")',
        '    val status: String? = null,',
        '',
        '    @SerialName("message")',
        '    val message: String? = null,',
        '',
    ]
    if system_info_type:
        save_changes_code_lines += [
            '    @SerialName("system_info")',
            f'    val systemInfo: {system_info_type}? = null',
        ]
    else:
        save_changes_code_lines += [
            '    @SerialName("system_info")',
            '    val systemInfo: kotlinx.serialization.json.JsonElement? = null',
        ]
    save_changes_code_lines.append(')')
    processor.models['SaveChangesResponse'] = '\n'.join(save_changes_code_lines)
    processor.generated_names.add('SaveChangesResponse')

    # Generate service classes
    tag_services = {}
    is_market = api_name == "Market"
    for tag, eps in tag_endpoints.items():
        class_name, methods_code = generate_service_class(
            tag, eps, processor, package_name, is_market
        )
        tag_services[tag] = (class_name, methods_code)

    # Write models
    models_dir = os.path.join(output_dir, 'models')
    os.makedirs(models_dir, exist_ok=True)

    # Clean old generated files to prevent stale duplicates
    for old_file in os.listdir(models_dir):
        if old_file.endswith('.kt'):
            os.remove(os.path.join(models_dir, old_file))

    # Split into multiple files: enums in one, models chunked
    total_models = len(processor.models)
    total_enums = len(processor.enums)

    # Write enums in chunks (some game-item enums can be huge)
    ENUM_CHUNK_SIZE = 20
    sorted_enums = sorted(processor.enums.items())
    enum_chunks = [sorted_enums[i:i+ENUM_CHUNK_SIZE] for i in range(0, len(sorted_enums), ENUM_CHUNK_SIZE)]
    if not enum_chunks:
        enum_chunks = [[]]
    for idx, chunk in enumerate(enum_chunks):
        suffix = f"_{idx + 1}" if len(enum_chunks) > 1 else ""
        lines = [f"package {package_name}.models", "", "import kotlinx.serialization.Serializable", "import kotlinx.serialization.SerialName", ""]
        for name, code in chunk:
            lines.append(code)
            lines.append("")
        enums_path = os.path.join(models_dir, f'Enums{suffix}.kt')
        with open(enums_path, 'w') as f:
            f.write("\n".join(lines))

    # Write models in chunks of ~80 per file
    CHUNK_SIZE = 80
    sorted_models = sorted(processor.models.items())
    chunks = [sorted_models[i:i+CHUNK_SIZE] for i in range(0, len(sorted_models), CHUNK_SIZE)]
    for idx, chunk in enumerate(chunks):
        suffix = f"_{idx + 1}" if len(chunks) > 1 else ""
        models_code = generate_models_chunk_file(package_name, chunk)
        models_path = os.path.join(models_dir, f'Models{suffix}.kt')
        with open(models_path, 'w') as f:
            f.write(models_code)

    print(f"  Generated: {models_dir}/ ({total_models} models in {len(chunks)} file(s), {total_enums} enums)")

    # Write client
    client_code = generate_client_class(api_name, tag_services, package_name, base_url)
    client_path = os.path.join(output_dir, f'{api_name}Client.kt')
    with open(client_path, 'w') as f:
        f.write(client_code)
    print(f"  Generated: {client_path}")

    print(f"Done! Generated {api_name} API client.")


if __name__ == '__main__':
    main()
