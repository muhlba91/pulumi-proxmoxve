// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        /// <summary>
        /// The DNS configuration.
        /// </summary>
        [Input("dns")]
        public Input<Inputs.VirtualMachineInitializationDnsArgs>? Dns { get; set; }

        /// <summary>
        /// The hardware interface to connect the cloud-init
        /// image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
        /// detected if the setting is missing but a cloud-init image is present,
        /// otherwise defaults to `ide2`.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        [Input("ipConfigs")]
        private InputList<Inputs.VirtualMachineInitializationIpConfigArgs>? _ipConfigs;

        /// <summary>
        /// The IP configuration (one block per network
        /// device).
        /// </summary>
        public InputList<Inputs.VirtualMachineInitializationIpConfigArgs> IpConfigs
        {
            get => _ipConfigs ?? (_ipConfigs = new InputList<Inputs.VirtualMachineInitializationIpConfigArgs>());
            set => _ipConfigs = value;
        }

        /// <summary>
        /// The identifier for a file containing
        /// all meta data passed to the VM via cloud-init.
        /// </summary>
        [Input("metaDataFileId")]
        public Input<string>? MetaDataFileId { get; set; }

        /// <summary>
        /// The identifier for a file containing
        /// network configuration data passed to the VM via cloud-init (conflicts
        /// with `ip_config`).
        /// </summary>
        [Input("networkDataFileId")]
        public Input<string>? NetworkDataFileId { get; set; }

        /// <summary>
        /// The VGA type (defaults to `std`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Whether to do an automatic package upgrade after the first boot (defaults to `true`).
        /// </summary>
        [Input("upgrade")]
        public Input<bool>? Upgrade { get; set; }

        /// <summary>
        /// The user account configuration (conflicts
        /// with `user_data_file_id`).
        /// </summary>
        [Input("userAccount")]
        public Input<Inputs.VirtualMachineInitializationUserAccountArgs>? UserAccount { get; set; }

        /// <summary>
        /// The identifier for a file containing
        /// custom user data (conflicts with `user_account`).
        /// </summary>
        [Input("userDataFileId")]
        public Input<string>? UserDataFileId { get; set; }

        /// <summary>
        /// The identifier for a file containing
        /// all vendor data passed to the VM via cloud-init.
        /// </summary>
        [Input("vendorDataFileId")]
        public Input<string>? VendorDataFileId { get; set; }

        public VirtualMachineInitializationArgs()
        {
        }
        public static new VirtualMachineInitializationArgs Empty => new VirtualMachineInitializationArgs();
    }
}
