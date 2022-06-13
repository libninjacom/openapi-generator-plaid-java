

# BankTransferMigrateAccountRequest

Defines the request schema for `/bank_transfer/migrate_account`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body. |  [optional] |
|**secret** | **String** | Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body. |  [optional] |
|**accountNumber** | **String** | The user&#39;s account number. |  |
|**routingNumber** | **String** | The user&#39;s routing number. |  |
|**accountType** | **String** | The type of the bank account (&#x60;checking&#x60; or &#x60;savings&#x60;). |  |



