

# PaymentInitiationPaymentTokenCreateResponse

PaymentInitiationPaymentTokenCreateResponse defines the response schema for `/payment_initiation/payment/token/create`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentToken** | **String** | A &#x60;payment_token&#x60; that can be provided to Link initialization to enter the payment initiation flow |  |
|**paymentTokenExpirationTime** | **OffsetDateTime** | The date and time at which the token will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. A &#x60;payment_token&#x60; expires after 15 minutes. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



