

# InitialUpdateWebhook

Fired when an Item's initial transaction pull is completed. Once this webhook has been fired, transaction data for the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with `new_transactions` set to the number of net new transactions pulled after the account selection update.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;TRANSACTIONS&#x60; |  |
|**webhookCode** | **String** | &#x60;INITIAL_UPDATE&#x60; |  |
|**error** | **String** | The error code associated with the webhook. |  [optional] |
|**newTransactions** | **BigDecimal** | The number of new, unfetched transactions available. |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |



