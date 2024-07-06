// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.VM.inputs.GetVirtualMachinesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachinesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachinesPlainArgs Empty = new GetVirtualMachinesPlainArgs();

    /**
     * Filter blocks. The VM must satisfy all filter blocks to be included in the result.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVirtualMachinesFilter> filters;

    /**
     * @return Filter blocks. The VM must satisfy all filter blocks to be included in the result.
     * 
     */
    public Optional<List<GetVirtualMachinesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The node name. All cluster nodes will be queried in case this is omitted
     * 
     */
    @Import(name="nodeName")
    private @Nullable String nodeName;

    /**
     * @return The node name. All cluster nodes will be queried in case this is omitted
     * 
     */
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     * 
     */
    @Import(name="tags")
    private @Nullable List<String> tags;

    /**
     * @return A list of tags to filter the VMs. The VM must have all
     * the tags to be included in the result.
     * 
     */
    public Optional<List<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVirtualMachinesPlainArgs() {}

    private GetVirtualMachinesPlainArgs(GetVirtualMachinesPlainArgs $) {
        this.filters = $.filters;
        this.nodeName = $.nodeName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualMachinesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualMachinesPlainArgs $;

        public Builder() {
            $ = new GetVirtualMachinesPlainArgs();
        }

        public Builder(GetVirtualMachinesPlainArgs defaults) {
            $ = new GetVirtualMachinesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Filter blocks. The VM must satisfy all filter blocks to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVirtualMachinesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filter blocks. The VM must satisfy all filter blocks to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVirtualMachinesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param nodeName The node name. All cluster nodes will be queried in case this is omitted
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable String nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param tags A list of tags to filter the VMs. The VM must have all
         * the tags to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to filter the VMs. The VM must have all
         * the tags to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetVirtualMachinesPlainArgs build() {
            return $;
        }
    }

}
