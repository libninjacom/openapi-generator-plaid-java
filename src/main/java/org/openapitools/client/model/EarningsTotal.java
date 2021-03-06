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
import java.math.BigDecimal;
import org.openapitools.client.model.Pay;
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
 * An object representing both the current pay period and year to date amount for an earning category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for an earning category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class EarningsTotal {
  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private BigDecimal currentAmount;

  public static final String SERIALIZED_NAME_CURRENT_PAY = "current_pay";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAY)
  private Pay currentPay;

  public static final String SERIALIZED_NAME_YTD_PAY = "ytd_pay";
  @SerializedName(SERIALIZED_NAME_YTD_PAY)
  private Pay ytdPay;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private BigDecimal hours;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private BigDecimal ytdAmount;

  public EarningsTotal() { 
  }

  public EarningsTotal currentAmount(BigDecimal currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * Total amount of the earnings for this pay period
   * @return currentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of the earnings for this pay period")

  public BigDecimal getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(BigDecimal currentAmount) {
    this.currentAmount = currentAmount;
  }


  public EarningsTotal currentPay(Pay currentPay) {
    
    this.currentPay = currentPay;
    return this;
  }

   /**
   * Get currentPay
   * @return currentPay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getCurrentPay() {
    return currentPay;
  }


  public void setCurrentPay(Pay currentPay) {
    this.currentPay = currentPay;
  }


  public EarningsTotal ytdPay(Pay ytdPay) {
    
    this.ytdPay = ytdPay;
    return this;
  }

   /**
   * Get ytdPay
   * @return ytdPay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getYtdPay() {
    return ytdPay;
  }


  public void setYtdPay(Pay ytdPay) {
    this.ytdPay = ytdPay;
  }


  public EarningsTotal hours(BigDecimal hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Total number of hours worked for this pay period
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of hours worked for this pay period")

  public BigDecimal getHours() {
    return hours;
  }


  public void setHours(BigDecimal hours) {
    this.hours = hours;
  }


  public EarningsTotal isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the line item. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the line item. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public EarningsTotal unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the security. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the security. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public EarningsTotal ytdAmount(BigDecimal ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The total year-to-date amount of the earnings
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total year-to-date amount of the earnings")

  public BigDecimal getYtdAmount() {
    return ytdAmount;
  }


  public void setYtdAmount(BigDecimal ytdAmount) {
    this.ytdAmount = ytdAmount;
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
  public EarningsTotal putAdditionalProperty(String key, Object value) {
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
    EarningsTotal earningsTotal = (EarningsTotal) o;
    return Objects.equals(this.currentAmount, earningsTotal.currentAmount) &&
        Objects.equals(this.currentPay, earningsTotal.currentPay) &&
        Objects.equals(this.ytdPay, earningsTotal.ytdPay) &&
        Objects.equals(this.hours, earningsTotal.hours) &&
        Objects.equals(this.isoCurrencyCode, earningsTotal.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, earningsTotal.unofficialCurrencyCode) &&
        Objects.equals(this.ytdAmount, earningsTotal.ytdAmount)&&
        Objects.equals(this.additionalProperties, earningsTotal.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAmount, currentPay, ytdPay, hours, isoCurrencyCode, unofficialCurrencyCode, ytdAmount, additionalProperties);
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
    sb.append("class EarningsTotal {\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    currentPay: ").append(toIndentedString(currentPay)).append("\n");
    sb.append("    ytdPay: ").append(toIndentedString(ytdPay)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    ytdAmount: ").append(toIndentedString(ytdAmount)).append("\n");
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
    openapiFields.add("current_amount");
    openapiFields.add("current_pay");
    openapiFields.add("ytd_pay");
    openapiFields.add("hours");
    openapiFields.add("iso_currency_code");
    openapiFields.add("unofficial_currency_code");
    openapiFields.add("ytd_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EarningsTotal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EarningsTotal.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EarningsTotal is not found in the empty JSON string", EarningsTotal.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("iso_currency_code") != null && !jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
      }
      if (jsonObj.get("unofficial_currency_code") != null && !jsonObj.get("unofficial_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unofficial_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unofficial_currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningsTotal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningsTotal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningsTotal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningsTotal.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningsTotal>() {
           @Override
           public void write(JsonWriter out, EarningsTotal value) throws IOException {
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
           public EarningsTotal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EarningsTotal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EarningsTotal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningsTotal
  * @throws IOException if the JSON string is invalid with respect to EarningsTotal
  */
  public static EarningsTotal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningsTotal.class);
  }

 /**
  * Convert an instance of EarningsTotal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

