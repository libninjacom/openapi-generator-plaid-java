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
 * An optional set of options to be used when configuring the Item. If specified, must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional set of options to be used when configuring the Item. If specified, must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class SandboxProcessorTokenCreateRequestOptions {
  public static final String SERIALIZED_NAME_OVERRIDE_USERNAME = "override_username";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_USERNAME)
  private String overrideUsername = "user_good";

  public static final String SERIALIZED_NAME_OVERRIDE_PASSWORD = "override_password";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_PASSWORD)
  private String overridePassword = "pass_good";

  public SandboxProcessorTokenCreateRequestOptions() { 
  }

  public SandboxProcessorTokenCreateRequestOptions overrideUsername(String overrideUsername) {
    
    this.overrideUsername = overrideUsername;
    return this;
  }

   /**
   * Test username to use for the creation of the Sandbox Item. Default value is &#x60;user_good&#x60;.
   * @return overrideUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test username to use for the creation of the Sandbox Item. Default value is `user_good`.")

  public String getOverrideUsername() {
    return overrideUsername;
  }


  public void setOverrideUsername(String overrideUsername) {
    this.overrideUsername = overrideUsername;
  }


  public SandboxProcessorTokenCreateRequestOptions overridePassword(String overridePassword) {
    
    this.overridePassword = overridePassword;
    return this;
  }

   /**
   * Test password to use for the creation of the Sandbox Item. Default value is &#x60;pass_good&#x60;.
   * @return overridePassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test password to use for the creation of the Sandbox Item. Default value is `pass_good`.")

  public String getOverridePassword() {
    return overridePassword;
  }


  public void setOverridePassword(String overridePassword) {
    this.overridePassword = overridePassword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxProcessorTokenCreateRequestOptions sandboxProcessorTokenCreateRequestOptions = (SandboxProcessorTokenCreateRequestOptions) o;
    return Objects.equals(this.overrideUsername, sandboxProcessorTokenCreateRequestOptions.overrideUsername) &&
        Objects.equals(this.overridePassword, sandboxProcessorTokenCreateRequestOptions.overridePassword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideUsername, overridePassword);
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
    sb.append("class SandboxProcessorTokenCreateRequestOptions {\n");
    sb.append("    overrideUsername: ").append(toIndentedString(overrideUsername)).append("\n");
    sb.append("    overridePassword: ").append(toIndentedString(overridePassword)).append("\n");
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
    openapiFields.add("override_username");
    openapiFields.add("override_password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SandboxProcessorTokenCreateRequestOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SandboxProcessorTokenCreateRequestOptions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SandboxProcessorTokenCreateRequestOptions is not found in the empty JSON string", SandboxProcessorTokenCreateRequestOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SandboxProcessorTokenCreateRequestOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SandboxProcessorTokenCreateRequestOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("override_username") != null && !jsonObj.get("override_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("override_username").toString()));
      }
      if (jsonObj.get("override_password") != null && !jsonObj.get("override_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("override_password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SandboxProcessorTokenCreateRequestOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SandboxProcessorTokenCreateRequestOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SandboxProcessorTokenCreateRequestOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SandboxProcessorTokenCreateRequestOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<SandboxProcessorTokenCreateRequestOptions>() {
           @Override
           public void write(JsonWriter out, SandboxProcessorTokenCreateRequestOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SandboxProcessorTokenCreateRequestOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SandboxProcessorTokenCreateRequestOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SandboxProcessorTokenCreateRequestOptions
  * @throws IOException if the JSON string is invalid with respect to SandboxProcessorTokenCreateRequestOptions
  */
  public static SandboxProcessorTokenCreateRequestOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SandboxProcessorTokenCreateRequestOptions.class);
  }

 /**
  * Convert an instance of SandboxProcessorTokenCreateRequestOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

