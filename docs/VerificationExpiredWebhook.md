

# VerificationExpiredWebhook

Fired when an Item was not verified via automated micro-deposits after seven days since the automated micro-deposit was made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;AUTH&#x60; |  |
|**webhookCode** | **String** | &#x60;VERIFICATION_EXPIRED&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**accountId** | **String** | The &#x60;account_id&#x60; of the account associated with the webhook |  |



