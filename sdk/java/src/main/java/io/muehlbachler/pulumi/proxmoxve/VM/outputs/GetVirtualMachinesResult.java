// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.GetVirtualMachinesVm;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualMachinesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String nodeName;
    private @Nullable List<String> tags;
    private List<GetVirtualMachinesVm> vms;

    private GetVirtualMachinesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public List<GetVirtualMachinesVm> vms() {
        return this.vms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachinesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String nodeName;
        private @Nullable List<String> tags;
        private List<GetVirtualMachinesVm> vms;
        public Builder() {}
        public Builder(GetVirtualMachinesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.nodeName = defaults.nodeName;
    	      this.tags = defaults.tags;
    	      this.vms = defaults.vms;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder vms(List<GetVirtualMachinesVm> vms) {
            this.vms = Objects.requireNonNull(vms);
            return this;
        }
        public Builder vms(GetVirtualMachinesVm... vms) {
            return vms(List.of(vms));
        }
        public GetVirtualMachinesResult build() {
            final var o = new GetVirtualMachinesResult();
            o.id = id;
            o.nodeName = nodeName;
            o.tags = tags;
            o.vms = vms;
            return o;
        }
    }
}
