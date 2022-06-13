

# IncomeVerificationSummaryGetResponse

IncomeVerificationSummaryGetResponse defines the response schema for `/income/verification/summary/get`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**incomeSummaries** | **List&lt;IncomeSummary&gt;** | A list of income summaries. |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



