

# Application

Metadata about the application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **String** | This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect. |  |
|**name** | **String** | The name of the application |  |
|**createdAt** | **LocalDate** | The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC. |  [optional] |
|**joinDate** | **LocalDate** | The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC. |  |
|**logoUrl** | **String** | A URL that links to the application logo image. |  |
|**applicationUrl** | **String** | The URL for the application&#39;s website |  |
|**reasonForAccess** | **String** | A string provided by the connected app stating why they use their respective enabled products. |  |



