// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachine2CpuArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("affinity")]
        public Input<string>? Affinity { get; set; }

        /// <summary>
        /// The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// The number of CPU cores per socket (defaults to `1`).
        /// </summary>
        [Input("cores")]
        public Input<int>? Cores { get; set; }

        [Input("flags")]
        private InputList<string>? _flags;

        /// <summary>
        /// Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
        /// </summary>
        public InputList<string> Flags
        {
            get => _flags ?? (_flags = new InputList<string>());
            set => _flags = value;
        }

        /// <summary>
        /// The number of hotplugged vCPUs (defaults to `0`).
        /// </summary>
        [Input("hotplugged")]
        public Input<int>? Hotplugged { get; set; }

        /// <summary>
        /// Limit of CPU usage (defaults to `0` which means no limit).
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// Enable NUMA (defaults to `false`).
        /// </summary>
        [Input("numa")]
        public Input<bool>? Numa { get; set; }

        /// <summary>
        /// The number of CPU sockets (defaults to `1`).
        /// </summary>
        [Input("sockets")]
        public Input<int>? Sockets { get; set; }

        /// <summary>
        /// Emulated CPU type, it's recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
        /// </summary>
        [Input("units")]
        public Input<int>? Units { get; set; }

        public VirtualMachine2CpuArgs()
        {
        }
        public static new VirtualMachine2CpuArgs Empty => new VirtualMachine2CpuArgs();
    }
}
