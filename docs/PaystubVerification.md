

# PaystubVerification

An object containing details on the paystub's verification status. This object will only be populated if the [`income_verification.access_tokens`](/docs/api/tokens/#link-token-create-request-income-verification-access-tokens) parameter was provided during the `/link/token/create` call or if a problem was detected with the information supplied by the user; otherwise it will be `null`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationStatus** | **PaystubVerificationStatus** |  |  |
|**verificationAttributes** | **List&lt;VerificationAttribute&gt;** |  |  |



