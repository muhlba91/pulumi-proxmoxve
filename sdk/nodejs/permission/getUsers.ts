// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves information about all the available users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const availableUsers = proxmoxve.Permission.getUsers({});
 * ```
 */
export function getUsers(opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:Permission/getUsers:getUsers", {
    }, opts);
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    /**
     * The user comments.
     */
    readonly comments: string[];
    /**
     * The users' email addresses.
     */
    readonly emails: string[];
    /**
     * Whether a user account is enabled.
     */
    readonly enableds: boolean[];
    /**
     * The user accounts' expiration dates (RFC 3339).
     */
    readonly expirationDates: string[];
    /**
     * The users' first names.
     */
    readonly firstNames: string[];
    /**
     * The users' groups.
     */
    readonly groups: string[][];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The users' keys.
     */
    readonly keys: string[];
    /**
     * The users' last names.
     */
    readonly lastNames: string[];
    /**
     * The user identifiers.
     */
    readonly userIds: string[];
}
/**
 * Retrieves information about all the available users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const availableUsers = proxmoxve.Permission.getUsers({});
 * ```
 */
export function getUsersOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:Permission/getUsers:getUsers", {
    }, opts);
}
