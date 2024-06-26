// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Hardware_mapping.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PciMap {
    /**
     * @return The comment of the mapped PCI device.
     * 
     */
    private @Nullable String comment;
    /**
     * @return The ID of the map.
     * 
     */
    private String id;
    /**
     * @return The IOMMU group of the map. Not mandatory for the Proxmox VE API call, but causes a PCI hardware mapping to be incomplete when not set
     * 
     */
    private @Nullable Integer iommuGroup;
    /**
     * @return The node name of the map.
     * 
     */
    private String node;
    /**
     * @return The path of the map.
     * 
     */
    private String path;
    /**
     * @return The subsystem ID group of the map. Not mandatory for the Proxmox VE API call, but causes a PCI hardware mapping to be incomplete when not set
     * 
     */
    private @Nullable String subsystemId;

    private PciMap() {}
    /**
     * @return The comment of the mapped PCI device.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return The ID of the map.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IOMMU group of the map. Not mandatory for the Proxmox VE API call, but causes a PCI hardware mapping to be incomplete when not set
     * 
     */
    public Optional<Integer> iommuGroup() {
        return Optional.ofNullable(this.iommuGroup);
    }
    /**
     * @return The node name of the map.
     * 
     */
    public String node() {
        return this.node;
    }
    /**
     * @return The path of the map.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The subsystem ID group of the map. Not mandatory for the Proxmox VE API call, but causes a PCI hardware mapping to be incomplete when not set
     * 
     */
    public Optional<String> subsystemId() {
        return Optional.ofNullable(this.subsystemId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PciMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private String id;
        private @Nullable Integer iommuGroup;
        private String node;
        private String path;
        private @Nullable String subsystemId;
        public Builder() {}
        public Builder(PciMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.id = defaults.id;
    	      this.iommuGroup = defaults.iommuGroup;
    	      this.node = defaults.node;
    	      this.path = defaults.path;
    	      this.subsystemId = defaults.subsystemId;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("PciMap", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder iommuGroup(@Nullable Integer iommuGroup) {

            this.iommuGroup = iommuGroup;
            return this;
        }
        @CustomType.Setter
        public Builder node(String node) {
            if (node == null) {
              throw new MissingRequiredPropertyException("PciMap", "node");
            }
            this.node = node;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("PciMap", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder subsystemId(@Nullable String subsystemId) {

            this.subsystemId = subsystemId;
            return this;
        }
        public PciMap build() {
            final var _resultValue = new PciMap();
            _resultValue.comment = comment;
            _resultValue.id = id;
            _resultValue.iommuGroup = iommuGroup;
            _resultValue.node = node;
            _resultValue.path = path;
            _resultValue.subsystemId = subsystemId;
            return _resultValue;
        }
    }
}
