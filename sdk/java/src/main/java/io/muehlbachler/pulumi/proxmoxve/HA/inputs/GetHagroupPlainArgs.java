// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.HA.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetHAGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHAGroupPlainArgs Empty = new GetHAGroupPlainArgs();

    /**
     * The identifier of the High Availability group to read.
     * 
     */
    @Import(name="group", required=true)
    private String group;

    /**
     * @return The identifier of the High Availability group to read.
     * 
     */
    public String group() {
        return this.group;
    }

    private GetHAGroupPlainArgs() {}

    private GetHAGroupPlainArgs(GetHAGroupPlainArgs $) {
        this.group = $.group;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHAGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHAGroupPlainArgs $;

        public Builder() {
            $ = new GetHAGroupPlainArgs();
        }

        public Builder(GetHAGroupPlainArgs defaults) {
            $ = new GetHAGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The identifier of the High Availability group to read.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            $.group = group;
            return this;
        }

        public GetHAGroupPlainArgs build() {
            if ($.group == null) {
                throw new MissingRequiredPropertyException("GetHAGroupPlainArgs", "group");
            }
            return $;
        }
    }

}
