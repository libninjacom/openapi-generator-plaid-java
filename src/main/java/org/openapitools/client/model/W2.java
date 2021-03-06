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
import org.openapitools.client.model.Employee;
import org.openapitools.client.model.PaystubEmployer;
import org.openapitools.client.model.W2Box12;
import org.openapitools.client.model.W2StateAndLocalWages;
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
 * W2 is an object that represents income data taken from a W2 tax document.
 */
@ApiModel(description = "W2 is an object that represents income data taken from a W2 tax document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-13T10:01:14.758140-04:00[America/New_York]")
public class W2 {
  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private PaystubEmployer employer;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private Employee employee;

  public static final String SERIALIZED_NAME_TAX_YEAR = "tax_year";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private String taxYear;

  public static final String SERIALIZED_NAME_EMPLOYER_ID_NUMBER = "employer_id_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_ID_NUMBER)
  private String employerIdNumber;

  public static final String SERIALIZED_NAME_WAGES_TIPS_OTHER_COMP = "wages_tips_other_comp";
  @SerializedName(SERIALIZED_NAME_WAGES_TIPS_OTHER_COMP)
  private String wagesTipsOtherComp;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federal_income_tax_withheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private String federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_WAGES = "social_security_wages";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_WAGES)
  private String socialSecurityWages;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD = "social_security_tax_withheld";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD)
  private String socialSecurityTaxWithheld;

  public static final String SERIALIZED_NAME_MEDICARE_WAGES_AND_TIPS = "medicare_wages_and_tips";
  @SerializedName(SERIALIZED_NAME_MEDICARE_WAGES_AND_TIPS)
  private String medicareWagesAndTips;

  public static final String SERIALIZED_NAME_MEDICARE_TAX_WITHHELD = "medicare_tax_withheld";
  @SerializedName(SERIALIZED_NAME_MEDICARE_TAX_WITHHELD)
  private String medicareTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TIPS = "social_security_tips";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TIPS)
  private String socialSecurityTips;

  public static final String SERIALIZED_NAME_ALLOCATED_TIPS = "allocated_tips";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_TIPS)
  private String allocatedTips;

  public static final String SERIALIZED_NAME_BOX9 = "box_9";
  @SerializedName(SERIALIZED_NAME_BOX9)
  private String box9;

  public static final String SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS = "dependent_care_benefits";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS)
  private String dependentCareBenefits;

  public static final String SERIALIZED_NAME_NONQUALIFIED_PLANS = "nonqualified_plans";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_PLANS)
  private String nonqualifiedPlans;

  public static final String SERIALIZED_NAME_BOX12 = "box_12";
  @SerializedName(SERIALIZED_NAME_BOX12)
  private List<W2Box12> box12 = null;

  public static final String SERIALIZED_NAME_STATUTORY_EMPLOYEE = "statutory_employee";
  @SerializedName(SERIALIZED_NAME_STATUTORY_EMPLOYEE)
  private String statutoryEmployee;

  public static final String SERIALIZED_NAME_RETIREMENT_PLAN = "retirement_plan";
  @SerializedName(SERIALIZED_NAME_RETIREMENT_PLAN)
  private String retirementPlan;

  public static final String SERIALIZED_NAME_THIRD_PARTY_SICK_PAY = "third_party_sick_pay";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_SICK_PAY)
  private String thirdPartySickPay;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WAGES = "state_and_local_wages";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WAGES)
  private List<W2StateAndLocalWages> stateAndLocalWages = null;

  public W2() { 
  }

  public W2 employer(PaystubEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(PaystubEmployer employer) {
    this.employer = employer;
  }


  public W2 employee(Employee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Employee getEmployee() {
    return employee;
  }


  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  public W2 taxYear(String taxYear) {
    
    this.taxYear = taxYear;
    return this;
  }

   /**
   * The tax year of the W2 document.
   * @return taxYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax year of the W2 document.")

  public String getTaxYear() {
    return taxYear;
  }


  public void setTaxYear(String taxYear) {
    this.taxYear = taxYear;
  }


  public W2 employerIdNumber(String employerIdNumber) {
    
    this.employerIdNumber = employerIdNumber;
    return this;
  }

   /**
   * An employee identification number or EIN.
   * @return employerIdNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An employee identification number or EIN.")

  public String getEmployerIdNumber() {
    return employerIdNumber;
  }


  public void setEmployerIdNumber(String employerIdNumber) {
    this.employerIdNumber = employerIdNumber;
  }


  public W2 wagesTipsOtherComp(String wagesTipsOtherComp) {
    
    this.wagesTipsOtherComp = wagesTipsOtherComp;
    return this;
  }

   /**
   * Wages from tips and other compensation.
   * @return wagesTipsOtherComp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wages from tips and other compensation.")

  public String getWagesTipsOtherComp() {
    return wagesTipsOtherComp;
  }


  public void setWagesTipsOtherComp(String wagesTipsOtherComp) {
    this.wagesTipsOtherComp = wagesTipsOtherComp;
  }


  public W2 federalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

   /**
   * Federal income tax withheld for the tax year.
   * @return federalIncomeTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Federal income tax withheld for the tax year.")

  public String getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }


  public void setFederalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public W2 socialSecurityWages(String socialSecurityWages) {
    
    this.socialSecurityWages = socialSecurityWages;
    return this;
  }

   /**
   * Wages from social security.
   * @return socialSecurityWages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wages from social security.")

  public String getSocialSecurityWages() {
    return socialSecurityWages;
  }


  public void setSocialSecurityWages(String socialSecurityWages) {
    this.socialSecurityWages = socialSecurityWages;
  }


  public W2 socialSecurityTaxWithheld(String socialSecurityTaxWithheld) {
    
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
    return this;
  }

   /**
   * Social security tax withheld for the tax year.
   * @return socialSecurityTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Social security tax withheld for the tax year.")

  public String getSocialSecurityTaxWithheld() {
    return socialSecurityTaxWithheld;
  }


  public void setSocialSecurityTaxWithheld(String socialSecurityTaxWithheld) {
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
  }


  public W2 medicareWagesAndTips(String medicareWagesAndTips) {
    
    this.medicareWagesAndTips = medicareWagesAndTips;
    return this;
  }

   /**
   * Wages and tips from medicare.
   * @return medicareWagesAndTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Wages and tips from medicare.")

  public String getMedicareWagesAndTips() {
    return medicareWagesAndTips;
  }


  public void setMedicareWagesAndTips(String medicareWagesAndTips) {
    this.medicareWagesAndTips = medicareWagesAndTips;
  }


  public W2 medicareTaxWithheld(String medicareTaxWithheld) {
    
    this.medicareTaxWithheld = medicareTaxWithheld;
    return this;
  }

   /**
   * Medicare tax withheld for the tax year.
   * @return medicareTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Medicare tax withheld for the tax year.")

  public String getMedicareTaxWithheld() {
    return medicareTaxWithheld;
  }


  public void setMedicareTaxWithheld(String medicareTaxWithheld) {
    this.medicareTaxWithheld = medicareTaxWithheld;
  }


  public W2 socialSecurityTips(String socialSecurityTips) {
    
    this.socialSecurityTips = socialSecurityTips;
    return this;
  }

   /**
   * Tips from social security.
   * @return socialSecurityTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tips from social security.")

  public String getSocialSecurityTips() {
    return socialSecurityTips;
  }


  public void setSocialSecurityTips(String socialSecurityTips) {
    this.socialSecurityTips = socialSecurityTips;
  }


  public W2 allocatedTips(String allocatedTips) {
    
    this.allocatedTips = allocatedTips;
    return this;
  }

   /**
   * Allocated tips.
   * @return allocatedTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocated tips.")

  public String getAllocatedTips() {
    return allocatedTips;
  }


  public void setAllocatedTips(String allocatedTips) {
    this.allocatedTips = allocatedTips;
  }


  public W2 box9(String box9) {
    
    this.box9 = box9;
    return this;
  }

   /**
   * Contents from box 9 on the W2.
   * @return box9
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents from box 9 on the W2.")

  public String getBox9() {
    return box9;
  }


  public void setBox9(String box9) {
    this.box9 = box9;
  }


  public W2 dependentCareBenefits(String dependentCareBenefits) {
    
    this.dependentCareBenefits = dependentCareBenefits;
    return this;
  }

   /**
   * Dependent care benefits.
   * @return dependentCareBenefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dependent care benefits.")

  public String getDependentCareBenefits() {
    return dependentCareBenefits;
  }


  public void setDependentCareBenefits(String dependentCareBenefits) {
    this.dependentCareBenefits = dependentCareBenefits;
  }


  public W2 nonqualifiedPlans(String nonqualifiedPlans) {
    
    this.nonqualifiedPlans = nonqualifiedPlans;
    return this;
  }

   /**
   * Nonqualified plans.
   * @return nonqualifiedPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nonqualified plans.")

  public String getNonqualifiedPlans() {
    return nonqualifiedPlans;
  }


  public void setNonqualifiedPlans(String nonqualifiedPlans) {
    this.nonqualifiedPlans = nonqualifiedPlans;
  }


  public W2 box12(List<W2Box12> box12) {
    
    this.box12 = box12;
    return this;
  }

  public W2 addBox12Item(W2Box12 box12Item) {
    if (this.box12 == null) {
      this.box12 = new ArrayList<>();
    }
    this.box12.add(box12Item);
    return this;
  }

   /**
   * Get box12
   * @return box12
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<W2Box12> getBox12() {
    return box12;
  }


  public void setBox12(List<W2Box12> box12) {
    this.box12 = box12;
  }


  public W2 statutoryEmployee(String statutoryEmployee) {
    
    this.statutoryEmployee = statutoryEmployee;
    return this;
  }

   /**
   * Statutory employee.
   * @return statutoryEmployee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Statutory employee.")

  public String getStatutoryEmployee() {
    return statutoryEmployee;
  }


  public void setStatutoryEmployee(String statutoryEmployee) {
    this.statutoryEmployee = statutoryEmployee;
  }


  public W2 retirementPlan(String retirementPlan) {
    
    this.retirementPlan = retirementPlan;
    return this;
  }

   /**
   * Retirement plan.
   * @return retirementPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Retirement plan.")

  public String getRetirementPlan() {
    return retirementPlan;
  }


  public void setRetirementPlan(String retirementPlan) {
    this.retirementPlan = retirementPlan;
  }


  public W2 thirdPartySickPay(String thirdPartySickPay) {
    
    this.thirdPartySickPay = thirdPartySickPay;
    return this;
  }

   /**
   * Third party sick pay.
   * @return thirdPartySickPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Third party sick pay.")

  public String getThirdPartySickPay() {
    return thirdPartySickPay;
  }


  public void setThirdPartySickPay(String thirdPartySickPay) {
    this.thirdPartySickPay = thirdPartySickPay;
  }


  public W2 other(String other) {
    
    this.other = other;
    return this;
  }

   /**
   * Other.
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other.")

  public String getOther() {
    return other;
  }


  public void setOther(String other) {
    this.other = other;
  }


  public W2 stateAndLocalWages(List<W2StateAndLocalWages> stateAndLocalWages) {
    
    this.stateAndLocalWages = stateAndLocalWages;
    return this;
  }

  public W2 addStateAndLocalWagesItem(W2StateAndLocalWages stateAndLocalWagesItem) {
    if (this.stateAndLocalWages == null) {
      this.stateAndLocalWages = new ArrayList<>();
    }
    this.stateAndLocalWages.add(stateAndLocalWagesItem);
    return this;
  }

   /**
   * Get stateAndLocalWages
   * @return stateAndLocalWages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<W2StateAndLocalWages> getStateAndLocalWages() {
    return stateAndLocalWages;
  }


  public void setStateAndLocalWages(List<W2StateAndLocalWages> stateAndLocalWages) {
    this.stateAndLocalWages = stateAndLocalWages;
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
  public W2 putAdditionalProperty(String key, Object value) {
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
    W2 W2 = (W2) o;
    return Objects.equals(this.employer, W2.employer) &&
        Objects.equals(this.employee, W2.employee) &&
        Objects.equals(this.taxYear, W2.taxYear) &&
        Objects.equals(this.employerIdNumber, W2.employerIdNumber) &&
        Objects.equals(this.wagesTipsOtherComp, W2.wagesTipsOtherComp) &&
        Objects.equals(this.federalIncomeTaxWithheld, W2.federalIncomeTaxWithheld) &&
        Objects.equals(this.socialSecurityWages, W2.socialSecurityWages) &&
        Objects.equals(this.socialSecurityTaxWithheld, W2.socialSecurityTaxWithheld) &&
        Objects.equals(this.medicareWagesAndTips, W2.medicareWagesAndTips) &&
        Objects.equals(this.medicareTaxWithheld, W2.medicareTaxWithheld) &&
        Objects.equals(this.socialSecurityTips, W2.socialSecurityTips) &&
        Objects.equals(this.allocatedTips, W2.allocatedTips) &&
        Objects.equals(this.box9, W2.box9) &&
        Objects.equals(this.dependentCareBenefits, W2.dependentCareBenefits) &&
        Objects.equals(this.nonqualifiedPlans, W2.nonqualifiedPlans) &&
        Objects.equals(this.box12, W2.box12) &&
        Objects.equals(this.statutoryEmployee, W2.statutoryEmployee) &&
        Objects.equals(this.retirementPlan, W2.retirementPlan) &&
        Objects.equals(this.thirdPartySickPay, W2.thirdPartySickPay) &&
        Objects.equals(this.other, W2.other) &&
        Objects.equals(this.stateAndLocalWages, W2.stateAndLocalWages)&&
        Objects.equals(this.additionalProperties, W2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, employee, taxYear, employerIdNumber, wagesTipsOtherComp, federalIncomeTaxWithheld, socialSecurityWages, socialSecurityTaxWithheld, medicareWagesAndTips, medicareTaxWithheld, socialSecurityTips, allocatedTips, box9, dependentCareBenefits, nonqualifiedPlans, box12, statutoryEmployee, retirementPlan, thirdPartySickPay, other, stateAndLocalWages, additionalProperties);
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
    sb.append("class W2 {\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    employerIdNumber: ").append(toIndentedString(employerIdNumber)).append("\n");
    sb.append("    wagesTipsOtherComp: ").append(toIndentedString(wagesTipsOtherComp)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    socialSecurityWages: ").append(toIndentedString(socialSecurityWages)).append("\n");
    sb.append("    socialSecurityTaxWithheld: ").append(toIndentedString(socialSecurityTaxWithheld)).append("\n");
    sb.append("    medicareWagesAndTips: ").append(toIndentedString(medicareWagesAndTips)).append("\n");
    sb.append("    medicareTaxWithheld: ").append(toIndentedString(medicareTaxWithheld)).append("\n");
    sb.append("    socialSecurityTips: ").append(toIndentedString(socialSecurityTips)).append("\n");
    sb.append("    allocatedTips: ").append(toIndentedString(allocatedTips)).append("\n");
    sb.append("    box9: ").append(toIndentedString(box9)).append("\n");
    sb.append("    dependentCareBenefits: ").append(toIndentedString(dependentCareBenefits)).append("\n");
    sb.append("    nonqualifiedPlans: ").append(toIndentedString(nonqualifiedPlans)).append("\n");
    sb.append("    box12: ").append(toIndentedString(box12)).append("\n");
    sb.append("    statutoryEmployee: ").append(toIndentedString(statutoryEmployee)).append("\n");
    sb.append("    retirementPlan: ").append(toIndentedString(retirementPlan)).append("\n");
    sb.append("    thirdPartySickPay: ").append(toIndentedString(thirdPartySickPay)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    stateAndLocalWages: ").append(toIndentedString(stateAndLocalWages)).append("\n");
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
    openapiFields.add("employer");
    openapiFields.add("employee");
    openapiFields.add("tax_year");
    openapiFields.add("employer_id_number");
    openapiFields.add("wages_tips_other_comp");
    openapiFields.add("federal_income_tax_withheld");
    openapiFields.add("social_security_wages");
    openapiFields.add("social_security_tax_withheld");
    openapiFields.add("medicare_wages_and_tips");
    openapiFields.add("medicare_tax_withheld");
    openapiFields.add("social_security_tips");
    openapiFields.add("allocated_tips");
    openapiFields.add("box_9");
    openapiFields.add("dependent_care_benefits");
    openapiFields.add("nonqualified_plans");
    openapiFields.add("box_12");
    openapiFields.add("statutory_employee");
    openapiFields.add("retirement_plan");
    openapiFields.add("third_party_sick_pay");
    openapiFields.add("other");
    openapiFields.add("state_and_local_wages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to W2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (W2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in W2 is not found in the empty JSON string", W2.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("tax_year") != null && !jsonObj.get("tax_year").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_year").toString()));
      }
      if (jsonObj.get("employer_id_number") != null && !jsonObj.get("employer_id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_id_number").toString()));
      }
      if (jsonObj.get("wages_tips_other_comp") != null && !jsonObj.get("wages_tips_other_comp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wages_tips_other_comp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wages_tips_other_comp").toString()));
      }
      if (jsonObj.get("federal_income_tax_withheld") != null && !jsonObj.get("federal_income_tax_withheld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `federal_income_tax_withheld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("federal_income_tax_withheld").toString()));
      }
      if (jsonObj.get("social_security_wages") != null && !jsonObj.get("social_security_wages").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `social_security_wages` to be a primitive type in the JSON string but got `%s`", jsonObj.get("social_security_wages").toString()));
      }
      if (jsonObj.get("social_security_tax_withheld") != null && !jsonObj.get("social_security_tax_withheld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `social_security_tax_withheld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("social_security_tax_withheld").toString()));
      }
      if (jsonObj.get("medicare_wages_and_tips") != null && !jsonObj.get("medicare_wages_and_tips").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `medicare_wages_and_tips` to be a primitive type in the JSON string but got `%s`", jsonObj.get("medicare_wages_and_tips").toString()));
      }
      if (jsonObj.get("medicare_tax_withheld") != null && !jsonObj.get("medicare_tax_withheld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `medicare_tax_withheld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("medicare_tax_withheld").toString()));
      }
      if (jsonObj.get("social_security_tips") != null && !jsonObj.get("social_security_tips").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `social_security_tips` to be a primitive type in the JSON string but got `%s`", jsonObj.get("social_security_tips").toString()));
      }
      if (jsonObj.get("allocated_tips") != null && !jsonObj.get("allocated_tips").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocated_tips` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocated_tips").toString()));
      }
      if (jsonObj.get("box_9") != null && !jsonObj.get("box_9").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_9` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box_9").toString()));
      }
      if (jsonObj.get("dependent_care_benefits") != null && !jsonObj.get("dependent_care_benefits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependent_care_benefits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependent_care_benefits").toString()));
      }
      if (jsonObj.get("nonqualified_plans") != null && !jsonObj.get("nonqualified_plans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonqualified_plans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonqualified_plans").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("box_12") != null && !jsonObj.get("box_12").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `box_12` to be an array in the JSON string but got `%s`", jsonObj.get("box_12").toString()));
      }
      if (jsonObj.get("statutory_employee") != null && !jsonObj.get("statutory_employee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statutory_employee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statutory_employee").toString()));
      }
      if (jsonObj.get("retirement_plan") != null && !jsonObj.get("retirement_plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retirement_plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retirement_plan").toString()));
      }
      if (jsonObj.get("third_party_sick_pay") != null && !jsonObj.get("third_party_sick_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `third_party_sick_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("third_party_sick_pay").toString()));
      }
      if (jsonObj.get("other") != null && !jsonObj.get("other").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("state_and_local_wages") != null && !jsonObj.get("state_and_local_wages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_and_local_wages` to be an array in the JSON string but got `%s`", jsonObj.get("state_and_local_wages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W2.class));

       return (TypeAdapter<T>) new TypeAdapter<W2>() {
           @Override
           public void write(JsonWriter out, W2 value) throws IOException {
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
           public W2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             W2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of W2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of W2
  * @throws IOException if the JSON string is invalid with respect to W2
  */
  public static W2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W2.class);
  }

 /**
  * Convert an instance of W2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

