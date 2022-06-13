

# SandboxItemFireWebhookRequest

SandboxItemFireWebhookRequest defines the request schema for `/sandbox/item/fire_webhook`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**accessToken** | **String** | The access token associated with the Item data is being requested for. |  |
|**webhookCode** | [**WebhookCodeEnum**](#WebhookCodeEnum) | The following values for &#x60;webhook_code&#x60; are supported:  * &#x60;DEFAULT_UPDATE&#x60; * &#x60;NEW_ACCOUNTS_AVAILABLE&#x60; |  |



## Enum: WebhookCodeEnum

| Name | Value |
|---- | -----|
| DEFAULT_UPDATE | &quot;DEFAULT_UPDATE&quot; |
| NEW_ACCOUNTS_AVAILABLE | &quot;NEW_ACCOUNTS_AVAILABLE&quot; |



