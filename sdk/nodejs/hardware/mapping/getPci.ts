// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../../types/input";
import * as outputs from "../../types/output";
import * as utilities from "../../utilities";

/**
 * Retrieves a PCI hardware mapping from a Proxmox VE cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const example = proxmoxve.Hardware.mapping.getPci({
 *     name: "example",
 * });
 * export const dataProxmoxVirtualEnvironmentHardwareMappingPci = example;
 * ```
 */
export function getPci(args: GetPciArgs, opts?: pulumi.InvokeOptions): Promise<GetPciResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:Hardware/mapping/getPci:getPci", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPci.
 */
export interface GetPciArgs {
    /**
     * The name of this PCI hardware mapping.
     */
    name: string;
}

/**
 * A collection of values returned by getPci.
 */
export interface GetPciResult {
    /**
     * The comment of this PCI hardware mapping.
     */
    readonly comment: string;
    /**
     * The unique identifier of this PCI hardware mapping data source.
     */
    readonly id: string;
    /**
     * The actual map of devices for the hardware mapping.
     */
    readonly maps: outputs.Hardware.mapping.GetPciMap[];
    /**
     * Indicates whether to use with mediated devices.
     */
    readonly mediatedDevices: boolean;
    /**
     * The name of this PCI hardware mapping.
     */
    readonly name: string;
}
/**
 * Retrieves a PCI hardware mapping from a Proxmox VE cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const example = proxmoxve.Hardware.mapping.getPci({
 *     name: "example",
 * });
 * export const dataProxmoxVirtualEnvironmentHardwareMappingPci = example;
 * ```
 */
export function getPciOutput(args: GetPciOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPciResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:Hardware/mapping/getPci:getPci", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getPci.
 */
export interface GetPciOutputArgs {
    /**
     * The name of this PCI hardware mapping.
     */
    name: pulumi.Input<string>;
}
