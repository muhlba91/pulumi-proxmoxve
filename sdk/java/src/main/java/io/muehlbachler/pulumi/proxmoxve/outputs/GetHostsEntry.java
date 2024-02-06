// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHostsEntry {
    /**
     * @return The address
     * 
     */
    private String address;
    /**
     * @return The hostnames associated with each of the IP addresses.
     * 
     */
    private List<String> hostnames;

    private GetHostsEntry() {}
    /**
     * @return The address
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The hostnames associated with each of the IP addresses.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private List<String> hostnames;
        public Builder() {}
        public Builder(GetHostsEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.hostnames = defaults.hostnames;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetHostsEntry", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder hostnames(List<String> hostnames) {
            if (hostnames == null) {
              throw new MissingRequiredPropertyException("GetHostsEntry", "hostnames");
            }
            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        public GetHostsEntry build() {
            final var _resultValue = new GetHostsEntry();
            _resultValue.address = address;
            _resultValue.hostnames = hostnames;
            return _resultValue;
        }
    }
}
