

# AuthGetNumbers

An object containing identifying numbers used for making electronic transfers to and from the `accounts`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by any `accounts` for which data has been requested, the array for that type will be empty.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ach** | **List&lt;NumbersACH&gt;** | An array of ACH numbers identifying accounts. |  |
|**eft** | **List&lt;NumbersEFT&gt;** | An array of EFT numbers identifying accounts. |  |
|**international** | **List&lt;NumbersInternational&gt;** | An array of IBAN numbers identifying accounts. |  |
|**bacs** | **List&lt;NumbersBACS&gt;** | An array of BACS numbers identifying accounts. |  |



