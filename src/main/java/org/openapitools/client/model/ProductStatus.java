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
import java.time.OffsetDateTime;
import org.openapitools.client.model.ProductStatusBreakdown;

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
 * A representation of the status health of a request type. Auth requests, Balance requests, Identity requests, Investments requests, Liabilities requests, Transactions updates, Investments updates, Liabilities updates, and Item logins each have their own status object.
 */
@ApiModel(description = "A representation of the status health of a request type. Auth requests, Balance requests, Identity requests, Investments requests, Liabilities requests, Transactions updates, Investments updates, Liabilities updates, and Item logins each have their own status object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ProductStatus {
  /**
   * This field is deprecated in favor of the &#x60;breakdown&#x60; object, which provides more granular institution health data.  &#x60;HEALTHY&#x60;: the majority of requests are successful &#x60;DEGRADED&#x60;: only some requests are successful &#x60;DOWN&#x60;: all requests are failing
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    HEALTHY("HEALTHY"),
    
    DEGRADED("DEGRADED"),
    
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_LAST_STATUS_CHANGE = "last_status_change";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS_CHANGE)
  private OffsetDateTime lastStatusChange;

  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private ProductStatusBreakdown breakdown;

  public ProductStatus() { 
  }

  public ProductStatus status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * This field is deprecated in favor of the &#x60;breakdown&#x60; object, which provides more granular institution health data.  &#x60;HEALTHY&#x60;: the majority of requests are successful &#x60;DEGRADED&#x60;: only some requests are successful &#x60;DOWN&#x60;: all requests are failing
   * @return status
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This field is deprecated in favor of the `breakdown` object, which provides more granular institution health data.  `HEALTHY`: the majority of requests are successful `DEGRADED`: only some requests are successful `DOWN`: all requests are failing")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ProductStatus lastStatusChange(OffsetDateTime lastStatusChange) {
    
    this.lastStatusChange = lastStatusChange;
    return this;
  }

   /**
   * [ISO 8601](https://wikipedia.org/wiki/ISO_8601) formatted timestamp of the last status change for the institution. 
   * @return lastStatusChange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "[ISO 8601](https://wikipedia.org/wiki/ISO_8601) formatted timestamp of the last status change for the institution. ")

  public OffsetDateTime getLastStatusChange() {
    return lastStatusChange;
  }


  public void setLastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
  }


  public ProductStatus breakdown(ProductStatusBreakdown breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProductStatusBreakdown getBreakdown() {
    return breakdown;
  }


  public void setBreakdown(ProductStatusBreakdown breakdown) {
    this.breakdown = breakdown;
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
  public ProductStatus putAdditionalProperty(String key, Object value) {
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
    ProductStatus productStatus = (ProductStatus) o;
    return Objects.equals(this.status, productStatus.status) &&
        Objects.equals(this.lastStatusChange, productStatus.lastStatusChange) &&
        Objects.equals(this.breakdown, productStatus.breakdown)&&
        Objects.equals(this.additionalProperties, productStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, lastStatusChange, breakdown, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastStatusChange: ").append(toIndentedString(lastStatusChange)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("last_status_change");
    openapiFields.add("breakdown");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("last_status_change");
    openapiRequiredFields.add("breakdown");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductStatus is not found in the empty JSON string", ProductStatus.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductStatus>() {
           @Override
           public void write(JsonWriter out, ProductStatus value) throws IOException {
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
           public ProductStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductStatus
  * @throws IOException if the JSON string is invalid with respect to ProductStatus
  */
  public static ProductStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductStatus.class);
  }

 /**
  * Convert an instance of ProductStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

