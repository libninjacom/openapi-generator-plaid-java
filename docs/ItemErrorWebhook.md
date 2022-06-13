

# ItemErrorWebhook

Fired when an error is encountered with an Item. The error can be resolved by having the user go through Link’s update mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ITEM&#x60; |  |
|**webhookCode** | **String** | &#x60;ERROR&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  |



