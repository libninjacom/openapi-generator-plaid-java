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
import org.openapitools.client.model.IncomeVerificationPrecheckEmployerAddress;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Information about the end user&#39;s employer
 */
@ApiModel(description = "Information about the end user's employer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class IncomeVerificationPrecheckEmployer {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private IncomeVerificationPrecheckEmployerAddress address;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public IncomeVerificationPrecheckEmployer() { 
  }

  public IncomeVerificationPrecheckEmployer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The employer&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employer's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IncomeVerificationPrecheckEmployer address(IncomeVerificationPrecheckEmployerAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationPrecheckEmployerAddress getAddress() {
    return address;
  }


  public void setAddress(IncomeVerificationPrecheckEmployerAddress address) {
    this.address = address;
  }


  public IncomeVerificationPrecheckEmployer taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The employer&#39;s tax id
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employer's tax id")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public IncomeVerificationPrecheckEmployer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for the employer&#39;s public website
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the employer's public website")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckEmployer incomeVerificationPrecheckEmployer = (IncomeVerificationPrecheckEmployer) o;
    return Objects.equals(this.name, incomeVerificationPrecheckEmployer.name) &&
        Objects.equals(this.address, incomeVerificationPrecheckEmployer.address) &&
        Objects.equals(this.taxId, incomeVerificationPrecheckEmployer.taxId) &&
        Objects.equals(this.url, incomeVerificationPrecheckEmployer.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, taxId, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckEmployer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("address");
    openapiFields.add("tax_id");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IncomeVerificationPrecheckEmployer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IncomeVerificationPrecheckEmployer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncomeVerificationPrecheckEmployer is not found in the empty JSON string", IncomeVerificationPrecheckEmployer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IncomeVerificationPrecheckEmployer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IncomeVerificationPrecheckEmployer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.getAsJsonObject("address") != null) {
        IncomeVerificationPrecheckEmployerAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      if (jsonObj.get("tax_id") != null && !jsonObj.get("tax_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_id").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncomeVerificationPrecheckEmployer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncomeVerificationPrecheckEmployer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncomeVerificationPrecheckEmployer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncomeVerificationPrecheckEmployer.class));

       return (TypeAdapter<T>) new TypeAdapter<IncomeVerificationPrecheckEmployer>() {
           @Override
           public void write(JsonWriter out, IncomeVerificationPrecheckEmployer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IncomeVerificationPrecheckEmployer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IncomeVerificationPrecheckEmployer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncomeVerificationPrecheckEmployer
  * @throws IOException if the JSON string is invalid with respect to IncomeVerificationPrecheckEmployer
  */
  public static IncomeVerificationPrecheckEmployer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncomeVerificationPrecheckEmployer.class);
  }

 /**
  * Convert an instance of IncomeVerificationPrecheckEmployer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
