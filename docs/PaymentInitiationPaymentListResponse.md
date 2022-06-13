

# PaymentInitiationPaymentListResponse

PaymentInitiationPaymentListResponse defines the response schema for `/payment_initiation/payment/list`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payments** | **List&lt;PaymentInitiationPayment&gt;** | An array of payments that have been created, associated with the given &#x60;client_id&#x60;. |  |
|**nextCursor** | **OffsetDateTime** | The value that, when used as the optional &#x60;cursor&#x60; parameter to &#x60;/payment_initiation/payment/list&#x60;, will return the next unreturned payment as its first payment. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



