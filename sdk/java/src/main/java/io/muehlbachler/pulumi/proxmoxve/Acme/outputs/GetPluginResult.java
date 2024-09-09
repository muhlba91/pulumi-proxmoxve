// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Acme.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPluginResult {
    /**
     * @return API plugin name.
     * 
     */
    private String api;
    /**
     * @return DNS plugin data.
     * 
     */
    private Map<String,String> data;
    /**
     * @return Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
     * 
     */
    private String digest;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return ACME Plugin ID name.
     * 
     */
    private String plugin;
    /**
     * @return ACME challenge type (dns, standalone).
     * 
     */
    private String type;
    /**
     * @return Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
     * 
     */
    private Integer validationDelay;

    private GetPluginResult() {}
    /**
     * @return API plugin name.
     * 
     */
    public String api() {
        return this.api;
    }
    /**
     * @return DNS plugin data.
     * 
     */
    public Map<String,String> data() {
        return this.data;
    }
    /**
     * @return Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return ACME Plugin ID name.
     * 
     */
    public String plugin() {
        return this.plugin;
    }
    /**
     * @return ACME challenge type (dns, standalone).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
     * 
     */
    public Integer validationDelay() {
        return this.validationDelay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPluginResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String api;
        private Map<String,String> data;
        private String digest;
        private String id;
        private String plugin;
        private String type;
        private Integer validationDelay;
        public Builder() {}
        public Builder(GetPluginResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.data = defaults.data;
    	      this.digest = defaults.digest;
    	      this.id = defaults.id;
    	      this.plugin = defaults.plugin;
    	      this.type = defaults.type;
    	      this.validationDelay = defaults.validationDelay;
        }

        @CustomType.Setter
        public Builder api(String api) {
            if (api == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "api");
            }
            this.api = api;
            return this;
        }
        @CustomType.Setter
        public Builder data(Map<String,String> data) {
            if (data == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "data");
            }
            this.data = data;
            return this;
        }
        @CustomType.Setter
        public Builder digest(String digest) {
            if (digest == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "digest");
            }
            this.digest = digest;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder plugin(String plugin) {
            if (plugin == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "plugin");
            }
            this.plugin = plugin;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder validationDelay(Integer validationDelay) {
            if (validationDelay == null) {
              throw new MissingRequiredPropertyException("GetPluginResult", "validationDelay");
            }
            this.validationDelay = validationDelay;
            return this;
        }
        public GetPluginResult build() {
            final var _resultValue = new GetPluginResult();
            _resultValue.api = api;
            _resultValue.data = data;
            _resultValue.digest = digest;
            _resultValue.id = id;
            _resultValue.plugin = plugin;
            _resultValue.type = type;
            _resultValue.validationDelay = validationDelay;
            return _resultValue;
        }
    }
}
