# PlaidApi

All URIs are relative to *https://production.plaid.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountsBalanceGet**](PlaidApi.md#accountsBalanceGet) | **POST** /accounts/balance/get | Retrieve real-time balance data |
| [**accountsGet**](PlaidApi.md#accountsGet) | **POST** /accounts/get | Retrieve accounts |
| [**applicationGet**](PlaidApi.md#applicationGet) | **POST** /application/get | Retrieve information about a Plaid application |
| [**assetReportAuditCopyCreate**](PlaidApi.md#assetReportAuditCopyCreate) | **POST** /asset_report/audit_copy/create | Create Asset Report Audit Copy |
| [**assetReportAuditCopyGet**](PlaidApi.md#assetReportAuditCopyGet) | **POST** /asset_report/audit_copy/get | Retrieve an Asset Report Audit Copy |
| [**assetReportAuditCopyRemove**](PlaidApi.md#assetReportAuditCopyRemove) | **POST** /asset_report/audit_copy/remove | Remove Asset Report Audit Copy |
| [**assetReportCreate**](PlaidApi.md#assetReportCreate) | **POST** /asset_report/create | Create an Asset Report |
| [**assetReportFilter**](PlaidApi.md#assetReportFilter) | **POST** /asset_report/filter | Filter Asset Report |
| [**assetReportGet**](PlaidApi.md#assetReportGet) | **POST** /asset_report/get | Retrieve an Asset Report |
| [**assetReportPdfGet**](PlaidApi.md#assetReportPdfGet) | **POST** /asset_report/pdf/get | Retrieve a PDF Asset Report |
| [**assetReportRefresh**](PlaidApi.md#assetReportRefresh) | **POST** /asset_report/refresh | Refresh an Asset Report |
| [**assetReportRemove**](PlaidApi.md#assetReportRemove) | **POST** /asset_report/remove | Delete an Asset Report |
| [**authGet**](PlaidApi.md#authGet) | **POST** /auth/get | Retrieve auth data |
| [**bankTransferBalanceGet**](PlaidApi.md#bankTransferBalanceGet) | **POST** /bank_transfer/balance/get | Get balance of your Bank Transfer account |
| [**bankTransferCancel**](PlaidApi.md#bankTransferCancel) | **POST** /bank_transfer/cancel | Cancel a bank transfer |
| [**bankTransferCreate**](PlaidApi.md#bankTransferCreate) | **POST** /bank_transfer/create | Create a bank transfer |
| [**bankTransferEventList**](PlaidApi.md#bankTransferEventList) | **POST** /bank_transfer/event/list | List bank transfer events |
| [**bankTransferEventSync**](PlaidApi.md#bankTransferEventSync) | **POST** /bank_transfer/event/sync | Sync bank transfer events |
| [**bankTransferGet**](PlaidApi.md#bankTransferGet) | **POST** /bank_transfer/get | Retrieve a bank transfer |
| [**bankTransferList**](PlaidApi.md#bankTransferList) | **POST** /bank_transfer/list | List bank transfers |
| [**bankTransferMigrateAccount**](PlaidApi.md#bankTransferMigrateAccount) | **POST** /bank_transfer/migrate_account | Migrate account into Bank Transfers |
| [**bankTransferSweepGet**](PlaidApi.md#bankTransferSweepGet) | **POST** /bank_transfer/sweep/get | Retrieve a sweep |
| [**bankTransferSweepList**](PlaidApi.md#bankTransferSweepList) | **POST** /bank_transfer/sweep/list | List sweeps |
| [**categoriesGet**](PlaidApi.md#categoriesGet) | **POST** /categories/get | Get Categories |
| [**createPaymentToken**](PlaidApi.md#createPaymentToken) | **POST** /payment_initiation/payment/token/create | Create payment token |
| [**depositSwitchAltCreate**](PlaidApi.md#depositSwitchAltCreate) | **POST** /deposit_switch/alt/create | Create a deposit switch without using Plaid Exchange |
| [**depositSwitchCreate**](PlaidApi.md#depositSwitchCreate) | **POST** /deposit_switch/create | Create a deposit switch |
| [**depositSwitchGet**](PlaidApi.md#depositSwitchGet) | **POST** /deposit_switch/get | Retrieve a deposit switch |
| [**depositSwitchTokenCreate**](PlaidApi.md#depositSwitchTokenCreate) | **POST** /deposit_switch/token/create | Create a deposit switch token |
| [**employersSearch**](PlaidApi.md#employersSearch) | **POST** /employers/search | Search employer database |
| [**employmentVerificationGet**](PlaidApi.md#employmentVerificationGet) | **POST** /employment/verification/get | Retrieve a summary of an individual&#39;s employment information |
| [**identityGet**](PlaidApi.md#identityGet) | **POST** /identity/get | Retrieve identity data |
| [**incomeVerificationCreate**](PlaidApi.md#incomeVerificationCreate) | **POST** /income/verification/create | (Deprecated) Create an income verification instance |
| [**incomeVerificationDocumentsDownload**](PlaidApi.md#incomeVerificationDocumentsDownload) | **POST** /income/verification/documents/download | Download the original documents used for income verification |
| [**incomeVerificationPaystubGet**](PlaidApi.md#incomeVerificationPaystubGet) | **POST** /income/verification/paystub/get | (Deprecated) Retrieve information from a single paystub used for income verification |
| [**incomeVerificationPaystubsGet**](PlaidApi.md#incomeVerificationPaystubsGet) | **POST** /income/verification/paystubs/get | Retrieve information from the paystubs used for income verification |
| [**incomeVerificationPrecheck**](PlaidApi.md#incomeVerificationPrecheck) | **POST** /income/verification/precheck | Check digital income verification eligibility and optimize conversion |
| [**incomeVerificationRefresh**](PlaidApi.md#incomeVerificationRefresh) | **POST** /income/verification/refresh | Refresh an income verification |
| [**incomeVerificationSummaryGet**](PlaidApi.md#incomeVerificationSummaryGet) | **POST** /income/verification/summary/get | (Deprecated) Retrieve a summary of information derived from income verification |
| [**incomeVerificationTaxformsGet**](PlaidApi.md#incomeVerificationTaxformsGet) | **POST** /income/verification/taxforms/get | Retrieve information from the tax documents used for income verification |
| [**institutionsGet**](PlaidApi.md#institutionsGet) | **POST** /institutions/get | Get details of all supported institutions |
| [**institutionsGetById**](PlaidApi.md#institutionsGetById) | **POST** /institutions/get_by_id | Get details of an institution |
| [**institutionsSearch**](PlaidApi.md#institutionsSearch) | **POST** /institutions/search | Search institutions |
| [**investmentsHoldingsGet**](PlaidApi.md#investmentsHoldingsGet) | **POST** /investments/holdings/get | Get Investment holdings |
| [**investmentsTransactionsGet**](PlaidApi.md#investmentsTransactionsGet) | **POST** /investments/transactions/get | Get investment transactions |
| [**itemAccessTokenInvalidate**](PlaidApi.md#itemAccessTokenInvalidate) | **POST** /item/access_token/invalidate | Invalidate access_token |
| [**itemApplicationList**](PlaidApi.md#itemApplicationList) | **POST** /item/application/list | List a user’s connected applications |
| [**itemApplicationScopesUpdate**](PlaidApi.md#itemApplicationScopesUpdate) | **POST** /item/application/scopes/update | Update the scopes of access for a particular application |
| [**itemCreatePublicToken**](PlaidApi.md#itemCreatePublicToken) | **POST** /item/public_token/create | Create public token |
| [**itemGet**](PlaidApi.md#itemGet) | **POST** /item/get | Retrieve an Item |
| [**itemImport**](PlaidApi.md#itemImport) | **POST** /item/import | Import Item |
| [**itemPublicTokenExchange**](PlaidApi.md#itemPublicTokenExchange) | **POST** /item/public_token/exchange | Exchange public token for an access token |
| [**itemRemove**](PlaidApi.md#itemRemove) | **POST** /item/remove | Remove an Item |
| [**itemWebhookUpdate**](PlaidApi.md#itemWebhookUpdate) | **POST** /item/webhook/update | Update Webhook URL |
| [**liabilitiesGet**](PlaidApi.md#liabilitiesGet) | **POST** /liabilities/get | Retrieve Liabilities data |
| [**linkTokenCreate**](PlaidApi.md#linkTokenCreate) | **POST** /link/token/create | Create Link Token |
| [**linkTokenGet**](PlaidApi.md#linkTokenGet) | **POST** /link/token/get | Get Link Token |
| [**paymentInitiationPaymentCreate**](PlaidApi.md#paymentInitiationPaymentCreate) | **POST** /payment_initiation/payment/create | Create a payment |
| [**paymentInitiationPaymentGet**](PlaidApi.md#paymentInitiationPaymentGet) | **POST** /payment_initiation/payment/get | Get payment details |
| [**paymentInitiationPaymentList**](PlaidApi.md#paymentInitiationPaymentList) | **POST** /payment_initiation/payment/list | List payments |
| [**paymentInitiationPaymentReverse**](PlaidApi.md#paymentInitiationPaymentReverse) | **POST** /payment_initiation/payment/reverse | Reverse an existing payment |
| [**paymentInitiationRecipientCreate**](PlaidApi.md#paymentInitiationRecipientCreate) | **POST** /payment_initiation/recipient/create | Create payment recipient |
| [**paymentInitiationRecipientGet**](PlaidApi.md#paymentInitiationRecipientGet) | **POST** /payment_initiation/recipient/get | Get payment recipient |
| [**paymentInitiationRecipientList**](PlaidApi.md#paymentInitiationRecipientList) | **POST** /payment_initiation/recipient/list | List payment recipients |
| [**processorApexProcessorTokenCreate**](PlaidApi.md#processorApexProcessorTokenCreate) | **POST** /processor/apex/processor_token/create | Create Apex bank account token |
| [**processorAuthGet**](PlaidApi.md#processorAuthGet) | **POST** /processor/auth/get | Retrieve Auth data |
| [**processorBalanceGet**](PlaidApi.md#processorBalanceGet) | **POST** /processor/balance/get | Retrieve Balance data |
| [**processorBankTransferCreate**](PlaidApi.md#processorBankTransferCreate) | **POST** /processor/bank_transfer/create | Create a bank transfer as a processor |
| [**processorIdentityGet**](PlaidApi.md#processorIdentityGet) | **POST** /processor/identity/get | Retrieve Identity data |
| [**processorStripeBankAccountTokenCreate**](PlaidApi.md#processorStripeBankAccountTokenCreate) | **POST** /processor/stripe/bank_account_token/create | Create Stripe bank account token |
| [**processorTokenCreate**](PlaidApi.md#processorTokenCreate) | **POST** /processor/token/create | Create processor token |
| [**sandboxBankTransferFireWebhook**](PlaidApi.md#sandboxBankTransferFireWebhook) | **POST** /sandbox/bank_transfer/fire_webhook | Manually fire a Bank Transfer webhook |
| [**sandboxBankTransferSimulate**](PlaidApi.md#sandboxBankTransferSimulate) | **POST** /sandbox/bank_transfer/simulate | Simulate a bank transfer event in Sandbox |
| [**sandboxIncomeFireWebhook**](PlaidApi.md#sandboxIncomeFireWebhook) | **POST** /sandbox/income/fire_webhook | Manually fire an Income webhook |
| [**sandboxItemFireWebhook**](PlaidApi.md#sandboxItemFireWebhook) | **POST** /sandbox/item/fire_webhook | Fire a test webhook |
| [**sandboxItemResetLogin**](PlaidApi.md#sandboxItemResetLogin) | **POST** /sandbox/item/reset_login | Force a Sandbox Item into an error state |
| [**sandboxItemSetVerificationStatus**](PlaidApi.md#sandboxItemSetVerificationStatus) | **POST** /sandbox/item/set_verification_status | Set verification status for Sandbox account |
| [**sandboxOauthSelectAccounts**](PlaidApi.md#sandboxOauthSelectAccounts) | **POST** /sandbox/oauth/select_accounts | Save the selected accounts when connecting to the Platypus Oauth institution |
| [**sandboxProcessorTokenCreate**](PlaidApi.md#sandboxProcessorTokenCreate) | **POST** /sandbox/processor_token/create | Create a test Item and processor token |
| [**sandboxPublicTokenCreate**](PlaidApi.md#sandboxPublicTokenCreate) | **POST** /sandbox/public_token/create | Create a test Item |
| [**sandboxTransferRepaymentSimulate**](PlaidApi.md#sandboxTransferRepaymentSimulate) | **POST** /sandbox/transfer/repayment/simulate | Trigger the creation of a repayment |
| [**sandboxTransferSimulate**](PlaidApi.md#sandboxTransferSimulate) | **POST** /sandbox/transfer/simulate | Simulate a transfer event in Sandbox |
| [**sandboxTransferSweepSimulate**](PlaidApi.md#sandboxTransferSweepSimulate) | **POST** /sandbox/transfer/sweep/simulate | Simulate creating a sweep |
| [**signalDecisionReport**](PlaidApi.md#signalDecisionReport) | **POST** /signal/decision/report | Report whether you initiated an ACH transaction |
| [**signalEvaluate**](PlaidApi.md#signalEvaluate) | **POST** /signal/evaluate | Evaluate a planned ACH transaction |
| [**signalReturnReport**](PlaidApi.md#signalReturnReport) | **POST** /signal/return/report | Report a return for an ACH transaction |
| [**transactionsGet**](PlaidApi.md#transactionsGet) | **POST** /transactions/get | Get transaction data |
| [**transactionsRecurringGet**](PlaidApi.md#transactionsRecurringGet) | **POST** /transactions/recurring/get | Get streams of recurring transactions |
| [**transactionsRefresh**](PlaidApi.md#transactionsRefresh) | **POST** /transactions/refresh | Refresh transaction data |
| [**transactionsSync**](PlaidApi.md#transactionsSync) | **POST** /transactions/sync | Get incremental transaction updates on an Item |
| [**transferAuthorizationCreate**](PlaidApi.md#transferAuthorizationCreate) | **POST** /transfer/authorization/create | Create a transfer authorization |
| [**transferCancel**](PlaidApi.md#transferCancel) | **POST** /transfer/cancel | Cancel a transfer |
| [**transferCreate**](PlaidApi.md#transferCreate) | **POST** /transfer/create | Create a transfer |
| [**transferEventList**](PlaidApi.md#transferEventList) | **POST** /transfer/event/list | List transfer events |
| [**transferEventSync**](PlaidApi.md#transferEventSync) | **POST** /transfer/event/sync | Sync transfer events |
| [**transferGet**](PlaidApi.md#transferGet) | **POST** /transfer/get | Retrieve a transfer |
| [**transferIntentCreate**](PlaidApi.md#transferIntentCreate) | **POST** /transfer/intent/create | Create a transfer intent object to invoke the Transfer UI |
| [**transferIntentGet**](PlaidApi.md#transferIntentGet) | **POST** /transfer/intent/get | Retrieve more information about a transfer intent |
| [**transferList**](PlaidApi.md#transferList) | **POST** /transfer/list | List transfers |
| [**transferRepaymentList**](PlaidApi.md#transferRepaymentList) | **POST** /transfer/repayment/list | Lists historical repayments |
| [**transferRepaymentReturnList**](PlaidApi.md#transferRepaymentReturnList) | **POST** /transfer/repayment/return/list | List the returns included in a repayment |
| [**transferSweepGet**](PlaidApi.md#transferSweepGet) | **POST** /transfer/sweep/get | Retrieve a sweep |
| [**transferSweepList**](PlaidApi.md#transferSweepList) | **POST** /transfer/sweep/list | List sweeps |
| [**walletGet**](PlaidApi.md#walletGet) | **POST** /wallet/get | Fetch an e-wallet |
| [**walletTransactionExecute**](PlaidApi.md#walletTransactionExecute) | **POST** /wallet/transaction/execute | Execute a transaction using an e-wallet |
| [**walletTransactionsList**](PlaidApi.md#walletTransactionsList) | **POST** /wallet/transactions/list | List e-wallet transactions |
| [**webhookVerificationKeyGet**](PlaidApi.md#webhookVerificationKeyGet) | **POST** /webhook_verification_key/get | Get webhook verification key |


<a name="accountsBalanceGet"></a>
# **accountsBalanceGet**
> AccountsGetResponse accountsBalanceGet(accountsBalanceGetRequest)

Retrieve real-time balance data

The &#x60;/accounts/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/accounts/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. This endpoint can be used for existing Items that were added via any of Plaid’s other products. This endpoint can be used as long as Link has been initialized with any other product, &#x60;balance&#x60; itself is not a product that can be used to initialize Link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AccountsBalanceGetRequest accountsBalanceGetRequest = new AccountsBalanceGetRequest(); // AccountsBalanceGetRequest | 
    try {
      AccountsGetResponse result = apiInstance.accountsBalanceGet(accountsBalanceGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#accountsBalanceGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountsBalanceGetRequest** | [**AccountsBalanceGetRequest**](AccountsBalanceGetRequest.md)|  | |

### Return type

[**AccountsGetResponse**](AccountsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="accountsGet"></a>
# **accountsGet**
> AccountsGetResponse accountsGet(accountsGetRequest)

Retrieve accounts

The &#x60;/accounts/get&#x60; endpoint can be used to retrieve a list of accounts associated with any linked Item. Plaid will only return active bank accounts — that is, accounts that are not closed and are capable of carrying a balance.  This endpoint only returns accounts that were permissioned by the user when they initially created the Item. If a user creates a new account after the initial link, you can capture this event through the [&#x60;NEW_ACCOUNTS_AVAILABLE&#x60;](https://plaid.com/docs/api/webhooks/#item-new_accounts_available) webhook and then use Link&#39;s [update mode](https://plaid.com/docs/link/update-mode/) to request that the user share this new account with you.  This endpoint retrieves cached information, rather than extracting fresh information from the institution. As a result, balances returned may not be up-to-date; for realtime balance information, use &#x60;/accounts/balance/get&#x60; instead. Note that some information is nullable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AccountsGetRequest accountsGetRequest = new AccountsGetRequest(); // AccountsGetRequest | 
    try {
      AccountsGetResponse result = apiInstance.accountsGet(accountsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#accountsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountsGetRequest** | [**AccountsGetRequest**](AccountsGetRequest.md)|  | |

### Return type

[**AccountsGetResponse**](AccountsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="applicationGet"></a>
# **applicationGet**
> ApplicationGetResponse applicationGet(applicationGetRequest)

Retrieve information about a Plaid application

Allows financial institutions to retrieve information about Plaid clients for the purpose of building control-tower experiences

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ApplicationGetRequest applicationGetRequest = new ApplicationGetRequest(); // ApplicationGetRequest | 
    try {
      ApplicationGetResponse result = apiInstance.applicationGet(applicationGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#applicationGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **applicationGetRequest** | [**ApplicationGetRequest**](ApplicationGetRequest.md)|  | |

### Return type

[**ApplicationGetResponse**](ApplicationGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="assetReportAuditCopyCreate"></a>
# **assetReportAuditCopyCreate**
> AssetReportAuditCopyCreateResponse assetReportAuditCopyCreate(assetReportAuditCopyCreateRequest)

Create Asset Report Audit Copy

Plaid can provide an Audit Copy of any Asset Report directly to a participating third party on your behalf. For example, Plaid can supply an Audit Copy directly to Fannie Mae on your behalf if you participate in the Day 1 Certainty™ program. An Audit Copy contains the same underlying data as the Asset Report.  To grant access to an Audit Copy, use the &#x60;/asset_report/audit_copy/create&#x60; endpoint to create an &#x60;audit_copy_token&#x60; and then pass that token to the third party who needs access. Each third party has its own &#x60;auditor_id&#x60;, for example &#x60;fannie_mae&#x60;. You’ll need to create a separate Audit Copy for each third party to whom you want to grant access to the Report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportAuditCopyCreateRequest assetReportAuditCopyCreateRequest = new AssetReportAuditCopyCreateRequest(); // AssetReportAuditCopyCreateRequest | 
    try {
      AssetReportAuditCopyCreateResponse result = apiInstance.assetReportAuditCopyCreate(assetReportAuditCopyCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportAuditCopyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportAuditCopyCreateRequest** | [**AssetReportAuditCopyCreateRequest**](AssetReportAuditCopyCreateRequest.md)|  | |

### Return type

[**AssetReportAuditCopyCreateResponse**](AssetReportAuditCopyCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportAuditCopyGet"></a>
# **assetReportAuditCopyGet**
> AssetReportGetResponse assetReportAuditCopyGet(assetReportAuditCopyGetRequest)

Retrieve an Asset Report Audit Copy

&#x60;/asset_report/audit_copy/get&#x60; allows auditors to get a copy of an Asset Report that was previously shared via the &#x60;/asset_report/audit_copy/create&#x60; endpoint.  The caller of &#x60;/asset_report/audit_copy/create&#x60; must provide the &#x60;audit_copy_token&#x60; to the auditor.  This token can then be used to call &#x60;/asset_report/audit_copy/create&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportAuditCopyGetRequest assetReportAuditCopyGetRequest = new AssetReportAuditCopyGetRequest(); // AssetReportAuditCopyGetRequest | 
    try {
      AssetReportGetResponse result = apiInstance.assetReportAuditCopyGet(assetReportAuditCopyGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportAuditCopyGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportAuditCopyGetRequest** | [**AssetReportAuditCopyGetRequest**](AssetReportAuditCopyGetRequest.md)|  | |

### Return type

[**AssetReportGetResponse**](AssetReportGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportAuditCopyRemove"></a>
# **assetReportAuditCopyRemove**
> AssetReportAuditCopyRemoveResponse assetReportAuditCopyRemove(assetReportAuditCopyRemoveRequest)

Remove Asset Report Audit Copy

The &#x60;/asset_report/audit_copy/remove&#x60; endpoint allows you to remove an Audit Copy. Removing an Audit Copy invalidates the &#x60;audit_copy_token&#x60; associated with it, meaning both you and any third parties holding the token will no longer be able to use it to access Report data. Items associated with the Asset Report, the Asset Report itself and other Audit Copies of it are not affected and will remain accessible after removing the given Audit Copy.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportAuditCopyRemoveRequest assetReportAuditCopyRemoveRequest = new AssetReportAuditCopyRemoveRequest(); // AssetReportAuditCopyRemoveRequest | 
    try {
      AssetReportAuditCopyRemoveResponse result = apiInstance.assetReportAuditCopyRemove(assetReportAuditCopyRemoveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportAuditCopyRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportAuditCopyRemoveRequest** | [**AssetReportAuditCopyRemoveRequest**](AssetReportAuditCopyRemoveRequest.md)|  | |

### Return type

[**AssetReportAuditCopyRemoveResponse**](AssetReportAuditCopyRemoveResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportCreate"></a>
# **assetReportCreate**
> AssetReportCreateResponse assetReportCreate(assetReportCreateRequest)

Create an Asset Report

The &#x60;/asset_report/create&#x60; endpoint initiates the process of creating an Asset Report, which can then be retrieved by passing the &#x60;asset_report_token&#x60; return value to the &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; endpoints.  The Asset Report takes some time to be created and is not available immediately after calling &#x60;/asset_report/create&#x60;. When the Asset Report is ready to be retrieved using &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60;, Plaid will fire a &#x60;PRODUCT_READY&#x60; webhook. For full details of the webhook schema, see [Asset Report webhooks](https://plaid.com/docs/api/webhooks/#assets-webhooks).  The &#x60;/asset_report/create&#x60; endpoint creates an Asset Report at a moment in time. Asset Reports are immutable. To get an updated Asset Report, use the &#x60;/asset_report/refresh&#x60; endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportCreateRequest assetReportCreateRequest = new AssetReportCreateRequest(); // AssetReportCreateRequest | 
    try {
      AssetReportCreateResponse result = apiInstance.assetReportCreate(assetReportCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportCreateRequest** | [**AssetReportCreateRequest**](AssetReportCreateRequest.md)|  | |

### Return type

[**AssetReportCreateResponse**](AssetReportCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportFilter"></a>
# **assetReportFilter**
> AssetReportFilterResponse assetReportFilter(assetReportFilterRequest)

Filter Asset Report

By default, an Asset Report will contain all of the accounts on a given Item. In some cases, you may not want the Asset Report to contain all accounts. For example, you might have the end user choose which accounts are relevant in Link using the Account Select view, which you can enable in the dashboard. Or, you might always exclude certain account types or subtypes, which you can identify by using the &#x60;/accounts/get&#x60; endpoint. To narrow an Asset Report to only a subset of accounts, use the &#x60;/asset_report/filter&#x60; endpoint.  To exclude certain Accounts from an Asset Report, first use the &#x60;/asset_report/create&#x60; endpoint to create the report, then send the &#x60;asset_report_token&#x60; along with a list of &#x60;account_ids&#x60; to exclude to the &#x60;/asset_report/filter&#x60; endpoint, to create a new Asset Report which contains only a subset of the original Asset Report&#39;s data.  Because Asset Reports are immutable, calling &#x60;/asset_report/filter&#x60; does not alter the original Asset Report in any way; rather, &#x60;/asset_report/filter&#x60; creates a new Asset Report with a new token and id. Asset Reports created via &#x60;/asset_report/filter&#x60; do not contain new Asset data, and are not billed.  Plaid will fire a [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook once generation of the filtered Asset Report has completed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportFilterRequest assetReportFilterRequest = new AssetReportFilterRequest(); // AssetReportFilterRequest | 
    try {
      AssetReportFilterResponse result = apiInstance.assetReportFilter(assetReportFilterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportFilterRequest** | [**AssetReportFilterRequest**](AssetReportFilterRequest.md)|  | |

### Return type

[**AssetReportFilterResponse**](AssetReportFilterResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportGet"></a>
# **assetReportGet**
> AssetReportGetResponse assetReportGet(assetReportGetRequest)

Retrieve an Asset Report

The &#x60;/asset_report/get&#x60; endpoint retrieves the Asset Report in JSON format. Before calling &#x60;/asset_report/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  By default, an Asset Report includes transaction descriptions as returned by the bank, as opposed to parsed and categorized by Plaid. You can also receive cleaned and categorized transactions, as well as additional insights like merchant name or location information. We call this an Asset Report with Insights. An Asset Report with Insights provides transaction category, location, and merchant information in addition to the transaction strings provided in a standard Asset Report.  To retrieve an Asset Report with Insights, call the &#x60;/asset_report/get&#x60; endpoint with &#x60;include_insights&#x60; set to &#x60;true&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportGetRequest assetReportGetRequest = new AssetReportGetRequest(); // AssetReportGetRequest | 
    try {
      AssetReportGetResponse result = apiInstance.assetReportGet(assetReportGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportGetRequest** | [**AssetReportGetRequest**](AssetReportGetRequest.md)|  | |

### Return type

[**AssetReportGetResponse**](AssetReportGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportPdfGet"></a>
# **assetReportPdfGet**
> File assetReportPdfGet(assetReportPDFGetRequest)

Retrieve a PDF Asset Report

The &#x60;/asset_report/pdf/get&#x60; endpoint retrieves the Asset Report in PDF format. Before calling &#x60;/asset_report/pdf/get&#x60;, you must first create the Asset Report using &#x60;/asset_report/create&#x60; (or filter an Asset Report using &#x60;/asset_report/filter&#x60;) and then wait for the [&#x60;PRODUCT_READY&#x60;](https://plaid.com/docs/api/webhooks) webhook to fire, indicating that the Report is ready to be retrieved.  The response to &#x60;/asset_report/pdf/get&#x60; is the PDF binary data. The &#x60;request_id&#x60;  is returned in the &#x60;Plaid-Request-ID&#x60; header.  [View a sample PDF Asset Report](https://plaid.com/documents/sample-asset-report.pdf).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportPDFGetRequest assetReportPDFGetRequest = new AssetReportPDFGetRequest(); // AssetReportPDFGetRequest | 
    try {
      File result = apiInstance.assetReportPdfGet(assetReportPDFGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportPdfGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportPDFGetRequest** | [**AssetReportPDFGetRequest**](AssetReportPDFGetRequest.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A PDF of the Asset Report |  -  |

<a name="assetReportRefresh"></a>
# **assetReportRefresh**
> AssetReportRefreshResponse assetReportRefresh(assetReportRefreshRequest)

Refresh an Asset Report

An Asset Report is an immutable snapshot of a user&#39;s assets. In order to \&quot;refresh\&quot; an Asset Report you created previously, you can use the &#x60;/asset_report/refresh&#x60; endpoint to create a new Asset Report based on the old one, but with the most recent data available.  The new Asset Report will contain the same Items as the original Report, as well as the same filters applied by any call to &#x60;/asset_report/filter&#x60;. By default, the new Asset Report will also use the same parameters you submitted with your original &#x60;/asset_report/create&#x60; request, but the original &#x60;days_requested&#x60; value and the values of any parameters in the &#x60;options&#x60; object can be overridden with new values. To change these arguments, simply supply new values for them in your request to &#x60;/asset_report/refresh&#x60;. Submit an empty string (\&quot;\&quot;) for any previously-populated fields you would like set as empty.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportRefreshRequest assetReportRefreshRequest = new AssetReportRefreshRequest(); // AssetReportRefreshRequest | 
    try {
      AssetReportRefreshResponse result = apiInstance.assetReportRefresh(assetReportRefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportRefresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportRefreshRequest** | [**AssetReportRefreshRequest**](AssetReportRefreshRequest.md)|  | |

### Return type

[**AssetReportRefreshResponse**](AssetReportRefreshResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assetReportRemove"></a>
# **assetReportRemove**
> AssetReportRemoveResponse assetReportRemove(assetReportRemoveRequest)

Delete an Asset Report

The &#x60;/item/remove&#x60; endpoint allows you to invalidate an &#x60;access_token&#x60;, meaning you will not be able to create new Asset Reports with it. Removing an Item does not affect any Asset Reports or Audit Copies you have already created, which will remain accessible until you remove them specifically.  The &#x60;/asset_report/remove&#x60; endpoint allows you to remove an Asset Report. Removing an Asset Report invalidates its &#x60;asset_report_token&#x60;, meaning you will no longer be able to use it to access Report data or create new Audit Copies. Removing an Asset Report does not affect the underlying Items, but does invalidate any &#x60;audit_copy_tokens&#x60; associated with the Asset Report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AssetReportRemoveRequest assetReportRemoveRequest = new AssetReportRemoveRequest(); // AssetReportRemoveRequest | 
    try {
      AssetReportRemoveResponse result = apiInstance.assetReportRemove(assetReportRemoveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#assetReportRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetReportRemoveRequest** | [**AssetReportRemoveRequest**](AssetReportRemoveRequest.md)|  | |

### Return type

[**AssetReportRemoveResponse**](AssetReportRemoveResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="authGet"></a>
# **authGet**
> AuthGetResponse authGet(authGetRequest)

Retrieve auth data

The &#x60;/auth/get&#x60; endpoint returns the bank account and bank identification numbers (such as routing numbers, for US accounts) associated with an Item&#39;s checking and savings accounts, along with high-level account data and balances when available.  Note: This request may take some time to complete if &#x60;auth&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.  Also note that &#x60;/auth/get&#x60; will not return data for any new accounts opened after the Item was created. To obtain data for new accounts, create a new Item.  Versioning note: In API version 2017-03-08, the schema of the &#x60;numbers&#x60; object returned by this endpoint is substantially different. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2018-05-22).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    AuthGetRequest authGetRequest = new AuthGetRequest(); // AuthGetRequest | 
    try {
      AuthGetResponse result = apiInstance.authGet(authGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#authGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authGetRequest** | [**AuthGetRequest**](AuthGetRequest.md)|  | |

### Return type

[**AuthGetResponse**](AuthGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Default error |  -  |

<a name="bankTransferBalanceGet"></a>
# **bankTransferBalanceGet**
> BankTransferBalanceGetResponse bankTransferBalanceGet(bankTransferBalanceGetRequest)

Get balance of your Bank Transfer account

Use the &#x60;/bank_transfer/balance/get&#x60; endpoint to see the available balance in your bank transfer account. Debit transfers increase this balance once their status is posted. Credit transfers decrease this balance when they are created.  The transactable balance shows the amount in your account that you are able to use for transfers, and is essentially your available balance minus your minimum balance.  Note that this endpoint can only be used with FBO accounts, when using Bank Transfers in the Full Service configuration. It cannot be used on your own account when using Bank Transfers in the BTS Platform configuration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferBalanceGetRequest bankTransferBalanceGetRequest = new BankTransferBalanceGetRequest(); // BankTransferBalanceGetRequest | 
    try {
      BankTransferBalanceGetResponse result = apiInstance.bankTransferBalanceGet(bankTransferBalanceGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferBalanceGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferBalanceGetRequest** | [**BankTransferBalanceGetRequest**](BankTransferBalanceGetRequest.md)|  | |

### Return type

[**BankTransferBalanceGetResponse**](BankTransferBalanceGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferCancel"></a>
# **bankTransferCancel**
> BankTransferCancelResponse bankTransferCancel(bankTransferCancelRequest)

Cancel a bank transfer

Use the &#x60;/bank_transfer/cancel&#x60; endpoint to cancel a bank transfer.  A transfer is eligible for cancelation if the &#x60;cancellable&#x60; property returned by &#x60;/bank_transfer/get&#x60; is &#x60;true&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferCancelRequest bankTransferCancelRequest = new BankTransferCancelRequest(); // BankTransferCancelRequest | 
    try {
      BankTransferCancelResponse result = apiInstance.bankTransferCancel(bankTransferCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferCancelRequest** | [**BankTransferCancelRequest**](BankTransferCancelRequest.md)|  | |

### Return type

[**BankTransferCancelResponse**](BankTransferCancelResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferCreate"></a>
# **bankTransferCreate**
> BankTransferCreateResponse bankTransferCreate(bankTransferCreateRequest)

Create a bank transfer

Use the &#x60;/bank_transfer/create&#x60; endpoint to initiate a new bank transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferCreateRequest bankTransferCreateRequest = new BankTransferCreateRequest(); // BankTransferCreateRequest | 
    try {
      BankTransferCreateResponse result = apiInstance.bankTransferCreate(bankTransferCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferCreateRequest** | [**BankTransferCreateRequest**](BankTransferCreateRequest.md)|  | |

### Return type

[**BankTransferCreateResponse**](BankTransferCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferEventList"></a>
# **bankTransferEventList**
> BankTransferEventListResponse bankTransferEventList(bankTransferEventListRequest)

List bank transfer events

Use the &#x60;/bank_transfer/event/list&#x60; endpoint to get a list of bank transfer events based on specified filter criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferEventListRequest bankTransferEventListRequest = new BankTransferEventListRequest(); // BankTransferEventListRequest | 
    try {
      BankTransferEventListResponse result = apiInstance.bankTransferEventList(bankTransferEventListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferEventList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferEventListRequest** | [**BankTransferEventListRequest**](BankTransferEventListRequest.md)|  | |

### Return type

[**BankTransferEventListResponse**](BankTransferEventListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferEventSync"></a>
# **bankTransferEventSync**
> BankTransferEventSyncResponse bankTransferEventSync(bankTransferEventSyncRequest)

Sync bank transfer events

&#x60;/bank_transfer/event/sync&#x60; allows you to request up to the next 25 bank transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/bank_transfer/event/sync&#x60; endpoint to guarantee you have seen all bank transfer events.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferEventSyncRequest bankTransferEventSyncRequest = new BankTransferEventSyncRequest(); // BankTransferEventSyncRequest | 
    try {
      BankTransferEventSyncResponse result = apiInstance.bankTransferEventSync(bankTransferEventSyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferEventSync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferEventSyncRequest** | [**BankTransferEventSyncRequest**](BankTransferEventSyncRequest.md)|  | |

### Return type

[**BankTransferEventSyncResponse**](BankTransferEventSyncResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferGet"></a>
# **bankTransferGet**
> BankTransferGetResponse bankTransferGet(bankTransferGetRequest)

Retrieve a bank transfer

The &#x60;/bank_transfer/get&#x60; fetches information about the bank transfer corresponding to the given &#x60;bank_transfer_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferGetRequest bankTransferGetRequest = new BankTransferGetRequest(); // BankTransferGetRequest | 
    try {
      BankTransferGetResponse result = apiInstance.bankTransferGet(bankTransferGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferGetRequest** | [**BankTransferGetRequest**](BankTransferGetRequest.md)|  | |

### Return type

[**BankTransferGetResponse**](BankTransferGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferList"></a>
# **bankTransferList**
> BankTransferListResponse bankTransferList(bankTransferListRequest)

List bank transfers

Use the &#x60;/bank_transfer/list&#x60; endpoint to see a list of all your bank transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired bank transfers. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferListRequest bankTransferListRequest = new BankTransferListRequest(); // BankTransferListRequest | 
    try {
      BankTransferListResponse result = apiInstance.bankTransferList(bankTransferListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferListRequest** | [**BankTransferListRequest**](BankTransferListRequest.md)|  | |

### Return type

[**BankTransferListResponse**](BankTransferListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferMigrateAccount"></a>
# **bankTransferMigrateAccount**
> BankTransferMigrateAccountResponse bankTransferMigrateAccount(bankTransferMigrateAccountRequest)

Migrate account into Bank Transfers

As an alternative to adding Items via Link, you can also use the &#x60;/bank_transfer/migrate_account&#x60; endpoint to migrate known account and routing numbers to Plaid Items.  Note that Items created in this way are not compatible with endpoints for other products, such as &#x60;/accounts/balance/get&#x60;, and can only be used with Bank Transfer endpoints.  If you require access to other endpoints, create the Item through Link instead.  Access to &#x60;/bank_transfer/migrate_account&#x60; is not enabled by default; to obtain access, contact your Plaid Account Manager.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferMigrateAccountRequest bankTransferMigrateAccountRequest = new BankTransferMigrateAccountRequest(); // BankTransferMigrateAccountRequest | 
    try {
      BankTransferMigrateAccountResponse result = apiInstance.bankTransferMigrateAccount(bankTransferMigrateAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferMigrateAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferMigrateAccountRequest** | [**BankTransferMigrateAccountRequest**](BankTransferMigrateAccountRequest.md)|  | |

### Return type

[**BankTransferMigrateAccountResponse**](BankTransferMigrateAccountResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferSweepGet"></a>
# **bankTransferSweepGet**
> BankTransferSweepGetResponse bankTransferSweepGet(bankTransferSweepGetRequest)

Retrieve a sweep

The &#x60;/bank_transfer/sweep/get&#x60; endpoint fetches information about the sweep corresponding to the given &#x60;sweep_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferSweepGetRequest bankTransferSweepGetRequest = new BankTransferSweepGetRequest(); // BankTransferSweepGetRequest | 
    try {
      BankTransferSweepGetResponse result = apiInstance.bankTransferSweepGet(bankTransferSweepGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferSweepGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferSweepGetRequest** | [**BankTransferSweepGetRequest**](BankTransferSweepGetRequest.md)|  | |

### Return type

[**BankTransferSweepGetResponse**](BankTransferSweepGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="bankTransferSweepList"></a>
# **bankTransferSweepList**
> BankTransferSweepListResponse bankTransferSweepList(bankTransferSweepListRequest)

List sweeps

The &#x60;/bank_transfer/sweep/list&#x60; endpoint fetches information about the sweeps matching the given filters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    BankTransferSweepListRequest bankTransferSweepListRequest = new BankTransferSweepListRequest(); // BankTransferSweepListRequest | 
    try {
      BankTransferSweepListResponse result = apiInstance.bankTransferSweepList(bankTransferSweepListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#bankTransferSweepList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bankTransferSweepListRequest** | [**BankTransferSweepListRequest**](BankTransferSweepListRequest.md)|  | |

### Return type

[**BankTransferSweepListResponse**](BankTransferSweepListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="categoriesGet"></a>
# **categoriesGet**
> CategoriesGetResponse categoriesGet(body)

Get Categories

Send a request to the &#x60;/categories/get&#x60; endpoint to get detailed information on categories returned by Plaid. This endpoint does not require authentication.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    Object body = null; // Object | 
    try {
      CategoriesGetResponse result = apiInstance.categoriesGet(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#categoriesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | |

### Return type

[**CategoriesGetResponse**](CategoriesGetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="createPaymentToken"></a>
# **createPaymentToken**
> PaymentInitiationPaymentTokenCreateResponse createPaymentToken(paymentInitiationPaymentTokenCreateRequest)

Create payment token

The &#x60;/payment_initiation/payment/token/create&#x60; endpoint has been deprecated. New Plaid customers will be unable to use this endpoint, and existing customers are encouraged to migrate to the newer, &#x60;link_token&#x60;-based flow. The recommended flow is to provide the &#x60;payment_id&#x60; to &#x60;/link/token/create&#x60;, which returns a &#x60;link_token&#x60; used to initialize Link.  The &#x60;/payment_initiation/payment/token/create&#x60; is used to create a &#x60;payment_token&#x60;, which can then be used in Link initialization to enter a payment initiation flow. You can only use a &#x60;payment_token&#x60; once. If this attempt fails, the end user aborts the flow, or the token expires, you will need to create a new payment token. Creating a new payment token does not require end user input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationPaymentTokenCreateRequest paymentInitiationPaymentTokenCreateRequest = new PaymentInitiationPaymentTokenCreateRequest(); // PaymentInitiationPaymentTokenCreateRequest | 
    try {
      PaymentInitiationPaymentTokenCreateResponse result = apiInstance.createPaymentToken(paymentInitiationPaymentTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#createPaymentToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationPaymentTokenCreateRequest** | [**PaymentInitiationPaymentTokenCreateRequest**](PaymentInitiationPaymentTokenCreateRequest.md)|  | |

### Return type

[**PaymentInitiationPaymentTokenCreateResponse**](PaymentInitiationPaymentTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="depositSwitchAltCreate"></a>
# **depositSwitchAltCreate**
> DepositSwitchAltCreateResponse depositSwitchAltCreate(depositSwitchAltCreateRequest)

Create a deposit switch without using Plaid Exchange

This endpoint provides an alternative to &#x60;/deposit_switch/create&#x60; for customers who have not yet fully integrated with Plaid Exchange. Like &#x60;/deposit_switch/create&#x60;, it creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    DepositSwitchAltCreateRequest depositSwitchAltCreateRequest = new DepositSwitchAltCreateRequest(); // DepositSwitchAltCreateRequest | 
    try {
      DepositSwitchAltCreateResponse result = apiInstance.depositSwitchAltCreate(depositSwitchAltCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#depositSwitchAltCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **depositSwitchAltCreateRequest** | [**DepositSwitchAltCreateRequest**](DepositSwitchAltCreateRequest.md)|  | |

### Return type

[**DepositSwitchAltCreateResponse**](DepositSwitchAltCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="depositSwitchCreate"></a>
# **depositSwitchCreate**
> DepositSwitchCreateResponse depositSwitchCreate(depositSwitchCreateRequest)

Create a deposit switch

This endpoint creates a deposit switch entity that will be persisted throughout the lifecycle of the switch.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    DepositSwitchCreateRequest depositSwitchCreateRequest = new DepositSwitchCreateRequest(); // DepositSwitchCreateRequest | 
    try {
      DepositSwitchCreateResponse result = apiInstance.depositSwitchCreate(depositSwitchCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#depositSwitchCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **depositSwitchCreateRequest** | [**DepositSwitchCreateRequest**](DepositSwitchCreateRequest.md)|  | |

### Return type

[**DepositSwitchCreateResponse**](DepositSwitchCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="depositSwitchGet"></a>
# **depositSwitchGet**
> DepositSwitchGetResponse depositSwitchGet(depositSwitchGetRequest)

Retrieve a deposit switch

This endpoint returns information related to how the user has configured their payroll allocation and the state of the switch. You can use this information to build logic related to the user&#39;s direct deposit allocation preferences.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    DepositSwitchGetRequest depositSwitchGetRequest = new DepositSwitchGetRequest(); // DepositSwitchGetRequest | 
    try {
      DepositSwitchGetResponse result = apiInstance.depositSwitchGet(depositSwitchGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#depositSwitchGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **depositSwitchGetRequest** | [**DepositSwitchGetRequest**](DepositSwitchGetRequest.md)|  | |

### Return type

[**DepositSwitchGetResponse**](DepositSwitchGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="depositSwitchTokenCreate"></a>
# **depositSwitchTokenCreate**
> DepositSwitchTokenCreateResponse depositSwitchTokenCreate(depositSwitchTokenCreateRequest)

Create a deposit switch token

In order for the end user to take action, you will need to create a public token representing the deposit switch. This token is used to initialize Link. It can be used one time and expires after 30 minutes. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    DepositSwitchTokenCreateRequest depositSwitchTokenCreateRequest = new DepositSwitchTokenCreateRequest(); // DepositSwitchTokenCreateRequest | 
    try {
      DepositSwitchTokenCreateResponse result = apiInstance.depositSwitchTokenCreate(depositSwitchTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#depositSwitchTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **depositSwitchTokenCreateRequest** | [**DepositSwitchTokenCreateRequest**](DepositSwitchTokenCreateRequest.md)|  | |

### Return type

[**DepositSwitchTokenCreateResponse**](DepositSwitchTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="employersSearch"></a>
# **employersSearch**
> EmployersSearchResponse employersSearch(employersSearchRequest)

Search employer database

&#x60;/employers/search&#x60; allows you the ability to search Plaid’s database of known employers, for use with Deposit Switch. You can use this endpoint to look up a user&#39;s employer in order to confirm that they are supported. Users with non-supported employers can then be routed out of the Deposit Switch flow.  The data in the employer database is currently limited. As the Deposit Switch and Income products progress through their respective beta periods, more employers are being regularly added. Because the employer database is frequently updated, we recommend that you do not cache or store data from this endpoint for more than a day.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    EmployersSearchRequest employersSearchRequest = new EmployersSearchRequest(); // EmployersSearchRequest | 
    try {
      EmployersSearchResponse result = apiInstance.employersSearch(employersSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#employersSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employersSearchRequest** | [**EmployersSearchRequest**](EmployersSearchRequest.md)|  | |

### Return type

[**EmployersSearchResponse**](EmployersSearchResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="employmentVerificationGet"></a>
# **employmentVerificationGet**
> EmploymentVerificationGetResponse employmentVerificationGet(employmentVerificationGetRequest)

Retrieve a summary of an individual&#39;s employment information

&#x60;/employment/verification/get&#x60; returns a list of employments through a user payroll that was verified by an end user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    EmploymentVerificationGetRequest employmentVerificationGetRequest = new EmploymentVerificationGetRequest(); // EmploymentVerificationGetRequest | 
    try {
      EmploymentVerificationGetResponse result = apiInstance.employmentVerificationGet(employmentVerificationGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#employmentVerificationGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **employmentVerificationGetRequest** | [**EmploymentVerificationGetRequest**](EmploymentVerificationGetRequest.md)|  | |

### Return type

[**EmploymentVerificationGetResponse**](EmploymentVerificationGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="identityGet"></a>
# **identityGet**
> IdentityGetResponse identityGet(identityGetRequest)

Retrieve identity data

The &#x60;/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses. Only name data is guaranteed to be returned; other fields will be empty arrays if not provided by the institution.  Note: This request may take some time to complete if identity was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IdentityGetRequest identityGetRequest = new IdentityGetRequest(); // IdentityGetRequest | 
    try {
      IdentityGetResponse result = apiInstance.identityGet(identityGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#identityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identityGetRequest** | [**IdentityGetRequest**](IdentityGetRequest.md)|  | |

### Return type

[**IdentityGetResponse**](IdentityGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationCreate"></a>
# **incomeVerificationCreate**
> IncomeVerificationCreateResponse incomeVerificationCreate(incomeVerificationCreateRequest)

(Deprecated) Create an income verification instance

&#x60;/income/verification/create&#x60; begins the income verification process by returning an &#x60;income_verification_id&#x60;. You can then provide the &#x60;income_verification_id&#x60; to &#x60;/link/token/create&#x60; under the &#x60;income_verification&#x60; parameter in order to create a Link instance that will prompt the user to go through the income verification flow. Plaid will fire an &#x60;INCOME&#x60; webhook once the user completes the Payroll Income flow, or when the uploaded documents in the Document Income flow have finished processing. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationCreateRequest incomeVerificationCreateRequest = new IncomeVerificationCreateRequest(); // IncomeVerificationCreateRequest | 
    try {
      IncomeVerificationCreateResponse result = apiInstance.incomeVerificationCreate(incomeVerificationCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationCreateRequest** | [**IncomeVerificationCreateRequest**](IncomeVerificationCreateRequest.md)|  | |

### Return type

[**IncomeVerificationCreateResponse**](IncomeVerificationCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationDocumentsDownload"></a>
# **incomeVerificationDocumentsDownload**
> File incomeVerificationDocumentsDownload(incomeVerificationDocumentsDownloadRequest)

Download the original documents used for income verification

&#x60;/income/verification/documents/download&#x60; provides the ability to download the source documents associated with the verification.  If Document Income was used, the documents will be those the user provided in Link. For Payroll Income, the most recent files available for download from the payroll provider will be available from this endpoint.  The response to &#x60;/income/verification/documents/download&#x60; is a ZIP file in binary data. If a &#x60;document_id&#x60; is passed, a single document will be contained in this file. If not, the response will contain all documents associated with the verification.  The &#x60;request_id&#x60; is returned in the &#x60;Plaid-Request-ID&#x60; header.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationDocumentsDownloadRequest incomeVerificationDocumentsDownloadRequest = new IncomeVerificationDocumentsDownloadRequest(); // IncomeVerificationDocumentsDownloadRequest | 
    try {
      File result = apiInstance.incomeVerificationDocumentsDownload(incomeVerificationDocumentsDownloadRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationDocumentsDownload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationDocumentsDownloadRequest** | [**IncomeVerificationDocumentsDownloadRequest**](IncomeVerificationDocumentsDownloadRequest.md)|  | |

### Return type

[**File**](File.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A ZIP file containing source documents(s) used as the basis for income verification. |  -  |

<a name="incomeVerificationPaystubGet"></a>
# **incomeVerificationPaystubGet**
> IncomeVerificationPaystubGetResponse incomeVerificationPaystubGet(incomeVerificationPaystubGetRequest)

(Deprecated) Retrieve information from a single paystub used for income verification

/income/verification/paystub/get returns information from a single paystub used for income verification

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationPaystubGetRequest incomeVerificationPaystubGetRequest = new IncomeVerificationPaystubGetRequest(); // IncomeVerificationPaystubGetRequest | 
    try {
      IncomeVerificationPaystubGetResponse result = apiInstance.incomeVerificationPaystubGet(incomeVerificationPaystubGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationPaystubGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationPaystubGetRequest** | [**IncomeVerificationPaystubGetRequest**](IncomeVerificationPaystubGetRequest.md)|  | |

### Return type

[**IncomeVerificationPaystubGetResponse**](IncomeVerificationPaystubGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationPaystubsGet"></a>
# **incomeVerificationPaystubsGet**
> IncomeVerificationPaystubsGetResponse incomeVerificationPaystubsGet(incomeVerificationPaystubsGetRequest)

Retrieve information from the paystubs used for income verification

&#x60;/income/verification/paystubs/get&#x60; returns the information collected from the paystubs that were used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationPaystubsGetRequest incomeVerificationPaystubsGetRequest = new IncomeVerificationPaystubsGetRequest(); // IncomeVerificationPaystubsGetRequest | 
    try {
      IncomeVerificationPaystubsGetResponse result = apiInstance.incomeVerificationPaystubsGet(incomeVerificationPaystubsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationPaystubsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationPaystubsGetRequest** | [**IncomeVerificationPaystubsGetRequest**](IncomeVerificationPaystubsGetRequest.md)|  | |

### Return type

[**IncomeVerificationPaystubsGetResponse**](IncomeVerificationPaystubsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationPrecheck"></a>
# **incomeVerificationPrecheck**
> IncomeVerificationPrecheckResponse incomeVerificationPrecheck(incomeVerificationPrecheckRequest)

Check digital income verification eligibility and optimize conversion

&#x60;/income/verification/precheck&#x60; is an optional endpoint that can be called before initializing a Link session for income verification. It evaluates whether a given user is supportable by digital income verification and returns a &#x60;precheck_id&#x60; that can be provided to &#x60;/link/token/create&#x60;. If the user is eligible for digital verification, providing the &#x60;precheck_id&#x60; in this way will generate a Link UI optimized for the end user and their specific employer. If the user cannot be confirmed as eligible, the &#x60;precheck_id&#x60; can still be provided to &#x60;/link/token/create&#x60; and the user can still use the income verification flow, but they may be required to manually upload a paystub to verify their income.  While all request fields are optional, providing either &#x60;employer&#x60; or &#x60;transactions_access_tokens&#x60; data will increase the chance of receiving a useful result.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationPrecheckRequest incomeVerificationPrecheckRequest = new IncomeVerificationPrecheckRequest(); // IncomeVerificationPrecheckRequest | 
    try {
      IncomeVerificationPrecheckResponse result = apiInstance.incomeVerificationPrecheck(incomeVerificationPrecheckRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationPrecheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationPrecheckRequest** | [**IncomeVerificationPrecheckRequest**](IncomeVerificationPrecheckRequest.md)|  | |

### Return type

[**IncomeVerificationPrecheckResponse**](IncomeVerificationPrecheckResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationRefresh"></a>
# **incomeVerificationRefresh**
> IncomeVerificationRefreshResponse incomeVerificationRefresh(incomeVerificationRefreshRequest)

Refresh an income verification

&#x60;/income/verification/refresh&#x60; refreshes a given income verification.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationRefreshRequest incomeVerificationRefreshRequest = new IncomeVerificationRefreshRequest(); // IncomeVerificationRefreshRequest | 
    try {
      IncomeVerificationRefreshResponse result = apiInstance.incomeVerificationRefresh(incomeVerificationRefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationRefresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationRefreshRequest** | [**IncomeVerificationRefreshRequest**](IncomeVerificationRefreshRequest.md)|  | |

### Return type

[**IncomeVerificationRefreshResponse**](IncomeVerificationRefreshResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="incomeVerificationSummaryGet"></a>
# **incomeVerificationSummaryGet**
> IncomeVerificationSummaryGetResponse incomeVerificationSummaryGet(incomeVerificationSummaryGetRequest)

(Deprecated) Retrieve a summary of information derived from income verification

&#x60;/income/verification/summary/get&#x60; returns a verification summary for the income that was verified for an end user. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    IncomeVerificationSummaryGetRequest incomeVerificationSummaryGetRequest = new IncomeVerificationSummaryGetRequest(); // IncomeVerificationSummaryGetRequest | 
    try {
      IncomeVerificationSummaryGetResponse result = apiInstance.incomeVerificationSummaryGet(incomeVerificationSummaryGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationSummaryGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **incomeVerificationSummaryGetRequest** | [**IncomeVerificationSummaryGetRequest**](IncomeVerificationSummaryGetRequest.md)|  | |

### Return type

[**IncomeVerificationSummaryGetResponse**](IncomeVerificationSummaryGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="incomeVerificationTaxformsGet"></a>
# **incomeVerificationTaxformsGet**
> IncomeVerificationTaxformsGetResponse incomeVerificationTaxformsGet(requestBody)

Retrieve information from the tax documents used for income verification

&#x60;/income/verification/taxforms/get&#x60; returns the information collected from forms that were used to verify an end user&#39;s income. It can be called once the status of the verification has been set to &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;, as reported by the &#x60;INCOME: verification_status&#x60; webhook. Attempting to call the endpoint before verification has been completed will result in an error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      IncomeVerificationTaxformsGetResponse result = apiInstance.incomeVerificationTaxformsGet(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#incomeVerificationTaxformsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**IncomeVerificationTaxformsGetResponse**](IncomeVerificationTaxformsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="institutionsGet"></a>
# **institutionsGet**
> InstitutionsGetResponse institutionsGet(institutionsGetRequest)

Get details of all supported institutions

Returns a JSON response containing details on all financial institutions currently supported by Plaid. Because Plaid supports thousands of institutions, results are paginated.  If there is no overlap between an institution’s enabled products and a client’s enabled products, then the institution will be filtered out from the response. As a result, the number of institutions returned may not match the count specified in the call.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    InstitutionsGetRequest institutionsGetRequest = new InstitutionsGetRequest(); // InstitutionsGetRequest | 
    try {
      InstitutionsGetResponse result = apiInstance.institutionsGet(institutionsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#institutionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionsGetRequest** | [**InstitutionsGetRequest**](InstitutionsGetRequest.md)|  | |

### Return type

[**InstitutionsGetResponse**](InstitutionsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="institutionsGetById"></a>
# **institutionsGetById**
> InstitutionsGetByIdResponse institutionsGetById(institutionsGetByIdRequest)

Get details of an institution

Returns a JSON response containing details on a specified financial institution currently supported by Plaid.   Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; to authenticate to this endpoint. The &#x60;public_key&#x60; has been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    InstitutionsGetByIdRequest institutionsGetByIdRequest = new InstitutionsGetByIdRequest(); // InstitutionsGetByIdRequest | 
    try {
      InstitutionsGetByIdResponse result = apiInstance.institutionsGetById(institutionsGetByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#institutionsGetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionsGetByIdRequest** | [**InstitutionsGetByIdRequest**](InstitutionsGetByIdRequest.md)|  | |

### Return type

[**InstitutionsGetByIdResponse**](InstitutionsGetByIdResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="institutionsSearch"></a>
# **institutionsSearch**
> InstitutionsSearchResponse institutionsSearch(institutionsSearchRequest)

Search institutions

Returns a JSON response containing details for institutions that match the query parameters, up to a maximum of ten institutions per query.  Versioning note: API versions 2019-05-29 and earlier allow use of the &#x60;public_key&#x60; parameter instead of the &#x60;client_id&#x60; and &#x60;secret&#x60; parameters to authenticate to this endpoint. The &#x60;public_key&#x60; parameter has since been deprecated; all customers are encouraged to use &#x60;client_id&#x60; and &#x60;secret&#x60; instead. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    InstitutionsSearchRequest institutionsSearchRequest = new InstitutionsSearchRequest(); // InstitutionsSearchRequest | 
    try {
      InstitutionsSearchResponse result = apiInstance.institutionsSearch(institutionsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#institutionsSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionsSearchRequest** | [**InstitutionsSearchRequest**](InstitutionsSearchRequest.md)|  | |

### Return type

[**InstitutionsSearchResponse**](InstitutionsSearchResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="investmentsHoldingsGet"></a>
# **investmentsHoldingsGet**
> InvestmentsHoldingsGetResponse investmentsHoldingsGet(investmentsHoldingsGetRequest)

Get Investment holdings

The &#x60;/investments/holdings/get&#x60; endpoint allows developers to receive user-authorized stock position data for &#x60;investment&#x60;-type accounts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    InvestmentsHoldingsGetRequest investmentsHoldingsGetRequest = new InvestmentsHoldingsGetRequest(); // InvestmentsHoldingsGetRequest | 
    try {
      InvestmentsHoldingsGetResponse result = apiInstance.investmentsHoldingsGet(investmentsHoldingsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#investmentsHoldingsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **investmentsHoldingsGetRequest** | [**InvestmentsHoldingsGetRequest**](InvestmentsHoldingsGetRequest.md)|  | |

### Return type

[**InvestmentsHoldingsGetResponse**](InvestmentsHoldingsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="investmentsTransactionsGet"></a>
# **investmentsTransactionsGet**
> InvestmentsTransactionsGetResponse investmentsTransactionsGet(investmentsTransactionsGetRequest)

Get investment transactions

The &#x60;/investments/transactions/get&#x60; endpoint allows developers to retrieve user-authorized transaction data for investment accounts.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Due to the potentially large number of investment transactions associated with an Item, results are paginated. Manipulate the count and offset parameters in conjunction with the &#x60;total_investment_transactions&#x60; response body field to fetch all available investment transactions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    InvestmentsTransactionsGetRequest investmentsTransactionsGetRequest = new InvestmentsTransactionsGetRequest(); // InvestmentsTransactionsGetRequest | 
    try {
      InvestmentsTransactionsGetResponse result = apiInstance.investmentsTransactionsGet(investmentsTransactionsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#investmentsTransactionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **investmentsTransactionsGetRequest** | [**InvestmentsTransactionsGetRequest**](InvestmentsTransactionsGetRequest.md)|  | |

### Return type

[**InvestmentsTransactionsGetResponse**](InvestmentsTransactionsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="itemAccessTokenInvalidate"></a>
# **itemAccessTokenInvalidate**
> ItemAccessTokenInvalidateResponse itemAccessTokenInvalidate(itemAccessTokenInvalidateRequest)

Invalidate access_token

By default, the &#x60;access_token&#x60; associated with an Item does not expire and should be stored in a persistent, secure manner.  You can use the &#x60;/item/access_token/invalidate&#x60; endpoint to rotate the &#x60;access_token&#x60; associated with an Item. The endpoint returns a new &#x60;access_token&#x60; and immediately invalidates the previous &#x60;access_token&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemAccessTokenInvalidateRequest itemAccessTokenInvalidateRequest = new ItemAccessTokenInvalidateRequest(); // ItemAccessTokenInvalidateRequest | 
    try {
      ItemAccessTokenInvalidateResponse result = apiInstance.itemAccessTokenInvalidate(itemAccessTokenInvalidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemAccessTokenInvalidate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemAccessTokenInvalidateRequest** | [**ItemAccessTokenInvalidateRequest**](ItemAccessTokenInvalidateRequest.md)|  | |

### Return type

[**ItemAccessTokenInvalidateResponse**](ItemAccessTokenInvalidateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="itemApplicationList"></a>
# **itemApplicationList**
> ItemApplicationListResponse itemApplicationList(itemApplicationListRequest)

List a user’s connected applications

List a user’s connected applications

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemApplicationListRequest itemApplicationListRequest = new ItemApplicationListRequest(); // ItemApplicationListRequest | 
    try {
      ItemApplicationListResponse result = apiInstance.itemApplicationList(itemApplicationListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemApplicationList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemApplicationListRequest** | [**ItemApplicationListRequest**](ItemApplicationListRequest.md)|  | |

### Return type

[**ItemApplicationListResponse**](ItemApplicationListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="itemApplicationScopesUpdate"></a>
# **itemApplicationScopesUpdate**
> ItemApplicationScopesUpdateResponse itemApplicationScopesUpdate(itemApplicationScopesUpdateRequest)

Update the scopes of access for a particular application

Enable consumers to update product access on selected accounts for an application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemApplicationScopesUpdateRequest itemApplicationScopesUpdateRequest = new ItemApplicationScopesUpdateRequest(); // ItemApplicationScopesUpdateRequest | 
    try {
      ItemApplicationScopesUpdateResponse result = apiInstance.itemApplicationScopesUpdate(itemApplicationScopesUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemApplicationScopesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemApplicationScopesUpdateRequest** | [**ItemApplicationScopesUpdateRequest**](ItemApplicationScopesUpdateRequest.md)|  | |

### Return type

[**ItemApplicationScopesUpdateResponse**](ItemApplicationScopesUpdateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="itemCreatePublicToken"></a>
# **itemCreatePublicToken**
> ItemPublicTokenCreateResponse itemCreatePublicToken(itemPublicTokenCreateRequest)

Create public token

Note: As of July 2020, the &#x60;/item/public_token/create&#x60; endpoint is deprecated. Instead, use &#x60;/link/token/create&#x60; with an &#x60;access_token&#x60; to create a Link token for use with [update mode](https://plaid.com/docs/link/update-mode).  If you need your user to take action to restore or resolve an error associated with an Item, generate a public token with the &#x60;/item/public_token/create&#x60; endpoint and then initialize Link with that &#x60;public_token&#x60;.  A &#x60;public_token&#x60; is one-time use and expires after 30 minutes. You use a &#x60;public_token&#x60; to initialize Link in [update mode](https://plaid.com/docs/link/update-mode) for a particular Item. You can generate a &#x60;public_token&#x60; for an Item even if you did not use Link to create the Item originally.  The &#x60;/item/public_token/create&#x60; endpoint is **not** used to create your initial &#x60;public_token&#x60;. If you have not already received an &#x60;access_token&#x60; for a specific Item, use Link to obtain your &#x60;public_token&#x60; instead. See the [Quickstart](https://plaid.com/docs/quickstart) for more information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemPublicTokenCreateRequest itemPublicTokenCreateRequest = new ItemPublicTokenCreateRequest(); // ItemPublicTokenCreateRequest | 
    try {
      ItemPublicTokenCreateResponse result = apiInstance.itemCreatePublicToken(itemPublicTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemCreatePublicToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemPublicTokenCreateRequest** | [**ItemPublicTokenCreateRequest**](ItemPublicTokenCreateRequest.md)|  | |

### Return type

[**ItemPublicTokenCreateResponse**](ItemPublicTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="itemGet"></a>
# **itemGet**
> ItemGetResponse itemGet(itemGetRequest)

Retrieve an Item

Returns information about the status of an Item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemGetRequest itemGetRequest = new ItemGetRequest(); // ItemGetRequest | 
    try {
      ItemGetResponse result = apiInstance.itemGet(itemGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemGetRequest** | [**ItemGetRequest**](ItemGetRequest.md)|  | |

### Return type

[**ItemGetResponse**](ItemGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="itemImport"></a>
# **itemImport**
> ItemImportResponse itemImport(itemImportRequest)

Import Item

&#x60;/item/import&#x60; creates an Item via your Plaid Exchange Integration and returns an &#x60;access_token&#x60;. As part of an &#x60;/item/import&#x60; request, you will include a User ID (&#x60;user_auth.user_id&#x60;) and Authentication Token (&#x60;user_auth.auth_token&#x60;) that enable data aggregation through your Plaid Exchange API endpoints. These authentication principals are to be chosen by you.  Upon creating an Item via &#x60;/item/import&#x60;, Plaid will automatically begin an extraction of that Item through the Plaid Exchange infrastructure you have already integrated. This will automatically generate the Plaid native account ID for the account the user will switch their direct deposit to (&#x60;target_account_id&#x60;).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemImportRequest itemImportRequest = new ItemImportRequest(); // ItemImportRequest | 
    try {
      ItemImportResponse result = apiInstance.itemImport(itemImportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemImportRequest** | [**ItemImportRequest**](ItemImportRequest.md)|  | |

### Return type

[**ItemImportResponse**](ItemImportResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="itemPublicTokenExchange"></a>
# **itemPublicTokenExchange**
> ItemPublicTokenExchangeResponse itemPublicTokenExchange(itemPublicTokenExchangeRequest)

Exchange public token for an access token

Exchange a Link &#x60;public_token&#x60; for an API &#x60;access_token&#x60;. Link hands off the &#x60;public_token&#x60; client-side via the &#x60;onSuccess&#x60; callback once a user has successfully created an Item. The &#x60;public_token&#x60; is ephemeral and expires after 30 minutes.  The response also includes an &#x60;item_id&#x60; that should be stored with the &#x60;access_token&#x60;. The &#x60;item_id&#x60; is used to identify an Item in a webhook. The &#x60;item_id&#x60; can also be retrieved by making an &#x60;/item/get&#x60; request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemPublicTokenExchangeRequest itemPublicTokenExchangeRequest = new ItemPublicTokenExchangeRequest(); // ItemPublicTokenExchangeRequest | 
    try {
      ItemPublicTokenExchangeResponse result = apiInstance.itemPublicTokenExchange(itemPublicTokenExchangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemPublicTokenExchange");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemPublicTokenExchangeRequest** | [**ItemPublicTokenExchangeRequest**](ItemPublicTokenExchangeRequest.md)|  | |

### Return type

[**ItemPublicTokenExchangeResponse**](ItemPublicTokenExchangeResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="itemRemove"></a>
# **itemRemove**
> ItemRemoveResponse itemRemove(itemRemoveRequest)

Remove an Item

The &#x60;/item/remove&#x60;  endpoint allows you to remove an Item. Once removed, the &#x60;access_token&#x60;  associated with the Item is no longer valid and cannot be used to access any data that was associated with the Item.  Note that in the Development environment, issuing an &#x60;/item/remove&#x60;  request will not decrement your live credential count. To increase your credential account in Development, contact Support.  Also note that for certain OAuth-based institutions, an Item removed via &#x60;/item/remove&#x60; may still show as an active connection in the institution&#39;s OAuth permission manager.  API versions 2019-05-29 and earlier return a &#x60;removed&#x60; boolean as part of the response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemRemoveRequest itemRemoveRequest = new ItemRemoveRequest(); // ItemRemoveRequest | 
    try {
      ItemRemoveResponse result = apiInstance.itemRemove(itemRemoveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemRemoveRequest** | [**ItemRemoveRequest**](ItemRemoveRequest.md)|  | |

### Return type

[**ItemRemoveResponse**](ItemRemoveResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="itemWebhookUpdate"></a>
# **itemWebhookUpdate**
> ItemWebhookUpdateResponse itemWebhookUpdate(itemWebhookUpdateRequest)

Update Webhook URL

The POST &#x60;/item/webhook/update&#x60; allows you to update the webhook URL associated with an Item. This request triggers a [&#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;](https://plaid.com/docs/api/webhooks/#item-webhook-update-acknowledged) webhook to the newly specified webhook URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ItemWebhookUpdateRequest itemWebhookUpdateRequest = new ItemWebhookUpdateRequest(); // ItemWebhookUpdateRequest | 
    try {
      ItemWebhookUpdateResponse result = apiInstance.itemWebhookUpdate(itemWebhookUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#itemWebhookUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemWebhookUpdateRequest** | [**ItemWebhookUpdateRequest**](ItemWebhookUpdateRequest.md)|  | |

### Return type

[**ItemWebhookUpdateResponse**](ItemWebhookUpdateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="liabilitiesGet"></a>
# **liabilitiesGet**
> LiabilitiesGetResponse liabilitiesGet(liabilitiesGetRequest)

Retrieve Liabilities data

The &#x60;/liabilities/get&#x60; endpoint returns various details about an Item with loan or credit accounts. Liabilities data is available primarily for US financial institutions, with some limited coverage of Canadian institutions. Currently supported account types are account type &#x60;credit&#x60; with account subtype &#x60;credit card&#x60; or &#x60;paypal&#x60;, and account type &#x60;loan&#x60; with account subtype &#x60;student&#x60; or &#x60;mortgage&#x60;. To limit accounts listed in Link to types and subtypes supported by Liabilities, you can use the &#x60;account_filters&#x60; parameter when [creating a Link token](https://plaid.com/docs/api/tokens/#linktokencreate).  The types of information returned by Liabilities can include balances and due dates, loan terms, and account details such as original loan amount and guarantor. Data is refreshed approximately once per day; the latest data can be retrieved by calling &#x60;/liabilities/get&#x60;.  Note: This request may take some time to complete if &#x60;liabilities&#x60; was not specified as an initial product when creating the Item. This is because Plaid must communicate directly with the institution to retrieve the additional data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    LiabilitiesGetRequest liabilitiesGetRequest = new LiabilitiesGetRequest(); // LiabilitiesGetRequest | 
    try {
      LiabilitiesGetResponse result = apiInstance.liabilitiesGet(liabilitiesGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#liabilitiesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **liabilitiesGetRequest** | [**LiabilitiesGetRequest**](LiabilitiesGetRequest.md)|  | |

### Return type

[**LiabilitiesGetResponse**](LiabilitiesGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="linkTokenCreate"></a>
# **linkTokenCreate**
> LinkTokenCreateResponse linkTokenCreate(linkTokenCreateRequest)

Create Link Token

The &#x60;/link/token/create&#x60; endpoint creates a &#x60;link_token&#x60;, which is required as a parameter when initializing Link. Once Link has been initialized, it returns a &#x60;public_token&#x60;, which can then be exchanged for an &#x60;access_token&#x60; via &#x60;/item/public_token/exchange&#x60; as part of the main Link flow.  A &#x60;link_token&#x60; generated by &#x60;/link/token/create&#x60; is also used to initialize other Link flows, such as the update mode flow for tokens with expired credentials, or the Payment Initiation (Europe) flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    LinkTokenCreateRequest linkTokenCreateRequest = new LinkTokenCreateRequest(); // LinkTokenCreateRequest | 
    try {
      LinkTokenCreateResponse result = apiInstance.linkTokenCreate(linkTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#linkTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **linkTokenCreateRequest** | [**LinkTokenCreateRequest**](LinkTokenCreateRequest.md)|  | |

### Return type

[**LinkTokenCreateResponse**](LinkTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="linkTokenGet"></a>
# **linkTokenGet**
> LinkTokenGetResponse linkTokenGet(linkTokenGetRequest)

Get Link Token

The &#x60;/link/token/get&#x60; endpoint gets information about a previously-created &#x60;link_token&#x60; using the &#x60;/link/token/create&#x60; endpoint. It can be useful for debugging purposes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    LinkTokenGetRequest linkTokenGetRequest = new LinkTokenGetRequest(); // LinkTokenGetRequest | 
    try {
      LinkTokenGetResponse result = apiInstance.linkTokenGet(linkTokenGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#linkTokenGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **linkTokenGetRequest** | [**LinkTokenGetRequest**](LinkTokenGetRequest.md)|  | |

### Return type

[**LinkTokenGetResponse**](LinkTokenGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationPaymentCreate"></a>
# **paymentInitiationPaymentCreate**
> PaymentInitiationPaymentCreateResponse paymentInitiationPaymentCreate(paymentInitiationPaymentCreateRequest)

Create a payment

After creating a payment recipient, you can use the &#x60;/payment_initiation/payment/create&#x60; endpoint to create a payment to that recipient.  Payments can be one-time or standing order (recurring) and can be denominated in either EUR or GBP.  If making domestic GBP-denominated payments, your recipient must have been created with BACS numbers. In general, EUR-denominated payments will be sent via SEPA Credit Transfer and GBP-denominated payments will be sent via the Faster Payments network, but the payment network used will be determined by the institution. Payments sent via Faster Payments will typically arrive immediately, while payments sent via SEPA Credit Transfer will typically arrive in one business day.  Standing orders (recurring payments) must be denominated in GBP and can only be sent to recipients in the UK. Once created, standing order payments cannot be modified or canceled via the API. An end user can cancel or modify a standing order directly on their banking application or website, or by contacting the bank. Standing orders will follow the payment rules of the underlying rails (Faster Payments in UK). Payments can be sent Monday to Friday, excluding bank holidays. If the pre-arranged date falls on a weekend or bank holiday, the payment is made on the next working day. It is not possible to guarantee the exact time the payment will reach the recipient’s account, although at least 90% of standing order payments are sent by 6am.  In the Development environment, payments must be below 5 GBP / EUR. For details on any payment limits in Production, contact your Plaid Account Manager.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationPaymentCreateRequest paymentInitiationPaymentCreateRequest = new PaymentInitiationPaymentCreateRequest(); // PaymentInitiationPaymentCreateRequest | 
    try {
      PaymentInitiationPaymentCreateResponse result = apiInstance.paymentInitiationPaymentCreate(paymentInitiationPaymentCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationPaymentCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationPaymentCreateRequest** | [**PaymentInitiationPaymentCreateRequest**](PaymentInitiationPaymentCreateRequest.md)|  | |

### Return type

[**PaymentInitiationPaymentCreateResponse**](PaymentInitiationPaymentCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationPaymentGet"></a>
# **paymentInitiationPaymentGet**
> PaymentInitiationPaymentGetResponse paymentInitiationPaymentGet(paymentInitiationPaymentGetRequest)

Get payment details

The &#x60;/payment_initiation/payment/get&#x60; endpoint can be used to check the status of a payment, as well as to receive basic information such as recipient and payment amount. In the case of standing orders, the &#x60;/payment_initiation/payment/get&#x60; endpoint will provide information about the status of the overall standing order itself; the API cannot be used to retrieve payment status for individual payments within a standing order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationPaymentGetRequest paymentInitiationPaymentGetRequest = new PaymentInitiationPaymentGetRequest(); // PaymentInitiationPaymentGetRequest | 
    try {
      PaymentInitiationPaymentGetResponse result = apiInstance.paymentInitiationPaymentGet(paymentInitiationPaymentGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationPaymentGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationPaymentGetRequest** | [**PaymentInitiationPaymentGetRequest**](PaymentInitiationPaymentGetRequest.md)|  | |

### Return type

[**PaymentInitiationPaymentGetResponse**](PaymentInitiationPaymentGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationPaymentList"></a>
# **paymentInitiationPaymentList**
> PaymentInitiationPaymentListResponse paymentInitiationPaymentList(paymentInitiationPaymentListRequest)

List payments

The &#x60;/payment_initiation/payment/list&#x60; endpoint can be used to retrieve all created payments. By default, the 10 most recent payments are returned. You can request more payments and paginate through the results using the optional &#x60;count&#x60; and &#x60;cursor&#x60; parameters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationPaymentListRequest paymentInitiationPaymentListRequest = new PaymentInitiationPaymentListRequest(); // PaymentInitiationPaymentListRequest | 
    try {
      PaymentInitiationPaymentListResponse result = apiInstance.paymentInitiationPaymentList(paymentInitiationPaymentListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationPaymentList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationPaymentListRequest** | [**PaymentInitiationPaymentListRequest**](PaymentInitiationPaymentListRequest.md)|  | |

### Return type

[**PaymentInitiationPaymentListResponse**](PaymentInitiationPaymentListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationPaymentReverse"></a>
# **paymentInitiationPaymentReverse**
> PaymentInitiationPaymentReverseResponse paymentInitiationPaymentReverse(paymentInitiationPaymentReverseRequest)

Reverse an existing payment

Reverse a previously initiated payment.  A payment can only be reversed once and will be refunded to the original sender&#39;s account. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationPaymentReverseRequest paymentInitiationPaymentReverseRequest = new PaymentInitiationPaymentReverseRequest(); // PaymentInitiationPaymentReverseRequest | 
    try {
      PaymentInitiationPaymentReverseResponse result = apiInstance.paymentInitiationPaymentReverse(paymentInitiationPaymentReverseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationPaymentReverse");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationPaymentReverseRequest** | [**PaymentInitiationPaymentReverseRequest**](PaymentInitiationPaymentReverseRequest.md)|  | |

### Return type

[**PaymentInitiationPaymentReverseResponse**](PaymentInitiationPaymentReverseResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationRecipientCreate"></a>
# **paymentInitiationRecipientCreate**
> PaymentInitiationRecipientCreateResponse paymentInitiationRecipientCreate(paymentInitiationRecipientCreateRequest)

Create payment recipient

Create a payment recipient for payment initiation.  The recipient must be in Europe, within a country that is a member of the Single Euro Payment Area (SEPA).  For a standing order (recurring) payment, the recipient must be in the UK.  The endpoint is idempotent: if a developer has already made a request with the same payment details, Plaid will return the same &#x60;recipient_id&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationRecipientCreateRequest paymentInitiationRecipientCreateRequest = new PaymentInitiationRecipientCreateRequest(); // PaymentInitiationRecipientCreateRequest | 
    try {
      PaymentInitiationRecipientCreateResponse result = apiInstance.paymentInitiationRecipientCreate(paymentInitiationRecipientCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationRecipientCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationRecipientCreateRequest** | [**PaymentInitiationRecipientCreateRequest**](PaymentInitiationRecipientCreateRequest.md)|  | |

### Return type

[**PaymentInitiationRecipientCreateResponse**](PaymentInitiationRecipientCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationRecipientGet"></a>
# **paymentInitiationRecipientGet**
> PaymentInitiationRecipientGetResponse paymentInitiationRecipientGet(paymentInitiationRecipientGetRequest)

Get payment recipient

Get details about a payment recipient you have previously created.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationRecipientGetRequest paymentInitiationRecipientGetRequest = new PaymentInitiationRecipientGetRequest(); // PaymentInitiationRecipientGetRequest | 
    try {
      PaymentInitiationRecipientGetResponse result = apiInstance.paymentInitiationRecipientGet(paymentInitiationRecipientGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationRecipientGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationRecipientGetRequest** | [**PaymentInitiationRecipientGetRequest**](PaymentInitiationRecipientGetRequest.md)|  | |

### Return type

[**PaymentInitiationRecipientGetResponse**](PaymentInitiationRecipientGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="paymentInitiationRecipientList"></a>
# **paymentInitiationRecipientList**
> PaymentInitiationRecipientListResponse paymentInitiationRecipientList(paymentInitiationRecipientListRequest)

List payment recipients

The &#x60;/payment_initiation/recipient/list&#x60; endpoint list the payment recipients that you have previously created.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    PaymentInitiationRecipientListRequest paymentInitiationRecipientListRequest = new PaymentInitiationRecipientListRequest(); // PaymentInitiationRecipientListRequest | 
    try {
      PaymentInitiationRecipientListResponse result = apiInstance.paymentInitiationRecipientList(paymentInitiationRecipientListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#paymentInitiationRecipientList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentInitiationRecipientListRequest** | [**PaymentInitiationRecipientListRequest**](PaymentInitiationRecipientListRequest.md)|  | |

### Return type

[**PaymentInitiationRecipientListResponse**](PaymentInitiationRecipientListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processorApexProcessorTokenCreate"></a>
# **processorApexProcessorTokenCreate**
> ProcessorTokenCreateResponse processorApexProcessorTokenCreate(processorApexProcessorTokenCreateRequest)

Create Apex bank account token

Used to create a token suitable for sending to Apex to enable Plaid-Apex integrations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorApexProcessorTokenCreateRequest processorApexProcessorTokenCreateRequest = new ProcessorApexProcessorTokenCreateRequest(); // ProcessorApexProcessorTokenCreateRequest | 
    try {
      ProcessorTokenCreateResponse result = apiInstance.processorApexProcessorTokenCreate(processorApexProcessorTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorApexProcessorTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorApexProcessorTokenCreateRequest** | [**ProcessorApexProcessorTokenCreateRequest**](ProcessorApexProcessorTokenCreateRequest.md)|  | |

### Return type

[**ProcessorTokenCreateResponse**](ProcessorTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processorAuthGet"></a>
# **processorAuthGet**
> ProcessorAuthGetResponse processorAuthGet(processorAuthGetRequest)

Retrieve Auth data

The &#x60;/processor/auth/get&#x60; endpoint returns the bank account and bank identification number (such as the routing number, for US accounts), for a checking or savings account that&#39;&#39;s associated with a given &#x60;processor_token&#x60;. The endpoint also returns high-level account data and balances when available.   Versioning note: API versions 2019-05-29 and earlier use a different schema for the &#x60;numbers&#x60; object returned by this endpoint. For details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2020-09-14). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorAuthGetRequest processorAuthGetRequest = new ProcessorAuthGetRequest(); // ProcessorAuthGetRequest | 
    try {
      ProcessorAuthGetResponse result = apiInstance.processorAuthGet(processorAuthGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorAuthGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorAuthGetRequest** | [**ProcessorAuthGetRequest**](ProcessorAuthGetRequest.md)|  | |

### Return type

[**ProcessorAuthGetResponse**](ProcessorAuthGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |

<a name="processorBalanceGet"></a>
# **processorBalanceGet**
> ProcessorBalanceGetResponse processorBalanceGet(processorBalanceGetRequest)

Retrieve Balance data

The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for each of an Item&#39;s accounts. While other endpoints may return a balance object, only &#x60;/processor/balance/get&#x60; forces the available and current balance fields to be refreshed rather than cached. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorBalanceGetRequest processorBalanceGetRequest = new ProcessorBalanceGetRequest(); // ProcessorBalanceGetRequest | The `/processor/balance/get` endpoint returns the real-time balance for the account associated with a given `processor_token`.  The current balance is the total amount of funds in the account. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account.  Note that not all institutions calculate the available balance. In the event that available balance is unavailable from the institution, Plaid will return an available balance value of `null`.
    try {
      ProcessorBalanceGetResponse result = apiInstance.processorBalanceGet(processorBalanceGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorBalanceGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorBalanceGetRequest** | [**ProcessorBalanceGetRequest**](ProcessorBalanceGetRequest.md)| The &#x60;/processor/balance/get&#x60; endpoint returns the real-time balance for the account associated with a given &#x60;processor_token&#x60;.  The current balance is the total amount of funds in the account. The available balance is the current balance less any outstanding holds or debits that have not yet posted to the account.  Note that not all institutions calculate the available balance. In the event that available balance is unavailable from the institution, Plaid will return an available balance value of &#x60;null&#x60;. | |

### Return type

[**ProcessorBalanceGetResponse**](ProcessorBalanceGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processorBankTransferCreate"></a>
# **processorBankTransferCreate**
> ProcessorBankTransferCreateResponse processorBankTransferCreate(processorBankTransferCreateRequest)

Create a bank transfer as a processor

Use the &#x60;/processor/bank_transfer/create&#x60; endpoint to initiate a new bank transfer as a processor

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorBankTransferCreateRequest processorBankTransferCreateRequest = new ProcessorBankTransferCreateRequest(); // ProcessorBankTransferCreateRequest | 
    try {
      ProcessorBankTransferCreateResponse result = apiInstance.processorBankTransferCreate(processorBankTransferCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorBankTransferCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorBankTransferCreateRequest** | [**ProcessorBankTransferCreateRequest**](ProcessorBankTransferCreateRequest.md)|  | |

### Return type

[**ProcessorBankTransferCreateResponse**](ProcessorBankTransferCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="processorIdentityGet"></a>
# **processorIdentityGet**
> ProcessorIdentityGetResponse processorIdentityGet(processorIdentityGetRequest)

Retrieve Identity data

The &#x60;/processor/identity/get&#x60; endpoint allows you to retrieve various account holder information on file with the financial institution, including names, emails, phone numbers, and addresses.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorIdentityGetRequest processorIdentityGetRequest = new ProcessorIdentityGetRequest(); // ProcessorIdentityGetRequest | 
    try {
      ProcessorIdentityGetResponse result = apiInstance.processorIdentityGet(processorIdentityGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorIdentityGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorIdentityGetRequest** | [**ProcessorIdentityGetRequest**](ProcessorIdentityGetRequest.md)|  | |

### Return type

[**ProcessorIdentityGetResponse**](ProcessorIdentityGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processorStripeBankAccountTokenCreate"></a>
# **processorStripeBankAccountTokenCreate**
> ProcessorStripeBankAccountTokenCreateResponse processorStripeBankAccountTokenCreate(processorStripeBankAccountTokenCreateRequest)

Create Stripe bank account token

Used to create a token suitable for sending to Stripe to enable Plaid-Stripe integrations. For a detailed guide on integrating Stripe, see [Add Stripe to your app](https://plaid.com/docs/auth/partnerships/stripe/).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorStripeBankAccountTokenCreateRequest processorStripeBankAccountTokenCreateRequest = new ProcessorStripeBankAccountTokenCreateRequest(); // ProcessorStripeBankAccountTokenCreateRequest | 
    try {
      ProcessorStripeBankAccountTokenCreateResponse result = apiInstance.processorStripeBankAccountTokenCreate(processorStripeBankAccountTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorStripeBankAccountTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorStripeBankAccountTokenCreateRequest** | [**ProcessorStripeBankAccountTokenCreateRequest**](ProcessorStripeBankAccountTokenCreateRequest.md)|  | |

### Return type

[**ProcessorStripeBankAccountTokenCreateResponse**](ProcessorStripeBankAccountTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="processorTokenCreate"></a>
# **processorTokenCreate**
> ProcessorTokenCreateResponse processorTokenCreate(processorTokenCreateRequest)

Create processor token

Used to create a token suitable for sending to one of Plaid&#39;s partners to enable integrations. Note that Stripe partnerships use bank account tokens instead; see &#x60;/processor/stripe/bank_account_token/create&#x60; for creating tokens for use with Stripe integrations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    ProcessorTokenCreateRequest processorTokenCreateRequest = new ProcessorTokenCreateRequest(); // ProcessorTokenCreateRequest | 
    try {
      ProcessorTokenCreateResponse result = apiInstance.processorTokenCreate(processorTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#processorTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processorTokenCreateRequest** | [**ProcessorTokenCreateRequest**](ProcessorTokenCreateRequest.md)|  | |

### Return type

[**ProcessorTokenCreateResponse**](ProcessorTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sandboxBankTransferFireWebhook"></a>
# **sandboxBankTransferFireWebhook**
> SandboxBankTransferFireWebhookResponse sandboxBankTransferFireWebhook(sandboxBankTransferFireWebhookRequest)

Manually fire a Bank Transfer webhook

Use the &#x60;/sandbox/bank_transfer/fire_webhook&#x60; endpoint to manually trigger a Bank Transfers webhook in the Sandbox environment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxBankTransferFireWebhookRequest sandboxBankTransferFireWebhookRequest = new SandboxBankTransferFireWebhookRequest(); // SandboxBankTransferFireWebhookRequest | 
    try {
      SandboxBankTransferFireWebhookResponse result = apiInstance.sandboxBankTransferFireWebhook(sandboxBankTransferFireWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxBankTransferFireWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxBankTransferFireWebhookRequest** | [**SandboxBankTransferFireWebhookRequest**](SandboxBankTransferFireWebhookRequest.md)|  | |

### Return type

[**SandboxBankTransferFireWebhookResponse**](SandboxBankTransferFireWebhookResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="sandboxBankTransferSimulate"></a>
# **sandboxBankTransferSimulate**
> SandboxBankTransferSimulateResponse sandboxBankTransferSimulate(sandboxBankTransferSimulateRequest)

Simulate a bank transfer event in Sandbox

Use the &#x60;/sandbox/bank_transfer/simulate&#x60; endpoint to simulate a bank transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/bank_transfer/event/sync&#x60; or &#x60;/bank_transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxBankTransferSimulateRequest sandboxBankTransferSimulateRequest = new SandboxBankTransferSimulateRequest(); // SandboxBankTransferSimulateRequest | 
    try {
      SandboxBankTransferSimulateResponse result = apiInstance.sandboxBankTransferSimulate(sandboxBankTransferSimulateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxBankTransferSimulate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxBankTransferSimulateRequest** | [**SandboxBankTransferSimulateRequest**](SandboxBankTransferSimulateRequest.md)|  | |

### Return type

[**SandboxBankTransferSimulateResponse**](SandboxBankTransferSimulateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="sandboxIncomeFireWebhook"></a>
# **sandboxIncomeFireWebhook**
> SandboxIncomeFireWebhookResponse sandboxIncomeFireWebhook(sandboxIncomeFireWebhookRequest)

Manually fire an Income webhook

Use the &#x60;/sandbox/income/fire_webhook&#x60; endpoint to manually trigger an Income webhook in the Sandbox environment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxIncomeFireWebhookRequest sandboxIncomeFireWebhookRequest = new SandboxIncomeFireWebhookRequest(); // SandboxIncomeFireWebhookRequest | 
    try {
      SandboxIncomeFireWebhookResponse result = apiInstance.sandboxIncomeFireWebhook(sandboxIncomeFireWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxIncomeFireWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxIncomeFireWebhookRequest** | [**SandboxIncomeFireWebhookRequest**](SandboxIncomeFireWebhookRequest.md)|  | |

### Return type

[**SandboxIncomeFireWebhookResponse**](SandboxIncomeFireWebhookResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="sandboxItemFireWebhook"></a>
# **sandboxItemFireWebhook**
> SandboxItemFireWebhookResponse sandboxItemFireWebhook(sandboxItemFireWebhookRequest)

Fire a test webhook

The &#x60;/sandbox/item/fire_webhook&#x60; endpoint is used to test that code correctly handles webhooks. This endpoint can trigger a Transactions &#x60;DEFAULT_UPDATE&#x60; webhook to be fired for a given Sandbox Item. If the Item does not support Transactions, a &#x60;SANDBOX_PRODUCT_NOT_ENABLED&#x60; error will result. This endpoint can also trigger a &#x60;NEW_ACCOUNTS_AVAILABLE&#x60; webhook to be fired for a given Sandbox Item created with Account Select v2. Note that this endpoint is provided for developer ease-of-use and is not required for testing webhooks; webhooks will also fire in Sandbox under the same conditions that they would in Production or Development.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxItemFireWebhookRequest sandboxItemFireWebhookRequest = new SandboxItemFireWebhookRequest(); // SandboxItemFireWebhookRequest | 
    try {
      SandboxItemFireWebhookResponse result = apiInstance.sandboxItemFireWebhook(sandboxItemFireWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxItemFireWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxItemFireWebhookRequest** | [**SandboxItemFireWebhookRequest**](SandboxItemFireWebhookRequest.md)|  | |

### Return type

[**SandboxItemFireWebhookResponse**](SandboxItemFireWebhookResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="sandboxItemResetLogin"></a>
# **sandboxItemResetLogin**
> SandboxItemResetLoginResponse sandboxItemResetLogin(sandboxItemResetLoginRequest)

Force a Sandbox Item into an error state

&#x60;/sandbox/item/reset_login/&#x60; forces an Item into an &#x60;ITEM_LOGIN_REQUIRED&#x60; state in order to simulate an Item whose login is no longer valid. This makes it easy to test Link&#39;s [update mode](https://plaid.com/docs/link/update-mode) flow in the Sandbox environment.  After calling &#x60;/sandbox/item/reset_login&#x60;, You can then use Plaid Link update mode to restore the Item to a good state. An &#x60;ITEM_LOGIN_REQUIRED&#x60; webhook will also be fired after a call to this endpoint, if one is associated with the Item.   In the Sandbox, Items will transition to an &#x60;ITEM_LOGIN_REQUIRED&#x60; error state automatically after 30 days, even if this endpoint is not called.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxItemResetLoginRequest sandboxItemResetLoginRequest = new SandboxItemResetLoginRequest(); // SandboxItemResetLoginRequest | 
    try {
      SandboxItemResetLoginResponse result = apiInstance.sandboxItemResetLogin(sandboxItemResetLoginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxItemResetLogin");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxItemResetLoginRequest** | [**SandboxItemResetLoginRequest**](SandboxItemResetLoginRequest.md)|  | |

### Return type

[**SandboxItemResetLoginResponse**](SandboxItemResetLoginResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sandboxItemSetVerificationStatus"></a>
# **sandboxItemSetVerificationStatus**
> SandboxItemSetVerificationStatusResponse sandboxItemSetVerificationStatus(sandboxItemSetVerificationStatusRequest)

Set verification status for Sandbox account

The &#x60;/sandbox/item/set_verification_status&#x60; endpoint can be used to change the verification status of an Item in in the Sandbox in order to simulate the Automated Micro-deposit flow.  Note that not all Plaid developer accounts are enabled for micro-deposit based verification by default. Your account must be enabled for this feature in order to test it in Sandbox. To enable this features or check your status, contact your account manager or [submit a product access Support ticket](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/request-product-access).  For more information on testing Automated Micro-deposits in Sandbox, see [Auth full coverage testing](https://plaid.com/docs/auth/coverage/testing#).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxItemSetVerificationStatusRequest sandboxItemSetVerificationStatusRequest = new SandboxItemSetVerificationStatusRequest(); // SandboxItemSetVerificationStatusRequest | 
    try {
      SandboxItemSetVerificationStatusResponse result = apiInstance.sandboxItemSetVerificationStatus(sandboxItemSetVerificationStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxItemSetVerificationStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxItemSetVerificationStatusRequest** | [**SandboxItemSetVerificationStatusRequest**](SandboxItemSetVerificationStatusRequest.md)|  | |

### Return type

[**SandboxItemSetVerificationStatusResponse**](SandboxItemSetVerificationStatusResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sandboxOauthSelectAccounts"></a>
# **sandboxOauthSelectAccounts**
> Map&lt;String, Object&gt; sandboxOauthSelectAccounts(sandboxOauthSelectAccountsRequest)

Save the selected accounts when connecting to the Platypus Oauth institution

Save the selected accounts when connecting to the Platypus Oauth institution

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxOauthSelectAccountsRequest sandboxOauthSelectAccountsRequest = new SandboxOauthSelectAccountsRequest(); // SandboxOauthSelectAccountsRequest | 
    try {
      Map<String, Object> result = apiInstance.sandboxOauthSelectAccounts(sandboxOauthSelectAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxOauthSelectAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxOauthSelectAccountsRequest** | [**SandboxOauthSelectAccountsRequest**](SandboxOauthSelectAccountsRequest.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="sandboxProcessorTokenCreate"></a>
# **sandboxProcessorTokenCreate**
> SandboxProcessorTokenCreateResponse sandboxProcessorTokenCreate(sandboxProcessorTokenCreateRequest)

Create a test Item and processor token

Use the &#x60;/sandbox/processor_token/create&#x60; endpoint to create a valid &#x60;processor_token&#x60; for an arbitrary institution ID and test credentials. The created &#x60;processor_token&#x60; corresponds to a new Sandbox Item. You can then use this &#x60;processor_token&#x60; with the &#x60;/processor/&#x60; API endpoints in Sandbox. You can also use &#x60;/sandbox/processor_token/create&#x60; with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxProcessorTokenCreateRequest sandboxProcessorTokenCreateRequest = new SandboxProcessorTokenCreateRequest(); // SandboxProcessorTokenCreateRequest | 
    try {
      SandboxProcessorTokenCreateResponse result = apiInstance.sandboxProcessorTokenCreate(sandboxProcessorTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxProcessorTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxProcessorTokenCreateRequest** | [**SandboxProcessorTokenCreateRequest**](SandboxProcessorTokenCreateRequest.md)|  | |

### Return type

[**SandboxProcessorTokenCreateResponse**](SandboxProcessorTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="sandboxPublicTokenCreate"></a>
# **sandboxPublicTokenCreate**
> SandboxPublicTokenCreateResponse sandboxPublicTokenCreate(sandboxPublicTokenCreateRequest)

Create a test Item

Use the &#x60;/sandbox/public_token/create&#x60; endpoint to create a valid &#x60;public_token&#x60;  for an arbitrary institution ID, initial products, and test credentials. The created &#x60;public_token&#x60; maps to a new Sandbox Item. You can then call &#x60;/item/public_token/exchange&#x60; to exchange the &#x60;public_token&#x60; for an &#x60;access_token&#x60; and perform all API actions. &#x60;/sandbox/public_token/create&#x60; can also be used with the [&#x60;user_custom&#x60; test username](https://plaid.com/docs/sandbox/user-custom) to generate a test account with custom data. &#x60;/sandbox/public_token/create&#x60; cannot be used with OAuth institutions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxPublicTokenCreateRequest sandboxPublicTokenCreateRequest = new SandboxPublicTokenCreateRequest(); // SandboxPublicTokenCreateRequest | 
    try {
      SandboxPublicTokenCreateResponse result = apiInstance.sandboxPublicTokenCreate(sandboxPublicTokenCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxPublicTokenCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxPublicTokenCreateRequest** | [**SandboxPublicTokenCreateRequest**](SandboxPublicTokenCreateRequest.md)|  | |

### Return type

[**SandboxPublicTokenCreateResponse**](SandboxPublicTokenCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **0** | Error response. |  -  |

<a name="sandboxTransferRepaymentSimulate"></a>
# **sandboxTransferRepaymentSimulate**
> SandboxTransferRepaymentSimulateResponse sandboxTransferRepaymentSimulate(sandboxTransferRepaymentSimulateRequest)

Trigger the creation of a repayment

Use the &#x60;/sandbox/transfer/repayment/simulate&#x60; endpoint to trigger the creation of a repayment. As a side effect of calling this route, a repayment is created that includes all unreimbursed returns of guaranteed transfers. If there are no such returns, an 400 error is returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxTransferRepaymentSimulateRequest sandboxTransferRepaymentSimulateRequest = new SandboxTransferRepaymentSimulateRequest(); // SandboxTransferRepaymentSimulateRequest | 
    try {
      SandboxTransferRepaymentSimulateResponse result = apiInstance.sandboxTransferRepaymentSimulate(sandboxTransferRepaymentSimulateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxTransferRepaymentSimulate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxTransferRepaymentSimulateRequest** | [**SandboxTransferRepaymentSimulateRequest**](SandboxTransferRepaymentSimulateRequest.md)|  | |

### Return type

[**SandboxTransferRepaymentSimulateResponse**](SandboxTransferRepaymentSimulateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="sandboxTransferSimulate"></a>
# **sandboxTransferSimulate**
> SandboxTransferSimulateResponse sandboxTransferSimulate(sandboxTransferSimulateRequest)

Simulate a transfer event in Sandbox

Use the &#x60;/sandbox/transfer/simulate&#x60; endpoint to simulate a transfer event in the Sandbox environment.  Note that while an event will be simulated and will appear when using endpoints such as &#x60;/transfer/event/sync&#x60; or &#x60;/transfer/event/list&#x60;, no transactions will actually take place and funds will not move between accounts, even within the Sandbox.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxTransferSimulateRequest sandboxTransferSimulateRequest = new SandboxTransferSimulateRequest(); // SandboxTransferSimulateRequest | 
    try {
      SandboxTransferSimulateResponse result = apiInstance.sandboxTransferSimulate(sandboxTransferSimulateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxTransferSimulate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxTransferSimulateRequest** | [**SandboxTransferSimulateRequest**](SandboxTransferSimulateRequest.md)|  | |

### Return type

[**SandboxTransferSimulateResponse**](SandboxTransferSimulateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="sandboxTransferSweepSimulate"></a>
# **sandboxTransferSweepSimulate**
> SandboxTransferSweepSimulateResponse sandboxTransferSweepSimulate(sandboxTransferSweepSimulateRequest)

Simulate creating a sweep

Use the &#x60;/sandbox/transfer/sweep/simulate&#x60; endpoint to create a sweep and associated events in the Sandbox environment. Upon calling this endpoint, all &#x60;posted&#x60; or &#x60;pending&#x60; transfers with a sweep status of &#x60;unswept&#x60; will become &#x60;swept&#x60;, and all &#x60;reversed&#x60; transfers with a sweep status of &#x60;swept&#x60; will become &#x60;reverse_swept&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SandboxTransferSweepSimulateRequest sandboxTransferSweepSimulateRequest = new SandboxTransferSweepSimulateRequest(); // SandboxTransferSweepSimulateRequest | 
    try {
      SandboxTransferSweepSimulateResponse result = apiInstance.sandboxTransferSweepSimulate(sandboxTransferSweepSimulateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#sandboxTransferSweepSimulate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sandboxTransferSweepSimulateRequest** | [**SandboxTransferSweepSimulateRequest**](SandboxTransferSweepSimulateRequest.md)|  | |

### Return type

[**SandboxTransferSweepSimulateResponse**](SandboxTransferSweepSimulateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="signalDecisionReport"></a>
# **signalDecisionReport**
> SignalDecisionReportResponse signalDecisionReport(signalDecisionReportRequest)

Report whether you initiated an ACH transaction

After calling &#x60;/signal/evaluate&#x60;, call &#x60;/signal/decision/report&#x60; to report whether the transaction was initiated. This endpoint will return an &#x60;INVALID_REQUEST&#x60; error if called a second time with a different value for &#x60;initiated&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SignalDecisionReportRequest signalDecisionReportRequest = new SignalDecisionReportRequest(); // SignalDecisionReportRequest | 
    try {
      SignalDecisionReportResponse result = apiInstance.signalDecisionReport(signalDecisionReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#signalDecisionReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signalDecisionReportRequest** | [**SignalDecisionReportRequest**](SignalDecisionReportRequest.md)|  | |

### Return type

[**SignalDecisionReportResponse**](SignalDecisionReportResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="signalEvaluate"></a>
# **signalEvaluate**
> SignalEvaluateResponse signalEvaluate(signalEvaluateRequest)

Evaluate a planned ACH transaction

Use &#x60;/signal/evaluate&#x60; to evaluate a planned ACH transaction to get a return risk assessment (such as a risk score and risk tier) and additional risk signals.  In order to obtain a valid score for an ACH transaction, Plaid must have an access token for the account, and the Item must be healthy (receiving product updates) or have recently been in a healthy state. If the transaction does not meet eligibility requirements, an error will be returned corresponding to the underlying cause. If &#x60;/signal/evaluate&#x60; is called on the same transaction multiple times within a 24-hour period, cached results may be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SignalEvaluateRequest signalEvaluateRequest = new SignalEvaluateRequest(); // SignalEvaluateRequest | 
    try {
      SignalEvaluateResponse result = apiInstance.signalEvaluate(signalEvaluateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#signalEvaluate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signalEvaluateRequest** | [**SignalEvaluateRequest**](SignalEvaluateRequest.md)|  | |

### Return type

[**SignalEvaluateResponse**](SignalEvaluateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="signalReturnReport"></a>
# **signalReturnReport**
> SignalReturnReportResponse signalReturnReport(signalReturnReportRequest)

Report a return for an ACH transaction

Call the &#x60;/signal/return/report&#x60; endpoint to report a returned transaction that was previously sent to the &#x60;/signal/evaluate&#x60; endpoint. Your feedback will be used by the foo to incorporate the latest risk trend in your portfolio.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    SignalReturnReportRequest signalReturnReportRequest = new SignalReturnReportRequest(); // SignalReturnReportRequest | 
    try {
      SignalReturnReportResponse result = apiInstance.signalReturnReport(signalReturnReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#signalReturnReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **signalReturnReportRequest** | [**SignalReturnReportRequest**](SignalReturnReportRequest.md)|  | |

### Return type

[**SignalReturnReportResponse**](SignalReturnReportResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response. |  -  |

<a name="transactionsGet"></a>
# **transactionsGet**
> TransactionsGetResponse transactionsGet(transactionsGetRequest)

Get transaction data

The &#x60;/transactions/get&#x60; endpoint allows developers to receive user-authorized transaction data for credit, depository, and some loan-type accounts (only those with account subtype &#x60;student&#x60;; coverage may be limited). For transaction history from investments accounts, use the [Investments endpoint](https://plaid.com/docs/api/products#investments) instead. Transaction data is standardized across financial institutions, and in many cases transactions are linked to a clean name, entity type, location, and category. Similarly, account data is standardized and returned with a clean name, number, balance, and other meta information where available.  Transactions are returned in reverse-chronological order, and the sequence of transaction ordering is stable and will not shift.  Transactions are not immutable and can also be removed altogether by the institution; a removed transaction will no longer appear in &#x60;/transactions/get&#x60;.  For more details, see [Pending and posted transactions](https://plaid.com/docs/transactions/transactions-data/#pending-and-posted-transactions).  Due to the potentially large number of transactions associated with an Item, results are paginated. Manipulate the &#x60;count&#x60; and &#x60;offset&#x60; parameters in conjunction with the &#x60;total_transactions&#x60; response body field to fetch all available transactions.  Data returned by &#x60;/transactions/get&#x60; will be the data available for the Item as of the most recent successful check for new transactions. Plaid typically checks for new data multiple times a day, but these checks may occur less frequently, such as once a day, depending on the institution. An Item&#39;s &#x60;status.transactions.last_successful_update&#x60; field will show the timestamp of the most recent successful update. To force Plaid to check for new transactions, you can use the &#x60;/transactions/refresh&#x60; endpoint.  Note that data may not be immediately available to &#x60;/transactions/get&#x60;. Plaid will begin to prepare transactions data upon Item link, if Link was initialized with &#x60;transactions&#x60;, or upon the first call to &#x60;/transactions/get&#x60;, if it wasn&#39;t. To be alerted when transaction data is ready to be fetched, listen for the [&#x60;INITIAL_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-initial_update) and [&#x60;HISTORICAL_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-historical_update) webhooks. If no transaction history is ready when &#x60;/transactions/get&#x60; is called, it will return a &#x60;PRODUCT_NOT_READY&#x60; error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransactionsGetRequest transactionsGetRequest = new TransactionsGetRequest(); // TransactionsGetRequest | 
    try {
      TransactionsGetResponse result = apiInstance.transactionsGet(transactionsGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transactionsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionsGetRequest** | [**TransactionsGetRequest**](TransactionsGetRequest.md)|  | |

### Return type

[**TransactionsGetResponse**](TransactionsGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transactionsRecurringGet"></a>
# **transactionsRecurringGet**
> TransactionsRecurringGetResponse transactionsRecurringGet(transactionsRecurringGetRequest)

Get streams of recurring transactions

The &#x60;/transactions/recurring/get&#x60; endpoint identifies and returns groups of transactions that occur on a regular basis for the inputted Item and accounts.  The product is currently in beta. To request access, contact transactions-feedback@plaid.com.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransactionsRecurringGetRequest transactionsRecurringGetRequest = new TransactionsRecurringGetRequest(); // TransactionsRecurringGetRequest | 
    try {
      TransactionsRecurringGetResponse result = apiInstance.transactionsRecurringGet(transactionsRecurringGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transactionsRecurringGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionsRecurringGetRequest** | [**TransactionsRecurringGetRequest**](TransactionsRecurringGetRequest.md)|  | |

### Return type

[**TransactionsRecurringGetResponse**](TransactionsRecurringGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transactionsRefresh"></a>
# **transactionsRefresh**
> TransactionsRefreshResponse transactionsRefresh(transactionsRefreshRequest)

Refresh transaction data

&#x60;/transactions/refresh&#x60; is an optional endpoint for users of the Transactions product. It initiates an on-demand extraction to fetch the newest transactions for an Item. This on-demand extraction takes place in addition to the periodic extractions that automatically occur multiple times a day for any Transactions-enabled Item. If changes to transactions are discovered after calling &#x60;/transactions/refresh&#x60;, Plaid will fire a webhook: [&#x60;TRANSACTIONS_REMOVED&#x60;](https://plaid.com/docs/api/webhooks#deleted-transactions-detected) will be fired if any removed transactions are detected, and [&#x60;DEFAULT_UPDATE&#x60;](https://plaid.com/docs/api/webhooks#transactions-default_update) will be fired if any new transactions are detected. New transactions can be fetched by calling &#x60;/transactions/get&#x60;.  Access to &#x60;/transactions/refresh&#x60; in Production is specific to certain pricing plans. If you cannot access &#x60;/transactions/refresh&#x60; in Production, [contact Sales](https://www.plaid.com/contact) for assistance.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransactionsRefreshRequest transactionsRefreshRequest = new TransactionsRefreshRequest(); // TransactionsRefreshRequest | 
    try {
      TransactionsRefreshResponse result = apiInstance.transactionsRefresh(transactionsRefreshRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transactionsRefresh");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionsRefreshRequest** | [**TransactionsRefreshRequest**](TransactionsRefreshRequest.md)|  | |

### Return type

[**TransactionsRefreshResponse**](TransactionsRefreshResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transactionsSync"></a>
# **transactionsSync**
> TransactionsSyncResponse transactionsSync(transactionsSyncRequest)

Get incremental transaction updates on an Item

The &#x60;/transactions/sync&#x60; endpoint returns item transactions as a set of delta updates. Subsequent calls to the endpoint using the cursor returned in the response will return new added, modified, and removed transactions since the last call to the endpoint  The product is currently in beta. To request access, contact transactions-feedback@plaid.com.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransactionsSyncRequest transactionsSyncRequest = new TransactionsSyncRequest(); // TransactionsSyncRequest | 
    try {
      TransactionsSyncResponse result = apiInstance.transactionsSync(transactionsSyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transactionsSync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionsSyncRequest** | [**TransactionsSyncRequest**](TransactionsSyncRequest.md)|  | |

### Return type

[**TransactionsSyncResponse**](TransactionsSyncResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferAuthorizationCreate"></a>
# **transferAuthorizationCreate**
> TransferAuthorizationCreateResponse transferAuthorizationCreate(transferAuthorizationCreateRequest)

Create a transfer authorization

Use the &#x60;/transfer/authorization/create&#x60; endpoint to determine transfer failure risk.  In Plaid&#39;s sandbox environment the decisions will be returned as follows:    - To approve a transfer, make an authorization request with an &#x60;amount&#x60; less than the available balance in the account.    - To decline a transfer with the rationale code &#x60;NSF&#x60;, the available balance on the account must be less than the authorization &#x60;amount&#x60;. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.    - To decline a transfer with the rationale code &#x60;RISK&#x60;, the available balance on the account must be exactly $0. See [Create Sandbox test data](https://plaid.com/docs/sandbox/user-custom/) for details on how to customize data in Sandbox.    - To permit a transfer with the rationale code &#x60;MANUALLY_VERIFIED_ITEM&#x60;, create an Item in Link through the [Same Day Micro-deposits flow](https://plaid.com/docs/auth/coverage/testing/#testing-same-day-micro-deposits).    - To permit a transfer with the rationale code &#x60;LOGIN_REQUIRED&#x60;, [reset the login for an Item](https://plaid.com/docs/sandbox/#item_login_required).  All username/password combinations other than the ones listed above will result in a decision of permitted and rationale code &#x60;ERROR&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferAuthorizationCreateRequest transferAuthorizationCreateRequest = new TransferAuthorizationCreateRequest(); // TransferAuthorizationCreateRequest | 
    try {
      TransferAuthorizationCreateResponse result = apiInstance.transferAuthorizationCreate(transferAuthorizationCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferAuthorizationCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferAuthorizationCreateRequest** | [**TransferAuthorizationCreateRequest**](TransferAuthorizationCreateRequest.md)|  | |

### Return type

[**TransferAuthorizationCreateResponse**](TransferAuthorizationCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferCancel"></a>
# **transferCancel**
> TransferCancelResponse transferCancel(transferCancelRequest)

Cancel a transfer

Use the &#x60;/transfer/cancel&#x60; endpoint to cancel a transfer.  A transfer is eligible for cancelation if the &#x60;cancellable&#x60; property returned by &#x60;/transfer/get&#x60; is &#x60;true&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferCancelRequest transferCancelRequest = new TransferCancelRequest(); // TransferCancelRequest | 
    try {
      TransferCancelResponse result = apiInstance.transferCancel(transferCancelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferCancelRequest** | [**TransferCancelRequest**](TransferCancelRequest.md)|  | |

### Return type

[**TransferCancelResponse**](TransferCancelResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferCreate"></a>
# **transferCreate**
> TransferCreateResponse transferCreate(transferCreateRequest)

Create a transfer

Use the &#x60;/transfer/create&#x60; endpoint to initiate a new transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferCreateRequest transferCreateRequest = new TransferCreateRequest(); // TransferCreateRequest | 
    try {
      TransferCreateResponse result = apiInstance.transferCreate(transferCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferCreateRequest** | [**TransferCreateRequest**](TransferCreateRequest.md)|  | |

### Return type

[**TransferCreateResponse**](TransferCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferEventList"></a>
# **transferEventList**
> TransferEventListResponse transferEventList(transferEventListRequest)

List transfer events

Use the &#x60;/transfer/event/list&#x60; endpoint to get a list of transfer events based on specified filter criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferEventListRequest transferEventListRequest = new TransferEventListRequest(); // TransferEventListRequest | 
    try {
      TransferEventListResponse result = apiInstance.transferEventList(transferEventListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferEventList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferEventListRequest** | [**TransferEventListRequest**](TransferEventListRequest.md)|  | |

### Return type

[**TransferEventListResponse**](TransferEventListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferEventSync"></a>
# **transferEventSync**
> TransferEventSyncResponse transferEventSync(transferEventSyncRequest)

Sync transfer events

&#x60;/transfer/event/sync&#x60; allows you to request up to the next 25 transfer events that happened after a specific &#x60;event_id&#x60;. Use the &#x60;/transfer/event/sync&#x60; endpoint to guarantee you have seen all transfer events.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferEventSyncRequest transferEventSyncRequest = new TransferEventSyncRequest(); // TransferEventSyncRequest | 
    try {
      TransferEventSyncResponse result = apiInstance.transferEventSync(transferEventSyncRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferEventSync");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferEventSyncRequest** | [**TransferEventSyncRequest**](TransferEventSyncRequest.md)|  | |

### Return type

[**TransferEventSyncResponse**](TransferEventSyncResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferGet"></a>
# **transferGet**
> TransferGetResponse transferGet(transferGetRequest)

Retrieve a transfer

The &#x60;/transfer/get&#x60; fetches information about the transfer corresponding to the given &#x60;transfer_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferGetRequest transferGetRequest = new TransferGetRequest(); // TransferGetRequest | 
    try {
      TransferGetResponse result = apiInstance.transferGet(transferGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferGetRequest** | [**TransferGetRequest**](TransferGetRequest.md)|  | |

### Return type

[**TransferGetResponse**](TransferGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferIntentCreate"></a>
# **transferIntentCreate**
> TransferIntentCreateResponse transferIntentCreate(transferIntentCreateRequest)

Create a transfer intent object to invoke the Transfer UI

Use the &#x60;/transfer/intent/create&#x60; endpoint to generate a transfer intent object and invoke the Transfer UI.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferIntentCreateRequest transferIntentCreateRequest = new TransferIntentCreateRequest(); // TransferIntentCreateRequest | 
    try {
      TransferIntentCreateResponse result = apiInstance.transferIntentCreate(transferIntentCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferIntentCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferIntentCreateRequest** | [**TransferIntentCreateRequest**](TransferIntentCreateRequest.md)|  | |

### Return type

[**TransferIntentCreateResponse**](TransferIntentCreateResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferIntentGet"></a>
# **transferIntentGet**
> TransferIntentGetResponse transferIntentGet(requestBody)

Retrieve more information about a transfer intent

Use the &#x60;/transfer/intent/get&#x60; endpoint to retrieve more information about a transfer intent.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      TransferIntentGetResponse result = apiInstance.transferIntentGet(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferIntentGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

[**TransferIntentGetResponse**](TransferIntentGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferList"></a>
# **transferList**
> TransferListResponse transferList(transferListRequest)

List transfers

Use the &#x60;/transfer/list&#x60; endpoint to see a list of all your transfers and their statuses. Results are paginated; use the &#x60;count&#x60; and &#x60;offset&#x60; query parameters to retrieve the desired transfers. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferListRequest transferListRequest = new TransferListRequest(); // TransferListRequest | 
    try {
      TransferListResponse result = apiInstance.transferList(transferListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferListRequest** | [**TransferListRequest**](TransferListRequest.md)|  | |

### Return type

[**TransferListResponse**](TransferListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferRepaymentList"></a>
# **transferRepaymentList**
> TransferRepaymentListResponse transferRepaymentList(transferRepaymentListRequest)

Lists historical repayments

The &#x60;/transfer/repayment/list&#x60; endpoint fetches repayments matching the given filters. Repayments are returned in reverse-chronological order (most recent first) starting at the given &#x60;start_time&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferRepaymentListRequest transferRepaymentListRequest = new TransferRepaymentListRequest(); // TransferRepaymentListRequest | 
    try {
      TransferRepaymentListResponse result = apiInstance.transferRepaymentList(transferRepaymentListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferRepaymentList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferRepaymentListRequest** | [**TransferRepaymentListRequest**](TransferRepaymentListRequest.md)|  | |

### Return type

[**TransferRepaymentListResponse**](TransferRepaymentListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferRepaymentReturnList"></a>
# **transferRepaymentReturnList**
> TransferRepaymentReturnListResponse transferRepaymentReturnList(transferRepaymentReturnListRequest)

List the returns included in a repayment

The &#x60;/transfer/repayment/return/list&#x60; endpoint retrieves the set of returns that were batched together into the specified repayment. The sum of amounts of returns retrieved by this request equals the amount of the repayment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferRepaymentReturnListRequest transferRepaymentReturnListRequest = new TransferRepaymentReturnListRequest(); // TransferRepaymentReturnListRequest | 
    try {
      TransferRepaymentReturnListResponse result = apiInstance.transferRepaymentReturnList(transferRepaymentReturnListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferRepaymentReturnList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferRepaymentReturnListRequest** | [**TransferRepaymentReturnListRequest**](TransferRepaymentReturnListRequest.md)|  | |

### Return type

[**TransferRepaymentReturnListResponse**](TransferRepaymentReturnListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferSweepGet"></a>
# **transferSweepGet**
> TransferSweepGetResponse transferSweepGet(transferSweepGetRequest)

Retrieve a sweep

The &#x60;/transfer/sweep/get&#x60; endpoint fetches a sweep corresponding to the given &#x60;sweep_id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferSweepGetRequest transferSweepGetRequest = new TransferSweepGetRequest(); // TransferSweepGetRequest | 
    try {
      TransferSweepGetResponse result = apiInstance.transferSweepGet(transferSweepGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferSweepGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferSweepGetRequest** | [**TransferSweepGetRequest**](TransferSweepGetRequest.md)|  | |

### Return type

[**TransferSweepGetResponse**](TransferSweepGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="transferSweepList"></a>
# **transferSweepList**
> TransferSweepListResponse transferSweepList(transferSweepListRequest)

List sweeps

The &#x60;/transfer/sweep/list&#x60; endpoint fetches sweeps matching the given filters.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    TransferSweepListRequest transferSweepListRequest = new TransferSweepListRequest(); // TransferSweepListRequest | 
    try {
      TransferSweepListResponse result = apiInstance.transferSweepList(transferSweepListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#transferSweepList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferSweepListRequest** | [**TransferSweepListRequest**](TransferSweepListRequest.md)|  | |

### Return type

[**TransferSweepListResponse**](TransferSweepListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error response |  -  |

<a name="walletGet"></a>
# **walletGet**
> WalletGetResponse walletGet(walletGetRequest)

Fetch an e-wallet

Fetch an e-wallet. The response includes the current balance. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    WalletGetRequest walletGetRequest = new WalletGetRequest(); // WalletGetRequest | 
    try {
      WalletGetResponse result = apiInstance.walletGet(walletGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#walletGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletGetRequest** | [**WalletGetRequest**](WalletGetRequest.md)|  | |

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="walletTransactionExecute"></a>
# **walletTransactionExecute**
> WalletTransactionExecuteResponse walletTransactionExecute(walletTransactionExecuteRequest)

Execute a transaction using an e-wallet

Execute a transaction using the specified e-wallet. Specify the e-wallet to debit from, the counterparty to credit to, the idempotency key to prevent duplicate payouts, the amount and reference for the payout. The payouts are executed over the Faster Payment rails, where settlement usually only takes a few seconds. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    WalletTransactionExecuteRequest walletTransactionExecuteRequest = new WalletTransactionExecuteRequest(); // WalletTransactionExecuteRequest | 
    try {
      WalletTransactionExecuteResponse result = apiInstance.walletTransactionExecute(walletTransactionExecuteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#walletTransactionExecute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletTransactionExecuteRequest** | [**WalletTransactionExecuteRequest**](WalletTransactionExecuteRequest.md)|  | |

### Return type

[**WalletTransactionExecuteResponse**](WalletTransactionExecuteResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="walletTransactionsList"></a>
# **walletTransactionsList**
> WalletTransactionsListResponse walletTransactionsList(walletTransactionsListRequest)

List e-wallet transactions

This endpoint lists the latest transactions of the specified e-wallet. Transactions are returned in descending order by the &#x60;created_at&#x60; time. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    WalletTransactionsListRequest walletTransactionsListRequest = new WalletTransactionsListRequest(); // WalletTransactionsListRequest | 
    try {
      WalletTransactionsListResponse result = apiInstance.walletTransactionsList(walletTransactionsListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#walletTransactionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletTransactionsListRequest** | [**WalletTransactionsListRequest**](WalletTransactionsListRequest.md)|  | |

### Return type

[**WalletTransactionsListResponse**](WalletTransactionsListResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="webhookVerificationKeyGet"></a>
# **webhookVerificationKeyGet**
> WebhookVerificationKeyGetResponse webhookVerificationKeyGet(webhookVerificationKeyGetRequest)

Get webhook verification key

Plaid signs all outgoing webhooks and provides JSON Web Tokens (JWTs) so that you can verify the authenticity of any incoming webhooks to your application. A message signature is included in the &#x60;Plaid-Verification&#x60; header.  The &#x60;/webhook_verification_key/get&#x60; endpoint provides a JSON Web Key (JWK) that can be used to verify a JWT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PlaidApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://production.plaid.com");
    
    // Configure API key authorization: clientId
    ApiKeyAuth clientId = (ApiKeyAuth) defaultClient.getAuthentication("clientId");
    clientId.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientId.setApiKeyPrefix("Token");

    // Configure API key authorization: plaidVersion
    ApiKeyAuth plaidVersion = (ApiKeyAuth) defaultClient.getAuthentication("plaidVersion");
    plaidVersion.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //plaidVersion.setApiKeyPrefix("Token");

    // Configure API key authorization: secret
    ApiKeyAuth secret = (ApiKeyAuth) defaultClient.getAuthentication("secret");
    secret.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //secret.setApiKeyPrefix("Token");

    PlaidApi apiInstance = new PlaidApi(defaultClient);
    WebhookVerificationKeyGetRequest webhookVerificationKeyGetRequest = new WebhookVerificationKeyGetRequest(); // WebhookVerificationKeyGetRequest | 
    try {
      WebhookVerificationKeyGetResponse result = apiInstance.webhookVerificationKeyGet(webhookVerificationKeyGetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaidApi#webhookVerificationKeyGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookVerificationKeyGetRequest** | [**WebhookVerificationKeyGetRequest**](WebhookVerificationKeyGetRequest.md)|  | |

### Return type

[**WebhookVerificationKeyGetResponse**](WebhookVerificationKeyGetResponse.md)

### Authorization

[clientId](../README.md#clientId), [plaidVersion](../README.md#plaidVersion), [secret](../README.md#secret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

