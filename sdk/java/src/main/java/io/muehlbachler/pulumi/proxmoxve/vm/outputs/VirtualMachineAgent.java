// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineAgent {
    /**
     * @return Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The maximum amount of time to wait for data from
     * the QEMU agent to become available ( defaults to `15m`).
     * 
     */
    private @Nullable String timeout;
    /**
     * @return Whether to enable the FSTRIM feature in the QEMU agent
     * (defaults to `false`).
     * 
     */
    private @Nullable Boolean trim;
    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    private @Nullable String type;

    private VirtualMachineAgent() {}
    /**
     * @return Whether to enable the VGA device (defaults
     * to `true`).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The maximum amount of time to wait for data from
     * the QEMU agent to become available ( defaults to `15m`).
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Whether to enable the FSTRIM feature in the QEMU agent
     * (defaults to `false`).
     * 
     */
    public Optional<Boolean> trim() {
        return Optional.ofNullable(this.trim);
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

    public static Builder builder(VirtualMachineAgent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String timeout;
        private @Nullable Boolean trim;
        private @Nullable String type;
        public Builder() {}
        public Builder(VirtualMachineAgent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.timeout = defaults.timeout;
    	      this.trim = defaults.trim;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder trim(@Nullable Boolean trim) {

            this.trim = trim;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public VirtualMachineAgent build() {
            final var _resultValue = new VirtualMachineAgent();
            _resultValue.enabled = enabled;
            _resultValue.timeout = timeout;
            _resultValue.trim = trim;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}