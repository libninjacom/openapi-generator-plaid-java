

# TransferAuthorizationProposedTransfer

Details regarding the proposed transfer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**achClass** | **ACHClass** |  |  |
|**accountId** | **String** | The Plaid &#x60;account_id&#x60; for the account that will be debited or credited. |  |
|**type** | **TransferType** |  |  |
|**user** | **TransferUserInResponse** |  |  |
|**amount** | **String** | The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). |  |
|**network** | **String** | The network or rails used for the transfer. |  |
|**originationAccountId** | **String** | Plaid&#39;s unique identifier for the origination account that was used for this transfer. |  |
|**isoCurrencyCode** | **String** | The currency of the transfer amount. The default value is \&quot;USD\&quot;. |  |



