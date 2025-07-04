// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieves information about a specific Container.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const testContainer = proxmoxve.getContainer({
 *     nodeName: "test",
 *     vmId: 100,
 * });
 * ```
 */
export function getContainer(args: GetContainerArgs, opts?: pulumi.InvokeOptions): Promise<GetContainerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:index/getContainer:getContainer", {
        "nodeName": args.nodeName,
        "status": args.status,
        "template": args.template,
        "vmId": args.vmId,
    }, opts);
}

/**
 * A collection of arguments for invoking getContainer.
 */
export interface GetContainerArgs {
    /**
     * The node name.
     */
    nodeName: string;
    /**
     * Status of the container
     */
    status?: string;
    /**
     * Is container a template (true) or a regular container (false)
     */
    template?: boolean;
    /**
     * The container identifier.
     */
    vmId: number;
}

/**
 * A collection of values returned by getContainer.
 */
export interface GetContainerResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The container name.
     */
    readonly name: string;
    readonly nodeName: string;
    /**
     * Status of the container
     */
    readonly status?: string;
    /**
     * A list of tags of the container.
     */
    readonly tags: string[];
    /**
     * Is container a template (true) or a regular container (false)
     */
    readonly template?: boolean;
    readonly vmId: number;
}
/**
 * Retrieves information about a specific Container.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const testContainer = proxmoxve.getContainer({
 *     nodeName: "test",
 *     vmId: 100,
 * });
 * ```
 */
export function getContainerOutput(args: GetContainerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetContainerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("proxmoxve:index/getContainer:getContainer", {
        "nodeName": args.nodeName,
        "status": args.status,
        "template": args.template,
        "vmId": args.vmId,
    }, opts);
}

/**
 * A collection of arguments for invoking getContainer.
 */
export interface GetContainerOutputArgs {
    /**
     * The node name.
     */
    nodeName: pulumi.Input<string>;
    /**
     * Status of the container
     */
    status?: pulumi.Input<string>;
    /**
     * Is container a template (true) or a regular container (false)
     */
    template?: pulumi.Input<boolean>;
    /**
     * The container identifier.
     */
    vmId: pulumi.Input<number>;
}
