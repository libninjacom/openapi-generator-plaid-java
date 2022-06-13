

# InvestmentsHoldingsGetResponse

InvestmentsHoldingsGetResponse defines the response schema for `/investments/holdings/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | **List&lt;AccountBase&gt;** | The accounts associated with the Item |  |
|**holdings** | **List&lt;Holding&gt;** | The holdings belonging to investment accounts associated with the Item. Details of the securities in the holdings are provided in the &#x60;securities&#x60; field.  |  |
|**securities** | **List&lt;Security&gt;** | Objects describing the securities held in the accounts associated with the Item.  |  |
|**item** | **Item** |  |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



