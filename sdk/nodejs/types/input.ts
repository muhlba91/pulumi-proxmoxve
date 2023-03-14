// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface HostsEntry {
    address: pulumi.Input<string>;
    hostnames: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ProviderVirtualEnvironment {
    endpoint?: pulumi.Input<string>;
    insecure?: pulumi.Input<boolean>;
    otp?: pulumi.Input<string>;
    password?: pulumi.Input<string>;
    username?: pulumi.Input<string>;
}
export namespace CT {
    export interface ContainerClone {
        datastoreId?: pulumi.Input<string>;
        nodeName?: pulumi.Input<string>;
        vmId: pulumi.Input<number>;
    }

    export interface ContainerConsole {
        enabled?: pulumi.Input<boolean>;
        ttyCount?: pulumi.Input<number>;
        type?: pulumi.Input<string>;
    }

    export interface ContainerCpu {
        architecture?: pulumi.Input<string>;
        cores?: pulumi.Input<number>;
        units?: pulumi.Input<number>;
    }

    export interface ContainerDisk {
        datastoreId?: pulumi.Input<string>;
        size?: pulumi.Input<number>;
    }

    export interface ContainerFeatures {
        nesting?: pulumi.Input<boolean>;
    }

    export interface ContainerInitialization {
        dns?: pulumi.Input<inputs.CT.ContainerInitializationDns>;
        hostname?: pulumi.Input<string>;
        ipConfigs?: pulumi.Input<pulumi.Input<inputs.CT.ContainerInitializationIpConfig>[]>;
        userAccount?: pulumi.Input<inputs.CT.ContainerInitializationUserAccount>;
    }

    export interface ContainerInitializationDns {
        domain?: pulumi.Input<string>;
        server?: pulumi.Input<string>;
    }

    export interface ContainerInitializationIpConfig {
        ipv4?: pulumi.Input<inputs.CT.ContainerInitializationIpConfigIpv4>;
        ipv6?: pulumi.Input<inputs.CT.ContainerInitializationIpConfigIpv6>;
    }

    export interface ContainerInitializationIpConfigIpv4 {
        address?: pulumi.Input<string>;
        gateway?: pulumi.Input<string>;
    }

    export interface ContainerInitializationIpConfigIpv6 {
        address?: pulumi.Input<string>;
        gateway?: pulumi.Input<string>;
    }

    export interface ContainerInitializationUserAccount {
        keys?: pulumi.Input<pulumi.Input<string>[]>;
        password?: pulumi.Input<string>;
    }

    export interface ContainerMemory {
        dedicated?: pulumi.Input<number>;
        swap?: pulumi.Input<number>;
    }

    export interface ContainerNetworkInterface {
        bridge?: pulumi.Input<string>;
        enabled?: pulumi.Input<boolean>;
        macAddress?: pulumi.Input<string>;
        mtu?: pulumi.Input<number>;
        name: pulumi.Input<string>;
        rateLimit?: pulumi.Input<number>;
        vlanId?: pulumi.Input<number>;
    }

    export interface ContainerOperatingSystem {
        templateFileId: pulumi.Input<string>;
        type?: pulumi.Input<string>;
    }
}

export namespace Cluster {
    export interface ClusterIPSetCidr {
        comment?: pulumi.Input<string>;
        name: pulumi.Input<string>;
        nomatch?: pulumi.Input<boolean>;
    }
}

export namespace Permission {
    export interface GroupAcl {
        path: pulumi.Input<string>;
        propagate?: pulumi.Input<boolean>;
        roleId: pulumi.Input<string>;
    }

    export interface PoolMember {
        datastoreId?: pulumi.Input<string>;
        id?: pulumi.Input<string>;
        nodeName?: pulumi.Input<string>;
        type?: pulumi.Input<string>;
        vmId?: pulumi.Input<number>;
    }

    export interface UserAcl {
        path: pulumi.Input<string>;
        propagate?: pulumi.Input<boolean>;
        roleId: pulumi.Input<string>;
    }
}

export namespace Storage {
    export interface FileSourceFile {
        changed?: pulumi.Input<boolean>;
        checksum?: pulumi.Input<string>;
        fileName?: pulumi.Input<string>;
        insecure?: pulumi.Input<boolean>;
        path: pulumi.Input<string>;
    }

