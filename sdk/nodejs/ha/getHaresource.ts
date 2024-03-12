// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the list of High Availability resources.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const all = proxmoxve.HA.getHAResources({});
 * const example = all.then(all => .map(([, ]) => (proxmoxve.HA.getHAResource({
 *     resourceId: __value,
 * }))));
 * export const proxmoxVirtualEnvironmentHaresourcesFull = example;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getHAResource(args: GetHAResourceArgs, opts?: pulumi.InvokeOptions): Promise<GetHAResourceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:HA/getHAResource:getHAResource", {
        "resourceId": args.resourceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHAResource.
 */
export interface GetHAResourceArgs {
    /**
     * The identifier of the Proxmox HA resource to read.
     */
    resourceId: string;
}

/**
 * A collection of values returned by getHAResource.
 */
export interface GetHAResourceResult {
    /**
     * The comment associated with this resource.
     */
    readonly comment: string;
    /**
     * The identifier of the High Availability group this resource is a member of.
     */
    readonly group: string;
    /**
     * The unique identifier of this resource.
     */
    readonly id: string;
    /**
     * The maximal number of relocation attempts.
     */
    readonly maxRelocate: number;
    /**
     * The maximal number of restart attempts.
     */
    readonly maxRestart: number;
    /**
     * The identifier of the Proxmox HA resource to read.
     */
    readonly resourceId: string;
    /**
     * The desired state of the resource.
     */
    readonly state: string;
    /**
     * The type of High Availability resource (`vm` or `ct`).
     */
    readonly type: string;
}
/**
 * Retrieves the list of High Availability resources.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const all = proxmoxve.HA.getHAResources({});
 * const example = all.then(all => .map(([, ]) => (proxmoxve.HA.getHAResource({
 *     resourceId: __value,
 * }))));
 * export const proxmoxVirtualEnvironmentHaresourcesFull = example;
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getHAResourceOutput(args: GetHAResourceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHAResourceResult> {
    return pulumi.output(args).apply((a: any) => getHAResource(a, opts))
}

/**
 * A collection of arguments for invoking getHAResource.
 */
export interface GetHAResourceOutputArgs {
    /**
     * The identifier of the Proxmox HA resource to read.
     */
    resourceId: pulumi.Input<string>;
}
