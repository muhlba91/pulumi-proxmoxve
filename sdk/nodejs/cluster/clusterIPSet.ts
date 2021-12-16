// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export class ClusterIPSet extends pulumi.CustomResource {
    /**
     * Get an existing ClusterIPSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterIPSetState, opts?: pulumi.CustomResourceOptions): ClusterIPSet {
        return new ClusterIPSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Cluster/clusterIPSet:ClusterIPSet';

    /**
     * Returns true if the given object is an instance of ClusterIPSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterIPSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterIPSet.__pulumiType;
    }

    /**
     * List of IP or Networks
     */
    public readonly cidrs!: pulumi.Output<outputs.Cluster.ClusterIPSetCidr[] | undefined>;
    /**
     * IPSet comment
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * IPSet name
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ClusterIPSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterIPSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterIPSetArgs | ClusterIPSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterIPSetState | undefined;
            resourceInputs["cidrs"] = state ? state.cidrs : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ClusterIPSetArgs | undefined;
            resourceInputs["cidrs"] = args ? args.cidrs : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ClusterIPSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterIPSet resources.
 */
export interface ClusterIPSetState {
    /**
     * List of IP or Networks
     */
    cidrs?: pulumi.Input<pulumi.Input<inputs.Cluster.ClusterIPSetCidr>[]>;
    /**
     * IPSet comment
     */
    comment?: pulumi.Input<string>;
    /**
     * IPSet name
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ClusterIPSet resource.
 */
export interface ClusterIPSetArgs {
    /**
     * List of IP or Networks
     */
    cidrs?: pulumi.Input<pulumi.Input<inputs.Cluster.ClusterIPSetCidr>[]>;
    /**
     * IPSet comment
     */
    comment?: pulumi.Input<string>;
    /**
     * IPSet name
     */
    name?: pulumi.Input<string>;
}
