// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> poolIds;

    private GetPoolsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> poolIds() {
        return this.poolIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> poolIds;
        public Builder() {}
        public Builder(GetPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.poolIds = defaults.poolIds;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder poolIds(List<String> poolIds) {
            this.poolIds = Objects.requireNonNull(poolIds);
            return this;
        }
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }
        public GetPoolsResult build() {
            final var o = new GetPoolsResult();
            o.id = id;
            o.poolIds = poolIds;
            return o;
        }
    }
}
