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
import org.openapitools.client.model.EmployerVerification;
import org.openapitools.client.model.EmploymentVerificationStatus;
import org.openapitools.client.model.PlatformIds;
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
 * An object containing proof of employment data for an individual
 */
@ApiModel(description = "An object containing proof of employment data for an individual")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class EmploymentVerification {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EmploymentVerificationStatus status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private EmployerVerification employer;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PLATFORM_IDS = "platform_ids";
  @SerializedName(SERIALIZED_NAME_PLATFORM_IDS)
  private PlatformIds platformIds;

  public EmploymentVerification() { 
  }

  public EmploymentVerification status(EmploymentVerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentVerificationStatus getStatus() {
    return status;
  }


  public void setStatus(EmploymentVerificationStatus status) {
    this.status = status;
  }


  public EmploymentVerification startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of employment in ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of employment in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public EmploymentVerification endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public EmploymentVerification employer(EmployerVerification employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployerVerification getEmployer() {
    return employer;
  }


  public void setEmployer(EmployerVerification employer) {
    this.employer = employer;
  }


  public EmploymentVerification title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Current title of employee.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current title of employee.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public EmploymentVerification platformIds(PlatformIds platformIds) {
    
    this.platformIds = platformIds;
    return this;
  }

   /**
   * Get platformIds
   * @return platformIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlatformIds getPlatformIds() {
    return platformIds;
  }


  public void setPlatformIds(PlatformIds platformIds) {
    this.platformIds = platformIds;
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
  public EmploymentVerification putAdditionalProperty(String key, Object value) {
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
    EmploymentVerification employmentVerification = (EmploymentVerification) o;
    return Objects.equals(this.status, employmentVerification.status) &&
        Objects.equals(this.startDate, employmentVerification.startDate) &&
        Objects.equals(this.endDate, employmentVerification.endDate) &&
        Objects.equals(this.employer, employmentVerification.employer) &&
        Objects.equals(this.title, employmentVerification.title) &&
        Objects.equals(this.platformIds, employmentVerification.platformIds)&&
        Objects.equals(this.additionalProperties, employmentVerification.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startDate, endDate, employer, title, platformIds, additionalProperties);
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
    sb.append("class EmploymentVerification {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    platformIds: ").append(toIndentedString(platformIds)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("employer");
    openapiFields.add("title");
    openapiFields.add("platform_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmploymentVerification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmploymentVerification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmploymentVerification is not found in the empty JSON string", EmploymentVerification.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmploymentVerification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmploymentVerification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmploymentVerification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmploymentVerification.class));

       return (TypeAdapter<T>) new TypeAdapter<EmploymentVerification>() {
           @Override
           public void write(JsonWriter out, EmploymentVerification value) throws IOException {
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
           public EmploymentVerification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmploymentVerification instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmploymentVerification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmploymentVerification
  * @throws IOException if the JSON string is invalid with respect to EmploymentVerification
  */
  public static EmploymentVerification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmploymentVerification.class);
  }

 /**
  * Convert an instance of EmploymentVerification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

