

# PaymentInitiationPaymentGetResponse

PaymentInitiationPaymentGetResponse defines the response schema for `/payment_initation/payment/get`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | The ID of the payment. Like all Plaid identifiers, the &#x60;payment_id&#x60; is case sensitive. |  |
|**amount** | **PaymentAmount** |  |  |
|**status** | **PaymentInitiationPaymentStatus** |  |  |
|**recipientId** | **String** | The ID of the recipient |  |
|**reference** | **String** | A reference for the payment. |  |
|**adjustedReference** | **String** | The value of the reference sent to the bank after adjustment to pass bank validation rules. |  [optional] |
|**lastStatusUpdate** | **OffsetDateTime** | The date and time of the last time the &#x60;status&#x60; was updated, in IS0 8601 format |  |
|**schedule** | [**ExternalPaymentScheduleGet**](ExternalPaymentScheduleGet.md) |  |  [optional] |
|**refundDetails** | [**ExternalPaymentRefundDetails**](ExternalPaymentRefundDetails.md) |  |  [optional] |
|**bacs** | [**SenderBACSNullable**](SenderBACSNullable.md) |  |  |
|**iban** | **String** | The International Bank Account Number (IBAN) for the sender, if specified in the &#x60;/payment_initiation/payment/create&#x60; call. |  |
|**initiatedRefunds** | **List&lt;PaymentInitiationRefund&gt;** | Initiated refunds associated with the payment. |  [optional] |
|**walletId** | **String** | The EMI (E-Money Institution) wallet that this payment is associated with, if any. This wallet is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests. |  [optional] |
|**scheme** | **PaymentScheme** |  |  [optional] |
|**adjustedScheme** | **PaymentScheme** |  |  [optional] |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



