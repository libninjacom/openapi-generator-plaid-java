

# ConnectedApplication

Describes the connected application for a particular end user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **String** | This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect. |  |
|**name** | **String** | The name of the application |  |
|**logo** | **String** | A URL that links to the application logo image (will be deprecated in the future, please use logo_url). |  |
|**logoUrl** | **String** | A URL that links to the application logo image. |  |
|**applicationUrl** | **String** | The URL for the application&#39;s website |  |
|**reasonForAccess** | **String** | A string provided by the connected app stating why they use their respective enabled products. |  |
|**createdAt** | **LocalDate** | The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC. |  |
|**joinDate** | **LocalDate** | The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC. |  |
|**productDataTypes** | [**List&lt;ProductDataTypesEnum&gt;**](#List&lt;ProductDataTypesEnum&gt;) | (Deprecated) A list of enums representing the data collected and products enabled for this connected application. |  |
|**scopes** | [**ScopesNullable**](ScopesNullable.md) |  |  [optional] |
|**requestedScopes** | [**RequestedScopes**](RequestedScopes.md) |  |  [optional] |



## Enum: List&lt;ProductDataTypesEnum&gt;

| Name | Value |
|---- | -----|
| BALANCE | &quot;ACCOUNT_BALANCE&quot; |
| USER_INFO | &quot;ACCOUNT_USER_INFO&quot; |
| TRANSACTIONS | &quot;ACCOUNT_TRANSACTIONS&quot; |



