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
import org.openapitools.client.model.EmployeeIncomeSummaryFieldString;
import org.openapitools.client.model.EmployerIncomeSummaryFieldString;
import org.openapitools.client.model.PayFrequency;
import org.openapitools.client.model.ProjectedIncomeSummaryFieldNumber;
import org.openapitools.client.model.TransactionData;
import org.openapitools.client.model.YTDGrossIncomeSummaryFieldNumber;
import org.openapitools.client.model.YTDNetIncomeSummaryFieldNumber;

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
 * The verified fields from a paystub verification. All fields are provided as reported on the paystub.
 */
@ApiModel(description = "The verified fields from a paystub verification. All fields are provided as reported on the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class IncomeSummary {
  public static final String SERIALIZED_NAME_EMPLOYER_NAME = "employer_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_NAME)
  private EmployerIncomeSummaryFieldString employerName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME = "employee_name";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME)
  private EmployeeIncomeSummaryFieldString employeeName;

  public static final String SERIALIZED_NAME_YTD_GROSS_INCOME = "ytd_gross_income";
  @SerializedName(SERIALIZED_NAME_YTD_GROSS_INCOME)
  private YTDGrossIncomeSummaryFieldNumber ytdGrossIncome;

  public static final String SERIALIZED_NAME_YTD_NET_INCOME = "ytd_net_income";
  @SerializedName(SERIALIZED_NAME_YTD_NET_INCOME)
  private YTDNetIncomeSummaryFieldNumber ytdNetIncome;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayFrequency payFrequency;

  public static final String SERIALIZED_NAME_PROJECTED_WAGE = "projected_wage";
  @SerializedName(SERIALIZED_NAME_PROJECTED_WAGE)
  private ProjectedIncomeSummaryFieldNumber projectedWage;

  public static final String SERIALIZED_NAME_VERIFIED_TRANSACTION = "verified_transaction";
  @SerializedName(SERIALIZED_NAME_VERIFIED_TRANSACTION)
  private TransactionData verifiedTransaction;

  public IncomeSummary() { 
  }

  public IncomeSummary employerName(EmployerIncomeSummaryFieldString employerName) {
    
    this.employerName = employerName;
    return this;
  }

   /**
   * Get employerName
   * @return employerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EmployerIncomeSummaryFieldString getEmployerName() {
    return employerName;
  }


  public void setEmployerName(EmployerIncomeSummaryFieldString employerName) {
    this.employerName = employerName;
  }


  public IncomeSummary employeeName(EmployeeIncomeSummaryFieldString employeeName) {
    
    this.employeeName = employeeName;
    return this;
  }

   /**
   * Get employeeName
   * @return employeeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EmployeeIncomeSummaryFieldString getEmployeeName() {
    return employeeName;
  }


  public void setEmployeeName(EmployeeIncomeSummaryFieldString employeeName) {
    this.employeeName = employeeName;
  }


  public IncomeSummary ytdGrossIncome(YTDGrossIncomeSummaryFieldNumber ytdGrossIncome) {
    
    this.ytdGrossIncome = ytdGrossIncome;
    return this;
  }

   /**
   * Get ytdGrossIncome
   * @return ytdGrossIncome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public YTDGrossIncomeSummaryFieldNumber getYtdGrossIncome() {
    return ytdGrossIncome;
  }


  public void setYtdGrossIncome(YTDGrossIncomeSummaryFieldNumber ytdGrossIncome) {
    this.ytdGrossIncome = ytdGrossIncome;
  }


  public IncomeSummary ytdNetIncome(YTDNetIncomeSummaryFieldNumber ytdNetIncome) {
    
    this.ytdNetIncome = ytdNetIncome;
    return this;
  }

   /**
   * Get ytdNetIncome
   * @return ytdNetIncome
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public YTDNetIncomeSummaryFieldNumber getYtdNetIncome() {
    return ytdNetIncome;
  }


  public void setYtdNetIncome(YTDNetIncomeSummaryFieldNumber ytdNetIncome) {
    this.ytdNetIncome = ytdNetIncome;
  }


  public IncomeSummary payFrequency(PayFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PayFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  public IncomeSummary projectedWage(ProjectedIncomeSummaryFieldNumber projectedWage) {
    
    this.projectedWage = projectedWage;
    return this;
  }

   /**
   * Get projectedWage
   * @return projectedWage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectedIncomeSummaryFieldNumber getProjectedWage() {
    return projectedWage;
  }


  public void setProjectedWage(ProjectedIncomeSummaryFieldNumber projectedWage) {
    this.projectedWage = projectedWage;
  }


  public IncomeSummary verifiedTransaction(TransactionData verifiedTransaction) {
    
    this.verifiedTransaction = verifiedTransaction;
    return this;
  }

   /**
   * Get verifiedTransaction
   * @return verifiedTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransactionData getVerifiedTransaction() {
    return verifiedTransaction;
  }


  public void setVerifiedTransaction(TransactionData verifiedTransaction) {
    this.verifiedTransaction = verifiedTransaction;
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
  public IncomeSummary putAdditionalProperty(String key, Object value) {
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
    IncomeSummary incomeSummary = (IncomeSummary) o;
    return Objects.equals(this.employerName, incomeSummary.employerName) &&
        Objects.equals(this.employeeName, incomeSummary.employeeName) &&
        Objects.equals(this.ytdGrossIncome, incomeSummary.ytdGrossIncome) &&
        Objects.equals(this.ytdNetIncome, incomeSummary.ytdNetIncome) &&
        Objects.equals(this.payFrequency, incomeSummary.payFrequency) &&
        Objects.equals(this.projectedWage, incomeSummary.projectedWage) &&
        Objects.equals(this.verifiedTransaction, incomeSummary.verifiedTransaction)&&
        Objects.equals(this.additionalProperties, incomeSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerName, employeeName, ytdGrossIncome, ytdNetIncome, payFrequency, projectedWage, verifiedTransaction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeSummary {\n");
    sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
    sb.append("    employeeName: ").append(toIndentedString(employeeName)).append("\n");
    sb.append("    ytdGrossIncome: ").append(toIndentedString(ytdGrossIncome)).append("\n");
    sb.append("    ytdNetIncome: ").append(toIndentedString(ytdNetIncome)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    projectedWage: ").append(toIndentedString(projectedWage)).append("\n");
    sb.append("    verifiedTransaction: ").append(toIndentedString(verifiedTransaction)).append("\n");
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
    openapiFields.add("employer_name");
    openapiFields.add("employee_name");
    openapiFields.add("ytd_gross_income");
    openapiFields.add("ytd_net_income");
    openapiFields.add("pay_frequency");
    openapiFields.add("projected_wage");
    openapiFields.add("verified_transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employer_name");
    openapiRequiredFields.add("employee_name");
    openapiRequiredFields.add("ytd_gross_income");
    openapiRequiredFields.add("ytd_net_income");
    openapiRequiredFields.add("pay_frequency");
    openapiRequiredFields.add("projected_wage");
    openapiRequiredFields.add("verified_transaction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IncomeSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IncomeSummary.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncomeSummary is not found in the empty JSON string", IncomeSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IncomeSummary.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `employer_name`
      if (jsonObj.getAsJsonObject("employer_name") != null) {
        EmployerIncomeSummaryFieldString.validateJsonObject(jsonObj.getAsJsonObject("employer_name"));
      }
      // validate the optional field `employee_name`
      if (jsonObj.getAsJsonObject("employee_name") != null) {
        EmployeeIncomeSummaryFieldString.validateJsonObject(jsonObj.getAsJsonObject("employee_name"));
      }
      // validate the optional field `ytd_gross_income`
      if (jsonObj.getAsJsonObject("ytd_gross_income") != null) {
        YTDGrossIncomeSummaryFieldNumber.validateJsonObject(jsonObj.getAsJsonObject("ytd_gross_income"));
      }
      // validate the optional field `ytd_net_income`
      if (jsonObj.getAsJsonObject("ytd_net_income") != null) {
        YTDNetIncomeSummaryFieldNumber.validateJsonObject(jsonObj.getAsJsonObject("ytd_net_income"));
      }
      // validate the optional field `projected_wage`
      if (jsonObj.getAsJsonObject("projected_wage") != null) {
        ProjectedIncomeSummaryFieldNumber.validateJsonObject(jsonObj.getAsJsonObject("projected_wage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncomeSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncomeSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncomeSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncomeSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<IncomeSummary>() {
           @Override
           public void write(JsonWriter out, IncomeSummary value) throws IOException {
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
           public IncomeSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IncomeSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IncomeSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncomeSummary
  * @throws IOException if the JSON string is invalid with respect to IncomeSummary
  */
  public static IncomeSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncomeSummary.class);
  }

 /**
  * Convert an instance of IncomeSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

