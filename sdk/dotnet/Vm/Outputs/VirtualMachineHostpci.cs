// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineHostpci
    {
        /// <summary>
        /// The device (defaults to `socket`).
        /// - `/dev/*` - A host serial device.
        /// </summary>
        public readonly string Device;
        /// <summary>
        /// The PCI device ID. This parameter is not compatible
        /// with `api_token` and requires the root `username` and `password`
        /// configured in the proxmox provider. Use either this or `mapping`.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The resource mapping name of the device, for
        /// example usbdevice. Use either this or `id`.
        /// </summary>
        public readonly string? Mapping;
        /// <summary>
        /// The mediated device ID to use.
        /// </summary>
        public readonly string? Mdev;
        /// <summary>
        /// Tells Proxmox to use a PCIe or PCI port. Some
        /// guests/device combination require PCIe rather than PCI. PCIe is only
        /// available for q35 machine types.
        /// </summary>
        public readonly bool? Pcie;
        /// <summary>
        /// A path to a ROM file for the device to use. This
        /// is a relative path under `/usr/share/kvm/`.
        /// </summary>
        public readonly string? RomFile;
        /// <summary>
        /// Makes the firmware ROM visible for the VM (defaults
        /// to `true`).
        /// </summary>
        public readonly bool? Rombar;
        /// <summary>
        /// Marks the PCI(e) device as the primary GPU of the VM.
        /// With this enabled the `vga` configuration argument will be ignored.
        /// </summary>
        public readonly bool? Xvga;

        [OutputConstructor]
        private VirtualMachineHostpci(
            string device,

            string? id,

            string? mapping,

            string? mdev,

            bool? pcie,

            string? romFile,

            bool? rombar,

            bool? xvga)
        {
            Device = device;
            Id = id;
            Mapping = mapping;
            Mdev = mdev;
            Pcie = pcie;
            RomFile = romFile;
            Rombar = rombar;
            Xvga = xvga;
        }
    }
}