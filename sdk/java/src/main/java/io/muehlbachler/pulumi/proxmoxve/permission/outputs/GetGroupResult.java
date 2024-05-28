// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import io.muehlbachler.pulumi.proxmoxve.Permission.outputs.GetGroupAcl;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return The access control list.
     * 
     */
    private List<GetGroupAcl> acls;
    /**
     * @return The group comment.
     * 
     */
    private String comment;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The group members as a list with `username{@literal @}realm` entries.
     * 
     */
    private List<String> members;

    private GetGroupResult() {}
    /**
     * @return The access control list.
     * 
     */
    public List<GetGroupAcl> acls() {
        return this.acls;
    }
    /**
     * @return The group comment.
     * 
     */
    public String comment() {
        return this.comment;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The group members as a list with `username{@literal @}realm` entries.
     * 
     */
    public List<String> members() {
        return this.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGroupAcl> acls;
        private String comment;
        private String groupId;
        private String id;
        private List<String> members;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.comment = defaults.comment;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
        }

        @CustomType.Setter
        public Builder acls(List<GetGroupAcl> acls) {
            if (acls == null) {
              throw new MissingRequiredPropertyException("GetGroupResult", "acls");
            }
            this.acls = acls;
            return this;
        }
        public Builder acls(GetGroupAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetGroupResult", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetGroupResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGroupResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder members(List<String> members) {
            if (members == null) {
              throw new MissingRequiredPropertyException("GetGroupResult", "members");
            }
            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public GetGroupResult build() {
            final var _resultValue = new GetGroupResult();
            _resultValue.acls = acls;
            _resultValue.comment = comment;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.members = members;
            return _resultValue;
        }
    }
}
