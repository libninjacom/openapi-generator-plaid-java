

# SandboxItemSetVerificationStatusRequest

SandboxItemSetVerificationStatusRequest defines the request schema for `/sandbox/item/set_verification_status`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**accessToken** | **String** | The access token associated with the Item data is being requested for. |  |
|**accountId** | **String** | The &#x60;account_id&#x60; of the account whose verification status is to be modified |  |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | The verification status to set the account to. |  |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| AUTOMATICALLY_VERIFIED | &quot;automatically_verified&quot; |
| VERIFICATION_EXPIRED | &quot;verification_expired&quot; |



