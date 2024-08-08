// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Vm2Cpu {
    /**
     * @return The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    private @Nullable String affinity;
    /**
     * @return The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    private @Nullable String architecture;
    /**
     * @return The number of CPU cores per socket (defaults to `1`).
     * 
     */
    private @Nullable Integer cores;
    /**
     * @return Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
     * 
     */
    private @Nullable List<String> flags;
    /**
     * @return The number of hotplugged vCPUs (defaults to `0`).
     * 
     */
    private @Nullable Integer hotplugged;
    /**
     * @return Limit of CPU usage (defaults to `0` which means no limit).
     * 
     */
    private @Nullable Integer limit;
    /**
     * @return Enable NUMA (defaults to `false`).
     * 
     */
    private @Nullable Boolean numa;
    /**
     * @return The number of CPU sockets (defaults to `1`).
     * 
     */
    private @Nullable Integer sockets;
    /**
     * @return Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
     * 
     */
    private @Nullable String type;
    /**
     * @return CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
     * 
     */
    private @Nullable Integer units;

    private Vm2Cpu() {}
    /**
     * @return The CPU cores that are used to run the VM’s vCPU. The value is a list of CPU IDs, separated by commas. The CPU IDs are zero-based.  For example, `0,1,2,3` (which also can be shortened to `0-3`) means that the VM’s vCPUs are run on the first four CPU cores. Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    public Optional<String> affinity() {
        return Optional.ofNullable(this.affinity);
    }
    /**
     * @return The CPU architecture `&lt;aarch64 | x86_64&gt;` (defaults to the host). Setting `affinity` is only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    public Optional<String> architecture() {
        return Optional.ofNullable(this.architecture);
    }
    /**
     * @return The number of CPU cores per socket (defaults to `1`).
     * 
     */
    public Optional<Integer> cores() {
        return Optional.ofNullable(this.cores);
    }
    /**
     * @return Set of additional CPU flags. Use `+FLAG` to enable, `-FLAG` to disable a flag. Custom CPU models can specify any flag supported by QEMU/KVM, VM-specific flags must be from the following set for security reasons: `pcid`, `spec-ctrl`, `ibpb`, `ssbd`, `virt-ssbd`, `amd-ssbd`, `amd-no-ssb`, `pdpe1gb`, `md-clear`, `hv-tlbflush`, `hv-evmcs`, `aes`.
     * 
     */
    public List<String> flags() {
        return this.flags == null ? List.of() : this.flags;
    }
    /**
     * @return The number of hotplugged vCPUs (defaults to `0`).
     * 
     */
    public Optional<Integer> hotplugged() {
        return Optional.ofNullable(this.hotplugged);
    }
    /**
     * @return Limit of CPU usage (defaults to `0` which means no limit).
     * 
     */
    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }
    /**
     * @return Enable NUMA (defaults to `false`).
     * 
     */
    public Optional<Boolean> numa() {
        return Optional.ofNullable(this.numa);
    }
    /**
     * @return The number of CPU sockets (defaults to `1`).
     * 
     */
    public Optional<Integer> sockets() {
        return Optional.ofNullable(this.sockets);
    }
    /**
     * @return Emulated CPU type, it&#39;s recommended to use `x86-64-v2-AES` or higher (defaults to `kvm64`). See https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm*virtual*machines_settings for more information.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return CPU weight for a VM. Argument is used in the kernel fair scheduler. The larger the number is, the more CPU time this VM gets. Number is relative to weights of all the other running VMs.
     * 
     */
    public Optional<Integer> units() {
        return Optional.ofNullable(this.units);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Vm2Cpu defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String affinity;
        private @Nullable String architecture;
        private @Nullable Integer cores;
        private @Nullable List<String> flags;
        private @Nullable Integer hotplugged;
        private @Nullable Integer limit;
        private @Nullable Boolean numa;
        private @Nullable Integer sockets;
        private @Nullable String type;
        private @Nullable Integer units;
        public Builder() {}
        public Builder(Vm2Cpu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinity = defaults.affinity;
    	      this.architecture = defaults.architecture;
    	      this.cores = defaults.cores;
    	      this.flags = defaults.flags;
    	      this.hotplugged = defaults.hotplugged;
    	      this.limit = defaults.limit;
    	      this.numa = defaults.numa;
    	      this.sockets = defaults.sockets;
    	      this.type = defaults.type;
    	      this.units = defaults.units;
        }

        @CustomType.Setter
        public Builder affinity(@Nullable String affinity) {

            this.affinity = affinity;
            return this;
        }
        @CustomType.Setter
        public Builder architecture(@Nullable String architecture) {

            this.architecture = architecture;
            return this;
        }
        @CustomType.Setter
        public Builder cores(@Nullable Integer cores) {

            this.cores = cores;
            return this;
        }
        @CustomType.Setter
        public Builder flags(@Nullable List<String> flags) {

            this.flags = flags;
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }
        @CustomType.Setter
        public Builder hotplugged(@Nullable Integer hotplugged) {

            this.hotplugged = hotplugged;
            return this;
        }
        @CustomType.Setter
        public Builder limit(@Nullable Integer limit) {

            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder numa(@Nullable Boolean numa) {

            this.numa = numa;
            return this;
        }
        @CustomType.Setter
        public Builder sockets(@Nullable Integer sockets) {

            this.sockets = sockets;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder units(@Nullable Integer units) {

            this.units = units;
            return this;
        }
        public Vm2Cpu build() {
            final var _resultValue = new Vm2Cpu();
            _resultValue.affinity = affinity;
            _resultValue.architecture = architecture;
            _resultValue.cores = cores;
            _resultValue.flags = flags;
            _resultValue.hotplugged = hotplugged;
            _resultValue.limit = limit;
            _resultValue.numa = numa;
            _resultValue.sockets = sockets;
            _resultValue.type = type;
            _resultValue.units = units;
            return _resultValue;
        }
    }
}
