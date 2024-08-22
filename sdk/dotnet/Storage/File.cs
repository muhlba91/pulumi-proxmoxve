// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Storage
{
    /// <summary>
    /// Manages a file.
    /// 
    /// ## Example Usage
    /// 
    /// ### Backups (`dump`)
    /// 
    /// &gt; The resource with this content type uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ProxmoxVE = Pulumi.ProxmoxVE;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var backup = new ProxmoxVE.Storage.File("backup", new()
    ///     {
    ///         ContentType = "dump",
    ///         DatastoreId = "local",
    ///         NodeName = "pve",
    ///         SourceFile = new ProxmoxVE.Storage.Inputs.FileSourceFileArgs
    ///         {
    ///             Path = "vzdump-lxc-100-2023_11_08-23_10_05.tar",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Images
    /// 
    /// &gt; Consider using `proxmoxve.Download.File` resource instead. Using this resource for images is less efficient (requires to transfer uploaded image to node) though still supported.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ProxmoxVE = Pulumi.ProxmoxVE;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ubuntuContainerTemplate = new ProxmoxVE.Storage.File("ubuntuContainerTemplate", new()
    ///     {
    ///         ContentType = "iso",
    ///         DatastoreId = "local",
    ///         NodeName = "pve",
    ///         SourceFile = new ProxmoxVE.Storage.Inputs.FileSourceFileArgs
    ///         {
    ///             Path = "https://cloud-images.ubuntu.com/jammy/20230929/jammy-server-cloudimg-amd64-disk-kvm.img",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Container Template (`vztmpl`)
    /// 
    /// &gt; Consider using `proxmoxve.Download.File` resource instead. Using this resource for container images is less efficient (requires to transfer uploaded image to node) though still supported.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using ProxmoxVE = Pulumi.ProxmoxVE;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ubuntuContainerTemplate = new ProxmoxVE.Storage.File("ubuntuContainerTemplate", new()
    ///     {
    ///         ContentType = "vztmpl",
    ///         DatastoreId = "local",
    ///         NodeName = "first-node",
    ///         SourceFile = new ProxmoxVE.Storage.Inputs.FileSourceFileArgs
    ///         {
    ///             Path = "https://download.proxmox.com/images/system/ubuntu-20.04-standard_20.04-1_amd64.tar.gz",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Important Notes
    /// 
    /// The Proxmox VE API endpoint for file uploads does not support chunked transfer
    /// encoding, which means that we must first store the source file as a temporary
    /// file locally before uploading it.
    /// 
    /// You must ensure that you have at least `Size-in-MB * 2 + 1` MB of storage space
    /// available (twice the size plus overhead because a multipart payload needs to be
    /// created as another temporary file).
    /// 
    /// By default, if the specified file already exists, the resource will
    /// unconditionally replace it and take ownership of the resource. On destruction,
    /// the file will be deleted as if it did not exist before. If you want to prevent
    /// the resource from replacing the file, set `overwrite` to `false`.
    /// 
    /// ## Import
    /// 
    /// Instances can be imported using the `node_name`, `datastore_id`, `content_type`
    /// 
    /// and the `file_name` in the following format:
    /// 
    /// text
    /// 
    /// node_name:datastore_id/content_type/file_name
    /// 
    /// Example:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import proxmoxve:Storage/file:File cloud_config pve/local:snippets/example.cloud-config.yaml
    /// ```
    /// </summary>
    [ProxmoxVEResourceType("proxmoxve:Storage/file:File")]
    public partial class File : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The content type. If not specified, the content
        /// type will be inferred from the file extension. Valid values are:
        /// </summary>
        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        /// <summary>
        /// The datastore id.
        /// </summary>
        [Output("datastoreId")]
        public Output<string> DatastoreId { get; private set; } = null!;

        /// <summary>
        /// The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root@pam` authenticated user.
        /// </summary>
        [Output("fileMode")]
        public Output<string?> FileMode { get; private set; } = null!;

        /// <summary>
        /// The file modification date (RFC 3339).
        /// </summary>
        [Output("fileModificationDate")]
        public Output<string> FileModificationDate { get; private set; } = null!;

        /// <summary>
        /// The file name.
        /// </summary>
        [Output("fileName")]
        public Output<string> FileName { get; private set; } = null!;

        /// <summary>
        /// The file size in bytes.
        /// </summary>
        [Output("fileSize")]
        public Output<int> FileSize { get; private set; } = null!;

        /// <summary>
        /// The file tag.
        /// </summary>
        [Output("fileTag")]
        public Output<string> FileTag { get; private set; } = null!;

        /// <summary>
        /// The node name.
        /// </summary>
        [Output("nodeName")]
        public Output<string> NodeName { get; private set; } = null!;

        /// <summary>
        /// Whether to overwrite an existing file (defaults to
        /// `true`).
        /// </summary>
        [Output("overwrite")]
        public Output<bool?> Overwrite { get; private set; } = null!;

        /// <summary>
        /// The source file (conflicts with `source_raw`),
        /// could be a local file or a URL. If the source file is a URL, the file will
        /// be downloaded and stored locally before uploading it to Proxmox VE.
        /// </summary>
        [Output("sourceFile")]
        public Output<Outputs.FileSourceFile?> SourceFile { get; private set; } = null!;

        /// <summary>
        /// The raw source (conflicts with `source_file`).
        /// </summary>
        [Output("sourceRaw")]
        public Output<Outputs.FileSourceRaw?> SourceRaw { get; private set; } = null!;

        /// <summary>
        /// Timeout for uploading ISO/VSTMPL files in
        /// seconds (defaults to 1800).
        /// </summary>
        [Output("timeoutUpload")]
        public Output<int?> TimeoutUpload { get; private set; } = null!;


        /// <summary>
        /// Create a File resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public File(string name, FileArgs args, CustomResourceOptions? options = null)
            : base("proxmoxve:Storage/file:File", name, args ?? new FileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private File(string name, Input<string> id, FileState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Storage/file:File", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/muhlba91/pulumi-proxmoxve",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing File resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static File Get(string name, Input<string> id, FileState? state = null, CustomResourceOptions? options = null)
        {
            return new File(name, id, state, options);
        }
    }

    public sealed class FileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content type. If not specified, the content
        /// type will be inferred from the file extension. Valid values are:
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// The datastore id.
        /// </summary>
        [Input("datastoreId", required: true)]
        public Input<string> DatastoreId { get; set; } = null!;

        /// <summary>
        /// The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("fileMode")]
        public Input<string>? FileMode { get; set; }

        /// <summary>
        /// The node name.
        /// </summary>
        [Input("nodeName", required: true)]
        public Input<string> NodeName { get; set; } = null!;

        /// <summary>
        /// Whether to overwrite an existing file (defaults to
        /// `true`).
        /// </summary>
        [Input("overwrite")]
        public Input<bool>? Overwrite { get; set; }

        /// <summary>
        /// The source file (conflicts with `source_raw`),
        /// could be a local file or a URL. If the source file is a URL, the file will
        /// be downloaded and stored locally before uploading it to Proxmox VE.
        /// </summary>
        [Input("sourceFile")]
        public Input<Inputs.FileSourceFileArgs>? SourceFile { get; set; }

        /// <summary>
        /// The raw source (conflicts with `source_file`).
        /// </summary>
        [Input("sourceRaw")]
        public Input<Inputs.FileSourceRawArgs>? SourceRaw { get; set; }

        /// <summary>
        /// Timeout for uploading ISO/VSTMPL files in
        /// seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutUpload")]
        public Input<int>? TimeoutUpload { get; set; }

        public FileArgs()
        {
        }
        public static new FileArgs Empty => new FileArgs();
    }

    public sealed class FileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The content type. If not specified, the content
        /// type will be inferred from the file extension. Valid values are:
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// The datastore id.
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        /// <summary>
        /// The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root@pam` authenticated user.
        /// </summary>
        [Input("fileMode")]
        public Input<string>? FileMode { get; set; }

        /// <summary>
        /// The file modification date (RFC 3339).
        /// </summary>
        [Input("fileModificationDate")]
        public Input<string>? FileModificationDate { get; set; }

        /// <summary>
        /// The file name.
        /// </summary>
        [Input("fileName")]
        public Input<string>? FileName { get; set; }

        /// <summary>
        /// The file size in bytes.
        /// </summary>
        [Input("fileSize")]
        public Input<int>? FileSize { get; set; }

        /// <summary>
        /// The file tag.
        /// </summary>
        [Input("fileTag")]
        public Input<string>? FileTag { get; set; }

        /// <summary>
        /// The node name.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// Whether to overwrite an existing file (defaults to
        /// `true`).
        /// </summary>
        [Input("overwrite")]
        public Input<bool>? Overwrite { get; set; }

        /// <summary>
        /// The source file (conflicts with `source_raw`),
        /// could be a local file or a URL. If the source file is a URL, the file will
        /// be downloaded and stored locally before uploading it to Proxmox VE.
        /// </summary>
        [Input("sourceFile")]
        public Input<Inputs.FileSourceFileGetArgs>? SourceFile { get; set; }

        /// <summary>
        /// The raw source (conflicts with `source_file`).
        /// </summary>
        [Input("sourceRaw")]
        public Input<Inputs.FileSourceRawGetArgs>? SourceRaw { get; set; }

        /// <summary>
        /// Timeout for uploading ISO/VSTMPL files in
        /// seconds (defaults to 1800).
        /// </summary>
        [Input("timeoutUpload")]
        public Input<int>? TimeoutUpload { get; set; }

        public FileState()
        {
        }
        public static new FileState Empty => new FileState();
    }
}
