// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface HostsEntry {
    /**
     * The IP address.
     */
    address: pulumi.Input<string>;
    /**
     * The hostnames.
     */
    hostnames: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ProviderSsh {
    agent?: pulumi.Input<boolean>;
    agentSocket?: pulumi.Input<string>;
    nodes?: pulumi.Input<pulumi.Input<inputs.ProviderSshNode>[]>;
    password?: pulumi.Input<string>;
    username?: pulumi.Input<string>;
}

export interface ProviderSshNode {
    address: pulumi.Input<string>;
    name: pulumi.Input<string>;
    port?: pulumi.Input<number>;
}
export namespace CT {
    export interface ContainerClone {
        /**
         * The identifier for the datastore to create the
         * disk in (defaults to `local`).
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * The name of the node to assign the container to.
         */
        nodeName?: pulumi.Input<string>;
        /**
         * The container identifier
         */
        vmId: pulumi.Input<number>;
    }

    export interface ContainerConsole {
        /**
         * Whether to enable the network device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * The number of available TTY (defaults to `2`).
         */
        ttyCount?: pulumi.Input<number>;
        /**
         * The type (defaults to `unmanaged`).
         */
        type?: pulumi.Input<string>;
    }

    export interface ContainerCpu {
        /**
         * The CPU architecture (defaults to `amd64`).
         */
        architecture?: pulumi.Input<string>;
        /**
         * The number of CPU cores (defaults to `1`).
         */
        cores?: pulumi.Input<number>;
        /**
         * The CPU units (defaults to `1024`).
         */
        units?: pulumi.Input<number>;
    }

    export interface ContainerDisk {
        /**
         * The identifier for the datastore to create the
         * disk in (defaults to `local`).
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * Volume size (only for ZFS storage backed mount points).
         * Can be specified with a unit suffix (e.g. `10G`).
         */
        size?: pulumi.Input<number>;
    }

    export interface ContainerFeatures {
        /**
         * Whether the container supports FUSE mounts (defaults
         * to `false`)
         */
        fuse?: pulumi.Input<boolean>;
        /**
         * Whether the container supports `keyctl()` system
         * call (defaults to `false`)
         */
        keyctl?: pulumi.Input<boolean>;
        /**
         * Whether the container is nested (defaults
         * to `false`)
         */
        nesting?: pulumi.Input<boolean>;
    }

    export interface ContainerInitialization {
        /**
         * The DNS configuration.
         */
        dns?: pulumi.Input<inputs.CT.ContainerInitializationDns>;
        /**
         * The hostname.
         */
        hostname?: pulumi.Input<string>;
        /**
         * The IP configuration (one block per network
         * device).
         */
        ipConfigs?: pulumi.Input<pulumi.Input<inputs.CT.ContainerInitializationIpConfig>[]>;
        /**
         * The user account configuration.
         */
        userAccount?: pulumi.Input<inputs.CT.ContainerInitializationUserAccount>;
    }

    export interface ContainerInitializationDns {
        /**
         * The DNS search domain.
         */
        domain?: pulumi.Input<string>;
        /**
         * The DNS server.
         */
        server?: pulumi.Input<string>;
    }

    export interface ContainerInitializationIpConfig {
        /**
         * The IPv4 configuration.
         */
        ipv4?: pulumi.Input<inputs.CT.ContainerInitializationIpConfigIpv4>;
        /**
         * The IPv4 configuration.
         */
        ipv6?: pulumi.Input<inputs.CT.ContainerInitializationIpConfigIpv6>;
    }

    export interface ContainerInitializationIpConfigIpv4 {
        /**
         * The IPv6 address (use `dhcp` for
         * autodiscovery).
         */
        address?: pulumi.Input<string>;
        /**
         * The IPv6 gateway (must be omitted
         * when `dhcp` is used as the address).
         */
        gateway?: pulumi.Input<string>;
    }

