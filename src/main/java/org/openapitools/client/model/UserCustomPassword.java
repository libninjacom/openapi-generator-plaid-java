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
import org.openapitools.client.model.MFA;
import org.openapitools.client.model.OverrideAccounts;
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
 * Custom test accounts are configured with a JSON configuration object formulated according to the schema below. All fields are optional. Sending an empty object as a configuration will result in an account configured with random balances and transaction history.
 */
@ApiModel(description = "Custom test accounts are configured with a JSON configuration object formulated according to the schema below. All fields are optional. Sending an empty object as a configuration will result in an account configured with random balances and transaction history.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class UserCustomPassword {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  private String seed;

  public static final String SERIALIZED_NAME_OVERRIDE_ACCOUNTS = "override_accounts";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_ACCOUNTS)
  private List<OverrideAccounts> overrideAccounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_MFA = "mfa";
  @SerializedName(SERIALIZED_NAME_MFA)
  private MFA mfa;

  public static final String SERIALIZED_NAME_RECAPTCHA = "recaptcha";
  @SerializedName(SERIALIZED_NAME_RECAPTCHA)
  private String recaptcha;

  public static final String SERIALIZED_NAME_FORCE_ERROR = "force_error";
  @SerializedName(SERIALIZED_NAME_FORCE_ERROR)
  private String forceError;

  public UserCustomPassword() { 
  }

  public UserCustomPassword version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the password schema to use, possible values are 1 or 2. The default value is 2. You should only specify 1 if you know it is necessary for your test suite.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the password schema to use, possible values are 1 or 2. The default value is 2. You should only specify 1 if you know it is necessary for your test suite.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public UserCustomPassword seed(String seed) {
    
    this.seed = seed;
    return this;
  }

   /**
   * A seed, in the form of a string, that will be used to randomly generate account and transaction data, if this data is not specified using the &#x60;override_accounts&#x60; argument. If no seed is specified, the randomly generated data will be different each time.  Note that transactions data is generated relative to the Item&#39;s creation date. Different Items created on different dates with the same seed for transactions data will have different dates for the transactions. The number of days between each transaction and the Item creation will remain constant. For example, an Item created on December 15 might show a transaction on December 14. An Item created on December 20, using the same seed, would show that same transaction occurring on December 19.
   * @return seed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A seed, in the form of a string, that will be used to randomly generate account and transaction data, if this data is not specified using the `override_accounts` argument. If no seed is specified, the randomly generated data will be different each time.  Note that transactions data is generated relative to the Item's creation date. Different Items created on different dates with the same seed for transactions data will have different dates for the transactions. The number of days between each transaction and the Item creation will remain constant. For example, an Item created on December 15 might show a transaction on December 14. An Item created on December 20, using the same seed, would show that same transaction occurring on December 19.")

  public String getSeed() {
    return seed;
  }


  public void setSeed(String seed) {
    this.seed = seed;
  }


  public UserCustomPassword overrideAccounts(List<OverrideAccounts> overrideAccounts) {
    
    this.overrideAccounts = overrideAccounts;
    return this;
  }

  public UserCustomPassword addOverrideAccountsItem(OverrideAccounts overrideAccountsItem) {
    this.overrideAccounts.add(overrideAccountsItem);
    return this;
  }

   /**
   * An array of account overrides to configure the accounts for the Item. By default, if no override is specified, transactions and account data will be randomly generated based on the account type and subtype, and other products will have fixed or empty data.
   * @return overrideAccounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of account overrides to configure the accounts for the Item. By default, if no override is specified, transactions and account data will be randomly generated based on the account type and subtype, and other products will have fixed or empty data.")

  public List<OverrideAccounts> getOverrideAccounts() {
    return overrideAccounts;
  }


  public void setOverrideAccounts(List<OverrideAccounts> overrideAccounts) {
    this.overrideAccounts = overrideAccounts;
  }


  public UserCustomPassword mfa(MFA mfa) {
    
    this.mfa = mfa;
    return this;
  }

   /**
   * Get mfa
   * @return mfa
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MFA getMfa() {
    return mfa;
  }


  public void setMfa(MFA mfa) {
    this.mfa = mfa;
  }


  public UserCustomPassword recaptcha(String recaptcha) {
    
    this.recaptcha = recaptcha;
    return this;
  }

   /**
   * You may trigger a reCAPTCHA in Plaid Link in the Sandbox environment by using the recaptcha field. Possible values are &#x60;good&#x60; or &#x60;bad&#x60;. A value of &#x60;good&#x60; will result in successful Item creation and &#x60;bad&#x60; will result in a &#x60;RECAPTCHA_BAD&#x60; error to simulate a failed reCAPTCHA. Both values require the reCAPTCHA to be manually solved within Plaid Link.
   * @return recaptcha
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "You may trigger a reCAPTCHA in Plaid Link in the Sandbox environment by using the recaptcha field. Possible values are `good` or `bad`. A value of `good` will result in successful Item creation and `bad` will result in a `RECAPTCHA_BAD` error to simulate a failed reCAPTCHA. Both values require the reCAPTCHA to be manually solved within Plaid Link.")

  public String getRecaptcha() {
    return recaptcha;
  }


  public void setRecaptcha(String recaptcha) {
    this.recaptcha = recaptcha;
  }


  public UserCustomPassword forceError(String forceError) {
    
    this.forceError = forceError;
    return this;
  }

   /**
   * An error code to force on Item creation. Possible values are:  &#x60;\&quot;INSTITUTION_NOT_RESPONDING\&quot;&#x60; &#x60;\&quot;INSTITUTION_NO_LONGER_SUPPORTED\&quot;&#x60; &#x60;\&quot;INVALID_CREDENTIALS\&quot;&#x60; &#x60;\&quot;INVALID_MFA\&quot;&#x60; &#x60;\&quot;ITEM_LOCKED\&quot;&#x60; &#x60;\&quot;ITEM_LOGIN_REQUIRED\&quot;&#x60; &#x60;\&quot;ITEM_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;INVALID_LINK_TOKEN\&quot;&#x60; &#x60;\&quot;MFA_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;NO_ACCOUNTS\&quot;&#x60; &#x60;\&quot;PLAID_ERROR\&quot;&#x60; &#x60;\&quot;PRODUCTS_NOT_SUPPORTED\&quot;&#x60; &#x60;\&quot;USER_SETUP_REQUIRED\&quot;&#x60;
   * @return forceError
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An error code to force on Item creation. Possible values are:  `\"INSTITUTION_NOT_RESPONDING\"` `\"INSTITUTION_NO_LONGER_SUPPORTED\"` `\"INVALID_CREDENTIALS\"` `\"INVALID_MFA\"` `\"ITEM_LOCKED\"` `\"ITEM_LOGIN_REQUIRED\"` `\"ITEM_NOT_SUPPORTED\"` `\"INVALID_LINK_TOKEN\"` `\"MFA_NOT_SUPPORTED\"` `\"NO_ACCOUNTS\"` `\"PLAID_ERROR\"` `\"PRODUCTS_NOT_SUPPORTED\"` `\"USER_SETUP_REQUIRED\"`")

  public String getForceError() {
    return forceError;
  }


  public void setForceError(String forceError) {
    this.forceError = forceError;
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
  public UserCustomPassword putAdditionalProperty(String key, Object value) {
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
    UserCustomPassword userCustomPassword = (UserCustomPassword) o;
    return Objects.equals(this.version, userCustomPassword.version) &&
        Objects.equals(this.seed, userCustomPassword.seed) &&
        Objects.equals(this.overrideAccounts, userCustomPassword.overrideAccounts) &&
        Objects.equals(this.mfa, userCustomPassword.mfa) &&
        Objects.equals(this.recaptcha, userCustomPassword.recaptcha) &&
        Objects.equals(this.forceError, userCustomPassword.forceError)&&
        Objects.equals(this.additionalProperties, userCustomPassword.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, seed, overrideAccounts, mfa, recaptcha, forceError, additionalProperties);
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
    sb.append("class UserCustomPassword {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    overrideAccounts: ").append(toIndentedString(overrideAccounts)).append("\n");
    sb.append("    mfa: ").append(toIndentedString(mfa)).append("\n");
    sb.append("    recaptcha: ").append(toIndentedString(recaptcha)).append("\n");
    sb.append("    forceError: ").append(toIndentedString(forceError)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("seed");
    openapiFields.add("override_accounts");
    openapiFields.add("mfa");
    openapiFields.add("recaptcha");
    openapiFields.add("force_error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("seed");
    openapiRequiredFields.add("override_accounts");
    openapiRequiredFields.add("mfa");
    openapiRequiredFields.add("recaptcha");
    openapiRequiredFields.add("force_error");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserCustomPassword
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserCustomPassword.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserCustomPassword is not found in the empty JSON string", UserCustomPassword.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserCustomPassword.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (jsonObj.get("seed") != null && !jsonObj.get("seed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seed").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("override_accounts") != null && !jsonObj.get("override_accounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `override_accounts` to be an array in the JSON string but got `%s`", jsonObj.get("override_accounts").toString()));
      }
      if (jsonObj.get("recaptcha") != null && !jsonObj.get("recaptcha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recaptcha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recaptcha").toString()));
      }
      if (jsonObj.get("force_error") != null && !jsonObj.get("force_error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `force_error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("force_error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserCustomPassword.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserCustomPassword' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserCustomPassword> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserCustomPassword.class));

       return (TypeAdapter<T>) new TypeAdapter<UserCustomPassword>() {
           @Override
           public void write(JsonWriter out, UserCustomPassword value) throws IOException {
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
           public UserCustomPassword read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserCustomPassword instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserCustomPassword given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserCustomPassword
  * @throws IOException if the JSON string is invalid with respect to UserCustomPassword
  */
  public static UserCustomPassword fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserCustomPassword.class);
  }

 /**
  * Convert an instance of UserCustomPassword to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

