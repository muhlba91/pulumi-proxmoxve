# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetRepositoryResult',
    'AwaitableGetRepositoryResult',
    'get_repository',
    'get_repository_output',
]

@pulumi.output_type
class GetRepositoryResult:
    """
    A collection of values returned by getRepository.
    """
    def __init__(__self__, comment=None, components=None, enabled=None, file_path=None, file_type=None, id=None, index=None, node=None, package_types=None, suites=None, uris=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if components and not isinstance(components, list):
            raise TypeError("Expected argument 'components' to be a list")
        pulumi.set(__self__, "components", components)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if file_path and not isinstance(file_path, str):
            raise TypeError("Expected argument 'file_path' to be a str")
        pulumi.set(__self__, "file_path", file_path)
        if file_type and not isinstance(file_type, str):
            raise TypeError("Expected argument 'file_type' to be a str")
        pulumi.set(__self__, "file_type", file_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if index and not isinstance(index, int):
            raise TypeError("Expected argument 'index' to be a int")
        pulumi.set(__self__, "index", index)
        if node and not isinstance(node, str):
            raise TypeError("Expected argument 'node' to be a str")
        pulumi.set(__self__, "node", node)
        if package_types and not isinstance(package_types, list):
            raise TypeError("Expected argument 'package_types' to be a list")
        pulumi.set(__self__, "package_types", package_types)
        if suites and not isinstance(suites, list):
            raise TypeError("Expected argument 'suites' to be a list")
        pulumi.set(__self__, "suites", suites)
        if uris and not isinstance(uris, list):
            raise TypeError("Expected argument 'uris' to be a list")
        pulumi.set(__self__, "uris", uris)

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        The associated comment.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def components(self) -> Sequence[str]:
        """
        The list of components.
        """
        return pulumi.get(self, "components")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Indicates the activation status.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="filePath")
    def file_path(self) -> str:
        """
        The absolute path of the source list file that contains this repository.
        """
        return pulumi.get(self, "file_path")

    @property
    @pulumi.getter(name="fileType")
    def file_type(self) -> str:
        """
        The format of the defining source list file.
        """
        return pulumi.get(self, "file_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique identifier of this APT repository data source.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def index(self) -> int:
        """
        The index within the defining source list file.
        """
        return pulumi.get(self, "index")

    @property
    @pulumi.getter
    def node(self) -> str:
        """
        The name of the target Proxmox VE node.
        """
        return pulumi.get(self, "node")

    @property
    @pulumi.getter(name="packageTypes")
    def package_types(self) -> Sequence[str]:
        """
        The list of package types.
        """
        return pulumi.get(self, "package_types")

    @property
    @pulumi.getter
    def suites(self) -> Sequence[str]:
        """
        The list of package distributions.
        """
        return pulumi.get(self, "suites")

    @property
    @pulumi.getter
    def uris(self) -> Sequence[str]:
        """
        The list of repository URIs.
        """
        return pulumi.get(self, "uris")


class AwaitableGetRepositoryResult(GetRepositoryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryResult(
            comment=self.comment,
            components=self.components,
            enabled=self.enabled,
            file_path=self.file_path,
            file_type=self.file_type,
            id=self.id,
            index=self.index,
            node=self.node,
            package_types=self.package_types,
            suites=self.suites,
            uris=self.uris)


def get_repository(file_path: Optional[str] = None,
                   index: Optional[int] = None,
                   node: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryResult:
    """
    Retrieves an APT repository from a Proxmox VE cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    example = proxmoxve.Apt.get_repository(file_path="/etc/apt/sources.list",
        index=0,
        node="pve")
    pulumi.export("proxmoxVirtualEnvironmentAptRepository", example)
    ```


    :param str file_path: The absolute path of the source list file that contains this repository.
    :param int index: The index within the defining source list file.
    :param str node: The name of the target Proxmox VE node.
    """
    __args__ = dict()
    __args__['filePath'] = file_path
    __args__['index'] = index
    __args__['node'] = node
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:Apt/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult).value

    return AwaitableGetRepositoryResult(
        comment=pulumi.get(__ret__, 'comment'),
        components=pulumi.get(__ret__, 'components'),
        enabled=pulumi.get(__ret__, 'enabled'),
        file_path=pulumi.get(__ret__, 'file_path'),
        file_type=pulumi.get(__ret__, 'file_type'),
        id=pulumi.get(__ret__, 'id'),
        index=pulumi.get(__ret__, 'index'),
        node=pulumi.get(__ret__, 'node'),
        package_types=pulumi.get(__ret__, 'package_types'),
        suites=pulumi.get(__ret__, 'suites'),
        uris=pulumi.get(__ret__, 'uris'))


@_utilities.lift_output_func(get_repository)
def get_repository_output(file_path: Optional[pulumi.Input[str]] = None,
                          index: Optional[pulumi.Input[int]] = None,
                          node: Optional[pulumi.Input[str]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRepositoryResult]:
    """
    Retrieves an APT repository from a Proxmox VE cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    example = proxmoxve.Apt.get_repository(file_path="/etc/apt/sources.list",
        index=0,
        node="pve")
    pulumi.export("proxmoxVirtualEnvironmentAptRepository", example)
    ```


    :param str file_path: The absolute path of the source list file that contains this repository.
    :param int index: The index within the defining source list file.
    :param str node: The name of the target Proxmox VE node.
    """
    ...