    export interface ContainerInitializationIpConfigIpv6 {
        /**
         * The IPv6 address (use `dhcp` for
         * autodiscovery).
         */
        address?: pulumi.Input<string>;
        /**
         * The IPv6 gateway (must be omitted
         * when `dhcp` is used as the address).
         */
        gateway?: pulumi.Input<string>;
    }

    export interface ContainerInitializationUserAccount {
        /**
         * The SSH keys for the root account.
         */
        keys?: pulumi.Input<pulumi.Input<string>[]>;
        /**
         * The password for the root account.
         */
        password?: pulumi.Input<string>;
    }

    export interface ContainerMemory {
        /**
         * The dedicated memory in megabytes (defaults
         * to `512`).
         */
        dedicated?: pulumi.Input<number>;
        /**
         * The swap size in megabytes (defaults to `0`).
         */
        swap?: pulumi.Input<number>;
    }

    export interface ContainerMountPoint {
        /**
         * Explicitly enable or disable ACL support.
         */
        acl?: pulumi.Input<boolean>;
        /**
         * Whether to include the mount point in backups (only
         * used for volume mount points).
         */
        backup?: pulumi.Input<boolean>;
        /**
         * List of extra mount options.
         */
        mountOptions?: pulumi.Input<pulumi.Input<string>[]>;
        /**
         * Path to the mount point as seen from inside the
         * container.
         */
        path: pulumi.Input<string>;
        /**
         * Enable user quotas inside the container (not supported
         * with ZFS subvolumes).
         */
        quota?: pulumi.Input<boolean>;
        /**
         * Read-only mount point.
         */
        readOnly?: pulumi.Input<boolean>;
        /**
         * Will include this volume to a storage replica job.
         */
        replicate?: pulumi.Input<boolean>;
        /**
         * Mark this non-volume mount point as available on all
         * nodes.
         */
        shared?: pulumi.Input<boolean>;
        /**
         * Volume size (only for ZFS storage backed mount points).
         * Can be specified with a unit suffix (e.g. `10G`).
         */
        size?: pulumi.Input<string>;
        /**
         * Volume, device or directory to mount into the
         * container.
         */
        volume: pulumi.Input<string>;
    }

    export interface ContainerNetworkInterface {
        /**
         * The name of the network bridge (defaults
         * to `vmbr0`).
         */
        bridge?: pulumi.Input<string>;
        /**
         * Whether to enable the network device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * Whether this interface's firewall rules should be
         * used (defaults to `false`).
         */
        firewall?: pulumi.Input<boolean>;
        /**
         * The MAC address.
         */
        macAddress?: pulumi.Input<string>;
        /**
         * Maximum transfer unit of the interface. Cannot be
         * larger than the bridge's MTU.
         */
        mtu?: pulumi.Input<number>;
        /**
         * The network interface name.
         */
        name: pulumi.Input<string>;
        /**
         * The rate limit in megabytes per second.
         */
        rateLimit?: pulumi.Input<number>;
        /**
         * The VLAN identifier.
         */
        vlanId?: pulumi.Input<number>;
    }

    export interface ContainerOperatingSystem {
        /**
         * The identifier for an OS template file.
         */
        templateFileId: pulumi.Input<string>;
        /**
         * The type (defaults to `unmanaged`).
         */
        type?: pulumi.Input<string>;
    }
}

export namespace Network {
    export interface FirewallIPSetCidr {
        /**
         * Arbitrary string annotation.
         */
        comment?: pulumi.Input<string>;
        /**
         * Network/IP specification in CIDR format.
         */
        name: pulumi.Input<string>;
        /**
         * Entries marked as `nomatch` are skipped as if those
         * were not added to the set.
         */
        nomatch?: pulumi.Input<boolean>;
    }

    export interface FirewallLogRatelimit {
        /**
         * Initial burst of packages which will always get
         * logged before the rate is applied (defaults to `5`).
         */
        burst?: pulumi.Input<number>;
        /**
         * Enable or disable the log rate limit.
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * Frequency with which the burst bucket gets refilled (defaults to `1/second`).
         */
        rate?: pulumi.Input<string>;
    }

