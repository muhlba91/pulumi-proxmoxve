// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.outputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.outputs.GetHostsEntry;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHostsResult {
    private List<String> addresses;
    private String digest;
    private List<GetHostsEntry> entries;
    private List<List<String>> hostnames;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String nodeName;

    private GetHostsResult() {}
    public List<String> addresses() {
        return this.addresses;
    }
    public String digest() {
        return this.digest;
    }
    public List<GetHostsEntry> entries() {
        return this.entries;
    }
    public List<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String nodeName() {
        return this.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private String digest;
        private List<GetHostsEntry> entries;
        private List<List<String>> hostnames;
        private String id;
        private String nodeName;
        public Builder() {}
        public Builder(GetHostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.digest = defaults.digest;
    	      this.entries = defaults.entries;
    	      this.hostnames = defaults.hostnames;
    	      this.id = defaults.id;
    	      this.nodeName = defaults.nodeName;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        @CustomType.Setter
        public Builder entries(List<GetHostsEntry> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(GetHostsEntry... entries) {
            return entries(List.of(entries));
        }
        @CustomType.Setter
        public Builder hostnames(List<List<String>> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        public GetHostsResult build() {
            final var o = new GetHostsResult();
            o.addresses = addresses;
            o.digest = digest;
            o.entries = entries;
            o.hostnames = hostnames;
            o.id = id;
            o.nodeName = nodeName;
            return o;
        }
    }
}