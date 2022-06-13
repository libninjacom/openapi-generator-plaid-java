

# IncomeVerificationPaystubsGetResponse

IncomeVerificationPaystubsGetResponse defines the response schema for `/income/verification/paystubs/get`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentMetadata** | **List&lt;DocumentMetadata&gt;** | Metadata for an income document. |  [optional] |
|**paystubs** | **List&lt;Paystub&gt;** |  |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