    export interface FirewallRulesRule {
        /**
         * Rule action (`ACCEPT`, `DROP`, `REJECT`).
         */
        action?: pulumi.Input<string>;
        /**
         * Rule comment.
         */
        comment?: pulumi.Input<string>;
        /**
         * Restrict packet destination address. This can
         * refer to a single IP address, an IP set ('+ipsetname') or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         */
        dest?: pulumi.Input<string>;
        /**
         * Restrict TCP/UDP destination port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with '\d+:\d+', for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         */
        dport?: pulumi.Input<string>;
        /**
         * Enable this rule. Defaults to `true`.
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * Network interface name. You have to use network
         * configuration key names for VMs and containers ('net\d+'). Host
         * related rules can use arbitrary strings.
         */
        iface?: pulumi.Input<string>;
        /**
         * Log level for this rule (`emerg`, `alert`, `crit`,
         * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
         */
        log?: pulumi.Input<string>;
        /**
         * Macro name. Use predefined standard macro
         * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
         */
        macro?: pulumi.Input<string>;
        /**
         * Position of the rule in the list.
         */
        pos?: pulumi.Input<number>;
        /**
         * Restrict packet protocol. You can use protocol
         * names as defined in '/etc/protocols'.
         */
        proto?: pulumi.Input<string>;
        /**
         * Security group name.
         */
        securityGroup?: pulumi.Input<string>;
        /**
         * Restrict packet source address. This can refer
         * to a single IP address, an IP set ('+ipsetname') or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         */
        source?: pulumi.Input<string>;
        /**
         * Restrict TCP/UDP source port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with '\d+:\d+', for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         * - a security group insertion block, which includes the following arguments:
         */
        sport?: pulumi.Input<string>;
        /**
         * Rule type (`in`, `out`).
         */
        type?: pulumi.Input<string>;
    }

    export interface FirewallSecurityGroupRule {
        /**
         * Rule action (`ACCEPT`, `DROP`, `REJECT`).
         */
        action?: pulumi.Input<string>;
        /**
         * Rule comment.
         */
        comment?: pulumi.Input<string>;
        /**
         * Restrict packet destination address. This can refer to
         * a single IP address, an IP set ('+ipsetname') or an IP alias definition.
         * You can also specify an address range like `20.34.101.207-201.3.9.99`, or
         * a list of IP addresses and networks (entries are separated by comma).
         * Please do not mix IPv4 and IPv6 addresses inside such lists.
         */
        dest?: pulumi.Input<string>;
        /**
         * Restrict TCP/UDP destination port. You can use
         * service names or simple numbers (0-65535), as defined in '/etc/services'.
         * Port ranges can be specified with '\d+:\d+', for example `80:85`, and
         * you can use comma separated list to match several ports or ranges.
         */
        dport?: pulumi.Input<string>;
        enabled?: pulumi.Input<boolean>;
        /**
         * Network interface name. You have to use network
         * configuration key names for VMs and containers ('net\d+'). Host related
         * rules can use arbitrary strings.
         */
        iface?: pulumi.Input<string>;
        /**
         * Log level for this rule (`emerg`, `alert`, `crit`,
         * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
         */
        log?: pulumi.Input<string>;
        /**
         * Macro name. Use predefined standard macro
         * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
         */
        macro?: pulumi.Input<string>;
        /**
         * Position of the rule in the list.
         */
        pos?: pulumi.Input<number>;
        /**
         * Restrict packet protocol. You can use protocol names
         * as defined in '/etc/protocols'.
         */
        proto?: pulumi.Input<string>;
        securityGroup?: pulumi.Input<string>;
        /**
         * Restrict packet source address. This can refer
         * to a single IP address, an IP set ('+ipsetname') or an IP alias
         * definition. You can also specify an address range like
         * `20.34.101.207-201.3.9.99`, or a list of IP addresses and networks (
         * entries are separated by comma). Please do not mix IPv4 and IPv6 addresses
         * inside such lists.
         */
        source?: pulumi.Input<string>;
        /**
         * Restrict TCP/UDP source port. You can use
         * service names or simple numbers (0-65535), as defined in '/etc/services'.
         * Port ranges can be specified with '\d+:\d+', for example `80:85`, and
         * you can use comma separated list to match several ports or ranges.
         */
        sport?: pulumi.Input<string>;
        /**
         * Rule type (`in`, `out`).
         */
        type?: pulumi.Input<string>;
    }
}

