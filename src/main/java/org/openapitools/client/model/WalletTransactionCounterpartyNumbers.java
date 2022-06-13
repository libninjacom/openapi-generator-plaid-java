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
import org.openapitools.client.model.WalletTransactionCounterpartyBACS;

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
 * The counterparty&#39;s bank account numbers
 */
@ApiModel(description = "The counterparty's bank account numbers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class WalletTransactionCounterpartyNumbers {
  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private WalletTransactionCounterpartyBACS bacs;

  public WalletTransactionCounterpartyNumbers() { 
  }

  public WalletTransactionCounterpartyNumbers bacs(WalletTransactionCounterpartyBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WalletTransactionCounterpartyBACS getBacs() {
    return bacs;
  }


  public void setBacs(WalletTransactionCounterpartyBACS bacs) {
    this.bacs = bacs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterpartyNumbers walletTransactionCounterpartyNumbers = (WalletTransactionCounterpartyNumbers) o;
    return Objects.equals(this.bacs, walletTransactionCounterpartyNumbers.bacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bacs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterpartyNumbers {\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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
    openapiFields.add("bacs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bacs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WalletTransactionCounterpartyNumbers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WalletTransactionCounterpartyNumbers.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WalletTransactionCounterpartyNumbers is not found in the empty JSON string", WalletTransactionCounterpartyNumbers.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WalletTransactionCounterpartyNumbers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WalletTransactionCounterpartyNumbers` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WalletTransactionCounterpartyNumbers.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `bacs`
      if (jsonObj.getAsJsonObject("bacs") != null) {
        WalletTransactionCounterpartyBACS.validateJsonObject(jsonObj.getAsJsonObject("bacs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WalletTransactionCounterpartyNumbers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WalletTransactionCounterpartyNumbers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WalletTransactionCounterpartyNumbers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WalletTransactionCounterpartyNumbers.class));

       return (TypeAdapter<T>) new TypeAdapter<WalletTransactionCounterpartyNumbers>() {
           @Override
           public void write(JsonWriter out, WalletTransactionCounterpartyNumbers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WalletTransactionCounterpartyNumbers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WalletTransactionCounterpartyNumbers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WalletTransactionCounterpartyNumbers
  * @throws IOException if the JSON string is invalid with respect to WalletTransactionCounterpartyNumbers
  */
  public static WalletTransactionCounterpartyNumbers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WalletTransactionCounterpartyNumbers.class);
  }

 /**
  * Convert an instance of WalletTransactionCounterpartyNumbers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
