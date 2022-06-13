

# StandaloneAccountType

The schema below describes the various `types` and corresponding `subtypes` that Plaid recognizes and reports for financial institution accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**depository** | **String** | An account type holding cash, in which funds are deposited. Supported products for &#x60;depository&#x60; accounts are: Auth (&#x60;checking&#x60; and &#x60;savings&#x60; types only), Balance, Transactions, Identity, Payment Initiation, and Assets. |  |
|**credit** | **String** | A credit card type account. Supported products for &#x60;credit&#x60; accounts are: Balance, Transactions, Identity, and Liabilities. |  |
|**loan** | **String** | A loan type account. Supported products for &#x60;loan&#x60; accounts are: Balance, Liabilities, and Transactions. |  |
|**investment** | **String** | An investment account. Supported products for &#x60;investment&#x60; accounts are: Balance and Investments. In API versions 2018-05-22 and earlier, this type is called &#x60;brokerage&#x60;. |  |
|**other** | **String** | Other or unknown account type. Supported products for &#x60;other&#x60; accounts are: Balance, Transactions, Identity, and Assets. |  |



