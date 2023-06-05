// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatastoresArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatastoresArgs Empty = new GetDatastoresArgs();

    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    public Output<String> nodeName() {
        return this.nodeName;
    }

    private GetDatastoresArgs() {}

    private GetDatastoresArgs(GetDatastoresArgs $) {
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatastoresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatastoresArgs $;

        public Builder() {
            $ = new GetDatastoresArgs();
        }

        public Builder(GetDatastoresArgs defaults) {
            $ = new GetDatastoresArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public GetDatastoresArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
