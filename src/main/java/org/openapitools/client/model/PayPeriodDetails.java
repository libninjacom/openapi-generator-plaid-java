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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DistributionBreakdown;
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
 * Details about the pay period.
 */
@ApiModel(description = "Details about the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class PayPeriodDetails {
  public static final String SERIALIZED_NAME_CHECK_AMOUNT = "check_amount";
  @SerializedName(SERIALIZED_NAME_CHECK_AMOUNT)
  private BigDecimal checkAmount;

  public static final String SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN = "distribution_breakdown";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN)
  private List<DistributionBreakdown> distributionBreakdown = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private BigDecimal grossEarnings;

  public static final String SERIALIZED_NAME_PAY_DATE = "pay_date";
  @SerializedName(SERIALIZED_NAME_PAY_DATE)
  private LocalDate payDate;

  /**
   * The frequency at which an individual is paid.
   */
  @JsonAdapter(PayFrequencyEnum.Adapter.class)
  public enum PayFrequencyEnum {
    PAY_FREQUENCY_UNKNOWN("PAY_FREQUENCY_UNKNOWN"),
    
    PAY_FREQUENCY_WEEKLY("PAY_FREQUENCY_WEEKLY"),
    
    PAY_FREQUENCY_BIWEEKLY("PAY_FREQUENCY_BIWEEKLY"),
    
    PAY_FREQUENCY_SEMIMONTHLY("PAY_FREQUENCY_SEMIMONTHLY"),
    
    PAY_FREQUENCY_MONTHLY("PAY_FREQUENCY_MONTHLY"),
    
    NULL("null");

    private String value;

    PayFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayFrequencyEnum fromValue(String value) {
      for (PayFrequencyEnum b : PayFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PayFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayFrequencyEnum payFrequency;

  public static final String SERIALIZED_NAME_PAY_DAY = "pay_day";
  @SerializedName(SERIALIZED_NAME_PAY_DAY)
  private LocalDate payDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public PayPeriodDetails() { 
  }

  public PayPeriodDetails checkAmount(BigDecimal checkAmount) {
    
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * The amount of the paycheck.
   * @return checkAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the paycheck.")

  public BigDecimal getCheckAmount() {
    return checkAmount;
  }


  public void setCheckAmount(BigDecimal checkAmount) {
    this.checkAmount = checkAmount;
  }


  public PayPeriodDetails distributionBreakdown(List<DistributionBreakdown> distributionBreakdown) {
    
    this.distributionBreakdown = distributionBreakdown;
    return this;
  }

  public PayPeriodDetails addDistributionBreakdownItem(DistributionBreakdown distributionBreakdownItem) {
    if (this.distributionBreakdown == null) {
      this.distributionBreakdown = new ArrayList<>();
    }
    this.distributionBreakdown.add(distributionBreakdownItem);
    return this;
  }

   /**
   * Get distributionBreakdown
   * @return distributionBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DistributionBreakdown> getDistributionBreakdown() {
    return distributionBreakdown;
  }


  public void setDistributionBreakdown(List<DistributionBreakdown> distributionBreakdown) {
    this.distributionBreakdown = distributionBreakdown;
  }


  public PayPeriodDetails endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PayPeriodDetails grossEarnings(BigDecimal grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Total earnings before tax/deductions.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total earnings before tax/deductions.")

  public BigDecimal getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(BigDecimal grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PayPeriodDetails payDate(LocalDate payDate) {
    
    this.payDate = payDate;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDate() {
    return payDate;
  }


  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }


  public PayPeriodDetails payFrequency(PayFrequencyEnum payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * The frequency at which an individual is paid.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The frequency at which an individual is paid.")

  public PayFrequencyEnum getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayFrequencyEnum payFrequency) {
    this.payFrequency = payFrequency;
  }


  public PayPeriodDetails payDay(LocalDate payDay) {
    
    this.payDay = payDay;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDay() {
    return payDay;
  }


  public void setPayDay(LocalDate payDay) {
    this.payDay = payDay;
  }


  public PayPeriodDetails startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
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
  public PayPeriodDetails putAdditionalProperty(String key, Object value) {
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
    PayPeriodDetails payPeriodDetails = (PayPeriodDetails) o;
    return Objects.equals(this.checkAmount, payPeriodDetails.checkAmount) &&
        Objects.equals(this.distributionBreakdown, payPeriodDetails.distributionBreakdown) &&
        Objects.equals(this.endDate, payPeriodDetails.endDate) &&
        Objects.equals(this.grossEarnings, payPeriodDetails.grossEarnings) &&
        Objects.equals(this.payDate, payPeriodDetails.payDate) &&
        Objects.equals(this.payFrequency, payPeriodDetails.payFrequency) &&
        Objects.equals(this.payDay, payPeriodDetails.payDay) &&
        Objects.equals(this.startDate, payPeriodDetails.startDate)&&
        Objects.equals(this.additionalProperties, payPeriodDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkAmount, distributionBreakdown, endDate, grossEarnings, payDate, payFrequency, payDay, startDate, additionalProperties);
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
    sb.append("class PayPeriodDetails {\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
    sb.append("    distributionBreakdown: ").append(toIndentedString(distributionBreakdown)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payDay: ").append(toIndentedString(payDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("check_amount");
    openapiFields.add("distribution_breakdown");
    openapiFields.add("end_date");
    openapiFields.add("gross_earnings");
    openapiFields.add("pay_date");
    openapiFields.add("pay_frequency");
    openapiFields.add("pay_day");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayPeriodDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayPeriodDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayPeriodDetails is not found in the empty JSON string", PayPeriodDetails.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("distribution_breakdown") != null && !jsonObj.get("distribution_breakdown").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_breakdown` to be an array in the JSON string but got `%s`", jsonObj.get("distribution_breakdown").toString()));
      }
      if (jsonObj.get("pay_frequency") != null && !jsonObj.get("pay_frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_frequency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayPeriodDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayPeriodDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayPeriodDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayPeriodDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PayPeriodDetails>() {
           @Override
           public void write(JsonWriter out, PayPeriodDetails value) throws IOException {
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
           public PayPeriodDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayPeriodDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayPeriodDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayPeriodDetails
  * @throws IOException if the JSON string is invalid with respect to PayPeriodDetails
  */
  public static PayPeriodDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayPeriodDetails.class);
  }

 /**
  * Convert an instance of PayPeriodDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

