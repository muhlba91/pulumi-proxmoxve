// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerOperatingSystem {
    /**
     * @return The identifier for an OS template file.
     * The ID format is `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/jammy-server-cloudimg-amd64.tar.gz`.
     * Can be also taken from `proxmoxve.Download.File` resource, or from the output of `pvesm list &lt;storage&gt;`.
     * 
     */
    private String templateFileId;
    /**
     * @return The type (defaults to `unmanaged`).
     * 
     */
    private @Nullable String type;

    private ContainerOperatingSystem() {}
    /**
     * @return The identifier for an OS template file.
     * The ID format is `&lt;datastore_id&gt;:&lt;content_type&gt;/&lt;file_name&gt;`, for example `local:iso/jammy-server-cloudimg-amd64.tar.gz`.
     * Can be also taken from `proxmoxve.Download.File` resource, or from the output of `pvesm list &lt;storage&gt;`.
     * 
     */
    public String templateFileId() {
        return this.templateFileId;
    }
    /**
     * @return The type (defaults to `unmanaged`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerOperatingSystem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String templateFileId;
        private @Nullable String type;
        public Builder() {}
        public Builder(ContainerOperatingSystem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templateFileId = defaults.templateFileId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder templateFileId(String templateFileId) {
            if (templateFileId == null) {
              throw new MissingRequiredPropertyException("ContainerOperatingSystem", "templateFileId");
            }
            this.templateFileId = templateFileId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ContainerOperatingSystem build() {
            final var _resultValue = new ContainerOperatingSystem();
            _resultValue.templateFileId = templateFileId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
