

# PaymentInitiationAddress

The optional address of the payment recipient. This object is not currently required to make payments from UK institutions and should not be populated, though may be necessary for future European expansion.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**street** | **List&lt;String&gt;** | An array of length 1-2 representing the street address where the recipient is located. Maximum of 70 characters. |  |
|**city** | **String** | The city where the recipient is located. Maximum of 35 characters. |  |
|**postalCode** | **String** | The postal code where the recipient is located. Maximum of 16 characters. |  |
|**country** | **String** | The ISO 3166-1 alpha-2 country code where the recipient is located. |  |



