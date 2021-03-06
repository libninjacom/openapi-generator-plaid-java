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
import org.openapitools.client.model.RemovedTransaction;
import org.openapitools.client.model.Transaction;

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
 * TransactionsSyncResponse defines the response schema for &#x60;/transactions/sync&#x60;
 */
@ApiModel(description = "TransactionsSyncResponse defines the response schema for `/transactions/sync`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class TransactionsSyncResponse {
  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private List<Transaction> added = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private List<Transaction> modified = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<RemovedTransaction> removed = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public TransactionsSyncResponse() { 
  }

  public TransactionsSyncResponse added(List<Transaction> added) {
    
    this.added = added;
    return this;
  }

  public TransactionsSyncResponse addAddedItem(Transaction addedItem) {
    this.added.add(addedItem);
    return this;
  }

   /**
   * Transactions that have been added to the item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return added
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Transactions that have been added to the item since `cursor` ordered by ascending last modified time.")

  public List<Transaction> getAdded() {
    return added;
  }


  public void setAdded(List<Transaction> added) {
    this.added = added;
  }


  public TransactionsSyncResponse modified(List<Transaction> modified) {
    
    this.modified = modified;
    return this;
  }

  public TransactionsSyncResponse addModifiedItem(Transaction modifiedItem) {
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * Transactions that have been modified on the item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return modified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Transactions that have been modified on the item since `cursor` ordered by ascending last modified time.")

  public List<Transaction> getModified() {
    return modified;
  }


  public void setModified(List<Transaction> modified) {
    this.modified = modified;
  }


  public TransactionsSyncResponse removed(List<RemovedTransaction> removed) {
    
    this.removed = removed;
    return this;
  }

  public TransactionsSyncResponse addRemovedItem(RemovedTransaction removedItem) {
    this.removed.add(removedItem);
    return this;
  }

   /**
   * Transactions that have been removed from the item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return removed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Transactions that have been removed from the item since `cursor` ordered by ascending last modified time.")

  public List<RemovedTransaction> getRemoved() {
    return removed;
  }


  public void setRemoved(List<RemovedTransaction> removed) {
    this.removed = removed;
  }


  public TransactionsSyncResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Cursor used for fetching any future updates after the latest update provided in this response.
   * @return nextCursor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cursor used for fetching any future updates after the latest update provided in this response.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public TransactionsSyncResponse hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with &#x60;cursor&#x60; set to &#x60;next_cursor&#x60;.
   * @return hasMore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with `cursor` set to `next_cursor`.")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public TransactionsSyncResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public TransactionsSyncResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsSyncResponse transactionsSyncResponse = (TransactionsSyncResponse) o;
    return Objects.equals(this.added, transactionsSyncResponse.added) &&
        Objects.equals(this.modified, transactionsSyncResponse.modified) &&
        Objects.equals(this.removed, transactionsSyncResponse.removed) &&
        Objects.equals(this.nextCursor, transactionsSyncResponse.nextCursor) &&
        Objects.equals(this.hasMore, transactionsSyncResponse.hasMore) &&
        Objects.equals(this.requestId, transactionsSyncResponse.requestId)&&
        Objects.equals(this.additionalProperties, transactionsSyncResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, modified, removed, nextCursor, hasMore, requestId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsSyncResponse {\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("added");
    openapiFields.add("modified");
    openapiFields.add("removed");
    openapiFields.add("next_cursor");
    openapiFields.add("has_more");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("added");
    openapiRequiredFields.add("modified");
    openapiRequiredFields.add("removed");
    openapiRequiredFields.add("next_cursor");
    openapiRequiredFields.add("has_more");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionsSyncResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionsSyncResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionsSyncResponse is not found in the empty JSON string", TransactionsSyncResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionsSyncResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayadded = jsonObj.getAsJsonArray("added");
      if (jsonArrayadded != null) {
        // ensure the json data is an array
        if (!jsonObj.get("added").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `added` to be an array in the JSON string but got `%s`", jsonObj.get("added").toString()));
        }

        // validate the optional field `added` (array)
        for (int i = 0; i < jsonArrayadded.size(); i++) {
          Transaction.validateJsonObject(jsonArrayadded.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymodified = jsonObj.getAsJsonArray("modified");
      if (jsonArraymodified != null) {
        // ensure the json data is an array
        if (!jsonObj.get("modified").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `modified` to be an array in the JSON string but got `%s`", jsonObj.get("modified").toString()));
        }

        // validate the optional field `modified` (array)
        for (int i = 0; i < jsonArraymodified.size(); i++) {
          Transaction.validateJsonObject(jsonArraymodified.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayremoved = jsonObj.getAsJsonArray("removed");
      if (jsonArrayremoved != null) {
        // ensure the json data is an array
        if (!jsonObj.get("removed").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `removed` to be an array in the JSON string but got `%s`", jsonObj.get("removed").toString()));
        }

        // validate the optional field `removed` (array)
        for (int i = 0; i < jsonArrayremoved.size(); i++) {
          RemovedTransaction.validateJsonObject(jsonArrayremoved.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("next_cursor") != null && !jsonObj.get("next_cursor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_cursor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_cursor").toString()));
      }
      if (jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionsSyncResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionsSyncResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionsSyncResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionsSyncResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionsSyncResponse>() {
           @Override
           public void write(JsonWriter out, TransactionsSyncResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionsSyncResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionsSyncResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionsSyncResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionsSyncResponse
  * @throws IOException if the JSON string is invalid with respect to TransactionsSyncResponse
  */
  public static TransactionsSyncResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionsSyncResponse.class);
  }

 /**
  * Convert an instance of TransactionsSyncResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

