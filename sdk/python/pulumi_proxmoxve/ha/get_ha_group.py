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

__all__ = [
    'GetHAGroupResult',
    'AwaitableGetHAGroupResult',
    'get_ha_group',
    'get_ha_group_output',
]

@pulumi.output_type
class GetHAGroupResult:
    """
    A collection of values returned by getHAGroup.
    """
    def __init__(__self__, comment=None, group=None, id=None, no_failback=None, nodes=None, restricted=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if group and not isinstance(group, str):
            raise TypeError("Expected argument 'group' to be a str")
        pulumi.set(__self__, "group", group)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if no_failback and not isinstance(no_failback, bool):
            raise TypeError("Expected argument 'no_failback' to be a bool")
        pulumi.set(__self__, "no_failback", no_failback)
        if nodes and not isinstance(nodes, dict):
            raise TypeError("Expected argument 'nodes' to be a dict")
        pulumi.set(__self__, "nodes", nodes)
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> _builtins.str:
        """
        The comment associated with this group
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def group(self) -> _builtins.str:
        """
        The identifier of the High Availability group to read.
        """
        return pulumi.get(self, "group")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The unique identifier of this resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="noFailback")
    def no_failback(self) -> _builtins.bool:
        """
        A flag that indicates that failing back to a higher priority node is disabled for this HA group.
        """
        return pulumi.get(self, "no_failback")

    @_builtins.property
    @pulumi.getter
    def nodes(self) -> Mapping[str, _builtins.int]:
        """
        The member nodes for this group. They are provided as a map, where the keys are the node names and the values represent their priority: integers for known priorities or `null` for unset priorities.
        """
        return pulumi.get(self, "nodes")

    @_builtins.property
    @pulumi.getter
    def restricted(self) -> _builtins.bool:
        """
        A flag that indicates that other nodes may not be used to run resources associated to this HA group.
        """
        return pulumi.get(self, "restricted")


class AwaitableGetHAGroupResult(GetHAGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHAGroupResult(
            comment=self.comment,
            group=self.group,
            id=self.id,
            no_failback=self.no_failback,
            nodes=self.nodes,
            restricted=self.restricted)


def get_ha_group(group: Optional[_builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHAGroupResult:
    """
    Retrieves information about a specific High Availability group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    all = proxmoxve.HA.get_ha_groups()
    example = [proxmoxve.HA.get_ha_group(group=__value) for __key, __value in all.group_ids]
    pulumi.export("proxmoxVirtualEnvironmentHagroupsFull", example)
    ```


    :param _builtins.str group: The identifier of the High Availability group to read.
    """
    __args__ = dict()
    __args__['group'] = group
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:HA/getHAGroup:getHAGroup', __args__, opts=opts, typ=GetHAGroupResult).value

    return AwaitableGetHAGroupResult(
        comment=pulumi.get(__ret__, 'comment'),
        group=pulumi.get(__ret__, 'group'),
        id=pulumi.get(__ret__, 'id'),
        no_failback=pulumi.get(__ret__, 'no_failback'),
        nodes=pulumi.get(__ret__, 'nodes'),
        restricted=pulumi.get(__ret__, 'restricted'))
def get_ha_group_output(group: Optional[pulumi.Input[_builtins.str]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHAGroupResult]:
    """
    Retrieves information about a specific High Availability group.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    all = proxmoxve.HA.get_ha_groups()
    example = [proxmoxve.HA.get_ha_group(group=__value) for __key, __value in all.group_ids]
    pulumi.export("proxmoxVirtualEnvironmentHagroupsFull", example)
    ```


    :param _builtins.str group: The identifier of the High Availability group to read.
    """
    __args__ = dict()
    __args__['group'] = group
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('proxmoxve:HA/getHAGroup:getHAGroup', __args__, opts=opts, typ=GetHAGroupResult)
    return __ret__.apply(lambda __response__: GetHAGroupResult(
        comment=pulumi.get(__response__, 'comment'),
        group=pulumi.get(__response__, 'group'),
        id=pulumi.get(__response__, 'id'),
        no_failback=pulumi.get(__response__, 'no_failback'),
        nodes=pulumi.get(__response__, 'nodes'),
        restricted=pulumi.get(__response__, 'restricted')))
