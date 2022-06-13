

# IncomeVerificationTaxformsGetResponse

IncomeVerificationTaxformsGetResponse defines the response schema for `/income/verification/taxforms/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  [optional] |
|**documentMetadata** | **List&lt;DocumentMetadata&gt;** |  |  |
|**taxforms** | **List&lt;Taxform&gt;** | A list of forms. |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |



