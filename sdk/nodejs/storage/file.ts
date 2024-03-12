// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a file.
 *
 * ## Example Usage
 *
 * ### Backups (`dump`)
 *
 * > **Note:** The resource with this content type uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const backup = new proxmoxve.storage.File("backup", {
 *     contentType: "dump",
 *     datastoreId: "local",
 *     nodeName: "pve",
 *     sourceFile: {
 *         path: "vzdump-lxc-100-2023_11_08-23_10_05.tar",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Images
 *
 * **Consider using `proxmoxve.Download.File` resource instead. Using this resource for images is less efficient (requires to transfer uploaded image to node) though still supported.**
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const ubuntuContainerTemplate = new proxmoxve.storage.File("ubuntuContainerTemplate", {
 *     contentType: "iso",
 *     datastoreId: "local",
 *     nodeName: "pve",
 *     sourceFile: {
 *         path: "https://cloud-images.ubuntu.com/jammy/20230929/jammy-server-cloudimg-amd64-disk-kvm.img",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Container Template (`vztmpl`)
 *
 * **Consider using `proxmoxve.Download.File` resource instead. Using this resource for container images is less efficient (requires to transfer uploaded image to node) though still supported.**
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@muhlba91/pulumi-proxmoxve";
 *
 * const ubuntuContainerTemplate = new proxmoxve.storage.File("ubuntuContainerTemplate", {
 *     contentType: "vztmpl",
 *     datastoreId: "local",
 *     nodeName: "first-node",
 *     sourceFile: {
 *         path: "https://download.proxmox.com/images/system/ubuntu-20.04-standard_20.04-1_amd64.tar.gz",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Important Notes
 *
 * The Proxmox VE API endpoint for file uploads does not support chunked transfer
 * encoding, which means that we must first store the source file as a temporary
 * file locally before uploading it.
 *
 * You must ensure that you have at least `Size-in-MB * 2 + 1` MB of storage space
 * available (twice the size plus overhead because a multipart payload needs to be
 * created as another temporary file).
 *
 * By default, if the specified file already exists, the resource will
 * unconditionally replace it and take ownership of the resource. On destruction,
 * the file will be deleted as if it did not exist before. If you want to prevent
 * the resource from replacing the file, set `overwrite` to `false`.
 *
 * ## Import
 *
 * Instances can be imported using the `node_name`, `datastore_id`, `content_type`
 *
 * and the `file_name` in the following format:
 *
 * text
 *
 * node_name:datastore_id/content_type/file_name
 *
 * Example:
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:Storage/file:File cloud_config pve/local:snippets/example.cloud-config.yaml
 * ```
 */
export class File extends pulumi.CustomResource {
    /**
     * Get an existing File resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FileState, opts?: pulumi.CustomResourceOptions): File {
        return new File(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Storage/file:File';

    /**
     * Returns true if the given object is an instance of File.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is File {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === File.__pulumiType;
    }

    /**
     * The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * The datastore id.
     */
    public readonly datastoreId!: pulumi.Output<string>;
    /**
     * The file modification date (RFC 3339).
     */
    public /*out*/ readonly fileModificationDate!: pulumi.Output<string>;
    /**
     * The file name.
     */
    public /*out*/ readonly fileName!: pulumi.Output<string>;
    /**
     * The file size in bytes.
     */
    public /*out*/ readonly fileSize!: pulumi.Output<number>;
    /**
     * The file tag.
     */
    public /*out*/ readonly fileTag!: pulumi.Output<string>;
    /**
     * The node name.
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * Whether to overwrite an existing file (defaults to
     * `true`).
     */
    public readonly overwrite!: pulumi.Output<boolean | undefined>;
    /**
     * The source file (conflicts with `sourceRaw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     */
    public readonly sourceFile!: pulumi.Output<outputs.Storage.FileSourceFile | undefined>;
    /**
     * The raw source (conflicts with `sourceFile`).
     */
    public readonly sourceRaw!: pulumi.Output<outputs.Storage.FileSourceRaw | undefined>;
    /**
     * Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     */
    public readonly timeoutUpload!: pulumi.Output<number | undefined>;

    /**
     * Create a File resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FileArgs | FileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FileState | undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["datastoreId"] = state ? state.datastoreId : undefined;
            resourceInputs["fileModificationDate"] = state ? state.fileModificationDate : undefined;
            resourceInputs["fileName"] = state ? state.fileName : undefined;
            resourceInputs["fileSize"] = state ? state.fileSize : undefined;
            resourceInputs["fileTag"] = state ? state.fileTag : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["overwrite"] = state ? state.overwrite : undefined;
            resourceInputs["sourceFile"] = state ? state.sourceFile : undefined;
            resourceInputs["sourceRaw"] = state ? state.sourceRaw : undefined;
            resourceInputs["timeoutUpload"] = state ? state.timeoutUpload : undefined;
        } else {
            const args = argsOrState as FileArgs | undefined;
            if ((!args || args.datastoreId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'datastoreId'");
            }
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["datastoreId"] = args ? args.datastoreId : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["overwrite"] = args ? args.overwrite : undefined;
            resourceInputs["sourceFile"] = args ? args.sourceFile : undefined;
            resourceInputs["sourceRaw"] = args ? args.sourceRaw : undefined;
            resourceInputs["timeoutUpload"] = args ? args.timeoutUpload : undefined;
            resourceInputs["fileModificationDate"] = undefined /*out*/;
            resourceInputs["fileName"] = undefined /*out*/;
            resourceInputs["fileSize"] = undefined /*out*/;
            resourceInputs["fileTag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(File.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering File resources.
 */
export interface FileState {
    /**
     * The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     */
    contentType?: pulumi.Input<string>;
    /**
     * The datastore id.
     */
    datastoreId?: pulumi.Input<string>;
    /**
     * The file modification date (RFC 3339).
     */
    fileModificationDate?: pulumi.Input<string>;
    /**
     * The file name.
     */
    fileName?: pulumi.Input<string>;
    /**
     * The file size in bytes.
     */
    fileSize?: pulumi.Input<number>;
    /**
     * The file tag.
     */
    fileTag?: pulumi.Input<string>;
    /**
     * The node name.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * Whether to overwrite an existing file (defaults to
     * `true`).
     */
    overwrite?: pulumi.Input<boolean>;
    /**
     * The source file (conflicts with `sourceRaw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     */
    sourceFile?: pulumi.Input<inputs.Storage.FileSourceFile>;
    /**
     * The raw source (conflicts with `sourceFile`).
     */
    sourceRaw?: pulumi.Input<inputs.Storage.FileSourceRaw>;
    /**
     * Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     */
    timeoutUpload?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a File resource.
 */
export interface FileArgs {
    /**
     * The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     */
    contentType?: pulumi.Input<string>;
    /**
     * The datastore id.
     */
    datastoreId: pulumi.Input<string>;
    /**
     * The node name.
     */
    nodeName: pulumi.Input<string>;
    /**
     * Whether to overwrite an existing file (defaults to
     * `true`).
     */
    overwrite?: pulumi.Input<boolean>;
    /**
     * The source file (conflicts with `sourceRaw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     */
    sourceFile?: pulumi.Input<inputs.Storage.FileSourceFile>;
    /**
     * The raw source (conflicts with `sourceFile`).
     */
    sourceRaw?: pulumi.Input<inputs.Storage.FileSourceRaw>;
    /**
     * Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     */
    timeoutUpload?: pulumi.Input<number>;
}
