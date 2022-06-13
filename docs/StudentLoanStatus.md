

# StudentLoanStatus

An object representing the status of the student loan

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **LocalDate** | The date until which the loan will be in its current status. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The status type of the student loan |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CANCELLED | &quot;cancelled&quot; |
| CHARGED_OFF | &quot;charged off&quot; |
| CLAIM | &quot;claim&quot; |
| CONSOLIDATED | &quot;consolidated&quot; |
| DEFERMENT | &quot;deferment&quot; |
| DELINQUENT | &quot;delinquent&quot; |
| DISCHARGED | &quot;discharged&quot; |
| EXTENSION | &quot;extension&quot; |
| FORBEARANCE | &quot;forbearance&quot; |
| IN_GRACE | &quot;in grace&quot; |
| IN_MILITARY | &quot;in military&quot; |
| IN_SCHOOL | &quot;in school&quot; |
| NOT_FULLY_DISBURSED | &quot;not fully disbursed&quot; |
| OTHER | &quot;other&quot; |
| PAID_IN_FULL | &quot;paid in full&quot; |
| REFUNDED | &quot;refunded&quot; |
| REPAYMENT | &quot;repayment&quot; |
| TRANSFERRED | &quot;transferred&quot; |



