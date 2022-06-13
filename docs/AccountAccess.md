

# AccountAccess

Allow or disallow product access by account. Unlisted (e.g. missing) accounts will be considered `new_accounts`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueId** | **String** | The unique account identifier for this account. This value must match that returned by the data access API for this account. |  |
|**authorized** | **Boolean** | Allow the application to see this account (and associated details, including balance) in the list of accounts  If unset, defaults to &#x60;true&#x60;. |  [optional] |
|**accountProductAccess** | [**AccountProductAccessNullable**](AccountProductAccessNullable.md) |  |  [optional] |



