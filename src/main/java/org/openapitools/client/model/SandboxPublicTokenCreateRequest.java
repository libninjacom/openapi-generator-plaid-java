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
import org.openapitools.client.model.Products;
import org.openapitools.client.model.SandboxPublicTokenCreateRequestOptions;

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
 * SandboxPublicTokenCreateRequest defines the request schema for &#x60;/sandbox/public_token/create&#x60;
 */
@ApiModel(description = "SandboxPublicTokenCreateRequest defines the request schema for `/sandbox/public_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class SandboxPublicTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INITIAL_PRODUCTS = "initial_products";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRODUCTS)
  private List<Products> initialProducts = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private SandboxPublicTokenCreateRequestOptions options;

  public SandboxPublicTokenCreateRequest() { 
  }

  public SandboxPublicTokenCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SandboxPublicTokenCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SandboxPublicTokenCreateRequest institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The ID of the institution the Item will be associated with
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the institution the Item will be associated with")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public SandboxPublicTokenCreateRequest initialProducts(List<Products> initialProducts) {
    
    this.initialProducts = initialProducts;
    return this;
  }

  public SandboxPublicTokenCreateRequest addInitialProductsItem(Products initialProductsItem) {
    this.initialProducts.add(initialProductsItem);
    return this;
  }

   /**
   * The products to initially pull for the Item. May be any products that the specified &#x60;institution_id&#x60;  supports. This array may not be empty.
   * @return initialProducts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The products to initially pull for the Item. May be any products that the specified `institution_id`  supports. This array may not be empty.")

  public List<Products> getInitialProducts() {
    return initialProducts;
  }


  public void setInitialProducts(List<Products> initialProducts) {
    this.initialProducts = initialProducts;
  }


  public SandboxPublicTokenCreateRequest options(SandboxPublicTokenCreateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(SandboxPublicTokenCreateRequestOptions options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequest sandboxPublicTokenCreateRequest = (SandboxPublicTokenCreateRequest) o;
    return Objects.equals(this.clientId, sandboxPublicTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, sandboxPublicTokenCreateRequest.secret) &&
        Objects.equals(this.institutionId, sandboxPublicTokenCreateRequest.institutionId) &&
        Objects.equals(this.initialProducts, sandboxPublicTokenCreateRequest.initialProducts) &&
        Objects.equals(this.options, sandboxPublicTokenCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, institutionId, initialProducts, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    initialProducts: ").append(toIndentedString(initialProducts)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("secret");
    openapiFields.add("institution_id");
    openapiFields.add("initial_products");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("institution_id");
    openapiRequiredFields.add("initial_products");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SandboxPublicTokenCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SandboxPublicTokenCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SandboxPublicTokenCreateRequest is not found in the empty JSON string", SandboxPublicTokenCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SandboxPublicTokenCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SandboxPublicTokenCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SandboxPublicTokenCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("initial_products") != null && !jsonObj.get("initial_products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_products` to be an array in the JSON string but got `%s`", jsonObj.get("initial_products").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.getAsJsonObject("options") != null) {
        SandboxPublicTokenCreateRequestOptions.validateJsonObject(jsonObj.getAsJsonObject("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SandboxPublicTokenCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SandboxPublicTokenCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SandboxPublicTokenCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SandboxPublicTokenCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SandboxPublicTokenCreateRequest>() {
           @Override
           public void write(JsonWriter out, SandboxPublicTokenCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SandboxPublicTokenCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SandboxPublicTokenCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SandboxPublicTokenCreateRequest
  * @throws IOException if the JSON string is invalid with respect to SandboxPublicTokenCreateRequest
  */
  public static SandboxPublicTokenCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SandboxPublicTokenCreateRequest.class);
  }

 /**
  * Convert an instance of SandboxPublicTokenCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
