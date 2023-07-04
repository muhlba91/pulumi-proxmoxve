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
    'VirtualMachineAgentArgs',
    'VirtualMachineAudioDeviceArgs',
    'VirtualMachineCdromArgs',
    'VirtualMachineCloneArgs',
    'VirtualMachineCpuArgs',
    'VirtualMachineDiskArgs',
    'VirtualMachineDiskSpeedArgs',
    'VirtualMachineEfiDiskArgs',
    'VirtualMachineHostpciArgs',
    'VirtualMachineInitializationArgs',
    'VirtualMachineInitializationDnsArgs',
    'VirtualMachineInitializationIpConfigArgs',
    'VirtualMachineInitializationIpConfigIpv4Args',
    'VirtualMachineInitializationIpConfigIpv6Args',
    'VirtualMachineInitializationUserAccountArgs',
    'VirtualMachineMemoryArgs',
    'VirtualMachineNetworkDeviceArgs',
    'VirtualMachineOperatingSystemArgs',
    'VirtualMachineSerialDeviceArgs',
    'VirtualMachineVgaArgs',
]

@pulumi.input_type
class VirtualMachineAgentArgs:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 timeout: Optional[pulumi.Input[str]] = None,
                 trim: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)
        if trim is not None:
            pulumi.set(__self__, "trim", trim)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter
    def trim(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "trim")

    @trim.setter
    def trim(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "trim", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class VirtualMachineAudioDeviceArgs:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 driver: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None):
        if device is not None:
            pulumi.set(__self__, "device", device)
        if driver is not None:
            pulumi.set(__self__, "driver", driver)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def driver(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "driver")

    @driver.setter
    def driver(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "driver", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class VirtualMachineCdromArgs:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 file_id: Optional[pulumi.Input[str]] = None):
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if file_id is not None:
            pulumi.set(__self__, "file_id", file_id)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="fileId")
    def file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "file_id")

    @file_id.setter
    def file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_id", value)


