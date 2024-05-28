# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['Vm2Args', 'Vm2']

@pulumi.input_type
class Vm2Args:
    def __init__(__self__, *,
                 node_name: pulumi.Input[str],
                 clone: Optional[pulumi.Input['Vm2CloneArgs']] = None,
                 cpu: Optional[pulumi.Input['Vm2CpuArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 template: Optional[pulumi.Input[bool]] = None,
                 timeouts: Optional[pulumi.Input['Vm2TimeoutsArgs']] = None,
                 vga: Optional[pulumi.Input['Vm2VgaArgs']] = None):
        """
        The set of arguments for constructing a Vm2 resource.
        :param pulumi.Input[str] node_name: The name of the node where the VM is provisioned.
        :param pulumi.Input['Vm2CloneArgs'] clone: The cloning configuration.
        :param pulumi.Input['Vm2CpuArgs'] cpu: The CPU configuration.
        :param pulumi.Input[str] description: The description of the VM.
        :param pulumi.Input[str] name: The name of the VM. Doesn't have to be unique.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags assigned to the VM.
        :param pulumi.Input[bool] template: Set to true to create a VM template.
        :param pulumi.Input['Vm2VgaArgs'] vga: Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        pulumi.set(__self__, "node_name", node_name)
        if clone is not None:
            pulumi.set(__self__, "clone", clone)
        if cpu is not None:
            pulumi.set(__self__, "cpu", cpu)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if template is not None:
            pulumi.set(__self__, "template", template)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if vga is not None:
            pulumi.set(__self__, "vga", vga)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Input[str]:
        """
        The name of the node where the VM is provisioned.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def clone(self) -> Optional[pulumi.Input['Vm2CloneArgs']]:
        """
        The cloning configuration.
        """
        return pulumi.get(self, "clone")

    @clone.setter
    def clone(self, value: Optional[pulumi.Input['Vm2CloneArgs']]):
        pulumi.set(self, "clone", value)

    @property
    @pulumi.getter
    def cpu(self) -> Optional[pulumi.Input['Vm2CpuArgs']]:
        """
        The CPU configuration.
        """
        return pulumi.get(self, "cpu")

    @cpu.setter
    def cpu(self, value: Optional[pulumi.Input['Vm2CpuArgs']]):
        pulumi.set(self, "cpu", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the VM.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the VM. Doesn't have to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The tags assigned to the VM.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def template(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to create a VM template.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "template", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['Vm2TimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['Vm2TimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter
    def vga(self) -> Optional[pulumi.Input['Vm2VgaArgs']]:
        """
        Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        return pulumi.get(self, "vga")

    @vga.setter
    def vga(self, value: Optional[pulumi.Input['Vm2VgaArgs']]):
        pulumi.set(self, "vga", value)


@pulumi.input_type
class _Vm2State:
    def __init__(__self__, *,
                 clone: Optional[pulumi.Input['Vm2CloneArgs']] = None,
                 cpu: Optional[pulumi.Input['Vm2CpuArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 template: Optional[pulumi.Input[bool]] = None,
                 timeouts: Optional[pulumi.Input['Vm2TimeoutsArgs']] = None,
                 vga: Optional[pulumi.Input['Vm2VgaArgs']] = None):
        """
        Input properties used for looking up and filtering Vm2 resources.
        :param pulumi.Input['Vm2CloneArgs'] clone: The cloning configuration.
        :param pulumi.Input['Vm2CpuArgs'] cpu: The CPU configuration.
        :param pulumi.Input[str] description: The description of the VM.
        :param pulumi.Input[str] name: The name of the VM. Doesn't have to be unique.
        :param pulumi.Input[str] node_name: The name of the node where the VM is provisioned.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags assigned to the VM.
        :param pulumi.Input[bool] template: Set to true to create a VM template.
        :param pulumi.Input['Vm2VgaArgs'] vga: Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        if clone is not None:
            pulumi.set(__self__, "clone", clone)
        if cpu is not None:
            pulumi.set(__self__, "cpu", cpu)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if template is not None:
            pulumi.set(__self__, "template", template)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if vga is not None:
            pulumi.set(__self__, "vga", vga)

    @property
    @pulumi.getter
    def clone(self) -> Optional[pulumi.Input['Vm2CloneArgs']]:
        """
        The cloning configuration.
        """
        return pulumi.get(self, "clone")

    @clone.setter
    def clone(self, value: Optional[pulumi.Input['Vm2CloneArgs']]):
        pulumi.set(self, "clone", value)

    @property
    @pulumi.getter
    def cpu(self) -> Optional[pulumi.Input['Vm2CpuArgs']]:
        """
        The CPU configuration.
        """
        return pulumi.get(self, "cpu")

    @cpu.setter
    def cpu(self, value: Optional[pulumi.Input['Vm2CpuArgs']]):
        pulumi.set(self, "cpu", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the VM.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the VM. Doesn't have to be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the node where the VM is provisioned.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The tags assigned to the VM.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def template(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to create a VM template.
        """
        return pulumi.get(self, "template")

    @template.setter
    def template(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "template", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['Vm2TimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['Vm2TimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter
    def vga(self) -> Optional[pulumi.Input['Vm2VgaArgs']]:
        """
        Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        return pulumi.get(self, "vga")

    @vga.setter
    def vga(self, value: Optional[pulumi.Input['Vm2VgaArgs']]):
        pulumi.set(self, "vga", value)


class Vm2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 clone: Optional[pulumi.Input[pulumi.InputType['Vm2CloneArgs']]] = None,
                 cpu: Optional[pulumi.Input[pulumi.InputType['Vm2CpuArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 template: Optional[pulumi.Input[bool]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['Vm2TimeoutsArgs']]] = None,
                 vga: Optional[pulumi.Input[pulumi.InputType['Vm2VgaArgs']]] = None,
                 __props__=None):
        """
        !> **DO NOT USE**
        This is an experimental implementation of a Proxmox VM resource using Plugin Framework.<br><br>It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.

        > Many attributes are marked as **optional** _and_ **computed** in the schema,
        hence you may seem added to the plan with "(known after apply)" status, even if they are not set in the configuration.
        This is done to support the `clone` operation, when a VM is created from an existing VM or template,
        and the source attributes are copied to the clone.<br><br>
        Computed attributes allow the provider to set those attributes without user input.
        The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['Vm2CloneArgs']] clone: The cloning configuration.
        :param pulumi.Input[pulumi.InputType['Vm2CpuArgs']] cpu: The CPU configuration.
        :param pulumi.Input[str] description: The description of the VM.
        :param pulumi.Input[str] name: The name of the VM. Doesn't have to be unique.
        :param pulumi.Input[str] node_name: The name of the node where the VM is provisioned.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags assigned to the VM.
        :param pulumi.Input[bool] template: Set to true to create a VM template.
        :param pulumi.Input[pulumi.InputType['Vm2VgaArgs']] vga: Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Vm2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        !> **DO NOT USE**
        This is an experimental implementation of a Proxmox VM resource using Plugin Framework.<br><br>It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.

        > Many attributes are marked as **optional** _and_ **computed** in the schema,
        hence you may seem added to the plan with "(known after apply)" status, even if they are not set in the configuration.
        This is done to support the `clone` operation, when a VM is created from an existing VM or template,
        and the source attributes are copied to the clone.<br><br>
        Computed attributes allow the provider to set those attributes without user input.
        The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.

        :param str resource_name: The name of the resource.
        :param Vm2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(Vm2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 clone: Optional[pulumi.Input[pulumi.InputType['Vm2CloneArgs']]] = None,
                 cpu: Optional[pulumi.Input[pulumi.InputType['Vm2CpuArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 template: Optional[pulumi.Input[bool]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['Vm2TimeoutsArgs']]] = None,
                 vga: Optional[pulumi.Input[pulumi.InputType['Vm2VgaArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = Vm2Args.__new__(Vm2Args)

            __props__.__dict__["clone"] = clone
            __props__.__dict__["cpu"] = cpu
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if node_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_name'")
            __props__.__dict__["node_name"] = node_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["template"] = template
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["vga"] = vga
        super(Vm2, __self__).__init__(
            'proxmoxve:index/vm2:Vm2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            clone: Optional[pulumi.Input[pulumi.InputType['Vm2CloneArgs']]] = None,
            cpu: Optional[pulumi.Input[pulumi.InputType['Vm2CpuArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            template: Optional[pulumi.Input[bool]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['Vm2TimeoutsArgs']]] = None,
            vga: Optional[pulumi.Input[pulumi.InputType['Vm2VgaArgs']]] = None) -> 'Vm2':
        """
        Get an existing Vm2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['Vm2CloneArgs']] clone: The cloning configuration.
        :param pulumi.Input[pulumi.InputType['Vm2CpuArgs']] cpu: The CPU configuration.
        :param pulumi.Input[str] description: The description of the VM.
        :param pulumi.Input[str] name: The name of the VM. Doesn't have to be unique.
        :param pulumi.Input[str] node_name: The name of the node where the VM is provisioned.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags assigned to the VM.
        :param pulumi.Input[bool] template: Set to true to create a VM template.
        :param pulumi.Input[pulumi.InputType['Vm2VgaArgs']] vga: Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _Vm2State.__new__(_Vm2State)

        __props__.__dict__["clone"] = clone
        __props__.__dict__["cpu"] = cpu
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["template"] = template
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["vga"] = vga
        return Vm2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def clone(self) -> pulumi.Output[Optional['outputs.Vm2Clone']]:
        """
        The cloning configuration.
        """
        return pulumi.get(self, "clone")

    @property
    @pulumi.getter
    def cpu(self) -> pulumi.Output['outputs.Vm2Cpu']:
        """
        The CPU configuration.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the VM.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the VM. Doesn't have to be unique.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        The name of the node where the VM is provisioned.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Sequence[str]]:
        """
        The tags assigned to the VM.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def template(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to true to create a VM template.
        """
        return pulumi.get(self, "template")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.Vm2Timeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter
    def vga(self) -> pulumi.Output['outputs.Vm2Vga']:
        """
        Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        """
        return pulumi.get(self, "vga")

