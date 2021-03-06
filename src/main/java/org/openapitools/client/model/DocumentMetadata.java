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
import org.openapitools.client.model.DocType;

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
 * An object representing metadata from the end user&#39;s uploaded document.
 */
@ApiModel(description = "An object representing metadata from the end user's uploaded document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class DocumentMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOC_ID = "doc_id";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private DocType docType;

  public DocumentMetadata() { 
  }

  public DocumentMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the document.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the document.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the document.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of the document.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentMetadata docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * An identifier of the document that is also present in the paystub response.
   * @return docId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier of the document that is also present in the paystub response.")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public DocumentMetadata docType(DocType docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocType getDocType() {
    return docType;
  }


  public void setDocType(DocType docType) {
    this.docType = docType;
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
  public DocumentMetadata putAdditionalProperty(String key, Object value) {
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
    DocumentMetadata documentMetadata = (DocumentMetadata) o;
    return Objects.equals(this.name, documentMetadata.name) &&
        Objects.equals(this.status, documentMetadata.status) &&
        Objects.equals(this.docId, documentMetadata.docId) &&
        Objects.equals(this.docType, documentMetadata.docType)&&
        Objects.equals(this.additionalProperties, documentMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, docId, docType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("doc_id");
    openapiFields.add("doc_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DocumentMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentMetadata is not found in the empty JSON string", DocumentMetadata.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("doc_id") != null && !jsonObj.get("doc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentMetadata>() {
           @Override
           public void write(JsonWriter out, DocumentMetadata value) throws IOException {
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
           public DocumentMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocumentMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocumentMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentMetadata
  * @throws IOException if the JSON string is invalid with respect to DocumentMetadata
  */
  public static DocumentMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentMetadata.class);
  }

 /**
  * Convert an instance of DocumentMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

