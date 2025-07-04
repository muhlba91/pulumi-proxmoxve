// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineMemory
    {
        /// <summary>
        /// The dedicated memory in megabytes (defaults to `512`).
        /// </summary>
        public readonly int? Dedicated;
        /// <summary>
        /// The floating memory in megabytes. The default is `0`, which disables "ballooning device" for the VM.
        /// Please note that Proxmox has ballooning enabled by default. To enable it, set `floating` to the same value as `dedicated`.
        /// See [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_memory) section 10.2.6 for more information.
        /// </summary>
        public readonly int? Floating;
        /// <summary>
        /// Enable/disable hugepages memory (defaults to disable).
        /// </summary>
        public readonly string? Hugepages;
        /// <summary>
        /// Keep hugepages memory after the VM is stopped (defaults to `false`).
        /// 
        /// Settings `hugepages` and `keep_hugepages` are only allowed for `root@pam` authenticated user.
        /// And required `cpu.numa` to be enabled.
        /// </summary>
        public readonly bool? KeepHugepages;
        /// <summary>
        /// The shared memory in megabytes (defaults to `0`).
        /// </summary>
        public readonly int? Shared;

        [OutputConstructor]
        private VirtualMachineMemory(
            int? dedicated,

            int? floating,

            string? hugepages,

            bool? keepHugepages,

            int? shared)
        {
            Dedicated = dedicated;
            Floating = floating;
            Hugepages = hugepages;
            KeepHugepages = keepHugepages;
            Shared = shared;
        }
    }
}
