

# DepositSwitchCreateRequest

DepositSwitchCreateRequest defines the request schema for `/deposit_switch/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**targetAccessToken** | **String** | Access token for the target Item, typically provided in the Import Item response.  |  |
|**targetAccountId** | **String** | Plaid Account ID that specifies the target bank account. This account will become the recipient for a user&#39;s direct deposit. |  |
|**countryCode** | [**CountryCodeEnum**](#CountryCodeEnum) | ISO-3166-1 alpha-2 country code standard. |  [optional] |
|**options** | [**DepositSwitchCreateRequestOptions**](DepositSwitchCreateRequestOptions.md) |  |  [optional] |



## Enum: CountryCodeEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| CA | &quot;CA&quot; |



