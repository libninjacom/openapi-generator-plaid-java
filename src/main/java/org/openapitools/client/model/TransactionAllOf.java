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
import java.util.Map;
import org.openapitools.client.model.PersonalFinanceCategory;
import org.openapitools.client.model.TransactionCode;
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
 * TransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class TransactionAllOf {
  /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   */
  @JsonAdapter(PaymentChannelEnum.Adapter.class)
  public enum PaymentChannelEnum {
    ONLINE("online"),
    
    IN_STORE("in store"),
    
    OTHER("other");

    private String value;

    PaymentChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentChannelEnum fromValue(String value) {
      for (PaymentChannelEnum b : PaymentChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL = "payment_channel";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL)
  private PaymentChannelEnum paymentChannel;

  public static final String SERIALIZED_NAME_AUTHORIZED_DATE = "authorized_date";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATE)
  private LocalDate authorizedDate;

  public static final String SERIALIZED_NAME_AUTHORIZED_DATETIME = "authorized_datetime";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_DATETIME)
  private OffsetDateTime authorizedDatetime;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;

  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transaction_code";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private TransactionCode transactionCode;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory;

  public TransactionAllOf() { 
  }

  public TransactionAllOf paymentChannel(PaymentChannelEnum paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.  This field replaces the &#x60;transaction_type&#x60; field. 
   * @return paymentChannel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The channel used to make a payment. `online:` transactions that took place online.  `in store:` transactions that were made at a physical location.  `other:` transactions that relate to banks, e.g. fees or deposits.  This field replaces the `transaction_type` field. ")

  public PaymentChannelEnum getPaymentChannel() {
    return paymentChannel;
  }


  public void setPaymentChannel(PaymentChannelEnum paymentChannel) {
    this.paymentChannel = paymentChannel;
  }


  public TransactionAllOf authorizedDate(LocalDate authorizedDate) {
    
    this.authorizedDate = authorizedDate;
    return this;
  }

   /**
   * The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ). The &#x60;authorized_date&#x60; field uses machine learning to determine a transaction date for transactions where the &#x60;date_transacted&#x60; is not available. If the &#x60;date_transacted&#x60; field is present and not &#x60;null&#x60;, the &#x60;authorized_date&#x60; field will have the same value as the &#x60;date_transacted&#x60; field.
   * @return authorizedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ). The `authorized_date` field uses machine learning to determine a transaction date for transactions where the `date_transacted` is not available. If the `date_transacted` field is present and not `null`, the `authorized_date` field will have the same value as the `date_transacted` field.")

  public LocalDate getAuthorizedDate() {
    return authorizedDate;
  }


  public void setAuthorizedDate(LocalDate authorizedDate) {
    this.authorizedDate = authorizedDate;
  }


  public TransactionAllOf authorizedDatetime(OffsetDateTime authorizedDatetime) {
    
    this.authorizedDatetime = authorizedDatetime;
    return this;
  }

   /**
   * Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).
   * @return authorizedDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).")

  public OffsetDateTime getAuthorizedDatetime() {
    return authorizedDatetime;
  }


  public void setAuthorizedDatetime(OffsetDateTime authorizedDatetime) {
    this.authorizedDatetime = authorizedDatetime;
  }


  public TransactionAllOf datetime(OffsetDateTime datetime) {
    
    this.datetime = datetime;
    return this;
  }

   /**
   * Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).")

  public OffsetDateTime getDatetime() {
    return datetime;
  }


  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }


  public TransactionAllOf transactionCode(TransactionCode transactionCode) {
    
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionCode getTransactionCode() {
    return transactionCode;
  }


  public void setTransactionCode(TransactionCode transactionCode) {
    this.transactionCode = transactionCode;
  }


  public TransactionAllOf personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAllOf transactionAllOf = (TransactionAllOf) o;
    return Objects.equals(this.paymentChannel, transactionAllOf.paymentChannel) &&
        Objects.equals(this.authorizedDate, transactionAllOf.authorizedDate) &&
        Objects.equals(this.authorizedDatetime, transactionAllOf.authorizedDatetime) &&
        Objects.equals(this.datetime, transactionAllOf.datetime) &&
        Objects.equals(this.transactionCode, transactionAllOf.transactionCode) &&
        Objects.equals(this.personalFinanceCategory, transactionAllOf.personalFinanceCategory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentChannel, authorizedDate, authorizedDatetime, datetime, transactionCode, personalFinanceCategory);
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
    sb.append("class TransactionAllOf {\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    authorizedDate: ").append(toIndentedString(authorizedDate)).append("\n");
    sb.append("    authorizedDatetime: ").append(toIndentedString(authorizedDatetime)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
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
    openapiFields.add("payment_channel");
    openapiFields.add("authorized_date");
    openapiFields.add("authorized_datetime");
    openapiFields.add("datetime");
    openapiFields.add("transaction_code");
    openapiFields.add("personal_finance_category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_channel");
    openapiRequiredFields.add("authorized_date");
    openapiRequiredFields.add("authorized_datetime");
    openapiRequiredFields.add("datetime");
    openapiRequiredFields.add("transaction_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionAllOf is not found in the empty JSON string", TransactionAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("payment_channel") != null && !jsonObj.get("payment_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_channel").toString()));
      }
      // validate the optional field `personal_finance_category`
      if (jsonObj.getAsJsonObject("personal_finance_category") != null) {
        PersonalFinanceCategory.validateJsonObject(jsonObj.getAsJsonObject("personal_finance_category"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionAllOf>() {
           @Override
           public void write(JsonWriter out, TransactionAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionAllOf
  * @throws IOException if the JSON string is invalid with respect to TransactionAllOf
  */
  public static TransactionAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionAllOf.class);
  }

 /**
  * Convert an instance of TransactionAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

