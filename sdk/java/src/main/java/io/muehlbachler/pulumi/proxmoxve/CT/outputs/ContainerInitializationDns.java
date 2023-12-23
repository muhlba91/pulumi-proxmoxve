// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerInitializationDns {
    /**
     * @return The DNS search domain.
     * 
     */
    private @Nullable String domain;
    /**
     * @return The DNS server. The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead.
     * 
     * @deprecated
     * The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead.
     * 
     */
    @Deprecated /* The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead. */
    private @Nullable String server;
    /**
     * @return The list of DNS servers.
     * 
     */
    private @Nullable List<String> servers;

    private ContainerInitializationDns() {}
    /**
     * @return The DNS search domain.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The DNS server. The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead.
     * 
     * @deprecated
     * The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead.
     * 
     */
    @Deprecated /* The `server` attribute is deprecated and will be removed in a future release. Please use the `servers` attribute instead. */
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }
    /**
     * @return The list of DNS servers.
     * 
     */
    public List<String> servers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInitializationDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String server;
        private @Nullable List<String> servers;
        public Builder() {}
        public Builder(ContainerInitializationDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.server = defaults.server;
    	      this.servers = defaults.servers;
        }

        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<String> servers) {
            this.servers = servers;
            return this;
        }
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }
        public ContainerInitializationDns build() {
            final var _resultValue = new ContainerInitializationDns();
            _resultValue.domain = domain;
            _resultValue.server = server;
            _resultValue.servers = servers;
            return _resultValue;
        }
    }
}
