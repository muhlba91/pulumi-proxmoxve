// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersResult {
    /**
     * @return The user comments.
     * 
     */
    private List<String> comments;
    /**
     * @return The users&#39; email addresses.
     * 
     */
    private List<String> emails;
    /**
     * @return Whether a user account is enabled.
     * 
     */
    private List<Boolean> enableds;
    /**
     * @return The user accounts&#39; expiration dates (RFC 3339).
     * 
     */
    private List<String> expirationDates;
    /**
     * @return The users&#39; first names.
     * 
     */
    private List<String> firstNames;
    /**
     * @return The users&#39; groups.
     * 
     */
    private List<List<String>> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The users&#39; keys.
     * 
     */
    private List<String> keys;
    /**
     * @return The users&#39; last names.
     * 
     */
    private List<String> lastNames;
    /**
     * @return The user identifiers.
     * 
     */
    private List<String> userIds;

    private GetUsersResult() {}
    /**
     * @return The user comments.
     * 
     */
    public List<String> comments() {
        return this.comments;
    }
    /**
     * @return The users&#39; email addresses.
     * 
     */
    public List<String> emails() {
        return this.emails;
    }
    /**
     * @return Whether a user account is enabled.
     * 
     */
    public List<Boolean> enableds() {
        return this.enableds;
    }
    /**
     * @return The user accounts&#39; expiration dates (RFC 3339).
     * 
     */
    public List<String> expirationDates() {
        return this.expirationDates;
    }
    /**
     * @return The users&#39; first names.
     * 
     */
    public List<String> firstNames() {
        return this.firstNames;
    }
    /**
     * @return The users&#39; groups.
     * 
     */
    public List<List<String>> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The users&#39; keys.
     * 
     */
    public List<String> keys() {
        return this.keys;
    }
    /**
     * @return The users&#39; last names.
     * 
     */
    public List<String> lastNames() {
        return this.lastNames;
    }
    /**
     * @return The user identifiers.
     * 
     */
    public List<String> userIds() {
        return this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> comments;
        private List<String> emails;
        private List<Boolean> enableds;
        private List<String> expirationDates;
        private List<String> firstNames;
        private List<List<String>> groups;
        private String id;
        private List<String> keys;
        private List<String> lastNames;
        private List<String> userIds;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.emails = defaults.emails;
    	      this.enableds = defaults.enableds;
    	      this.expirationDates = defaults.expirationDates;
    	      this.firstNames = defaults.firstNames;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.keys = defaults.keys;
    	      this.lastNames = defaults.lastNames;
    	      this.userIds = defaults.userIds;
        }

        @CustomType.Setter
        public Builder comments(List<String> comments) {
            if (comments == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "comments");
            }
            this.comments = comments;
            return this;
        }
        public Builder comments(String... comments) {
            return comments(List.of(comments));
        }
        @CustomType.Setter
        public Builder emails(List<String> emails) {
            if (emails == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "emails");
            }
            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder enableds(List<Boolean> enableds) {
            if (enableds == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "enableds");
            }
            this.enableds = enableds;
            return this;
        }
        public Builder enableds(Boolean... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder expirationDates(List<String> expirationDates) {
            if (expirationDates == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "expirationDates");
            }
            this.expirationDates = expirationDates;
            return this;
        }
        public Builder expirationDates(String... expirationDates) {
            return expirationDates(List.of(expirationDates));
        }
        @CustomType.Setter
        public Builder firstNames(List<String> firstNames) {
            if (firstNames == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "firstNames");
            }
            this.firstNames = firstNames;
            return this;
        }
        public Builder firstNames(String... firstNames) {
            return firstNames(List.of(firstNames));
        }
        @CustomType.Setter
        public Builder groups(List<List<String>> groups) {
            if (groups == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "groups");
            }
            this.groups = groups;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keys(List<String> keys) {
            if (keys == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "keys");
            }
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder lastNames(List<String> lastNames) {
            if (lastNames == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "lastNames");
            }
            this.lastNames = lastNames;
            return this;
        }
        public Builder lastNames(String... lastNames) {
            return lastNames(List.of(lastNames));
        }
        @CustomType.Setter
        public Builder userIds(List<String> userIds) {
            if (userIds == null) {
              throw new MissingRequiredPropertyException("GetUsersResult", "userIds");
            }
            this.userIds = userIds;
            return this;
        }
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }
        public GetUsersResult build() {
            final var _resultValue = new GetUsersResult();
            _resultValue.comments = comments;
            _resultValue.emails = emails;
            _resultValue.enableds = enableds;
            _resultValue.expirationDates = expirationDates;
            _resultValue.firstNames = firstNames;
            _resultValue.groups = groups;
            _resultValue.id = id;
            _resultValue.keys = keys;
            _resultValue.lastNames = lastNames;
            _resultValue.userIds = userIds;
            return _resultValue;
        }
    }
}
