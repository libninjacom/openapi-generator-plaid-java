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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Owner;

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
 * AccountIdentityAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class AccountIdentityAllOf {
  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();

  public AccountIdentityAllOf() { 
  }

  public AccountIdentityAllOf owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountIdentityAllOf addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)
   * @return owners
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the `owners` object is not returned, and instead identity information is returned in the top level `identity` object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityAllOf accountIdentityAllOf = (AccountIdentityAllOf) o;
    return Objects.equals(this.owners, accountIdentityAllOf.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityAllOf {\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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
    openapiFields.add("owners");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("owners");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountIdentityAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountIdentityAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountIdentityAllOf is not found in the empty JSON string", AccountIdentityAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountIdentityAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountIdentityAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountIdentityAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("owners") != null && !jsonObj.get("owners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owners` to be an array in the JSON string but got `%s`", jsonObj.get("owners").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountIdentityAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountIdentityAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountIdentityAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountIdentityAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountIdentityAllOf>() {
           @Override
           public void write(JsonWriter out, AccountIdentityAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountIdentityAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountIdentityAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountIdentityAllOf
  * @throws IOException if the JSON string is invalid with respect to AccountIdentityAllOf
  */
  public static AccountIdentityAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountIdentityAllOf.class);
  }

 /**
  * Convert an instance of AccountIdentityAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
