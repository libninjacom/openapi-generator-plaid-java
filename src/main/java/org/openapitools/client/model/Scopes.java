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
import org.openapitools.client.model.AccountAccess;
import org.openapitools.client.model.ProductAccess;
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
 * The scopes object
 */
@ApiModel(description = "The scopes object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class Scopes {
  public static final String SERIALIZED_NAME_PRODUCT_ACCESS = "product_access";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ACCESS)
  private ProductAccess productAccess;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountAccess> accounts = null;

  public static final String SERIALIZED_NAME_NEW_ACCOUNTS = "new_accounts";
  @SerializedName(SERIALIZED_NAME_NEW_ACCOUNTS)
  private Boolean newAccounts = true;

  public Scopes() { 
  }

  public Scopes productAccess(ProductAccess productAccess) {
    
    this.productAccess = productAccess;
    return this;
  }

   /**
   * Get productAccess
   * @return productAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductAccess getProductAccess() {
    return productAccess;
  }


  public void setProductAccess(ProductAccess productAccess) {
    this.productAccess = productAccess;
  }


  public Scopes accounts(List<AccountAccess> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public Scopes addAccountsItem(AccountAccess accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountAccess> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountAccess> accounts) {
    this.accounts = accounts;
  }


  public Scopes newAccounts(Boolean newAccounts) {
    
    this.newAccounts = newAccounts;
    return this;
  }

   /**
   * Allow access to newly opened accounts as they are opened. If unset, defaults to &#x60;true&#x60;.
   * @return newAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to newly opened accounts as they are opened. If unset, defaults to `true`.")

  public Boolean getNewAccounts() {
    return newAccounts;
  }


  public void setNewAccounts(Boolean newAccounts) {
    this.newAccounts = newAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scopes scopes = (Scopes) o;
    return Objects.equals(this.productAccess, scopes.productAccess) &&
        Objects.equals(this.accounts, scopes.accounts) &&
        Objects.equals(this.newAccounts, scopes.newAccounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productAccess, accounts, newAccounts);
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
    sb.append("class Scopes {\n");
    sb.append("    productAccess: ").append(toIndentedString(productAccess)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    newAccounts: ").append(toIndentedString(newAccounts)).append("\n");
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
    openapiFields.add("product_access");
    openapiFields.add("accounts");
    openapiFields.add("new_accounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Scopes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Scopes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Scopes is not found in the empty JSON string", Scopes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Scopes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Scopes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaccounts = jsonObj.getAsJsonArray("accounts");
      if (jsonArrayaccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `accounts` to be an array in the JSON string but got `%s`", jsonObj.get("accounts").toString()));
        }

        // validate the optional field `accounts` (array)
        for (int i = 0; i < jsonArrayaccounts.size(); i++) {
          AccountAccess.validateJsonObject(jsonArrayaccounts.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Scopes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Scopes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Scopes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Scopes.class));

       return (TypeAdapter<T>) new TypeAdapter<Scopes>() {
           @Override
           public void write(JsonWriter out, Scopes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Scopes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Scopes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Scopes
  * @throws IOException if the JSON string is invalid with respect to Scopes
  */
  public static Scopes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Scopes.class);
  }

 /**
  * Convert an instance of Scopes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

