// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineVga {
    /**
     * @return Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The VGA memory in megabytes (defaults to `16`).
     * 
     */
    private @Nullable Integer memory;
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    private @Nullable String type;

    private VirtualMachineVga() {}
    /**
     * @return Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The VGA memory in megabytes (defaults to `16`).
     * 
     */
    public Optional<Integer> memory() {
        return Optional.ofNullable(this.memory);
    }
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineVga defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer memory;
        private @Nullable String type;
        public Builder() {}
        public Builder(VirtualMachineVga defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.memory = defaults.memory;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder memory(@Nullable Integer memory) {

            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public VirtualMachineVga build() {
            final var _resultValue = new VirtualMachineVga();
            _resultValue.enabled = enabled;
            _resultValue.memory = memory;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}