

# UserPermissionRevokedWebhook

The `USER_PERMISSION_REVOKED` webhook is fired to when an end user has used the [my.plaid.com portal](https://my.plaid.com) to revoke the permission that they previously granted to access an Item. Once access to an Item has been revoked, it cannot be restored. If the user subsequently returns to your application, a new Item must be created for the user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookType** | **String** | &#x60;ITEM&#x60; |  |
|**webhookCode** | **String** | &#x60;USER_PERMISSION_REVOKED&#x60; |  |
|**itemId** | **String** | The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error |  |
|**error** | [**PlaidError**](PlaidError.md) |  |  [optional] |



