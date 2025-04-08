// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatastoresDatastoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDatastoresDatastoreArgs Empty = new GetDatastoresDatastoreArgs();

    /**
     * Whether the store is active.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Whether the store is active.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Allowed store content types.
     * 
     */
    @Import(name="contentTypes", required=true)
    private Output<List<String>> contentTypes;

    /**
     * @return Allowed store content types.
     * 
     */
    public Output<List<String>> contentTypes() {
        return this.contentTypes;
    }

    /**
     * Whether the store is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the store is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The ID of the store.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the store.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The name of the node the store is on.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The name of the node the store is on.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    /**
     * Shared flag from store configuration.
     * 
     */
    @Import(name="shared")
    private @Nullable Output<Boolean> shared;

    /**
     * @return Shared flag from store configuration.
     * 
     */
    public Optional<Output<Boolean>> shared() {
        return Optional.ofNullable(this.shared);
    }

    /**
     * Available store space in bytes.
     * 
     */
    @Import(name="spaceAvailable")
    private @Nullable Output<Integer> spaceAvailable;

    /**
     * @return Available store space in bytes.
     * 
     */
    public Optional<Output<Integer>> spaceAvailable() {
        return Optional.ofNullable(this.spaceAvailable);
    }

    /**
     * Total store space in bytes.
     * 
     */
    @Import(name="spaceTotal")
    private @Nullable Output<Integer> spaceTotal;

    /**
     * @return Total store space in bytes.
     * 
     */
    public Optional<Output<Integer>> spaceTotal() {
        return Optional.ofNullable(this.spaceTotal);
    }

    /**
     * Used store space in bytes.
     * 
     */
    @Import(name="spaceUsed")
    private @Nullable Output<Integer> spaceUsed;

    /**
     * @return Used store space in bytes.
     * 
     */
    public Optional<Output<Integer>> spaceUsed() {
        return Optional.ofNullable(this.spaceUsed);
    }

    /**
     * Used fraction (used/total).
     * 
     */
    @Import(name="spaceUsedFraction")
    private @Nullable Output<Double> spaceUsedFraction;

    /**
     * @return Used fraction (used/total).
     * 
     */
    public Optional<Output<Double>> spaceUsedFraction() {
        return Optional.ofNullable(this.spaceUsedFraction);
    }

    /**
     * Store type.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Store type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GetDatastoresDatastoreArgs() {}

    private GetDatastoresDatastoreArgs(GetDatastoresDatastoreArgs $) {
        this.active = $.active;
        this.contentTypes = $.contentTypes;
        this.enabled = $.enabled;
        this.id = $.id;
        this.nodeName = $.nodeName;
        this.shared = $.shared;
        this.spaceAvailable = $.spaceAvailable;
        this.spaceTotal = $.spaceTotal;
        this.spaceUsed = $.spaceUsed;
        this.spaceUsedFraction = $.spaceUsedFraction;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatastoresDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatastoresDatastoreArgs $;

        public Builder() {
            $ = new GetDatastoresDatastoreArgs();
        }

        public Builder(GetDatastoresDatastoreArgs defaults) {
            $ = new GetDatastoresDatastoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether the store is active.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Whether the store is active.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param contentTypes Allowed store content types.
         * 
         * @return builder
         * 
         */
        public Builder contentTypes(Output<List<String>> contentTypes) {
            $.contentTypes = contentTypes;
            return this;
        }

        /**
         * @param contentTypes Allowed store content types.
         * 
         * @return builder
         * 
         */
        public Builder contentTypes(List<String> contentTypes) {
            return contentTypes(Output.of(contentTypes));
        }

        /**
         * @param contentTypes Allowed store content types.
         * 
         * @return builder
         * 
         */
        public Builder contentTypes(String... contentTypes) {
            return contentTypes(List.of(contentTypes));
        }

        /**
         * @param enabled Whether the store is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the store is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param id The ID of the store.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the store.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param nodeName The name of the node the store is on.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the node the store is on.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param shared Shared flag from store configuration.
         * 
         * @return builder
         * 
         */
        public Builder shared(@Nullable Output<Boolean> shared) {
            $.shared = shared;
            return this;
        }

        /**
         * @param shared Shared flag from store configuration.
         * 
         * @return builder
         * 
         */
        public Builder shared(Boolean shared) {
            return shared(Output.of(shared));
        }

        /**
         * @param spaceAvailable Available store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceAvailable(@Nullable Output<Integer> spaceAvailable) {
            $.spaceAvailable = spaceAvailable;
            return this;
        }

        /**
         * @param spaceAvailable Available store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceAvailable(Integer spaceAvailable) {
            return spaceAvailable(Output.of(spaceAvailable));
        }

        /**
         * @param spaceTotal Total store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceTotal(@Nullable Output<Integer> spaceTotal) {
            $.spaceTotal = spaceTotal;
            return this;
        }

        /**
         * @param spaceTotal Total store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceTotal(Integer spaceTotal) {
            return spaceTotal(Output.of(spaceTotal));
        }

        /**
         * @param spaceUsed Used store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceUsed(@Nullable Output<Integer> spaceUsed) {
            $.spaceUsed = spaceUsed;
            return this;
        }

        /**
         * @param spaceUsed Used store space in bytes.
         * 
         * @return builder
         * 
         */
        public Builder spaceUsed(Integer spaceUsed) {
            return spaceUsed(Output.of(spaceUsed));
        }

        /**
         * @param spaceUsedFraction Used fraction (used/total).
         * 
         * @return builder
         * 
         */
        public Builder spaceUsedFraction(@Nullable Output<Double> spaceUsedFraction) {
            $.spaceUsedFraction = spaceUsedFraction;
            return this;
        }

        /**
         * @param spaceUsedFraction Used fraction (used/total).
         * 
         * @return builder
         * 
         */
        public Builder spaceUsedFraction(Double spaceUsedFraction) {
            return spaceUsedFraction(Output.of(spaceUsedFraction));
        }

        /**
         * @param type Store type.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Store type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetDatastoresDatastoreArgs build() {
            if ($.contentTypes == null) {
                throw new MissingRequiredPropertyException("GetDatastoresDatastoreArgs", "contentTypes");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDatastoresDatastoreArgs", "id");
            }
            if ($.nodeName == null) {
                throw new MissingRequiredPropertyException("GetDatastoresDatastoreArgs", "nodeName");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetDatastoresDatastoreArgs", "type");
            }
            return $;
        }
    }

}
