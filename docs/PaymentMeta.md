

# PaymentMeta

Transaction information specific to inter-bank transfers. If the transaction was not an inter-bank transfer, all fields will be `null`.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/get`, the `payment_meta` key will always appear, but no data elements are guaranteed. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceNumber** | **String** | The transaction reference number supplied by the financial institution. |  |
|**ppdId** | **String** | The ACH PPD ID for the payer. |  |
|**payee** | **String** | For transfers, the party that is receiving the transaction. |  |
|**byOrderOf** | **String** | The party initiating a wire transfer. Will be &#x60;null&#x60; if the transaction is not a wire transfer. |  |
|**payer** | **String** | For transfers, the party that is paying the transaction. |  |
|**paymentMethod** | **String** | The type of transfer, e.g. &#39;ACH&#39; |  |
|**paymentProcessor** | **String** | The name of the payment processor |  |
|**reason** | **String** | The payer-supplied description of the transfer. |  |



