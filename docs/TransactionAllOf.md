

# TransactionAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentChannel** | [**PaymentChannelEnum**](#PaymentChannelEnum) | The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field.  |  |
|**authorizedDate** | **LocalDate** | The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ). The &#x60;authorized_date&#x60; field uses machine learning to determine a transaction date for transactions where the &#x60;date_transacted&#x60; is not available. If the &#x60;date_transacted&#x60; field is present and not &#x60;null&#x60;, the &#x60;authorized_date&#x60; field will have the same value as the &#x60;date_transacted&#x60; field. |  |
|**authorizedDatetime** | **OffsetDateTime** | Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). |  |
|**datetime** | **OffsetDateTime** | Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). |  |
|**transactionCode** | **TransactionCode** |  |  |
|**personalFinanceCategory** | [**PersonalFinanceCategory**](PersonalFinanceCategory.md) |  |  [optional] |



## Enum: PaymentChannelEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;online&quot; |
| IN_STORE | &quot;in store&quot; |
| OTHER | &quot;other&quot; |



