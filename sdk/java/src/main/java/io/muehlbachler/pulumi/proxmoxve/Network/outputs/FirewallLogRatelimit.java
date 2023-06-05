// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallLogRatelimit {
    private @Nullable Integer burst;
    private @Nullable Boolean enabled;
    private @Nullable String rate;

    private FirewallLogRatelimit() {}
    public Optional<Integer> burst() {
        return Optional.ofNullable(this.burst);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> rate() {
        return Optional.ofNullable(this.rate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogRatelimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer burst;
        private @Nullable Boolean enabled;
        private @Nullable String rate;
        public Builder() {}
        public Builder(FirewallLogRatelimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burst = defaults.burst;
    	      this.enabled = defaults.enabled;
    	      this.rate = defaults.rate;
        }

        @CustomType.Setter
        public Builder burst(@Nullable Integer burst) {
            this.burst = burst;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder rate(@Nullable String rate) {
            this.rate = rate;
            return this;
        }
        public FirewallLogRatelimit build() {
            final var o = new FirewallLogRatelimit();
            o.burst = burst;
            o.enabled = enabled;
            o.rate = rate;
            return o;
        }
    }
}
