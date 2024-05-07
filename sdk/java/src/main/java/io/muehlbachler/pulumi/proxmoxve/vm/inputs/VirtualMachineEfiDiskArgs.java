// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineEfiDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineEfiDiskArgs Empty = new VirtualMachineEfiDiskArgs();

    /**
     * The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * The file format (defaults to `raw`).
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return The file format (defaults to `raw`).
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * Use am EFI vars template with
     * distribution-specific and Microsoft Standard keys enrolled, if used with
     * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
     * to `false`).
     * 
     */
    @Import(name="preEnrolledKeys")
    private @Nullable Output<Boolean> preEnrolledKeys;

    /**
     * @return Use am EFI vars template with
     * distribution-specific and Microsoft Standard keys enrolled, if used with
     * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
     * to `false`).
     * 
     */
    public Optional<Output<Boolean>> preEnrolledKeys() {
        return Optional.ofNullable(this.preEnrolledKeys);
    }

    /**
     * The VGA type (defaults to `std`).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The VGA type (defaults to `std`).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private VirtualMachineEfiDiskArgs() {}

    private VirtualMachineEfiDiskArgs(VirtualMachineEfiDiskArgs $) {
        this.datastoreId = $.datastoreId;
        this.fileFormat = $.fileFormat;
        this.preEnrolledKeys = $.preEnrolledKeys;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineEfiDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineEfiDiskArgs $;

        public Builder() {
            $ = new VirtualMachineEfiDiskArgs();
        }

        public Builder(VirtualMachineEfiDiskArgs defaults) {
            $ = new VirtualMachineEfiDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The identifier for the datastore to create the
         * cloud-init disk in (defaults to `local-lvm`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param fileFormat The file format (defaults to `raw`).
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat The file format (defaults to `raw`).
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param preEnrolledKeys Use am EFI vars template with
         * distribution-specific and Microsoft Standard keys enrolled, if used with
         * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder preEnrolledKeys(@Nullable Output<Boolean> preEnrolledKeys) {
            $.preEnrolledKeys = preEnrolledKeys;
            return this;
        }

        /**
         * @param preEnrolledKeys Use am EFI vars template with
         * distribution-specific and Microsoft Standard keys enrolled, if used with
         * EFI type=`4m`. Ignored for VMs with cpu.architecture=`aarch64` (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder preEnrolledKeys(Boolean preEnrolledKeys) {
            return preEnrolledKeys(Output.of(preEnrolledKeys));
        }

        /**
         * @param type The VGA type (defaults to `std`).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The VGA type (defaults to `std`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VirtualMachineEfiDiskArgs build() {
            return $;
        }
    }

}
