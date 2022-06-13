

# APR

Information about the APR on the account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aprPercentage** | **BigDecimal** | Annual Percentage Rate applied.  |  |
|**aprType** | [**AprTypeEnum**](#AprTypeEnum) | The type of balance to which the APR applies. |  |
|**balanceSubjectToApr** | **BigDecimal** | Amount of money that is subjected to the APR if a balance was carried beyond payment due date. How it is calculated can vary by card issuer. It is often calculated as an average daily balance. |  |
|**interestChargeAmount** | **BigDecimal** | Amount of money charged due to interest from last statement. |  |



## Enum: AprTypeEnum

| Name | Value |
|---- | -----|
| BALANCE_TRANSFER_APR | &quot;balance_transfer_apr&quot; |
| CASH_APR | &quot;cash_apr&quot; |
| PURCHASE_APR | &quot;purchase_apr&quot; |
| SPECIAL | &quot;special&quot; |



