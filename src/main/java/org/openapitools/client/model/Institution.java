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
import org.openapitools.client.model.AuthMetadata;
import org.openapitools.client.model.CountryCode;
import org.openapitools.client.model.InstitutionStatus;
import org.openapitools.client.model.PaymentInitiationMetadata;
import org.openapitools.client.model.Products;
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
 * Details relating to a specific financial institution
 */
@ApiModel(description = "Details relating to a specific financial institution")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class Institution {
  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private List<CountryCode> countryCodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PRIMARY_COLOR = "primary_color";
  @SerializedName(SERIALIZED_NAME_PRIMARY_COLOR)
  private String primaryColor;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_ROUTING_NUMBERS = "routing_numbers";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBERS)
  private List<String> routingNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_OAUTH = "oauth";
  @SerializedName(SERIALIZED_NAME_OAUTH)
  private Boolean oauth;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private InstitutionStatus status;

  public static final String SERIALIZED_NAME_PAYMENT_INITIATION_METADATA = "payment_initiation_metadata";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INITIATION_METADATA)
  private PaymentInitiationMetadata paymentInitiationMetadata;

  public static final String SERIALIZED_NAME_AUTH_METADATA = "auth_metadata";
  @SerializedName(SERIALIZED_NAME_AUTH_METADATA)
  private AuthMetadata authMetadata;

  public Institution() { 
  }

  public Institution institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Unique identifier for the institution
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the institution")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Institution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The official name of the institution
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The official name of the institution")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Institution products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public Institution addProductsItem(Products productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * A list of the Plaid products supported by the institution. Note that only institutions that support Instant Auth will return &#x60;auth&#x60; in the product array; institutions that do not list &#x60;auth&#x60; may still support other Auth methods such as Instant Match or Automated Micro-deposit Verification. To identify institutions that support those methods, use the &#x60;auth_metadata&#x60; object. For more details, see [Full Auth coverage](https://plaid.com/docs/auth/coverage/).
   * @return products
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the Plaid products supported by the institution. Note that only institutions that support Instant Auth will return `auth` in the product array; institutions that do not list `auth` may still support other Auth methods such as Instant Match or Automated Micro-deposit Verification. To identify institutions that support those methods, use the `auth_metadata` object. For more details, see [Full Auth coverage](https://plaid.com/docs/auth/coverage/).")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public Institution countryCodes(List<CountryCode> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public Institution addCountryCodesItem(CountryCode countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * A list of the country codes supported by the institution.
   * @return countryCodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of the country codes supported by the institution.")

  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public Institution url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for the institution&#39;s website
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the institution's website")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Institution primaryColor(String primaryColor) {
    
    this.primaryColor = primaryColor;
    return this;
  }

   /**
   * Hexadecimal representation of the primary color used by the institution
   * @return primaryColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hexadecimal representation of the primary color used by the institution")

  public String getPrimaryColor() {
    return primaryColor;
  }


  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public Institution logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Base64 encoded representation of the institution&#39;s logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64 encoded representation of the institution's logo")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public Institution routingNumbers(List<String> routingNumbers) {
    
    this.routingNumbers = routingNumbers;
    return this;
  }

  public Institution addRoutingNumbersItem(String routingNumbersItem) {
    this.routingNumbers.add(routingNumbersItem);
    return this;
  }

   /**
   * A partial list of routing numbers associated with the institution. This list is provided for the purpose of looking up institutions by routing number. It is not comprehensive and should never be used as a complete list of routing numbers for an institution.
   * @return routingNumbers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A partial list of routing numbers associated with the institution. This list is provided for the purpose of looking up institutions by routing number. It is not comprehensive and should never be used as a complete list of routing numbers for an institution.")

  public List<String> getRoutingNumbers() {
    return routingNumbers;
  }


  public void setRoutingNumbers(List<String> routingNumbers) {
    this.routingNumbers = routingNumbers;
  }


  public Institution oauth(Boolean oauth) {
    
    this.oauth = oauth;
    return this;
  }

   /**
   * Indicates that the institution has an OAuth login flow.
   * @return oauth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates that the institution has an OAuth login flow.")

  public Boolean getOauth() {
    return oauth;
  }


  public void setOauth(Boolean oauth) {
    this.oauth = oauth;
  }


  public Institution status(InstitutionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstitutionStatus getStatus() {
    return status;
  }


  public void setStatus(InstitutionStatus status) {
    this.status = status;
  }


  public Institution paymentInitiationMetadata(PaymentInitiationMetadata paymentInitiationMetadata) {
    
    this.paymentInitiationMetadata = paymentInitiationMetadata;
    return this;
  }

   /**
   * Get paymentInitiationMetadata
   * @return paymentInitiationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationMetadata getPaymentInitiationMetadata() {
    return paymentInitiationMetadata;
  }


  public void setPaymentInitiationMetadata(PaymentInitiationMetadata paymentInitiationMetadata) {
    this.paymentInitiationMetadata = paymentInitiationMetadata;
  }


  public Institution authMetadata(AuthMetadata authMetadata) {
    
    this.authMetadata = authMetadata;
    return this;
  }

   /**
   * Get authMetadata
   * @return authMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthMetadata getAuthMetadata() {
    return authMetadata;
  }


  public void setAuthMetadata(AuthMetadata authMetadata) {
    this.authMetadata = authMetadata;
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
  public Institution putAdditionalProperty(String key, Object value) {
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
    Institution institution = (Institution) o;
    return Objects.equals(this.institutionId, institution.institutionId) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.products, institution.products) &&
        Objects.equals(this.countryCodes, institution.countryCodes) &&
        Objects.equals(this.url, institution.url) &&
        Objects.equals(this.primaryColor, institution.primaryColor) &&
        Objects.equals(this.logo, institution.logo) &&
        Objects.equals(this.routingNumbers, institution.routingNumbers) &&
        Objects.equals(this.oauth, institution.oauth) &&
        Objects.equals(this.status, institution.status) &&
        Objects.equals(this.paymentInitiationMetadata, institution.paymentInitiationMetadata) &&
        Objects.equals(this.authMetadata, institution.authMetadata)&&
        Objects.equals(this.additionalProperties, institution.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, name, products, countryCodes, url, primaryColor, logo, routingNumbers, oauth, status, paymentInitiationMetadata, authMetadata, additionalProperties);
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
    sb.append("class Institution {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    routingNumbers: ").append(toIndentedString(routingNumbers)).append("\n");
    sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentInitiationMetadata: ").append(toIndentedString(paymentInitiationMetadata)).append("\n");
    sb.append("    authMetadata: ").append(toIndentedString(authMetadata)).append("\n");
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
    openapiFields.add("institution_id");
    openapiFields.add("name");
    openapiFields.add("products");
    openapiFields.add("country_codes");
    openapiFields.add("url");
    openapiFields.add("primary_color");
    openapiFields.add("logo");
    openapiFields.add("routing_numbers");
    openapiFields.add("oauth");
    openapiFields.add("status");
    openapiFields.add("payment_initiation_metadata");
    openapiFields.add("auth_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("institution_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("products");
    openapiRequiredFields.add("country_codes");
    openapiRequiredFields.add("routing_numbers");
    openapiRequiredFields.add("oauth");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Institution
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Institution.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Institution is not found in the empty JSON string", Institution.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Institution.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("country_codes") != null && !jsonObj.get("country_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_codes` to be an array in the JSON string but got `%s`", jsonObj.get("country_codes").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("primary_color") != null && !jsonObj.get("primary_color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_color").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("routing_numbers") != null && !jsonObj.get("routing_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("routing_numbers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Institution.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Institution' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Institution> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Institution.class));

       return (TypeAdapter<T>) new TypeAdapter<Institution>() {
           @Override
           public void write(JsonWriter out, Institution value) throws IOException {
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
           public Institution read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Institution instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Institution given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Institution
  * @throws IOException if the JSON string is invalid with respect to Institution
  */
  public static Institution fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Institution.class);
  }

 /**
  * Convert an instance of Institution to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