export namespace Permission {
    export interface GroupAcl {
        /**
         * The path.
         */
        path: pulumi.Input<string>;
        /**
         * Whether to propagate to child paths.
         */
        propagate?: pulumi.Input<boolean>;
        /**
         * The role identifier.
         */
        roleId: pulumi.Input<string>;
    }

    export interface PoolMember {
        /**
         * The datastore identifier.
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * The member identifier.
         */
        id?: pulumi.Input<string>;
        /**
         * The node name.
         */
        nodeName?: pulumi.Input<string>;
        /**
         * The member type.
         */
        type?: pulumi.Input<string>;
        /**
         * The virtual machine identifier.
         */
        vmId?: pulumi.Input<number>;
    }

    export interface UserAcl {
        /**
         * The path.
         */
        path: pulumi.Input<string>;
        /**
         * Whether to propagate to child paths.
         */
        propagate?: pulumi.Input<boolean>;
        /**
         * The role identifier.
         */
        roleId: pulumi.Input<string>;
    }
}

export namespace Storage {
    export interface FileSourceFile {
        changed?: pulumi.Input<boolean>;
        /**
         * The SHA256 checksum of the source file.
         */
        checksum?: pulumi.Input<string>;
        /**
         * The file name.
         */
        fileName?: pulumi.Input<string>;
        /**
         * Whether to skip the TLS verification step for
         * HTTPS sources (defaults to `false`).
         */
        insecure?: pulumi.Input<boolean>;
        /**
         * A path to a local file or a URL.
         */
        path: pulumi.Input<string>;
    }

    export interface FileSourceRaw {
        /**
         * The raw data.
         */
        data: pulumi.Input<string>;
        /**
         * The file name.
         */
        fileName: pulumi.Input<string>;
        /**
         * The number of bytes to resize the file to.
         */
        resize?: pulumi.Input<number>;
    }
}

export namespace VM {
    export interface VirtualMachineAgent {
        /**
         * Whether to enable the VGA device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * The maximum amount of time to wait for data from
         * the QEMU agent to become available ( defaults to `15m`).
         */
        timeout?: pulumi.Input<string>;
        /**
         * Whether to enable the FSTRIM feature in the QEMU agent
         * (defaults to `false`).
         */
        trim?: pulumi.Input<boolean>;
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
    }

    export interface VirtualMachineAudioDevice {
        /**
         * The device (defaults to `socket`).
         * - `/dev/*` - A host serial device.
         */
        device?: pulumi.Input<string>;
        /**
         * The driver (defaults to `spice`).
         */
        driver?: pulumi.Input<string>;
        /**
         * Whether to enable the VGA device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineCdrom {
        /**
         * Whether to enable the VGA device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * The file ID for a disk image (experimental -
         * might cause high CPU utilization during import, especially with large
         * disk images).
         */
        fileId?: pulumi.Input<string>;
        /**
         * The hardware interface to connect the cloud-init
         * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
         * detected if the setting is missing but a cloud-init image is present,
         * otherwise defaults to `ide2`.
         */
        interface?: pulumi.Input<string>;
    }

    export interface VirtualMachineClone {
        /**
         * The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         */
        datastoreId?: pulumi.Input<string>;
        full?: pulumi.Input<boolean>;
        /**
         * The name of the node to assign the virtual machine
         * to.
         */
        nodeName?: pulumi.Input<string>;
        /**
         * Number of retries in Proxmox for clone vm.
         * Sometimes Proxmox errors with timeout when creating multiple clones at
         * once.
         */
        retries?: pulumi.Input<number>;
        /**
         * The VM identifier.
         */
        vmId: pulumi.Input<number>;
    }

