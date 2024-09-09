# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AcmeDnsPluginArgs', 'AcmeDnsPlugin']

@pulumi.input_type
class AcmeDnsPluginArgs:
    def __init__(__self__, *,
                 api: pulumi.Input[str],
                 plugin: pulumi.Input[str],
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 digest: Optional[pulumi.Input[str]] = None,
                 disable: Optional[pulumi.Input[bool]] = None,
                 validation_delay: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a AcmeDnsPlugin resource.
        :param pulumi.Input[str] api: API plugin name.
        :param pulumi.Input[str] plugin: ACME Plugin ID name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] data: DNS plugin data.
        :param pulumi.Input[str] digest: SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        :param pulumi.Input[bool] disable: Flag to disable the config.
        :param pulumi.Input[int] validation_delay: Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        pulumi.set(__self__, "api", api)
        pulumi.set(__self__, "plugin", plugin)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if digest is not None:
            pulumi.set(__self__, "digest", digest)
        if disable is not None:
            pulumi.set(__self__, "disable", disable)
        if validation_delay is not None:
            pulumi.set(__self__, "validation_delay", validation_delay)

    @property
    @pulumi.getter
    def api(self) -> pulumi.Input[str]:
        """
        API plugin name.
        """
        return pulumi.get(self, "api")

    @api.setter
    def api(self, value: pulumi.Input[str]):
        pulumi.set(self, "api", value)

    @property
    @pulumi.getter
    def plugin(self) -> pulumi.Input[str]:
        """
        ACME Plugin ID name.
        """
        return pulumi.get(self, "plugin")

    @plugin.setter
    def plugin(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin", value)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        DNS plugin data.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def digest(self) -> Optional[pulumi.Input[str]]:
        """
        SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        """
        return pulumi.get(self, "digest")

    @digest.setter
    def digest(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest", value)

    @property
    @pulumi.getter
    def disable(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to disable the config.
        """
        return pulumi.get(self, "disable")

    @disable.setter
    def disable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable", value)

    @property
    @pulumi.getter(name="validationDelay")
    def validation_delay(self) -> Optional[pulumi.Input[int]]:
        """
        Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        return pulumi.get(self, "validation_delay")

    @validation_delay.setter
    def validation_delay(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "validation_delay", value)


@pulumi.input_type
class _AcmeDnsPluginState:
    def __init__(__self__, *,
                 api: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 digest: Optional[pulumi.Input[str]] = None,
                 disable: Optional[pulumi.Input[bool]] = None,
                 plugin: Optional[pulumi.Input[str]] = None,
                 validation_delay: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering AcmeDnsPlugin resources.
        :param pulumi.Input[str] api: API plugin name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] data: DNS plugin data.
        :param pulumi.Input[str] digest: SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        :param pulumi.Input[bool] disable: Flag to disable the config.
        :param pulumi.Input[str] plugin: ACME Plugin ID name.
        :param pulumi.Input[int] validation_delay: Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        if api is not None:
            pulumi.set(__self__, "api", api)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if digest is not None:
            pulumi.set(__self__, "digest", digest)
        if disable is not None:
            pulumi.set(__self__, "disable", disable)
        if plugin is not None:
            pulumi.set(__self__, "plugin", plugin)
        if validation_delay is not None:
            pulumi.set(__self__, "validation_delay", validation_delay)

    @property
    @pulumi.getter
    def api(self) -> Optional[pulumi.Input[str]]:
        """
        API plugin name.
        """
        return pulumi.get(self, "api")

    @api.setter
    def api(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api", value)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        DNS plugin data.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def digest(self) -> Optional[pulumi.Input[str]]:
        """
        SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        """
        return pulumi.get(self, "digest")

    @digest.setter
    def digest(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "digest", value)

    @property
    @pulumi.getter
    def disable(self) -> Optional[pulumi.Input[bool]]:
        """
        Flag to disable the config.
        """
        return pulumi.get(self, "disable")

    @disable.setter
    def disable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable", value)

    @property
    @pulumi.getter
    def plugin(self) -> Optional[pulumi.Input[str]]:
        """
        ACME Plugin ID name.
        """
        return pulumi.get(self, "plugin")

    @plugin.setter
    def plugin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plugin", value)

    @property
    @pulumi.getter(name="validationDelay")
    def validation_delay(self) -> Optional[pulumi.Input[int]]:
        """
        Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        return pulumi.get(self, "validation_delay")

    @validation_delay.setter
    def validation_delay(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "validation_delay", value)


class AcmeDnsPlugin(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 digest: Optional[pulumi.Input[str]] = None,
                 disable: Optional[pulumi.Input[bool]] = None,
                 plugin: Optional[pulumi.Input[str]] = None,
                 validation_delay: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Manages an ACME plugin in a Proxmox VE cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.AcmeDnsPlugin("example",
            api="aws",
            data={
                "AWS_ACCESS_KEY_ID": "EXAMPLE",
                "AWS_SECRET_ACCESS_KEY": "EXAMPLE",
            },
            plugin="test")
        ```

        ## Import

        #!/usr/bin/env sh

        ACME accounts can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:index/acmeDnsPlugin:AcmeDnsPlugin example test
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api: API plugin name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] data: DNS plugin data.
        :param pulumi.Input[str] digest: SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        :param pulumi.Input[bool] disable: Flag to disable the config.
        :param pulumi.Input[str] plugin: ACME Plugin ID name.
        :param pulumi.Input[int] validation_delay: Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AcmeDnsPluginArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an ACME plugin in a Proxmox VE cluster.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.AcmeDnsPlugin("example",
            api="aws",
            data={
                "AWS_ACCESS_KEY_ID": "EXAMPLE",
                "AWS_SECRET_ACCESS_KEY": "EXAMPLE",
            },
            plugin="test")
        ```

        ## Import

        #!/usr/bin/env sh

        ACME accounts can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:index/acmeDnsPlugin:AcmeDnsPlugin example test
        ```

        :param str resource_name: The name of the resource.
        :param AcmeDnsPluginArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AcmeDnsPluginArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 digest: Optional[pulumi.Input[str]] = None,
                 disable: Optional[pulumi.Input[bool]] = None,
                 plugin: Optional[pulumi.Input[str]] = None,
                 validation_delay: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AcmeDnsPluginArgs.__new__(AcmeDnsPluginArgs)

            if api is None and not opts.urn:
                raise TypeError("Missing required property 'api'")
            __props__.__dict__["api"] = api
            __props__.__dict__["data"] = data
            __props__.__dict__["digest"] = digest
            __props__.__dict__["disable"] = disable
            if plugin is None and not opts.urn:
                raise TypeError("Missing required property 'plugin'")
            __props__.__dict__["plugin"] = plugin
            __props__.__dict__["validation_delay"] = validation_delay
        super(AcmeDnsPlugin, __self__).__init__(
            'proxmoxve:index/acmeDnsPlugin:AcmeDnsPlugin',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api: Optional[pulumi.Input[str]] = None,
            data: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            digest: Optional[pulumi.Input[str]] = None,
            disable: Optional[pulumi.Input[bool]] = None,
            plugin: Optional[pulumi.Input[str]] = None,
            validation_delay: Optional[pulumi.Input[int]] = None) -> 'AcmeDnsPlugin':
        """
        Get an existing AcmeDnsPlugin resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api: API plugin name.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] data: DNS plugin data.
        :param pulumi.Input[str] digest: SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        :param pulumi.Input[bool] disable: Flag to disable the config.
        :param pulumi.Input[str] plugin: ACME Plugin ID name.
        :param pulumi.Input[int] validation_delay: Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AcmeDnsPluginState.__new__(_AcmeDnsPluginState)

        __props__.__dict__["api"] = api
        __props__.__dict__["data"] = data
        __props__.__dict__["digest"] = digest
        __props__.__dict__["disable"] = disable
        __props__.__dict__["plugin"] = plugin
        __props__.__dict__["validation_delay"] = validation_delay
        return AcmeDnsPlugin(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def api(self) -> pulumi.Output[str]:
        """
        API plugin name.
        """
        return pulumi.get(self, "api")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        DNS plugin data.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def digest(self) -> pulumi.Output[str]:
        """
        SHA1 digest of the current configuration. Prevent changes if current configuration file has a different digest. This can be used to prevent concurrent modifications.
        """
        return pulumi.get(self, "digest")

    @property
    @pulumi.getter
    def disable(self) -> pulumi.Output[Optional[bool]]:
        """
        Flag to disable the config.
        """
        return pulumi.get(self, "disable")

    @property
    @pulumi.getter
    def plugin(self) -> pulumi.Output[str]:
        """
        ACME Plugin ID name.
        """
        return pulumi.get(self, "plugin")

    @property
    @pulumi.getter(name="validationDelay")
    def validation_delay(self) -> pulumi.Output[int]:
        """
        Extra delay in seconds to wait before requesting validation. Allows to cope with a long TTL of DNS records (0 - 172800).
        """
        return pulumi.get(self, "validation_delay")

