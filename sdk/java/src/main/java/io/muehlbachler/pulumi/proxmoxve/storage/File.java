// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Storage.FileArgs;
import io.muehlbachler.pulumi.proxmoxve.Storage.inputs.FileState;
import io.muehlbachler.pulumi.proxmoxve.Storage.outputs.FileSourceFile;
import io.muehlbachler.pulumi.proxmoxve.Storage.outputs.FileSourceRaw;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a file.
 * 
 * ## Example Usage
 * ### Backups (`dump`)
 * 
 * &gt; **Note:** The resource with this content type uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.proxmoxve.Storage.File;
 * import com.pulumi.proxmoxve.Storage.FileArgs;
 * import com.pulumi.proxmoxve.Storage.inputs.FileSourceFileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var backup = new File(&#34;backup&#34;, FileArgs.builder()        
 *             .contentType(&#34;dump&#34;)
 *             .datastoreId(&#34;local&#34;)
 *             .nodeName(&#34;pve&#34;)
 *             .sourceFile(FileSourceFileArgs.builder()
 *                 .path(&#34;vzdump-lxc-100-2023_11_08-23_10_05.tar&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Images
 * 
 * **Consider using `proxmoxve.Download.File` resource instead. Using this resource for images is less efficient (requires to transfer uploaded image to node) though still supported.**
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.proxmoxve.Storage.File;
 * import com.pulumi.proxmoxve.Storage.FileArgs;
 * import com.pulumi.proxmoxve.Storage.inputs.FileSourceFileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var ubuntuContainerTemplate = new File(&#34;ubuntuContainerTemplate&#34;, FileArgs.builder()        
 *             .contentType(&#34;iso&#34;)
 *             .datastoreId(&#34;local&#34;)
 *             .nodeName(&#34;pve&#34;)
 *             .sourceFile(FileSourceFileArgs.builder()
 *                 .path(&#34;https://cloud-images.ubuntu.com/jammy/20230929/jammy-server-cloudimg-amd64-disk-kvm.img&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Container Template (`vztmpl`)
 * 
 * **Consider using `proxmoxve.Download.File` resource instead. Using this resource for container images is less efficient (requires to transfer uploaded image to node) though still supported.**
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.proxmoxve.Storage.File;
 * import com.pulumi.proxmoxve.Storage.FileArgs;
 * import com.pulumi.proxmoxve.Storage.inputs.FileSourceFileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var ubuntuContainerTemplate = new File(&#34;ubuntuContainerTemplate&#34;, FileArgs.builder()        
 *             .contentType(&#34;vztmpl&#34;)
 *             .datastoreId(&#34;local&#34;)
 *             .nodeName(&#34;first-node&#34;)
 *             .sourceFile(FileSourceFileArgs.builder()
 *                 .path(&#34;https://download.proxmox.com/images/system/ubuntu-20.04-standard_20.04-1_amd64.tar.gz&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
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
 * Instances can be imported using the `node_name`, `datastore_id`, `content_type` and the `file_name` in the following formattext node_name:datastore_id/content_type/file_name Examplebash
 * 
 * ```sh
 *  $ pulumi import proxmoxve:Storage/file:File cloud_config pve/local:snippets/example.cloud-config.yaml
 * ```
 * 
 */
@ResourceType(type="proxmoxve:Storage/file:File")
public class File extends com.pulumi.resources.CustomResource {
    /**
     * The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * The datastore id.
     * 
     */
    @Export(name="datastoreId", refs={String.class}, tree="[0]")
    private Output<String> datastoreId;

    /**
     * @return The datastore id.
     * 
     */
    public Output<String> datastoreId() {
        return this.datastoreId;
    }
    /**
     * The file modification date (RFC 3339).
     * 
     */
    @Export(name="fileModificationDate", refs={String.class}, tree="[0]")
    private Output<String> fileModificationDate;

    /**
     * @return The file modification date (RFC 3339).
     * 
     */
    public Output<String> fileModificationDate() {
        return this.fileModificationDate;
    }
    /**
     * The file name.
     * 
     */
    @Export(name="fileName", refs={String.class}, tree="[0]")
    private Output<String> fileName;

    /**
     * @return The file name.
     * 
     */
    public Output<String> fileName() {
        return this.fileName;
    }
    /**
     * The file size in bytes.
     * 
     */
    @Export(name="fileSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> fileSize;

    /**
     * @return The file size in bytes.
     * 
     */
    public Output<Integer> fileSize() {
        return this.fileSize;
    }
    /**
     * The file tag.
     * 
     */
    @Export(name="fileTag", refs={String.class}, tree="[0]")
    private Output<String> fileTag;

    /**
     * @return The file tag.
     * 
     */
    public Output<String> fileTag() {
        return this.fileTag;
    }
    /**
     * The node name.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return The node name.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * Whether to overwrite an existing file (defaults to
     * `true`).
     * 
     */
    @Export(name="overwrite", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> overwrite;

    /**
     * @return Whether to overwrite an existing file (defaults to
     * `true`).
     * 
     */
    public Output<Optional<Boolean>> overwrite() {
        return Codegen.optional(this.overwrite);
    }
    /**
     * The source file (conflicts with `source_raw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     * 
     */
    @Export(name="sourceFile", refs={FileSourceFile.class}, tree="[0]")
    private Output</* @Nullable */ FileSourceFile> sourceFile;

    /**
     * @return The source file (conflicts with `source_raw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     * 
     */
    public Output<Optional<FileSourceFile>> sourceFile() {
        return Codegen.optional(this.sourceFile);
    }
    /**
     * The raw source (conflicts with `source_file`).
     * 
     */
    @Export(name="sourceRaw", refs={FileSourceRaw.class}, tree="[0]")
    private Output</* @Nullable */ FileSourceRaw> sourceRaw;

    /**
     * @return The raw source (conflicts with `source_file`).
     * 
     */
    public Output<Optional<FileSourceRaw>> sourceRaw() {
        return Codegen.optional(this.sourceRaw);
    }
    /**
     * Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     * 
     */
    @Export(name="timeoutUpload", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutUpload;

    /**
     * @return Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutUpload() {
        return Codegen.optional(this.timeoutUpload);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public File(String name) {
        this(name, FileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public File(String name, FileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public File(String name, FileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Storage/file:File", name, args == null ? FileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private File(String name, Output<String> id, @Nullable FileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Storage/file:File", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static File get(String name, Output<String> id, @Nullable FileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new File(name, id, state, options);
    }
}
