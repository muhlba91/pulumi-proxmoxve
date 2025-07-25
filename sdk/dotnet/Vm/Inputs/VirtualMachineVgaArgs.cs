// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineVgaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable VNC clipboard by setting to `vnc`. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information.
        /// </summary>
        [Input("clipboard")]
        public Input<string>? Clipboard { get; set; }

        /// <summary>
        /// The VGA memory in megabytes (defaults to `16`).
        /// </summary>
        [Input("memory")]
        public Input<int>? Memory { get; set; }

        /// <summary>
        /// The VGA type (defaults to `std`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public VirtualMachineVgaArgs()
        {
        }
        public static new VirtualMachineVgaArgs Empty => new VirtualMachineVgaArgs();
    }
}
