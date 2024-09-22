// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves information about a specific role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const operationsRole = proxmoxve.Permission.getRole({
 *     roleId: "operations",
 * });
 * ```
 */
export function getRole(args: GetRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:Permission/getRole:getRole", {
        "roleId": args.roleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleArgs {
    /**
     * The role identifier.
     */
    roleId: string;
}

/**
 * A collection of values returned by getRole.
 */
export interface GetRoleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The role privileges
     */
    readonly privileges: string[];
    readonly roleId: string;
}
/**
 * Retrieves information about a specific role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const operationsRole = proxmoxve.Permission.getRole({
 *     roleId: "operations",
 * });
 * ```
 */
export function getRoleOutput(args: GetRoleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRoleResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:Permission/getRole:getRole", {
        "roleId": args.roleId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRole.
 */
export interface GetRoleOutputArgs {
    /**
     * The role identifier.
     */
    roleId: pulumi.Input<string>;
}
