# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetMappingsCheckResult',
]

@pulumi.output_type
class GetMappingsCheckResult(dict):
    def __init__(__self__, *,
                 mapping_id: str,
                 message: str,
                 severity: str):
        """
        :param str mapping_id: The corresponding hardware mapping ID of the node check diagnostic entry.
        :param str message: The message of the node check diagnostic entry.
        :param str severity: The severity of the node check diagnostic entry.
        """
        pulumi.set(__self__, "mapping_id", mapping_id)
        pulumi.set(__self__, "message", message)
        pulumi.set(__self__, "severity", severity)

    @property
    @pulumi.getter(name="mappingId")
    def mapping_id(self) -> str:
        """
        The corresponding hardware mapping ID of the node check diagnostic entry.
        """
        return pulumi.get(self, "mapping_id")

    @property
    @pulumi.getter
    def message(self) -> str:
        """
        The message of the node check diagnostic entry.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def severity(self) -> str:
        """
        The severity of the node check diagnostic entry.
        """
        return pulumi.get(self, "severity")

