

# WalletTransactionAmount

The amount and currency of a transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isoCurrencyCode** | [**IsoCurrencyCodeEnum**](#IsoCurrencyCodeEnum) | The ISO-4217 currency code of the transaction. Currently, only &#x60;\&quot;GBP\&quot;&#x60; is supported. |  |
|**value** | **BigDecimal** | The amount of the transaction. Must contain at most two digits of precision e.g. &#x60;1.23&#x60;. |  |



## Enum: IsoCurrencyCodeEnum

| Name | Value |
|---- | -----|
| GBP | &quot;GBP&quot; |



