// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineSerialDevice {
    private @Nullable String device;

    private VirtualMachineSerialDevice() {}
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineSerialDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String device;
        public Builder() {}
        public Builder(VirtualMachineSerialDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
        }

        @CustomType.Setter
        public Builder device(@Nullable String device) {
            this.device = device;
            return this;
        }
        public VirtualMachineSerialDevice build() {
            final var o = new VirtualMachineSerialDevice();
            o.device = device;
            return o;
        }
    }
}
