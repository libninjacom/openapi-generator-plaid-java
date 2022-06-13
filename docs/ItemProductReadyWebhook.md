

# ItemProductReadyWebhook

Fired once Plaid calculates income from an Item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;INCOME&#x60; |  |
|**webhookCode** | **String** | &#x60;PRODUCT_READY&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |



