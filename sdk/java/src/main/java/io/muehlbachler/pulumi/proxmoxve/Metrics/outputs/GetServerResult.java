// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Metrics.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerResult {
    /**
     * @return Indicates if the metric server is disabled.
     * 
     */
    private Boolean disable;
    /**
     * @return The unique identifier of this resource.
     * 
     */
    private String id;
    /**
     * @return Unique name that will be ID of this metric server in PVE.
     * 
     */
    private String name;
    /**
     * @return Server network port.
     * 
     */
    private Integer port;
    /**
     * @return Server dns name or IP address.
     * 
     */
    private String server;
    /**
     * @return Plugin type. Either `graphite` or `influxdb`.
     * 
     */
    private String type;

    private GetServerResult() {}
    /**
     * @return Indicates if the metric server is disabled.
     * 
     */
    public Boolean disable() {
        return this.disable;
    }
    /**
     * @return The unique identifier of this resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique name that will be ID of this metric server in PVE.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Server network port.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Server dns name or IP address.
     * 
     */
    public String server() {
        return this.server;
    }
    /**
     * @return Plugin type. Either `graphite` or `influxdb`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disable;
        private String id;
        private String name;
        private Integer port;
        private String server;
        private String type;
        public Builder() {}
        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disable = defaults.disable;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder disable(Boolean disable) {
            if (disable == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "disable");
            }
            this.disable = disable;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            if (server == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "server");
            }
            this.server = server;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetServerResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetServerResult build() {
            final var _resultValue = new GetServerResult();
            _resultValue.disable = disable;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.server = server;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
