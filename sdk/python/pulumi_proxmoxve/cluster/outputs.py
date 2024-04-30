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
    'OptionsNextId',
    'OptionsNotify',
]

@pulumi.output_type
class OptionsNextId(dict):
    def __init__(__self__, *,
                 lower: Optional[int] = None,
                 upper: Optional[int] = None):
        """
        :param int lower: The minimum number for the next free VM ID. Must be higher or equal to 100
        :param int upper: The maximum number for the next free VM ID. Must be less or equal to 999999999
        """
        if lower is not None:
            pulumi.set(__self__, "lower", lower)
        if upper is not None:
            pulumi.set(__self__, "upper", upper)

    @property
    @pulumi.getter
    def lower(self) -> Optional[int]:
        """
        The minimum number for the next free VM ID. Must be higher or equal to 100
        """
        return pulumi.get(self, "lower")

    @property
    @pulumi.getter
    def upper(self) -> Optional[int]:
        """
        The maximum number for the next free VM ID. Must be less or equal to 999999999
        """
        return pulumi.get(self, "upper")


@pulumi.output_type
class OptionsNotify(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "haFencingMode":
            suggest = "ha_fencing_mode"
        elif key == "haFencingTarget":
            suggest = "ha_fencing_target"
        elif key == "packageUpdates":
            suggest = "package_updates"
        elif key == "packageUpdatesTarget":
            suggest = "package_updates_target"
        elif key == "replicationTarget":
            suggest = "replication_target"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OptionsNotify. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OptionsNotify.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OptionsNotify.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ha_fencing_mode: Optional[str] = None,
                 ha_fencing_target: Optional[str] = None,
                 package_updates: Optional[str] = None,
                 package_updates_target: Optional[str] = None,
                 replication: Optional[str] = None,
                 replication_target: Optional[str] = None):
        """
        :param str ha_fencing_mode: Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
        :param str ha_fencing_target: Cluster-wide notification settings for the HA fencing target.
        :param str package_updates: Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
        :param str package_updates_target: Cluster-wide notification settings for the package updates target.
        :param str replication: Cluster-wide notification settings for replication. Must be `always` | `never`.
        :param str replication_target: Cluster-wide notification settings for the replication target.
        """
        if ha_fencing_mode is not None:
            pulumi.set(__self__, "ha_fencing_mode", ha_fencing_mode)
        if ha_fencing_target is not None:
            pulumi.set(__self__, "ha_fencing_target", ha_fencing_target)
        if package_updates is not None:
            pulumi.set(__self__, "package_updates", package_updates)
        if package_updates_target is not None:
            pulumi.set(__self__, "package_updates_target", package_updates_target)
        if replication is not None:
            pulumi.set(__self__, "replication", replication)
        if replication_target is not None:
            pulumi.set(__self__, "replication_target", replication_target)

    @property
    @pulumi.getter(name="haFencingMode")
    def ha_fencing_mode(self) -> Optional[str]:
        """
        Cluster-wide notification settings for the HA fencing mode. Must be `always` | `never`.
        """
        return pulumi.get(self, "ha_fencing_mode")

    @property
    @pulumi.getter(name="haFencingTarget")
    def ha_fencing_target(self) -> Optional[str]:
        """
        Cluster-wide notification settings for the HA fencing target.
        """
        return pulumi.get(self, "ha_fencing_target")

    @property
    @pulumi.getter(name="packageUpdates")
    def package_updates(self) -> Optional[str]:
        """
        Cluster-wide notification settings for package updates. Must be `auto` | `always` | `never`.
        """
        return pulumi.get(self, "package_updates")

    @property
    @pulumi.getter(name="packageUpdatesTarget")
    def package_updates_target(self) -> Optional[str]:
        """
        Cluster-wide notification settings for the package updates target.
        """
        return pulumi.get(self, "package_updates_target")

    @property
    @pulumi.getter
    def replication(self) -> Optional[str]:
        """
        Cluster-wide notification settings for replication. Must be `always` | `never`.
        """
        return pulumi.get(self, "replication")

    @property
    @pulumi.getter(name="replicationTarget")
    def replication_target(self) -> Optional[str]:
        """
        Cluster-wide notification settings for the replication target.
        """
        return pulumi.get(self, "replication_target")


