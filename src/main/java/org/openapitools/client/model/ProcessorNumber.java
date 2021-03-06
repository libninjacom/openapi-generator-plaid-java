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
import org.openapitools.client.model.NumbersACHNullable;
import org.openapitools.client.model.NumbersBACSNullable;
import org.openapitools.client.model.NumbersEFTNullable;
import org.openapitools.client.model.NumbersInternationalNullable;
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
 * An object containing identifying numbers used for making electronic transfers to and from the &#x60;account&#x60;. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by the &#x60;account&#x60; for which auth data has been requested, a null value will be returned.
 */
@ApiModel(description = "An object containing identifying numbers used for making electronic transfers to and from the `account`. The identifying number type (ACH, EFT, IBAN, or BACS) used will depend on the country of the account. An account may have more than one number type. If a particular identifying number type is not used by the `account` for which auth data has been requested, a null value will be returned.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ProcessorNumber {
  public static final String SERIALIZED_NAME_ACH = "ach";
  @SerializedName(SERIALIZED_NAME_ACH)
  private NumbersACHNullable ach;

  public static final String SERIALIZED_NAME_EFT = "eft";
  @SerializedName(SERIALIZED_NAME_EFT)
  private NumbersEFTNullable eft;

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private NumbersInternationalNullable international;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private NumbersBACSNullable bacs;

  public ProcessorNumber() { 
  }

  public ProcessorNumber ach(NumbersACHNullable ach) {
    
    this.ach = ach;
    return this;
  }

   /**
   * Get ach
   * @return ach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersACHNullable getAch() {
    return ach;
  }


  public void setAch(NumbersACHNullable ach) {
    this.ach = ach;
  }


  public ProcessorNumber eft(NumbersEFTNullable eft) {
    
    this.eft = eft;
    return this;
  }

   /**
   * Get eft
   * @return eft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersEFTNullable getEft() {
    return eft;
  }


  public void setEft(NumbersEFTNullable eft) {
    this.eft = eft;
  }


  public ProcessorNumber international(NumbersInternationalNullable international) {
    
    this.international = international;
    return this;
  }

   /**
   * Get international
   * @return international
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersInternationalNullable getInternational() {
    return international;
  }


  public void setInternational(NumbersInternationalNullable international) {
    this.international = international;
  }


  public ProcessorNumber bacs(NumbersBACSNullable bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumbersBACSNullable getBacs() {
    return bacs;
  }


  public void setBacs(NumbersBACSNullable bacs) {
    this.bacs = bacs;
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
  public ProcessorNumber putAdditionalProperty(String key, Object value) {
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
    ProcessorNumber processorNumber = (ProcessorNumber) o;
    return Objects.equals(this.ach, processorNumber.ach) &&
        Objects.equals(this.eft, processorNumber.eft) &&
        Objects.equals(this.international, processorNumber.international) &&
        Objects.equals(this.bacs, processorNumber.bacs)&&
        Objects.equals(this.additionalProperties, processorNumber.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, eft, international, bacs, additionalProperties);
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
    sb.append("class ProcessorNumber {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    eft: ").append(toIndentedString(eft)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
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
    openapiFields.add("ach");
    openapiFields.add("eft");
    openapiFields.add("international");
    openapiFields.add("bacs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProcessorNumber
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProcessorNumber.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProcessorNumber is not found in the empty JSON string", ProcessorNumber.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ach`
      if (jsonObj.getAsJsonObject("ach") != null) {
        NumbersACHNullable.validateJsonObject(jsonObj.getAsJsonObject("ach"));
      }
      // validate the optional field `eft`
      if (jsonObj.getAsJsonObject("eft") != null) {
        NumbersEFTNullable.validateJsonObject(jsonObj.getAsJsonObject("eft"));
      }
      // validate the optional field `international`
      if (jsonObj.getAsJsonObject("international") != null) {
        NumbersInternationalNullable.validateJsonObject(jsonObj.getAsJsonObject("international"));
      }
      // validate the optional field `bacs`
      if (jsonObj.getAsJsonObject("bacs") != null) {
        NumbersBACSNullable.validateJsonObject(jsonObj.getAsJsonObject("bacs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProcessorNumber.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProcessorNumber' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProcessorNumber> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProcessorNumber.class));

       return (TypeAdapter<T>) new TypeAdapter<ProcessorNumber>() {
           @Override
           public void write(JsonWriter out, ProcessorNumber value) throws IOException {
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
           public ProcessorNumber read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProcessorNumber instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProcessorNumber given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProcessorNumber
  * @throws IOException if the JSON string is invalid with respect to ProcessorNumber
  */
  public static ProcessorNumber fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProcessorNumber.class);
  }

 /**
  * Convert an instance of ProcessorNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

