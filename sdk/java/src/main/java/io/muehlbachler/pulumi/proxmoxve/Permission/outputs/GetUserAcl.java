// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserAcl {
    private String path;
    private Boolean propagate;
    private String roleId;

    private GetUserAcl() {}
    public String path() {
        return this.path;
    }
    public Boolean propagate() {
        return this.propagate;
    }
    public String roleId() {
        return this.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private Boolean propagate;
        private String roleId;
        public Builder() {}
        public Builder(GetUserAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.propagate = defaults.propagate;
    	      this.roleId = defaults.roleId;
        }

        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder propagate(Boolean propagate) {
            this.propagate = Objects.requireNonNull(propagate);
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public GetUserAcl build() {
            final var o = new GetUserAcl();
            o.path = path;
            o.propagate = propagate;
            o.roleId = roleId;
            return o;
        }
    }
}
