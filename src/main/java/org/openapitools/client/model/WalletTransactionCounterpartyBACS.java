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
import org.openapitools.client.model.RecipientBACS;

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
 * The account number and sort code of the counterparty&#39;s account
 */
@ApiModel(description = "The account number and sort code of the counterparty's account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class WalletTransactionCounterpartyBACS {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_SORT_CODE = "sort_code";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;

  public WalletTransactionCounterpartyBACS() { 
  }

  public WalletTransactionCounterpartyBACS account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The account number of the account. Maximum of 10 characters.
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account number of the account. Maximum of 10 characters.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public WalletTransactionCounterpartyBACS sortCode(String sortCode) {
    
    this.sortCode = sortCode;
    return this;
  }

   /**
   * The 6-character sort code of the account.
   * @return sortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 6-character sort code of the account.")

  public String getSortCode() {
    return sortCode;
  }


  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterpartyBACS walletTransactionCounterpartyBACS = (WalletTransactionCounterpartyBACS) o;
    return Objects.equals(this.account, walletTransactionCounterpartyBACS.account) &&
        Objects.equals(this.sortCode, walletTransactionCounterpartyBACS.sortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, sortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterpartyBACS {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("sort_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WalletTransactionCounterpartyBACS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WalletTransactionCounterpartyBACS.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WalletTransactionCounterpartyBACS is not found in the empty JSON string", WalletTransactionCounterpartyBACS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WalletTransactionCounterpartyBACS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WalletTransactionCounterpartyBACS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      if (jsonObj.get("sort_code") != null && !jsonObj.get("sort_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sort_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WalletTransactionCounterpartyBACS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WalletTransactionCounterpartyBACS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WalletTransactionCounterpartyBACS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WalletTransactionCounterpartyBACS.class));

       return (TypeAdapter<T>) new TypeAdapter<WalletTransactionCounterpartyBACS>() {
           @Override
           public void write(JsonWriter out, WalletTransactionCounterpartyBACS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WalletTransactionCounterpartyBACS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WalletTransactionCounterpartyBACS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WalletTransactionCounterpartyBACS
  * @throws IOException if the JSON string is invalid with respect to WalletTransactionCounterpartyBACS
  */
  public static WalletTransactionCounterpartyBACS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WalletTransactionCounterpartyBACS.class);
  }

 /**
  * Convert an instance of WalletTransactionCounterpartyBACS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

