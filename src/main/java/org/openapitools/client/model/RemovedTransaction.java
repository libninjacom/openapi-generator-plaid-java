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
 * A representation of a removed transaction
 */
@ApiModel(description = "A representation of a removed transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class RemovedTransaction {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public RemovedTransaction() { 
  }

  public RemovedTransaction transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the removed transaction.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the removed transaction.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovedTransaction removedTransaction = (RemovedTransaction) o;
    return Objects.equals(this.transactionId, removedTransaction.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovedTransaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("transaction_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RemovedTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemovedTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemovedTransaction is not found in the empty JSON string", RemovedTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RemovedTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemovedTransaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("transaction_id") != null && !jsonObj.get("transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemovedTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemovedTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemovedTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemovedTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<RemovedTransaction>() {
           @Override
           public void write(JsonWriter out, RemovedTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemovedTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemovedTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemovedTransaction
  * @throws IOException if the JSON string is invalid with respect to RemovedTransaction
  */
  public static RemovedTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemovedTransaction.class);
  }

 /**
  * Convert an instance of RemovedTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

