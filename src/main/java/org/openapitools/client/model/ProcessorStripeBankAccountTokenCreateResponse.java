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
 * ProcessorStripeBankAccountTokenCreateResponse defines the response schema for &#x60;/processor/stripe/bank_account/create&#x60;
 */
@ApiModel(description = "ProcessorStripeBankAccountTokenCreateResponse defines the response schema for `/processor/stripe/bank_account/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ProcessorStripeBankAccountTokenCreateResponse {
  public static final String SERIALIZED_NAME_STRIPE_BANK_ACCOUNT_TOKEN = "stripe_bank_account_token";
  @SerializedName(SERIALIZED_NAME_STRIPE_BANK_ACCOUNT_TOKEN)
  private String stripeBankAccountToken;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public ProcessorStripeBankAccountTokenCreateResponse() { 
  }

  public ProcessorStripeBankAccountTokenCreateResponse stripeBankAccountToken(String stripeBankAccountToken) {
    
    this.stripeBankAccountToken = stripeBankAccountToken;
    return this;
  }

   /**
   * A token that can be sent to Stripe for use in making API calls to Plaid
   * @return stripeBankAccountToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A token that can be sent to Stripe for use in making API calls to Plaid")

  public String getStripeBankAccountToken() {
    return stripeBankAccountToken;
  }


  public void setStripeBankAccountToken(String stripeBankAccountToken) {
    this.stripeBankAccountToken = stripeBankAccountToken;
  }


  public ProcessorStripeBankAccountTokenCreateResponse requestId(String requestId) {
    
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
  public ProcessorStripeBankAccountTokenCreateResponse putAdditionalProperty(String key, Object value) {
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
    ProcessorStripeBankAccountTokenCreateResponse processorStripeBankAccountTokenCreateResponse = (ProcessorStripeBankAccountTokenCreateResponse) o;
    return Objects.equals(this.stripeBankAccountToken, processorStripeBankAccountTokenCreateResponse.stripeBankAccountToken) &&
        Objects.equals(this.requestId, processorStripeBankAccountTokenCreateResponse.requestId)&&
        Objects.equals(this.additionalProperties, processorStripeBankAccountTokenCreateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeBankAccountToken, requestId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorStripeBankAccountTokenCreateResponse {\n");
    sb.append("    stripeBankAccountToken: ").append(toIndentedString(stripeBankAccountToken)).append("\n");
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
    openapiFields.add("stripe_bank_account_token");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stripe_bank_account_token");
    openapiRequiredFields.add("request_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorStripeBankAccountTokenCreateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorStripeBankAccountTokenCreateResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorStripeBankAccountTokenCreateResponse is not found in the empty JSON string", ProcessorStripeBankAccountTokenCreateResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProcessorStripeBankAccountTokenCreateResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("stripe_bank_account_token") != null && !jsonObj.get("stripe_bank_account_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_bank_account_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_bank_account_token").toString()));
      }
      if (jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorStripeBankAccountTokenCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorStripeBankAccountTokenCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorStripeBankAccountTokenCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorStripeBankAccountTokenCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorStripeBankAccountTokenCreateResponse>() {
           @Override
           public void write(JsonWriter out, ProcessorStripeBankAccountTokenCreateResponse value) throws IOException {
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
           public ProcessorStripeBankAccountTokenCreateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProcessorStripeBankAccountTokenCreateResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProcessorStripeBankAccountTokenCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorStripeBankAccountTokenCreateResponse
  * @throws IOException if the JSON string is invalid with respect to ProcessorStripeBankAccountTokenCreateResponse
  */
  public static ProcessorStripeBankAccountTokenCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorStripeBankAccountTokenCreateResponse.class);
  }

 /**
  * Convert an instance of ProcessorStripeBankAccountTokenCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

