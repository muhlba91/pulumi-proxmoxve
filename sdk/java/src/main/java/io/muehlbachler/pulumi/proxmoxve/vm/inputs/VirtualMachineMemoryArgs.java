// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineMemoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineMemoryArgs Empty = new VirtualMachineMemoryArgs();

    /**
     * The dedicated memory in megabytes (defaults
     * to `512`).
     * 
     */
    @Import(name="dedicated")
    private @Nullable Output<Integer> dedicated;

    /**
     * @return The dedicated memory in megabytes (defaults
     * to `512`).
     * 
     */
    public Optional<Output<Integer>> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }

    /**
     * The floating memory in megabytes (defaults
     * to `0`).
     * 
     */
    @Import(name="floating")
    private @Nullable Output<Integer> floating;

    /**
     * @return The floating memory in megabytes (defaults
     * to `0`).
     * 
     */
    public Optional<Output<Integer>> floating() {
        return Optional.ofNullable(this.floating);
    }

    /**
     * Enable/disable hugepages memory (defaults to disable).
     * 
     */
    @Import(name="hugepages")
    private @Nullable Output<String> hugepages;

    /**
     * @return Enable/disable hugepages memory (defaults to disable).
     * 
     */
    public Optional<Output<String>> hugepages() {
        return Optional.ofNullable(this.hugepages);
    }

    /**
     * Keep hugepages memory after the VM is stopped (defaults
     * to `false`).
     * 
     * Settings `hugepages` and `keep_hugepages` are only allowed for `root{@literal @}pam` authenticated user.
     * And required `cpu.numa` to be enabled.
     * 
     */
    @Import(name="keepHugepages")
    private @Nullable Output<Boolean> keepHugepages;

    /**
     * @return Keep hugepages memory after the VM is stopped (defaults
     * to `false`).
     * 
     * Settings `hugepages` and `keep_hugepages` are only allowed for `root{@literal @}pam` authenticated user.
     * And required `cpu.numa` to be enabled.
     * 
     */
    public Optional<Output<Boolean>> keepHugepages() {
        return Optional.ofNullable(this.keepHugepages);
    }

    /**
     * The shared memory in megabytes (defaults to `0`).
     * 
     */
    @Import(name="shared")
    private @Nullable Output<Integer> shared;

    /**
     * @return The shared memory in megabytes (defaults to `0`).
     * 
     */
    public Optional<Output<Integer>> shared() {
        return Optional.ofNullable(this.shared);
    }

    private VirtualMachineMemoryArgs() {}

    private VirtualMachineMemoryArgs(VirtualMachineMemoryArgs $) {
        this.dedicated = $.dedicated;
        this.floating = $.floating;
        this.hugepages = $.hugepages;
        this.keepHugepages = $.keepHugepages;
        this.shared = $.shared;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineMemoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineMemoryArgs $;

        public Builder() {
            $ = new VirtualMachineMemoryArgs();
        }

        public Builder(VirtualMachineMemoryArgs defaults) {
            $ = new VirtualMachineMemoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicated The dedicated memory in megabytes (defaults
         * to `512`).
         * 
         * @return builder
         * 
         */
        public Builder dedicated(@Nullable Output<Integer> dedicated) {
            $.dedicated = dedicated;
            return this;
        }

        /**
         * @param dedicated The dedicated memory in megabytes (defaults
         * to `512`).
         * 
         * @return builder
         * 
         */
        public Builder dedicated(Integer dedicated) {
            return dedicated(Output.of(dedicated));
        }

        /**
         * @param floating The floating memory in megabytes (defaults
         * to `0`).
         * 
         * @return builder
         * 
         */
        public Builder floating(@Nullable Output<Integer> floating) {
            $.floating = floating;
            return this;
        }

        /**
         * @param floating The floating memory in megabytes (defaults
         * to `0`).
         * 
         * @return builder
         * 
         */
        public Builder floating(Integer floating) {
            return floating(Output.of(floating));
        }

        /**
         * @param hugepages Enable/disable hugepages memory (defaults to disable).
         * 
         * @return builder
         * 
         */
        public Builder hugepages(@Nullable Output<String> hugepages) {
            $.hugepages = hugepages;
            return this;
        }

        /**
         * @param hugepages Enable/disable hugepages memory (defaults to disable).
         * 
         * @return builder
         * 
         */
        public Builder hugepages(String hugepages) {
            return hugepages(Output.of(hugepages));
        }

        /**
         * @param keepHugepages Keep hugepages memory after the VM is stopped (defaults
         * to `false`).
         * 
         * Settings `hugepages` and `keep_hugepages` are only allowed for `root{@literal @}pam` authenticated user.
         * And required `cpu.numa` to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder keepHugepages(@Nullable Output<Boolean> keepHugepages) {
            $.keepHugepages = keepHugepages;
            return this;
        }

        /**
         * @param keepHugepages Keep hugepages memory after the VM is stopped (defaults
         * to `false`).
         * 
         * Settings `hugepages` and `keep_hugepages` are only allowed for `root{@literal @}pam` authenticated user.
         * And required `cpu.numa` to be enabled.
         * 
         * @return builder
         * 
         */
        public Builder keepHugepages(Boolean keepHugepages) {
            return keepHugepages(Output.of(keepHugepages));
        }

        /**
         * @param shared The shared memory in megabytes (defaults to `0`).
         * 
         * @return builder
         * 
         */
        public Builder shared(@Nullable Output<Integer> shared) {
            $.shared = shared;
            return this;
        }

        /**
         * @param shared The shared memory in megabytes (defaults to `0`).
         * 
         * @return builder
         * 
         */
        public Builder shared(Integer shared) {
            return shared(Output.of(shared));
        }

        public VirtualMachineMemoryArgs build() {
            return $;
        }
    }

}
