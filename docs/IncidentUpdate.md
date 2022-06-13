

# IncidentUpdate

An update on the health incident

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The content of the update. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the incident. |  [optional] |
|**updatedDate** | **OffsetDateTime** | The date when the update was published, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2020-10-30T15:26:48Z\&quot;&#x60;. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INVESTIGATING | &quot;INVESTIGATING&quot; |
| IDENTIFIED | &quot;IDENTIFIED&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



