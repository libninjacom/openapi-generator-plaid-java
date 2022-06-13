

# PaymentInitiationPaymentCreateResponse

PaymentInitiationPaymentCreateResponse defines the response schema for `/payment_initiation/payment/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentId** | **String** | A unique ID identifying the payment |  |
|**status** | [**StatusEnum**](#StatusEnum) | For a payment returned by this endpoint, there is only one possible value:  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: The initial phase of the payment |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PAYMENT_STATUS_INPUT_NEEDED | &quot;PAYMENT_STATUS_INPUT_NEEDED&quot; |



