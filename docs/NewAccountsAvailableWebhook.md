

# NewAccountsAvailableWebhook

Fired when Plaid detects a new account for Items created or updated with [Account Select v2](https://plaid.com/docs/link/customization/#account-select). Upon receiving this webhook, you can prompt your users to share new accounts with you through [Account Select v2 update mode](https://plaid.com/docs/link/update-mode/#using-update-mode-to-request-new-accounts).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ITEM&#x60; |  [optional] |
|**webhookCode** | **String** | &#x60;NEW_ACCOUNTS_AVAILABLE&#x60; |  [optional] |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  [optional] |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |



