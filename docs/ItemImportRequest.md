

# ItemImportRequest

ItemImportRequest defines the request schema for `/item/import`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**products** | **List&lt;Products&gt;** | Array of product strings |  |
|**userAuth** | [**ItemImportRequestUserAuth**](ItemImportRequestUserAuth.md) |  |  |
|**options** | [**ItemImportRequestOptions**](ItemImportRequestOptions.md) |  |  [optional] |



