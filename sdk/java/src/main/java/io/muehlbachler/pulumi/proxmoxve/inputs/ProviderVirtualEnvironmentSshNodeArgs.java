// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProviderVirtualEnvironmentSshNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderVirtualEnvironmentSshNodeArgs Empty = new ProviderVirtualEnvironmentSshNodeArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private ProviderVirtualEnvironmentSshNodeArgs() {}

    private ProviderVirtualEnvironmentSshNodeArgs(ProviderVirtualEnvironmentSshNodeArgs $) {
        this.address = $.address;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderVirtualEnvironmentSshNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderVirtualEnvironmentSshNodeArgs $;

        public Builder() {
            $ = new ProviderVirtualEnvironmentSshNodeArgs();
        }

        public Builder(ProviderVirtualEnvironmentSshNodeArgs defaults) {
            $ = new ProviderVirtualEnvironmentSshNodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ProviderVirtualEnvironmentSshNodeArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
