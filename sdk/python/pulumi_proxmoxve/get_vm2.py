# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetVm2Result',
    'AwaitableGetVm2Result',
    'get_vm2',
    'get_vm2_output',
]

@pulumi.output_type
class GetVm2Result:
    """
    A collection of values returned by getVm2.
    """
    def __init__(__self__, clone=None, cpu=None, description=None, id=None, name=None, node_name=None, rng=None, tags=None, template=None, timeouts=None, vga=None):
        if clone and not isinstance(clone, dict):
            raise TypeError("Expected argument 'clone' to be a dict")
        pulumi.set(__self__, "clone", clone)
        if cpu and not isinstance(cpu, dict):
            raise TypeError("Expected argument 'cpu' to be a dict")
        pulumi.set(__self__, "cpu", cpu)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if rng and not isinstance(rng, dict):
            raise TypeError("Expected argument 'rng' to be a dict")
        pulumi.set(__self__, "rng", rng)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if template and not isinstance(template, bool):
            raise TypeError("Expected argument 'template' to be a bool")
        pulumi.set(__self__, "template", template)
        if timeouts and not isinstance(timeouts, dict):
            raise TypeError("Expected argument 'timeouts' to be a dict")
        pulumi.set(__self__, "timeouts", timeouts)
        if vga and not isinstance(vga, dict):
            raise TypeError("Expected argument 'vga' to be a dict")
        pulumi.set(__self__, "vga", vga)

    @property
    @pulumi.getter
    def clone(self) -> Optional['outputs.GetVm2CloneResult']:
        """
        The cloning configuration.
        """
        return pulumi.get(self, "clone")

    @property
    @pulumi.getter
    def cpu(self) -> 'outputs.GetVm2CpuResult':
        """
        The CPU configuration.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter
    def description(self) -> Optional[builtins.str]:
        """
        The description of the VM.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        """
        The unique identifier of the VM in the Proxmox cluster.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        The name of the VM.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> builtins.str:
        """
        The name of the node where the VM is provisioned.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def rng(self) -> 'outputs.GetVm2RngResult':
        """
        The RNG (Random Number Generator) configuration.
        """
        return pulumi.get(self, "rng")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[builtins.str]:
        """
        The tags assigned to the VM.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def template(self) -> Optional[builtins.bool]:
        """
        Whether the VM is a template.
        """
        return pulumi.get(self, "template")

    @property
    @pulumi.getter
    def timeouts(self) -> Optional['outputs.GetVm2TimeoutsResult']:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter
    def vga(self) -> 'outputs.GetVm2VgaResult':
        """
        The VGA configuration.
        """
        return pulumi.get(self, "vga")


class AwaitableGetVm2Result(GetVm2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVm2Result(
            clone=self.clone,
            cpu=self.cpu,
            description=self.description,
            id=self.id,
            name=self.name,
            node_name=self.node_name,
            rng=self.rng,
            tags=self.tags,
            template=self.template,
            timeouts=self.timeouts,
            vga=self.vga)


def get_vm2(clone: Optional[Union['GetVm2CloneArgs', 'GetVm2CloneArgsDict']] = None,
            cpu: Optional[Union['GetVm2CpuArgs', 'GetVm2CpuArgsDict']] = None,
            description: Optional[builtins.str] = None,
            id: Optional[builtins.int] = None,
            name: Optional[builtins.str] = None,
            node_name: Optional[builtins.str] = None,
            rng: Optional[Union['GetVm2RngArgs', 'GetVm2RngArgsDict']] = None,
            tags: Optional[Sequence[builtins.str]] = None,
            template: Optional[builtins.bool] = None,
            timeouts: Optional[Union['GetVm2TimeoutsArgs', 'GetVm2TimeoutsArgsDict']] = None,
            vga: Optional[Union['GetVm2VgaArgs', 'GetVm2VgaArgsDict']] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVm2Result:
    """
    !> **DO NOT USE**
    This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.


    :param Union['GetVm2CloneArgs', 'GetVm2CloneArgsDict'] clone: The cloning configuration.
    :param Union['GetVm2CpuArgs', 'GetVm2CpuArgsDict'] cpu: The CPU configuration.
    :param builtins.str description: The description of the VM.
    :param builtins.int id: The unique identifier of the VM in the Proxmox cluster.
    :param builtins.str name: The name of the VM.
    :param builtins.str node_name: The name of the node where the VM is provisioned.
    :param Union['GetVm2RngArgs', 'GetVm2RngArgsDict'] rng: The RNG (Random Number Generator) configuration.
    :param Sequence[builtins.str] tags: The tags assigned to the VM.
    :param builtins.bool template: Whether the VM is a template.
    :param Union['GetVm2VgaArgs', 'GetVm2VgaArgsDict'] vga: The VGA configuration.
    """
    __args__ = dict()
    __args__['clone'] = clone
    __args__['cpu'] = cpu
    __args__['description'] = description
    __args__['id'] = id
    __args__['name'] = name
    __args__['nodeName'] = node_name
    __args__['rng'] = rng
    __args__['tags'] = tags
    __args__['template'] = template
    __args__['timeouts'] = timeouts
    __args__['vga'] = vga
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:index/getVm2:getVm2', __args__, opts=opts, typ=GetVm2Result).value

    return AwaitableGetVm2Result(
        clone=pulumi.get(__ret__, 'clone'),
        cpu=pulumi.get(__ret__, 'cpu'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        node_name=pulumi.get(__ret__, 'node_name'),
        rng=pulumi.get(__ret__, 'rng'),
        tags=pulumi.get(__ret__, 'tags'),
        template=pulumi.get(__ret__, 'template'),
        timeouts=pulumi.get(__ret__, 'timeouts'),
        vga=pulumi.get(__ret__, 'vga'))
def get_vm2_output(clone: Optional[pulumi.Input[Optional[Union['GetVm2CloneArgs', 'GetVm2CloneArgsDict']]]] = None,
                   cpu: Optional[pulumi.Input[Optional[Union['GetVm2CpuArgs', 'GetVm2CpuArgsDict']]]] = None,
                   description: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                   id: Optional[pulumi.Input[builtins.int]] = None,
                   name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                   node_name: Optional[pulumi.Input[builtins.str]] = None,
                   rng: Optional[pulumi.Input[Optional[Union['GetVm2RngArgs', 'GetVm2RngArgsDict']]]] = None,
                   tags: Optional[pulumi.Input[Optional[Sequence[builtins.str]]]] = None,
                   template: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                   timeouts: Optional[pulumi.Input[Optional[Union['GetVm2TimeoutsArgs', 'GetVm2TimeoutsArgsDict']]]] = None,
                   vga: Optional[pulumi.Input[Optional[Union['GetVm2VgaArgs', 'GetVm2VgaArgsDict']]]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVm2Result]:
    """
    !> **DO NOT USE**
    This is an experimental implementation of a Proxmox VM datasource using Plugin Framework.


    :param Union['GetVm2CloneArgs', 'GetVm2CloneArgsDict'] clone: The cloning configuration.
    :param Union['GetVm2CpuArgs', 'GetVm2CpuArgsDict'] cpu: The CPU configuration.
    :param builtins.str description: The description of the VM.
    :param builtins.int id: The unique identifier of the VM in the Proxmox cluster.
    :param builtins.str name: The name of the VM.
    :param builtins.str node_name: The name of the node where the VM is provisioned.
    :param Union['GetVm2RngArgs', 'GetVm2RngArgsDict'] rng: The RNG (Random Number Generator) configuration.
    :param Sequence[builtins.str] tags: The tags assigned to the VM.
    :param builtins.bool template: Whether the VM is a template.
    :param Union['GetVm2VgaArgs', 'GetVm2VgaArgsDict'] vga: The VGA configuration.
    """
    __args__ = dict()
    __args__['clone'] = clone
    __args__['cpu'] = cpu
    __args__['description'] = description
    __args__['id'] = id
    __args__['name'] = name
    __args__['nodeName'] = node_name
    __args__['rng'] = rng
    __args__['tags'] = tags
    __args__['template'] = template
    __args__['timeouts'] = timeouts
    __args__['vga'] = vga
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('proxmoxve:index/getVm2:getVm2', __args__, opts=opts, typ=GetVm2Result)
    return __ret__.apply(lambda __response__: GetVm2Result(
        clone=pulumi.get(__response__, 'clone'),
        cpu=pulumi.get(__response__, 'cpu'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        node_name=pulumi.get(__response__, 'node_name'),
        rng=pulumi.get(__response__, 'rng'),
        tags=pulumi.get(__response__, 'tags'),
        template=pulumi.get(__response__, 'template'),
        timeouts=pulumi.get(__response__, 'timeouts'),
        vga=pulumi.get(__response__, 'vga')))
