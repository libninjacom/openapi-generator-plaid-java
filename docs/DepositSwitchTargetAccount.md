

# DepositSwitchTargetAccount

The deposit switch destination account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountNumber** | **String** | Account number for deposit switch destination |  |
|**routingNumber** | **String** | Routing number for deposit switch destination |  |
|**accountName** | **String** | The name of the deposit switch destination account, as it will be displayed to the end user in the Deposit Switch interface. It is not required to match the name used in online banking. |  |
|**accountSubtype** | [**AccountSubtypeEnum**](#AccountSubtypeEnum) | The account subtype of the account, either &#x60;checking&#x60; or &#x60;savings&#x60;. |  |



## Enum: AccountSubtypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;checking&quot; |
| SAVINGS | &quot;savings&quot; |



