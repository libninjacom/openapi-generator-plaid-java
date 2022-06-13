

# InstitutionsSearchRequestOptions

An optional object to filter `/institutions/search` results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oauth** | **Boolean** | Limit results to institutions with or without OAuth login flows. |  [optional] |
|**includeOptionalMetadata** | **Boolean** | When true, return the institution&#39;s homepage URL, logo and primary brand color. |  [optional] |
|**includeAuthMetadata** | **Boolean** | When &#x60;true&#x60;, returns metadata related to the Auth product indicating which auth methods are supported. |  [optional] |
|**includePaymentInitiationMetadata** | **Boolean** | When &#x60;true&#x60;, returns metadata related to the Payment Initiation product indicating which payment configurations are supported. |  [optional] |
|**paymentInitiation** | **InstitutionsSearchPaymentInitiationOptions** |  |  [optional] |



