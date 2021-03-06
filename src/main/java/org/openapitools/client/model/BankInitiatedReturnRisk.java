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
 * The object contains a risk score and a risk tier that evaluate the transaction return risk because an account is overdrawn or because an ineligible account is used. Common return codes in this category include: \&quot;R01\&quot;, \&quot;R02\&quot;, \&quot;R03\&quot;, \&quot;R04\&quot;, \&quot;R06\&quot;, \&quot;R08\&quot;,  \&quot;R09\&quot;, \&quot;R13\&quot;, \&quot;R16\&quot;, \&quot;R17\&quot;, \&quot;R20\&quot;, \&quot;R23\&quot;. These returns have a turnaround time of 2 banking days.
 */
@ApiModel(description = "The object contains a risk score and a risk tier that evaluate the transaction return risk because an account is overdrawn or because an ineligible account is used. Common return codes in this category include: \"R01\", \"R02\", \"R03\", \"R04\", \"R06\", \"R08\",  \"R09\", \"R13\", \"R16\", \"R17\", \"R20\", \"R23\". These returns have a turnaround time of 2 banking days.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class BankInitiatedReturnRisk {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_RISK_TIER = "risk_tier";
  @SerializedName(SERIALIZED_NAME_RISK_TIER)
  private Integer riskTier;

  public BankInitiatedReturnRisk() { 
  }

  public BankInitiatedReturnRisk score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 0-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A score from 0-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public BankInitiatedReturnRisk riskTier(Integer riskTier) {
    
    this.riskTier = riskTier;
    return this;
  }

   /**
   * In the &#x60;bank_initiated_return_risk&#x60; object, there are eight risk tiers corresponding to the scores:   1: Predicted bank-initiated return incidence rate between 0.0% - 0.5%   2: Predicted bank-initiated return incidence rate between 0.5% - 1.5%   3: Predicted bank-initiated return incidence rate between 1.5% - 3%   4: Predicted bank-initiated return incidence rate between 3% - 5%   5: Predicted bank-initiated return incidence rate between 5% - 10%   6: Predicted bank-initiated return incidence rate between 10% - 15%   7: Predicted bank-initiated return incidence rate between 15% and 50%   8: Predicted bank-initiated return incidence rate greater than 50% 
   * minimum: 1
   * maximum: 8
   * @return riskTier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "In the `bank_initiated_return_risk` object, there are eight risk tiers corresponding to the scores:   1: Predicted bank-initiated return incidence rate between 0.0% - 0.5%   2: Predicted bank-initiated return incidence rate between 0.5% - 1.5%   3: Predicted bank-initiated return incidence rate between 1.5% - 3%   4: Predicted bank-initiated return incidence rate between 3% - 5%   5: Predicted bank-initiated return incidence rate between 5% - 10%   6: Predicted bank-initiated return incidence rate between 10% - 15%   7: Predicted bank-initiated return incidence rate between 15% and 50%   8: Predicted bank-initiated return incidence rate greater than 50% ")

  public Integer getRiskTier() {
    return riskTier;
  }


  public void setRiskTier(Integer riskTier) {
    this.riskTier = riskTier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankInitiatedReturnRisk bankInitiatedReturnRisk = (BankInitiatedReturnRisk) o;
    return Objects.equals(this.score, bankInitiatedReturnRisk.score) &&
        Objects.equals(this.riskTier, bankInitiatedReturnRisk.riskTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, riskTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankInitiatedReturnRisk {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    riskTier: ").append(toIndentedString(riskTier)).append("\n");
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
    openapiFields.add("score");
    openapiFields.add("risk_tier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("score");
    openapiRequiredFields.add("risk_tier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankInitiatedReturnRisk
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BankInitiatedReturnRisk.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankInitiatedReturnRisk is not found in the empty JSON string", BankInitiatedReturnRisk.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BankInitiatedReturnRisk.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankInitiatedReturnRisk` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankInitiatedReturnRisk.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankInitiatedReturnRisk.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankInitiatedReturnRisk' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankInitiatedReturnRisk> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankInitiatedReturnRisk.class));

       return (TypeAdapter<T>) new TypeAdapter<BankInitiatedReturnRisk>() {
           @Override
           public void write(JsonWriter out, BankInitiatedReturnRisk value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankInitiatedReturnRisk read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankInitiatedReturnRisk given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankInitiatedReturnRisk
  * @throws IOException if the JSON string is invalid with respect to BankInitiatedReturnRisk
  */
  public static BankInitiatedReturnRisk fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankInitiatedReturnRisk.class);
  }

 /**
  * Convert an instance of BankInitiatedReturnRisk to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

