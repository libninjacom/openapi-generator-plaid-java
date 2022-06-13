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
import org.openapitools.client.model.MortgageInterestRate;
import org.openapitools.client.model.MortgagePropertyAddress;

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
 * Contains details about a mortgage account.
 */
@ApiModel(description = "Contains details about a mortgage account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class MortgageLiability {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_CURRENT_LATE_FEE = "current_late_fee";
  @SerializedName(SERIALIZED_NAME_CURRENT_LATE_FEE)
  private BigDecimal currentLateFee;

  public static final String SERIALIZED_NAME_ESCROW_BALANCE = "escrow_balance";
  @SerializedName(SERIALIZED_NAME_ESCROW_BALANCE)
  private BigDecimal escrowBalance;

  public static final String SERIALIZED_NAME_HAS_PMI = "has_pmi";
  @SerializedName(SERIALIZED_NAME_HAS_PMI)
  private Boolean hasPmi;

  public static final String SERIALIZED_NAME_HAS_PREPAYMENT_PENALTY = "has_prepayment_penalty";
  @SerializedName(SERIALIZED_NAME_HAS_PREPAYMENT_PENALTY)
  private Boolean hasPrepaymentPenalty;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private MortgageInterestRate interestRate;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AMOUNT = "last_payment_amount";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AMOUNT)
  private BigDecimal lastPaymentAmount;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private LocalDate lastPaymentDate;

  public static final String SERIALIZED_NAME_LOAN_TYPE_DESCRIPTION = "loan_type_description";
  @SerializedName(SERIALIZED_NAME_LOAN_TYPE_DESCRIPTION)
  private String loanTypeDescription;

  public static final String SERIALIZED_NAME_LOAN_TERM = "loan_term";
  @SerializedName(SERIALIZED_NAME_LOAN_TERM)
  private String loanTerm;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturity_date";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private LocalDate maturityDate;

  public static final String SERIALIZED_NAME_NEXT_MONTHLY_PAYMENT = "next_monthly_payment";
  @SerializedName(SERIALIZED_NAME_NEXT_MONTHLY_PAYMENT)
  private BigDecimal nextMonthlyPayment;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE = "next_payment_due_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE)
  private LocalDate nextPaymentDueDate;

  public static final String SERIALIZED_NAME_ORIGINATION_DATE = "origination_date";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_DATE)
  private LocalDate originationDate;

  public static final String SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT = "origination_principal_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT)
  private BigDecimal originationPrincipalAmount;

  public static final String SERIALIZED_NAME_PAST_DUE_AMOUNT = "past_due_amount";
  @SerializedName(SERIALIZED_NAME_PAST_DUE_AMOUNT)
  private BigDecimal pastDueAmount;

  public static final String SERIALIZED_NAME_PROPERTY_ADDRESS = "property_address";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ADDRESS)
  private MortgagePropertyAddress propertyAddress;

  public static final String SERIALIZED_NAME_YTD_INTEREST_PAID = "ytd_interest_paid";
  @SerializedName(SERIALIZED_NAME_YTD_INTEREST_PAID)
  private BigDecimal ytdInterestPaid;

  public static final String SERIALIZED_NAME_YTD_PRINCIPAL_PAID = "ytd_principal_paid";
  @SerializedName(SERIALIZED_NAME_YTD_PRINCIPAL_PAID)
  private BigDecimal ytdPrincipalPaid;

  public MortgageLiability() { 
  }

  public MortgageLiability accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that this liability belongs to.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the account that this liability belongs to.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public MortgageLiability accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number of the loan.
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The account number of the loan.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public MortgageLiability currentLateFee(BigDecimal currentLateFee) {
    
    this.currentLateFee = currentLateFee;
    return this;
  }

   /**
   * The current outstanding amount charged for late payment.
   * @return currentLateFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The current outstanding amount charged for late payment.")

  public BigDecimal getCurrentLateFee() {
    return currentLateFee;
  }


  public void setCurrentLateFee(BigDecimal currentLateFee) {
    this.currentLateFee = currentLateFee;
  }


  public MortgageLiability escrowBalance(BigDecimal escrowBalance) {
    
    this.escrowBalance = escrowBalance;
    return this;
  }

   /**
   * Total amount held in escrow to pay taxes and insurance on behalf of the borrower.
   * @return escrowBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total amount held in escrow to pay taxes and insurance on behalf of the borrower.")

  public BigDecimal getEscrowBalance() {
    return escrowBalance;
  }


  public void setEscrowBalance(BigDecimal escrowBalance) {
    this.escrowBalance = escrowBalance;
  }


  public MortgageLiability hasPmi(Boolean hasPmi) {
    
    this.hasPmi = hasPmi;
    return this;
  }

   /**
   * Indicates whether the borrower has private mortgage insurance in effect.
   * @return hasPmi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates whether the borrower has private mortgage insurance in effect.")

  public Boolean getHasPmi() {
    return hasPmi;
  }


  public void setHasPmi(Boolean hasPmi) {
    this.hasPmi = hasPmi;
  }


  public MortgageLiability hasPrepaymentPenalty(Boolean hasPrepaymentPenalty) {
    
    this.hasPrepaymentPenalty = hasPrepaymentPenalty;
    return this;
  }

   /**
   * Indicates whether the borrower will pay a penalty for early payoff of mortgage.
   * @return hasPrepaymentPenalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Indicates whether the borrower will pay a penalty for early payoff of mortgage.")

  public Boolean getHasPrepaymentPenalty() {
    return hasPrepaymentPenalty;
  }


  public void setHasPrepaymentPenalty(Boolean hasPrepaymentPenalty) {
    this.hasPrepaymentPenalty = hasPrepaymentPenalty;
  }


  public MortgageLiability interestRate(MortgageInterestRate interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MortgageInterestRate getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(MortgageInterestRate interestRate) {
    this.interestRate = interestRate;
  }


  public MortgageLiability lastPaymentAmount(BigDecimal lastPaymentAmount) {
    
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * The amount of the last payment.
   * @return lastPaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the last payment.")

  public BigDecimal getLastPaymentAmount() {
    return lastPaymentAmount;
  }


  public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }


  public MortgageLiability lastPaymentDate(LocalDate lastPaymentDate) {
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * The date of the last payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return lastPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date of the last payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(LocalDate lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }


  public MortgageLiability loanTypeDescription(String loanTypeDescription) {
    
    this.loanTypeDescription = loanTypeDescription;
    return this;
  }

   /**
   * Description of the type of loan, for example &#x60;conventional&#x60;, &#x60;fixed&#x60;, or &#x60;variable&#x60;. This field is provided directly from the loan servicer and does not have an enumerated set of possible values.
   * @return loanTypeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Description of the type of loan, for example `conventional`, `fixed`, or `variable`. This field is provided directly from the loan servicer and does not have an enumerated set of possible values.")

  public String getLoanTypeDescription() {
    return loanTypeDescription;
  }


  public void setLoanTypeDescription(String loanTypeDescription) {
    this.loanTypeDescription = loanTypeDescription;
  }


  public MortgageLiability loanTerm(String loanTerm) {
    
    this.loanTerm = loanTerm;
    return this;
  }

   /**
   * Full duration of mortgage as at origination (e.g. &#x60;10 year&#x60;).
   * @return loanTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Full duration of mortgage as at origination (e.g. `10 year`).")

  public String getLoanTerm() {
    return loanTerm;
  }


  public void setLoanTerm(String loanTerm) {
    this.loanTerm = loanTerm;
  }


  public MortgageLiability maturityDate(LocalDate maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Original date on which mortgage is due in full. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Original date on which mortgage is due in full. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }


  public MortgageLiability nextMonthlyPayment(BigDecimal nextMonthlyPayment) {
    
    this.nextMonthlyPayment = nextMonthlyPayment;
    return this;
  }

   /**
   * The amount of the next payment.
   * @return nextMonthlyPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the next payment.")

  public BigDecimal getNextMonthlyPayment() {
    return nextMonthlyPayment;
  }


  public void setNextMonthlyPayment(BigDecimal nextMonthlyPayment) {
    this.nextMonthlyPayment = nextMonthlyPayment;
  }


  public MortgageLiability nextPaymentDueDate(LocalDate nextPaymentDueDate) {
    
    this.nextPaymentDueDate = nextPaymentDueDate;
    return this;
  }

   /**
   * The due date for the next payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return nextPaymentDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The due date for the next payment. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getNextPaymentDueDate() {
    return nextPaymentDueDate;
  }


  public void setNextPaymentDueDate(LocalDate nextPaymentDueDate) {
    this.nextPaymentDueDate = nextPaymentDueDate;
  }


  public MortgageLiability originationDate(LocalDate originationDate) {
    
    this.originationDate = originationDate;
    return this;
  }

   /**
   * The date on which the loan was initially lent. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).
   * @return originationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the loan was initially lent. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).")

  public LocalDate getOriginationDate() {
    return originationDate;
  }


  public void setOriginationDate(LocalDate originationDate) {
    this.originationDate = originationDate;
  }


  public MortgageLiability originationPrincipalAmount(BigDecimal originationPrincipalAmount) {
    
    this.originationPrincipalAmount = originationPrincipalAmount;
    return this;
  }

   /**
   * The original principal balance of the mortgage.
   * @return originationPrincipalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original principal balance of the mortgage.")

  public BigDecimal getOriginationPrincipalAmount() {
    return originationPrincipalAmount;
  }


  public void setOriginationPrincipalAmount(BigDecimal originationPrincipalAmount) {
    this.originationPrincipalAmount = originationPrincipalAmount;
  }


  public MortgageLiability pastDueAmount(BigDecimal pastDueAmount) {
    
    this.pastDueAmount = pastDueAmount;
    return this;
  }

   /**
   * Amount of loan (principal + interest) past due for payment.
   * @return pastDueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Amount of loan (principal + interest) past due for payment.")

  public BigDecimal getPastDueAmount() {
    return pastDueAmount;
  }


  public void setPastDueAmount(BigDecimal pastDueAmount) {
    this.pastDueAmount = pastDueAmount;
  }


  public MortgageLiability propertyAddress(MortgagePropertyAddress propertyAddress) {
    
    this.propertyAddress = propertyAddress;
    return this;
  }

   /**
   * Get propertyAddress
   * @return propertyAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MortgagePropertyAddress getPropertyAddress() {
    return propertyAddress;
  }


  public void setPropertyAddress(MortgagePropertyAddress propertyAddress) {
    this.propertyAddress = propertyAddress;
  }


  public MortgageLiability ytdInterestPaid(BigDecimal ytdInterestPaid) {
    
    this.ytdInterestPaid = ytdInterestPaid;
    return this;
  }

   /**
   * The year to date (YTD) interest paid.
   * @return ytdInterestPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year to date (YTD) interest paid.")

  public BigDecimal getYtdInterestPaid() {
    return ytdInterestPaid;
  }


  public void setYtdInterestPaid(BigDecimal ytdInterestPaid) {
    this.ytdInterestPaid = ytdInterestPaid;
  }


  public MortgageLiability ytdPrincipalPaid(BigDecimal ytdPrincipalPaid) {
    
    this.ytdPrincipalPaid = ytdPrincipalPaid;
    return this;
  }

   /**
   * The YTD principal paid.
   * @return ytdPrincipalPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The YTD principal paid.")

  public BigDecimal getYtdPrincipalPaid() {
    return ytdPrincipalPaid;
  }


  public void setYtdPrincipalPaid(BigDecimal ytdPrincipalPaid) {
    this.ytdPrincipalPaid = ytdPrincipalPaid;
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
  public MortgageLiability putAdditionalProperty(String key, Object value) {
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
    MortgageLiability mortgageLiability = (MortgageLiability) o;
    return Objects.equals(this.accountId, mortgageLiability.accountId) &&
        Objects.equals(this.accountNumber, mortgageLiability.accountNumber) &&
        Objects.equals(this.currentLateFee, mortgageLiability.currentLateFee) &&
        Objects.equals(this.escrowBalance, mortgageLiability.escrowBalance) &&
        Objects.equals(this.hasPmi, mortgageLiability.hasPmi) &&
        Objects.equals(this.hasPrepaymentPenalty, mortgageLiability.hasPrepaymentPenalty) &&
        Objects.equals(this.interestRate, mortgageLiability.interestRate) &&
        Objects.equals(this.lastPaymentAmount, mortgageLiability.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, mortgageLiability.lastPaymentDate) &&
        Objects.equals(this.loanTypeDescription, mortgageLiability.loanTypeDescription) &&
        Objects.equals(this.loanTerm, mortgageLiability.loanTerm) &&
        Objects.equals(this.maturityDate, mortgageLiability.maturityDate) &&
        Objects.equals(this.nextMonthlyPayment, mortgageLiability.nextMonthlyPayment) &&
        Objects.equals(this.nextPaymentDueDate, mortgageLiability.nextPaymentDueDate) &&
        Objects.equals(this.originationDate, mortgageLiability.originationDate) &&
        Objects.equals(this.originationPrincipalAmount, mortgageLiability.originationPrincipalAmount) &&
        Objects.equals(this.pastDueAmount, mortgageLiability.pastDueAmount) &&
        Objects.equals(this.propertyAddress, mortgageLiability.propertyAddress) &&
        Objects.equals(this.ytdInterestPaid, mortgageLiability.ytdInterestPaid) &&
        Objects.equals(this.ytdPrincipalPaid, mortgageLiability.ytdPrincipalPaid)&&
        Objects.equals(this.additionalProperties, mortgageLiability.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, currentLateFee, escrowBalance, hasPmi, hasPrepaymentPenalty, interestRate, lastPaymentAmount, lastPaymentDate, loanTypeDescription, loanTerm, maturityDate, nextMonthlyPayment, nextPaymentDueDate, originationDate, originationPrincipalAmount, pastDueAmount, propertyAddress, ytdInterestPaid, ytdPrincipalPaid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageLiability {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    currentLateFee: ").append(toIndentedString(currentLateFee)).append("\n");
    sb.append("    escrowBalance: ").append(toIndentedString(escrowBalance)).append("\n");
    sb.append("    hasPmi: ").append(toIndentedString(hasPmi)).append("\n");
    sb.append("    hasPrepaymentPenalty: ").append(toIndentedString(hasPrepaymentPenalty)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    loanTypeDescription: ").append(toIndentedString(loanTypeDescription)).append("\n");
    sb.append("    loanTerm: ").append(toIndentedString(loanTerm)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    nextMonthlyPayment: ").append(toIndentedString(nextMonthlyPayment)).append("\n");
    sb.append("    nextPaymentDueDate: ").append(toIndentedString(nextPaymentDueDate)).append("\n");
    sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
    sb.append("    originationPrincipalAmount: ").append(toIndentedString(originationPrincipalAmount)).append("\n");
    sb.append("    pastDueAmount: ").append(toIndentedString(pastDueAmount)).append("\n");
    sb.append("    propertyAddress: ").append(toIndentedString(propertyAddress)).append("\n");
    sb.append("    ytdInterestPaid: ").append(toIndentedString(ytdInterestPaid)).append("\n");
    sb.append("    ytdPrincipalPaid: ").append(toIndentedString(ytdPrincipalPaid)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_number");
    openapiFields.add("current_late_fee");
    openapiFields.add("escrow_balance");
    openapiFields.add("has_pmi");
    openapiFields.add("has_prepayment_penalty");
    openapiFields.add("interest_rate");
    openapiFields.add("last_payment_amount");
    openapiFields.add("last_payment_date");
    openapiFields.add("loan_type_description");
    openapiFields.add("loan_term");
    openapiFields.add("maturity_date");
    openapiFields.add("next_monthly_payment");
    openapiFields.add("next_payment_due_date");
    openapiFields.add("origination_date");
    openapiFields.add("origination_principal_amount");
    openapiFields.add("past_due_amount");
    openapiFields.add("property_address");
    openapiFields.add("ytd_interest_paid");
    openapiFields.add("ytd_principal_paid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_number");
    openapiRequiredFields.add("current_late_fee");
    openapiRequiredFields.add("escrow_balance");
    openapiRequiredFields.add("has_pmi");
    openapiRequiredFields.add("has_prepayment_penalty");
    openapiRequiredFields.add("interest_rate");
    openapiRequiredFields.add("last_payment_amount");
    openapiRequiredFields.add("last_payment_date");
    openapiRequiredFields.add("loan_type_description");
    openapiRequiredFields.add("loan_term");
    openapiRequiredFields.add("maturity_date");
    openapiRequiredFields.add("next_monthly_payment");
    openapiRequiredFields.add("next_payment_due_date");
    openapiRequiredFields.add("origination_date");
    openapiRequiredFields.add("origination_principal_amount");
    openapiRequiredFields.add("past_due_amount");
    openapiRequiredFields.add("property_address");
    openapiRequiredFields.add("ytd_interest_paid");
    openapiRequiredFields.add("ytd_principal_paid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MortgageLiability
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MortgageLiability.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MortgageLiability is not found in the empty JSON string", MortgageLiability.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MortgageLiability.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if (jsonObj.get("loan_type_description") != null && !jsonObj.get("loan_type_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loan_type_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loan_type_description").toString()));
      }
      if (jsonObj.get("loan_term") != null && !jsonObj.get("loan_term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loan_term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loan_term").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MortgageLiability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MortgageLiability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MortgageLiability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MortgageLiability.class));

       return (TypeAdapter<T>) new TypeAdapter<MortgageLiability>() {
           @Override
           public void write(JsonWriter out, MortgageLiability value) throws IOException {
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
           public MortgageLiability read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MortgageLiability instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MortgageLiability given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MortgageLiability
  * @throws IOException if the JSON string is invalid with respect to MortgageLiability
  */
  public static MortgageLiability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MortgageLiability.class);
  }

 /**
  * Convert an instance of MortgageLiability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

