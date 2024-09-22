// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the list of High Availability groups.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const example = proxmoxve.HA.getHAGroups({});
 * export const dataProxmoxVirtualEnvironmentHagroups = example.then(example => example.groupIds);
 * ```
 */
export function getHAGroups(opts?: pulumi.InvokeOptions): Promise<GetHAGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:HA/getHAGroups:getHAGroups", {
    }, opts);
}

/**
 * A collection of values returned by getHAGroups.
 */
export interface GetHAGroupsResult {
    /**
     * The identifiers of the High Availability groups.
     */
    readonly groupIds: string[];
    /**
     * The unique identifier of this resource.
     */
    readonly id: string;
}
/**
 * Retrieves the list of High Availability groups.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const example = proxmoxve.HA.getHAGroups({});
 * export const dataProxmoxVirtualEnvironmentHagroups = example.then(example => example.groupIds);
 * ```
 */
export function getHAGroupsOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetHAGroupsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:HA/getHAGroups:getHAGroups", {
    }, opts);
}
