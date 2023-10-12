// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineHostpciArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The device (defaults to `socket`).
        /// - `/dev/*` - A host serial device.
        /// </summary>
        [Input("device", required: true)]
        public Input<string> Device { get; set; } = null!;

        /// <summary>
        /// The PCI device ID. Use either this or `mapping`.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The resource mapping name of the device, for
        /// example gpu. Use either this or `id`.
        /// </summary>
        [Input("mapping")]
        public Input<string>? Mapping { get; set; }

        /// <summary>
        /// The mediated device ID to use.
        /// </summary>
        [Input("mdev")]
        public Input<string>? Mdev { get; set; }

        /// <summary>
        /// Tells Proxmox to use a PCIe or PCI port. Some
        /// guests/device combination require PCIe rather than PCI. PCIe is only
        /// available for q35 machine types.
        /// </summary>
        [Input("pcie")]
        public Input<bool>? Pcie { get; set; }

        /// <summary>
        /// A path to a ROM file for the device to use. This
        /// is a relative path under `/usr/share/kvm/`.
        /// </summary>
        [Input("romFile")]
        public Input<string>? RomFile { get; set; }

        /// <summary>
        /// Makes the firmware ROM visible for the VM (defaults
        /// to `true`).
        /// </summary>
        [Input("rombar")]
        public Input<bool>? Rombar { get; set; }

        /// <summary>
        /// Marks the PCI(e) device as the primary GPU of the VM.
        /// With this enabled the `vga` configuration argument will be ignored.
        /// </summary>
        [Input("xvga")]
        public Input<bool>? Xvga { get; set; }

        public VirtualMachineHostpciArgs()
        {
        }
        public static new VirtualMachineHostpciArgs Empty => new VirtualMachineHostpciArgs();
    }
}
