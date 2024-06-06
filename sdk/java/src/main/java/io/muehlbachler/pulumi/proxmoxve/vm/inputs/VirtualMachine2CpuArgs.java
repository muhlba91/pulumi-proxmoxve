// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachine2CpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachine2CpuArgs Empty = new VirtualMachine2CpuArgs();

    /**
     * The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    @Import(name="affinity")
    private @Nullable Output<String> affinity;

    /**
     * @return The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    public Optional<Output<String>> affinity() {
        return Optional.ofNullable(this.affinity);
    }

    /**
     * The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    /**
     * @return The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The number of CPU cores per socket (defaults to `1`).
     * 
     */
    @Import(name="cores")
    private @Nullable Output<Integer> cores;

    /**
     * @return The number of CPU cores per socket (defaults to `1`).
     * 
     */
    public Optional<Output<Integer>> cores() {
        return Optional.ofNullable(this.cores);
    }

    /**
     * Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
     * 
     */
    @Import(name="flags")
    private @Nullable Output<List<String>> flags;

    /**
     * @return Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
     * 
     */
    public Optional<Output<List<String>>> flags() {
        return Optional.ofNullable(this.flags);
    }

    /**
     * The number of hotplugged vCPUs (defaults to `0`).
     * 
     */
    @Import(name="hotplugged")
    private @Nullable Output<Integer> hotplugged;

    /**
     * @return The number of hotplugged vCPUs (defaults to `0`).
     * 
     */
    public Optional<Output<Integer>> hotplugged() {
        return Optional.ofNullable(this.hotplugged);
    }

    /**
     * Limit of CPU usage (defaults to `0` which means no limit).
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Limit of CPU usage (defaults to `0` which means no limit).
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    /**
     * Enable NUMA (defaults to `false`).
     * 
     */
    @Import(name="numa")
    private @Nullable Output<Boolean> numa;

    /**
     * @return Enable NUMA (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> numa() {
        return Optional.ofNullable(this.numa);
    }

    /**
     * The number of CPU sockets (defaults to `1`).
     * 
     */
    @Import(name="sockets")
    private @Nullable Output<Integer> sockets;

    /**
     * @return The number of CPU sockets (defaults to `1`).
     * 
     */
    public Optional<Output<Integer>> sockets() {
        return Optional.ofNullable(this.sockets);
    }

    /**
     * Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
     * 
     */
    @Import(name="units")
    private @Nullable Output<Integer> units;

    /**
     * @return CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
     * 
     */
    public Optional<Output<Integer>> units() {
        return Optional.ofNullable(this.units);
    }

    private VirtualMachine2CpuArgs() {}

    private VirtualMachine2CpuArgs(VirtualMachine2CpuArgs $) {
        this.affinity = $.affinity;
        this.architecture = $.architecture;
        this.cores = $.cores;
        this.flags = $.flags;
        this.hotplugged = $.hotplugged;
        this.limit = $.limit;
        this.numa = $.numa;
        this.sockets = $.sockets;
        this.type = $.type;
        this.units = $.units;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachine2CpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachine2CpuArgs $;

        public Builder() {
            $ = new VirtualMachine2CpuArgs();
        }

        public Builder(VirtualMachine2CpuArgs defaults) {
            $ = new VirtualMachine2CpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param affinity The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder affinity(@Nullable Output<String> affinity) {
            $.affinity = affinity;
            return this;
        }

        /**
         * @param affinity The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder affinity(String affinity) {
            return affinity(Output.of(affinity));
        }

        /**
         * @param architecture The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param cores The number of CPU cores per socket (defaults to `1`).
         * 
         * @return builder
         * 
         */
        public Builder cores(@Nullable Output<Integer> cores) {
            $.cores = cores;
            return this;
        }

        /**
         * @param cores The number of CPU cores per socket (defaults to `1`).
         * 
         * @return builder
         * 
         */
        public Builder cores(Integer cores) {
            return cores(Output.of(cores));
        }

        /**
         * @param flags Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Output<List<String>> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
         * 
         * @return builder
         * 
         */
        public Builder flags(List<String> flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param flags Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
         * 
         * @return builder
         * 
         */
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }

        /**
         * @param hotplugged The number of hotplugged vCPUs (defaults to `0`).
         * 
         * @return builder
         * 
         */
        public Builder hotplugged(@Nullable Output<Integer> hotplugged) {
            $.hotplugged = hotplugged;
            return this;
        }

        /**
         * @param hotplugged The number of hotplugged vCPUs (defaults to `0`).
         * 
         * @return builder
         * 
         */
        public Builder hotplugged(Integer hotplugged) {
            return hotplugged(Output.of(hotplugged));
        }

        /**
         * @param limit Limit of CPU usage (defaults to `0` which means no limit).
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Limit of CPU usage (defaults to `0` which means no limit).
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        /**
         * @param numa Enable NUMA (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder numa(@Nullable Output<Boolean> numa) {
            $.numa = numa;
            return this;
        }

        /**
         * @param numa Enable NUMA (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder numa(Boolean numa) {
            return numa(Output.of(numa));
        }

        /**
         * @param sockets The number of CPU sockets (defaults to `1`).
         * 
         * @return builder
         * 
         */
        public Builder sockets(@Nullable Output<Integer> sockets) {
            $.sockets = sockets;
            return this;
        }

        /**
         * @param sockets The number of CPU sockets (defaults to `1`).
         * 
         * @return builder
         * 
         */
        public Builder sockets(Integer sockets) {
            return sockets(Output.of(sockets));
        }

        /**
         * @param type Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param units CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
         * 
         * @return builder
         * 
         */
        public Builder units(@Nullable Output<Integer> units) {
            $.units = units;
            return this;
        }

        /**
         * @param units CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
         * 
         * @return builder
         * 
         */
        public Builder units(Integer units) {
            return units(Output.of(units));
        }

        public VirtualMachine2CpuArgs build() {
            return $;
        }
    }

}
