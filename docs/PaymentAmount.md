

# PaymentAmount

The amount and currency of a payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The ISO-4217 currency code of the payment. For standing orders, &#x60;\&quot;GBP\&quot;&#x60; must be used. |  |
|**value** | **BigDecimal** | The amount of the payment. Must contain at most two digits of precision e.g. &#x60;1.23&#x60;. Minimum accepted value is &#x60;1&#x60;. |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| GBP | &quot;GBP&quot; |
| EUR | &quot;EUR&quot; |



