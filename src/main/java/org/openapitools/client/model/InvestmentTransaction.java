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
import java.time.LocalDate;
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
 * A transaction within an investment account.
 */
@ApiModel(description = "A transaction within an investment account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class InvestmentTransaction {
  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID = "investment_transaction_id";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID)
  private String investmentTransactionId;

  public static final String SERIALIZED_NAME_CANCEL_TRANSACTION_ID = "cancel_transaction_id";
  @SerializedName(SERIALIZED_NAME_CANCEL_TRANSACTION_ID)
  private String cancelTransactionId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private BigDecimal fees;

  /**
   * Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUY("buy"),
    
    SELL("sell"),
    
    CANCEL("cancel"),
    
    CASH("cash"),
    
    FEE("fee"),
    
    TRANSFER("transfer");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    ACCOUNT_FEE("account fee"),
    
    ADJUSTMENT("adjustment"),
    
    ASSIGNMENT("assignment"),
    
    BUY("buy"),
    
    BUY_TO_COVER("buy to cover"),
    
    CONTRIBUTION("contribution"),
    
    DEPOSIT("deposit"),
    
    DISTRIBUTION("distribution"),
    
    DIVIDEND("dividend"),
    
    DIVIDEND_REINVESTMENT("dividend reinvestment"),
    
    EXERCISE("exercise"),
    
    EXPIRE("expire"),
    
    FUND_FEE("fund fee"),
    
    INTEREST("interest"),
    
    INTEREST_RECEIVABLE("interest receivable"),
    
    INTEREST_REINVESTMENT("interest reinvestment"),
    
    LEGAL_FEE("legal fee"),
    
    LOAN_PAYMENT("loan payment"),
    
    LONG_TERM_CAPITAL_GAIN("long-term capital gain"),
    
    LONG_TERM_CAPITAL_GAIN_REINVESTMENT("long-term capital gain reinvestment"),
    
    MANAGEMENT_FEE("management fee"),
    
    MARGIN_EXPENSE("margin expense"),
    
    MERGER("merger"),
    
    MISCELLANEOUS_FEE("miscellaneous fee"),
    
    NON_QUALIFIED_DIVIDEND("non-qualified dividend"),
    
    NON_RESIDENT_TAX("non-resident tax"),
    
    PENDING_CREDIT("pending credit"),
    
    PENDING_DEBIT("pending debit"),
    
    QUALIFIED_DIVIDEND("qualified dividend"),
    
    REBALANCE("rebalance"),
    
    RETURN_OF_PRINCIPAL("return of principal"),
    
    SELL("sell"),
    
    SELL_SHORT("sell short"),
    
    SHORT_TERM_CAPITAL_GAIN("short-term capital gain"),
    
    SHORT_TERM_CAPITAL_GAIN_REINVESTMENT("short-term capital gain reinvestment"),
    
    SPIN_OFF("spin off"),
    
    SPLIT("split"),
    
    STOCK_DISTRIBUTION("stock distribution"),
    
    TAX("tax"),
    
    TAX_WITHHELD("tax withheld"),
    
    TRANSFER("transfer"),
    
    TRANSFER_FEE("transfer fee"),
    
    TRUST_FEE("trust fee"),
    
    UNQUALIFIED_GAIN("unqualified gain"),
    
    WITHDRAWAL("withdrawal");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public InvestmentTransaction() { 
  }

  public InvestmentTransaction investmentTransactionId(String investmentTransactionId) {
    
    this.investmentTransactionId = investmentTransactionId;
    return this;
  }

   /**
   * The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the &#x60;investment_transaction_id&#x60; is case sensitive.
   * @return investmentTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive.")

  public String getInvestmentTransactionId() {
    return investmentTransactionId;
  }


  public void setInvestmentTransactionId(String investmentTransactionId) {
    this.investmentTransactionId = investmentTransactionId;
  }


  public InvestmentTransaction cancelTransactionId(String cancelTransactionId) {
    
    this.cancelTransactionId = cancelTransactionId;
    return this;
  }

   /**
   * A legacy field formerly used internally by Plaid to identify certain canceled transactions.
   * @return cancelTransactionId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A legacy field formerly used internally by Plaid to identify certain canceled transactions.")

  public String getCancelTransactionId() {
    return cancelTransactionId;
  }


  public void setCancelTransactionId(String cancelTransactionId) {
    this.cancelTransactionId = cancelTransactionId;
  }


  public InvestmentTransaction accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The &#x60;account_id&#x60; of the account against which this transaction posted.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The `account_id` of the account against which this transaction posted.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InvestmentTransaction securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * The &#x60;security_id&#x60; to which this transaction is related.
   * @return securityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `security_id` to which this transaction is related.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public InvestmentTransaction date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction.
   * @return date
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InvestmentTransaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The institution’s description of the transaction.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The institution’s description of the transaction.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvestmentTransaction quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security involved in this transaction.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of units of the security involved in this transaction.")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public InvestmentTransaction amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InvestmentTransaction price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the security at which this transaction occurred.
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The price of the security at which this transaction occurred.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public InvestmentTransaction fees(BigDecimal fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The combined value of all fees applied to this transaction
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The combined value of all fees applied to this transaction")

  public BigDecimal getFees() {
    return fees;
  }


  public void setFees(BigDecimal fees) {
    this.fees = fees;
  }


  public InvestmentTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Value is one of the following: `buy`: Buying an investment `sell`: Selling an investment `cancel`: A cancellation of a pending transaction `cash`: Activity that modifies a cash position `fee`: A fee on the account `transfer`: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvestmentTransaction subtype(SubtypeEnum subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
   * @return subtype
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).")

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public InvestmentTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-`null`.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public InvestmentTransaction unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the holding. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
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
  public InvestmentTransaction putAdditionalProperty(String key, Object value) {
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
    InvestmentTransaction investmentTransaction = (InvestmentTransaction) o;
    return Objects.equals(this.investmentTransactionId, investmentTransaction.investmentTransactionId) &&
        Objects.equals(this.cancelTransactionId, investmentTransaction.cancelTransactionId) &&
        Objects.equals(this.accountId, investmentTransaction.accountId) &&
        Objects.equals(this.securityId, investmentTransaction.securityId) &&
        Objects.equals(this.date, investmentTransaction.date) &&
        Objects.equals(this.name, investmentTransaction.name) &&
        Objects.equals(this.quantity, investmentTransaction.quantity) &&
        Objects.equals(this.amount, investmentTransaction.amount) &&
        Objects.equals(this.price, investmentTransaction.price) &&
        Objects.equals(this.fees, investmentTransaction.fees) &&
        Objects.equals(this.type, investmentTransaction.type) &&
        Objects.equals(this.subtype, investmentTransaction.subtype) &&
        Objects.equals(this.isoCurrencyCode, investmentTransaction.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, investmentTransaction.unofficialCurrencyCode)&&
        Objects.equals(this.additionalProperties, investmentTransaction.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentTransactionId, cancelTransactionId, accountId, securityId, date, name, quantity, amount, price, fees, type, subtype, isoCurrencyCode, unofficialCurrencyCode, additionalProperties);
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
    sb.append("class InvestmentTransaction {\n");
    sb.append("    investmentTransactionId: ").append(toIndentedString(investmentTransactionId)).append("\n");
    sb.append("    cancelTransactionId: ").append(toIndentedString(cancelTransactionId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
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
    openapiFields.add("investment_transaction_id");
    openapiFields.add("cancel_transaction_id");
    openapiFields.add("account_id");
    openapiFields.add("security_id");
    openapiFields.add("date");
    openapiFields.add("name");
    openapiFields.add("quantity");
    openapiFields.add("amount");
    openapiFields.add("price");
    openapiFields.add("fees");
    openapiFields.add("type");
    openapiFields.add("subtype");
    openapiFields.add("iso_currency_code");
    openapiFields.add("unofficial_currency_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("investment_transaction_id");
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("security_id");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("fees");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("subtype");
    openapiRequiredFields.add("iso_currency_code");
    openapiRequiredFields.add("unofficial_currency_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvestmentTransaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvestmentTransaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvestmentTransaction is not found in the empty JSON string", InvestmentTransaction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvestmentTransaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("investment_transaction_id") != null && !jsonObj.get("investment_transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `investment_transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("investment_transaction_id").toString()));
      }
      if (jsonObj.get("cancel_transaction_id") != null && !jsonObj.get("cancel_transaction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_transaction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_transaction_id").toString()));
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("security_id") != null && !jsonObj.get("security_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("security_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("subtype") != null && !jsonObj.get("subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
      }
      if (jsonObj.get("iso_currency_code") != null && !jsonObj.get("iso_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iso_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iso_currency_code").toString()));
      }
      if (jsonObj.get("unofficial_currency_code") != null && !jsonObj.get("unofficial_currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unofficial_currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unofficial_currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvestmentTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvestmentTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvestmentTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvestmentTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<InvestmentTransaction>() {
           @Override
           public void write(JsonWriter out, InvestmentTransaction value) throws IOException {
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
           public InvestmentTransaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvestmentTransaction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvestmentTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvestmentTransaction
  * @throws IOException if the JSON string is invalid with respect to InvestmentTransaction
  */
  public static InvestmentTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvestmentTransaction.class);
  }

 /**
  * Convert an instance of InvestmentTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
