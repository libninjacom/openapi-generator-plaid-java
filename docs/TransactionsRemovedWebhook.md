

# TransactionsRemovedWebhook

Fired when transaction(s) for an Item are deleted. The deleted transaction IDs are included in the webhook payload. Plaid will typically check for deleted transaction data several times a day.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;TRANSACTIONS&#x60; |  |
|**webhookCode** | **String** | &#x60;TRANSACTIONS_REMOVED&#x60; |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**removedTransactions** | **List&lt;String&gt;** | An array of &#x60;transaction_ids&#x60; corresponding to the removed transactions |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |



