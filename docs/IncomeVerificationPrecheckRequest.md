

# IncomeVerificationPrecheckRequest

IncomeVerificationPrecheckRequest defines the request schema for `/income/verification/precheck`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**user** | [**IncomeVerificationPrecheckUser**](IncomeVerificationPrecheckUser.md) |  |  [optional] |
|**employer** | [**IncomeVerificationPrecheckEmployer**](IncomeVerificationPrecheckEmployer.md) |  |  [optional] |
|**transactionsAccessToken** | [**String**](String.md) |  |  [optional] |
|**transactionsAccessTokens** | **List&lt;String&gt;** | An array of access tokens corresponding to Items belonging to the user whose eligibility is being checked. Note that if the Items specified here are not already initialized with &#x60;transactions&#x60;, providing them in this field will cause these Items to be initialized with (and billed for) the Transactions product. |  [optional] |
|**usMilitaryInfo** | [**IncomeVerificationPrecheckMilitaryInfo**](IncomeVerificationPrecheckMilitaryInfo.md) |  |  [optional] |



