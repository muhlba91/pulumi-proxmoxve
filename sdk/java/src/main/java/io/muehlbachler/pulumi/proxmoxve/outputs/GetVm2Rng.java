// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVm2Rng {
    /**
     * @return Maximum bytes of entropy allowed to get injected into the guest every period.
     * 
     */
    private Integer maxBytes;
    /**
     * @return Period in milliseconds to limit entropy injection to the guest.
     * 
     */
    private Integer period;
    /**
     * @return The entropy source for the RNG device.
     * 
     */
    private String source;

    private GetVm2Rng() {}
    /**
     * @return Maximum bytes of entropy allowed to get injected into the guest every period.
     * 
     */
    public Integer maxBytes() {
        return this.maxBytes;
    }
    /**
     * @return Period in milliseconds to limit entropy injection to the guest.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The entropy source for the RNG device.
     * 
     */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVm2Rng defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxBytes;
        private Integer period;
        private String source;
        public Builder() {}
        public Builder(GetVm2Rng defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBytes = defaults.maxBytes;
    	      this.period = defaults.period;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder maxBytes(Integer maxBytes) {
            if (maxBytes == null) {
              throw new MissingRequiredPropertyException("GetVm2Rng", "maxBytes");
            }
            this.maxBytes = maxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder period(Integer period) {
            if (period == null) {
              throw new MissingRequiredPropertyException("GetVm2Rng", "period");
            }
            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            if (source == null) {
              throw new MissingRequiredPropertyException("GetVm2Rng", "source");
            }
            this.source = source;
            return this;
        }
        public GetVm2Rng build() {
            final var _resultValue = new GetVm2Rng();
            _resultValue.maxBytes = maxBytes;
            _resultValue.period = period;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}
