# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs

apiToken: Optional[str]
"""
The API token for the Proxmox VE API.
"""

authTicket: Optional[str]
"""
The pre-authenticated Ticket for the Proxmox VE API.
"""

csrfPreventionToken: Optional[str]
"""
The pre-authenticated CSRF Prevention Token for the Proxmox VE API.
"""

endpoint: Optional[str]
"""
The endpoint for the Proxmox VE API.
"""

insecure: Optional[bool]
"""
Whether to skip the TLS verification step.
"""

minTls: Optional[str]
"""
The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
"""

otp: Optional[str]
"""
The one-time password for the Proxmox VE API.
"""

password: Optional[str]
"""
The password for the Proxmox VE API.
"""

randomVmIdEnd: Optional[int]
"""
The ending number for random VM / Container IDs.
"""

randomVmIdStart: Optional[int]
"""
The starting number for random VM / Container IDs.
"""

randomVmIds: Optional[bool]
"""
Whether to generate random VM / Container IDs.
"""

ssh: Optional[str]
"""
The SSH configuration for the Proxmox nodes.
"""

tmpDir: Optional[str]
"""
The alternative temporary directory.
"""

username: Optional[str]
"""
The username for the Proxmox VE API.
"""

