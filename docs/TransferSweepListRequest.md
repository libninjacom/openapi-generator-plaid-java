

# TransferSweepListRequest

Defines the request schema for `/transfer/sweep/list`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**startDate** | **OffsetDateTime** | The start datetime of sweeps to return (RFC 3339 format). |  [optional] |
|**endDate** | **OffsetDateTime** | The end datetime of sweeps to return (RFC 3339 format). |  [optional] |
|**count** | **Integer** | The maximum number of sweeps to return. |  [optional] |
|**offset** | **Integer** | The number of sweeps to skip before returning results. |  [optional] |



