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
import java.math.BigDecimal;

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
 * A detailed breakdown of the institution&#39;s performance for a request type. The values for &#x60;success&#x60;, &#x60;error_plaid&#x60;, and &#x60;error_institution&#x60; sum to 1.
 */
@ApiModel(description = "A detailed breakdown of the institution's performance for a request type. The values for `success`, `error_plaid`, and `error_institution` sum to 1.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ProductStatusBreakdown {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private BigDecimal success;

  public static final String SERIALIZED_NAME_ERROR_PLAID = "error_plaid";
  @SerializedName(SERIALIZED_NAME_ERROR_PLAID)
  private BigDecimal errorPlaid;

  public static final String SERIALIZED_NAME_ERROR_INSTITUTION = "error_institution";
  @SerializedName(SERIALIZED_NAME_ERROR_INSTITUTION)
  private BigDecimal errorInstitution;

  /**
   * The &#x60;refresh_interval&#x60; may be &#x60;DELAYED&#x60; or &#x60;STOPPED&#x60; even when the success rate is high. This value is only returned for Transactions status breakdowns.
   */
  @JsonAdapter(RefreshIntervalEnum.Adapter.class)
  public enum RefreshIntervalEnum {
    NORMAL("NORMAL"),
    
    DELAYED("DELAYED"),
    
    STOPPED("STOPPED");

    private String value;

    RefreshIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshIntervalEnum fromValue(String value) {
      for (RefreshIntervalEnum b : RefreshIntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RefreshIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefreshIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefreshIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefreshIntervalEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFRESH_INTERVAL = "refresh_interval";
  @SerializedName(SERIALIZED_NAME_REFRESH_INTERVAL)
  private RefreshIntervalEnum refreshInterval;

  public ProductStatusBreakdown() { 
  }

  public ProductStatusBreakdown success(BigDecimal success) {
    
    this.success = success;
    return this;
  }

   /**
   * The percentage of login attempts that are successful, expressed as a decimal.
   * @return success
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The percentage of login attempts that are successful, expressed as a decimal.")

  public BigDecimal getSuccess() {
    return success;
  }


  public void setSuccess(BigDecimal success) {
    this.success = success;
  }


  public ProductStatusBreakdown errorPlaid(BigDecimal errorPlaid) {
    
    this.errorPlaid = errorPlaid;
    return this;
  }

   /**
   * The percentage of logins that are failing due to an internal Plaid issue, expressed as a decimal. 
   * @return errorPlaid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The percentage of logins that are failing due to an internal Plaid issue, expressed as a decimal. ")

  public BigDecimal getErrorPlaid() {
    return errorPlaid;
  }


  public void setErrorPlaid(BigDecimal errorPlaid) {
    this.errorPlaid = errorPlaid;
  }


  public ProductStatusBreakdown errorInstitution(BigDecimal errorInstitution) {
    
    this.errorInstitution = errorInstitution;
    return this;
  }

   /**
   * The percentage of logins that are failing due to an issue in the institution&#39;s system, expressed as a decimal.
   * @return errorInstitution
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The percentage of logins that are failing due to an issue in the institution's system, expressed as a decimal.")

  public BigDecimal getErrorInstitution() {
    return errorInstitution;
  }


  public void setErrorInstitution(BigDecimal errorInstitution) {
    this.errorInstitution = errorInstitution;
  }


  public ProductStatusBreakdown refreshInterval(RefreshIntervalEnum refreshInterval) {
    
    this.refreshInterval = refreshInterval;
    return this;
  }

   /**
   * The &#x60;refresh_interval&#x60; may be &#x60;DELAYED&#x60; or &#x60;STOPPED&#x60; even when the success rate is high. This value is only returned for Transactions status breakdowns.
   * @return refreshInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `refresh_interval` may be `DELAYED` or `STOPPED` even when the success rate is high. This value is only returned for Transactions status breakdowns.")

  public RefreshIntervalEnum getRefreshInterval() {
    return refreshInterval;
  }


  public void setRefreshInterval(RefreshIntervalEnum refreshInterval) {
    this.refreshInterval = refreshInterval;
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
  public ProductStatusBreakdown putAdditionalProperty(String key, Object value) {
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
    ProductStatusBreakdown productStatusBreakdown = (ProductStatusBreakdown) o;
    return Objects.equals(this.success, productStatusBreakdown.success) &&
        Objects.equals(this.errorPlaid, productStatusBreakdown.errorPlaid) &&
        Objects.equals(this.errorInstitution, productStatusBreakdown.errorInstitution) &&
        Objects.equals(this.refreshInterval, productStatusBreakdown.refreshInterval)&&
        Objects.equals(this.additionalProperties, productStatusBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorPlaid, errorInstitution, refreshInterval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStatusBreakdown {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorPlaid: ").append(toIndentedString(errorPlaid)).append("\n");
    sb.append("    errorInstitution: ").append(toIndentedString(errorInstitution)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("error_plaid");
    openapiFields.add("error_institution");
    openapiFields.add("refresh_interval");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("error_plaid");
    openapiRequiredFields.add("error_institution");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductStatusBreakdown
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductStatusBreakdown.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductStatusBreakdown is not found in the empty JSON string", ProductStatusBreakdown.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductStatusBreakdown.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("refresh_interval") != null && !jsonObj.get("refresh_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_interval").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductStatusBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductStatusBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductStatusBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductStatusBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductStatusBreakdown>() {
           @Override
           public void write(JsonWriter out, ProductStatusBreakdown value) throws IOException {
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
           public ProductStatusBreakdown read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductStatusBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductStatusBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductStatusBreakdown
  * @throws IOException if the JSON string is invalid with respect to ProductStatusBreakdown
  */
  public static ProductStatusBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductStatusBreakdown.class);
  }

 /**
  * Convert an instance of ProductStatusBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

