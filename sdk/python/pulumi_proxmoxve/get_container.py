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

__all__ = [
    'GetContainerResult',
    'AwaitableGetContainerResult',
    'get_container',
    'get_container_output',
]

@pulumi.output_type
class GetContainerResult:
    """
    A collection of values returned by getContainer.
    """
    def __init__(__self__, id=None, name=None, node_name=None, status=None, tags=None, template=None, vm_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_name and not isinstance(node_name, str):
            raise TypeError("Expected argument 'node_name' to be a str")
        pulumi.set(__self__, "node_name", node_name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if template and not isinstance(template, bool):
            raise TypeError("Expected argument 'template' to be a bool")
        pulumi.set(__self__, "template", template)
        if vm_id and not isinstance(vm_id, int):
            raise TypeError("Expected argument 'vm_id' to be a int")
        pulumi.set(__self__, "vm_id", vm_id)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        The container name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> _builtins.str:
        return pulumi.get(self, "node_name")

    @_builtins.property
    @pulumi.getter
    def status(self) -> Optional[_builtins.str]:
        """
        Status of the container
        """
        return pulumi.get(self, "status")

    @_builtins.property
    @pulumi.getter
    def tags(self) -> Sequence[_builtins.str]:
        """
        A list of tags of the container.
        """
        return pulumi.get(self, "tags")

    @_builtins.property
    @pulumi.getter
    def template(self) -> Optional[_builtins.bool]:
        """
        Is container a template (true) or a regular container (false)
        """
        return pulumi.get(self, "template")

    @_builtins.property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> _builtins.int:
        return pulumi.get(self, "vm_id")


class AwaitableGetContainerResult(GetContainerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContainerResult(
            id=self.id,
            name=self.name,
            node_name=self.node_name,
            status=self.status,
            tags=self.tags,
            template=self.template,
            vm_id=self.vm_id)


def get_container(node_name: Optional[_builtins.str] = None,
                  status: Optional[_builtins.str] = None,
                  template: Optional[_builtins.bool] = None,
                  vm_id: Optional[_builtins.int] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContainerResult:
    """
    Retrieves information about a specific Container.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    test_container = proxmoxve.get_container(node_name="test",
        vm_id=100)
    ```


    :param _builtins.str node_name: The node name.
    :param _builtins.str status: Status of the container
    :param _builtins.bool template: Is container a template (true) or a regular container (false)
    :param _builtins.int vm_id: The container identifier.
    """
    __args__ = dict()
    __args__['nodeName'] = node_name
    __args__['status'] = status
    __args__['template'] = template
    __args__['vmId'] = vm_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:index/getContainer:getContainer', __args__, opts=opts, typ=GetContainerResult).value

    return AwaitableGetContainerResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        node_name=pulumi.get(__ret__, 'node_name'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        template=pulumi.get(__ret__, 'template'),
        vm_id=pulumi.get(__ret__, 'vm_id'))
def get_container_output(node_name: Optional[pulumi.Input[_builtins.str]] = None,
                         status: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                         template: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                         vm_id: Optional[pulumi.Input[_builtins.int]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetContainerResult]:
    """
    Retrieves information about a specific Container.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_proxmoxve as proxmoxve

    test_container = proxmoxve.get_container(node_name="test",
        vm_id=100)
    ```


    :param _builtins.str node_name: The node name.
    :param _builtins.str status: Status of the container
    :param _builtins.bool template: Is container a template (true) or a regular container (false)
    :param _builtins.int vm_id: The container identifier.
    """
    __args__ = dict()
    __args__['nodeName'] = node_name
    __args__['status'] = status
    __args__['template'] = template
    __args__['vmId'] = vm_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('proxmoxve:index/getContainer:getContainer', __args__, opts=opts, typ=GetContainerResult)
    return __ret__.apply(lambda __response__: GetContainerResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        node_name=pulumi.get(__response__, 'node_name'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags'),
        template=pulumi.get(__response__, 'template'),
        vm_id=pulumi.get(__response__, 'vm_id')))
