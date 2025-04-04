// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContainerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerArgs Empty = new GetContainerArgs();

    /**
     * The node name.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The node name.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    /**
     * Status of the container
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the container
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Is container a template (true) or a regular container (false)
     * 
     */
    @Import(name="template")
    private @Nullable Output<Boolean> template;

    /**
     * @return Is container a template (true) or a regular container (false)
     * 
     */
    public Optional<Output<Boolean>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The container identifier.
     * 
     */
    @Import(name="vmId", required=true)
    private Output<Integer> vmId;

    /**
     * @return The container identifier.
     * 
     */
    public Output<Integer> vmId() {
        return this.vmId;
    }

    private GetContainerArgs() {}

    private GetContainerArgs(GetContainerArgs $) {
        this.nodeName = $.nodeName;
        this.status = $.status;
        this.template = $.template;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerArgs $;

        public Builder() {
            $ = new GetContainerArgs();
        }

        public Builder(GetContainerArgs defaults) {
            $ = new GetContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeName The node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param status Status of the container
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the container
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param template Is container a template (true) or a regular container (false)
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<Boolean> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template Is container a template (true) or a regular container (false)
         * 
         * @return builder
         * 
         */
        public Builder template(Boolean template) {
            return template(Output.of(template));
        }

        /**
         * @param vmId The container identifier.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The container identifier.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public GetContainerArgs build() {
            if ($.nodeName == null) {
                throw new MissingRequiredPropertyException("GetContainerArgs", "nodeName");
            }
            if ($.vmId == null) {
                throw new MissingRequiredPropertyException("GetContainerArgs", "vmId");
            }
            return $;
        }
    }

}
