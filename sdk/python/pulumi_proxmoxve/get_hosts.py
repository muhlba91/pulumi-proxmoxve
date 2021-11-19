# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetHostsResult',
    'AwaitableGetHostsResult',
    'get_hosts',
    'get_hosts_output',
]

@pulumi.output_type
class GetHostsResult:
    """
    A collection of values returned by getHosts.
    """
    def __init__(__self__, addresses=None, digest=None, entries=None, hostnames=None, id=None, node_name=None):
        if addresses and not isinstance(addresses, list):
            raise TypeError("Expected argument 'addresses' to be a list")
        pulumi.set(__self__, "addresses", addresses)
        if digest and not isinstance(digest, str):
            raise TypeError("Expected argument 'digest' to be a str")
        pulumi.set(__self__, "digest", digest)
        if entries and not isinstance(entries, list):
            raise TypeError("Expected argument 'entries' to be a list")
        pulumi.set(__self__, "entries", entries)
        if hostnames and not isinstance(hostnames, list):
            raise TypeError("Expected argument 'hostnames' to be a list")
        pulumi.set(__self__, "hostnames", hostnames)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)

    @property
    @pulumi.getter
    def addresses(self) -> Sequence[str]:
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter
    def digest(self) -> str:
        return pulumi.get(self, "digest")

    @property
    @pulumi.getter
    def entries(self) -> Sequence['outputs.GetHostsEntryResult']:
        return pulumi.get(self, "entries")

    @property
    @pulumi.getter
    def hostnames(self) -> Sequence[Sequence[str]]:
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> str:
        return pulumi.get(self, "node_name")


class AwaitableGetHostsResult(GetHostsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHostsResult(
            addresses=self.addresses,
            digest=self.digest,
            entries=self.entries,
            hostnames=self.hostnames,
            id=self.id,
            node_name=self.node_name)


def get_hosts(node_name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHostsResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['nodeName'] = node_name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('proxmoxve:index/getHosts:getHosts', __args__, opts=opts, typ=GetHostsResult).value

    return AwaitableGetHostsResult(
        addresses=__ret__.addresses,
        digest=__ret__.digest,
        entries=__ret__.entries,
        hostnames=__ret__.hostnames,
        id=__ret__.id,
        node_name=__ret__.node_name)


@_utilities.lift_output_func(get_hosts)
def get_hosts_output(node_name: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHostsResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
