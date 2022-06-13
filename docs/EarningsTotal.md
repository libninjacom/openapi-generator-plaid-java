

# EarningsTotal

An object representing both the current pay period and year to date amount for an earning category.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentAmount** | **BigDecimal** | Total amount of the earnings for this pay period |  [optional] |
|**currentPay** | **Pay** |  |  [optional] |
|**ytdPay** | **Pay** |  |  [optional] |
|**hours** | **BigDecimal** | Total number of hours worked for this pay period |  [optional] |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code of the line item. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null. |  [optional] |
|**unofficialCurrencyCode** | **String** | The unofficial currency code associated with the security. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s. |  [optional] |
|**ytdAmount** | **BigDecimal** | The total year-to-date amount of the earnings |  [optional] |



