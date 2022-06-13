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
 * Transaction information specific to inter-bank transfers. If the transaction was not an inter-bank transfer, all fields will be &#x60;null&#x60;.  If the &#x60;transactions&#x60; object was returned by a Transactions endpoint such as &#x60;/transactions/get&#x60;, the &#x60;payment_meta&#x60; key will always appear, but no data elements are guaranteed. If the &#x60;transactions&#x60; object was returned by an Assets endpoint such as &#x60;/asset_report/get/&#x60; or &#x60;/asset_report/pdf/get&#x60;, this field will only appear in an Asset Report with Insights.
 */
@ApiModel(description = "Transaction information specific to inter-bank transfers. If the transaction was not an inter-bank transfer, all fields will be `null`.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/get`, the `payment_meta` key will always appear, but no data elements are guaranteed. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class PaymentMeta {
  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "reference_number";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_PPD_ID = "ppd_id";
  @SerializedName(SERIALIZED_NAME_PPD_ID)
  private String ppdId;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private String payee;

  public static final String SERIALIZED_NAME_BY_ORDER_OF = "by_order_of";
  @SerializedName(SERIALIZED_NAME_BY_ORDER_OF)
  private String byOrderOf;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private String payer;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_PROCESSOR = "payment_processor";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROCESSOR)
  private String paymentProcessor;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public PaymentMeta() { 
  }

  public PaymentMeta referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The transaction reference number supplied by the financial institution.
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The transaction reference number supplied by the financial institution.")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public PaymentMeta ppdId(String ppdId) {
    
    this.ppdId = ppdId;
    return this;
  }

   /**
   * The ACH PPD ID for the payer.
   * @return ppdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ACH PPD ID for the payer.")

  public String getPpdId() {
    return ppdId;
  }


  public void setPpdId(String ppdId) {
    this.ppdId = ppdId;
  }


  public PaymentMeta payee(String payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * For transfers, the party that is receiving the transaction.
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "For transfers, the party that is receiving the transaction.")

  public String getPayee() {
    return payee;
  }


  public void setPayee(String payee) {
    this.payee = payee;
  }


  public PaymentMeta byOrderOf(String byOrderOf) {
    
    this.byOrderOf = byOrderOf;
    return this;
  }

   /**
   * The party initiating a wire transfer. Will be &#x60;null&#x60; if the transaction is not a wire transfer.
   * @return byOrderOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The party initiating a wire transfer. Will be `null` if the transaction is not a wire transfer.")

  public String getByOrderOf() {
    return byOrderOf;
  }


  public void setByOrderOf(String byOrderOf) {
    this.byOrderOf = byOrderOf;
  }


  public PaymentMeta payer(String payer) {
    
    this.payer = payer;
    return this;
  }

   /**
   * For transfers, the party that is paying the transaction.
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "For transfers, the party that is paying the transaction.")

  public String getPayer() {
    return payer;
  }


  public void setPayer(String payer) {
    this.payer = payer;
  }


  public PaymentMeta paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The type of transfer, e.g. &#39;ACH&#39;
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of transfer, e.g. 'ACH'")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentMeta paymentProcessor(String paymentProcessor) {
    
    this.paymentProcessor = paymentProcessor;
    return this;
  }

   /**
   * The name of the payment processor
   * @return paymentProcessor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the payment processor")

  public String getPaymentProcessor() {
    return paymentProcessor;
  }


  public void setPaymentProcessor(String paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }


  public PaymentMeta reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The payer-supplied description of the transfer.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The payer-supplied description of the transfer.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
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
  public PaymentMeta putAdditionalProperty(String key, Object value) {
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
    PaymentMeta paymentMeta = (PaymentMeta) o;
    return Objects.equals(this.referenceNumber, paymentMeta.referenceNumber) &&
        Objects.equals(this.ppdId, paymentMeta.ppdId) &&
        Objects.equals(this.payee, paymentMeta.payee) &&
        Objects.equals(this.byOrderOf, paymentMeta.byOrderOf) &&
        Objects.equals(this.payer, paymentMeta.payer) &&
        Objects.equals(this.paymentMethod, paymentMeta.paymentMethod) &&
        Objects.equals(this.paymentProcessor, paymentMeta.paymentProcessor) &&
        Objects.equals(this.reason, paymentMeta.reason)&&
        Objects.equals(this.additionalProperties, paymentMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, ppdId, payee, byOrderOf, payer, paymentMethod, paymentProcessor, reason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMeta {\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    ppdId: ").append(toIndentedString(ppdId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    byOrderOf: ").append(toIndentedString(byOrderOf)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentProcessor: ").append(toIndentedString(paymentProcessor)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("reference_number");
    openapiFields.add("ppd_id");
    openapiFields.add("payee");
    openapiFields.add("by_order_of");
    openapiFields.add("payer");
    openapiFields.add("payment_method");
    openapiFields.add("payment_processor");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("reference_number");
    openapiRequiredFields.add("ppd_id");
    openapiRequiredFields.add("payee");
    openapiRequiredFields.add("by_order_of");
    openapiRequiredFields.add("payer");
    openapiRequiredFields.add("payment_method");
    openapiRequiredFields.add("payment_processor");
    openapiRequiredFields.add("reason");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMeta is not found in the empty JSON string", PaymentMeta.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMeta.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("reference_number") != null && !jsonObj.get("reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_number").toString()));
      }
      if (jsonObj.get("ppd_id") != null && !jsonObj.get("ppd_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ppd_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ppd_id").toString()));
      }
      if (jsonObj.get("payee") != null && !jsonObj.get("payee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee").toString()));
      }
      if (jsonObj.get("by_order_of") != null && !jsonObj.get("by_order_of").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `by_order_of` to be a primitive type in the JSON string but got `%s`", jsonObj.get("by_order_of").toString()));
      }
      if (jsonObj.get("payer") != null && !jsonObj.get("payer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payer").toString()));
      }
      if (jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if (jsonObj.get("payment_processor") != null && !jsonObj.get("payment_processor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_processor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_processor").toString()));
      }
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMeta>() {
           @Override
           public void write(JsonWriter out, PaymentMeta value) throws IOException {
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
           public PaymentMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMeta
  * @throws IOException if the JSON string is invalid with respect to PaymentMeta
  */
  public static PaymentMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMeta.class);
  }

 /**
  * Convert an instance of PaymentMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

