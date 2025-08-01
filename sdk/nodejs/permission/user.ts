// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const operationsMonitoring = new proxmoxve.permission.Role("operationsMonitoring", {
 *     roleId: "operations-monitoring",
 *     privileges: ["VM.Monitor"],
 * });
 * const operationsAutomation = new proxmoxve.permission.User("operationsAutomation", {
 *     acls: [{
 *         path: "/vms/1234",
 *         propagate: true,
 *         roleId: operationsMonitoring.roleId,
 *     }],
 *     comment: "Managed by Pulumi",
 *     password: "a-strong-password",
 *     userId: "operations-automation@pve",
 * });
 * ```
 *
 * ## Import
 *
 * Instances can be imported using the `user_id`, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:Permission/user:User operations_automation operations-automation@pve
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Permission/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * The access control list (multiple blocks supported).
     */
    public readonly acls!: pulumi.Output<outputs.Permission.UserAcl[] | undefined>;
    /**
     * The user comment.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The user's email address.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * Whether the user account is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The user account's expiration date (RFC 3339).
     */
    public readonly expirationDate!: pulumi.Output<string | undefined>;
    /**
     * The user's first name.
     */
    public readonly firstName!: pulumi.Output<string | undefined>;
    /**
     * The user's groups.
     */
    public readonly groups!: pulumi.Output<string[] | undefined>;
    /**
     * The user's keys.
     */
    public readonly keys!: pulumi.Output<string | undefined>;
    /**
     * The user's last name.
     */
    public readonly lastName!: pulumi.Output<string | undefined>;
    /**
     * The user's password. Required for PVE or PAM realms.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * The user identifier.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["acls"] = state ? state.acls : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["firstName"] = state ? state.firstName : undefined;
            resourceInputs["groups"] = state ? state.groups : undefined;
            resourceInputs["keys"] = state ? state.keys : undefined;
            resourceInputs["lastName"] = state ? state.lastName : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["acls"] = args ? args.acls : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["expirationDate"] = args ? args.expirationDate : undefined;
            resourceInputs["firstName"] = args ? args.firstName : undefined;
            resourceInputs["groups"] = args ? args.groups : undefined;
            resourceInputs["keys"] = args ? args.keys : undefined;
            resourceInputs["lastName"] = args ? args.lastName : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The access control list (multiple blocks supported).
     */
    acls?: pulumi.Input<pulumi.Input<inputs.Permission.UserAcl>[]>;
    /**
     * The user comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    email?: pulumi.Input<string>;
    /**
     * Whether the user account is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The user account's expiration date (RFC 3339).
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The user's first name.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The user's groups.
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The user's keys.
     */
    keys?: pulumi.Input<string>;
    /**
     * The user's last name.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The user's password. Required for PVE or PAM realms.
     */
    password?: pulumi.Input<string>;
    /**
     * The user identifier.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The access control list (multiple blocks supported).
     */
    acls?: pulumi.Input<pulumi.Input<inputs.Permission.UserAcl>[]>;
    /**
     * The user comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * The user's email address.
     */
    email?: pulumi.Input<string>;
    /**
     * Whether the user account is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The user account's expiration date (RFC 3339).
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The user's first name.
     */
    firstName?: pulumi.Input<string>;
    /**
     * The user's groups.
     */
    groups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The user's keys.
     */
    keys?: pulumi.Input<string>;
    /**
     * The user's last name.
     */
    lastName?: pulumi.Input<string>;
    /**
     * The user's password. Required for PVE or PAM realms.
     */
    password?: pulumi.Input<string>;
    /**
     * The user identifier.
     */
    userId: pulumi.Input<string>;
}
