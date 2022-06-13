

# AssetsErrorWebhook

Fired when Asset Report generation has failed. The resulting `error` will have an `error_type` of `ASSET_REPORT_ERROR`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ASSETS&#x60; |  |
|**webhookCode** | **String** | &#x60;ERROR&#x60; |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  |
|**assetReportId** | **String** | The ID associated with the Asset Report. |  |



