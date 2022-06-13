

# CreditCardLiability

An object representing a credit card account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of the account that this liability belongs to. |  |
|**aprs** | **List&lt;APR&gt;** | The various interest rates that apply to the account. |  |
|**isOverdue** | **Boolean** | true if a payment is currently overdue. Availability for this field is limited. |  |
|**lastPaymentAmount** | **BigDecimal** | The amount of the last payment. |  |
|**lastPaymentDate** | **LocalDate** | The date of the last payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Availability for this field is limited. |  |
|**lastStatementIssueDate** | **LocalDate** | The date of the last statement. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). |  |
|**lastStatementBalance** | **BigDecimal** | The total amount owed as of the last statement issued |  |
|**minimumPaymentAmount** | **BigDecimal** | The minimum payment due for the next billing cycle. |  |
|**nextPaymentDueDate** | **LocalDate** | The due date for the next payment. The due date is &#x60;null&#x60; if a payment is not expected. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). |  |