    export interface VirtualMachineCpu {
        /**
         * The CPU architecture (defaults to `x8664`).
         */
        architecture?: pulumi.Input<string>;
        /**
         * The number of CPU cores (defaults to `1`).
         */
        cores?: pulumi.Input<number>;
        /**
         * The CPU flags.
         * - `+aes`/`-aes` - Activate AES instruction set for HW acceleration.
         * - `+amd-no-ssb`/`-amd-no-ssb` - Notifies guest OS that host is not
         * vulnerable for Spectre on AMD CPUs.
         * - `+amd-ssbd`/`-amd-ssbd` - Improves Spectre mitigation performance with
         * AMD CPUs, best used with "virt-ssbd".
         * - `+hv-evmcs`/`-hv-evmcs` - Improve performance for nested
         * virtualization (only supported on Intel CPUs).
         * - `+hv-tlbflush`/`-hv-tlbflush` - Improve performance in overcommitted
         * Windows guests (may lead to guest BSOD on old CPUs).
         * - `+ibpb`/`-ibpb` - Allows improved Spectre mitigation on AMD CPUs.
         * - `+md-clear`/`-md-clear` - Required to let the guest OS know if MDS is
         * mitigated correctly.
         * - `+pcid`/`-pcid` - Meltdown fix cost reduction on Westmere, Sandy- and
         * Ivy Bridge Intel CPUs.
         * - `+pdpe1gb`/`-pdpe1gb` - Allows guest OS to use 1 GB size pages, if
         * host HW supports it.
         * - `+spec-ctrl`/`-spec-ctrl` - Allows improved Spectre mitigation with
         * Intel CPUs.
         * - `+ssbd`/`-ssbd` - Protection for "Speculative Store Bypass" for Intel
         * models.
         * - `+virt-ssbd`/`-virt-ssbd` - Basis for "Speculative Store Bypass"
         * protection for AMD models.
         */
        flags?: pulumi.Input<pulumi.Input<string>[]>;
        /**
         * The number of hotplugged vCPUs (defaults
         * to `0`).
         */
        hotplugged?: pulumi.Input<number>;
        /**
         * Enable/disable NUMA. (default to `false`)
         */
        numa?: pulumi.Input<boolean>;
        /**
         * The number of CPU sockets (defaults to `1`).
         */
        sockets?: pulumi.Input<number>;
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
        /**
         * The CPU units (defaults to `1024`).
         */
        units?: pulumi.Input<number>;
    }

    export interface VirtualMachineDisk {
        /**
         * The cache type (defaults to `none`).
         */
        cache?: pulumi.Input<string>;
        /**
         * The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * Whether to pass discard/trim requests to the
         * underlying storage. Supported values are `on`/`ignore` (defaults
         * to `ignore`).
         */
        discard?: pulumi.Input<string>;
        /**
         * The file format.
         */
        fileFormat?: pulumi.Input<string>;
        /**
         * The file ID for a disk image (experimental -
         * might cause high CPU utilization during import, especially with large
         * disk images).
         */
        fileId?: pulumi.Input<string>;
        /**
         * The hardware interface to connect the cloud-init
         * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
         * detected if the setting is missing but a cloud-init image is present,
         * otherwise defaults to `ide2`.
         */
        interface: pulumi.Input<string>;
        /**
         * Whether to use iothreads for this disk (defaults
         * to `false`).
         */
        iothread?: pulumi.Input<boolean>;
        /**
         * The in-datastore path to the disk image.
         * ***Experimental.***Use to attach another VM's disks,
         * or (as root only) host's filesystem paths (`datastoreId` empty string).
         * See "*Example: Attached disks*".
         */
        pathInDatastore?: pulumi.Input<string>;
        /**
         * The disk size in gigabytes (defaults to `8`).
         */
        size?: pulumi.Input<number>;
        /**
         * The speed limits.
         */
        speed?: pulumi.Input<inputs.VM.VirtualMachineDiskSpeed>;
        /**
         * Whether to use an SSD emulation option for this disk (
         * defaults to `false`). Note that SSD emulation is not supported on VirtIO
         * Block drives.
         */
        ssd?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineDiskSpeed {
        /**
         * The maximum read speed in megabytes per second.
         */
        read?: pulumi.Input<number>;
        /**
         * The maximum burstable read speed in
         * megabytes per second.
         */
        readBurstable?: pulumi.Input<number>;
        /**
         * The maximum write speed in megabytes per second.
         */
        write?: pulumi.Input<number>;
        /**
         * The maximum burstable write speed in
         * megabytes per second.
         */
        writeBurstable?: pulumi.Input<number>;
    }

