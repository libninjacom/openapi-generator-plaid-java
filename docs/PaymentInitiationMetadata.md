

# PaymentInitiationMetadata

Metadata that captures what specific payment configurations an institution supports when making Payment Initiation requests.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supportsInternationalPayments** | **Boolean** | Indicates whether the institution supports payments from a different country. |  |
|**maximumPaymentAmount** | **Map&lt;String, String&gt;** | A mapping of currency to maximum payment amount (denominated in the smallest unit of currency) supported by the institution.  Example: &#x60;{\&quot;GBP\&quot;: \&quot;10000\&quot;}&#x60;  |  |
|**supportsRefundDetails** | **Boolean** | Indicates whether the institution supports returning refund details when initiating a payment. |  |
|**standingOrderMetadata** | **PaymentInitiationStandingOrderMetadata** |  |  |



