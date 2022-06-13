

# Error

We use standard HTTP response codes for success and failure notifications, and our errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.  Error fields will be `null` if no error has occurred.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorType** | [**ErrorTypeEnum**](#ErrorTypeEnum) | A broad categorization of the error. Safe for programmatic use. |  |
|**errorCode** | **String** | The particular error code. Safe for programmatic use. |  |
|**errorMessage** | **String** | A developer-friendly representation of the error code. This may change over time and is not safe for programmatic use. |  |
|**displayMessage** | **String** | A user-friendly representation of the error code. &#x60;null&#x60; if the error is not related to user action.  This may change over time and is not safe for programmatic use. |  |
|**requestId** | **String** | A unique ID identifying the request, to be used for troubleshooting purposes. This field will be omitted in errors provided by webhooks. |  [optional] |
|**causes** | **List&lt;Object&gt;** | In the Assets product, a request can pertain to more than one Item. If an error is returned for such a request, &#x60;causes&#x60; will return an array of errors containing a breakdown of these errors on the individual Item level, if any can be identified.  &#x60;causes&#x60; will only be provided for the &#x60;error_type&#x60; &#x60;ASSET_REPORT_ERROR&#x60;. &#x60;causes&#x60; will also not be populated inside an error nested within a &#x60;warning&#x60; object. |  [optional] |
|**status** | **BigDecimal** | The HTTP status code associated with the error. This will only be returned in the response body when the error information is provided via a webhook. |  [optional] |
|**documentationUrl** | **String** | The URL of a Plaid documentation page with more information about the error |  [optional] |
|**suggestedAction** | **String** | Suggested steps for resolving the error |  [optional] |



## Enum: ErrorTypeEnum

| Name | Value |
|---- | -----|
| INVALID_REQUEST | &quot;INVALID_REQUEST&quot; |
| INVALID_RESULT | &quot;INVALID_RESULT&quot; |
| INVALID_INPUT | &quot;INVALID_INPUT&quot; |
| INSTITUTION_ERROR | &quot;INSTITUTION_ERROR&quot; |
| RATE_LIMIT_EXCEEDED | &quot;RATE_LIMIT_EXCEEDED&quot; |
| API_ERROR | &quot;API_ERROR&quot; |
| ITEM_ERROR | &quot;ITEM_ERROR&quot; |
| ASSET_REPORT_ERROR | &quot;ASSET_REPORT_ERROR&quot; |
| RECAPTCHA_ERROR | &quot;RECAPTCHA_ERROR&quot; |
| OAUTH_ERROR | &quot;OAUTH_ERROR&quot; |
| PAYMENT_ERROR | &quot;PAYMENT_ERROR&quot; |
| BANK_TRANSFER_ERROR | &quot;BANK_TRANSFER_ERROR&quot; |
| INCOME_VERIFICATION_ERROR | &quot;INCOME_VERIFICATION_ERROR&quot; |



