// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the identifiers for all the available resource pools.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const availablePools = proxmoxve.Permission.getPools({});
 * ```
 */
export function getPools(opts?: pulumi.InvokeOptions): Promise<GetPoolsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:Permission/getPools:getPools", {
    }, opts);
}

/**
 * A collection of values returned by getPools.
 */
export interface GetPoolsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The pool identifiers.
     */
    readonly poolIds: string[];
}
/**
 * Retrieves the identifiers for all the available resource pools.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const availablePools = proxmoxve.Permission.getPools({});
 * ```
 */
export function getPoolsOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetPoolsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:Permission/getPools:getPools", {
    }, opts);
}
