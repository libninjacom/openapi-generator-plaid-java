

# TransactionsGetRequest

TransactionsGetRequest defines the request schema for `/transactions/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**options** | [**TransactionsGetRequestOptions**](TransactionsGetRequestOptions.md) |  |  [optional] |
|**accessToken** | **String** | The access token associated with the Item data is being requested for. |  |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**startDate** | **LocalDate** | The earliest date for which data should be returned. Dates should be formatted as YYYY-MM-DD. |  |
|**endDate** | **LocalDate** | The latest date for which data should be returned. Dates should be formatted as YYYY-MM-DD. |  |



