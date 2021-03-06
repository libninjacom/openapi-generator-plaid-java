/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.64.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IncomeVerificationPrecheckEmployer;
import org.openapitools.client.model.IncomeVerificationPrecheckMilitaryInfo;
import org.openapitools.client.model.IncomeVerificationPrecheckUser;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IncomeVerificationPrecheckRequest defines the request schema for &#x60;/income/verification/precheck&#x60;
 */
@ApiModel(description = "IncomeVerificationPrecheckRequest defines the request schema for `/income/verification/precheck`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class IncomeVerificationPrecheckRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IncomeVerificationPrecheckUser user;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private IncomeVerificationPrecheckEmployer employer;

  public static final String SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKEN = "transactions_access_token";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKEN)
  private String transactionsAccessToken;

  public static final String SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKENS = "transactions_access_tokens";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_ACCESS_TOKENS)
  private List<String> transactionsAccessTokens = null;

  public static final String SERIALIZED_NAME_US_MILITARY_INFO = "us_military_info";
  @SerializedName(SERIALIZED_NAME_US_MILITARY_INFO)
  private IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo;

  public IncomeVerificationPrecheckRequest() { 
  }

  public IncomeVerificationPrecheckRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public IncomeVerificationPrecheckRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public IncomeVerificationPrecheckRequest user(IncomeVerificationPrecheckUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckUser getUser() {
    return user;
  }


  public void setUser(IncomeVerificationPrecheckUser user) {
    this.user = user;
  }


  public IncomeVerificationPrecheckRequest employer(IncomeVerificationPrecheckEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(IncomeVerificationPrecheckEmployer employer) {
    this.employer = employer;
  }


  public IncomeVerificationPrecheckRequest transactionsAccessToken(String transactionsAccessToken) {
    
    this.transactionsAccessToken = transactionsAccessToken;
    return this;
  }

   /**
   * Get transactionsAccessToken
   * @return transactionsAccessToken
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionsAccessToken() {
    return transactionsAccessToken;
  }


  public void setTransactionsAccessToken(String transactionsAccessToken) {
    this.transactionsAccessToken = transactionsAccessToken;
  }


  public IncomeVerificationPrecheckRequest transactionsAccessTokens(List<String> transactionsAccessTokens) {
    
    this.transactionsAccessTokens = transactionsAccessTokens;
    return this;
  }

  public IncomeVerificationPrecheckRequest addTransactionsAccessTokensItem(String transactionsAccessTokensItem) {
    if (this.transactionsAccessTokens == null) {
      this.transactionsAccessTokens = new ArrayList<>();
    }
    this.transactionsAccessTokens.add(transactionsAccessTokensItem);
    return this;
  }

   /**
   * An array of access tokens corresponding to Items belonging to the user whose eligibility is being checked. Note that if the Items specified here are not already initialized with &#x60;transactions&#x60;, providing them in this field will cause these Items to be initialized with (and billed for) the Transactions product.
   * @return transactionsAccessTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of access tokens corresponding to Items belonging to the user whose eligibility is being checked. Note that if the Items specified here are not already initialized with `transactions`, providing them in this field will cause these Items to be initialized with (and billed for) the Transactions product.")

  public List<String> getTransactionsAccessTokens() {
    return transactionsAccessTokens;
  }


  public void setTransactionsAccessTokens(List<String> transactionsAccessTokens) {
    this.transactionsAccessTokens = transactionsAccessTokens;
  }


  public IncomeVerificationPrecheckRequest usMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    
    this.usMilitaryInfo = usMilitaryInfo;
    return this;
  }

   /**
   * Get usMilitaryInfo
   * @return usMilitaryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckMilitaryInfo getUsMilitaryInfo() {
    return usMilitaryInfo;
  }


  public void setUsMilitaryInfo(IncomeVerificationPrecheckMilitaryInfo usMilitaryInfo) {
    this.usMilitaryInfo = usMilitaryInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckRequest incomeVerificationPrecheckRequest = (IncomeVerificationPrecheckRequest) o;
    return Objects.equals(this.clientId, incomeVerificationPrecheckRequest.clientId) &&
        Objects.equals(this.secret, incomeVerificationPrecheckRequest.secret) &&
        Objects.equals(this.user, incomeVerificationPrecheckRequest.user) &&
        Objects.equals(this.employer, incomeVerificationPrecheckRequest.employer) &&
        Objects.equals(this.transactionsAccessToken, incomeVerificationPrecheckRequest.transactionsAccessToken) &&
        Objects.equals(this.transactionsAccessTokens, incomeVerificationPrecheckRequest.transactionsAccessTokens) &&
        Objects.equals(this.usMilitaryInfo, incomeVerificationPrecheckRequest.usMilitaryInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, user, employer, transactionsAccessToken, transactionsAccessTokens, usMilitaryInfo);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    transactionsAccessToken: ").append(toIndentedString(transactionsAccessToken)).append("\n");
    sb.append("    transactionsAccessTokens: ").append(toIndentedString(transactionsAccessTokens)).append("\n");
    sb.append("    usMilitaryInfo: ").append(toIndentedString(usMilitaryInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("client_id");
    openapiFields.add("secret");
    openapiFields.add("user");
    openapiFields.add("employer");
    openapiFields.add("transactions_access_token");
    openapiFields.add("transactions_access_tokens");
    openapiFields.add("us_military_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IncomeVerificationPrecheckRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IncomeVerificationPrecheckRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncomeVerificationPrecheckRequest is not found in the empty JSON string", IncomeVerificationPrecheckRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IncomeVerificationPrecheckRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IncomeVerificationPrecheckRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        IncomeVerificationPrecheckUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      // validate the optional field `employer`
      if (jsonObj.getAsJsonObject("employer") != null) {
        IncomeVerificationPrecheckEmployer.validateJsonObject(jsonObj.getAsJsonObject("employer"));
      }
      // validate the optional field `transactions_access_token`
      if (jsonObj.getAsJsonObject("transactions_access_token") != null) {
        String.validateJsonObject(jsonObj.getAsJsonObject("transactions_access_token"));
      }
      // ensure the json data is an array
      if (jsonObj.get("transactions_access_tokens") != null && !jsonObj.get("transactions_access_tokens").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactions_access_tokens` to be an array in the JSON string but got `%s`", jsonObj.get("transactions_access_tokens").toString()));
      }
      // validate the optional field `us_military_info`
      if (jsonObj.getAsJsonObject("us_military_info") != null) {
        IncomeVerificationPrecheckMilitaryInfo.validateJsonObject(jsonObj.getAsJsonObject("us_military_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncomeVerificationPrecheckRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncomeVerificationPrecheckRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncomeVerificationPrecheckRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncomeVerificationPrecheckRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IncomeVerificationPrecheckRequest>() {
           @Override
           public void write(JsonWriter out, IncomeVerificationPrecheckRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IncomeVerificationPrecheckRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IncomeVerificationPrecheckRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncomeVerificationPrecheckRequest
  * @throws IOException if the JSON string is invalid with respect to IncomeVerificationPrecheckRequest
  */
  public static IncomeVerificationPrecheckRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncomeVerificationPrecheckRequest.class);
  }

 /**
  * Convert an instance of IncomeVerificationPrecheckRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

