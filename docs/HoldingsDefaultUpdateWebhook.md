

# HoldingsDefaultUpdateWebhook

Fired when new or updated holdings have been detected on an investment account. The webhook typically fires once per day, after market close, in response to any newly added holdings or price changes to existing holdings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;HOLDINGS&#x60; |  |
|**webhookCode** | **String** | &#x60;DEFAULT_UPDATE&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**newHoldings** | **BigDecimal** | The number of new holdings reported since the last time this webhook was fired. |  |
|**updatedHoldings** | **BigDecimal** | The number of updated holdings reported since the last time this webhook was fired. |  |



