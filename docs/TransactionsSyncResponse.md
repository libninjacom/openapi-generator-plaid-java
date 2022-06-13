

# TransactionsSyncResponse

TransactionsSyncResponse defines the response schema for `/transactions/sync`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**added** | [**List&lt;Transaction&gt;**](Transaction.md) | Transactions that have been added to the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  |
|**modified** | [**List&lt;Transaction&gt;**](Transaction.md) | Transactions that have been modified on the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  |
|**removed** | [**List&lt;RemovedTransaction&gt;**](RemovedTransaction.md) | Transactions that have been removed from the item since &#x60;cursor&#x60; ordered by ascending last modified time. |  |
|**nextCursor** | **String** | Cursor used for fetching any future updates after the latest update provided in this response. |  |
|**hasMore** | **Boolean** | Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with &#x60;cursor&#x60; set to &#x60;next_cursor&#x60;. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



