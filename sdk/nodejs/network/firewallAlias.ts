// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Aliases are used to see what devices or group of devices are affected by a rule.
 * We can create aliases to identify an IP address or a network. Aliases can be
 * created on the cluster level, on VM / Container level.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const localNetwork = new proxmoxve.network.FirewallAlias("localNetwork", {
 *     nodeName: proxmox_virtual_environment_vm.example.node_name,
 *     vmId: proxmox_virtual_environment_vm.example.vm_id,
 *     cidr: "192.168.0.0/23",
 *     comment: "Managed by Pulumi",
 * }, {
 *     dependsOn: [proxmox_virtual_environment_vm.example],
 * });
 * const ubuntuVm = new proxmoxve.network.FirewallAlias("ubuntuVm", {
 *     cidr: "192.168.0.1",
 *     comment: "Managed by Pulumi",
 * });
 * ```
 */
export class FirewallAlias extends pulumi.CustomResource {
    /**
     * Get an existing FirewallAlias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallAliasState, opts?: pulumi.CustomResourceOptions): FirewallAlias {
        return new FirewallAlias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Network/firewallAlias:FirewallAlias';

    /**
     * Returns true if the given object is an instance of FirewallAlias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirewallAlias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirewallAlias.__pulumiType;
    }

    /**
     * Network/IP specification in CIDR format.
     */
    public readonly cidr!: pulumi.Output<string>;
    /**
     * Alias comment.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Container ID. Leave empty for cluster level aliases.
     */
    public readonly containerId!: pulumi.Output<number | undefined>;
    /**
     * Alias name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Node name. Leave empty for cluster level aliases.
     */
    public readonly nodeName!: pulumi.Output<string | undefined>;
    /**
     * VM ID. Leave empty for cluster level aliases.
     */
    public readonly vmId!: pulumi.Output<number | undefined>;

    /**
     * Create a FirewallAlias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallAliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallAliasArgs | FirewallAliasState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallAliasState | undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["containerId"] = state ? state.containerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as FirewallAliasArgs | undefined;
            if ((!args || args.cidr === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidr'");
            }
            resourceInputs["cidr"] = args ? args.cidr : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["containerId"] = args ? args.containerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirewallAlias.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirewallAlias resources.
 */
export interface FirewallAliasState {
    /**
     * Network/IP specification in CIDR format.
     */
    cidr?: pulumi.Input<string>;
    /**
     * Alias comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * Container ID. Leave empty for cluster level aliases.
     */
    containerId?: pulumi.Input<number>;
    /**
     * Alias name.
     */
    name?: pulumi.Input<string>;
    /**
     * Node name. Leave empty for cluster level aliases.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * VM ID. Leave empty for cluster level aliases.
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FirewallAlias resource.
 */
export interface FirewallAliasArgs {
    /**
     * Network/IP specification in CIDR format.
     */
    cidr: pulumi.Input<string>;
    /**
     * Alias comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * Container ID. Leave empty for cluster level aliases.
     */
    containerId?: pulumi.Input<number>;
    /**
     * Alias name.
     */
    name?: pulumi.Input<string>;
    /**
     * Node name. Leave empty for cluster level aliases.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * VM ID. Leave empty for cluster level aliases.
     */
    vmId?: pulumi.Input<number>;
}
