

# IncomeVerificationPrecheckResponse

IncomeVerificationPrecheckResponse defines the response schema for `/income/verification/precheck`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**precheckId** | **String** | ID of the precheck. Provide this value when calling &#x60;/link/token/create&#x60; in order to optimize Link conversion. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |
|**confidence** | **IncomeVerificationPrecheckConfidence** |  |  |