    export interface VirtualMachineEfiDisk {
        /**
         * The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * The file format.
         */
        fileFormat?: pulumi.Input<string>;
        /**
         * Use am EFI vars template with
         * distribution-specific and Microsoft Standard keys enrolled, if used with
         * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
         * to `false`).
         */
        preEnrolledKeys?: pulumi.Input<boolean>;
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
    }

    export interface VirtualMachineHostpci {
        /**
         * The device (defaults to `socket`).
         * - `/dev/*` - A host serial device.
         */
        device: pulumi.Input<string>;
        /**
         * The PCI device ID. Use either this or `mapping`.
         */
        id?: pulumi.Input<string>;
        /**
         * The resource mapping name of the device, for
         * example gpu. Use either this or `id`.
         */
        mapping?: pulumi.Input<string>;
        /**
         * The mediated device ID to use.
         */
        mdev?: pulumi.Input<string>;
        /**
         * Tells Proxmox to use a PCIe or PCI port. Some
         * guests/device combination require PCIe rather than PCI. PCIe is only
         * available for q35 machine types.
         */
        pcie?: pulumi.Input<boolean>;
        /**
         * A path to a ROM file for the device to use. This
         * is a relative path under `/usr/share/kvm/`.
         */
        romFile?: pulumi.Input<string>;
        /**
         * Makes the firmware ROM visible for the VM (defaults
         * to `true`).
         */
        rombar?: pulumi.Input<boolean>;
        /**
         * Marks the PCI(e) device as the primary GPU of the VM.
         * With this enabled the `vga` configuration argument will be ignored.
         */
        xvga?: pulumi.Input<boolean>;
    }

