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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.RecurringTransactionFrequency;
import org.openapitools.client.model.TransactionStreamAmount;

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
 * A grouping of related transactions
 */
@ApiModel(description = "A grouping of related transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class TransactionStream {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STREAM_ID = "stream_id";
  @SerializedName(SERIALIZED_NAME_STREAM_ID)
  private String streamId;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<String> category = new ArrayList<>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FIRST_DATE = "first_date";
  @SerializedName(SERIALIZED_NAME_FIRST_DATE)
  private LocalDate firstDate;

  public static final String SERIALIZED_NAME_LAST_DATE = "last_date";
  @SerializedName(SERIALIZED_NAME_LAST_DATE)
  private LocalDate lastDate;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private RecurringTransactionFrequency frequency;

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transaction_ids";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVERAGE_AMOUNT = "average_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_AMOUNT)
  private TransactionStreamAmount averageAmount;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public TransactionStream() { 
  }

  public TransactionStream accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account to which the stream belongs
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the account to which the stream belongs")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransactionStream streamId(String streamId) {
    
    this.streamId = streamId;
    return this;
  }

   /**
   * A unique id for the stream
   * @return streamId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique id for the stream")

  public String getStreamId() {
    return streamId;
  }


  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  public TransactionStream categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).
   * @return categoryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the category to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public TransactionStream category(List<String> category) {
    
    this.category = category;
    return this;
  }

  public TransactionStream addCategoryItem(String categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A hierarchical array of the categories to which this transaction belongs. See [Categories](https://plaid.com/docs/#category-overview).")

  public List<String> getCategory() {
    return category;
  }


  public void setCategory(List<String> category) {
    this.category = category;
  }


  public TransactionStream description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the transaction stream.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A description of the transaction stream.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionStream firstDate(LocalDate firstDate) {
    
    this.firstDate = firstDate;
    return this;
  }

   /**
   * The posted date of the earliest transaction in the stream.
   * @return firstDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The posted date of the earliest transaction in the stream.")

  public LocalDate getFirstDate() {
    return firstDate;
  }


  public void setFirstDate(LocalDate firstDate) {
    this.firstDate = firstDate;
  }


  public TransactionStream lastDate(LocalDate lastDate) {
    
    this.lastDate = lastDate;
    return this;
  }

   /**
   * The posted date of the latest transaction in the stream.
   * @return lastDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The posted date of the latest transaction in the stream.")

  public LocalDate getLastDate() {
    return lastDate;
  }


  public void setLastDate(LocalDate lastDate) {
    this.lastDate = lastDate;
  }


  public TransactionStream frequency(RecurringTransactionFrequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RecurringTransactionFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(RecurringTransactionFrequency frequency) {
    this.frequency = frequency;
  }


  public TransactionStream transactionIds(List<String> transactionIds) {
    
    this.transactionIds = transactionIds;
    return this;
  }

  public TransactionStream addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   * An array of Plaid transaction IDs belonging to the stream, sorted by posted date.
   * @return transactionIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of Plaid transaction IDs belonging to the stream, sorted by posted date.")

  public List<String> getTransactionIds() {
    return transactionIds;
  }


  public void setTransactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }


  public TransactionStream averageAmount(TransactionStreamAmount averageAmount) {
    
    this.averageAmount = averageAmount;
    return this;
  }

   /**
   * Get averageAmount
   * @return averageAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransactionStreamAmount getAverageAmount() {
    return averageAmount;
  }


  public void setAverageAmount(TransactionStreamAmount averageAmount) {
    this.averageAmount = averageAmount;
  }


  public TransactionStream isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * indicates whether the transaction stream is still live.
   * @return isActive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "indicates whether the transaction stream is still live.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
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
  public TransactionStream putAdditionalProperty(String key, Object value) {
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
    TransactionStream transactionStream = (TransactionStream) o;
    return Objects.equals(this.accountId, transactionStream.accountId) &&
        Objects.equals(this.streamId, transactionStream.streamId) &&
        Objects.equals(this.categoryId, transactionStream.categoryId) &&
        Objects.equals(this.category, transactionStream.category) &&
        Objects.equals(this.description, transactionStream.description) &&
        Objects.equals(this.firstDate, transactionStream.firstDate) &&
        Objects.equals(this.lastDate, transactionStream.lastDate) &&
        Objects.equals(this.frequency, transactionStream.frequency) &&
        Objects.equals(this.transactionIds, transactionStream.transactionIds) &&
        Objects.equals(this.averageAmount, transactionStream.averageAmount) &&
        Objects.equals(this.isActive, transactionStream.isActive)&&
        Objects.equals(this.additionalProperties, transactionStream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, streamId, categoryId, category, description, firstDate, lastDate, frequency, transactionIds, averageAmount, isActive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStream {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstDate: ").append(toIndentedString(firstDate)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
    sb.append("    averageAmount: ").append(toIndentedString(averageAmount)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("stream_id");
    openapiFields.add("category_id");
    openapiFields.add("category");
    openapiFields.add("description");
    openapiFields.add("first_date");
    openapiFields.add("last_date");
    openapiFields.add("frequency");
    openapiFields.add("transaction_ids");
    openapiFields.add("average_amount");
    openapiFields.add("is_active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("stream_id");
    openapiRequiredFields.add("category_id");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("first_date");
    openapiRequiredFields.add("last_date");
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("transaction_ids");
    openapiRequiredFields.add("average_amount");
    openapiRequiredFields.add("is_active");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionStream
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionStream.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionStream is not found in the empty JSON string", TransactionStream.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionStream.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("stream_id") != null && !jsonObj.get("stream_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stream_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stream_id").toString()));
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be an array in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("transaction_ids") != null && !jsonObj.get("transaction_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_ids` to be an array in the JSON string but got `%s`", jsonObj.get("transaction_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionStream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionStream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionStream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionStream.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionStream>() {
           @Override
           public void write(JsonWriter out, TransactionStream value) throws IOException {
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
           public TransactionStream read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransactionStream instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionStream given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionStream
  * @throws IOException if the JSON string is invalid with respect to TransactionStream
  */
  public static TransactionStream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionStream.class);
  }

 /**
  * Convert an instance of TransactionStream to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

