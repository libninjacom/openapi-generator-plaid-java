

# AssetReport

An object representing an Asset Report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetReportId** | **String** | A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive. |  |
|**clientReportId** | **String** | An identifier you determine and submit for the Asset Report. |  |
|**dateGenerated** | **OffsetDateTime** | The date and time when the Asset Report was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \&quot;2018-04-12T03:32:11Z\&quot;). |  |
|**daysRequested** | **BigDecimal** | The duration of transaction history you requested |  |
|**user** | **AssetReportUser** |  |  |
|**items** | **List&lt;AssetReportItem&gt;** | Data returned by Plaid about each of the Items included in the Asset Report. |  |



