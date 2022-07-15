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
    'FileSourceFile',
    'FileSourceRaw',
]

@pulumi.output_type
class FileSourceFile(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "fileName":
            suggest = "file_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSourceFile. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSourceFile.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSourceFile.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 path: str,
                 changed: Optional[bool] = None,
                 checksum: Optional[str] = None,
                 file_name: Optional[str] = None,
                 insecure: Optional[bool] = None):
        pulumi.set(__self__, "path", path)
        if changed is not None:
            pulumi.set(__self__, "changed", changed)
        if checksum is not None:
            pulumi.set(__self__, "checksum", checksum)
        if file_name is not None:
            pulumi.set(__self__, "file_name", file_name)
        if insecure is not None:
            pulumi.set(__self__, "insecure", insecure)

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def changed(self) -> Optional[bool]:
        return pulumi.get(self, "changed")

    @property
    @pulumi.getter
    def checksum(self) -> Optional[str]:
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> Optional[str]:
        return pulumi.get(self, "file_name")

    @property
    @pulumi.getter
    def insecure(self) -> Optional[bool]:
        return pulumi.get(self, "insecure")


@pulumi.output_type
class FileSourceRaw(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "fileName":
            suggest = "file_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSourceRaw. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSourceRaw.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSourceRaw.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 data: str,
                 file_name: str,
                 resize: Optional[int] = None):
        pulumi.set(__self__, "data", data)
        pulumi.set(__self__, "file_name", file_name)
        if resize is not None:
            pulumi.set(__self__, "resize", resize)

    @property
    @pulumi.getter
    def data(self) -> str:
        return pulumi.get(self, "data")

    @property
    @pulumi.getter(name="fileName")
    def file_name(self) -> str:
        return pulumi.get(self, "file_name")

    @property
    @pulumi.getter
    def resize(self) -> Optional[int]:
        return pulumi.get(self, "resize")


