

# TransferRepayment

A repayment is created automatically after one or more guaranteed transactions receive a return. If there are multiple eligible returns in a day, they are batched together into a single repayment.  Repayments are sent over ACH, with funds typically available on the next banking day.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**repaymentId** | **String** | Identifier of the repayment. |  |
|**created** | **OffsetDateTime** | The datetime when the repayment occurred, in RFC 3339 format. |  |
|**amount** | **String** | Decimal amount of the repayment as it appears on your account ledger. |  |
|**isoCurrencyCode** | **String** | The currency of the repayment, e.g. \&quot;USD\&quot;. |  |



