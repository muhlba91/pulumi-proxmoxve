// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.CT.ContainerArgs;
import io.muehlbachler.pulumi.proxmoxve.CT.inputs.ContainerState;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerClone;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerConsole;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerCpu;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerDisk;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerFeatures;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerInitialization;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerMemory;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerMountPoint;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerNetworkInterface;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerOperatingSystem;
import io.muehlbachler.pulumi.proxmoxve.CT.outputs.ContainerStartup;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a container.
 * 
 * ## Import
 * 
 * Instances can be imported using the `node_name` and the `vm_id`, e.g.,
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import proxmoxve:CT/container:Container ubuntu_container first-node/1234
 * ```
 * 
 */
@ResourceType(type="proxmoxve:CT/container:Container")
public class Container extends com.pulumi.resources.CustomResource {
    /**
     * The cloning configuration.
     * 
     */
    @Export(name="clone", refs={ContainerClone.class}, tree="[0]")
    private Output</* @Nullable */ ContainerClone> clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Output<Optional<ContainerClone>> clone_() {
        return Codegen.optional(this.clone);
    }
    /**
     * Console.
     * 
     */
    @Export(name="console", refs={ContainerConsole.class}, tree="[0]")
    private Output</* @Nullable */ ContainerConsole> console;

    /**
     * @return Console.
     * 
     */
    public Output<Optional<ContainerConsole>> console() {
        return Codegen.optional(this.console);
    }
    /**
     * The CPU configuration.
     * 
     */
    @Export(name="cpu", refs={ContainerCpu.class}, tree="[0]")
    private Output</* @Nullable */ ContainerCpu> cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Output<Optional<ContainerCpu>> cpu() {
        return Codegen.optional(this.cpu);
    }
    /**
     * The description.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The disk configuration.
     * 
     */
    @Export(name="disk", refs={ContainerDisk.class}, tree="[0]")
    private Output</* @Nullable */ ContainerDisk> disk;

    /**
     * @return The disk configuration.
     * 
     */
    public Output<Optional<ContainerDisk>> disk() {
        return Codegen.optional(this.disk);
    }
    /**
     * The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
     * 
     */
    @Export(name="features", refs={ContainerFeatures.class}, tree="[0]")
    private Output</* @Nullable */ ContainerFeatures> features;

    /**
     * @return The container feature flags. Changing flags (except nesting) is only allowed for `root@pam` authenticated user.
     * 
     */
    public Output<Optional<ContainerFeatures>> features() {
        return Codegen.optional(this.features);
    }
    /**
     * The identifier for a file containing a hook script (needs to be executable).
     * 
     */
    @Export(name="hookScriptFileId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hookScriptFileId;

    /**
     * @return The identifier for a file containing a hook script (needs to be executable).
     * 
     */
    public Output<Optional<String>> hookScriptFileId() {
        return Codegen.optional(this.hookScriptFileId);
    }
    /**
     * The initialization configuration.
     * 
     */
    @Export(name="initialization", refs={ContainerInitialization.class}, tree="[0]")
    private Output</* @Nullable */ ContainerInitialization> initialization;

    /**
     * @return The initialization configuration.
     * 
     */
    public Output<Optional<ContainerInitialization>> initialization() {
        return Codegen.optional(this.initialization);
    }
    /**
     * The memory configuration.
     * 
     */
    @Export(name="memory", refs={ContainerMemory.class}, tree="[0]")
    private Output</* @Nullable */ ContainerMemory> memory;

    /**
     * @return The memory configuration.
     * 
     */
    public Output<Optional<ContainerMemory>> memory() {
        return Codegen.optional(this.memory);
    }
    /**
     * A mount point
     * 
     */
    @Export(name="mountPoints", refs={List.class,ContainerMountPoint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ContainerMountPoint>> mountPoints;

    /**
     * @return A mount point
     * 
     */
    public Output<Optional<List<ContainerMountPoint>>> mountPoints() {
        return Codegen.optional(this.mountPoints);
    }
    /**
     * A network interface (multiple blocks
     * supported).
     * 
     */
    @Export(name="networkInterfaces", refs={List.class,ContainerNetworkInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ContainerNetworkInterface>> networkInterfaces;

    /**
     * @return A network interface (multiple blocks
     * supported).
     * 
     */
    public Output<Optional<List<ContainerNetworkInterface>>> networkInterfaces() {
        return Codegen.optional(this.networkInterfaces);
    }
    /**
     * The name of the node to assign the container to.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return The name of the node to assign the container to.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * The Operating System configuration.
     * 
     */
    @Export(name="operatingSystem", refs={ContainerOperatingSystem.class}, tree="[0]")
    private Output</* @Nullable */ ContainerOperatingSystem> operatingSystem;

    /**
     * @return The Operating System configuration.
     * 
     */
    public Output<Optional<ContainerOperatingSystem>> operatingSystem() {
        return Codegen.optional(this.operatingSystem);
    }
    /**
     * The identifier for a pool to assign the container to.
     * 
     */
    @Export(name="poolId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> poolId;

    /**
     * @return The identifier for a pool to assign the container to.
     * 
     */
    public Output<Optional<String>> poolId() {
        return Codegen.optional(this.poolId);
    }
    /**
     * Automatically start container when the host
     * system boots (defaults to `true`).
     * 
     */
    @Export(name="startOnBoot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startOnBoot;

    /**
     * @return Automatically start container when the host
     * system boots (defaults to `true`).
     * 
     */
    public Output<Optional<Boolean>> startOnBoot() {
        return Codegen.optional(this.startOnBoot);
    }
    /**
     * Whether to start the container (defaults to `true`).
     * 
     */
    @Export(name="started", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> started;

    /**
     * @return Whether to start the container (defaults to `true`).
     * 
     */
    public Output<Optional<Boolean>> started() {
        return Codegen.optional(this.started);
    }
    /**
     * Defines startup and shutdown behavior of the container.
     * 
     */
    @Export(name="startup", refs={ContainerStartup.class}, tree="[0]")
    private Output</* @Nullable */ ContainerStartup> startup;

    /**
     * @return Defines startup and shutdown behavior of the container.
     * 
     */
    public Output<Optional<ContainerStartup>> startup() {
        return Codegen.optional(this.startup);
    }
    /**
     * A list of tags the container tags. This is only meta
     * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
     * If the list in template is not sorted, then Proxmox will always report a
     * difference on the resource. You may use the `ignore_changes` lifecycle
     * meta-argument to ignore changes to this attribute.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags the container tags. This is only meta
     * information (defaults to `[]`). Note: Proxmox always sorts the container tags.
     * If the list in template is not sorted, then Proxmox will always report a
     * difference on the resource. You may use the `ignore_changes` lifecycle
     * meta-argument to ignore changes to this attribute.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether to create a template (defaults to `false`).
     * 
     */
    @Export(name="template", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> template;

    /**
     * @return Whether to create a template (defaults to `false`).
     * 
     */
    public Output<Optional<Boolean>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * Timeout for creating a container in seconds (defaults to 1800).
     * 
     */
    @Export(name="timeoutCreate", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> timeoutCreate;

    /**
     * @return Timeout for creating a container in seconds (defaults to 1800).
     * 
     */
    public Output<Optional<Integer>> timeoutCreate() {
        return Codegen.optional(this.timeoutCreate);
    }
    /**
     * Whether the container runs as unprivileged on
     * the host (defaults to `false`).
     * 
     */
    @Export(name="unprivileged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> unprivileged;

    /**
     * @return Whether the container runs as unprivileged on
     * the host (defaults to `false`).
     * 
     */
    public Output<Optional<Boolean>> unprivileged() {
        return Codegen.optional(this.unprivileged);
    }
    /**
     * The container identifier
     * 
     */
    @Export(name="vmId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vmId;

    /**
     * @return The container identifier
     * 
     */
    public Output<Optional<Integer>> vmId() {
        return Codegen.optional(this.vmId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Container(String name) {
        this(name, ContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Container(String name, ContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Container(String name, ContainerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:CT/container:Container", name, args == null ? ContainerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Container(String name, Output<String> id, @Nullable ContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:CT/container:Container", name, state, makeResourceOptions(options, id));
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
    public static Container get(String name, Output<String> id, @Nullable ContainerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Container(name, id, state, options);
    }
}
