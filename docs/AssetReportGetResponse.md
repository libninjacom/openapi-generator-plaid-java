

# AssetReportGetResponse

AssetReportGetResponse defines the response schema for `/asset_report/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**report** | **AssetReport** |  |  |
|**warnings** | **List&lt;Warning&gt;** | If the Asset Report generation was successful but identity information cannot be returned, this array will contain information about the errors causing identity information to be missing |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



