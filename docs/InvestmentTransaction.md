

# InvestmentTransaction

A transaction within an investment account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**investmentTransactionId** | **String** | The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the &#x60;investment_transaction_id&#x60; is case sensitive. |  |
|**cancelTransactionId** | **String** | A legacy field formerly used internally by Plaid to identify certain canceled transactions. |  [optional] |
|**accountId** | **String** | The &#x60;account_id&#x60; of the account against which this transaction posted. |  |
|**securityId** | **String** | The &#x60;security_id&#x60; to which this transaction is related. |  |
|**date** | **LocalDate** | The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction. |  |
|**name** | **String** | The institution’s description of the transaction. |  |
|**quantity** | **BigDecimal** | The number of units of the security involved in this transaction. |  |
|**amount** | **BigDecimal** | The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities. |  |
|**price** | **BigDecimal** | The price of the security at which this transaction occurred. |  |
|**fees** | **BigDecimal** | The combined value of all fees applied to this transaction |  |
|**type** | [**TypeEnum**](#TypeEnum) | Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema). |  |
|**subtype** | [**SubtypeEnum**](#SubtypeEnum) | For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema). |  |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;. |  |
|**unofficialCurrencyCode** | **String** | The unofficial currency code associated with the holding. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BUY | &quot;buy&quot; |
| SELL | &quot;sell&quot; |
| CANCEL | &quot;cancel&quot; |
| CASH | &quot;cash&quot; |
| FEE | &quot;fee&quot; |
| TRANSFER | &quot;transfer&quot; |



## Enum: SubtypeEnum

| Name | Value |
|---- | -----|
| ACCOUNT_FEE | &quot;account fee&quot; |
| ADJUSTMENT | &quot;adjustment&quot; |
| ASSIGNMENT | &quot;assignment&quot; |
| BUY | &quot;buy&quot; |
| BUY_TO_COVER | &quot;buy to cover&quot; |
| CONTRIBUTION | &quot;contribution&quot; |
| DEPOSIT | &quot;deposit&quot; |
| DISTRIBUTION | &quot;distribution&quot; |
| DIVIDEND | &quot;dividend&quot; |
| DIVIDEND_REINVESTMENT | &quot;dividend reinvestment&quot; |
| EXERCISE | &quot;exercise&quot; |
| EXPIRE | &quot;expire&quot; |
| FUND_FEE | &quot;fund fee&quot; |
| INTEREST | &quot;interest&quot; |
| INTEREST_RECEIVABLE | &quot;interest receivable&quot; |
| INTEREST_REINVESTMENT | &quot;interest reinvestment&quot; |
| LEGAL_FEE | &quot;legal fee&quot; |
| LOAN_PAYMENT | &quot;loan payment&quot; |
| LONG_TERM_CAPITAL_GAIN | &quot;long-term capital gain&quot; |
| LONG_TERM_CAPITAL_GAIN_REINVESTMENT | &quot;long-term capital gain reinvestment&quot; |
| MANAGEMENT_FEE | &quot;management fee&quot; |
| MARGIN_EXPENSE | &quot;margin expense&quot; |
| MERGER | &quot;merger&quot; |
| MISCELLANEOUS_FEE | &quot;miscellaneous fee&quot; |
| NON_QUALIFIED_DIVIDEND | &quot;non-qualified dividend&quot; |
| NON_RESIDENT_TAX | &quot;non-resident tax&quot; |
| PENDING_CREDIT | &quot;pending credit&quot; |
| PENDING_DEBIT | &quot;pending debit&quot; |
| QUALIFIED_DIVIDEND | &quot;qualified dividend&quot; |
| REBALANCE | &quot;rebalance&quot; |
| RETURN_OF_PRINCIPAL | &quot;return of principal&quot; |
| SELL | &quot;sell&quot; |
| SELL_SHORT | &quot;sell short&quot; |
| SHORT_TERM_CAPITAL_GAIN | &quot;short-term capital gain&quot; |
| SHORT_TERM_CAPITAL_GAIN_REINVESTMENT | &quot;short-term capital gain reinvestment&quot; |
| SPIN_OFF | &quot;spin off&quot; |
| SPLIT | &quot;split&quot; |
| STOCK_DISTRIBUTION | &quot;stock distribution&quot; |
| TAX | &quot;tax&quot; |
| TAX_WITHHELD | &quot;tax withheld&quot; |
| TRANSFER | &quot;transfer&quot; |
| TRANSFER_FEE | &quot;transfer fee&quot; |
| TRUST_FEE | &quot;trust fee&quot; |
| UNQUALIFIED_GAIN | &quot;unqualified gain&quot; |
| WITHDRAWAL | &quot;withdrawal&quot; |



