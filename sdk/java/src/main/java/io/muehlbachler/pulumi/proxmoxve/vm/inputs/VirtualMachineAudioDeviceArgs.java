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


public final class VirtualMachineAudioDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineAudioDeviceArgs Empty = new VirtualMachineAudioDeviceArgs();

    /**
     * The device (defaults to `intel-hda`).
     * - `AC97` - Intel 82801AA AC97 Audio.
     * - `ich9-intel-hda` - Intel HD Audio Controller (ich9).
     * - `intel-hda` - Intel HD Audio.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The device (defaults to `intel-hda`).
     * - `AC97` - Intel 82801AA AC97 Audio.
     * - `ich9-intel-hda` - Intel HD Audio Controller (ich9).
     * - `intel-hda` - Intel HD Audio.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The driver (defaults to `spice`).
     * 
     */
    @Import(name="driver")
    private @Nullable Output<String> driver;

    /**
     * @return The driver (defaults to `spice`).
     * 
     */
    public Optional<Output<String>> driver() {
        return Optional.ofNullable(this.driver);
    }

    /**
     * Whether to enable the audio device (defaults
     * to `true`).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable the audio device (defaults
     * to `true`).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private VirtualMachineAudioDeviceArgs() {}

    private VirtualMachineAudioDeviceArgs(VirtualMachineAudioDeviceArgs $) {
        this.device = $.device;
        this.driver = $.driver;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineAudioDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineAudioDeviceArgs $;

        public Builder() {
            $ = new VirtualMachineAudioDeviceArgs();
        }

        public Builder(VirtualMachineAudioDeviceArgs defaults) {
            $ = new VirtualMachineAudioDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device The device (defaults to `intel-hda`).
         * - `AC97` - Intel 82801AA AC97 Audio.
         * - `ich9-intel-hda` - Intel HD Audio Controller (ich9).
         * - `intel-hda` - Intel HD Audio.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The device (defaults to `intel-hda`).
         * - `AC97` - Intel 82801AA AC97 Audio.
         * - `ich9-intel-hda` - Intel HD Audio Controller (ich9).
         * - `intel-hda` - Intel HD Audio.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param driver The driver (defaults to `spice`).
         * 
         * @return builder
         * 
         */
        public Builder driver(@Nullable Output<String> driver) {
            $.driver = driver;
            return this;
        }

        /**
         * @param driver The driver (defaults to `spice`).
         * 
         * @return builder
         * 
         */
        public Builder driver(String driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param enabled Whether to enable the audio device (defaults
         * to `true`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the audio device (defaults
         * to `true`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public VirtualMachineAudioDeviceArgs build() {
            return $;
        }
    }

}
