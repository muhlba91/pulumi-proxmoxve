// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.HA.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHAResourcesResult {
    /**
     * @return The unique identifier of this resource.
     * 
     */
    private String id;
    /**
     * @return The identifiers of the High Availability resources.
     * 
     */
    private List<String> resourceIds;
    /**
     * @return The type of High Availability resources to fetch (`vm` or `ct`). All resources will be fetched if this option is unset.
     * 
     */
    private @Nullable String type;

    private GetHAResourcesResult() {}
    /**
     * @return The unique identifier of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identifiers of the High Availability resources.
     * 
     */
    public List<String> resourceIds() {
        return this.resourceIds;
    }
    /**
     * @return The type of High Availability resources to fetch (`vm` or `ct`). All resources will be fetched if this option is unset.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHAResourcesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> resourceIds;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetHAResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceIds = defaults.resourceIds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHAResourcesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceIds(List<String> resourceIds) {
            if (resourceIds == null) {
              throw new MissingRequiredPropertyException("GetHAResourcesResult", "resourceIds");
            }
            this.resourceIds = resourceIds;
            return this;
        }
        public Builder resourceIds(String... resourceIds) {
            return resourceIds(List.of(resourceIds));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetHAResourcesResult build() {
            final var _resultValue = new GetHAResourcesResult();
            _resultValue.id = id;
            _resultValue.resourceIds = resourceIds;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}