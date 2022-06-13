

# InvestmentsTransactionsGetResponse

InvestmentsTransactionsGetResponse defines the response schema for `/investments/transactions/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | **Item** |  |  |
|**accounts** | **List&lt;AccountBase&gt;** | The accounts for which transaction history is being fetched. |  |
|**securities** | **List&lt;Security&gt;** | All securities for which there is a corresponding transaction being fetched. |  |
|**investmentTransactions** | **List&lt;InvestmentTransaction&gt;** | The transactions being fetched |  |
|**totalInvestmentTransactions** | **Integer** | The total number of transactions available within the date range specified. If &#x60;total_investment_transactions&#x60; is larger than the size of the &#x60;transactions&#x60; array, more transactions are available and can be fetched via manipulating the &#x60;offset&#x60; parameter.&#39; |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



