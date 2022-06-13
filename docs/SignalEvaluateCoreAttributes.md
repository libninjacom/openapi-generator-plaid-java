

# SignalEvaluateCoreAttributes

The core attributes object contains additional data that can be used to assess the ACH return risk. Examples of data include:  `days_since_first_plaid_connection`: The number of days since the first time the Item was connected to an application via Plaid `plaid_connections_count_7d`: The number of times the Item has been connected to applications via Plaid over the past 7 days `plaid_connections_count_30d`: The number of times the Item has been connected to applications via Plaid over the past 30 days `total_plaid_connections_count`: The number of times the Item has been connected to applications via Plaid `is_savings_or_money_market_account`: Indicates whether the ACH transaction funding account is a savings/money market account  For the full list and detailed documentation of core attributes available, or to request that core attributes not be returned, contact Sales or your Plaid account manager

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**unauthorizedTransactionsCount7d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to unauthorized transactions over the past 7 days from the account that will be debited. |  [optional] |
|**unauthorizedTransactionsCount30d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to unauthorized transactions over the past 30 days from the account that will be debited. |  [optional] |
|**unauthorizedTransactionsCount60d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to unauthorized transactions over the past 60 days from the account that will be debited. |  [optional] |
|**unauthorizedTransactionsCount90d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to unauthorized transactions over the past 90 days from the account that will be debited. |  [optional] |
|**nsfOverdraftTransactionsCount7d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to non-sufficient funds/overdrafts over the past 7 days from the account that will be debited. |  [optional] |
|**nsfOverdraftTransactionsCount30d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to non-sufficient funds/overdrafts over the past 30 days from the account that will be debited. |  [optional] |
|**nsfOverdraftTransactionsCount60d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to non-sufficient funds/overdrafts over the past 60 days from the account that will be debited. |  [optional] |
|**nsfOverdraftTransactionsCount90d** | **Integer** | We parse and analyze historical transaction metadata to identify the number of possible past returns due to non-sufficient funds/overdrafts over the past 90 days from the account that will be debited. |  [optional] |
|**daysSinceFirstPlaidConnection** | **Integer** | The number of days since the first time the Item was connected to an application via Plaid |  [optional] |
|**plaidConnectionsCount7d** | **Integer** | The number of times the Item has been connected to applications via Plaid over the past 7 days |  [optional] |
|**plaidConnectionsCount30d** | **Integer** | The number of times the Item has been connected to applications via Plaid over the past 30 days |  [optional] |
|**totalPlaidConnectionsCount** | **Integer** | The total number of times the Item has been connected to applications via Plaid |  [optional] |
|**isSavingsOrMoneyMarketAccount** | **Boolean** | Indicates if the ACH transaction funding account is a savings/money market account |  [optional] |
|**totalCreditTransactionsAmount10d** | **BigDecimal** | The total credit (inflow) transaction amount over the past 10 days from the account that will be debited |  [optional] |
|**totalDebitTransactionsAmount10d** | **BigDecimal** | The total debit (outflow) transaction amount over the past 10 days from the account that will be debited |  [optional] |
|**p50CreditTransactionsAmount28d** | **BigDecimal** | The 50th percentile of all credit (inflow) transaction amounts over the past 28 days from the account that will be debited |  [optional] |
|**p50DebitTransactionsAmount28d** | **BigDecimal** | The 50th percentile of all debit (outflow) transaction amounts over the past 28 days from the account that will be debited |  [optional] |
|**p95CreditTransactionsAmount28d** | **BigDecimal** | The 95th percentile of all credit (inflow) transaction amounts over the past 28 days from the account that will be debited |  [optional] |
|**p95DebitTransactionsAmount28d** | **BigDecimal** | The 95th percentile of all debit (outflow) transaction amounts over the past 28 days from the account that will be debited |  [optional] |
|**daysWithNegativeBalanceCount90d** | **Integer** | The number of days within the past 90 days when the account that will be debited had a negative end-of-day available balance |  [optional] |
|**p90EodBalance30d** | **BigDecimal** | The 90th percentile of the end-of-day available balance over the past 30 days of the account that will be debited |  [optional] |
|**p90EodBalance60d** | **BigDecimal** | The 90th percentile of the end-of-day available balance over the past 60 days of the account that will be debited |  [optional] |
|**p90EodBalance90d** | **BigDecimal** | The 90th percentile of the end-of-day available balance over the past 90 days of the account that will be debited |  [optional] |
|**p10EodBalance30d** | **BigDecimal** | The 10th percentile of the end-of-day available balance over the past 30 days of the account that will be debited |  [optional] |
|**p10EodBalance60d** | **BigDecimal** | The 10th percentile of the end-of-day available balance over the past 60 days of the account that will be debited |  [optional] |
|**p10EodBalance90d** | **BigDecimal** | The 10th percentile of the end-of-day available balance over the past 90 days of the account that will be debited |  [optional] |
|**availableBalance** | **BigDecimal** | Available balance, as of the &#x60;balance_last_updated&#x60; time. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account. |  [optional] |
|**currentBalance** | **BigDecimal** | Current balance, as of the &#x60;balance_last_updated&#x60; time. The current balance is the total amount of funds in the account. |  [optional] |
|**balanceLastUpdated** | **OffsetDateTime** | Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DDTHH:mm:ssZ) indicating the last time that the balance for the given account has been updated. |  [optional] |
|**phoneChangeCount28d** | **Integer** | The number of times the account&#39;s phone numbers on file have changed over the past 28 days |  [optional] |
|**phoneChangeCount90d** | **Integer** | The number of times the account&#39;s phone numbers on file have changed over the past 90 days |  [optional] |
|**emailChangeCount28d** | **Integer** | The number of times the account&#39;s email addresses on file have changed over the past 28 days |  [optional] |
|**emailChangeCount90d** | **Integer** | The number of times the account&#39;s email addresses on file have changed over the past 90 days |  [optional] |
|**addressChangeCount28d** | **Integer** | The number of times the account&#39;s addresses on file have changed over the past 28 days |  [optional] |
|**addressChangeCount90d** | **Integer** | The number of times the account&#39;s addresses on file have changed over the past 90 days |  [optional] |