    export interface VirtualMachineInitialization {
        /**
         * The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         */
        datastoreId?: pulumi.Input<string>;
        /**
         * The DNS configuration.
         */
        dns?: pulumi.Input<inputs.VM.VirtualMachineInitializationDns>;
        /**
         * The hardware interface to connect the cloud-init
         * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
         * detected if the setting is missing but a cloud-init image is present,
         * otherwise defaults to `ide2`.
         */
        interface?: pulumi.Input<string>;
        /**
         * The IP configuration (one block per network
         * device).
         */
        ipConfigs?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfig>[]>;
        /**
         * The identifier for a file containing
         * all meta data passed to the VM via cloud-init.
         */
        metaDataFileId?: pulumi.Input<string>;
        /**
         * The identifier for a file containing
         * network configuration data passed to the VM via cloud-init (conflicts
         * with `ipConfig`).
         */
        networkDataFileId?: pulumi.Input<string>;
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
        /**
         * The user account configuration (conflicts
         * with `userDataFileId`).
         */
        userAccount?: pulumi.Input<inputs.VM.VirtualMachineInitializationUserAccount>;
        /**
         * The identifier for a file containing
         * custom user data (conflicts with `userAccount`).
         */
        userDataFileId?: pulumi.Input<string>;
        /**
         * The identifier for a file containing
         * all vendor data passed to the VM via cloud-init.
         */
        vendorDataFileId?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationDns {
        /**
         * The DNS search domain.
         */
        domain?: pulumi.Input<string>;
        /**
         * The DNS server.
         */
        server?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationIpConfig {
        /**
         * The IPv4 configuration.
         */
        ipv4?: pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfigIpv4>;
        /**
         * The IPv4 configuration.
         */
        ipv6?: pulumi.Input<inputs.VM.VirtualMachineInitializationIpConfigIpv6>;
    }

    export interface VirtualMachineInitializationIpConfigIpv4 {
        /**
         * The IPv6 address (use `dhcp` for
         * autodiscovery).
         */
        address?: pulumi.Input<string>;
        /**
         * The IPv6 gateway (must be omitted
         * when `dhcp` is used as the address).
         */
        gateway?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationIpConfigIpv6 {
        /**
         * The IPv6 address (use `dhcp` for
         * autodiscovery).
         */
        address?: pulumi.Input<string>;
        /**
         * The IPv6 gateway (must be omitted
         * when `dhcp` is used as the address).
         */
        gateway?: pulumi.Input<string>;
    }

    export interface VirtualMachineInitializationUserAccount {
        /**
         * The SSH keys.
         */
        keys?: pulumi.Input<pulumi.Input<string>[]>;
        /**
         * The SSH password.
         */
        password?: pulumi.Input<string>;
        /**
         * The SSH username.
         */
        username?: pulumi.Input<string>;
    }

    export interface VirtualMachineMemory {
        /**
         * The dedicated memory in megabytes (defaults
         * to `512`).
         */
        dedicated?: pulumi.Input<number>;
        /**
         * The floating memory in megabytes (defaults
         * to `0`).
         */
        floating?: pulumi.Input<number>;
        /**
         * The shared memory in megabytes (defaults to `0`).
         */
        shared?: pulumi.Input<number>;
    }

    export interface VirtualMachineNetworkDevice {
        /**
         * The name of the network bridge (defaults
         * to `vmbr0`).
         */
        bridge?: pulumi.Input<string>;
        /**
         * Whether to enable the VGA device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * Whether this interface's firewall rules should be
         * used (defaults to `false`).
         */
        firewall?: pulumi.Input<boolean>;
        /**
         * The MAC address.
         */
        macAddress?: pulumi.Input<string>;
        /**
         * The network device model (defaults to `virtio`).
         */
        model?: pulumi.Input<string>;
        /**
         * Force MTU, for VirtIO only. Set to 1 to use the bridge
         * MTU. Cannot be larger than the bridge MTU.
         */
        mtu?: pulumi.Input<number>;
        /**
         * The number of queues for VirtIO (1..64).
         */
        queues?: pulumi.Input<number>;
        /**
         * The rate limit in megabytes per second.
         */
        rateLimit?: pulumi.Input<number>;
        /**
         * The VLAN identifier.
         */
        vlanId?: pulumi.Input<number>;
    }

    export interface VirtualMachineOperatingSystem {
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
    }

    export interface VirtualMachineSerialDevice {
        /**
         * The device (defaults to `socket`).
         * - `/dev/*` - A host serial device.
         */
        device?: pulumi.Input<string>;
    }

    export interface VirtualMachineSmbios {
        /**
         * The family string.
         */
        family?: pulumi.Input<string>;
        /**
         * The manufacturer.
         */
        manufacturer?: pulumi.Input<string>;
        /**
         * The product ID.
         */
        product?: pulumi.Input<string>;
        /**
         * The serial number.
         */
        serial?: pulumi.Input<string>;
        /**
         * The SKU number.
         */
        sku?: pulumi.Input<string>;
        /**
         * The UUID (defaults to randomly generated UUID).
         */
        uuid?: pulumi.Input<string>;
        /**
         * The version.
         */
        version?: pulumi.Input<string>;
    }

    export interface VirtualMachineStartup {
        downDelay?: pulumi.Input<number>;
        /**
         * A non-negative number defining the general startup
         * order.
         */
        order?: pulumi.Input<number>;
        upDelay?: pulumi.Input<number>;
    }

    export interface VirtualMachineVga {
        /**
         * Whether to enable the VGA device (defaults
         * to `true`).
         */
        enabled?: pulumi.Input<boolean>;
        /**
         * The VGA memory in megabytes (defaults to `16`).
         */
        memory?: pulumi.Input<number>;
        /**
         * The VGA type (defaults to `std`).
         */
        type?: pulumi.Input<string>;
    }
}

export namespace config {
}
