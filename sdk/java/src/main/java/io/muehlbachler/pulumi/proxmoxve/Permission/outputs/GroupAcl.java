// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupAcl {
    private String path;
    private @Nullable Boolean propagate;
    private String roleId;

    private GroupAcl() {}
    public String path() {
        return this.path;
    }
    public Optional<Boolean> propagate() {
        return Optional.ofNullable(this.propagate);
    }
    public String roleId() {
        return this.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupAcl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String path;
        private @Nullable Boolean propagate;
        private String roleId;
        public Builder() {}
        public Builder(GroupAcl defaults) {
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
        public Builder propagate(@Nullable Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public GroupAcl build() {
            final var o = new GroupAcl();
            o.path = path;
            o.propagate = propagate;
            o.roleId = roleId;
            return o;
        }
    }
}
