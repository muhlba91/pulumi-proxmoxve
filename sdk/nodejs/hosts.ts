// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages the host entries on a specific node.
 *
 * ## Import
 *
 * Instances can be imported using the `node_name`, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:index/hosts:Hosts first_node_host_entries first-node
 * ```
 */
export class Hosts extends pulumi.CustomResource {
    /**
     * Get an existing Hosts resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HostsState, opts?: pulumi.CustomResourceOptions): Hosts {
        return new Hosts(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:index/hosts:Hosts';

    /**
     * Returns true if the given object is an instance of Hosts.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Hosts {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Hosts.__pulumiType;
    }

    /**
     * The IP addresses.
     */
    public /*out*/ readonly addresses!: pulumi.Output<string[]>;
    /**
     * The SHA1 digest.
     */
    public /*out*/ readonly digest!: pulumi.Output<string>;
    /**
     * The host entries (conversion of `addresses` and `hostnames` into
     * objects).
     */
    public /*out*/ readonly entries!: pulumi.Output<outputs.HostsEntry[]>;
    /**
     * A host entry (multiple blocks supported).
     */
    public readonly entry!: pulumi.Output<outputs.HostsEntry[]>;
    /**
     * The hostnames associated with each of the IP addresses.
     */
    public /*out*/ readonly hostnames!: pulumi.Output<string[][]>;
    /**
     * A node name.
     */
    public readonly nodeName!: pulumi.Output<string>;

    /**
     * Create a Hosts resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HostsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HostsArgs | HostsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HostsState | undefined;
            resourceInputs["addresses"] = state ? state.addresses : undefined;
            resourceInputs["digest"] = state ? state.digest : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["entry"] = state ? state.entry : undefined;
            resourceInputs["hostnames"] = state ? state.hostnames : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
        } else {
            const args = argsOrState as HostsArgs | undefined;
            if ((!args || args.entry === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entry'");
            }
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            resourceInputs["entry"] = args ? args.entry : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["addresses"] = undefined /*out*/;
            resourceInputs["digest"] = undefined /*out*/;
            resourceInputs["entries"] = undefined /*out*/;
            resourceInputs["hostnames"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Hosts.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Hosts resources.
 */
export interface HostsState {
    /**
     * The IP addresses.
     */
    addresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The SHA1 digest.
     */
    digest?: pulumi.Input<string>;
    /**
     * The host entries (conversion of `addresses` and `hostnames` into
     * objects).
     */
    entries?: pulumi.Input<pulumi.Input<inputs.HostsEntry>[]>;
    /**
     * A host entry (multiple blocks supported).
     */
    entry?: pulumi.Input<pulumi.Input<inputs.HostsEntry>[]>;
    /**
     * The hostnames associated with each of the IP addresses.
     */
    hostnames?: pulumi.Input<pulumi.Input<pulumi.Input<string>[]>[]>;
    /**
     * A node name.
     */
    nodeName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Hosts resource.
 */
export interface HostsArgs {
    /**
     * A host entry (multiple blocks supported).
     */
    entry: pulumi.Input<pulumi.Input<inputs.HostsEntry>[]>;
    /**
     * A node name.
     */
    nodeName: pulumi.Input<string>;
}
