

# PendingExpirationWebhook

Fired when an Item’s access consent is expiring in 7 days. Some Items have explicit expiration times and we try to relay this when possible to reduce service disruption. This can be resolved by having the user go through Link’s update mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ITEM&#x60; |  |
|**webhookCode** | **String** | &#x60;PENDING_EXPIRATION&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**consentExpirationTime** | **OffsetDateTime** | The date and time at which the Item&#39;s access consent will expire, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format |  |



