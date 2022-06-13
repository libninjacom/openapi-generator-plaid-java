

# BankTransferEventListRequest

Defines the request schema for `/bank_transfer/event/list`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**startDate** | **OffsetDateTime** | The start datetime of bank transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;) |  [optional] |
|**endDate** | **OffsetDateTime** | The end datetime of bank transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;) |  [optional] |
|**bankTransferId** | **String** | Plaid’s unique identifier for a bank transfer. |  [optional] |
|**accountId** | **String** | The account ID to get events for all transactions to/from an account. |  [optional] |
|**bankTransferType** | [**BankTransferTypeEnum**](#BankTransferTypeEnum) | The type of bank transfer. This will be either &#x60;debit&#x60; or &#x60;credit&#x60;.  A &#x60;debit&#x60; indicates a transfer of money into your origination account; a &#x60;credit&#x60; indicates a transfer of money out of your origination account. |  [optional] |
|**eventTypes** | **List&lt;BankTransferEventType&gt;** | Filter events by event type. |  [optional] |
|**count** | **Integer** | The maximum number of bank transfer events to return. If the number of events matching the above parameters is greater than &#x60;count&#x60;, the most recent events will be returned. |  [optional] |
|**offset** | **Integer** | The offset into the list of bank transfer events. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;0, the first 25 events will be returned. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;25, the next 25 bank transfer events will be returned. |  [optional] |
|**originationAccountId** | **String** | The origination account ID to get events for transfers from a specific origination account. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Indicates the direction of the transfer: &#x60;outbound&#x60;: for API-initiated transfers &#x60;inbound&#x60;: for payments received by the FBO account. |  [optional] |



## Enum: BankTransferTypeEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;debit&quot; |
| CREDIT | &quot;credit&quot; |
| NULL | &quot;null&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
| NULL | &quot;null&quot; |



