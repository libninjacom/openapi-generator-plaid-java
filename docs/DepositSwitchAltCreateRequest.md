

# DepositSwitchAltCreateRequest

DepositSwitchAltCreateRequest defines the request schema for `/deposit_switch/alt/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**targetAccount** | **DepositSwitchTargetAccount** |  |  |
|**targetUser** | **DepositSwitchTargetUser** |  |  |
|**options** | [**DepositSwitchCreateRequestOptions**](DepositSwitchCreateRequestOptions.md) |  |  [optional] |
|**countryCode** | [**CountryCodeEnum**](#CountryCodeEnum) | ISO-3166-1 alpha-2 country code standard. |  [optional] |



## Enum: CountryCodeEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| CA | &quot;CA&quot; |



