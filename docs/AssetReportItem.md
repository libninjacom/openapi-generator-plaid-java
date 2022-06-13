

# AssetReportItem

A representation of an Item within an Asset Report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**institutionName** | **String** | The full financial institution name associated with the Item. |  |
|**institutionId** | **String** | The id of the financial institution associated with the Item. |  |
|**dateLastUpdated** | **OffsetDateTime** | The date and time when this Item’s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format. |  |
|**accounts** | [**List&lt;AccountAssets&gt;**](AccountAssets.md) | Data about each of the accounts open on the Item. |  |



