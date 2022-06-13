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
import org.openapitools.client.model.PlaidError;

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
 * Fired when Asset Report generation has failed. The resulting &#x60;error&#x60; will have an &#x60;error_type&#x60; of &#x60;ASSET_REPORT_ERROR&#x60;.
 */
@ApiModel(description = "Fired when Asset Report generation has failed. The resulting `error` will have an `error_type` of `ASSET_REPORT_ERROR`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class AssetsErrorWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public AssetsErrorWebhook() { 
  }

  public AssetsErrorWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ASSETS&#x60;
   * @return webhookType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`ASSETS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public AssetsErrorWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;ERROR&#x60;
   * @return webhookCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`ERROR`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public AssetsErrorWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public AssetsErrorWebhook assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The ID associated with the Asset Report.
   * @return assetReportId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID associated with the Asset Report.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
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
  public AssetsErrorWebhook putAdditionalProperty(String key, Object value) {
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
    AssetsErrorWebhook assetsErrorWebhook = (AssetsErrorWebhook) o;
    return Objects.equals(this.webhookType, assetsErrorWebhook.webhookType) &&
        Objects.equals(this.webhookCode, assetsErrorWebhook.webhookCode) &&
        Objects.equals(this.error, assetsErrorWebhook.error) &&
        Objects.equals(this.assetReportId, assetsErrorWebhook.assetReportId)&&
        Objects.equals(this.additionalProperties, assetsErrorWebhook.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, assetReportId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsErrorWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
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
    openapiFields.add("webhook_type");
    openapiFields.add("webhook_code");
    openapiFields.add("error");
    openapiFields.add("asset_report_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("webhook_type");
    openapiRequiredFields.add("webhook_code");
    openapiRequiredFields.add("error");
    openapiRequiredFields.add("asset_report_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetsErrorWebhook
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetsErrorWebhook.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetsErrorWebhook is not found in the empty JSON string", AssetsErrorWebhook.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssetsErrorWebhook.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("webhook_type") != null && !jsonObj.get("webhook_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_type").toString()));
      }
      if (jsonObj.get("webhook_code") != null && !jsonObj.get("webhook_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhook_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhook_code").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        PlaidError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      if (jsonObj.get("asset_report_id") != null && !jsonObj.get("asset_report_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_report_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_report_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsErrorWebhook.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsErrorWebhook' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsErrorWebhook> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsErrorWebhook.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsErrorWebhook>() {
           @Override
           public void write(JsonWriter out, AssetsErrorWebhook value) throws IOException {
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
           public AssetsErrorWebhook read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssetsErrorWebhook instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssetsErrorWebhook given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsErrorWebhook
  * @throws IOException if the JSON string is invalid with respect to AssetsErrorWebhook
  */
  public static AssetsErrorWebhook fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsErrorWebhook.class);
  }

 /**
  * Convert an instance of AssetsErrorWebhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
