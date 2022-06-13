

# Security

Contains details about a security

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**securityId** | **String** | A unique, Plaid-specific identifier for the security, used to associate securities with holdings. Like all Plaid identifiers, the &#x60;security_id&#x60; is case sensitive. |  |
|**isin** | **String** | 12-character ISIN, a globally unique securities identifier. |  |
|**cusip** | **String** | 9-character CUSIP, an identifier assigned to North American securities. |  |
|**sedol** | **String** | 7-character SEDOL, an identifier assigned to securities in the UK. |  |
|**institutionSecurityId** | **String** | An identifier given to the security by the institution |  |
|**institutionId** | **String** | If &#x60;institution_security_id&#x60; is present, this field indicates the Plaid &#x60;institution_id&#x60; of the institution to whom the identifier belongs. |  |
|**proxySecurityId** | **String** | In certain cases, Plaid will provide the ID of another security whose performance resembles this security, typically when the original security has low volume, or when a private security can be modeled with a publicly traded security. |  |
|**name** | **String** | A descriptive name for the security, suitable for display. |  |
|**tickerSymbol** | **String** | The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available. |  |
|**isCashEquivalent** | **Boolean** | Indicates that a security is a highly liquid asset and can be treated like cash. |  |
|**type** | **String** | The security type of the holding. Valid security types are:  &#x60;cash&#x60;: Cash, currency, and money market funds  &#x60;derivative&#x60;: Options, warrants, and other derivative instruments  &#x60;equity&#x60;: Domestic and foreign equities  &#x60;etf&#x60;: Multi-asset exchange-traded investment funds  &#x60;fixed income&#x60;: Bonds and certificates of deposit (CDs)  &#x60;loan&#x60;: Loans and loan receivables.  &#x60;mutual fund&#x60;: Open- and closed-end vehicles pooling funds of multiple investors.  &#x60;other&#x60;: Unknown or other investment types |  |
|**closePrice** | **BigDecimal** | Price of the security at the close of the previous trading session. &#x60;null&#x60; for non-public securities. If the security is a foreign currency or a cryptocurrency this field will be updated daily and will be priced in USD. |  |
|**closePriceAsOf** | **LocalDate** | Date for which &#x60;close_price&#x60; is accurate. Always &#x60;null&#x60; if &#x60;close_price&#x60; is &#x60;null&#x60;. |  |
|**isoCurrencyCode** | **String** | The ISO-4217 currency code of the price given. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;. |  |
|**unofficialCurrencyCode** | **String** | The unofficial currency code associated with the security. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s. |  |



