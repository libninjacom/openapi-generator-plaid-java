

# OverrideAccounts

Data to use to set values of test accounts. Some values cannot be specified in the schema and will instead will be calculated from other test data in order to achieve more consistent, realistic test data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **OverrideAccountType** |  |  |
|**subtype** | **AccountSubtype** |  |  |
|**startingBalance** | **BigDecimal** | If provided, the account will start with this amount as the current balance.  |  |
|**forceAvailableBalance** | **BigDecimal** | If provided, the account will always have this amount as its  available balance, regardless of current balance or changes in transactions over time. |  |
|**currency** | **String** | ISO-4217 currency code. If provided, the account will be denominated in the given currency. Transactions will also be in this currency by default. |  |
|**meta** | **Meta** |  |  |
|**numbers** | **Numbers** |  |  |
|**transactions** | **List&lt;TransactionOverride&gt;** | Specify the list of transactions on the account. |  |
|**holdings** | [**HoldingsOverride**](HoldingsOverride.md) |  |  [optional] |
|**investmentTransactions** | [**InvestmentsTransactionsOverride**](InvestmentsTransactionsOverride.md) |  |  [optional] |
|**identity** | **OwnerOverride** |  |  |
|**liability** | **LiabilityOverride** |  |  |
|**inflowModel** | **InflowModel** |  |  |
|**income** | [**IncomeOverride**](IncomeOverride.md) |  |  [optional] |



