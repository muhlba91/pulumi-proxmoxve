# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GroupAclArgs',
    'PoolMemberArgs',
    'UserAclArgs',
]

@pulumi.input_type
class GroupAclArgs:
    def __init__(__self__, *,
                 path: pulumi.Input[str],
                 role_id: pulumi.Input[str],
                 propagate: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] path: The path.
        :param pulumi.Input[str] role_id: The role identifier.
        :param pulumi.Input[bool] propagate: Whether to propagate to child paths.
        """
        GroupAclArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            path=path,
            role_id=role_id,
            propagate=propagate,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             path: pulumi.Input[str],
             role_id: pulumi.Input[str],
             propagate: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'roleId' in kwargs:
            role_id = kwargs['roleId']

        _setter("path", path)
        _setter("role_id", role_id)
        if propagate is not None:
            _setter("propagate", propagate)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The path.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Input[str]:
        """
        The role identifier.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter
    def propagate(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to propagate to child paths.
        """
        return pulumi.get(self, "propagate")

    @propagate.setter
    def propagate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "propagate", value)


@pulumi.input_type
class PoolMemberArgs:
    def __init__(__self__, *,
                 datastore_id: Optional[pulumi.Input[str]] = None,
                 id: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 vm_id: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] datastore_id: The datastore identifier.
        :param pulumi.Input[str] id: The member identifier.
        :param pulumi.Input[str] node_name: The node name.
        :param pulumi.Input[str] type: The member type.
        :param pulumi.Input[int] vm_id: The virtual machine identifier.
        """
        PoolMemberArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            datastore_id=datastore_id,
            id=id,
            node_name=node_name,
            type=type,
            vm_id=vm_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             datastore_id: Optional[pulumi.Input[str]] = None,
             id: Optional[pulumi.Input[str]] = None,
             node_name: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             vm_id: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'datastoreId' in kwargs:
            datastore_id = kwargs['datastoreId']
        if 'nodeName' in kwargs:
            node_name = kwargs['nodeName']
        if 'vmId' in kwargs:
            vm_id = kwargs['vmId']

        if datastore_id is not None:
            _setter("datastore_id", datastore_id)
        if id is not None:
            _setter("id", id)
        if node_name is not None:
            _setter("node_name", node_name)
        if type is not None:
            _setter("type", type)
        if vm_id is not None:
            _setter("vm_id", vm_id)

    @property
    @pulumi.getter(name="datastoreId")
    def datastore_id(self) -> Optional[pulumi.Input[str]]:
        """
        The datastore identifier.
        """
        return pulumi.get(self, "datastore_id")

    @datastore_id.setter
    def datastore_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "datastore_id", value)

    @property
    @pulumi.getter
    def id(self) -> Optional[pulumi.Input[str]]:
        """
        The member identifier.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "id", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        The node name.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The member type.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="vmId")
    def vm_id(self) -> Optional[pulumi.Input[int]]:
        """
        The virtual machine identifier.
        """
        return pulumi.get(self, "vm_id")

    @vm_id.setter
    def vm_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vm_id", value)


@pulumi.input_type
class UserAclArgs:
    def __init__(__self__, *,
                 path: pulumi.Input[str],
                 role_id: pulumi.Input[str],
                 propagate: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] path: The path.
        :param pulumi.Input[str] role_id: The role identifier.
        :param pulumi.Input[bool] propagate: Whether to propagate to child paths.
        """
        UserAclArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            path=path,
            role_id=role_id,
            propagate=propagate,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             path: pulumi.Input[str],
             role_id: pulumi.Input[str],
             propagate: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'roleId' in kwargs:
            role_id = kwargs['roleId']

        _setter("path", path)
        _setter("role_id", role_id)
        if propagate is not None:
            _setter("propagate", propagate)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        """
        The path.
        """
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Input[str]:
        """
        The role identifier.
        """
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_id", value)

    @property
    @pulumi.getter
    def propagate(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to propagate to child paths.
        """
        return pulumi.get(self, "propagate")

    @propagate.setter
    def propagate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "propagate", value)


