

# TransferAuthorizationCreateRequest

Defines the request schema for `/transfer/authorization/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**accessToken** | **String** | The Plaid &#x60;access_token&#x60; for the account that will be debited or credited. |  |
|**accountId** | **String** | The Plaid &#x60;account_id&#x60; for the account that will be debited or credited. |  |
|**type** | **TransferType** |  |  |
|**network** | **TransferNetwork** |  |  |
|**amount** | **String** | The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). |  |
|**achClass** | **ACHClass** |  |  |
|**user** | **TransferUserInRequest** |  |  |
|**device** | **TransferAuthorizationDevice** |  |  [optional] |
|**originationAccountId** | **String** | Plaid&#39;s unique identifier for the origination account for this authorization. If not specified, the default account will be used. |  [optional] |
|**isoCurrencyCode** | **String** | The currency of the transfer amount. The default value is \&quot;USD\&quot;. |  [optional] |



