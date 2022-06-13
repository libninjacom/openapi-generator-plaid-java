

# WebhookUpdateAcknowledgedWebhook

Fired when an Item's webhook is updated. This will be sent to the newly specified webhook.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ITEM&#x60; |  |
|**webhookCode** | **String** | &#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**newWebhookUrl** | **String** | The new webhook URL |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |



