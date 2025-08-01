# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['AcmeAccountArgs', 'AcmeAccount']

@pulumi.input_type
class AcmeAccountArgs:
    def __init__(__self__, *,
                 contact: pulumi.Input[_builtins.str],
                 directory: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_hmac_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_kid: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tos: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a AcmeAccount resource.
        :param pulumi.Input[_builtins.str] contact: The contact email addresses.
        :param pulumi.Input[_builtins.str] directory: The URL of the ACME CA directory endpoint.
        :param pulumi.Input[_builtins.str] eab_hmac_key: The HMAC key for External Account Binding.
        :param pulumi.Input[_builtins.str] eab_kid: The Key Identifier for External Account Binding.
        :param pulumi.Input[_builtins.str] name: The ACME account config file name.
        :param pulumi.Input[_builtins.str] tos: The URL of CA TermsOfService - setting this indicates agreement.
        """
        pulumi.set(__self__, "contact", contact)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)
        if eab_hmac_key is not None:
            pulumi.set(__self__, "eab_hmac_key", eab_hmac_key)
        if eab_kid is not None:
            pulumi.set(__self__, "eab_kid", eab_kid)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tos is not None:
            pulumi.set(__self__, "tos", tos)

    @_builtins.property
    @pulumi.getter
    def contact(self) -> pulumi.Input[_builtins.str]:
        """
        The contact email addresses.
        """
        return pulumi.get(self, "contact")

    @contact.setter
    def contact(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "contact", value)

    @_builtins.property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of the ACME CA directory endpoint.
        """
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "directory", value)

    @_builtins.property
    @pulumi.getter(name="eabHmacKey")
    def eab_hmac_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The HMAC key for External Account Binding.
        """
        return pulumi.get(self, "eab_hmac_key")

    @eab_hmac_key.setter
    def eab_hmac_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eab_hmac_key", value)

    @_builtins.property
    @pulumi.getter(name="eabKid")
    def eab_kid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Key Identifier for External Account Binding.
        """
        return pulumi.get(self, "eab_kid")

    @eab_kid.setter
    def eab_kid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eab_kid", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ACME account config file name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tos(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of CA TermsOfService - setting this indicates agreement.
        """
        return pulumi.get(self, "tos")

    @tos.setter
    def tos(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tos", value)


@pulumi.input_type
class _AcmeAccountState:
    def __init__(__self__, *,
                 contact: Optional[pulumi.Input[_builtins.str]] = None,
                 created_at: Optional[pulumi.Input[_builtins.str]] = None,
                 directory: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_hmac_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_kid: Optional[pulumi.Input[_builtins.str]] = None,
                 location: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tos: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AcmeAccount resources.
        :param pulumi.Input[_builtins.str] contact: The contact email addresses.
        :param pulumi.Input[_builtins.str] created_at: The timestamp of the ACME account creation.
        :param pulumi.Input[_builtins.str] directory: The URL of the ACME CA directory endpoint.
        :param pulumi.Input[_builtins.str] eab_hmac_key: The HMAC key for External Account Binding.
        :param pulumi.Input[_builtins.str] eab_kid: The Key Identifier for External Account Binding.
        :param pulumi.Input[_builtins.str] location: The location of the ACME account.
        :param pulumi.Input[_builtins.str] name: The ACME account config file name.
        :param pulumi.Input[_builtins.str] tos: The URL of CA TermsOfService - setting this indicates agreement.
        """
        if contact is not None:
            pulumi.set(__self__, "contact", contact)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)
        if eab_hmac_key is not None:
            pulumi.set(__self__, "eab_hmac_key", eab_hmac_key)
        if eab_kid is not None:
            pulumi.set(__self__, "eab_kid", eab_kid)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tos is not None:
            pulumi.set(__self__, "tos", tos)

    @_builtins.property
    @pulumi.getter
    def contact(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The contact email addresses.
        """
        return pulumi.get(self, "contact")

    @contact.setter
    def contact(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "contact", value)

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The timestamp of the ACME account creation.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_at", value)

    @_builtins.property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of the ACME CA directory endpoint.
        """
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "directory", value)

    @_builtins.property
    @pulumi.getter(name="eabHmacKey")
    def eab_hmac_key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The HMAC key for External Account Binding.
        """
        return pulumi.get(self, "eab_hmac_key")

    @eab_hmac_key.setter
    def eab_hmac_key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eab_hmac_key", value)

    @_builtins.property
    @pulumi.getter(name="eabKid")
    def eab_kid(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Key Identifier for External Account Binding.
        """
        return pulumi.get(self, "eab_kid")

    @eab_kid.setter
    def eab_kid(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "eab_kid", value)

    @_builtins.property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The location of the ACME account.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "location", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The ACME account config file name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def tos(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The URL of CA TermsOfService - setting this indicates agreement.
        """
        return pulumi.get(self, "tos")

    @tos.setter
    def tos(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "tos", value)


@pulumi.type_token("proxmoxve:index/acmeAccount:AcmeAccount")
class AcmeAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact: Optional[pulumi.Input[_builtins.str]] = None,
                 directory: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_hmac_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_kid: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tos: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an ACME account in a Proxmox VE cluster.

        > This resource requires `root@pam` authentication.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.AcmeAccount("example",
            contact="example@email.com",
            directory="https://acme-staging-v02.api.letsencrypt.org/directory",
            tos="https://letsencrypt.org/documents/LE-SA-v1.3-September-21-2022.pdf")
        ```

        ## Import

        #!/usr/bin/env sh

        ACME accounts can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:index/acmeAccount:AcmeAccount example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] contact: The contact email addresses.
        :param pulumi.Input[_builtins.str] directory: The URL of the ACME CA directory endpoint.
        :param pulumi.Input[_builtins.str] eab_hmac_key: The HMAC key for External Account Binding.
        :param pulumi.Input[_builtins.str] eab_kid: The Key Identifier for External Account Binding.
        :param pulumi.Input[_builtins.str] name: The ACME account config file name.
        :param pulumi.Input[_builtins.str] tos: The URL of CA TermsOfService - setting this indicates agreement.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AcmeAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an ACME account in a Proxmox VE cluster.

        > This resource requires `root@pam` authentication.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.AcmeAccount("example",
            contact="example@email.com",
            directory="https://acme-staging-v02.api.letsencrypt.org/directory",
            tos="https://letsencrypt.org/documents/LE-SA-v1.3-September-21-2022.pdf")
        ```

        ## Import

        #!/usr/bin/env sh

        ACME accounts can be imported using their name, e.g.:

        ```sh
        $ pulumi import proxmoxve:index/acmeAccount:AcmeAccount example example
        ```

        :param str resource_name: The name of the resource.
        :param AcmeAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AcmeAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact: Optional[pulumi.Input[_builtins.str]] = None,
                 directory: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_hmac_key: Optional[pulumi.Input[_builtins.str]] = None,
                 eab_kid: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 tos: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AcmeAccountArgs.__new__(AcmeAccountArgs)

            if contact is None and not opts.urn:
                raise TypeError("Missing required property 'contact'")
            __props__.__dict__["contact"] = contact
            __props__.__dict__["directory"] = directory
            __props__.__dict__["eab_hmac_key"] = eab_hmac_key
            __props__.__dict__["eab_kid"] = eab_kid
            __props__.__dict__["name"] = name
            __props__.__dict__["tos"] = tos
            __props__.__dict__["created_at"] = None
            __props__.__dict__["location"] = None
        super(AcmeAccount, __self__).__init__(
            'proxmoxve:index/acmeAccount:AcmeAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact: Optional[pulumi.Input[_builtins.str]] = None,
            created_at: Optional[pulumi.Input[_builtins.str]] = None,
            directory: Optional[pulumi.Input[_builtins.str]] = None,
            eab_hmac_key: Optional[pulumi.Input[_builtins.str]] = None,
            eab_kid: Optional[pulumi.Input[_builtins.str]] = None,
            location: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            tos: Optional[pulumi.Input[_builtins.str]] = None) -> 'AcmeAccount':
        """
        Get an existing AcmeAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] contact: The contact email addresses.
        :param pulumi.Input[_builtins.str] created_at: The timestamp of the ACME account creation.
        :param pulumi.Input[_builtins.str] directory: The URL of the ACME CA directory endpoint.
        :param pulumi.Input[_builtins.str] eab_hmac_key: The HMAC key for External Account Binding.
        :param pulumi.Input[_builtins.str] eab_kid: The Key Identifier for External Account Binding.
        :param pulumi.Input[_builtins.str] location: The location of the ACME account.
        :param pulumi.Input[_builtins.str] name: The ACME account config file name.
        :param pulumi.Input[_builtins.str] tos: The URL of CA TermsOfService - setting this indicates agreement.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AcmeAccountState.__new__(_AcmeAccountState)

        __props__.__dict__["contact"] = contact
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["directory"] = directory
        __props__.__dict__["eab_hmac_key"] = eab_hmac_key
        __props__.__dict__["eab_kid"] = eab_kid
        __props__.__dict__["location"] = location
        __props__.__dict__["name"] = name
        __props__.__dict__["tos"] = tos
        return AcmeAccount(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def contact(self) -> pulumi.Output[_builtins.str]:
        """
        The contact email addresses.
        """
        return pulumi.get(self, "contact")

    @_builtins.property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[_builtins.str]:
        """
        The timestamp of the ACME account creation.
        """
        return pulumi.get(self, "created_at")

    @_builtins.property
    @pulumi.getter
    def directory(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The URL of the ACME CA directory endpoint.
        """
        return pulumi.get(self, "directory")

    @_builtins.property
    @pulumi.getter(name="eabHmacKey")
    def eab_hmac_key(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The HMAC key for External Account Binding.
        """
        return pulumi.get(self, "eab_hmac_key")

    @_builtins.property
    @pulumi.getter(name="eabKid")
    def eab_kid(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The Key Identifier for External Account Binding.
        """
        return pulumi.get(self, "eab_kid")

    @_builtins.property
    @pulumi.getter
    def location(self) -> pulumi.Output[_builtins.str]:
        """
        The location of the ACME account.
        """
        return pulumi.get(self, "location")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The ACME account config file name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def tos(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The URL of CA TermsOfService - setting this indicates agreement.
        """
        return pulumi.get(self, "tos")

