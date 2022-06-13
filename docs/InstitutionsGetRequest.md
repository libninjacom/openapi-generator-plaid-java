

# InstitutionsGetRequest

InstitutionsGetRequest defines the request schema for `/institutions/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**count** | **Integer** | The total number of Institutions to return. |  |
|**offset** | **Integer** | The number of Institutions to skip. |  |
|**countryCodes** | **List&lt;CountryCode&gt;** | Specify an array of Plaid-supported country codes this institution supports, using the ISO-3166-1 alpha-2 country code standard.   In API versions 2019-05-29 and earlier, the &#x60;country_codes&#x60; parameter is an optional parameter within the &#x60;options&#x60; object and will default to &#x60;[US]&#x60; if it is not supplied.  |  |
|**options** | [**InstitutionsGetRequestOptions**](InstitutionsGetRequestOptions.md) |  |  [optional] |



