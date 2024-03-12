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
 * const exampleAll = proxmoxve.HA.getHAResources({});
 * const exampleVm = proxmoxve.HA.getHAResources({
 *     type: "vm",
 * });
 * export const dataProxmoxVirtualEnvironmentHaresources = {
 *     all: exampleAll.then(exampleAll => exampleAll.resourceIds),
 *     vms: exampleVm.then(exampleVm => exampleVm.resourceIds),
 * };
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getHAResources(args?: GetHAResourcesArgs, opts?: pulumi.InvokeOptions): Promise<GetHAResourcesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:HA/getHAResources:getHAResources", {
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getHAResources.
 */
export interface GetHAResourcesArgs {
    /**
     * The type of High Availability resources to fetch (`vm` or `ct`). All resources will be fetched if this option is unset.
     */
    type?: string;
}

/**
 * A collection of values returned by getHAResources.
 */
export interface GetHAResourcesResult {
    /**
     * The unique identifier of this resource.
     */
    readonly id: string;
    /**
     * The identifiers of the High Availability resources.
     */
    readonly resourceIds: string[];
    /**
     * The type of High Availability resources to fetch (`vm` or `ct`). All resources will be fetched if this option is unset.
     */
    readonly type?: string;
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
 * const exampleAll = proxmoxve.HA.getHAResources({});
 * const exampleVm = proxmoxve.HA.getHAResources({
 *     type: "vm",
 * });
 * export const dataProxmoxVirtualEnvironmentHaresources = {
 *     all: exampleAll.then(exampleAll => exampleAll.resourceIds),
 *     vms: exampleVm.then(exampleVm => exampleVm.resourceIds),
 * };
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getHAResourcesOutput(args?: GetHAResourcesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHAResourcesResult> {
    return pulumi.output(args).apply((a: any) => getHAResources(a, opts))
}

/**
 * A collection of arguments for invoking getHAResources.
 */
export interface GetHAResourcesOutputArgs {
    /**
     * The type of High Availability resources to fetch (`vm` or `ct`). All resources will be fetched if this option is unset.
     */
    type?: pulumi.Input<string>;
}
