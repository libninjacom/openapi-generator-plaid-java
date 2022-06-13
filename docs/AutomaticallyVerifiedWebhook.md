

# AutomaticallyVerifiedWebhook

Fired when an Item is verified via automated micro-deposits. We recommend communicating to your users when this event is received to notify them that their account is verified and ready for use.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;AUTH&#x60; |  |
|**webhookCode** | **String** | &#x60;AUTOMATICALLY_VERIFIED&#x60; |  |
|**accountId** | **String** | The &#x60;account_id&#x60; of the account associated with the webhook |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |



