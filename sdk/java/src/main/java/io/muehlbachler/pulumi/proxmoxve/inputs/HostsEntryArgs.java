// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HostsEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostsEntryArgs Empty = new HostsEntryArgs();

    /**
     * The IP address.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The IP address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The hostnames.
     * 
     */
    @Import(name="hostnames", required=true)
    private Output<List<String>> hostnames;

    /**
     * @return The hostnames.
     * 
     */
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

        /**
         * @param address The IP address.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param hostnames The hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames The hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames The hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        public HostsEntryArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("HostsEntryArgs", "address");
            }
            if ($.hostnames == null) {
                throw new MissingRequiredPropertyException("HostsEntryArgs", "hostnames");
            }
            return $;
        }
    }

}
