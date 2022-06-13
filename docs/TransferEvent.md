

# TransferEvent

Represents an event in the Transfers API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **Integer** | Plaid’s unique identifier for this event. IDs are sequential unsigned 64-bit integers. |  |
|**timestamp** | **OffsetDateTime** | The datetime when this event occurred. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;. |  |
|**eventType** | **TransferEventType** |  |  |
|**accountId** | **String** | The account ID associated with the transfer. |  |
|**transferId** | **String** | Plaid’s unique identifier for a transfer. |  |
|**originationAccountId** | **String** | The ID of the origination account that this balance belongs to. |  |
|**transferType** | **TransferType** |  |  |
|**transferAmount** | **String** | The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). |  |
|**failureReason** | **TransferFailure** |  |  |
|**sweepId** | **String** | Plaid’s unique identifier for a sweep. |  |
|**sweepAmount** | **String** | A signed amount of how much was &#x60;swept&#x60; or &#x60;reverse_swept&#x60; (decimal string with two digits of precision e.g. \&quot;-5.50\&quot;). |  |



