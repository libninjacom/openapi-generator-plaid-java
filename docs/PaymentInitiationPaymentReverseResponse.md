

# PaymentInitiationPaymentReverseResponse

PaymentInitiationPaymentReverseResponse defines the response schema for `/payment_initation/payment/reverse`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**refundId** | **String** | A unique ID identifying the refund |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the refund.  &#x60;PROCESSING&#x60;: The refund is currently being processed. The refund will automatically exit this state when processing is complete.  &#x60;INITIATED&#x60;: The refund has been successfully initiated.  &#x60;EXECUTED&#x60;: Indicates that the refund has been successfully executed.  &#x60;FAILED&#x60;: The refund has failed to be executed. This error is retryable once the root cause is resolved. |  |
|**requestId** | **String** | A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;PROCESSING&quot; |
| EXECUTED | &quot;EXECUTED&quot; |
| INITIATED | &quot;INITIATED&quot; |
| FAILED | &quot;FAILED&quot; |



