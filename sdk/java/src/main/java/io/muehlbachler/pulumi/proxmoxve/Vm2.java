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
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Clone;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Cpu;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Timeouts;
import io.muehlbachler.pulumi.proxmoxve.outputs.Vm2Vga;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * @deprecated
 * proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2
 * 
 */
@Deprecated /* proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2 */
@ResourceType(type="proxmoxve:index/vm2:Vm2")
public class Vm2 extends com.pulumi.resources.CustomResource {
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
     * Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga
     * memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
     * and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
     * independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
     * a serial device as terminal. See the [Proxmox
     * documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
     * more information and available configuration parameters.
     * 
     */
    @Export(name="vga", refs={Vm2Vga.class}, tree="[0]")
    private Output<Vm2Vga> vga;

    /**
     * @return Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga
     * memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
     * and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
     * independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
     * a serial device as terminal. See the [Proxmox
     * documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
     * more information and available configuration parameters.
     * 
     */
    public Output<Vm2Vga> vga() {
        return this.vga;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vm2(String name) {
        this(name, Vm2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vm2(String name, Vm2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vm2(String name, Vm2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/vm2:Vm2", name, args == null ? Vm2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vm2(String name, Output<String> id, @Nullable Vm2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/vm2:Vm2", name, state, makeResourceOptions(options, id));
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
    public static Vm2 get(String name, Output<String> id, @Nullable Vm2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vm2(name, id, state, options);
    }
}
