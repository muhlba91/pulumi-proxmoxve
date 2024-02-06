// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineDiskSpeed {
    /**
     * @return The maximum read speed in megabytes per second.
     * 
     */
    private @Nullable Integer read;
    /**
     * @return The maximum burstable read speed in
     * megabytes per second.
     * 
     */
    private @Nullable Integer readBurstable;
    /**
     * @return The maximum write speed in megabytes per second.
     * 
     */
    private @Nullable Integer write;
    /**
     * @return The maximum burstable write speed in
     * megabytes per second.
     * 
     */
    private @Nullable Integer writeBurstable;

    private VirtualMachineDiskSpeed() {}
    /**
     * @return The maximum read speed in megabytes per second.
     * 
     */
    public Optional<Integer> read() {
        return Optional.ofNullable(this.read);
    }
    /**
     * @return The maximum burstable read speed in
     * megabytes per second.
     * 
     */
    public Optional<Integer> readBurstable() {
        return Optional.ofNullable(this.readBurstable);
    }
    /**
     * @return The maximum write speed in megabytes per second.
     * 
     */
    public Optional<Integer> write() {
        return Optional.ofNullable(this.write);
    }
    /**
     * @return The maximum burstable write speed in
     * megabytes per second.
     * 
     */
    public Optional<Integer> writeBurstable() {
        return Optional.ofNullable(this.writeBurstable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineDiskSpeed defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer read;
        private @Nullable Integer readBurstable;
        private @Nullable Integer write;
        private @Nullable Integer writeBurstable;
        public Builder() {}
        public Builder(VirtualMachineDiskSpeed defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.read = defaults.read;
    	      this.readBurstable = defaults.readBurstable;
    	      this.write = defaults.write;
    	      this.writeBurstable = defaults.writeBurstable;
        }

        @CustomType.Setter
        public Builder read(@Nullable Integer read) {

            this.read = read;
            return this;
        }
        @CustomType.Setter
        public Builder readBurstable(@Nullable Integer readBurstable) {

            this.readBurstable = readBurstable;
            return this;
        }
        @CustomType.Setter
        public Builder write(@Nullable Integer write) {

            this.write = write;
            return this;
        }
        @CustomType.Setter
        public Builder writeBurstable(@Nullable Integer writeBurstable) {

            this.writeBurstable = writeBurstable;
            return this;
        }
        public VirtualMachineDiskSpeed build() {
            final var _resultValue = new VirtualMachineDiskSpeed();
            _resultValue.read = read;
            _resultValue.readBurstable = readBurstable;
            _resultValue.write = write;
            _resultValue.writeBurstable = writeBurstable;
            return _resultValue;
        }
    }
}
