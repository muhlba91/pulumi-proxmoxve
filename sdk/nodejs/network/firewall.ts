// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages firewall options on the cluster level.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const example = new proxmoxve.network.Firewall("example", {
 *     ebtables: false,
 *     enabled: false,
 *     inputPolicy: "DROP",
 *     logRatelimit: {
 *         burst: 10,
 *         enabled: false,
 *         rate: "5/second",
 *     },
 *     outputPolicy: "ACCEPT",
 * });
 * ```
 *
 * ## Important Notes
 *
 * Be careful not to use this resource multiple times for the same node.
 *
 * ## Import
 *
 * Instances can be imported without an ID, but you still need to pass one, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:Network/firewall:Firewall example example
 * ```
 */
export class Firewall extends pulumi.CustomResource {
    /**
     * Get an existing Firewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallState, opts?: pulumi.CustomResourceOptions): Firewall {
        return new Firewall(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Network/firewall:Firewall';

    /**
     * Returns true if the given object is an instance of Firewall.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Firewall {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Firewall.__pulumiType;
    }

    /**
     * Enable ebtables rules cluster wide.
     */
    public readonly ebtables!: pulumi.Output<boolean | undefined>;
    /**
     * Enable or disable the firewall cluster wide.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The default input policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    public readonly inputPolicy!: pulumi.Output<string | undefined>;
    /**
     * The log rate limit.
     */
    public readonly logRatelimit!: pulumi.Output<outputs.Network.FirewallLogRatelimit | undefined>;
    /**
     * The default output policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    public readonly outputPolicy!: pulumi.Output<string | undefined>;

    /**
     * Create a Firewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FirewallArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallArgs | FirewallState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallState | undefined;
            resourceInputs["ebtables"] = state ? state.ebtables : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["inputPolicy"] = state ? state.inputPolicy : undefined;
            resourceInputs["logRatelimit"] = state ? state.logRatelimit : undefined;
            resourceInputs["outputPolicy"] = state ? state.outputPolicy : undefined;
        } else {
            const args = argsOrState as FirewallArgs | undefined;
            resourceInputs["ebtables"] = args ? args.ebtables : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["inputPolicy"] = args ? args.inputPolicy : undefined;
            resourceInputs["logRatelimit"] = args ? args.logRatelimit : undefined;
            resourceInputs["outputPolicy"] = args ? args.outputPolicy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Firewall.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Firewall resources.
 */
export interface FirewallState {
    /**
     * Enable ebtables rules cluster wide.
     */
    ebtables?: pulumi.Input<boolean>;
    /**
     * Enable or disable the firewall cluster wide.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The default input policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    inputPolicy?: pulumi.Input<string>;
    /**
     * The log rate limit.
     */
    logRatelimit?: pulumi.Input<inputs.Network.FirewallLogRatelimit>;
    /**
     * The default output policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    outputPolicy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Firewall resource.
 */
export interface FirewallArgs {
    /**
     * Enable ebtables rules cluster wide.
     */
    ebtables?: pulumi.Input<boolean>;
    /**
     * Enable or disable the firewall cluster wide.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The default input policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    inputPolicy?: pulumi.Input<string>;
    /**
     * The log rate limit.
     */
    logRatelimit?: pulumi.Input<inputs.Network.FirewallLogRatelimit>;
    /**
     * The default output policy (`ACCEPT`, `DROP`, `REJECT`).
     */
    outputPolicy?: pulumi.Input<string>;
}
