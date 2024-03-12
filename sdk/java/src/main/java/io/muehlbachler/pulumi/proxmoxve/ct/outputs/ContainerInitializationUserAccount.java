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
public final class ContainerInitializationUserAccount {
    /**
     * @return The SSH keys for the root account.
     * 
     */
    private @Nullable List<String> keys;
    /**
     * @return The password for the root account.
     * 
     */
    private @Nullable String password;

    private ContainerInitializationUserAccount() {}
    /**
     * @return The SSH keys for the root account.
     * 
     */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * @return The password for the root account.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInitializationUserAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> keys;
        private @Nullable String password;
        public Builder() {}
        public Builder(ContainerInitializationUserAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.password = defaults.password;
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
        public ContainerInitializationUserAccount build() {
            final var _resultValue = new ContainerInitializationUserAccount();
            _resultValue.keys = keys;
            _resultValue.password = password;
            return _resultValue;
        }
    }
}