// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.Vm2Args;
import io.muehlbachler.pulumi.proxmoxve.inputs.Vm2State;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Cdrom;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Clone;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Cpu;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Timeouts;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Vga;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **DO NOT USE**
 * This is an experimental implementation of a Proxmox VM resource using Plugin Framework.&lt;br&gt;&lt;br&gt;It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.
 * 
 * &gt; Many attributes are marked as **optional** _and_ **computed** in the schema,
 * hence you may seem added to the plan with &#34;(known after apply)&#34; status, even if they are not set in the configuration.
 * This is done to support the `clone` operation, when a VM is created from an existing VM or template,
 * and the source attributes are copied to the clone.&lt;br&gt;&lt;br&gt;
 * Computed attributes allow the provider to set those attributes without user input.
 * The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.
 * 
 * @deprecated
 * proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2
 * 
 */
@Deprecated /* proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2 */
@ResourceType(type="proxmoxve:index/vm2:Vm2")
public class Vm2 extends com.pulumi.resources.CustomResource {
    /**
     * The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
     * 
     */
    @Export(name="cdrom", refs={Map.class,String.class,Vm2Cdrom.class}, tree="[0,1,2]")
    private Output<Map<String,Vm2Cdrom>> cdrom;

    /**
     * @return The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
     * 
     */
    public Output<Map<String,Vm2Cdrom>> cdrom() {
        return this.cdrom;
    }
    /**
     * The cloning configuration.
     * 
     */
    @Export(name="clone", refs={Vm2Clone.class}, tree="[0]")
    private Output</* @Nullable */ Vm2Clone> clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Output<Optional<Vm2Clone>> clone_() {
        return Codegen.optional(this.clone);
    }
    /**
     * The CPU configuration.
     * 
     */
    @Export(name="cpu", refs={Vm2Cpu.class}, tree="[0]")
    private Output<Vm2Cpu> cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Output<Vm2Cpu> cpu() {
        return this.cpu;
    }
    /**
     * The description of the VM.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the VM.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the VM. Doesn&#39;t have to be unique.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VM. Doesn&#39;t have to be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the node where the VM is provisioned.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return The name of the node where the VM is provisioned.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
     * 
     */
    @Export(name="stopOnDestroy", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> stopOnDestroy;

    /**
     * @return Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
     * 
     */
    public Output<Boolean> stopOnDestroy() {
        return this.stopOnDestroy;
    }
    /**
     * The tags assigned to the VM.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return The tags assigned to the VM.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Set to true to create a VM template.
     * 
     */
    @Export(name="template", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> template;

    /**
     * @return Set to true to create a VM template.
     * 
     */
    public Output<Optional<Boolean>> template() {
        return Codegen.optional(this.template);
    }
    @Export(name="timeouts", refs={Vm2Timeouts.class}, tree="[0]")
    private Output</* @Nullable */ Vm2Timeouts> timeouts;

    public Output<Optional<Vm2Timeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
     * 
     */
    @Export(name="vga", refs={Vm2Vga.class}, tree="[0]")
    private Output<Vm2Vga> vga;

    /**
     * @return Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
     * 
     */
    public Output<Vm2Vga> vga() {
        return this.vga;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vm2(java.lang.String name) {
        this(name, Vm2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vm2(java.lang.String name, Vm2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vm2(java.lang.String name, Vm2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/vm2:Vm2", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Vm2(java.lang.String name, Output<java.lang.String> id, @Nullable Vm2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/vm2:Vm2", name, state, makeResourceOptions(options, id), false);
    }

    private static Vm2Args makeArgs(Vm2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? Vm2Args.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/muhlba91/pulumi-proxmoxve")
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
    public static Vm2 get(java.lang.String name, Output<java.lang.String> id, @Nullable Vm2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vm2(name, id, state, options);
    }
}
