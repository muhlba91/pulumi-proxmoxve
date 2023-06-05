// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineInitializationUserAccount {
    private @Nullable List<String> keys;
    private @Nullable String password;
    private @Nullable String username;

    private VirtualMachineInitializationUserAccount() {}
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineInitializationUserAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> keys;
        private @Nullable String password;
        private @Nullable String username;
        public Builder() {}
        public Builder(VirtualMachineInitializationUserAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public VirtualMachineInitializationUserAccount build() {
            final var o = new VirtualMachineInitializationUserAccount();
            o.keys = keys;
            o.password = password;
            o.username = username;
            return o;
        }
    }
}
