

# AssetReportRefreshRequestOptions

An optional object to filter `/asset_report/refresh` results. If provided, cannot be `null`. If not specified, the `options` from the original call to `/asset_report/create` will be used.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientReportId** | **String** | Client-generated identifier, which can be used by lenders to track loan applications. |  [optional] |
|**webhook** | **String** | URL to which Plaid will send Assets webhooks, for example when the requested Asset Report is ready. |  [optional] |
|**user** | **AssetReportUser** |  |  [optional] |



