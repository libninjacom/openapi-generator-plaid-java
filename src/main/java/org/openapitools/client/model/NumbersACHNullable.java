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
import org.openapitools.client.model.NumbersACH;

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
 * Identifying information for transferring money to or from a US account via ACH or wire transfer.
 */
@ApiModel(description = "Identifying information for transferring money to or from a US account via ACH or wire transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class NumbersACHNullable {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ROUTING = "routing";
  @SerializedName(SERIALIZED_NAME_ROUTING)
  private String routing;

  public static final String SERIALIZED_NAME_WIRE_ROUTING = "wire_routing";
  @SerializedName(SERIALIZED_NAME_WIRE_ROUTING)
  private String wireRouting;

  public NumbersACHNullable() { 
  }

  public NumbersACHNullable accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersACHNullable account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The ACH account number for the account.  Note that when using OAuth with Chase Bank (&#x60;ins_56&#x60;), Chase will issue \&quot;tokenized\&quot; routing and account numbers, which are not the user&#39;s actual account and routing numbers. These tokenized numbers should work identically to normal account and routing numbers. The digits returned in the &#x60;mask&#x60; field will continue to reflect the actual account number, rather than the tokenized account number; for this reason, when displaying account numbers to the user to help them identify their account in your UI, always use the &#x60;mask&#x60; rather than truncating the &#x60;account&#x60; number. If a user revokes their permissions to your app, the tokenized numbers will continue to work for ACH deposits, but not withdrawals.
   * @return account
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ACH account number for the account.  Note that when using OAuth with Chase Bank (`ins_56`), Chase will issue \"tokenized\" routing and account numbers, which are not the user's actual account and routing numbers. These tokenized numbers should work identically to normal account and routing numbers. The digits returned in the `mask` field will continue to reflect the actual account number, rather than the tokenized account number; for this reason, when displaying account numbers to the user to help them identify their account in your UI, always use the `mask` rather than truncating the `account` number. If a user revokes their permissions to your app, the tokenized numbers will continue to work for ACH deposits, but not withdrawals.")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersACHNullable routing(String routing) {
    
    this.routing = routing;
    return this;
  }

   /**
   * The ACH routing number for the account. If the institution is &#x60;ins_56&#x60;, this may be a tokenized routing number. For more information, see the description of the &#x60;account&#x60; field.
   * @return routing
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ACH routing number for the account. If the institution is `ins_56`, this may be a tokenized routing number. For more information, see the description of the `account` field.")

  public String getRouting() {
    return routing;
  }


  public void setRouting(String routing) {
    this.routing = routing;
  }


  public NumbersACHNullable wireRouting(String wireRouting) {
    
    this.wireRouting = wireRouting;
    return this;
  }

   /**
   * The wire transfer routing number for the account, if available
   * @return wireRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The wire transfer routing number for the account, if available")

  public String getWireRouting() {
    return wireRouting;
  }


  public void setWireRouting(String wireRouting) {
    this.wireRouting = wireRouting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersACHNullable numbersACHNullable = (NumbersACHNullable) o;
    return Objects.equals(this.accountId, numbersACHNullable.accountId) &&
        Objects.equals(this.account, numbersACHNullable.account) &&
        Objects.equals(this.routing, numbersACHNullable.routing) &&
        Objects.equals(this.wireRouting, numbersACHNullable.wireRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, routing, wireRouting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersACHNullable {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    wireRouting: ").append(toIndentedString(wireRouting)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account");
    openapiFields.add("routing");
    openapiFields.add("wire_routing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("routing");
    openapiRequiredFields.add("wire_routing");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NumbersACHNullable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NumbersACHNullable.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NumbersACHNullable is not found in the empty JSON string", NumbersACHNullable.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NumbersACHNullable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NumbersACHNullable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NumbersACHNullable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      if (jsonObj.get("routing") != null && !jsonObj.get("routing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routing").toString()));
      }
      if (jsonObj.get("wire_routing") != null && !jsonObj.get("wire_routing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wire_routing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wire_routing").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NumbersACHNullable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NumbersACHNullable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NumbersACHNullable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NumbersACHNullable.class));

       return (TypeAdapter<T>) new TypeAdapter<NumbersACHNullable>() {
           @Override
           public void write(JsonWriter out, NumbersACHNullable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NumbersACHNullable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NumbersACHNullable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NumbersACHNullable
  * @throws IOException if the JSON string is invalid with respect to NumbersACHNullable
  */
  public static NumbersACHNullable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NumbersACHNullable.class);
  }

 /**
  * Convert an instance of NumbersACHNullable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

