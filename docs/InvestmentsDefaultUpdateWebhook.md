

# InvestmentsDefaultUpdateWebhook

Fired when new or canceled transactions have been detected on an investment account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;INVESTMENTS_TRANSACTIONS&#x60; |  |
|**webhookCode** | **String** | &#x60;DEFAULT_UPDATE&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**newInvestmentsTransactions** | **BigDecimal** | The number of new transactions reported since the last time this webhook was fired. |  |
|**canceledInvestmentsTransactions** | **BigDecimal** | The number of canceled transactions reported since the last time this webhook was fired. |  |



