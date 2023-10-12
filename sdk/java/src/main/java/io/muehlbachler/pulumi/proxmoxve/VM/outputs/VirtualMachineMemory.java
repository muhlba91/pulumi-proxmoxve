// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineMemory {
    /**
     * @return The dedicated memory in megabytes (defaults
     * to `512`).
     * 
     */
    private @Nullable Integer dedicated;
    /**
     * @return The floating memory in megabytes (defaults
     * to `0`).
     * 
     */
    private @Nullable Integer floating;
    /**
     * @return The shared memory in megabytes (defaults to `0`).
     * 
     */
    private @Nullable Integer shared;

    private VirtualMachineMemory() {}
    /**
     * @return The dedicated memory in megabytes (defaults
     * to `512`).
     * 
     */
    public Optional<Integer> dedicated() {
        return Optional.ofNullable(this.dedicated);
    }
    /**
     * @return The floating memory in megabytes (defaults
     * to `0`).
     * 
     */
    public Optional<Integer> floating() {
        return Optional.ofNullable(this.floating);
    }
    /**
     * @return The shared memory in megabytes (defaults to `0`).
     * 
     */
    public Optional<Integer> shared() {
        return Optional.ofNullable(this.shared);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineMemory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dedicated;
        private @Nullable Integer floating;
        private @Nullable Integer shared;
        public Builder() {}
        public Builder(VirtualMachineMemory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicated = defaults.dedicated;
    	      this.floating = defaults.floating;
    	      this.shared = defaults.shared;
        }

        @CustomType.Setter
        public Builder dedicated(@Nullable Integer dedicated) {
            this.dedicated = dedicated;
            return this;
        }
        @CustomType.Setter
        public Builder floating(@Nullable Integer floating) {
            this.floating = floating;
            return this;
        }
        @CustomType.Setter
        public Builder shared(@Nullable Integer shared) {
            this.shared = shared;
            return this;
        }
        public VirtualMachineMemory build() {
            final var o = new VirtualMachineMemory();
            o.dedicated = dedicated;
            o.floating = floating;
            o.shared = shared;
            return o;
        }
    }
}
