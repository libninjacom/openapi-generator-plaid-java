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
 * User authentication parameters, for clients making a request without an &#x60;access_token&#x60;. This is only allowed for select clients and will not be supported in the future. Most clients should call /item/import to obtain an access token before making a request.
 */
@ApiModel(description = "User authentication parameters, for clients making a request without an `access_token`. This is only allowed for select clients and will not be supported in the future. Most clients should call /item/import to obtain an access token before making a request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ItemApplicationListUserAuth {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FI_USERNAME_HASH = "fi_username_hash";
  @SerializedName(SERIALIZED_NAME_FI_USERNAME_HASH)
  private String fiUsernameHash;

  public ItemApplicationListUserAuth() { 
  }

  public ItemApplicationListUserAuth userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Account username.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account username.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ItemApplicationListUserAuth fiUsernameHash(String fiUsernameHash) {
    
    this.fiUsernameHash = fiUsernameHash;
    return this;
  }

   /**
   * Account username hashed by FI.
   * @return fiUsernameHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account username hashed by FI.")

  public String getFiUsernameHash() {
    return fiUsernameHash;
  }


  public void setFiUsernameHash(String fiUsernameHash) {
    this.fiUsernameHash = fiUsernameHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemApplicationListUserAuth itemApplicationListUserAuth = (ItemApplicationListUserAuth) o;
    return Objects.equals(this.userId, itemApplicationListUserAuth.userId) &&
        Objects.equals(this.fiUsernameHash, itemApplicationListUserAuth.fiUsernameHash);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fiUsernameHash);
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
    sb.append("class ItemApplicationListUserAuth {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fiUsernameHash: ").append(toIndentedString(fiUsernameHash)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("fi_username_hash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemApplicationListUserAuth
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemApplicationListUserAuth.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemApplicationListUserAuth is not found in the empty JSON string", ItemApplicationListUserAuth.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemApplicationListUserAuth.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemApplicationListUserAuth` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("fi_username_hash") != null && !jsonObj.get("fi_username_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fi_username_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fi_username_hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemApplicationListUserAuth.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemApplicationListUserAuth' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemApplicationListUserAuth> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemApplicationListUserAuth.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemApplicationListUserAuth>() {
           @Override
           public void write(JsonWriter out, ItemApplicationListUserAuth value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemApplicationListUserAuth read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemApplicationListUserAuth given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemApplicationListUserAuth
  * @throws IOException if the JSON string is invalid with respect to ItemApplicationListUserAuth
  */
  public static ItemApplicationListUserAuth fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemApplicationListUserAuth.class);
  }

 /**
  * Convert an instance of ItemApplicationListUserAuth to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

