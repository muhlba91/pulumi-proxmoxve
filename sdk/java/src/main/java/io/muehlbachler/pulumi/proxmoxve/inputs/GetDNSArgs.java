// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDNSArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDNSArgs Empty = new GetDNSArgs();

    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    public Output<String> nodeName() {
        return this.nodeName;
    }

    private GetDNSArgs() {}

    private GetDNSArgs(GetDNSArgs $) {
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDNSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDNSArgs $;

        public Builder() {
            $ = new GetDNSArgs();
        }

        public Builder(GetDNSArgs defaults) {
            $ = new GetDNSArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public GetDNSArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
