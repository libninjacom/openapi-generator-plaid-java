

# Transfer

Represents a transfer within the Transfers API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Plaid’s unique identifier for a transfer. |  |
|**achClass** | **ACHClass** |  |  |
|**accountId** | **String** | The account ID that should be credited/debited for this transfer. |  |
|**type** | **TransferType** |  |  |
|**user** | **TransferUserInResponse** |  |  |
|**amount** | **String** | The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). |  |
|**description** | **String** | The description of the transfer. |  |
|**created** | **OffsetDateTime** | The datetime when this transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60; |  |
|**status** | **TransferStatus** |  |  |
|**sweepStatus** | **TransferSweepStatus** |  |  [optional] |
|**network** | **TransferNetwork** |  |  |
|**cancellable** | **Boolean** | When &#x60;true&#x60;, you can still cancel this transfer. |  |
|**failureReason** | **TransferFailure** |  |  |
|**metadata** | **Map&lt;String, String&gt;** | The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters  |  |
|**originationAccountId** | **String** | Plaid’s unique identifier for the origination account that was used for this transfer. |  |
|**guaranteeDecision** | **TransferAuthorizationGuaranteeDecision** |  |  |
|**guaranteeDecisionRationale** | **TransferAuthorizationGuaranteeDecisionRationale** |  |  |
|**isoCurrencyCode** | **String** | The currency of the transfer amount, e.g. \&quot;USD\&quot; |  |