@pulumi.input_type
class VirtualMachineCloneArgs:
    def __init__(__self__, *,
                 vm_id: pulumi.Input[int],
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 full: Optional[pulumi.Input[bool]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 retries: Optional[pulumi.Input[int]] = None):
        pulumi.set(__self__, "vm_id", vm_id)
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if full is not None:
            pulumi.set(__self__, "full", full)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> pulumi.Input[int]:
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "vm_id", value)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter
    def full(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "full")

    @full.setter
    def full(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "full", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retries", value)


@pulumi.input_type
class VirtualMachineCpuArgs:
    def __init__(__self__, *,
                 architecture: Optional[pulumi.Input[str]] = None,
                 cores: Optional[pulumi.Input[int]] = None,
                 flags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 hotplugged: Optional[pulumi.Input[int]] = None,
                 numa: Optional[pulumi.Input[bool]] = None,
                 sockets: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 units: Optional[pulumi.Input[int]] = None):
        if architecture is not None:
            pulumi.set(__self__, "architecture", architecture)
        if cores is not None:
            pulumi.set(__self__, "cores", cores)
        if flags is not None:
            pulumi.set(__self__, "flags", flags)
        if hotplugged is not None:
            pulumi.set(__self__, "hotplugged", hotplugged)
        if numa is not None:
            pulumi.set(__self__, "numa", numa)
        if sockets is not None:
            pulumi.set(__self__, "sockets", sockets)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if units is not None:
            pulumi.set(__self__, "units", units)

    @property
    @pulumi.getter
    def architecture(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "architecture")

    @architecture.setter
    def architecture(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "architecture", value)

    @property
    @pulumi.getter
    def cores(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "cores")

    @cores.setter
    def cores(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cores", value)

    @property
    @pulumi.getter
    def flags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "flags")

    @flags.setter
    def flags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "flags", value)

    @property
    @pulumi.getter
    def hotplugged(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "hotplugged")

    @hotplugged.setter
    def hotplugged(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "hotplugged", value)

    @property
    @pulumi.getter
    def numa(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "numa")

    @numa.setter
    def numa(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "numa", value)

    @property
    @pulumi.getter
    def sockets(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "sockets")

    @sockets.setter
    def sockets(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "sockets", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def units(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "units")

    @units.setter
    def units(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "units", value)


@pulumi.input_type
class VirtualMachineDiskArgs:
    def __init__(__self__, *,
                 interface: pulumi.Input[str],
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 discard: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 file_id: Optional[pulumi.Input[str]] = None,
                 iothread: Optional[pulumi.Input[bool]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 speed: Optional[pulumi.Input['VirtualMachineDiskSpeedArgs']] = None,
                 ssd: Optional[pulumi.Input[bool]] = None):
        pulumi.set(__self__, "interface", interface)
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if discard is not None:
            pulumi.set(__self__, "discard", discard)
        if file_format is not None:
            pulumi.set(__self__, "file_format", file_format)
        if file_id is not None:
            pulumi.set(__self__, "file_id", file_id)
        if iothread is not None:
            pulumi.set(__self__, "iothread", iothread)
        if size is not None:
            pulumi.set(__self__, "size", size)
        if speed is not None:
            pulumi.set(__self__, "speed", speed)
        if ssd is not None:
            pulumi.set(__self__, "ssd", ssd)

    @property
    @pulumi.getter
    def interface(self) -> pulumi.Input[str]:
        return pulumi.get(self, "interface")

    @interface.setter
    def interface(self, value: pulumi.Input[str]):
        pulumi.set(self, "interface", value)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter
    def discard(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "discard")

    @discard.setter
    def discard(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "discard", value)

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "file_format")

    @file_format.setter
    def file_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format", value)

    @property
    @pulumi.getter(name="fileId")
    def file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "file_id")

    @file_id.setter
    def file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_id", value)

    @property
    @pulumi.getter
    def iothread(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "iothread")

    @iothread.setter
    def iothread(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "iothread", value)

    @property
    @pulumi.getter
    def size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "size")

    @size.setter
    def size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "size", value)

    @property
    @pulumi.getter
    def speed(self) -> Optional[pulumi.Input['VirtualMachineDiskSpeedArgs']]:
        return pulumi.get(self, "speed")

    @speed.setter
    def speed(self, value: Optional[pulumi.Input['VirtualMachineDiskSpeedArgs']]):
        pulumi.set(self, "speed", value)

    @property
    @pulumi.getter
    def ssd(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "ssd")

    @ssd.setter
    def ssd(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssd", value)


@pulumi.input_type
class VirtualMachineDiskSpeedArgs:
    def __init__(__self__, *,
                 read: Optional[pulumi.Input[int]] = None,
                 read_burstable: Optional[pulumi.Input[int]] = None,
                 write: Optional[pulumi.Input[int]] = None,
                 write_burstable: Optional[pulumi.Input[int]] = None):
        if read is not None:
            pulumi.set(__self__, "read", read)
        if read_burstable is not None:
            pulumi.set(__self__, "read_burstable", read_burstable)
        if write is not None:
            pulumi.set(__self__, "write", write)
        if write_burstable is not None:
            pulumi.set(__self__, "write_burstable", write_burstable)

    @property
    @pulumi.getter
    def read(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "read")

    @read.setter
    def read(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "read", value)

    @property
    @pulumi.getter(name="readBurstable")
    def read_burstable(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "read_burstable")

    @read_burstable.setter
    def read_burstable(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "read_burstable", value)

    @property
    @pulumi.getter
    def write(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "write")

    @write.setter
    def write(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "write", value)

    @property
    @pulumi.getter(name="writeBurstable")
    def write_burstable(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "write_burstable")

    @write_burstable.setter
    def write_burstable(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "write_burstable", value)


@pulumi.input_type
class VirtualMachineEfiDiskArgs:
    def __init__(__self__, *,
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 pre_enrolled_keys: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if file_format is not None:
            pulumi.set(__self__, "file_format", file_format)
        if pre_enrolled_keys is not None:
            pulumi.set(__self__, "pre_enrolled_keys", pre_enrolled_keys)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "file_format")

    @file_format.setter
    def file_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format", value)

    @property
    @pulumi.getter(name="preEnrolledKeys")
    def pre_enrolled_keys(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "pre_enrolled_keys")

    @pre_enrolled_keys.setter
    def pre_enrolled_keys(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pre_enrolled_keys", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class VirtualMachineHostpciArgs:
    def __init__(__self__, *,
                 device: pulumi.Input[str],
                 id: pulumi.Input[str],
                 mdev: Optional[pulumi.Input[str]] = None,
                 pcie: Optional[pulumi.Input[bool]] = None,
                 rom_file: Optional[pulumi.Input[str]] = None,
                 rombar: Optional[pulumi.Input[bool]] = None,
                 xvga: Optional[pulumi.Input[bool]] = None):
        pulumi.set(__self__, "device", device)
        pulumi.set(__self__, "id", id)
        if mdev is not None:
            pulumi.set(__self__, "mdev", mdev)
        if pcie is not None:
            pulumi.set(__self__, "pcie", pcie)
        if rom_file is not None:
            pulumi.set(__self__, "rom_file", rom_file)
        if rombar is not None:
            pulumi.set(__self__, "rombar", rombar)
        if xvga is not None:
            pulumi.set(__self__, "xvga", xvga)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Input[str]:
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: pulumi.Input[str]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: pulumi.Input[str]):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter
    def mdev(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mdev")

    @mdev.setter
    def mdev(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mdev", value)

    @property
    @pulumi.getter
    def pcie(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "pcie")

    @pcie.setter
    def pcie(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "pcie", value)

    @property
    @pulumi.getter(name="romFile")
    def rom_file(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "rom_file")

    @rom_file.setter
    def rom_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rom_file", value)

    @property
    @pulumi.getter
    def rombar(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "rombar")

    @rombar.setter
    def rombar(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rombar", value)

    @property
    @pulumi.getter
    def xvga(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "xvga")

    @xvga.setter
    def xvga(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "xvga", value)


@pulumi.input_type
class VirtualMachineInitializationArgs:
    def __init__(__self__, *,
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 dns: Optional[pulumi.Input['VirtualMachineInitializationDnsArgs']] = None,
                 ip_configs: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualMachineInitializationIpConfigArgs']]]] = None,
                 meta_data_file_id: Optional[pulumi.Input[str]] = None,
                 network_data_file_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_account: Optional[pulumi.Input['VirtualMachineInitializationUserAccountArgs']] = None,
                 user_data_file_id: Optional[pulumi.Input[str]] = None,
                 vendor_data_file_id: Optional[pulumi.Input[str]] = None):
        if datastore_id is not None:
            pulumi.set(__self__, "datastore_id", datastore_id)
        if dns is not None:
            pulumi.set(__self__, "dns", dns)
        if ip_configs is not None:
            pulumi.set(__self__, "ip_configs", ip_configs)
        if meta_data_file_id is not None:
            pulumi.set(__self__, "meta_data_file_id", meta_data_file_id)
        if network_data_file_id is not None:
            pulumi.set(__self__, "network_data_file_id", network_data_file_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if user_account is not None:
            pulumi.set(__self__, "user_account", user_account)
        if user_data_file_id is not None:
            pulumi.set(__self__, "user_data_file_id", user_data_file_id)
        if vendor_data_file_id is not None:
            pulumi.set(__self__, "vendor_data_file_id", vendor_data_file_id)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter
    def dns(self) -> Optional[pulumi.Input['VirtualMachineInitializationDnsArgs']]:
        return pulumi.get(self, "dns")

    @dns.setter
    def dns(self, value: Optional[pulumi.Input['VirtualMachineInitializationDnsArgs']]):
        pulumi.set(self, "dns", value)

    @property
    @pulumi.getter(name="ipConfigs")
    def ip_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VirtualMachineInitializationIpConfigArgs']]]]:
        return pulumi.get(self, "ip_configs")

    @ip_configs.setter
    def ip_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VirtualMachineInitializationIpConfigArgs']]]]):
        pulumi.set(self, "ip_configs", value)

    @property
    @pulumi.getter(name="metaDataFileId")
    def meta_data_file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "meta_data_file_id")

    @meta_data_file_id.setter
    def meta_data_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "meta_data_file_id", value)

    @property
    @pulumi.getter(name="networkDataFileId")
    def network_data_file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "network_data_file_id")

    @network_data_file_id.setter
    def network_data_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_data_file_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="userAccount")
    def user_account(self) -> Optional[pulumi.Input['VirtualMachineInitializationUserAccountArgs']]:
        return pulumi.get(self, "user_account")

    @user_account.setter
    def user_account(self, value: Optional[pulumi.Input['VirtualMachineInitializationUserAccountArgs']]):
        pulumi.set(self, "user_account", value)

    @property
    @pulumi.getter(name="userDataFileId")
    def user_data_file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_data_file_id")

    @user_data_file_id.setter
    def user_data_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_data_file_id", value)

    @property
    @pulumi.getter(name="vendorDataFileId")
    def vendor_data_file_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vendor_data_file_id")

    @vendor_data_file_id.setter
    def vendor_data_file_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vendor_data_file_id", value)


@pulumi.input_type
class VirtualMachineInitializationDnsArgs:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 server: Optional[pulumi.Input[str]] = None):
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if server is not None:
            pulumi.set(__self__, "server", server)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def server(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server", value)


@pulumi.input_type
class VirtualMachineInitializationIpConfigArgs:
    def __init__(__self__, *,
                 ipv4: Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv4Args']] = None,
                 ipv6: Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv6Args']] = None):
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if ipv6 is not None:
            pulumi.set(__self__, "ipv6", ipv6)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv4Args']]:
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv4Args']]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter
    def ipv6(self) -> Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv6Args']]:
        return pulumi.get(self, "ipv6")

    @ipv6.setter
    def ipv6(self, value: Optional[pulumi.Input['VirtualMachineInitializationIpConfigIpv6Args']]):
        pulumi.set(self, "ipv6", value)


@pulumi.input_type
class VirtualMachineInitializationIpConfigIpv4Args:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None):
        if address is not None:
            pulumi.set(__self__, "address", address)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)


