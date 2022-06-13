

# AccountBase

A single account at a financial institution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Plaid’s unique identifier for the account. This value will not change unless Plaid can&#39;t reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new &#x60;account_id&#x60; will be assigned to the account.  The &#x60;account_id&#x60; can also change if the &#x60;access_token&#x60; is deleted and the same credentials that were used to generate that &#x60;access_token&#x60; are used to generate a new &#x60;access_token&#x60; on a later date. In that case, the new &#x60;account_id&#x60; will be different from the old &#x60;account_id&#x60;.  If an account with a specific &#x60;account_id&#x60; disappears instead of changing, the account is likely closed. Closed accounts are not returned by the Plaid API.  Like all Plaid identifiers, the &#x60;account_id&#x60; is case sensitive. |  |
|**balances** | **AccountBalance** |  |  |
|**mask** | **String** | The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts, and it may also not match the mask that the bank displays to the user. |  |
|**name** | **String** | The name of the account, either assigned by the user or by the financial institution itself |  |
|**officialName** | **String** | The official name of the account as given by the financial institution |  |
|**type** | **AccountType** |  |  |
|**subtype** | **AccountSubtype** |  |  |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the two amounts.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified   &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.    |  [optional] |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| AUTOMATICALLY_VERIFIED | &quot;automatically_verified&quot; |
| PENDING_AUTOMATIC_VERIFICATION | &quot;pending_automatic_verification&quot; |
| PENDING_MANUAL_VERIFICATION | &quot;pending_manual_verification&quot; |
| MANUALLY_VERIFIED | &quot;manually_verified&quot; |
| VERIFICATION_EXPIRED | &quot;verification_expired&quot; |
| VERIFICATION_FAILED | &quot;verification_failed&quot; |



