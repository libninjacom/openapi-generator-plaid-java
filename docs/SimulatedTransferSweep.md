

# SimulatedTransferSweep

A sweep returned from the `/sandbox/transfer/sweep/simulate` endpoint. Can be null if there are no transfers to include in a sweep.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier of the sweep. |  |
|**created** | **OffsetDateTime** | The datetime when the sweep occurred, in RFC 3339 format. |  |
|**amount** | **String** | Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \&quot;-10.00\&quot;)  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced. |  |
|**isoCurrencyCode** | **String** | The currency of the sweep, e.g. \&quot;USD\&quot;. |  |



