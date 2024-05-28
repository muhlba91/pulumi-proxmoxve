// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetVm2VgaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetVm2VgaArgs Empty = new GetVm2VgaArgs();

    /**
     * Enable a specific clipboard.
     * 
     */
    @Import(name="clipboard", required=true)
    private Output<String> clipboard;

    /**
     * @return Enable a specific clipboard.
     * 
     */
    public Output<String> clipboard() {
        return this.clipboard;
    }

    /**
     * The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
     * 
     */
    @Import(name="memory", required=true)
    private Output<Integer> memory;

    /**
     * @return The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
     * 
     */
    public Output<Integer> memory() {
        return this.memory;
    }

    /**
     * The VGA type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The VGA type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GetVm2VgaArgs() {}

    private GetVm2VgaArgs(GetVm2VgaArgs $) {
        this.clipboard = $.clipboard;
        this.memory = $.memory;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVm2VgaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVm2VgaArgs $;

        public Builder() {
            $ = new GetVm2VgaArgs();
        }

        public Builder(GetVm2VgaArgs defaults) {
            $ = new GetVm2VgaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clipboard Enable a specific clipboard.
         * 
         * @return builder
         * 
         */
        public Builder clipboard(Output<String> clipboard) {
            $.clipboard = clipboard;
            return this;
        }

        /**
         * @param clipboard Enable a specific clipboard.
         * 
         * @return builder
         * 
         */
        public Builder clipboard(String clipboard) {
            return clipboard(Output.of(clipboard));
        }

        /**
         * @param memory The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
         * 
         * @return builder
         * 
         */
        public Builder memory(Output<Integer> memory) {
            $.memory = memory;
            return this;
        }

        /**
         * @param memory The VGA memory in megabytes (4-512 MB). Has no effect with serial display.
         * 
         * @return builder
         * 
         */
        public Builder memory(Integer memory) {
            return memory(Output.of(memory));
        }

        /**
         * @param type The VGA type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The VGA type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetVm2VgaArgs build() {
            if ($.clipboard == null) {
                throw new MissingRequiredPropertyException("GetVm2VgaArgs", "clipboard");
            }
            if ($.memory == null) {
                throw new MissingRequiredPropertyException("GetVm2VgaArgs", "memory");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetVm2VgaArgs", "type");
            }
            return $;
        }
    }

}
