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
import java.time.OffsetDateTime;
import org.openapitools.client.model.TransferAuthorizationDecisionRationale;
import org.openapitools.client.model.TransferAuthorizationGuaranteeDecision;
import org.openapitools.client.model.TransferAuthorizationGuaranteeDecisionRationale;
import org.openapitools.client.model.TransferAuthorizationProposedTransfer;

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
 * Contains the authorization decision for a proposed transfer
 */
@ApiModel(description = "Contains the authorization decision for a proposed transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class TransferAuthorization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  /**
   *  A decision regarding the proposed transfer.  &#x60;approved&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;permitted&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;declined&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.
   */
  @JsonAdapter(DecisionEnum.Adapter.class)
  public enum DecisionEnum {
    APPROVED("approved"),
    
    PERMITTED("permitted"),
    
    DECLINED("declined");

    private String value;

    DecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private DecisionEnum decision;

  public static final String SERIALIZED_NAME_DECISION_RATIONALE = "decision_rationale";
  @SerializedName(SERIALIZED_NAME_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale decisionRationale;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION = "guarantee_decision";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION)
  private TransferAuthorizationGuaranteeDecision guaranteeDecision;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE = "guarantee_decision_rationale";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE)
  private TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale;

  public static final String SERIALIZED_NAME_PROPOSED_TRANSFER = "proposed_transfer";
  @SerializedName(SERIALIZED_NAME_PROPOSED_TRANSFER)
  private TransferAuthorizationProposedTransfer proposedTransfer;

  public TransferAuthorization() { 
  }

  public TransferAuthorization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer authorization.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer authorization.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferAuthorization created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime representing when the authorization was created, in the format &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The datetime representing when the authorization was created, in the format `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferAuthorization decision(DecisionEnum decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   *  A decision regarding the proposed transfer.  &#x60;approved&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;permitted&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;declined&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.
   * @return decision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " A decision regarding the proposed transfer.  `approved` – The proposed transfer has received the end user's consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   `permitted` – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  `declined` – Plaid reviewed the proposed transfer and declined processing. Refer to the `code` field in the `decision_rationale` object for details.")

  public DecisionEnum getDecision() {
    return decision;
  }


  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }


  public TransferAuthorization decisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    
    this.decisionRationale = decisionRationale;
    return this;
  }

   /**
   * Get decisionRationale
   * @return decisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationale getDecisionRationale() {
    return decisionRationale;
  }


  public void setDecisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    this.decisionRationale = decisionRationale;
  }


  public TransferAuthorization guaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    
    this.guaranteeDecision = guaranteeDecision;
    return this;
  }

   /**
   * Get guaranteeDecision
   * @return guaranteeDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecision getGuaranteeDecision() {
    return guaranteeDecision;
  }


  public void setGuaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    this.guaranteeDecision = guaranteeDecision;
  }


  public TransferAuthorization guaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
    return this;
  }

   /**
   * Get guaranteeDecisionRationale
   * @return guaranteeDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecisionRationale getGuaranteeDecisionRationale() {
    return guaranteeDecisionRationale;
  }


  public void setGuaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
  }


  public TransferAuthorization proposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    
    this.proposedTransfer = proposedTransfer;
    return this;
  }

   /**
   * Get proposedTransfer
   * @return proposedTransfer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationProposedTransfer getProposedTransfer() {
    return proposedTransfer;
  }


  public void setProposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    this.proposedTransfer = proposedTransfer;
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
  public TransferAuthorization putAdditionalProperty(String key, Object value) {
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
    TransferAuthorization transferAuthorization = (TransferAuthorization) o;
    return Objects.equals(this.id, transferAuthorization.id) &&
        Objects.equals(this.created, transferAuthorization.created) &&
        Objects.equals(this.decision, transferAuthorization.decision) &&
        Objects.equals(this.decisionRationale, transferAuthorization.decisionRationale) &&
        Objects.equals(this.guaranteeDecision, transferAuthorization.guaranteeDecision) &&
        Objects.equals(this.guaranteeDecisionRationale, transferAuthorization.guaranteeDecisionRationale) &&
        Objects.equals(this.proposedTransfer, transferAuthorization.proposedTransfer)&&
        Objects.equals(this.additionalProperties, transferAuthorization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, decision, decisionRationale, guaranteeDecision, guaranteeDecisionRationale, proposedTransfer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    decisionRationale: ").append(toIndentedString(decisionRationale)).append("\n");
    sb.append("    guaranteeDecision: ").append(toIndentedString(guaranteeDecision)).append("\n");
    sb.append("    guaranteeDecisionRationale: ").append(toIndentedString(guaranteeDecisionRationale)).append("\n");
    sb.append("    proposedTransfer: ").append(toIndentedString(proposedTransfer)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created");
    openapiFields.add("decision");
    openapiFields.add("decision_rationale");
    openapiFields.add("guarantee_decision");
    openapiFields.add("guarantee_decision_rationale");
    openapiFields.add("proposed_transfer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created");
    openapiRequiredFields.add("decision");
    openapiRequiredFields.add("decision_rationale");
    openapiRequiredFields.add("guarantee_decision");
    openapiRequiredFields.add("guarantee_decision_rationale");
    openapiRequiredFields.add("proposed_transfer");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferAuthorization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferAuthorization.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferAuthorization is not found in the empty JSON string", TransferAuthorization.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferAuthorization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("decision") != null && !jsonObj.get("decision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferAuthorization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferAuthorization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferAuthorization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferAuthorization.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferAuthorization>() {
           @Override
           public void write(JsonWriter out, TransferAuthorization value) throws IOException {
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
           public TransferAuthorization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TransferAuthorization instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransferAuthorization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferAuthorization
  * @throws IOException if the JSON string is invalid with respect to TransferAuthorization
  */
  public static TransferAuthorization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferAuthorization.class);
  }

 /**
  * Convert an instance of TransferAuthorization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

