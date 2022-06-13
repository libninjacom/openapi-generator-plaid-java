

# BankTransferEvent

Represents an event in the Bank Transfers API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **Integer** | Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers. |  |
|**timestamp** | **OffsetDateTime** | The datetime when this event occurred. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;. |  |
|**eventType** | **BankTransferEventType** |  |  |
|**accountId** | **String** | The account ID associated with the bank transfer. |  |
|**bankTransferId** | **String** | Plaid’s unique identifier for a bank transfer. |  |
|**originationAccountId** | **String** | The ID of the origination account that this balance belongs to. |  |
|**bankTransferType** | **BankTransferType** |  |  |
|**bankTransferAmount** | **String** | The bank transfer amount. |  |
|**bankTransferIsoCurrencyCode** | **String** | The currency of the bank transfer amount. |  |
|**failureReason** | **BankTransferFailure** |  |  |
|**direction** | **BankTransferDirection** |  |  |



