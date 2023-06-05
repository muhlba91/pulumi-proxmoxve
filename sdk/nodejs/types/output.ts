// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface GetHostsEntry {
    address: string;
    hostnames: string[];
}

export interface HostsEntry {
    address: string;
    hostnames: string[];
}

export namespace CT {
    export interface ContainerClone {
        datastoreId?: string;
        nodeName?: string;
        vmId: number;
    }

    export interface ContainerConsole {
        enabled?: boolean;
        ttyCount?: number;
        type?: string;
    }

    export interface ContainerCpu {
        architecture?: string;
        cores?: number;
        units?: number;
    }

    export interface ContainerDisk {
        datastoreId?: string;
        size?: number;
    }

    export interface ContainerFeatures {
        nesting?: boolean;
    }

    export interface ContainerInitialization {
        dns?: outputs.CT.ContainerInitializationDns;
        hostname?: string;
        ipConfigs?: outputs.CT.ContainerInitializationIpConfig[];
        userAccount?: outputs.CT.ContainerInitializationUserAccount;
    }

    export interface ContainerInitializationDns {
        domain?: string;
        server?: string;
    }

    export interface ContainerInitializationIpConfig {
        ipv4?: outputs.CT.ContainerInitializationIpConfigIpv4;
        ipv6?: outputs.CT.ContainerInitializationIpConfigIpv6;
    }

    export interface ContainerInitializationIpConfigIpv4 {
        address?: string;
        gateway?: string;
    }

    export interface ContainerInitializationIpConfigIpv6 {
        address?: string;
        gateway?: string;
    }

    export interface ContainerInitializationUserAccount {
        keys?: string[];
        password?: string;
    }

    export interface ContainerMemory {
        dedicated?: number;
        swap?: number;
    }

    export interface ContainerNetworkInterface {
        bridge?: string;
        enabled?: boolean;
        firewall?: boolean;
        macAddress?: string;
        mtu?: number;
        name: string;
        rateLimit?: number;
        vlanId?: number;
    }

    export interface ContainerOperatingSystem {
        templateFileId: string;
        type?: string;
    }

}

export namespace Network {
    export interface FirewallIPSetCidr {
        comment?: string;
        name: string;
        nomatch?: boolean;
    }

    export interface FirewallLogRatelimit {
        burst?: number;
        enabled?: boolean;
        rate?: string;
    }

    export interface FirewallRulesRule {
        action?: string;
        comment?: string;
        dest?: string;
        dport?: string;
        enabled?: boolean;
        iface?: string;
        log?: string;
        macro?: string;
        pos: number;
        proto?: string;
        securityGroup?: string;
        source?: string;
        sport?: string;
        type?: string;
    }

    export interface FirewallSecurityGroupRule {
        action?: string;
        comment?: string;
        dest?: string;
        dport?: string;
        enabled?: boolean;
        iface?: string;
        log?: string;
        macro?: string;
        pos: number;
        proto?: string;
        securityGroup?: string;
        source?: string;
        sport?: string;
        type?: string;
    }

}

export namespace Permission {
    export interface GetGroupAcl {
        path: string;
        propagate: boolean;
        roleId: string;
    }

    export interface GetPoolMember {
        datastoreId: string;
        id: string;
        nodeName: string;
        type: string;
        vmId: number;
    }

    export interface GetUserAcl {
        path: string;
        propagate: boolean;
        roleId: string;
    }

    export interface GroupAcl {
        path: string;
        propagate?: boolean;
        roleId: string;
    }

    export interface PoolMember {
        datastoreId: string;
        id: string;
        nodeName: string;
        type: string;
        vmId: number;
    }

    export interface UserAcl {
        path: string;
        propagate?: boolean;
        roleId: string;
    }

}

export namespace Storage {
    export interface FileSourceFile {
        changed?: boolean;
        checksum?: string;
        fileName?: string;
        insecure?: boolean;
        path: string;
    }

    export interface FileSourceRaw {
        data: string;
        fileName: string;
        resize?: number;
    }

}

