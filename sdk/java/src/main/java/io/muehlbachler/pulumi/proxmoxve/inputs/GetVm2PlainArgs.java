// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetVm2Clone;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetVm2Cpu;
import io.muehlbachler.pulumi.proxmoxve.inputs.GetVm2Timeouts;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVm2PlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVm2PlainArgs Empty = new GetVm2PlainArgs();

    /**
     * The cloning configuration.
     * 
     */
    @Import(name="clone")
    private @Nullable GetVm2Clone clone;

    /**
     * @return The cloning configuration.
     * 
     */
    public Optional<GetVm2Clone> clone_() {
        return Optional.ofNullable(this.clone);
    }

    /**
     * The CPU configuration.
     * 
     */
    @Import(name="cpu")
    private @Nullable GetVm2Cpu cpu;

    /**
     * @return The CPU configuration.
     * 
     */
    public Optional<GetVm2Cpu> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The description of the VM.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description of the VM.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique identifier of the VM in the Proxmox cluster.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The unique identifier of the VM in the Proxmox cluster.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * The name of the VM.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the VM.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the node where the VM is provisioned.
     * 
     */
    @Import(name="nodeName", required=true)
    private String nodeName;

    /**
     * @return The name of the node where the VM is provisioned.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * The tags assigned to the VM.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return The tags assigned to the VM.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether the VM is a template.
     * 
     */
    @Import(name="template")
    private @Nullable Boolean template;

    /**
     * @return Whether the VM is a template.
     * 
     */
    public Optional<Boolean> template() {
        return Optional.ofNullable(this.template);
    }

    @Import(name="timeouts")
    private @Nullable GetVm2Timeouts timeouts;

    public Optional<GetVm2Timeouts> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private GetVm2PlainArgs() {}

    private GetVm2PlainArgs(GetVm2PlainArgs $) {
        this.clone = $.clone;
        this.cpu = $.cpu;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.nodeName = $.nodeName;
        this.tags = $.tags;
        this.template = $.template;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVm2PlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVm2PlainArgs $;

        public Builder() {
            $ = new GetVm2PlainArgs();
        }

        public Builder(GetVm2PlainArgs defaults) {
            $ = new GetVm2PlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clone The cloning configuration.
         * 
         * @return builder
         * 
         */
        public Builder clone_(@Nullable GetVm2Clone clone) {
            $.clone = clone;
            return this;
        }

        /**
         * @param cpu The CPU configuration.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable GetVm2Cpu cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param description The description of the VM.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param id The unique identifier of the VM in the Proxmox cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the VM.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param nodeName The name of the node where the VM is provisioned.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param tags The tags assigned to the VM.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags assigned to the VM.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param template Whether the VM is a template.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Boolean template) {
            $.template = template;
            return this;
        }

        public Builder timeouts(@Nullable GetVm2Timeouts timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public GetVm2PlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVm2PlainArgs", "id");
            }
            if ($.nodeName == null) {
                throw new MissingRequiredPropertyException("GetVm2PlainArgs", "nodeName");
            }
            return $;
        }
    }

}