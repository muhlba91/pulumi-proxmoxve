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
    'GetPoolsResult',
    'AwaitableGetPoolsResult',
    'get_pools',
]

@pulumi.output_type
class GetPoolsResult:
    """
    A collection of values returned by getPools.
    """
    def __init__(__self__, id=None, pool_ids=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pool_ids and not isinstance(pool_ids, list):
            raise TypeError("Expected argument 'pool_ids' to be a list")
        pulumi.set(__self__, "pool_ids", pool_ids)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="poolIds")
    def pool_ids(self) -> Sequence[str]:
        return pulumi.get(self, "pool_ids")


class AwaitableGetPoolsResult(GetPoolsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPoolsResult(
            id=self.id,
            pool_ids=self.pool_ids)


def get_pools(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPoolsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:Permission/getPools:getPools', __args__, opts=opts, typ=GetPoolsResult).value

    return AwaitableGetPoolsResult(
        id=pulumi.get(__ret__, 'id'),
        pool_ids=pulumi.get(__ret__, 'pool_ids'))
