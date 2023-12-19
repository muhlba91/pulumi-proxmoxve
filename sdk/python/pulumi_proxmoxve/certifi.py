# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CertifiArgs', 'Certifi']

@pulumi.input_type
class CertifiArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 node_name: pulumi.Input[str],
                 private_key: pulumi.Input[str],
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 overwrite: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Certifi resource.
        :param pulumi.Input[str] certificate: The PEM encoded certificate.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[str] private_key: The PEM encoded private key.
        :param pulumi.Input[str] certificate_chain: The PEM encoded certificate chain.
        :param pulumi.Input[bool] overwrite: Whether to overwrite an existing certificate
        """
        pulumi.set(__self__, "certificate", certificate)
        pulumi.set(__self__, "node_name", node_name)
        pulumi.set(__self__, "private_key", private_key)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if overwrite is not None:
            pulumi.set(__self__, "overwrite", overwrite)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The PEM encoded certificate.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Input[str]:
        """
        A node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Input[str]:
        """
        The PEM encoded private key.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM encoded certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter
    def overwrite(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to overwrite an existing certificate
        """
        return pulumi.get(self, "overwrite")

    @overwrite.setter
    def overwrite(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "overwrite", value)


@pulumi.input_type
class _CertifiState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 expiration_date: Optional[pulumi.Input[str]] = None,
                 file_name: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 overwrite: Optional[pulumi.Input[bool]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 public_key_size: Optional[pulumi.Input[int]] = None,
                 public_key_type: Optional[pulumi.Input[str]] = None,
                 ssl_fingerprint: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 subject: Optional[pulumi.Input[str]] = None,
                 subject_alternative_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Certifi resources.
        :param pulumi.Input[str] certificate: The PEM encoded certificate.
        :param pulumi.Input[str] certificate_chain: The PEM encoded certificate chain.
        :param pulumi.Input[str] expiration_date: The expiration date (RFC 3339).
        :param pulumi.Input[str] file_name: The file name.
        :param pulumi.Input[str] issuer: The issuer.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[bool] overwrite: Whether to overwrite an existing certificate
        :param pulumi.Input[str] private_key: The PEM encoded private key.
        :param pulumi.Input[int] public_key_size: The public key size.
        :param pulumi.Input[str] public_key_type: The public key type.
        :param pulumi.Input[str] ssl_fingerprint: The SSL fingerprint.
        :param pulumi.Input[str] start_date: The start date (RFC 3339).
        :param pulumi.Input[str] subject: The subject.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subject_alternative_names: The subject alternative names.
        """
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if certificate_chain is not None:
            pulumi.set(__self__, "certificate_chain", certificate_chain)
        if expiration_date is not None:
            pulumi.set(__self__, "expiration_date", expiration_date)
        if file_name is not None:
            pulumi.set(__self__, "file_name", file_name)
        if issuer is not None:
            pulumi.set(__self__, "issuer", issuer)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if overwrite is not None:
            pulumi.set(__self__, "overwrite", overwrite)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if public_key_size is not None:
            pulumi.set(__self__, "public_key_size", public_key_size)
        if public_key_type is not None:
            pulumi.set(__self__, "public_key_type", public_key_type)
        if ssl_fingerprint is not None:
            pulumi.set(__self__, "ssl_fingerprint", ssl_fingerprint)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if subject is not None:
            pulumi.set(__self__, "subject", subject)
        if subject_alternative_names is not None:
            pulumi.set(__self__, "subject_alternative_names", subject_alternative_names)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM encoded certificate.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM encoded certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @certificate_chain.setter
    def certificate_chain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_chain", value)

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> Optional[pulumi.Input[str]]:
        """
        The expiration date (RFC 3339).
        """
        return pulumi.get(self, "expiration_date")

    @expiration_date.setter
    def expiration_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expiration_date", value)

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> Optional[pulumi.Input[str]]:
        """
        The file name.
        """
        return pulumi.get(self, "file_name")

    @file_name.setter
    def file_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_name", value)

    @property
    @pulumi.getter
    def issuer(self) -> Optional[pulumi.Input[str]]:
        """
        The issuer.
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        A node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def overwrite(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to overwrite an existing certificate
        """
        return pulumi.get(self, "overwrite")

    @overwrite.setter
    def overwrite(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "overwrite", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The PEM encoded private key.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="publicKeySize")
    def public_key_size(self) -> Optional[pulumi.Input[int]]:
        """
        The public key size.
        """
        return pulumi.get(self, "public_key_size")

    @public_key_size.setter
    def public_key_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "public_key_size", value)

    @property
    @pulumi.getter(name="publicKeyType")
    def public_key_type(self) -> Optional[pulumi.Input[str]]:
        """
        The public key type.
        """
        return pulumi.get(self, "public_key_type")

    @public_key_type.setter
    def public_key_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key_type", value)

    @property
    @pulumi.getter(name="sslFingerprint")
    def ssl_fingerprint(self) -> Optional[pulumi.Input[str]]:
        """
        The SSL fingerprint.
        """
        return pulumi.get(self, "ssl_fingerprint")

    @ssl_fingerprint.setter
    def ssl_fingerprint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssl_fingerprint", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        The start date (RFC 3339).
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def subject(self) -> Optional[pulumi.Input[str]]:
        """
        The subject.
        """
        return pulumi.get(self, "subject")

    @subject.setter
    def subject(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject", value)

    @property
    @pulumi.getter(name="subjectAlternativeNames")
    def subject_alternative_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The subject alternative names.
        """
        return pulumi.get(self, "subject_alternative_names")

    @subject_alternative_names.setter
    def subject_alternative_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subject_alternative_names", value)


class Certifi(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 overwrite: Optional[pulumi.Input[bool]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages the custom SSL/TLS certificate for a specific node.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The PEM encoded certificate.
        :param pulumi.Input[str] certificate_chain: The PEM encoded certificate chain.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[bool] overwrite: Whether to overwrite an existing certificate
        :param pulumi.Input[str] private_key: The PEM encoded private key.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertifiArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the custom SSL/TLS certificate for a specific node.

        :param str resource_name: The name of the resource.
        :param CertifiArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertifiArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 certificate_chain: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 overwrite: Optional[pulumi.Input[bool]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertifiArgs.__new__(CertifiArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["certificate_chain"] = certificate_chain
            if node_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_name'")
            __props__.__dict__["node_name"] = node_name
            __props__.__dict__["overwrite"] = overwrite
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            __props__.__dict__["expiration_date"] = None
            __props__.__dict__["file_name"] = None
            __props__.__dict__["issuer"] = None
            __props__.__dict__["public_key_size"] = None
            __props__.__dict__["public_key_type"] = None
            __props__.__dict__["ssl_fingerprint"] = None
            __props__.__dict__["start_date"] = None
            __props__.__dict__["subject"] = None
            __props__.__dict__["subject_alternative_names"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Certifi, __self__).__init__(
            'proxmoxve:index/certifi:Certifi',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            certificate_chain: Optional[pulumi.Input[str]] = None,
            expiration_date: Optional[pulumi.Input[str]] = None,
            file_name: Optional[pulumi.Input[str]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            overwrite: Optional[pulumi.Input[bool]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            public_key_size: Optional[pulumi.Input[int]] = None,
            public_key_type: Optional[pulumi.Input[str]] = None,
            ssl_fingerprint: Optional[pulumi.Input[str]] = None,
            start_date: Optional[pulumi.Input[str]] = None,
            subject: Optional[pulumi.Input[str]] = None,
            subject_alternative_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Certifi':
        """
        Get an existing Certifi resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The PEM encoded certificate.
        :param pulumi.Input[str] certificate_chain: The PEM encoded certificate chain.
        :param pulumi.Input[str] expiration_date: The expiration date (RFC 3339).
        :param pulumi.Input[str] file_name: The file name.
        :param pulumi.Input[str] issuer: The issuer.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[bool] overwrite: Whether to overwrite an existing certificate
        :param pulumi.Input[str] private_key: The PEM encoded private key.
        :param pulumi.Input[int] public_key_size: The public key size.
        :param pulumi.Input[str] public_key_type: The public key type.
        :param pulumi.Input[str] ssl_fingerprint: The SSL fingerprint.
        :param pulumi.Input[str] start_date: The start date (RFC 3339).
        :param pulumi.Input[str] subject: The subject.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subject_alternative_names: The subject alternative names.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertifiState.__new__(_CertifiState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["certificate_chain"] = certificate_chain
        __props__.__dict__["expiration_date"] = expiration_date
        __props__.__dict__["file_name"] = file_name
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["overwrite"] = overwrite
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["public_key_size"] = public_key_size
        __props__.__dict__["public_key_type"] = public_key_type
        __props__.__dict__["ssl_fingerprint"] = ssl_fingerprint
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["subject"] = subject
        __props__.__dict__["subject_alternative_names"] = subject_alternative_names
        return Certifi(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The PEM encoded certificate.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="certificateChain")
    def certificate_chain(self) -> pulumi.Output[Optional[str]]:
        """
        The PEM encoded certificate chain.
        """
        return pulumi.get(self, "certificate_chain")

    @property
    @pulumi.getter(name="expirationDate")
    def expiration_date(self) -> pulumi.Output[str]:
        """
        The expiration date (RFC 3339).
        """
        return pulumi.get(self, "expiration_date")

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> pulumi.Output[str]:
        """
        The file name.
        """
        return pulumi.get(self, "file_name")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        """
        The issuer.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        A node name.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def overwrite(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to overwrite an existing certificate
        """
        return pulumi.get(self, "overwrite")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        The PEM encoded private key.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="publicKeySize")
    def public_key_size(self) -> pulumi.Output[int]:
        """
        The public key size.
        """
        return pulumi.get(self, "public_key_size")

    @property
    @pulumi.getter(name="publicKeyType")
    def public_key_type(self) -> pulumi.Output[str]:
        """
        The public key type.
        """
        return pulumi.get(self, "public_key_type")

    @property
    @pulumi.getter(name="sslFingerprint")
    def ssl_fingerprint(self) -> pulumi.Output[str]:
        """
        The SSL fingerprint.
        """
        return pulumi.get(self, "ssl_fingerprint")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[str]:
        """
        The start date (RFC 3339).
        """
        return pulumi.get(self, "start_date")

    @property
    @pulumi.getter
    def subject(self) -> pulumi.Output[str]:
        """
        The subject.
        """
        return pulumi.get(self, "subject")

    @property
    @pulumi.getter(name="subjectAlternativeNames")
    def subject_alternative_names(self) -> pulumi.Output[Sequence[str]]:
        """
        The subject alternative names.
        """
        return pulumi.get(self, "subject_alternative_names")

