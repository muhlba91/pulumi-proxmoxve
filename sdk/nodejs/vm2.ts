// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **DO NOT USE**
 * This is an experimental implementation of a Proxmox VM resource using Plugin Framework.<br><br>It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.
 *
 * > Many attributes are marked as **optional** _and_ **computed** in the schema,
 * hence you may seem added to the plan with "(known after apply)" status, even if they are not set in the configuration.
 * This is done to support the `clone` operation, when a VM is created from an existing VM or template,
 * and the source attributes are copied to the clone.<br><br>
 * Computed attributes allow the provider to set those attributes without user input.
 * The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.
 *
 * @deprecated proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2
 */
export class Vm2 extends pulumi.CustomResource {
    /**
     * Get an existing Vm2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: Vm2State, opts?: pulumi.CustomResourceOptions): Vm2 {
        pulumi.log.warn("Vm2 is deprecated: proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2")
        return new Vm2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:index/vm2:Vm2';

    /**
     * Returns true if the given object is an instance of Vm2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vm2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vm2.__pulumiType;
    }

    /**
     * The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
     */
    public readonly cdrom!: pulumi.Output<{[key: string]: outputs.Vm2Cdrom}>;
    /**
     * The cloning configuration.
     */
    public readonly clone!: pulumi.Output<outputs.Vm2Clone | undefined>;
    /**
     * The CPU configuration.
     */
    public readonly cpu!: pulumi.Output<outputs.Vm2Cpu>;
    /**
     * The description of the VM.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the VM. Doesn't have to be unique.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the node where the VM is provisioned.
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
     */
    public readonly stopOnDestroy!: pulumi.Output<boolean>;
    /**
     * The tags assigned to the VM.
     */
    public readonly tags!: pulumi.Output<string[]>;
    /**
     * Set to true to create a VM template.
     */
    public readonly template!: pulumi.Output<boolean | undefined>;
    public readonly timeouts!: pulumi.Output<outputs.Vm2Timeouts | undefined>;
    /**
     * Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
     */
    public readonly vga!: pulumi.Output<outputs.Vm2Vga>;

    /**
     * Create a Vm2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    /** @deprecated proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2 */
    constructor(name: string, args: Vm2Args, opts?: pulumi.CustomResourceOptions)
    /** @deprecated proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2 */
    constructor(name: string, argsOrState?: Vm2Args | Vm2State, opts?: pulumi.CustomResourceOptions) {
        pulumi.log.warn("Vm2 is deprecated: proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2")
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as Vm2State | undefined;
            resourceInputs["cdrom"] = state ? state.cdrom : undefined;
            resourceInputs["clone"] = state ? state.clone : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["stopOnDestroy"] = state ? state.stopOnDestroy : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["vga"] = state ? state.vga : undefined;
        } else {
            const args = argsOrState as Vm2Args | undefined;
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            resourceInputs["cdrom"] = args ? args.cdrom : undefined;
            resourceInputs["clone"] = args ? args.clone : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["stopOnDestroy"] = args ? args.stopOnDestroy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["vga"] = args ? args.vga : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "proxmoxve:index/vm2:Vm2" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(Vm2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vm2 resources.
 */
export interface Vm2State {
    /**
     * The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
     */
    cdrom?: pulumi.Input<{[key: string]: pulumi.Input<inputs.Vm2Cdrom>}>;
    /**
     * The cloning configuration.
     */
    clone?: pulumi.Input<inputs.Vm2Clone>;
    /**
     * The CPU configuration.
     */
    cpu?: pulumi.Input<inputs.Vm2Cpu>;
    /**
     * The description of the VM.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the VM. Doesn't have to be unique.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node where the VM is provisioned.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
     */
    stopOnDestroy?: pulumi.Input<boolean>;
    /**
     * The tags assigned to the VM.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set to true to create a VM template.
     */
    template?: pulumi.Input<boolean>;
    timeouts?: pulumi.Input<inputs.Vm2Timeouts>;
    /**
     * Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
     */
    vga?: pulumi.Input<inputs.Vm2Vga>;
}

/**
 * The set of arguments for constructing a Vm2 resource.
 */
export interface Vm2Args {
    /**
     * The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
     */
    cdrom?: pulumi.Input<{[key: string]: pulumi.Input<inputs.Vm2Cdrom>}>;
    /**
     * The cloning configuration.
     */
    clone?: pulumi.Input<inputs.Vm2Clone>;
    /**
     * The CPU configuration.
     */
    cpu?: pulumi.Input<inputs.Vm2Cpu>;
    /**
     * The description of the VM.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the VM. Doesn't have to be unique.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node where the VM is provisioned.
     */
    nodeName: pulumi.Input<string>;
    /**
     * Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
     */
    stopOnDestroy?: pulumi.Input<boolean>;
    /**
     * The tags assigned to the VM.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Set to true to create a VM template.
     */
    template?: pulumi.Input<boolean>;
    timeouts?: pulumi.Input<inputs.Vm2Timeouts>;
    /**
     * Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
     */
    vga?: pulumi.Input<inputs.Vm2Vga>;
}
