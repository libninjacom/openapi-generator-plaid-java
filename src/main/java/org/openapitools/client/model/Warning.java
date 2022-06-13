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
import org.openapitools.client.model.Cause;

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
 * It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.
 */
@ApiModel(description = "It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class Warning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private String warningType;

  /**
   * The warning code identifies a specific kind of warning. Currently, the only possible warning code is &#x60;OWNERS_UNAVAILABLE&#x60;, which indicates that account-owner information is not available.
   */
  @JsonAdapter(WarningCodeEnum.Adapter.class)
  public enum WarningCodeEnum {
    OWNERS_UNAVAILABLE("OWNERS_UNAVAILABLE");

    private String value;

    WarningCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WarningCodeEnum fromValue(String value) {
      for (WarningCodeEnum b : WarningCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WarningCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WarningCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WarningCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WarningCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private WarningCodeEnum warningCode;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private Cause cause;

  public Warning() { 
  }

  public Warning warningType(String warningType) {
    
    this.warningType = warningType;
    return this;
  }

   /**
   * The warning type, which will always be &#x60;ASSET_REPORT_WARNING&#x60;
   * @return warningType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The warning type, which will always be `ASSET_REPORT_WARNING`")

  public String getWarningType() {
    return warningType;
  }


  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }


  public Warning warningCode(WarningCodeEnum warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * The warning code identifies a specific kind of warning. Currently, the only possible warning code is &#x60;OWNERS_UNAVAILABLE&#x60;, which indicates that account-owner information is not available.
   * @return warningCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The warning code identifies a specific kind of warning. Currently, the only possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not available.")

  public WarningCodeEnum getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(WarningCodeEnum warningCode) {
    this.warningCode = warningCode;
  }


  public Warning cause(Cause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Cause getCause() {
    return cause;
  }


  public void setCause(Cause cause) {
    this.cause = cause;
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
  public Warning putAdditionalProperty(String key, Object value) {
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
    Warning warning = (Warning) o;
    return Objects.equals(this.warningType, warning.warningType) &&
        Objects.equals(this.warningCode, warning.warningCode) &&
        Objects.equals(this.cause, warning.cause)&&
        Objects.equals(this.additionalProperties, warning.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, cause, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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
    openapiFields.add("warning_type");
    openapiFields.add("warning_code");
    openapiFields.add("cause");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("warning_type");
    openapiRequiredFields.add("warning_code");
    openapiRequiredFields.add("cause");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Warning
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Warning.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Warning is not found in the empty JSON string", Warning.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Warning.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("warning_type") != null && !jsonObj.get("warning_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning_type").toString()));
      }
      if (jsonObj.get("warning_code") != null && !jsonObj.get("warning_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Warning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Warning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Warning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Warning.class));

       return (TypeAdapter<T>) new TypeAdapter<Warning>() {
           @Override
           public void write(JsonWriter out, Warning value) throws IOException {
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
           public Warning read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Warning instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Warning given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Warning
  * @throws IOException if the JSON string is invalid with respect to Warning
  */
  public static Warning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Warning.class);
  }

 /**
  * Convert an instance of Warning to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

