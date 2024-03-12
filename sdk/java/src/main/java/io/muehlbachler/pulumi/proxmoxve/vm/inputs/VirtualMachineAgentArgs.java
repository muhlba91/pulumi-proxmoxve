// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineAgentArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineAgentArgs Empty = new VirtualMachineAgentArgs();

    /**
     * Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The maximum amount of time to wait for data from
     * the QEMU agent to become available ( defaults to `15m`).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for data from
     * the QEMU agent to become available ( defaults to `15m`).
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Whether to enable the FSTRIM feature in the QEMU agent
     * (defaults to `false`).
     * 
     */
    @Import(name="trim")
    private @Nullable Output<Boolean> trim;

    /**
     * @return Whether to enable the FSTRIM feature in the QEMU agent
     * (defaults to `false`).
     * 
     */
    public Optional<Output<Boolean>> trim() {
        return Optional.ofNullable(this.trim);
    }

    /**
     * The VGA type (defaults to `std`).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private VirtualMachineAgentArgs() {}

    private VirtualMachineAgentArgs(VirtualMachineAgentArgs $) {
        this.enabled = $.enabled;
        this.timeout = $.timeout;
        this.trim = $.trim;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineAgentArgs $;

        public Builder() {
            $ = new VirtualMachineAgentArgs();
        }

        public Builder(VirtualMachineAgentArgs defaults) {
            $ = new VirtualMachineAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable the VGA device (defaults
         * to `true`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the VGA device (defaults
         * to `true`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param timeout The maximum amount of time to wait for data from
         * the QEMU agent to become available ( defaults to `15m`).
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The maximum amount of time to wait for data from
         * the QEMU agent to become available ( defaults to `15m`).
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param trim Whether to enable the FSTRIM feature in the QEMU agent
         * (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder trim(@Nullable Output<Boolean> trim) {
            $.trim = trim;
            return this;
        }

        /**
         * @param trim Whether to enable the FSTRIM feature in the QEMU agent
         * (defaults to `false`).
         * 
         * @return builder
         * 
         */
        public Builder trim(Boolean trim) {
            return trim(Output.of(trim));
        }

        /**
         * @param type The VGA type (defaults to `std`).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The VGA type (defaults to `std`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VirtualMachineAgentArgs build() {
            return $;
        }
    }

}