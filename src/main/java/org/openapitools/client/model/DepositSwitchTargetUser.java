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
import org.openapitools.client.model.DepositSwitchAddressData;

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
 * The deposit switch target user
 */
@ApiModel(description = "The deposit switch target user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class DepositSwitchTargetUser {
  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private DepositSwitchAddressData address;

  public static final String SERIALIZED_NAME_TAX_PAYER_ID = "tax_payer_id";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_ID)
  private String taxPayerId;

  public DepositSwitchTargetUser() { 
  }

  public DepositSwitchTargetUser givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * The given name (first name) of the user.
   * @return givenName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The given name (first name) of the user.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public DepositSwitchTargetUser familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * The family name (last name) of the user.
   * @return familyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The family name (last name) of the user.")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public DepositSwitchTargetUser phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the user. The endpoint can accept a variety of phone number formats, including E.164.
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The phone number of the user. The endpoint can accept a variety of phone number formats, including E.164.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public DepositSwitchTargetUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public DepositSwitchTargetUser address(DepositSwitchAddressData address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositSwitchAddressData getAddress() {
    return address;
  }


  public void setAddress(DepositSwitchAddressData address) {
    this.address = address;
  }


  public DepositSwitchTargetUser taxPayerId(String taxPayerId) {
    
    this.taxPayerId = taxPayerId;
    return this;
  }

   /**
   * The taxpayer ID of the user, generally their SSN, EIN, or TIN.
   * @return taxPayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The taxpayer ID of the user, generally their SSN, EIN, or TIN.")

  public String getTaxPayerId() {
    return taxPayerId;
  }


  public void setTaxPayerId(String taxPayerId) {
    this.taxPayerId = taxPayerId;
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
  public DepositSwitchTargetUser putAdditionalProperty(String key, Object value) {
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
    DepositSwitchTargetUser depositSwitchTargetUser = (DepositSwitchTargetUser) o;
    return Objects.equals(this.givenName, depositSwitchTargetUser.givenName) &&
        Objects.equals(this.familyName, depositSwitchTargetUser.familyName) &&
        Objects.equals(this.phone, depositSwitchTargetUser.phone) &&
        Objects.equals(this.email, depositSwitchTargetUser.email) &&
        Objects.equals(this.address, depositSwitchTargetUser.address) &&
        Objects.equals(this.taxPayerId, depositSwitchTargetUser.taxPayerId)&&
        Objects.equals(this.additionalProperties, depositSwitchTargetUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, phone, email, address, taxPayerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchTargetUser {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxPayerId: ").append(toIndentedString(taxPayerId)).append("\n");
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
    openapiFields.add("given_name");
    openapiFields.add("family_name");
    openapiFields.add("phone");
    openapiFields.add("email");
    openapiFields.add("address");
    openapiFields.add("tax_payer_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("given_name");
    openapiRequiredFields.add("family_name");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DepositSwitchTargetUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DepositSwitchTargetUser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositSwitchTargetUser is not found in the empty JSON string", DepositSwitchTargetUser.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositSwitchTargetUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("given_name") != null && !jsonObj.get("given_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given_name").toString()));
      }
      if (jsonObj.get("family_name") != null && !jsonObj.get("family_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family_name").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("tax_payer_id") != null && !jsonObj.get("tax_payer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_payer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_payer_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositSwitchTargetUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositSwitchTargetUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositSwitchTargetUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositSwitchTargetUser.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositSwitchTargetUser>() {
           @Override
           public void write(JsonWriter out, DepositSwitchTargetUser value) throws IOException {
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
           public DepositSwitchTargetUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DepositSwitchTargetUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DepositSwitchTargetUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositSwitchTargetUser
  * @throws IOException if the JSON string is invalid with respect to DepositSwitchTargetUser
  */
  public static DepositSwitchTargetUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositSwitchTargetUser.class);
  }

 /**
  * Convert an instance of DepositSwitchTargetUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
