// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Storage.inputs.FileSourceFileArgs;
import io.muehlbachler.pulumi.proxmoxve.Storage.inputs.FileSourceRawArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileState extends com.pulumi.resources.ResourceArgs {

    public static final FileState Empty = new FileState();

    /**
     * The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    /**
     * @return The content type. If not specified, the content
     * type will be inferred from the file extension. Valid values are:
     * 
     */
    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The datastore id.
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The datastore id.
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    @Import(name="fileMode")
    private @Nullable Output<String> fileMode;

    /**
     * @return The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root{@literal @}pam` authenticated user.
     * 
     */
    public Optional<Output<String>> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }

    /**
     * The file modification date (RFC 3339).
     * 
     */
    @Import(name="fileModificationDate")
    private @Nullable Output<String> fileModificationDate;

    /**
     * @return The file modification date (RFC 3339).
     * 
     */
    public Optional<Output<String>> fileModificationDate() {
        return Optional.ofNullable(this.fileModificationDate);
    }

    /**
     * The file name.
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<String> fileName;

    /**
     * @return The file name.
     * 
     */
    public Optional<Output<String>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * The file size in bytes.
     * 
     */
    @Import(name="fileSize")
    private @Nullable Output<Integer> fileSize;

    /**
     * @return The file size in bytes.
     * 
     */
    public Optional<Output<Integer>> fileSize() {
        return Optional.ofNullable(this.fileSize);
    }

    /**
     * The file tag.
     * 
     */
    @Import(name="fileTag")
    private @Nullable Output<String> fileTag;

    /**
     * @return The file tag.
     * 
     */
    public Optional<Output<String>> fileTag() {
        return Optional.ofNullable(this.fileTag);
    }

    /**
     * The node name.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return The node name.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * Whether to overwrite an existing file (defaults to
     * `true`).
     * 
     */
    @Import(name="overwrite")
    private @Nullable Output<Boolean> overwrite;

    /**
     * @return Whether to overwrite an existing file (defaults to
     * `true`).
     * 
     */
    public Optional<Output<Boolean>> overwrite() {
        return Optional.ofNullable(this.overwrite);
    }

    /**
     * The source file (conflicts with `source_raw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     * 
     */
    @Import(name="sourceFile")
    private @Nullable Output<FileSourceFileArgs> sourceFile;

    /**
     * @return The source file (conflicts with `source_raw`),
     * could be a local file or a URL. If the source file is a URL, the file will
     * be downloaded and stored locally before uploading it to Proxmox VE.
     * 
     */
    public Optional<Output<FileSourceFileArgs>> sourceFile() {
        return Optional.ofNullable(this.sourceFile);
    }

    /**
     * The raw source (conflicts with `source_file`).
     * 
     */
    @Import(name="sourceRaw")
    private @Nullable Output<FileSourceRawArgs> sourceRaw;

    /**
     * @return The raw source (conflicts with `source_file`).
     * 
     */
    public Optional<Output<FileSourceRawArgs>> sourceRaw() {
        return Optional.ofNullable(this.sourceRaw);
    }

    /**
     * Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     * 
     */
    @Import(name="timeoutUpload")
    private @Nullable Output<Integer> timeoutUpload;

    /**
     * @return Timeout for uploading ISO/VSTMPL files in
     * seconds (defaults to 1800).
     * 
     */
    public Optional<Output<Integer>> timeoutUpload() {
        return Optional.ofNullable(this.timeoutUpload);
    }

    private FileState() {}

    private FileState(FileState $) {
        this.contentType = $.contentType;
        this.datastoreId = $.datastoreId;
        this.fileMode = $.fileMode;
        this.fileModificationDate = $.fileModificationDate;
        this.fileName = $.fileName;
        this.fileSize = $.fileSize;
        this.fileTag = $.fileTag;
        this.nodeName = $.nodeName;
        this.overwrite = $.overwrite;
        this.sourceFile = $.sourceFile;
        this.sourceRaw = $.sourceRaw;
        this.timeoutUpload = $.timeoutUpload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileState $;

        public Builder() {
            $ = new FileState();
        }

        public Builder(FileState defaults) {
            $ = new FileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentType The content type. If not specified, the content
         * type will be inferred from the file extension. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type. If not specified, the content
         * type will be inferred from the file extension. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param datastoreId The datastore id.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The datastore id.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param fileMode The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder fileMode(@Nullable Output<String> fileMode) {
            $.fileMode = fileMode;
            return this;
        }

        /**
         * @param fileMode The file mode in octal format, e.g. `0700` or `600`. Note that the prefixes `0o` and `0x` is not supported! Setting this attribute is also only allowed for `root{@literal @}pam` authenticated user.
         * 
         * @return builder
         * 
         */
        public Builder fileMode(String fileMode) {
            return fileMode(Output.of(fileMode));
        }

        /**
         * @param fileModificationDate The file modification date (RFC 3339).
         * 
         * @return builder
         * 
         */
        public Builder fileModificationDate(@Nullable Output<String> fileModificationDate) {
            $.fileModificationDate = fileModificationDate;
            return this;
        }

        /**
         * @param fileModificationDate The file modification date (RFC 3339).
         * 
         * @return builder
         * 
         */
        public Builder fileModificationDate(String fileModificationDate) {
            return fileModificationDate(Output.of(fileModificationDate));
        }

        /**
         * @param fileName The file name.
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<String> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName The file name.
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param fileSize The file size in bytes.
         * 
         * @return builder
         * 
         */
        public Builder fileSize(@Nullable Output<Integer> fileSize) {
            $.fileSize = fileSize;
            return this;
        }

        /**
         * @param fileSize The file size in bytes.
         * 
         * @return builder
         * 
         */
        public Builder fileSize(Integer fileSize) {
            return fileSize(Output.of(fileSize));
        }

        /**
         * @param fileTag The file tag.
         * 
         * @return builder
         * 
         */
        public Builder fileTag(@Nullable Output<String> fileTag) {
            $.fileTag = fileTag;
            return this;
        }

        /**
         * @param fileTag The file tag.
         * 
         * @return builder
         * 
         */
        public Builder fileTag(String fileTag) {
            return fileTag(Output.of(fileTag));
        }

        /**
         * @param nodeName The node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
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
         * @param overwrite Whether to overwrite an existing file (defaults to
         * `true`).
         * 
         * @return builder
         * 
         */
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            $.overwrite = overwrite;
            return this;
        }

        /**
         * @param overwrite Whether to overwrite an existing file (defaults to
         * `true`).
         * 
         * @return builder
         * 
         */
        public Builder overwrite(Boolean overwrite) {
            return overwrite(Output.of(overwrite));
        }

        /**
         * @param sourceFile The source file (conflicts with `source_raw`),
         * could be a local file or a URL. If the source file is a URL, the file will
         * be downloaded and stored locally before uploading it to Proxmox VE.
         * 
         * @return builder
         * 
         */
        public Builder sourceFile(@Nullable Output<FileSourceFileArgs> sourceFile) {
            $.sourceFile = sourceFile;
            return this;
        }

        /**
         * @param sourceFile The source file (conflicts with `source_raw`),
         * could be a local file or a URL. If the source file is a URL, the file will
         * be downloaded and stored locally before uploading it to Proxmox VE.
         * 
         * @return builder
         * 
         */
        public Builder sourceFile(FileSourceFileArgs sourceFile) {
            return sourceFile(Output.of(sourceFile));
        }

        /**
         * @param sourceRaw The raw source (conflicts with `source_file`).
         * 
         * @return builder
         * 
         */
        public Builder sourceRaw(@Nullable Output<FileSourceRawArgs> sourceRaw) {
            $.sourceRaw = sourceRaw;
            return this;
        }

        /**
         * @param sourceRaw The raw source (conflicts with `source_file`).
         * 
         * @return builder
         * 
         */
        public Builder sourceRaw(FileSourceRawArgs sourceRaw) {
            return sourceRaw(Output.of(sourceRaw));
        }

        /**
         * @param timeoutUpload Timeout for uploading ISO/VSTMPL files in
         * seconds (defaults to 1800).
         * 
         * @return builder
         * 
         */
        public Builder timeoutUpload(@Nullable Output<Integer> timeoutUpload) {
            $.timeoutUpload = timeoutUpload;
            return this;
        }

        /**
         * @param timeoutUpload Timeout for uploading ISO/VSTMPL files in
         * seconds (defaults to 1800).
         * 
         * @return builder
         * 
         */
        public Builder timeoutUpload(Integer timeoutUpload) {
            return timeoutUpload(Output.of(timeoutUpload));
        }

        public FileState build() {
            return $;
        }
    }

}
