// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE
{
    /// <summary>
    /// !&gt; **DO NOT USE**
    /// This is an experimental implementation of a Proxmox VM resource using Plugin Framework.&lt;br&gt;&lt;br&gt;It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.
    /// 
    /// &gt; Many attributes are marked as **optional** _and_ **computed** in the schema,
    /// hence you may seem added to the plan with "(known after apply)" status, even if they are not set in the configuration.
    /// This is done to support the `clone` operation, when a VM is created from an existing VM or template,
    /// and the source attributes are copied to the clone.&lt;br&gt;&lt;br&gt;
    /// Computed attributes allow the provider to set those attributes without user input.
    /// The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.
    /// </summary>
    [Obsolete(@"proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2")]
    [ProxmoxVEResourceType("proxmoxve:index/vm2:Vm2")]
    public partial class Vm2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
        /// </summary>
        [Output("cdrom")]
        public Output<ImmutableDictionary<string, Outputs.Vm2Cdrom>> Cdrom { get; private set; } = null!;

        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Output("clone")]
        public Output<Outputs.Vm2Clone?> Clone { get; private set; } = null!;

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Output("cpu")]
        public Output<Outputs.Vm2Cpu> Cpu { get; private set; } = null!;

        /// <summary>
        /// The description of the VM.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the VM. Doesn't have to be unique.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the node where the VM is provisioned.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;

        /// <summary>
        /// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
        /// </summary>
        [Output("stopOnDestroy")]
        public Output<bool> StopOnDestroy { get; private set; } = null!;

        /// <summary>
        /// The tags assigned to the VM.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Set to true to create a VM template.
        /// </summary>
        [Output("template")]
        public Output<bool?> Template { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.Vm2Timeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        /// </summary>
        [Output("vga")]
        public Output<Outputs.Vm2Vga> Vga { get; private set; } = null!;


        /// <summary>
        /// Create a Vm2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vm2(string name, Vm2Args args, CustomResourceOptions? options = null)
            : base("proxmoxve:index/vm2:Vm2", name, args ?? new Vm2Args(), MakeResourceOptions(options, ""))
        {
        }

        private Vm2(string name, Input<string> id, Vm2State? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:index/vm2:Vm2", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/muhlba91/pulumi-proxmoxve",
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "proxmoxve:index/vm2:Vm2" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Vm2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vm2 Get(string name, Input<string> id, Vm2State? state = null, CustomResourceOptions? options = null)
        {
            return new Vm2(name, id, state, options);
        }
    }

    public sealed class Vm2Args : global::Pulumi.ResourceArgs
    {
        [Input("cdrom")]
        private InputMap<Inputs.Vm2CdromArgs>? _cdrom;

        /// <summary>
        /// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
        /// </summary>
        public InputMap<Inputs.Vm2CdromArgs> Cdrom
        {
            get => _cdrom ?? (_cdrom = new InputMap<Inputs.Vm2CdromArgs>());
            set => _cdrom = value;
        }

        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.Vm2CloneArgs>? Clone { get; set; }

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.Vm2CpuArgs>? Cpu { get; set; }

        /// <summary>
        /// The description of the VM.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the VM. Doesn't have to be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node where the VM is provisioned.
        /// </summary>
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        /// <summary>
        /// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
        /// </summary>
        [Input("stopOnDestroy")]
        public Input<bool>? StopOnDestroy { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags assigned to the VM.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Set to true to create a VM template.
        /// </summary>
        [Input("template")]
        public Input<bool>? Template { get; set; }

        [Input("timeouts")]
        public Input<Inputs.Vm2TimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        /// </summary>
        [Input("vga")]
        public Input<Inputs.Vm2VgaArgs>? Vga { get; set; }

        public Vm2Args()
        {
        }
        public static new Vm2Args Empty => new Vm2Args();
    }

    public sealed class Vm2State : global::Pulumi.ResourceArgs
    {
        [Input("cdrom")]
        private InputMap<Inputs.Vm2CdromGetArgs>? _cdrom;

        /// <summary>
        /// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
        /// </summary>
        public InputMap<Inputs.Vm2CdromGetArgs> Cdrom
        {
            get => _cdrom ?? (_cdrom = new InputMap<Inputs.Vm2CdromGetArgs>());
            set => _cdrom = value;
        }

        /// <summary>
        /// The cloning configuration.
        /// </summary>
        [Input("clone")]
        public Input<Inputs.Vm2CloneGetArgs>? Clone { get; set; }

        /// <summary>
        /// The CPU configuration.
        /// </summary>
        [Input("cpu")]
        public Input<Inputs.Vm2CpuGetArgs>? Cpu { get; set; }

        /// <summary>
        /// The description of the VM.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the VM. Doesn't have to be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node where the VM is provisioned.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
        /// </summary>
        [Input("stopOnDestroy")]
        public Input<bool>? StopOnDestroy { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags assigned to the VM.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Set to true to create a VM template.
        /// </summary>
        [Input("template")]
        public Input<bool>? Template { get; set; }

        [Input("timeouts")]
        public Input<Inputs.Vm2TimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
        /// </summary>
        [Input("vga")]
        public Input<Inputs.Vm2VgaGetArgs>? Vga { get; set; }

        public Vm2State()
        {
        }
        public static new Vm2State Empty => new Vm2State();
    }
}
