

# Warning

It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**warningType** | **String** | The warning type, which will always be &#x60;ASSET_REPORT_WARNING&#x60; |  |
|**warningCode** | [**WarningCodeEnum**](#WarningCodeEnum) | The warning code identifies a specific kind of warning. Currently, the only possible warning code is &#x60;OWNERS_UNAVAILABLE&#x60;, which indicates that account-owner information is not available. |  |
|**cause** | **Cause** |  |  |



## Enum: WarningCodeEnum

| Name | Value |
|---- | -----|
| OWNERS_UNAVAILABLE | &quot;OWNERS_UNAVAILABLE&quot; |



