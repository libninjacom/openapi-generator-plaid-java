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
import org.openapitools.client.model.ExternalPaymentScheduleBase;
import org.openapitools.client.model.PaymentScheduleInterval;

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
 * The schedule that the payment will be executed on. If a schedule is provided, the payment is automatically set up as a standing order. If no schedule is specified, the payment will be executed only once.
 */
@ApiModel(description = "The schedule that the payment will be executed on. If a schedule is provided, the payment is automatically set up as a standing order. If no schedule is specified, the payment will be executed only once.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ExternalPaymentScheduleGet {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private PaymentScheduleInterval interval;

  public static final String SERIALIZED_NAME_INTERVAL_EXECUTION_DAY = "interval_execution_day";
  @SerializedName(SERIALIZED_NAME_INTERVAL_EXECUTION_DAY)
  private Integer intervalExecutionDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ADJUSTED_START_DATE = "adjusted_start_date";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_START_DATE)
  private LocalDate adjustedStartDate;

  public ExternalPaymentScheduleGet() { 
  }

  public ExternalPaymentScheduleGet interval(PaymentScheduleInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentScheduleInterval getInterval() {
    return interval;
  }


  public void setInterval(PaymentScheduleInterval interval) {
    this.interval = interval;
  }


  public ExternalPaymentScheduleGet intervalExecutionDay(Integer intervalExecutionDay) {
    
    this.intervalExecutionDay = intervalExecutionDay;
    return this;
  }

   /**
   * The day of the interval on which to schedule the payment.  If the payment interval is weekly, &#x60;interval_execution_day&#x60; should be an integer from 1 (Monday) to 7 (Sunday).  If the payment interval is monthly, &#x60;interval_execution_day&#x60; should be an integer indicating which day of the month to make the payment on. Integers from 1 to 28 can be used to make a payment on that day of the month. Negative integers from -1 to -5 can be used to make a payment relative to the end of the month. To make a payment on the last day of the month, use -1; to make the payment on the second-to-last day, use -2, and so on.
   * @return intervalExecutionDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The day of the interval on which to schedule the payment.  If the payment interval is weekly, `interval_execution_day` should be an integer from 1 (Monday) to 7 (Sunday).  If the payment interval is monthly, `interval_execution_day` should be an integer indicating which day of the month to make the payment on. Integers from 1 to 28 can be used to make a payment on that day of the month. Negative integers from -1 to -5 can be used to make a payment relative to the end of the month. To make a payment on the last day of the month, use -1; to make the payment on the second-to-last day, use -2, and so on.")

  public Integer getIntervalExecutionDay() {
    return intervalExecutionDay;
  }


  public void setIntervalExecutionDay(Integer intervalExecutionDay) {
    this.intervalExecutionDay = intervalExecutionDay;
  }


  public ExternalPaymentScheduleGet startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will begin on the first &#x60;interval_execution_day&#x60; on or after the &#x60;start_date&#x60;.  If the first &#x60;interval_execution_day&#x60; on or after the start date is also the same day that &#x60;/payment_initiation/payment/create&#x60; was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will begin on the first `interval_execution_day` on or after the `start_date`.  If the first `interval_execution_day` on or after the start date is also the same day that `/payment_initiation/payment/create` was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalPaymentScheduleGet endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will end on the last &#x60;interval_execution_day&#x60; on or before the &#x60;end_date&#x60;. If the only &#x60;interval_execution_day&#x60; between the start date and the end date (inclusive) is also the same day that &#x60;/payment_initiation/payment/create&#x60; was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will end on the last `interval_execution_day` on or before the `end_date`. If the only `interval_execution_day` between the start date and the end date (inclusive) is also the same day that `/payment_initiation/payment/create` was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalPaymentScheduleGet adjustedStartDate(LocalDate adjustedStartDate) {
    
    this.adjustedStartDate = adjustedStartDate;
    return this;
  }

   /**
   * The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, this field will be &#x60;null&#x60;.
   * @return adjustedStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, this field will be `null`.")

  public LocalDate getAdjustedStartDate() {
    return adjustedStartDate;
  }


  public void setAdjustedStartDate(LocalDate adjustedStartDate) {
    this.adjustedStartDate = adjustedStartDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentScheduleGet externalPaymentScheduleGet = (ExternalPaymentScheduleGet) o;
    return Objects.equals(this.interval, externalPaymentScheduleGet.interval) &&
        Objects.equals(this.intervalExecutionDay, externalPaymentScheduleGet.intervalExecutionDay) &&
        Objects.equals(this.startDate, externalPaymentScheduleGet.startDate) &&
        Objects.equals(this.endDate, externalPaymentScheduleGet.endDate) &&
        Objects.equals(this.adjustedStartDate, externalPaymentScheduleGet.adjustedStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalExecutionDay, startDate, endDate, adjustedStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentScheduleGet {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    intervalExecutionDay: ").append(toIndentedString(intervalExecutionDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adjustedStartDate: ").append(toIndentedString(adjustedStartDate)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("interval_execution_day");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("adjusted_start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("interval_execution_day");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("adjusted_start_date");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPaymentScheduleGet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExternalPaymentScheduleGet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPaymentScheduleGet is not found in the empty JSON string", ExternalPaymentScheduleGet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalPaymentScheduleGet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalPaymentScheduleGet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExternalPaymentScheduleGet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPaymentScheduleGet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPaymentScheduleGet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPaymentScheduleGet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPaymentScheduleGet.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPaymentScheduleGet>() {
           @Override
           public void write(JsonWriter out, ExternalPaymentScheduleGet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalPaymentScheduleGet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalPaymentScheduleGet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPaymentScheduleGet
  * @throws IOException if the JSON string is invalid with respect to ExternalPaymentScheduleGet
  */
  public static ExternalPaymentScheduleGet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPaymentScheduleGet.class);
  }

 /**
  * Convert an instance of ExternalPaymentScheduleGet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
