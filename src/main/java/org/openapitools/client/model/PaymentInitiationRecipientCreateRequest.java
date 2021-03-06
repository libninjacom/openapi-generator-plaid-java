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
import org.openapitools.client.model.PaymentInitiationAddress;
import org.openapitools.client.model.RecipientBACSNullable;
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
 * PaymentInitiationRecipientCreateRequest defines the request schema for &#x60;/payment_initiation/recipient/create&#x60;
 */
@ApiModel(description = "PaymentInitiationRecipientCreateRequest defines the request schema for `/payment_initiation/recipient/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class PaymentInitiationRecipientCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private RecipientBACSNullable bacs;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PaymentInitiationAddress address;

  public PaymentInitiationRecipientCreateRequest() { 
  }

  public PaymentInitiationRecipientCreateRequest clientId(String clientId) {
    
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


  public PaymentInitiationRecipientCreateRequest secret(String secret) {
    
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


  public PaymentInitiationRecipientCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the recipient
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the recipient")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PaymentInitiationRecipientCreateRequest iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the recipient. If BACS data is not provided, an IBAN is required.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the recipient. If BACS data is not provided, an IBAN is required.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public PaymentInitiationRecipientCreateRequest bacs(RecipientBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(RecipientBACSNullable bacs) {
    this.bacs = bacs;
  }


  public PaymentInitiationRecipientCreateRequest address(PaymentInitiationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationAddress getAddress() {
    return address;
  }


  public void setAddress(PaymentInitiationAddress address) {
    this.address = address;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationRecipientCreateRequest paymentInitiationRecipientCreateRequest = (PaymentInitiationRecipientCreateRequest) o;
    return Objects.equals(this.clientId, paymentInitiationRecipientCreateRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationRecipientCreateRequest.secret) &&
        Objects.equals(this.name, paymentInitiationRecipientCreateRequest.name) &&
        Objects.equals(this.iban, paymentInitiationRecipientCreateRequest.iban) &&
        Objects.equals(this.bacs, paymentInitiationRecipientCreateRequest.bacs) &&
        Objects.equals(this.address, paymentInitiationRecipientCreateRequest.address);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, name, iban, bacs, address);
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
    sb.append("class PaymentInitiationRecipientCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("iban");
    openapiFields.add("bacs");
    openapiFields.add("address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInitiationRecipientCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInitiationRecipientCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInitiationRecipientCreateRequest is not found in the empty JSON string", PaymentInitiationRecipientCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInitiationRecipientCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInitiationRecipientCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentInitiationRecipientCreateRequest.openapiRequiredFields) {
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
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      // validate the optional field `bacs`
      if (jsonObj.getAsJsonObject("bacs") != null) {
        RecipientBACSNullable.validateJsonObject(jsonObj.getAsJsonObject("bacs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInitiationRecipientCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInitiationRecipientCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInitiationRecipientCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInitiationRecipientCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInitiationRecipientCreateRequest>() {
           @Override
           public void write(JsonWriter out, PaymentInitiationRecipientCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInitiationRecipientCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInitiationRecipientCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInitiationRecipientCreateRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentInitiationRecipientCreateRequest
  */
  public static PaymentInitiationRecipientCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInitiationRecipientCreateRequest.class);
  }

 /**
  * Convert an instance of PaymentInitiationRecipientCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

