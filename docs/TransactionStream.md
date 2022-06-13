

# TransactionStream

A grouping of related transactions

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of the account to which the stream belongs |  |
|**streamId** | **String** | A unique id for the stream |  |
|**categoryId** | **String** | The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview). |  |
|**category** | **List&lt;String&gt;** | A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview). |  |
|**description** | **String** | A description of the transaction stream. |  |
|**firstDate** | **LocalDate** | The posted date of the earliest transaction in the stream. |  |
|**lastDate** | **LocalDate** | The posted date of the latest transaction in the stream. |  |
|**frequency** | **RecurringTransactionFrequency** |  |  |
|**transactionIds** | **List&lt;String&gt;** | An array of Plaid transaction IDs belonging to the stream, sorted by posted date. |  |
|**averageAmount** | **TransactionStreamAmount** |  |  |
|**isActive** | **Boolean** | indicates whether the transaction stream is still live. |  |