export namespace VM {
    export interface GetVirtualMachinesVm {
        name: string;
        nodeName: string;
        tags: string[];
        vmId: number;
    }

    export interface VirtualMachineAgent {
        enabled?: boolean;
        timeout?: string;
        trim?: boolean;
        type?: string;
    }

    export interface VirtualMachineAudioDevice {
        device?: string;
        driver?: string;
        enabled?: boolean;
    }

    export interface VirtualMachineCdrom {
        enabled?: boolean;
        fileId?: string;
    }

    export interface VirtualMachineClone {
        datastoreId?: string;
        full?: boolean;
        nodeName?: string;
        retries?: number;
        vmId: number;
    }

    export interface VirtualMachineCpu {
        architecture?: string;
        cores?: number;
        flags?: string[];
        hotplugged?: number;
        sockets?: number;
        type?: string;
        units?: number;
    }

    export interface VirtualMachineDisk {
        datastoreId?: string;
        discard?: string;
        fileFormat: string;
        fileId?: string;
        interface: string;
        iothread?: boolean;
        size?: number;
        speed?: outputs.VM.VirtualMachineDiskSpeed;
        ssd?: boolean;
    }

    export interface VirtualMachineDiskSpeed {
        read?: number;
        readBurstable?: number;
        write?: number;
        writeBurstable?: number;
    }

    export interface VirtualMachineHostpci {
        device: string;
        id: string;
        mdev?: string;
        pcie?: boolean;
        romFile?: string;
        rombar?: boolean;
        xvga?: boolean;
    }

    export interface VirtualMachineInitialization {
        datastoreId?: string;
        dns?: outputs.VM.VirtualMachineInitializationDns;
        ipConfigs?: outputs.VM.VirtualMachineInitializationIpConfig[];
        networkDataFileId?: string;
        type?: string;
        userAccount?: outputs.VM.VirtualMachineInitializationUserAccount;
        userDataFileId?: string;
        vendorDataFileId?: string;
    }

    export interface VirtualMachineInitializationDns {
        domain?: string;
        server?: string;
    }

    export interface VirtualMachineInitializationIpConfig {
        ipv4?: outputs.VM.VirtualMachineInitializationIpConfigIpv4;
        ipv6?: outputs.VM.VirtualMachineInitializationIpConfigIpv6;
    }

    export interface VirtualMachineInitializationIpConfigIpv4 {
        address?: string;
        gateway?: string;
    }

    export interface VirtualMachineInitializationIpConfigIpv6 {
        address?: string;
        gateway?: string;
    }

    export interface VirtualMachineInitializationUserAccount {
        keys?: string[];
        password?: string;
        username?: string;
    }

    export interface VirtualMachineMemory {
        dedicated?: number;
        floating?: number;
        shared?: number;
    }

    export interface VirtualMachineNetworkDevice {
        bridge?: string;
        enabled?: boolean;
        firewall?: boolean;
        macAddress: string;
        model?: string;
        mtu?: number;
        rateLimit?: number;
        vlanId?: number;
    }

    export interface VirtualMachineOperatingSystem {
        type?: string;
    }

    export interface VirtualMachineSerialDevice {
        device?: string;
    }

    export interface VirtualMachineVga {
        enabled?: boolean;
        memory?: number;
        type?: string;
    }

}

export namespace config {
    export interface Ssh {
        agent?: boolean;
        agentSocket?: string;
        node?: outputs.config.SshNode;
        password?: string;
        username?: string;
    }

    export interface SshNode {
        address: string;
        name: string;
    }

    export interface VirtualEnvironment {
        apiToken?: string;
        endpoint?: string;
        insecure?: boolean;
        otp?: string;
        password?: string;
        ssh?: outputs.config.VirtualEnvironmentSsh;
        username?: string;
    }

    export interface VirtualEnvironmentSsh {
        agent?: boolean;
        agentSocket?: string;
        node?: outputs.config.VirtualEnvironmentSshNode;
        password?: string;
        username?: string;
    }

    export interface VirtualEnvironmentSshNode {
        address: string;
        name: string;
    }

}
