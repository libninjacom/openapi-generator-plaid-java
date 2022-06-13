

# PaymentInitiationRecipientGetResponse

PaymentInitiationRecipientGetResponse defines the response schema for `/payment_initiation/recipient/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientId** | **String** | The ID of the recipient. |  |
|**name** | **String** | The name of the recipient. |  |
|**address** | **PaymentInitiationAddress** |  |  [optional] |
|**iban** | **String** | The International Bank Account Number (IBAN) for the recipient. |  [optional] |
|**bacs** | [**RecipientBACSNullable**](RecipientBACSNullable.md) |  |  [optional] |
|**emiRecipientId** | **String** | The EMI (E-Money Institution) recipient that this recipient is associated with, if any. This EMI recipient is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests. |  [optional] |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



