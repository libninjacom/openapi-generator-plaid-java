

# WalletTransaction

The transaction details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | A unique ID identifying the transaction |  |
|**reference** | **String** | A reference for the transaction |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of of the transaction. Currently, only &#x60;\&quot;PAYOUT\&quot;&#x60; is supported. |  |
|**amount** | **WalletTransactionAmount** |  |  |
|**counterparty** | **WalletTransactionCounterparty** |  |  |
|**status** | **WalletTransactionStatus** |  |  |
|**createdAt** | **OffsetDateTime** | Timestamp when the transaction was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAYOUT | &quot;PAYOUT&quot; |



