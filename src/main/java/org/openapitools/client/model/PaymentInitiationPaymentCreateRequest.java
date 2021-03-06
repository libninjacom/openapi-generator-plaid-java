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
import org.openapitools.client.model.ExternalPaymentOptions;
import org.openapitools.client.model.ExternalPaymentScheduleRequest;
import org.openapitools.client.model.PaymentAmount;
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
 * PaymentInitiationPaymentCreateRequest defines the request schema for &#x60;/payment_initiation/payment/create&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentCreateRequest defines the request schema for `/payment_initiation/payment/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class PaymentInitiationPaymentCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private PaymentAmount amount;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private ExternalPaymentScheduleRequest schedule;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ExternalPaymentOptions options;

  public PaymentInitiationPaymentCreateRequest() { 
  }

  public PaymentInitiationPaymentCreateRequest clientId(String clientId) {
    
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


  public PaymentInitiationPaymentCreateRequest secret(String secret) {
    
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


  public PaymentInitiationPaymentCreateRequest recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient the payment is for.
   * @return recipientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the recipient the payment is for.")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationPaymentCreateRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment. This must be an alphanumeric string with at most 18 characters and must not contain any special characters (since not all institutions support them).
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A reference for the payment. This must be an alphanumeric string with at most 18 characters and must not contain any special characters (since not all institutions support them).")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationPaymentCreateRequest amount(PaymentAmount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentAmount getAmount() {
    return amount;
  }


  public void setAmount(PaymentAmount amount) {
    this.amount = amount;
  }


  public PaymentInitiationPaymentCreateRequest schedule(ExternalPaymentScheduleRequest schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentScheduleRequest getSchedule() {
    return schedule;
  }


  public void setSchedule(ExternalPaymentScheduleRequest schedule) {
    this.schedule = schedule;
  }


  public PaymentInitiationPaymentCreateRequest options(ExternalPaymentOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExternalPaymentOptions getOptions() {
    return options;
  }


  public void setOptions(ExternalPaymentOptions options) {
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
    PaymentInitiationPaymentCreateRequest paymentInitiationPaymentCreateRequest = (PaymentInitiationPaymentCreateRequest) o;
    return Objects.equals(this.clientId, paymentInitiationPaymentCreateRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationPaymentCreateRequest.secret) &&
        Objects.equals(this.recipientId, paymentInitiationPaymentCreateRequest.recipientId) &&
        Objects.equals(this.reference, paymentInitiationPaymentCreateRequest.reference) &&
        Objects.equals(this.amount, paymentInitiationPaymentCreateRequest.amount) &&
        Objects.equals(this.schedule, paymentInitiationPaymentCreateRequest.schedule) &&
        Objects.equals(this.options, paymentInitiationPaymentCreateRequest.options);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, recipientId, reference, amount, schedule, options);
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
    sb.append("class PaymentInitiationPaymentCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
    openapiFields.add("recipient_id");
    openapiFields.add("reference");
    openapiFields.add("amount");
    openapiFields.add("schedule");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recipient_id");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentInitiationPaymentCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentInitiationPaymentCreateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentInitiationPaymentCreateRequest is not found in the empty JSON string", PaymentInitiationPaymentCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentInitiationPaymentCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentInitiationPaymentCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentInitiationPaymentCreateRequest.openapiRequiredFields) {
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
      if (jsonObj.get("recipient_id") != null && !jsonObj.get("recipient_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient_id").toString()));
      }
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `schedule`
      if (jsonObj.getAsJsonObject("schedule") != null) {
        ExternalPaymentScheduleRequest.validateJsonObject(jsonObj.getAsJsonObject("schedule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentInitiationPaymentCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentInitiationPaymentCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentInitiationPaymentCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentInitiationPaymentCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentInitiationPaymentCreateRequest>() {
           @Override
           public void write(JsonWriter out, PaymentInitiationPaymentCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentInitiationPaymentCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentInitiationPaymentCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentInitiationPaymentCreateRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentInitiationPaymentCreateRequest
  */
  public static PaymentInitiationPaymentCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentInitiationPaymentCreateRequest.class);
  }

 /**
  * Convert an instance of PaymentInitiationPaymentCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

