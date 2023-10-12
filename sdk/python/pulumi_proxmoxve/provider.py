# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from ._inputs import *

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_token: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input['ProviderSshArgs']] = None,
                 tmp_dir: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] api_token: The API token for the Proxmox VE API.
        :param pulumi.Input[str] endpoint: The endpoint for the Proxmox VE API.
        :param pulumi.Input[bool] insecure: Whether to skip the TLS verification step.
        :param pulumi.Input[str] otp: The one-time password for the Proxmox VE API.
        :param pulumi.Input[str] password: The password for the Proxmox VE API.
        :param pulumi.Input['ProviderSshArgs'] ssh: The SSH configuration for the Proxmox nodes.
        :param pulumi.Input[str] tmp_dir: The alternative temporary directory.
        :param pulumi.Input[str] username: The username for the Proxmox VE API.
        """
        ProviderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_token=api_token,
            endpoint=endpoint,
            insecure=insecure,
            otp=otp,
            password=password,
            ssh=ssh,
            tmp_dir=tmp_dir,
            username=username,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_token: Optional[pulumi.Input[str]] = None,
             endpoint: Optional[pulumi.Input[str]] = None,
             insecure: Optional[pulumi.Input[bool]] = None,
             otp: Optional[pulumi.Input[str]] = None,
             password: Optional[pulumi.Input[str]] = None,
             ssh: Optional[pulumi.Input['ProviderSshArgs']] = None,
             tmp_dir: Optional[pulumi.Input[str]] = None,
             username: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if api_token is not None:
            _setter("api_token", api_token)
        if endpoint is not None:
            _setter("endpoint", endpoint)
        if insecure is not None:
            _setter("insecure", insecure)
        if otp is not None:
            warnings.warn("""The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""", DeprecationWarning)
            pulumi.log.warn("""otp is deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""")
        if otp is not None:
            _setter("otp", otp)
        if password is not None:
            _setter("password", password)
        if ssh is not None:
            _setter("ssh", ssh)
        if tmp_dir is not None:
            _setter("tmp_dir", tmp_dir)
        if username is not None:
            _setter("username", username)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        The API token for the Proxmox VE API.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint for the Proxmox VE API.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to skip the TLS verification step.
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure", value)

    @property
    @pulumi.getter
    def otp(self) -> Optional[pulumi.Input[str]]:
        """
        The one-time password for the Proxmox VE API.
        """
        warnings.warn("""The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""", DeprecationWarning)
        pulumi.log.warn("""otp is deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""")

        return pulumi.get(self, "otp")

    @otp.setter
    def otp(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "otp", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password for the Proxmox VE API.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def ssh(self) -> Optional[pulumi.Input['ProviderSshArgs']]:
        """
        The SSH configuration for the Proxmox nodes.
        """
        return pulumi.get(self, "ssh")

    @ssh.setter
    def ssh(self, value: Optional[pulumi.Input['ProviderSshArgs']]):
        pulumi.set(self, "ssh", value)

    @property
    @pulumi.getter(name="tmpDir")
    def tmp_dir(self) -> Optional[pulumi.Input[str]]:
        """
        The alternative temporary directory.
        """
        return pulumi.get(self, "tmp_dir")

    @tmp_dir.setter
    def tmp_dir(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tmp_dir", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The username for the Proxmox VE API.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input[pulumi.InputType['ProviderSshArgs']]] = None,
                 tmp_dir: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The provider type for the proxmox package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_token: The API token for the Proxmox VE API.
        :param pulumi.Input[str] endpoint: The endpoint for the Proxmox VE API.
        :param pulumi.Input[bool] insecure: Whether to skip the TLS verification step.
        :param pulumi.Input[str] otp: The one-time password for the Proxmox VE API.
        :param pulumi.Input[str] password: The password for the Proxmox VE API.
        :param pulumi.Input[pulumi.InputType['ProviderSshArgs']] ssh: The SSH configuration for the Proxmox nodes.
        :param pulumi.Input[str] tmp_dir: The alternative temporary directory.
        :param pulumi.Input[str] username: The username for the Proxmox VE API.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the proxmox package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProviderArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 otp: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input[pulumi.InputType['ProviderSshArgs']]] = None,
                 tmp_dir: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            __props__.__dict__["api_token"] = None if api_token is None else pulumi.Output.secret(api_token)
            __props__.__dict__["endpoint"] = endpoint
            __props__.__dict__["insecure"] = pulumi.Output.from_input(insecure).apply(pulumi.runtime.to_json) if insecure is not None else None
            __props__.__dict__["otp"] = otp
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            if ssh is not None and not isinstance(ssh, ProviderSshArgs):
                ssh = ssh or {}
                def _setter(key, value):
                    ssh[key] = value
                ProviderSshArgs._configure(_setter, **ssh)
            __props__.__dict__["ssh"] = pulumi.Output.from_input(ssh).apply(pulumi.runtime.to_json) if ssh is not None else None
            __props__.__dict__["tmp_dir"] = tmp_dir
            __props__.__dict__["username"] = username
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiToken", "password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'proxmoxve',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional[str]]:
        """
        The API token for the Proxmox VE API.
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        The endpoint for the Proxmox VE API.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def otp(self) -> pulumi.Output[Optional[str]]:
        """
        The one-time password for the Proxmox VE API.
        """
        warnings.warn("""The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""", DeprecationWarning)
        pulumi.log.warn("""otp is deprecated: The `otp` attribute is deprecated and will be removed in a future release. Please use the `api_token` attribute instead.""")

        return pulumi.get(self, "otp")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password for the Proxmox VE API.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="tmpDir")
    def tmp_dir(self) -> pulumi.Output[Optional[str]]:
        """
        The alternative temporary directory.
        """
        return pulumi.get(self, "tmp_dir")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        The username for the Proxmox VE API.
        """
        return pulumi.get(self, "username")

