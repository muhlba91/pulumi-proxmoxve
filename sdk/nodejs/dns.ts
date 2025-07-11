// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages the DNS configuration for a specific node.
 *
 * ## Import
 *
 * Instances can be imported using the `node_name`, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:index/dNS:DNS first_node first-node
 * ```
 */
export class DNS extends pulumi.CustomResource {
    /**
     * Get an existing DNS resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DNSState, opts?: pulumi.CustomResourceOptions): DNS {
        return new DNS(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:index/dNS:DNS';

    /**
     * Returns true if the given object is an instance of DNS.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DNS {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DNS.__pulumiType;
    }

    /**
     * The DNS search domain.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * A node name.
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * The DNS servers.
     */
    public readonly servers!: pulumi.Output<string[] | undefined>;

    /**
     * Create a DNS resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DNSArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DNSArgs | DNSState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DNSState | undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["servers"] = state ? state.servers : undefined;
        } else {
            const args = argsOrState as DNSArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["servers"] = args ? args.servers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DNS.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DNS resources.
 */
export interface DNSState {
    /**
     * The DNS search domain.
     */
    domain?: pulumi.Input<string>;
    /**
     * A node name.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * The DNS servers.
     */
    servers?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a DNS resource.
 */
export interface DNSArgs {
    /**
     * The DNS search domain.
     */
    domain: pulumi.Input<string>;
    /**
     * A node name.
     */
    nodeName: pulumi.Input<string>;
    /**
     * The DNS servers.
     */
    servers?: pulumi.Input<pulumi.Input<string>[]>;
}
