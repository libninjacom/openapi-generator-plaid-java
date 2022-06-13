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
 * The product access being requested. Used to or disallow product access across all accounts. If unset, defaults to all products allowed.
 */
@ApiModel(description = "The product access being requested. Used to or disallow product access across all accounts. If unset, defaults to all products allowed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class ProductAccess {
  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private Boolean statements = true;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Boolean identity = true;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private Boolean auth = true;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Boolean transactions = true;

  public ProductAccess() { 
  }

  public ProductAccess statements(Boolean statements) {
    
    this.statements = statements;
    return this;
  }

   /**
   * Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return statements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getStatements() {
    return statements;
  }


  public void setStatements(Boolean statements) {
    this.statements = statements;
  }


  public ProductAccess identity(Boolean identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getIdentity() {
    return identity;
  }


  public void setIdentity(Boolean identity) {
    this.identity = identity;
  }


  public ProductAccess auth(Boolean auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getAuth() {
    return auth;
  }


  public void setAuth(Boolean auth) {
    this.auth = auth;
  }


  public ProductAccess transactions(Boolean transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getTransactions() {
    return transactions;
  }


  public void setTransactions(Boolean transactions) {
    this.transactions = transactions;
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
  public ProductAccess putAdditionalProperty(String key, Object value) {
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
    ProductAccess productAccess = (ProductAccess) o;
    return Objects.equals(this.statements, productAccess.statements) &&
        Objects.equals(this.identity, productAccess.identity) &&
        Objects.equals(this.auth, productAccess.auth) &&
        Objects.equals(this.transactions, productAccess.transactions)&&
        Objects.equals(this.additionalProperties, productAccess.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(statements, identity, auth, transactions, additionalProperties);
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
    sb.append("class ProductAccess {\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
    openapiFields.add("statements");
    openapiFields.add("identity");
    openapiFields.add("auth");
    openapiFields.add("transactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductAccess
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProductAccess.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductAccess is not found in the empty JSON string", ProductAccess.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductAccess.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductAccess' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductAccess> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductAccess.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductAccess>() {
           @Override
           public void write(JsonWriter out, ProductAccess value) throws IOException {
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
           public ProductAccess read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductAccess instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductAccess given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductAccess
  * @throws IOException if the JSON string is invalid with respect to ProductAccess
  */
  public static ProductAccess fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductAccess.class);
  }

 /**
  * Convert an instance of ProductAccess to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
