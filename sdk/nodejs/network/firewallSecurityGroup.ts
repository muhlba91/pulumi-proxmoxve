// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A security group is a collection of rules, defined at cluster level, which can
 * be used in all VMs' rules. For example, you can define a group named “webserver”
 * with rules to open the http and https ports.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const webserver = new proxmoxve.network.FirewallSecurityGroup("webserver", {
 *     comment: "Managed by Terraform",
 *     rules: [
 *         {
 *             action: "ACCEPT",
 *             comment: "Allow HTTP",
 *             dest: "192.168.1.5",
 *             dport: "80",
 *             log: "info",
 *             proto: "tcp",
 *             type: "in",
 *         },
 *         {
 *             action: "ACCEPT",
 *             comment: "Allow HTTPS",
 *             dest: "192.168.1.5",
 *             dport: "443",
 *             log: "info",
 *             proto: "tcp",
 *             type: "in",
 *         },
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Instances can be imported using the `name`, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup webserver webserver
 * ```
 */
export class FirewallSecurityGroup extends pulumi.CustomResource {
    /**
     * Get an existing FirewallSecurityGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallSecurityGroupState, opts?: pulumi.CustomResourceOptions): FirewallSecurityGroup {
        return new FirewallSecurityGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Network/firewallSecurityGroup:FirewallSecurityGroup';

    /**
     * Returns true if the given object is an instance of FirewallSecurityGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirewallSecurityGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirewallSecurityGroup.__pulumiType;
    }

    /**
     * Rule comment.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The ID of the container to manage the firewall for.
     */
    public readonly containerId!: pulumi.Output<number | undefined>;
    /**
     * Security group name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the node.
     */
    public readonly nodeName!: pulumi.Output<string | undefined>;
    /**
     * Firewall rule block (multiple blocks supported).
     */
    public readonly rules!: pulumi.Output<outputs.Network.FirewallSecurityGroupRule[]>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    public readonly vmId!: pulumi.Output<number | undefined>;

    /**
     * Create a FirewallSecurityGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallSecurityGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallSecurityGroupArgs | FirewallSecurityGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallSecurityGroupState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["containerId"] = state ? state.containerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as FirewallSecurityGroupArgs | undefined;
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["containerId"] = args ? args.containerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirewallSecurityGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirewallSecurityGroup resources.
 */
export interface FirewallSecurityGroupState {
    /**
     * Rule comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the container to manage the firewall for.
     */
    containerId?: pulumi.Input<number>;
    /**
     * Security group name.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * Firewall rule block (multiple blocks supported).
     */
    rules?: pulumi.Input<pulumi.Input<inputs.Network.FirewallSecurityGroupRule>[]>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FirewallSecurityGroup resource.
 */
export interface FirewallSecurityGroupArgs {
    /**
     * Rule comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the container to manage the firewall for.
     */
    containerId?: pulumi.Input<number>;
    /**
     * Security group name.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * Firewall rule block (multiple blocks supported).
     */
    rules: pulumi.Input<pulumi.Input<inputs.Network.FirewallSecurityGroupRule>[]>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    vmId?: pulumi.Input<number>;
}
