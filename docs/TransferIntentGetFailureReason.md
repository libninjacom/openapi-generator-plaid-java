

# TransferIntentGetFailureReason

The reason for a failed transfer intent. Returned only if the transfer intent status is `failed`. Null otherwise.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorType** | **String** | A broad categorization of the error. |  [optional] |
|**errorCode** | **String** | A code representing the reason for a failed transfer intent (i.e., an API error or the authorization being declined).  For a full listing of bank transfer errors, see [Bank Transfers errors](https://plaid.com/docs/errors/bank-transfers/). |  [optional] |
|**errorMessage** | **String** | A human-readable description of the code associated with a failed transfer intent. |  [optional] |



