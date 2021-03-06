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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AccountAssets;

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
 * A representation of an Item within an Asset Report.
 */
@ApiModel(description = "A representation of an Item within an Asset Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class AssetReportItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_DATE_LAST_UPDATED = "date_last_updated";
  @SerializedName(SERIALIZED_NAME_DATE_LAST_UPDATED)
  private OffsetDateTime dateLastUpdated;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountAssets> accounts = new ArrayList<>();

  public AssetReportItem() { 
  }

  public AssetReportItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AssetReportItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The full financial institution name associated with the Item.
   * @return institutionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The full financial institution name associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public AssetReportItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The id of the financial institution associated with the Item.
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the financial institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public AssetReportItem dateLastUpdated(OffsetDateTime dateLastUpdated) {
    
    this.dateLastUpdated = dateLastUpdated;
    return this;
  }

   /**
   * The date and time when this Item???s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return dateLastUpdated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date and time when this Item???s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getDateLastUpdated() {
    return dateLastUpdated;
  }


  public void setDateLastUpdated(OffsetDateTime dateLastUpdated) {
    this.dateLastUpdated = dateLastUpdated;
  }


  public AssetReportItem accounts(List<AccountAssets> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public AssetReportItem addAccountsItem(AccountAssets accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Data about each of the accounts open on the Item.
   * @return accounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data about each of the accounts open on the Item.")

  public List<AccountAssets> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountAssets> accounts) {
    this.accounts = accounts;
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
  public AssetReportItem putAdditionalProperty(String key, Object value) {
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
    AssetReportItem assetReportItem = (AssetReportItem) o;
    return Objects.equals(this.itemId, assetReportItem.itemId) &&
        Objects.equals(this.institutionName, assetReportItem.institutionName) &&
        Objects.equals(this.institutionId, assetReportItem.institutionId) &&
        Objects.equals(this.dateLastUpdated, assetReportItem.dateLastUpdated) &&
        Objects.equals(this.accounts, assetReportItem.accounts)&&
        Objects.equals(this.additionalProperties, assetReportItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, institutionName, institutionId, dateLastUpdated, accounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    dateLastUpdated: ").append(toIndentedString(dateLastUpdated)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
    openapiFields.add("item_id");
    openapiFields.add("institution_name");
    openapiFields.add("institution_id");
    openapiFields.add("date_last_updated");
    openapiFields.add("accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("institution_name");
    openapiRequiredFields.add("institution_id");
    openapiRequiredFields.add("date_last_updated");
    openapiRequiredFields.add("accounts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetReportItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetReportItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetReportItem is not found in the empty JSON string", AssetReportItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssetReportItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if (jsonObj.get("institution_name") != null && !jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
      if (jsonObj.get("institution_id") != null && !jsonObj.get("institution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_id").toString()));
      }
      JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
      if (jsonArrayaccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
        }

        // validate the optional field `accounts` (array)
        for (int i = 0; i < jsonArrayaccounts.size(); i++) {
          AccountAssets.validateJsonObject(jsonArrayaccounts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetReportItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetReportItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetReportItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetReportItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetReportItem>() {
           @Override
           public void write(JsonWriter out, AssetReportItem value) throws IOException {
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
           public AssetReportItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssetReportItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssetReportItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetReportItem
  * @throws IOException if the JSON string is invalid with respect to AssetReportItem
  */
  public static AssetReportItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetReportItem.class);
  }

 /**
  * Convert an instance of AssetReportItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

