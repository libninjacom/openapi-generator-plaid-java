

# TransferIntentCreate

Represents a transfer intent within Transfer UI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Plaid&#39;s unique identifier for the transfer intent object. |  |
|**created** | **OffsetDateTime** | The datetime the transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the transfer intent.  - &#x60;PENDING&#x60; – The transfer intent is pending. - &#x60;SUCCEEDED&#x60; – The transfer intent was successfully created. - &#x60;FAILED&#x60; – The transfer intent was unable to be created. |  |
|**accountId** | **String** | The Plaid &#x60;account_id&#x60; for the account that will be debited or credited. Returned only if &#x60;account_id&#x60; was set on intent creation. |  [optional] |
|**originationAccountId** | **String** | Plaid’s unique identifier for the origination account for the intent. If not provided, the default account will be used. |  |
|**amount** | **String** | The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). |  |
|**mode** | **TransferIntentCreateMode** |  |  |
|**achClass** | **ACHClass** |  |  |
|**user** | **TransferUserInResponse** |  |  |
|**description** | **String** | A description for the underlying transfer. Maximum of 8 characters. |  |
|**metadata** | **Map&lt;String, String&gt;** | The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters  |  [optional] |
|**isoCurrencyCode** | **String** | The currency of the transfer amount, e.g. \&quot;USD\&quot; |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



