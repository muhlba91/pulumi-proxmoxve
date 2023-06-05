// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HostsEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostsEntryArgs Empty = new HostsEntryArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="hostnames", required=true)
    private Output<List<String>> hostnames;

    public Output<List<String>> hostnames() {
        return this.hostnames;
    }

    private HostsEntryArgs() {}

    private HostsEntryArgs(HostsEntryArgs $) {
        this.address = $.address;
        this.hostnames = $.hostnames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostsEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostsEntryArgs $;

        public Builder() {
            $ = new HostsEntryArgs();
        }

        public Builder(HostsEntryArgs defaults) {
            $ = new HostsEntryArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder hostnames(Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        public HostsEntryArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.hostnames = Objects.requireNonNull($.hostnames, "expected parameter 'hostnames' to be non-null");
            return $;
        }
    }

}
