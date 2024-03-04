// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a High Availability group in a Proxmox VE cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const example = new proxmoxve.ha.HAGroup("example", {
 *     group: "example",
 *     comment: "This is a comment.",
 *     nodes: {
 *         node1: undefined,
 *         node2: 2,
 *         node3: 1,
 *     },
 *     restricted: true,
 *     noFailback: false,
 * });
 * ```
 *
 * ## Import
 *
 * #!/usr/bin/env sh HA groups can be imported using their name, e.g.
 *
 * ```sh
 *  $ pulumi import proxmoxve:HA/hAGroup:HAGroup example example
 * ```
 */
export class HAGroup extends pulumi.CustomResource {
    /**
     * Get an existing HAGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HAGroupState, opts?: pulumi.CustomResourceOptions): HAGroup {
        return new HAGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:HA/hAGroup:HAGroup';

    /**
     * Returns true if the given object is an instance of HAGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is HAGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === HAGroup.__pulumiType;
    }

    /**
     * The comment associated with this group
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The identifier of the High Availability group to manage.
     */
    public readonly group!: pulumi.Output<string>;
    /**
     * A flag that indicates that failing back to a higher priority node is disabled for this HA group. Defaults to `false`.
     */
    public readonly noFailback!: pulumi.Output<boolean>;
    /**
     * The member nodes for this group. They are provided as a map, where the keys are the node names and the values represent their priority: integers for known priorities or `null` for unset priorities.
     */
    public readonly nodes!: pulumi.Output<{[key: string]: number}>;
    /**
     * A flag that indicates that other nodes may not be used to run resources associated to this HA group. Defaults to `false`.
     */
    public readonly restricted!: pulumi.Output<boolean>;

    /**
     * Create a HAGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HAGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HAGroupArgs | HAGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HAGroupState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["group"] = state ? state.group : undefined;
            resourceInputs["noFailback"] = state ? state.noFailback : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["restricted"] = state ? state.restricted : undefined;
        } else {
            const args = argsOrState as HAGroupArgs | undefined;
            if ((!args || args.group === undefined) && !opts.urn) {
                throw new Error("Missing required property 'group'");
            }
            if ((!args || args.nodes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodes'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["group"] = args ? args.group : undefined;
            resourceInputs["noFailback"] = args ? args.noFailback : undefined;
            resourceInputs["nodes"] = args ? args.nodes : undefined;
            resourceInputs["restricted"] = args ? args.restricted : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(HAGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering HAGroup resources.
 */
export interface HAGroupState {
    /**
     * The comment associated with this group
     */
    comment?: pulumi.Input<string>;
    /**
     * The identifier of the High Availability group to manage.
     */
    group?: pulumi.Input<string>;
    /**
     * A flag that indicates that failing back to a higher priority node is disabled for this HA group. Defaults to `false`.
     */
    noFailback?: pulumi.Input<boolean>;
    /**
     * The member nodes for this group. They are provided as a map, where the keys are the node names and the values represent their priority: integers for known priorities or `null` for unset priorities.
     */
    nodes?: pulumi.Input<{[key: string]: pulumi.Input<number>}>;
    /**
     * A flag that indicates that other nodes may not be used to run resources associated to this HA group. Defaults to `false`.
     */
    restricted?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a HAGroup resource.
 */
export interface HAGroupArgs {
    /**
     * The comment associated with this group
     */
    comment?: pulumi.Input<string>;
    /**
     * The identifier of the High Availability group to manage.
     */
    group: pulumi.Input<string>;
    /**
     * A flag that indicates that failing back to a higher priority node is disabled for this HA group. Defaults to `false`.
     */
    noFailback?: pulumi.Input<boolean>;
    /**
     * The member nodes for this group. They are provided as a map, where the keys are the node names and the values represent their priority: integers for known priorities or `null` for unset priorities.
     */
    nodes: pulumi.Input<{[key: string]: pulumi.Input<number>}>;
    /**
     * A flag that indicates that other nodes may not be used to run resources associated to this HA group. Defaults to `false`.
     */
    restricted?: pulumi.Input<boolean>;
}
