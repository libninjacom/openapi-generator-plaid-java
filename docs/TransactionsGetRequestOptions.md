

# TransactionsGetRequestOptions

An optional object to be used with the request. If specified, `options` must not be `null`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;String&gt;** | A list of &#x60;account_ids&#x60; to retrieve for the Item  Note: An error will be returned if a provided &#x60;account_id&#x60; is not associated with the Item. |  [optional] |
|**count** | **Integer** | The number of transactions to fetch. |  [optional] |
|**offset** | **Integer** | The number of transactions to skip. The default value is 0. |  [optional] |
|**includeOriginalDescription** | **Boolean** | Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager. |  [optional] |
|**includePersonalFinanceCategoryBeta** | **Boolean** | Include the &#x60;personal_finance_category&#x60; object in the response. This feature is currently in beta – to request access, contact transactions-feedback@plaid.com. |  [optional] |



