

# Institution

Details relating to a specific financial institution

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**institutionId** | **String** | Unique identifier for the institution |  |
|**name** | **String** | The official name of the institution |  |
|**products** | **List&lt;Products&gt;** | A list of the Plaid products supported by the institution. Note that only institutions that support Instant Auth will return &#x60;auth&#x60; in the product array; institutions that do not list &#x60;auth&#x60; may still support other Auth methods such as Instant Match or Automated Micro-deposit Verification. To identify institutions that support those methods, use the &#x60;auth_metadata&#x60; object. For more details, see [Full Auth coverage](https://plaid.com/docs/auth/coverage/). |  |
|**countryCodes** | **List&lt;CountryCode&gt;** | A list of the country codes supported by the institution. |  |
|**url** | **String** | The URL for the institution&#39;s website |  [optional] |
|**primaryColor** | **String** | Hexadecimal representation of the primary color used by the institution |  [optional] |
|**logo** | **String** | Base64 encoded representation of the institution&#39;s logo |  [optional] |
|**routingNumbers** | **List&lt;String&gt;** | A partial list of routing numbers associated with the institution. This list is provided for the purpose of looking up institutions by routing number. It is not comprehensive and should never be used as a complete list of routing numbers for an institution. |  |
|**oauth** | **Boolean** | Indicates that the institution has an OAuth login flow. |  |
|**status** | **InstitutionStatus** |  |  [optional] |
|**paymentInitiationMetadata** | **PaymentInitiationMetadata** |  |  [optional] |
|**authMetadata** | **AuthMetadata** |  |  [optional] |