@pulumi.input_type
class VirtualMachineInitializationIpConfigIpv6Args:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None):
        if address is not None:
            pulumi.set(__self__, "address", address)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)


@pulumi.input_type
class VirtualMachineInitializationUserAccountArgs:
    def __init__(__self__, *,
                 keys: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        if keys is not None:
            pulumi.set(__self__, "keys", keys)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "keys")

    @keys.setter
    def keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "keys", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class VirtualMachineMemoryArgs:
    def __init__(__self__, *,
                 dedicated: Optional[pulumi.Input[int]] = None,
                 floating: Optional[pulumi.Input[int]] = None,
                 shared: Optional[pulumi.Input[int]] = None):
        if dedicated is not None:
            pulumi.set(__self__, "dedicated", dedicated)
        if floating is not None:
            pulumi.set(__self__, "floating", floating)
        if shared is not None:
            pulumi.set(__self__, "shared", shared)

    @property
    @pulumi.getter
    def dedicated(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "dedicated")

    @dedicated.setter
    def dedicated(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dedicated", value)

    @property
    @pulumi.getter
    def floating(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "floating")

    @floating.setter
    def floating(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "floating", value)

    @property
    @pulumi.getter
    def shared(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "shared")

    @shared.setter
    def shared(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "shared", value)


@pulumi.input_type
class VirtualMachineNetworkDeviceArgs:
    def __init__(__self__, *,
                 bridge: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 firewall: Optional[pulumi.Input[bool]] = None,
                 mac_address: Optional[pulumi.Input[str]] = None,
                 model: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 rate_limit: Optional[pulumi.Input[float]] = None,
                 vlan_id: Optional[pulumi.Input[int]] = None):
        if bridge is not None:
            pulumi.set(__self__, "bridge", bridge)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if firewall is not None:
            pulumi.set(__self__, "firewall", firewall)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)
        if model is not None:
            pulumi.set(__self__, "model", model)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if rate_limit is not None:
            pulumi.set(__self__, "rate_limit", rate_limit)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter
    def bridge(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bridge")

    @bridge.setter
    def bridge(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bridge", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def firewall(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "firewall")

    @firewall.setter
    def firewall(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "firewall", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)

    @property
    @pulumi.getter
    def model(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "model")

    @model.setter
    def model(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "model", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter(name="rateLimit")
    def rate_limit(self) -> Optional[pulumi.Input[float]]:
        return pulumi.get(self, "rate_limit")

    @rate_limit.setter
    def rate_limit(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "rate_limit", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan_id", value)


@pulumi.input_type
class VirtualMachineOperatingSystemArgs:
    def __init__(__self__, *,
                 type: Optional[pulumi.Input[str]] = None):
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class VirtualMachineSerialDeviceArgs:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None):
        if device is not None:
            pulumi.set(__self__, "device", device)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)


@pulumi.input_type
class VirtualMachineVgaArgs:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 memory: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if memory is not None:
            pulumi.set(__self__, "memory", memory)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def memory(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "memory")

    @memory.setter
    def memory(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "memory", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


