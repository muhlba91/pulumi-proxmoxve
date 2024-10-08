// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Acme.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPluginPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPluginPlainArgs Empty = new GetPluginPlainArgs();

    /**
     * ACME Plugin ID name.
     * 
     */
    @Import(name="plugin", required=true)
    private String plugin;

    /**
     * @return ACME Plugin ID name.
     * 
     */
    public String plugin() {
        return this.plugin;
    }

    private GetPluginPlainArgs() {}

    private GetPluginPlainArgs(GetPluginPlainArgs $) {
        this.plugin = $.plugin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPluginPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPluginPlainArgs $;

        public Builder() {
            $ = new GetPluginPlainArgs();
        }

        public Builder(GetPluginPlainArgs defaults) {
            $ = new GetPluginPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param plugin ACME Plugin ID name.
         * 
         * @return builder
         * 
         */
        public Builder plugin(String plugin) {
            $.plugin = plugin;
            return this;
        }

        public GetPluginPlainArgs build() {
            if ($.plugin == null) {
                throw new MissingRequiredPropertyException("GetPluginPlainArgs", "plugin");
            }
            return $;
        }
    }

}
