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
import java.time.OffsetDateTime;

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
 * An object specifying information about the end user who will be linking their account.
 */
@ApiModel(description = "An object specifying information about the end user who will be linking their account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class LinkTokenCreateRequestUser {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_VERIFIED_TIME = "phone_number_verified_time";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_VERIFIED_TIME)
  private OffsetDateTime phoneNumberVerifiedTime;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_VERIFIED_TIME = "email_address_verified_time";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_VERIFIED_TIME)
  private OffsetDateTime emailAddressVerifiedTime;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public LinkTokenCreateRequestUser() { 
  }

  public LinkTokenCreateRequestUser clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;. It is currently used as a means of searching logs for the given user in the Plaid Dashboard.
   * @return clientUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`. It is currently used as a means of searching logs for the given user in the Plaid Dashboard.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public LinkTokenCreateRequestUser legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The user&#39;s full legal name. This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user) to associate Items to the user.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's full legal name. This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user) to associate Items to the user.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public LinkTokenCreateRequestUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user).
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user).")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public LinkTokenCreateRequestUser phoneNumberVerifiedTime(OffsetDateTime phoneNumberVerifiedTime) {
    
    this.phoneNumberVerifiedTime = phoneNumberVerifiedTime;
    return this;
  }

   /**
   * The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDThh:mm:ssZ&#x60;). This field is optional, but required to enable any [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: &#x60;2020-01-01T00:00:00Z&#x60; 
   * @return phoneNumberVerifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This field is optional, but required to enable any [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z` ")

  public OffsetDateTime getPhoneNumberVerifiedTime() {
    return phoneNumberVerifiedTime;
  }


  public void setPhoneNumberVerifiedTime(OffsetDateTime phoneNumberVerifiedTime) {
    this.phoneNumberVerifiedTime = phoneNumberVerifiedTime;
  }


  public LinkTokenCreateRequestUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#enabling-the-returning-user-experience).
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#enabling-the-returning-user-experience).")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public LinkTokenCreateRequestUser emailAddressVerifiedTime(OffsetDateTime emailAddressVerifiedTime) {
    
    this.emailAddressVerifiedTime = emailAddressVerifiedTime;
    return this;
  }

   /**
   * The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDThh:mm:ssZ&#x60;). This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: &#x60;2020-01-01T00:00:00Z&#x60;
   * @return emailAddressVerifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This is an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user).   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z`")

  public OffsetDateTime getEmailAddressVerifiedTime() {
    return emailAddressVerifiedTime;
  }


  public void setEmailAddressVerifiedTime(OffsetDateTime emailAddressVerifiedTime) {
    this.emailAddressVerifiedTime = emailAddressVerifiedTime;
  }


  public LinkTokenCreateRequestUser ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * To be provided in the format \&quot;ddd-dd-dddd\&quot;. This field is optional and will support not-yet-implemented functionality for new products.
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To be provided in the format \"ddd-dd-dddd\". This field is optional and will support not-yet-implemented functionality for new products.")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public LinkTokenCreateRequestUser dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * To be provided in the format \&quot;yyyy-mm-dd\&quot;. This field is optional and will support not-yet-implemented functionality for new products.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To be provided in the format \"yyyy-mm-dd\". This field is optional and will support not-yet-implemented functionality for new products.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestUser linkTokenCreateRequestUser = (LinkTokenCreateRequestUser) o;
    return Objects.equals(this.clientUserId, linkTokenCreateRequestUser.clientUserId) &&
        Objects.equals(this.legalName, linkTokenCreateRequestUser.legalName) &&
        Objects.equals(this.phoneNumber, linkTokenCreateRequestUser.phoneNumber) &&
        Objects.equals(this.phoneNumberVerifiedTime, linkTokenCreateRequestUser.phoneNumberVerifiedTime) &&
        Objects.equals(this.emailAddress, linkTokenCreateRequestUser.emailAddress) &&
        Objects.equals(this.emailAddressVerifiedTime, linkTokenCreateRequestUser.emailAddressVerifiedTime) &&
        Objects.equals(this.ssn, linkTokenCreateRequestUser.ssn) &&
        Objects.equals(this.dateOfBirth, linkTokenCreateRequestUser.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, legalName, phoneNumber, phoneNumberVerifiedTime, emailAddress, emailAddressVerifiedTime, ssn, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestUser {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerifiedTime: ").append(toIndentedString(phoneNumberVerifiedTime)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressVerifiedTime: ").append(toIndentedString(emailAddressVerifiedTime)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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
    openapiFields.add("client_user_id");
    openapiFields.add("legal_name");
    openapiFields.add("phone_number");
    openapiFields.add("phone_number_verified_time");
    openapiFields.add("email_address");
    openapiFields.add("email_address_verified_time");
    openapiFields.add("ssn");
    openapiFields.add("date_of_birth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_user_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkTokenCreateRequestUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LinkTokenCreateRequestUser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkTokenCreateRequestUser is not found in the empty JSON string", LinkTokenCreateRequestUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkTokenCreateRequestUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkTokenCreateRequestUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkTokenCreateRequestUser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("client_user_id") != null && !jsonObj.get("client_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_user_id").toString()));
      }
      if (jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if (jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkTokenCreateRequestUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkTokenCreateRequestUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkTokenCreateRequestUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkTokenCreateRequestUser.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkTokenCreateRequestUser>() {
           @Override
           public void write(JsonWriter out, LinkTokenCreateRequestUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkTokenCreateRequestUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkTokenCreateRequestUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkTokenCreateRequestUser
  * @throws IOException if the JSON string is invalid with respect to LinkTokenCreateRequestUser
  */
  public static LinkTokenCreateRequestUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkTokenCreateRequestUser.class);
  }

 /**
  * Convert an instance of LinkTokenCreateRequestUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

