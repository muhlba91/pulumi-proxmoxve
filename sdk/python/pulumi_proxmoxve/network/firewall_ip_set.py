# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FirewallIPSetArgs', 'FirewallIPSet']

@pulumi.input_type
class FirewallIPSetArgs:
    def __init__(__self__, *,
                 cidrs: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a FirewallIPSet resource.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]] cidrs: IP/CIDR block (multiple blocks supported).
        :param pulumi.Input[str] comment: Arbitrary string annotation.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[str] name: Network/IP specification in CIDR format.
        :param pulumi.Input[str] node_name: Node name. Leave empty for cluster level aliases.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        if cidrs is not None:
            pulumi.set(__self__, "cidrs", cidrs)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if container_id is not None:
            pulumi.set(__self__, "container_id", container_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if vm_id is not None:
            pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter
    def cidrs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]]:
        """
        IP/CIDR block (multiple blocks supported).
        """
        return pulumi.get(self, "cidrs")

    @cidrs.setter
    def cidrs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]]):
        pulumi.set(self, "cidrs", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Arbitrary string annotation.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[pulumi.Input[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Network/IP specification in CIDR format.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        Node name. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vm_id", value)


@pulumi.input_type
class _FirewallIPSetState:
    def __init__(__self__, *,
                 cidrs: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering FirewallIPSet resources.
        :param pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]] cidrs: IP/CIDR block (multiple blocks supported).
        :param pulumi.Input[str] comment: Arbitrary string annotation.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[str] name: Network/IP specification in CIDR format.
        :param pulumi.Input[str] node_name: Node name. Leave empty for cluster level aliases.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        if cidrs is not None:
            pulumi.set(__self__, "cidrs", cidrs)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if container_id is not None:
            pulumi.set(__self__, "container_id", container_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if vm_id is not None:
            pulumi.set(__self__, "vm_id", vm_id)

    @property
    @pulumi.getter
    def cidrs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]]:
        """
        IP/CIDR block (multiple blocks supported).
        """
        return pulumi.get(self, "cidrs")

    @cidrs.setter
    def cidrs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FirewallIPSetCidrArgs']]]]):
        pulumi.set(self, "cidrs", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Arbitrary string annotation.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[pulumi.Input[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Network/IP specification in CIDR format.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        Node name. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vm_id", value)


class FirewallIPSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidrs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallIPSetCidrArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        An IPSet allows us to group multiple IP addresses, IP subnets and aliases. Aliases can be
        created on the cluster level, on VM / Container level.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        ipset = proxmoxve.network.FirewallIPSet("ipset",
            node_name=proxmox_virtual_environment_vm["example"]["node_name"],
            vm_id=proxmox_virtual_environment_vm["example"]["vm_id"],
            comment="Managed by Terraform",
            cidrs=[
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.0.0/23",
                    comment="Local network 1",
                ),
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.0.1",
                    comment="Server 1",
                    nomatch=True,
                ),
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.2.1",
                    comment="Server 1",
                ),
            ],
            opts=pulumi.ResourceOptions(depends_on=[proxmox_virtual_environment_vm["example"]]))
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallIPSetCidrArgs']]]] cidrs: IP/CIDR block (multiple blocks supported).
        :param pulumi.Input[str] comment: Arbitrary string annotation.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[str] name: Network/IP specification in CIDR format.
        :param pulumi.Input[str] node_name: Node name. Leave empty for cluster level aliases.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FirewallIPSetArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        An IPSet allows us to group multiple IP addresses, IP subnets and aliases. Aliases can be
        created on the cluster level, on VM / Container level.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        ipset = proxmoxve.network.FirewallIPSet("ipset",
            node_name=proxmox_virtual_environment_vm["example"]["node_name"],
            vm_id=proxmox_virtual_environment_vm["example"]["vm_id"],
            comment="Managed by Terraform",
            cidrs=[
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.0.0/23",
                    comment="Local network 1",
                ),
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.0.1",
                    comment="Server 1",
                    nomatch=True,
                ),
                proxmoxve.network.FirewallIPSetCidrArgs(
                    name="192.168.2.1",
                    comment="Server 1",
                ),
            ],
            opts=pulumi.ResourceOptions(depends_on=[proxmox_virtual_environment_vm["example"]]))
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param FirewallIPSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FirewallIPSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidrs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallIPSetCidrArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FirewallIPSetArgs.__new__(FirewallIPSetArgs)

            __props__.__dict__["cidrs"] = cidrs
            __props__.__dict__["comment"] = comment
            __props__.__dict__["container_id"] = container_id
            __props__.__dict__["name"] = name
            __props__.__dict__["node_name"] = node_name
            __props__.__dict__["vm_id"] = vm_id
        super(FirewallIPSet, __self__).__init__(
            'proxmoxve:Network/firewallIPSet:FirewallIPSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cidrs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallIPSetCidrArgs']]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            container_id: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            vm_id: Optional[pulumi.Input[int]] = None) -> 'FirewallIPSet':
        """
        Get an existing FirewallIPSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FirewallIPSetCidrArgs']]]] cidrs: IP/CIDR block (multiple blocks supported).
        :param pulumi.Input[str] comment: Arbitrary string annotation.
        :param pulumi.Input[int] container_id: Container ID. Leave empty for cluster level aliases.
        :param pulumi.Input[str] name: Network/IP specification in CIDR format.
        :param pulumi.Input[str] node_name: Node name. Leave empty for cluster level aliases.
        :param pulumi.Input[int] vm_id: VM ID. Leave empty for cluster level aliases.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FirewallIPSetState.__new__(_FirewallIPSetState)

        __props__.__dict__["cidrs"] = cidrs
        __props__.__dict__["comment"] = comment
        __props__.__dict__["container_id"] = container_id
        __props__.__dict__["name"] = name
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["vm_id"] = vm_id
        return FirewallIPSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cidrs(self) -> pulumi.Output[Optional[Sequence['outputs.FirewallIPSetCidr']]]:
        """
        IP/CIDR block (multiple blocks supported).
        """
        return pulumi.get(self, "cidrs")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Arbitrary string annotation.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Output[Optional[int]]:
        """
        Container ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Network/IP specification in CIDR format.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[Optional[str]]:
        """
        Node name. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Output[Optional[int]]:
        """
        VM ID. Leave empty for cluster level aliases.
        """
        return pulumi.get(self, "vm_id")