    export interface FileSourceRaw {
        data: pulumi.Input<string>;
        fileName: pulumi.Input<string>;
        resize?: pulumi.Input<number>;
    }
}

export namespace VM {
    export interface VirtualMachineAgent {
        enabled?: pulumi.Input<boolean>;
        timeout?: pulumi.Input<string>;
        trim?: pulumi.Input<boolean>;
        type?: pulumi.Input<string>;
    }

    export interface VirtualMachineAudioDevice {
        device?: pulumi.Input<string>;
        driver?: pulumi.Input<string>;
        enabled?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineCdrom {
        enabled?: pulumi.Input<boolean>;
        fileId?: pulumi.Input<string>;
    }

    export interface VirtualMachineClone {
        datastoreId?: pulumi.Input<string>;
        full?: pulumi.Input<boolean>;
        nodeName?: pulumi.Input<string>;
        retries?: pulumi.Input<number>;
        vmId: pulumi.Input<number>;
    }

    export interface VirtualMachineCpu {
        architecture?: pulumi.Input<string>;
        cores?: pulumi.Input<number>;
        flags?: pulumi.Input<pulumi.Input<string>[]>;
        hotplugged?: pulumi.Input<number>;
        sockets?: pulumi.Input<number>;
        type?: pulumi.Input<string>;
        units?: pulumi.Input<number>;
    }

    export interface VirtualMachineDisk {
        datastoreId?: pulumi.Input<string>;
        discard?: pulumi.Input<string>;
        fileFormat?: pulumi.Input<string>;
        fileId?: pulumi.Input<string>;
        interface: pulumi.Input<string>;
        iothread?: pulumi.Input<boolean>;
        size?: pulumi.Input<number>;
        speed?: pulumi.Input<inputs.VM.VirtualMachineDiskSpeed>;
        ssd?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineDiskSpeed {
        read?: pulumi.Input<number>;
        readBurstable?: pulumi.Input<number>;
        write?: pulumi.Input<number>;
        writeBurstable?: pulumi.Input<number>;
    }

    export interface VirtualMachineHostpci {
        device: pulumi.Input<string>;
        id: pulumi.Input<string>;
        mdev?: pulumi.Input<string>;
        pcie?: pulumi.Input<boolean>;
        romFile?: pulumi.Input<string>;
        rombar?: pulumi.Input<boolean>;
        xvga?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineInitialization {
        datastoreId?: pulumi.Input<string>;
        dns?: pulumi.Input<inputs.VM.VirtualMachineInitializationDns>;
        ipConfigs?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfig>[]>;
        networkDataFileId?: pulumi.Input<string>;
        type?: pulumi.Input<string>;
        userAccount?: pulumi.Input<inputs.VM.VirtualMachineInitializationUserAccount>;
        userDataFileId?: pulumi.Input<string>;
        vendorDataFileId?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationDns {
        domain?: pulumi.Input<string>;
        server?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationIpConfig {
        ipv4?: pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfigIpv4>;
        ipv6?: pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfigIpv6>;
    }

    export interface VirtualMachineInitializationIpConfigIpv4 {
        address?: pulumi.Input<string>;
        gateway?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationIpConfigIpv6 {
        address?: pulumi.Input<string>;
        gateway?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationUserAccount {
        keys?: pulumi.Input<pulumi.Input<string>[]>;
        password?: pulumi.Input<string>;
        username?: pulumi.Input<string>;
    }

    export interface VirtualMachineMemory {
        dedicated?: pulumi.Input<number>;
        floating?: pulumi.Input<number>;
        shared?: pulumi.Input<number>;
    }

    export interface VirtualMachineNetworkDevice {
        bridge?: pulumi.Input<string>;
        enabled?: pulumi.Input<boolean>;
        macAddress?: pulumi.Input<string>;
        model?: pulumi.Input<string>;
        mtu?: pulumi.Input<number>;
        rateLimit?: pulumi.Input<number>;
        vlanId?: pulumi.Input<number>;
    }

    export interface VirtualMachineOperatingSystem {
        type?: pulumi.Input<string>;
    }

    export interface VirtualMachineSerialDevice {
        device?: pulumi.Input<string>;
    }

    export interface VirtualMachineVga {
        enabled?: pulumi.Input<boolean>;
        memory?: pulumi.Input<number>;
        type?: pulumi.Input<string>;
    }
}

export namespace config {
}
