# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TimeArgs', 'Time']

@pulumi.input_type
class TimeArgs:
    def __init__(__self__, *,
                 node_name: pulumi.Input[str],
                 time_zone: pulumi.Input[str]):
        """
        The set of arguments for constructing a Time resource.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[str] time_zone: The node's time zone.
        """
        pulumi.set(__self__, "node_name", node_name)
        pulumi.set(__self__, "time_zone", time_zone)

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
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Input[str]:
        """
        The node's time zone.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "time_zone", value)


@pulumi.input_type
class _TimeState:
    def __init__(__self__, *,
                 local_time: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 utc_time: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Time resources.
        :param pulumi.Input[str] local_time: The node's local time.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[str] time_zone: The node's time zone.
        :param pulumi.Input[str] utc_time: The node's local time formatted as UTC.
        """
        if local_time is not None:
            pulumi.set(__self__, "local_time", local_time)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)
        if utc_time is not None:
            pulumi.set(__self__, "utc_time", utc_time)

    @property
    @pulumi.getter(name="localTime")
    def local_time(self) -> Optional[pulumi.Input[str]]:
        """
        The node's local time.
        """
        return pulumi.get(self, "local_time")

    @local_time.setter
    def local_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "local_time", value)

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
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The node's time zone.
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)

    @property
    @pulumi.getter(name="utcTime")
    def utc_time(self) -> Optional[pulumi.Input[str]]:
        """
        The node's local time formatted as UTC.
        """
        return pulumi.get(self, "utc_time")

    @utc_time.setter
    def utc_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "utc_time", value)


class Time(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages the time for a specific node.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        first_node_time = proxmoxve.Time("firstNodeTime",
            node_name="first-node",
            time_zone="UTC")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Instances can be imported using the `node_name`, e.g.,

        bash

        ```sh
        $ pulumi import proxmoxve:index/time:Time first_node first-node
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[str] time_zone: The node's time zone.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TimeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the time for a specific node.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        first_node_time = proxmoxve.Time("firstNodeTime",
            node_name="first-node",
            time_zone="UTC")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Instances can be imported using the `node_name`, e.g.,

        bash

        ```sh
        $ pulumi import proxmoxve:index/time:Time first_node first-node
        ```

        :param str resource_name: The name of the resource.
        :param TimeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TimeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TimeArgs.__new__(TimeArgs)

            if node_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_name'")
            __props__.__dict__["node_name"] = node_name
            if time_zone is None and not opts.urn:
                raise TypeError("Missing required property 'time_zone'")
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["local_time"] = None
            __props__.__dict__["utc_time"] = None
        super(Time, __self__).__init__(
            'proxmoxve:index/time:Time',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            local_time: Optional[pulumi.Input[str]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            time_zone: Optional[pulumi.Input[str]] = None,
            utc_time: Optional[pulumi.Input[str]] = None) -> 'Time':
        """
        Get an existing Time resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] local_time: The node's local time.
        :param pulumi.Input[str] node_name: A node name.
        :param pulumi.Input[str] time_zone: The node's time zone.
        :param pulumi.Input[str] utc_time: The node's local time formatted as UTC.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TimeState.__new__(_TimeState)

        __props__.__dict__["local_time"] = local_time
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["time_zone"] = time_zone
        __props__.__dict__["utc_time"] = utc_time
        return Time(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="localTime")
    def local_time(self) -> pulumi.Output[str]:
        """
        The node's local time.
        """
        return pulumi.get(self, "local_time")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        A node name.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        The node's time zone.
        """
        return pulumi.get(self, "time_zone")

    @property
    @pulumi.getter(name="utcTime")
    def utc_time(self) -> pulumi.Output[str]:
        """
        The node's local time formatted as UTC.
        """
        return pulumi.get(self, "utc_time")

