// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * User API tokens.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * // if creating a user token, the user must be created first
 * const user = new proxmoxve.permission.User("user", {
 *     comment: "Managed by Pulumi",
 *     email: "user@pve",
 *     enabled: true,
 *     expirationDate: "2034-01-01T22:00:00Z",
 *     userId: "user@pve",
 * });
 * const userToken = new proxmoxve.user.Token("userToken", {
 *     comment: "Managed by Pulumi",
 *     expirationDate: "2033-01-01T22:00:00Z",
 *     tokenName: "tk1",
 *     userId: user.userId,
 * });
 * ```
 *
 * ## Import
 *
 * #!/usr/bin/env sh
 *
 * #Tokens can be imported using they identifiers in format `user_id!token_name` format, e.g.:
 *
 * ```sh
 * $ pulumi import proxmoxve:User/token:Token token1 user@pve!token1
 * ```
 */
export class Token extends pulumi.CustomResource {
    /**
     * Get an existing Token resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenState, opts?: pulumi.CustomResourceOptions): Token {
        return new Token(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:User/token:Token';

    /**
     * Returns true if the given object is an instance of Token.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Token {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Token.__pulumiType;
    }

    /**
     * Comment for the token.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Expiration date for the token.
     */
    public readonly expirationDate!: pulumi.Output<string | undefined>;
    /**
     * Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
     */
    public readonly privilegesSeparation!: pulumi.Output<boolean>;
    /**
     * User-specific token identifier.
     */
    public readonly tokenName!: pulumi.Output<string>;
    /**
     * User identifier.
     */
    public readonly userId!: pulumi.Output<string>;
    /**
     * API token value used for authentication. It is populated only when creating a new token, and can't be retrieved at import.
     */
    public /*out*/ readonly value!: pulumi.Output<string>;

    /**
     * Create a Token resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenArgs | TokenState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TokenState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["privilegesSeparation"] = state ? state.privilegesSeparation : undefined;
            resourceInputs["tokenName"] = state ? state.tokenName : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as TokenArgs | undefined;
            if ((!args || args.tokenName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tokenName'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["expirationDate"] = args ? args.expirationDate : undefined;
            resourceInputs["privilegesSeparation"] = args ? args.privilegesSeparation : undefined;
            resourceInputs["tokenName"] = args ? args.tokenName : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["value"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Token.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Token resources.
 */
export interface TokenState {
    /**
     * Comment for the token.
     */
    comment?: pulumi.Input<string>;
    /**
     * Expiration date for the token.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
     */
    privilegesSeparation?: pulumi.Input<boolean>;
    /**
     * User-specific token identifier.
     */
    tokenName?: pulumi.Input<string>;
    /**
     * User identifier.
     */
    userId?: pulumi.Input<string>;
    /**
     * API token value used for authentication. It is populated only when creating a new token, and can't be retrieved at import.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Token resource.
 */
export interface TokenArgs {
    /**
     * Comment for the token.
     */
    comment?: pulumi.Input<string>;
    /**
     * Expiration date for the token.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * Restrict API token privileges with separate ACLs (default), or give full privileges of corresponding user.
     */
    privilegesSeparation?: pulumi.Input<boolean>;
    /**
     * User-specific token identifier.
     */
    tokenName: pulumi.Input<string>;
    /**
     * User identifier.
     */
    userId: pulumi.Input<string>;
}
