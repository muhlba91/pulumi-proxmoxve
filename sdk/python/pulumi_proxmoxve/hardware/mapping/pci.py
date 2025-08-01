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
from ... import _utilities
from . import outputs
from ._inputs import *

__all__ = ['PciArgs', 'Pci']

@pulumi.input_type
class PciArgs:
    def __init__(__self__, *,
                 maps: pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]],
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 mediated_devices: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Pci resource.
        :param pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]] maps: The actual map of devices for the PCI hardware mapping.
        :param pulumi.Input[_builtins.str] comment: The comment of this PCI hardware mapping.
        :param pulumi.Input[_builtins.bool] mediated_devices: Indicates whether to enable mediated devices.
        :param pulumi.Input[_builtins.str] name: The name of this PCI hardware mapping.
        """
        pulumi.set(__self__, "maps", maps)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if mediated_devices is not None:
            pulumi.set(__self__, "mediated_devices", mediated_devices)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def maps(self) -> pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]]:
        """
        The actual map of devices for the PCI hardware mapping.
        """
        return pulumi.get(self, "maps")

    @maps.setter
    def maps(self, value: pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]]):
        pulumi.set(self, "maps", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The comment of this PCI hardware mapping.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="mediatedDevices")
    def mediated_devices(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether to enable mediated devices.
        """
        return pulumi.get(self, "mediated_devices")

    @mediated_devices.setter
    def mediated_devices(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "mediated_devices", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of this PCI hardware mapping.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PciState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 maps: Optional[pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]]] = None,
                 mediated_devices: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Pci resources.
        :param pulumi.Input[_builtins.str] comment: The comment of this PCI hardware mapping.
        :param pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]] maps: The actual map of devices for the PCI hardware mapping.
        :param pulumi.Input[_builtins.bool] mediated_devices: Indicates whether to enable mediated devices.
        :param pulumi.Input[_builtins.str] name: The name of this PCI hardware mapping.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if maps is not None:
            pulumi.set(__self__, "maps", maps)
        if mediated_devices is not None:
            pulumi.set(__self__, "mediated_devices", mediated_devices)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The comment of this PCI hardware mapping.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def maps(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]]]:
        """
        The actual map of devices for the PCI hardware mapping.
        """
        return pulumi.get(self, "maps")

    @maps.setter
    def maps(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PciMapArgs']]]]):
        pulumi.set(self, "maps", value)

    @_builtins.property
    @pulumi.getter(name="mediatedDevices")
    def mediated_devices(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether to enable mediated devices.
        """
        return pulumi.get(self, "mediated_devices")

    @mediated_devices.setter
    def mediated_devices(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "mediated_devices", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of this PCI hardware mapping.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.type_token("proxmoxve:Hardware/mapping/pci:Pci")
class Pci(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 maps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PciMapArgs', 'PciMapArgsDict']]]]] = None,
                 mediated_devices: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a PCI hardware mapping in a Proxmox VE cluster.

        ## Import

        #!/usr/bin/env sh

        A PCI hardware mapping can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:Hardware/mapping/pci:Pci example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: The comment of this PCI hardware mapping.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PciMapArgs', 'PciMapArgsDict']]]] maps: The actual map of devices for the PCI hardware mapping.
        :param pulumi.Input[_builtins.bool] mediated_devices: Indicates whether to enable mediated devices.
        :param pulumi.Input[_builtins.str] name: The name of this PCI hardware mapping.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PciArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a PCI hardware mapping in a Proxmox VE cluster.

        ## Import

        #!/usr/bin/env sh

        A PCI hardware mapping can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:Hardware/mapping/pci:Pci example example
        ```

        :param str resource_name: The name of the resource.
        :param PciArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PciArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 maps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PciMapArgs', 'PciMapArgsDict']]]]] = None,
                 mediated_devices: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PciArgs.__new__(PciArgs)

            __props__.__dict__["comment"] = comment
            if maps is None and not opts.urn:
                raise TypeError("Missing required property 'maps'")
            __props__.__dict__["maps"] = maps
            __props__.__dict__["mediated_devices"] = mediated_devices
            __props__.__dict__["name"] = name
        super(Pci, __self__).__init__(
            'proxmoxve:Hardware/mapping/pci:Pci',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            maps: Optional[pulumi.Input[Sequence[pulumi.Input[Union['PciMapArgs', 'PciMapArgsDict']]]]] = None,
            mediated_devices: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None) -> 'Pci':
        """
        Get an existing Pci resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: The comment of this PCI hardware mapping.
        :param pulumi.Input[Sequence[pulumi.Input[Union['PciMapArgs', 'PciMapArgsDict']]]] maps: The actual map of devices for the PCI hardware mapping.
        :param pulumi.Input[_builtins.bool] mediated_devices: Indicates whether to enable mediated devices.
        :param pulumi.Input[_builtins.str] name: The name of this PCI hardware mapping.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PciState.__new__(_PciState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["maps"] = maps
        __props__.__dict__["mediated_devices"] = mediated_devices
        __props__.__dict__["name"] = name
        return Pci(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The comment of this PCI hardware mapping.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def maps(self) -> pulumi.Output[Sequence['outputs.PciMap']]:
        """
        The actual map of devices for the PCI hardware mapping.
        """
        return pulumi.get(self, "maps")

    @_builtins.property
    @pulumi.getter(name="mediatedDevices")
    def mediated_devices(self) -> pulumi.Output[_builtins.bool]:
        """
        Indicates whether to enable mediated devices.
        """
        return pulumi.get(self, "mediated_devices")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of this PCI hardware mapping.
        """
        return pulumi.get(self, "name")

