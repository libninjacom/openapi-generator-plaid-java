

# BankTransferSweepListRequest

BankTransferSweepListRequest defines the request schema for `/bank_transfer/sweep/list`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**originationAccountId** | **String** | If multiple origination accounts are available, &#x60;origination_account_id&#x60; must be used to specify the account that the sweeps belong to. |  [optional] |
|**startTime** | **OffsetDateTime** | The start datetime of sweeps to return (RFC 3339 format). |  [optional] |
|**endTime** | **OffsetDateTime** | The end datetime of sweeps to return (RFC 3339 format). |  [optional] |
|**count** | **Integer** | The maximum number of sweeps to return. |  [optional] |



