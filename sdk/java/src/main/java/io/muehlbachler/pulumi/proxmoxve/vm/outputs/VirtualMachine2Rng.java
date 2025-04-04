// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachine2Rng {
    /**
     * @return Maximum bytes of entropy allowed to get injected into the guest every period. Use 0 to disable limiting (potentially dangerous).
     * 
     */
    private @Nullable Integer maxBytes;
    /**
     * @return Period in milliseconds to limit entropy injection to the guest. Use 0 to disable limiting (potentially dangerous).
     * 
     */
    private @Nullable Integer period;
    /**
     * @return The file on the host to gather entropy from. In most cases, `/dev/urandom` should be preferred over `/dev/random` to avoid entropy-starvation issues on the host.
     * 
     */
    private @Nullable String source;

    private VirtualMachine2Rng() {}
    /**
     * @return Maximum bytes of entropy allowed to get injected into the guest every period. Use 0 to disable limiting (potentially dangerous).
     * 
     */
    public Optional<Integer> maxBytes() {
        return Optional.ofNullable(this.maxBytes);
    }
    /**
     * @return Period in milliseconds to limit entropy injection to the guest. Use 0 to disable limiting (potentially dangerous).
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return The file on the host to gather entropy from. In most cases, `/dev/urandom` should be preferred over `/dev/random` to avoid entropy-starvation issues on the host.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachine2Rng defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxBytes;
        private @Nullable Integer period;
        private @Nullable String source;
        public Builder() {}
        public Builder(VirtualMachine2Rng defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBytes = defaults.maxBytes;
    	      this.period = defaults.period;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder maxBytes(@Nullable Integer maxBytes) {

            this.maxBytes = maxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {

            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        public VirtualMachine2Rng build() {
            final var _resultValue = new VirtualMachine2Rng();
            _resultValue.maxBytes = maxBytes;
            _resultValue.period = period;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
