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
public final class ContainerClone {
    private @Nullable String datastoreId;
    private @Nullable String nodeName;
    private Integer vmId;

    private ContainerClone() {}
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    public Integer vmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerClone defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String nodeName;
        private Integer vmId;
        public Builder() {}
        public Builder(ContainerClone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.nodeName = defaults.nodeName;
    	      this.vmId = defaults.vmId;
        }

        @CustomType.Setter
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder vmId(Integer vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public ContainerClone build() {
            final var o = new ContainerClone();
            o.datastoreId = datastoreId;
            o.nodeName = nodeName;
            o.vmId = vmId;
            return o;
        }
    }
}