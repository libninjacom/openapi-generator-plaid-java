

# ProcessorTokenCreateRequest

ProcessorTokenCreateRequest defines the request schema for `/processor/token/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**accessToken** | **String** | The access token associated with the Item data is being requested for. |  |
|**accountId** | **String** | The &#x60;account_id&#x60; value obtained from the &#x60;onSuccess&#x60; callback in Link |  |
|**processor** | [**ProcessorEnum**](#ProcessorEnum) | The processor you are integrating with. |  |



## Enum: ProcessorEnum

| Name | Value |
|---- | -----|
| ACHQ | &quot;achq&quot; |
| ALPACA | &quot;alpaca&quot; |
| ASTRA | &quot;astra&quot; |
| CHECK | &quot;check&quot; |
| CHECKBOOK | &quot;checkbook&quot; |
| CIRCLE | &quot;circle&quot; |
| DRIVEWEALTH | &quot;drivewealth&quot; |
| DWOLLA | &quot;dwolla&quot; |
| GALILEO | &quot;galileo&quot; |
| LITHIC | &quot;lithic&quot; |
| MODERN_TREASURY | &quot;modern_treasury&quot; |
| MOOV | &quot;moov&quot; |
| OCROLUS | &quot;ocrolus&quot; |
| PRIME_TRUST | &quot;prime_trust&quot; |
| RIZE | &quot;rize&quot; |
| SILA_MONEY | &quot;sila_money&quot; |
| SVB_API | &quot;svb_api&quot; |
| TREASURY_PRIME | &quot;treasury_prime&quot; |
| UNIT | &quot;unit&quot; |
| VESTA | &quot;vesta&quot; |
| VOPAY | &quot;vopay&quot; |
| WYRE | &quot;wyre&quot; |



