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
from .. import _utilities

__all__ = ['RepositoryArgs', 'Repository']

@pulumi.input_type
class RepositoryArgs:
    def __init__(__self__, *,
                 file_path: pulumi.Input[_builtins.str],
                 index: pulumi.Input[_builtins.int],
                 node: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a Repository resource.
        :param pulumi.Input[_builtins.str] file_path: The absolute path of the source list file that contains this repository.
        :param pulumi.Input[_builtins.int] index: The index within the defining source list file.
        :param pulumi.Input[_builtins.str] node: The name of the target Proxmox VE node.
        :param pulumi.Input[_builtins.bool] enabled: Indicates the activation status.
        """
        pulumi.set(__self__, "file_path", file_path)
        pulumi.set(__self__, "index", index)
        pulumi.set(__self__, "node", node)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> pulumi.Input[_builtins.str]:
        """
        The absolute path of the source list file that contains this repository.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter
    def index(self) -> pulumi.Input[_builtins.int]:
        """
        The index within the defining source list file.
        """
        return pulumi.get(self, "index")

    @index.setter
    def index(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "index", value)

    @_builtins.property
    @pulumi.getter
    def node(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the target Proxmox VE node.
        """
        return pulumi.get(self, "node")

    @node.setter
    def node(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "node", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates the activation status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)


@pulumi.input_type
class _RepositoryState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 components: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 file_type: Optional[pulumi.Input[_builtins.str]] = None,
                 index: Optional[pulumi.Input[_builtins.int]] = None,
                 node: Optional[pulumi.Input[_builtins.str]] = None,
                 package_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 suites: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 uris: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering Repository resources.
        :param pulumi.Input[_builtins.str] comment: The associated comment.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] components: The list of components.
        :param pulumi.Input[_builtins.bool] enabled: Indicates the activation status.
        :param pulumi.Input[_builtins.str] file_path: The absolute path of the source list file that contains this repository.
        :param pulumi.Input[_builtins.str] file_type: The format of the defining source list file.
        :param pulumi.Input[_builtins.int] index: The index within the defining source list file.
        :param pulumi.Input[_builtins.str] node: The name of the target Proxmox VE node.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] package_types: The list of package types.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] suites: The list of package distributions.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] uris: The list of repository URIs.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if components is not None:
            pulumi.set(__self__, "components", components)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if file_path is not None:
            pulumi.set(__self__, "file_path", file_path)
        if file_type is not None:
            pulumi.set(__self__, "file_type", file_type)
        if index is not None:
            pulumi.set(__self__, "index", index)
        if node is not None:
            pulumi.set(__self__, "node", node)
        if package_types is not None:
            pulumi.set(__self__, "package_types", package_types)
        if suites is not None:
            pulumi.set(__self__, "suites", suites)
        if uris is not None:
            pulumi.set(__self__, "uris", uris)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The associated comment.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def components(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of components.
        """
        return pulumi.get(self, "components")

    @components.setter
    def components(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "components", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates the activation status.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The absolute path of the source list file that contains this repository.
        """
        return pulumi.get(self, "file_path")

    @file_path.setter
    def file_path(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_path", value)

    @_builtins.property
    @pulumi.getter(name="fileType")
    def file_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The format of the defining source list file.
        """
        return pulumi.get(self, "file_type")

    @file_type.setter
    def file_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "file_type", value)

    @_builtins.property
    @pulumi.getter
    def index(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The index within the defining source list file.
        """
        return pulumi.get(self, "index")

    @index.setter
    def index(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "index", value)

    @_builtins.property
    @pulumi.getter
    def node(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the target Proxmox VE node.
        """
        return pulumi.get(self, "node")

    @node.setter
    def node(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "node", value)

    @_builtins.property
    @pulumi.getter(name="packageTypes")
    def package_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of package types.
        """
        return pulumi.get(self, "package_types")

    @package_types.setter
    def package_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "package_types", value)

    @_builtins.property
    @pulumi.getter
    def suites(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of package distributions.
        """
        return pulumi.get(self, "suites")

    @suites.setter
    def suites(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "suites", value)

    @_builtins.property
    @pulumi.getter
    def uris(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The list of repository URIs.
        """
        return pulumi.get(self, "uris")

    @uris.setter
    def uris(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "uris", value)


@pulumi.type_token("proxmoxve:Apt/repository:Repository")
class Repository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 index: Optional[pulumi.Input[_builtins.int]] = None,
                 node: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages an APT repository of a Proxmox VE node.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.apt.Repository("example",
            enabled=True,
            file_path="/etc/apt/sources.list",
            index=0,
            node="pve")
        ```

        ## Import

        #!/usr/bin/env sh

        An APT repository can be imported using a comma-separated list consisting of the name of the Proxmox VE node,

        the absolute source list file path, and the index in the exact same order, e.g.:

        ```sh
        $ pulumi import proxmoxve:Apt/repository:Repository example pve,/etc/apt/sources.list,0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] enabled: Indicates the activation status.
        :param pulumi.Input[_builtins.str] file_path: The absolute path of the source list file that contains this repository.
        :param pulumi.Input[_builtins.int] index: The index within the defining source list file.
        :param pulumi.Input[_builtins.str] node: The name of the target Proxmox VE node.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an APT repository of a Proxmox VE node.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        example = proxmoxve.apt.Repository("example",
            enabled=True,
            file_path="/etc/apt/sources.list",
            index=0,
            node="pve")
        ```

        ## Import

        #!/usr/bin/env sh

        An APT repository can be imported using a comma-separated list consisting of the name of the Proxmox VE node,

        the absolute source list file path, and the index in the exact same order, e.g.:

        ```sh
        $ pulumi import proxmoxve:Apt/repository:Repository example pve,/etc/apt/sources.list,0
        ```

        :param str resource_name: The name of the resource.
        :param RepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 file_path: Optional[pulumi.Input[_builtins.str]] = None,
                 index: Optional[pulumi.Input[_builtins.int]] = None,
                 node: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepositoryArgs.__new__(RepositoryArgs)

            __props__.__dict__["enabled"] = enabled
            if file_path is None and not opts.urn:
                raise TypeError("Missing required property 'file_path'")
            __props__.__dict__["file_path"] = file_path
            if index is None and not opts.urn:
                raise TypeError("Missing required property 'index'")
            __props__.__dict__["index"] = index
            if node is None and not opts.urn:
                raise TypeError("Missing required property 'node'")
            __props__.__dict__["node"] = node
            __props__.__dict__["comment"] = None
            __props__.__dict__["components"] = None
            __props__.__dict__["file_type"] = None
            __props__.__dict__["package_types"] = None
            __props__.__dict__["suites"] = None
            __props__.__dict__["uris"] = None
        super(Repository, __self__).__init__(
            'proxmoxve:Apt/repository:Repository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            components: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            file_path: Optional[pulumi.Input[_builtins.str]] = None,
            file_type: Optional[pulumi.Input[_builtins.str]] = None,
            index: Optional[pulumi.Input[_builtins.int]] = None,
            node: Optional[pulumi.Input[_builtins.str]] = None,
            package_types: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            suites: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            uris: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'Repository':
        """
        Get an existing Repository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: The associated comment.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] components: The list of components.
        :param pulumi.Input[_builtins.bool] enabled: Indicates the activation status.
        :param pulumi.Input[_builtins.str] file_path: The absolute path of the source list file that contains this repository.
        :param pulumi.Input[_builtins.str] file_type: The format of the defining source list file.
        :param pulumi.Input[_builtins.int] index: The index within the defining source list file.
        :param pulumi.Input[_builtins.str] node: The name of the target Proxmox VE node.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] package_types: The list of package types.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] suites: The list of package distributions.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] uris: The list of repository URIs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryState.__new__(_RepositoryState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["components"] = components
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["file_path"] = file_path
        __props__.__dict__["file_type"] = file_type
        __props__.__dict__["index"] = index
        __props__.__dict__["node"] = node
        __props__.__dict__["package_types"] = package_types
        __props__.__dict__["suites"] = suites
        __props__.__dict__["uris"] = uris
        return Repository(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[_builtins.str]:
        """
        The associated comment.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def components(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of components.
        """
        return pulumi.get(self, "components")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[_builtins.bool]:
        """
        Indicates the activation status.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter(name="filePath")
    def file_path(self) -> pulumi.Output[_builtins.str]:
        """
        The absolute path of the source list file that contains this repository.
        """
        return pulumi.get(self, "file_path")

    @_builtins.property
    @pulumi.getter(name="fileType")
    def file_type(self) -> pulumi.Output[_builtins.str]:
        """
        The format of the defining source list file.
        """
        return pulumi.get(self, "file_type")

    @_builtins.property
    @pulumi.getter
    def index(self) -> pulumi.Output[_builtins.int]:
        """
        The index within the defining source list file.
        """
        return pulumi.get(self, "index")

    @_builtins.property
    @pulumi.getter
    def node(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the target Proxmox VE node.
        """
        return pulumi.get(self, "node")

    @_builtins.property
    @pulumi.getter(name="packageTypes")
    def package_types(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of package types.
        """
        return pulumi.get(self, "package_types")

    @_builtins.property
    @pulumi.getter
    def suites(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of package distributions.
        """
        return pulumi.get(self, "suites")

    @_builtins.property
    @pulumi.getter
    def uris(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        The list of repository URIs.
        """
        return pulumi.get(self, "uris")

