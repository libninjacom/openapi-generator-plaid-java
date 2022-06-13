

# TransactionsRecurringGetResponse

TransactionsRecurringGetResponse defines the response schema for `/transactions/recurring/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inflowStreams** | **List&lt;TransactionStream&gt;** | An array of depository transaction streams. |  |
|**outflowStreams** | **List&lt;TransactionStream&gt;** | An array of expense transaction streams. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



