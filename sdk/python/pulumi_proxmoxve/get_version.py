# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetVersionResult',
    'AwaitableGetVersionResult',
    'get_version',
]

@pulumi.output_type
class GetVersionResult:
    """
    A collection of values returned by getVersion.
    """
    def __init__(__self__, id=None, keyboard_layout=None, release=None, repository_id=None, version=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if keyboard_layout and not isinstance(keyboard_layout, str):
            raise TypeError("Expected argument 'keyboard_layout' to be a str")
        pulumi.set(__self__, "keyboard_layout", keyboard_layout)
        if release and not isinstance(release, str):
            raise TypeError("Expected argument 'release' to be a str")
        pulumi.set(__self__, "release", release)
        if repository_id and not isinstance(repository_id, str):
            raise TypeError("Expected argument 'repository_id' to be a str")
        pulumi.set(__self__, "repository_id", repository_id)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="keyboardLayout")
    def keyboard_layout(self) -> str:
        return pulumi.get(self, "keyboard_layout")

    @property
    @pulumi.getter
    def release(self) -> str:
        return pulumi.get(self, "release")

    @property
    @pulumi.getter(name="repositoryId")
    def repository_id(self) -> str:
        return pulumi.get(self, "repository_id")

    @property
    @pulumi.getter
    def version(self) -> str:
        return pulumi.get(self, "version")


class AwaitableGetVersionResult(GetVersionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVersionResult(
            id=self.id,
            keyboard_layout=self.keyboard_layout,
            release=self.release,
            repository_id=self.repository_id,
            version=self.version)


def get_version(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVersionResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('proxmoxve:index/getVersion:getVersion', __args__, opts=opts, typ=GetVersionResult).value

    return AwaitableGetVersionResult(
        id=__ret__.id,
        keyboard_layout=__ret__.keyboard_layout,
        release=__ret__.release,
        repository_id=__ret__.repository_id,
        version=__ret__.version)
