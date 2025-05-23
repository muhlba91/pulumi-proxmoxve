// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Metrics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerPlainArgs Empty = new GetServerPlainArgs();

    /**
     * Unique name that will be ID of this metric server in PVE.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Unique name that will be ID of this metric server in PVE.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetServerPlainArgs() {}

    private GetServerPlainArgs(GetServerPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerPlainArgs $;

        public Builder() {
            $ = new GetServerPlainArgs();
        }

        public Builder(GetServerPlainArgs defaults) {
            $ = new GetServerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique name that will be ID of this metric server in PVE.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetServerPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetServerPlainArgs", "name");
            }
            return $;
        }
    }

}
