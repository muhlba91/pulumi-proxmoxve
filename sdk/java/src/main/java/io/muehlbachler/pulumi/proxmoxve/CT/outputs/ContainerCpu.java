// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerCpu {
    /**
     * @return The CPU architecture (defaults to `amd64`).
     * 
     */
    private @Nullable String architecture;
    /**
     * @return The number of CPU cores (defaults to `1`).
     * 
     */
    private @Nullable Integer cores;
    /**
     * @return The CPU units (defaults to `1024`).
     * 
     */
    private @Nullable Integer units;

    private ContainerCpu() {}
    /**
     * @return The CPU architecture (defaults to `amd64`).
     * 
     */
    public Optional<String> architecture() {
        return Optional.ofNullable(this.architecture);
    }
    /**
     * @return The number of CPU cores (defaults to `1`).
     * 
     */
    public Optional<Integer> cores() {
        return Optional.ofNullable(this.cores);
    }
    /**
     * @return The CPU units (defaults to `1024`).
     * 
     */
    public Optional<Integer> units() {
        return Optional.ofNullable(this.units);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCpu defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String architecture;
        private @Nullable Integer cores;
        private @Nullable Integer units;
        public Builder() {}
        public Builder(ContainerCpu defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cores = defaults.cores;
    	      this.units = defaults.units;
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
        public Builder units(@Nullable Integer units) {
            this.units = units;
            return this;
        }
        public ContainerCpu build() {
            final var o = new ContainerCpu();
            o.architecture = architecture;
            o.cores = cores;
            o.units = units;
            return o;
        }
    }
}
