

# DefaultUpdateWebhook

Fired when new transaction data is available for an Item. Plaid will typically check for new transaction data several times a day. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;TRANSACTIONS&#x60; |  |
|**webhookCode** | **String** | &#x60;DEFAULT_UPDATE&#x60; |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**newTransactions** | **BigDecimal** | The number of new transactions detected since the last time this webhook was fired. |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item the webhook relates to. |  |



