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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AccountSubtype;
import org.openapitools.client.model.HoldingsOverride;
import org.openapitools.client.model.IncomeOverride;
import org.openapitools.client.model.InflowModel;
import org.openapitools.client.model.InvestmentsTransactionsOverride;
import org.openapitools.client.model.LiabilityOverride;
import org.openapitools.client.model.Meta;
import org.openapitools.client.model.Numbers;
import org.openapitools.client.model.OverrideAccountType;
import org.openapitools.client.model.OwnerOverride;
import org.openapitools.client.model.TransactionOverride;

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
 * Data to use to set values of test accounts. Some values cannot be specified in the schema and will instead will be calculated from other test data in order to achieve more consistent, realistic test data.
 */
@ApiModel(description = "Data to use to set values of test accounts. Some values cannot be specified in the schema and will instead will be calculated from other test data in order to achieve more consistent, realistic test data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class OverrideAccounts {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OverrideAccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  public static final String SERIALIZED_NAME_STARTING_BALANCE = "starting_balance";
  @SerializedName(SERIALIZED_NAME_STARTING_BALANCE)
  private BigDecimal startingBalance;

  public static final String SERIALIZED_NAME_FORCE_AVAILABLE_BALANCE = "force_available_balance";
  @SerializedName(SERIALIZED_NAME_FORCE_AVAILABLE_BALANCE)
  private BigDecimal forceAvailableBalance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private Numbers numbers;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionOverride> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private HoldingsOverride holdings;

  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTIONS = "investment_transactions";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTIONS)
  private InvestmentsTransactionsOverride investmentTransactions;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private OwnerOverride identity;

  public static final String SERIALIZED_NAME_LIABILITY = "liability";
  @SerializedName(SERIALIZED_NAME_LIABILITY)
  private LiabilityOverride liability;

  public static final String SERIALIZED_NAME_INFLOW_MODEL = "inflow_model";
  @SerializedName(SERIALIZED_NAME_INFLOW_MODEL)
  private InflowModel inflowModel;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private IncomeOverride income;

  public OverrideAccounts() { 
  }

  public OverrideAccounts type(OverrideAccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OverrideAccountType getType() {
    return type;
  }


  public void setType(OverrideAccountType type) {
    this.type = type;
  }


  public OverrideAccounts subtype(AccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(AccountSubtype subtype) {
    this.subtype = subtype;
  }


  public OverrideAccounts startingBalance(BigDecimal startingBalance) {
    
    this.startingBalance = startingBalance;
    return this;
  }

   /**
   * If provided, the account will start with this amount as the current balance. 
   * @return startingBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If provided, the account will start with this amount as the current balance. ")

  public BigDecimal getStartingBalance() {
    return startingBalance;
  }


  public void setStartingBalance(BigDecimal startingBalance) {
    this.startingBalance = startingBalance;
  }


  public OverrideAccounts forceAvailableBalance(BigDecimal forceAvailableBalance) {
    
    this.forceAvailableBalance = forceAvailableBalance;
    return this;
  }

   /**
   * If provided, the account will always have this amount as its  available balance, regardless of current balance or changes in transactions over time.
   * @return forceAvailableBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If provided, the account will always have this amount as its  available balance, regardless of current balance or changes in transactions over time.")

  public BigDecimal getForceAvailableBalance() {
    return forceAvailableBalance;
  }


  public void setForceAvailableBalance(BigDecimal forceAvailableBalance) {
    this.forceAvailableBalance = forceAvailableBalance;
  }


  public OverrideAccounts currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * ISO-4217 currency code. If provided, the account will be denominated in the given currency. Transactions will also be in this currency by default.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO-4217 currency code. If provided, the account will be denominated in the given currency. Transactions will also be in this currency by default.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public OverrideAccounts meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public OverrideAccounts numbers(Numbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Numbers getNumbers() {
    return numbers;
  }


  public void setNumbers(Numbers numbers) {
    this.numbers = numbers;
  }


  public OverrideAccounts transactions(List<TransactionOverride> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public OverrideAccounts addTransactionsItem(TransactionOverride transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Specify the list of transactions on the account.
   * @return transactions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specify the list of transactions on the account.")

  public List<TransactionOverride> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<TransactionOverride> transactions) {
    this.transactions = transactions;
  }


  public OverrideAccounts holdings(HoldingsOverride holdings) {
    
    this.holdings = holdings;
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HoldingsOverride getHoldings() {
    return holdings;
  }


  public void setHoldings(HoldingsOverride holdings) {
    this.holdings = holdings;
  }


  public OverrideAccounts investmentTransactions(InvestmentsTransactionsOverride investmentTransactions) {
    
    this.investmentTransactions = investmentTransactions;
    return this;
  }

   /**
   * Get investmentTransactions
   * @return investmentTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentsTransactionsOverride getInvestmentTransactions() {
    return investmentTransactions;
  }


  public void setInvestmentTransactions(InvestmentsTransactionsOverride investmentTransactions) {
    this.investmentTransactions = investmentTransactions;
  }


  public OverrideAccounts identity(OwnerOverride identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OwnerOverride getIdentity() {
    return identity;
  }


  public void setIdentity(OwnerOverride identity) {
    this.identity = identity;
  }


  public OverrideAccounts liability(LiabilityOverride liability) {
    
    this.liability = liability;
    return this;
  }

   /**
   * Get liability
   * @return liability
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LiabilityOverride getLiability() {
    return liability;
  }


  public void setLiability(LiabilityOverride liability) {
    this.liability = liability;
  }


  public OverrideAccounts inflowModel(InflowModel inflowModel) {
    
    this.inflowModel = inflowModel;
    return this;
  }

   /**
   * Get inflowModel
   * @return inflowModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InflowModel getInflowModel() {
    return inflowModel;
  }


  public void setInflowModel(InflowModel inflowModel) {
    this.inflowModel = inflowModel;
  }


  public OverrideAccounts income(IncomeOverride income) {
    
    this.income = income;
    return this;
  }

   /**
   * Get income
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeOverride getIncome() {
    return income;
  }


  public void setIncome(IncomeOverride income) {
    this.income = income;
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
  public OverrideAccounts putAdditionalProperty(String key, Object value) {
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
    OverrideAccounts overrideAccounts = (OverrideAccounts) o;
    return Objects.equals(this.type, overrideAccounts.type) &&
        Objects.equals(this.subtype, overrideAccounts.subtype) &&
        Objects.equals(this.startingBalance, overrideAccounts.startingBalance) &&
        Objects.equals(this.forceAvailableBalance, overrideAccounts.forceAvailableBalance) &&
        Objects.equals(this.currency, overrideAccounts.currency) &&
        Objects.equals(this.meta, overrideAccounts.meta) &&
        Objects.equals(this.numbers, overrideAccounts.numbers) &&
        Objects.equals(this.transactions, overrideAccounts.transactions) &&
        Objects.equals(this.holdings, overrideAccounts.holdings) &&
        Objects.equals(this.investmentTransactions, overrideAccounts.investmentTransactions) &&
        Objects.equals(this.identity, overrideAccounts.identity) &&
        Objects.equals(this.liability, overrideAccounts.liability) &&
        Objects.equals(this.inflowModel, overrideAccounts.inflowModel) &&
        Objects.equals(this.income, overrideAccounts.income)&&
        Objects.equals(this.additionalProperties, overrideAccounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, startingBalance, forceAvailableBalance, currency, meta, numbers, transactions, holdings, investmentTransactions, identity, liability, inflowModel, income, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideAccounts {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    startingBalance: ").append(toIndentedString(startingBalance)).append("\n");
    sb.append("    forceAvailableBalance: ").append(toIndentedString(forceAvailableBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    investmentTransactions: ").append(toIndentedString(investmentTransactions)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    liability: ").append(toIndentedString(liability)).append("\n");
    sb.append("    inflowModel: ").append(toIndentedString(inflowModel)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("starting_balance");
    openapiFields.add("force_available_balance");
    openapiFields.add("currency");
    openapiFields.add("meta");
    openapiFields.add("numbers");
    openapiFields.add("transactions");
    openapiFields.add("holdings");
    openapiFields.add("investment_transactions");
    openapiFields.add("identity");
    openapiFields.add("liability");
    openapiFields.add("inflow_model");
    openapiFields.add("income");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("starting_balance");
    openapiRequiredFields.add("force_available_balance");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("numbers");
    openapiRequiredFields.add("transactions");
    openapiRequiredFields.add("identity");
    openapiRequiredFields.add("liability");
    openapiRequiredFields.add("inflow_model");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverrideAccounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OverrideAccounts.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverrideAccounts is not found in the empty JSON string", OverrideAccounts.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OverrideAccounts.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("transactions") != null && !jsonObj.get("transactions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactions` to be an array in the JSON string but got `%s`", jsonObj.get("transactions").toString()));
      }
      // validate the optional field `holdings`
      if (jsonObj.getAsJsonObject("holdings") != null) {
        HoldingsOverride.validateJsonObject(jsonObj.getAsJsonObject("holdings"));
      }
      // validate the optional field `investment_transactions`
      if (jsonObj.getAsJsonObject("investment_transactions") != null) {
        InvestmentsTransactionsOverride.validateJsonObject(jsonObj.getAsJsonObject("investment_transactions"));
      }
      // validate the optional field `income`
      if (jsonObj.getAsJsonObject("income") != null) {
        IncomeOverride.validateJsonObject(jsonObj.getAsJsonObject("income"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverrideAccounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverrideAccounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverrideAccounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverrideAccounts.class));

       return (TypeAdapter<T>) new TypeAdapter<OverrideAccounts>() {
           @Override
           public void write(JsonWriter out, OverrideAccounts value) throws IOException {
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
           public OverrideAccounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OverrideAccounts instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OverrideAccounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverrideAccounts
  * @throws IOException if the JSON string is invalid with respect to OverrideAccounts
  */
  public static OverrideAccounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverrideAccounts.class);
  }

 /**
  * Convert an instance of OverrideAccounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

