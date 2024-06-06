// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.inputs.Vm2CloneArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.Vm2CpuArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.Vm2TimeoutsArgs;
import io.muehlbachler.pulumi.proxmoxve.inputs.Vm2VgaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Vm2State extends com.pulumi.resources.ResourceArgs {

    public static final Vm2State Empty = new Vm2State();

    /**
     * The cloning configuration.
     * 
     */
    @Import(name="clone")
    private @Nullable Output<Vm2CloneArgs> clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Optional<Output<Vm2CloneArgs>> clone_() {
        return Optional.ofNullable(this.clone);
    }

    /**
     * The CPU configuration.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Vm2CpuArgs> cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Optional<Output<Vm2CpuArgs>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The description of the VM.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the VM.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the VM. Doesn&#39;t have to be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the VM. Doesn&#39;t have to be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the node where the VM is provisioned.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return The name of the node where the VM is provisioned.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * The tags assigned to the VM.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags assigned to the VM.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Set to true to create a VM template.
     * 
     */
    @Import(name="template")
    private @Nullable Output<Boolean> template;

    /**
     * @return Set to true to create a VM template.
     * 
     */
    public Optional<Output<Boolean>> template() {
        return Optional.ofNullable(this.template);
    }

    @Import(name="timeouts")
    private @Nullable Output<Vm2TimeoutsArgs> timeouts;

    public Optional<Output<Vm2TimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
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
    @Import(name="vga")
    private @Nullable Output<Vm2VgaArgs> vga;

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
    public Optional<Output<Vm2VgaArgs>> vga() {
        return Optional.ofNullable(this.vga);
    }

    private Vm2State() {}

    private Vm2State(Vm2State $) {
        this.clone = $.clone;
        this.cpu = $.cpu;
        this.description = $.description;
        this.name = $.name;
        this.nodeName = $.nodeName;
        this.tags = $.tags;
        this.template = $.template;
        this.timeouts = $.timeouts;
        this.vga = $.vga;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Vm2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Vm2State $;

        public Builder() {
            $ = new Vm2State();
        }

        public Builder(Vm2State defaults) {
            $ = new Vm2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param clone The cloning configuration.
         * 
         * @return builder
         * 
         */
        public Builder clone_(@Nullable Output<Vm2CloneArgs> clone) {
            $.clone = clone;
            return this;
        }

        /**
         * @param clone The cloning configuration.
         * 
         * @return builder
         * 
         */
        public Builder clone_(Vm2CloneArgs clone) {
            return clone_(Output.of(clone));
        }

        /**
         * @param cpu The CPU configuration.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Vm2CpuArgs> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The CPU configuration.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Vm2CpuArgs cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param description The description of the VM.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the VM.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the VM. Doesn&#39;t have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the VM. Doesn&#39;t have to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeName The name of the node where the VM is provisioned.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the node where the VM is provisioned.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param tags The tags assigned to the VM.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags assigned to the VM.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags assigned to the VM.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param template Set to true to create a VM template.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<Boolean> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Set to true to create a VM template.
         * 
         * @return builder
         * 
         */
        public Builder template(Boolean template) {
            return template(Output.of(template));
        }

        public Builder timeouts(@Nullable Output<Vm2TimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(Vm2TimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param vga Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga
         * memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
         * and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
         * independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
         * a serial device as terminal. See the [Proxmox
         * documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
         * more information and available configuration parameters.
         * 
         * @return builder
         * 
         */
        public Builder vga(@Nullable Output<Vm2VgaArgs> vga) {
            $.vga = vga;
            return this;
        }

        /**
         * @param vga Configure the VGA Hardware. If you want to use high resolution modes (&gt;= 1280x1024x16) you may need to increase the vga
         * memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
         * and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
         * independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
         * a serial device as terminal. See the [Proxmox
         * documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
         * more information and available configuration parameters.
         * 
         * @return builder
         * 
         */
        public Builder vga(Vm2VgaArgs vga) {
            return vga(Output.of(vga));
        }

        public Vm2State build() {
            return $;
        }
    }

}
