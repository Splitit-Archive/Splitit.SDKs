/*
 * splitit-web-api-public-sdk
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.splitit.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.splitit.sdk.model.CardBrand;
import com.splitit.sdk.model.CardType;
import com.splitit.sdk.model.ExtendedCurrency;
import com.splitit.sdk.model.PaymentFormMessage;
import com.splitit.sdk.model.PaymentWizardData;
import com.splitit.sdk.model.TermsAndConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PaymentWizardDataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-25T08:42:14.391Z")
public class PaymentWizardDataResponse  {
  @SerializedName("RequestedNumberOfInstallments")
  private String requestedNumberOfInstallments = null;

  @SerializedName("SuccessExitURL")
  private String successExitURL = null;

  @SerializedName("ErrorExitURL")
  private String errorExitURL = null;

  @SerializedName("CancelExitURL")
  private String cancelExitURL = null;

  @SerializedName("SuccessAsyncUrl")
  private String successAsyncUrl = null;

  @SerializedName("ViewName")
  private String viewName = null;

  @SerializedName("IsOpenedInIframe")
  private Boolean isOpenedInIframe = null;

  @SerializedName("PaymentFormMessage")
  private String paymentFormMessage = null;

  @SerializedName("ShowAddressElements")
  private String showAddressElements = null;

  @SerializedName("CurrencyDisplay")
  private ExtendedCurrency currencyDisplay = null;

  @SerializedName("ForceDisplayImportantNotes")
  private Boolean forceDisplayImportantNotes = null;

  @SerializedName("ShowShopperDetailsExpendedOnStart")
  private Boolean showShopperDetailsExpendedOnStart = null;

  @SerializedName("ShowPaymentScheduleRequiredCredit")
  private Boolean showPaymentScheduleRequiredCredit = null;

  @SerializedName("IsShopperEmailMandatory")
  private Boolean isShopperEmailMandatory = null;

  @SerializedName("IsShopperPhoneMandatory")
  private Boolean isShopperPhoneMandatory = null;

  @SerializedName("NumberOfInstallmentsSelectionsOption")
  private String numberOfInstallmentsSelectionsOption = null;

  @SerializedName("AddressIsReadonly")
  private Boolean addressIsReadonly = null;

  @SerializedName("PhoneIsReadOnly")
  private Boolean phoneIsReadOnly = null;

  @SerializedName("EmailIsReadOnly")
  private Boolean emailIsReadOnly = null;

  @SerializedName("ShowLearnMore")
  private Boolean showLearnMore = null;

  @SerializedName("ShowMobilePhone")
  private Boolean showMobilePhone = null;

  @SerializedName("LogoURL")
  private String logoURL = null;

  @SerializedName("PrivacyPolicyUrl")
  private String privacyPolicyUrl = null;

  @SerializedName("TermsAndConditionsUrl")
  private String termsAndConditionsUrl = null;

  @SerializedName("LearnMoreUrl")
  private String learnMoreUrl = null;

  @SerializedName("PotentialCardTypes")
  private List<CardType> potentialCardTypes = null;

  @SerializedName("PotentialCardBrands")
  private List<CardBrand> potentialCardBrands = null;

  @SerializedName("PaymentFormMessages")
  private List<PaymentFormMessage> paymentFormMessages = null;

  @SerializedName("DisplayProperties")
  private Map<String, String> displayProperties = null;

  @SerializedName("TermsAndConditions")
  private TermsAndConditions termsAndConditions = null;

  public PaymentWizardDataResponse requestedNumberOfInstallments(String requestedNumberOfInstallments) {
    this.requestedNumberOfInstallments = requestedNumberOfInstallments;
    return this;
  }

   /**
   * Get requestedNumberOfInstallments
   * @return requestedNumberOfInstallments
  **/
  @ApiModelProperty(value = "")
  public String getRequestedNumberOfInstallments() {
    return requestedNumberOfInstallments;
  }

  public void setRequestedNumberOfInstallments(String requestedNumberOfInstallments) {
    this.requestedNumberOfInstallments = requestedNumberOfInstallments;
  }

  public PaymentWizardDataResponse successExitURL(String successExitURL) {
    this.successExitURL = successExitURL;
    return this;
  }

   /**
   * Get successExitURL
   * @return successExitURL
  **/
  @ApiModelProperty(value = "")
  public String getSuccessExitURL() {
    return successExitURL;
  }

  public void setSuccessExitURL(String successExitURL) {
    this.successExitURL = successExitURL;
  }

  public PaymentWizardDataResponse errorExitURL(String errorExitURL) {
    this.errorExitURL = errorExitURL;
    return this;
  }

   /**
   * Get errorExitURL
   * @return errorExitURL
  **/
  @ApiModelProperty(value = "")
  public String getErrorExitURL() {
    return errorExitURL;
  }

  public void setErrorExitURL(String errorExitURL) {
    this.errorExitURL = errorExitURL;
  }

  public PaymentWizardDataResponse cancelExitURL(String cancelExitURL) {
    this.cancelExitURL = cancelExitURL;
    return this;
  }

   /**
   * Get cancelExitURL
   * @return cancelExitURL
  **/
  @ApiModelProperty(value = "")
  public String getCancelExitURL() {
    return cancelExitURL;
  }

  public void setCancelExitURL(String cancelExitURL) {
    this.cancelExitURL = cancelExitURL;
  }

  public PaymentWizardDataResponse successAsyncUrl(String successAsyncUrl) {
    this.successAsyncUrl = successAsyncUrl;
    return this;
  }

   /**
   * Get successAsyncUrl
   * @return successAsyncUrl
  **/
  @ApiModelProperty(value = "")
  public String getSuccessAsyncUrl() {
    return successAsyncUrl;
  }

  public void setSuccessAsyncUrl(String successAsyncUrl) {
    this.successAsyncUrl = successAsyncUrl;
  }

  public PaymentWizardDataResponse viewName(String viewName) {
    this.viewName = viewName;
    return this;
  }

   /**
   * Get viewName
   * @return viewName
  **/
  @ApiModelProperty(value = "")
  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  public PaymentWizardDataResponse isOpenedInIframe(Boolean isOpenedInIframe) {
    this.isOpenedInIframe = isOpenedInIframe;
    return this;
  }

   /**
   * Get isOpenedInIframe
   * @return isOpenedInIframe
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsOpenedInIframe() {
    return isOpenedInIframe;
  }

  public void setIsOpenedInIframe(Boolean isOpenedInIframe) {
    this.isOpenedInIframe = isOpenedInIframe;
  }

  public PaymentWizardDataResponse paymentFormMessage(String paymentFormMessage) {
    this.paymentFormMessage = paymentFormMessage;
    return this;
  }

   /**
   * Get paymentFormMessage
   * @return paymentFormMessage
  **/
  @ApiModelProperty(value = "")
  public String getPaymentFormMessage() {
    return paymentFormMessage;
  }

  public void setPaymentFormMessage(String paymentFormMessage) {
    this.paymentFormMessage = paymentFormMessage;
  }

  public PaymentWizardDataResponse showAddressElements(String showAddressElements) {
    this.showAddressElements = showAddressElements;
    return this;
  }

   /**
   * Get showAddressElements
   * @return showAddressElements
  **/
  @ApiModelProperty(value = "")
  public String getShowAddressElements() {
    return showAddressElements;
  }

  public void setShowAddressElements(String showAddressElements) {
    this.showAddressElements = showAddressElements;
  }

  public PaymentWizardDataResponse currencyDisplay(ExtendedCurrency currencyDisplay) {
    this.currencyDisplay = currencyDisplay;
    return this;
  }

   /**
   * Get currencyDisplay
   * @return currencyDisplay
  **/
  @ApiModelProperty(value = "")
  public ExtendedCurrency getCurrencyDisplay() {
    return currencyDisplay;
  }

  public void setCurrencyDisplay(ExtendedCurrency currencyDisplay) {
    this.currencyDisplay = currencyDisplay;
  }

  public PaymentWizardDataResponse forceDisplayImportantNotes(Boolean forceDisplayImportantNotes) {
    this.forceDisplayImportantNotes = forceDisplayImportantNotes;
    return this;
  }

   /**
   * Get forceDisplayImportantNotes
   * @return forceDisplayImportantNotes
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isForceDisplayImportantNotes() {
    return forceDisplayImportantNotes;
  }

  public void setForceDisplayImportantNotes(Boolean forceDisplayImportantNotes) {
    this.forceDisplayImportantNotes = forceDisplayImportantNotes;
  }

  public PaymentWizardDataResponse showShopperDetailsExpendedOnStart(Boolean showShopperDetailsExpendedOnStart) {
    this.showShopperDetailsExpendedOnStart = showShopperDetailsExpendedOnStart;
    return this;
  }

   /**
   * Get showShopperDetailsExpendedOnStart
   * @return showShopperDetailsExpendedOnStart
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShowShopperDetailsExpendedOnStart() {
    return showShopperDetailsExpendedOnStart;
  }

  public void setShowShopperDetailsExpendedOnStart(Boolean showShopperDetailsExpendedOnStart) {
    this.showShopperDetailsExpendedOnStart = showShopperDetailsExpendedOnStart;
  }

  public PaymentWizardDataResponse showPaymentScheduleRequiredCredit(Boolean showPaymentScheduleRequiredCredit) {
    this.showPaymentScheduleRequiredCredit = showPaymentScheduleRequiredCredit;
    return this;
  }

   /**
   * Get showPaymentScheduleRequiredCredit
   * @return showPaymentScheduleRequiredCredit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShowPaymentScheduleRequiredCredit() {
    return showPaymentScheduleRequiredCredit;
  }

  public void setShowPaymentScheduleRequiredCredit(Boolean showPaymentScheduleRequiredCredit) {
    this.showPaymentScheduleRequiredCredit = showPaymentScheduleRequiredCredit;
  }

  public PaymentWizardDataResponse isShopperEmailMandatory(Boolean isShopperEmailMandatory) {
    this.isShopperEmailMandatory = isShopperEmailMandatory;
    return this;
  }

   /**
   * Get isShopperEmailMandatory
   * @return isShopperEmailMandatory
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsShopperEmailMandatory() {
    return isShopperEmailMandatory;
  }

  public void setIsShopperEmailMandatory(Boolean isShopperEmailMandatory) {
    this.isShopperEmailMandatory = isShopperEmailMandatory;
  }

  public PaymentWizardDataResponse isShopperPhoneMandatory(Boolean isShopperPhoneMandatory) {
    this.isShopperPhoneMandatory = isShopperPhoneMandatory;
    return this;
  }

   /**
   * Get isShopperPhoneMandatory
   * @return isShopperPhoneMandatory
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsShopperPhoneMandatory() {
    return isShopperPhoneMandatory;
  }

  public void setIsShopperPhoneMandatory(Boolean isShopperPhoneMandatory) {
    this.isShopperPhoneMandatory = isShopperPhoneMandatory;
  }

  public PaymentWizardDataResponse numberOfInstallmentsSelectionsOption(String numberOfInstallmentsSelectionsOption) {
    this.numberOfInstallmentsSelectionsOption = numberOfInstallmentsSelectionsOption;
    return this;
  }

   /**
   * Get numberOfInstallmentsSelectionsOption
   * @return numberOfInstallmentsSelectionsOption
  **/
  @ApiModelProperty(value = "")
  public String getNumberOfInstallmentsSelectionsOption() {
    return numberOfInstallmentsSelectionsOption;
  }

  public void setNumberOfInstallmentsSelectionsOption(String numberOfInstallmentsSelectionsOption) {
    this.numberOfInstallmentsSelectionsOption = numberOfInstallmentsSelectionsOption;
  }

  public PaymentWizardDataResponse addressIsReadonly(Boolean addressIsReadonly) {
    this.addressIsReadonly = addressIsReadonly;
    return this;
  }

   /**
   * Get addressIsReadonly
   * @return addressIsReadonly
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAddressIsReadonly() {
    return addressIsReadonly;
  }

  public void setAddressIsReadonly(Boolean addressIsReadonly) {
    this.addressIsReadonly = addressIsReadonly;
  }

  public PaymentWizardDataResponse phoneIsReadOnly(Boolean phoneIsReadOnly) {
    this.phoneIsReadOnly = phoneIsReadOnly;
    return this;
  }

   /**
   * Get phoneIsReadOnly
   * @return phoneIsReadOnly
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isPhoneIsReadOnly() {
    return phoneIsReadOnly;
  }

  public void setPhoneIsReadOnly(Boolean phoneIsReadOnly) {
    this.phoneIsReadOnly = phoneIsReadOnly;
  }

  public PaymentWizardDataResponse emailIsReadOnly(Boolean emailIsReadOnly) {
    this.emailIsReadOnly = emailIsReadOnly;
    return this;
  }

   /**
   * Get emailIsReadOnly
   * @return emailIsReadOnly
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isEmailIsReadOnly() {
    return emailIsReadOnly;
  }

  public void setEmailIsReadOnly(Boolean emailIsReadOnly) {
    this.emailIsReadOnly = emailIsReadOnly;
  }

  public PaymentWizardDataResponse showLearnMore(Boolean showLearnMore) {
    this.showLearnMore = showLearnMore;
    return this;
  }

   /**
   * Get showLearnMore
   * @return showLearnMore
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShowLearnMore() {
    return showLearnMore;
  }

  public void setShowLearnMore(Boolean showLearnMore) {
    this.showLearnMore = showLearnMore;
  }

  public PaymentWizardDataResponse showMobilePhone(Boolean showMobilePhone) {
    this.showMobilePhone = showMobilePhone;
    return this;
  }

   /**
   * Get showMobilePhone
   * @return showMobilePhone
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isShowMobilePhone() {
    return showMobilePhone;
  }

  public void setShowMobilePhone(Boolean showMobilePhone) {
    this.showMobilePhone = showMobilePhone;
  }

  public PaymentWizardDataResponse logoURL(String logoURL) {
    this.logoURL = logoURL;
    return this;
  }

   /**
   * Get logoURL
   * @return logoURL
  **/
  @ApiModelProperty(value = "")
  public String getLogoURL() {
    return logoURL;
  }

  public void setLogoURL(String logoURL) {
    this.logoURL = logoURL;
  }

  public PaymentWizardDataResponse privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @ApiModelProperty(value = "")
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public PaymentWizardDataResponse termsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
    return this;
  }

   /**
   * Get termsAndConditionsUrl
   * @return termsAndConditionsUrl
  **/
  @ApiModelProperty(value = "")
  public String getTermsAndConditionsUrl() {
    return termsAndConditionsUrl;
  }

  public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
  }

  public PaymentWizardDataResponse learnMoreUrl(String learnMoreUrl) {
    this.learnMoreUrl = learnMoreUrl;
    return this;
  }

   /**
   * Get learnMoreUrl
   * @return learnMoreUrl
  **/
  @ApiModelProperty(value = "")
  public String getLearnMoreUrl() {
    return learnMoreUrl;
  }

  public void setLearnMoreUrl(String learnMoreUrl) {
    this.learnMoreUrl = learnMoreUrl;
  }

  public PaymentWizardDataResponse potentialCardTypes(List<CardType> potentialCardTypes) {
    this.potentialCardTypes = potentialCardTypes;
    return this;
  }

  public PaymentWizardDataResponse addPotentialCardTypesItem(CardType potentialCardTypesItem) {
    if (this.potentialCardTypes == null) {
      this.potentialCardTypes = new ArrayList<CardType>();
    }
    this.potentialCardTypes.add(potentialCardTypesItem);
    return this;
  }

   /**
   * Get potentialCardTypes
   * @return potentialCardTypes
  **/
  @ApiModelProperty(value = "")
  public List<CardType> getPotentialCardTypes() {
    return potentialCardTypes;
  }

  public void setPotentialCardTypes(List<CardType> potentialCardTypes) {
    this.potentialCardTypes = potentialCardTypes;
  }

  public PaymentWizardDataResponse potentialCardBrands(List<CardBrand> potentialCardBrands) {
    this.potentialCardBrands = potentialCardBrands;
    return this;
  }

  public PaymentWizardDataResponse addPotentialCardBrandsItem(CardBrand potentialCardBrandsItem) {
    if (this.potentialCardBrands == null) {
      this.potentialCardBrands = new ArrayList<CardBrand>();
    }
    this.potentialCardBrands.add(potentialCardBrandsItem);
    return this;
  }

   /**
   * Get potentialCardBrands
   * @return potentialCardBrands
  **/
  @ApiModelProperty(value = "")
  public List<CardBrand> getPotentialCardBrands() {
    return potentialCardBrands;
  }

  public void setPotentialCardBrands(List<CardBrand> potentialCardBrands) {
    this.potentialCardBrands = potentialCardBrands;
  }

  public PaymentWizardDataResponse paymentFormMessages(List<PaymentFormMessage> paymentFormMessages) {
    this.paymentFormMessages = paymentFormMessages;
    return this;
  }

  public PaymentWizardDataResponse addPaymentFormMessagesItem(PaymentFormMessage paymentFormMessagesItem) {
    if (this.paymentFormMessages == null) {
      this.paymentFormMessages = new ArrayList<PaymentFormMessage>();
    }
    this.paymentFormMessages.add(paymentFormMessagesItem);
    return this;
  }

   /**
   * Get paymentFormMessages
   * @return paymentFormMessages
  **/
  @ApiModelProperty(value = "")
  public List<PaymentFormMessage> getPaymentFormMessages() {
    return paymentFormMessages;
  }

  public void setPaymentFormMessages(List<PaymentFormMessage> paymentFormMessages) {
    this.paymentFormMessages = paymentFormMessages;
  }

  public PaymentWizardDataResponse displayProperties(Map<String, String> displayProperties) {
    this.displayProperties = displayProperties;
    return this;
  }

  public PaymentWizardDataResponse putDisplayPropertiesItem(String key, String displayPropertiesItem) {
    if (this.displayProperties == null) {
      this.displayProperties = new HashMap<String, String>();
    }
    this.displayProperties.put(key, displayPropertiesItem);
    return this;
  }

   /**
   * Get displayProperties
   * @return displayProperties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDisplayProperties() {
    return displayProperties;
  }

  public void setDisplayProperties(Map<String, String> displayProperties) {
    this.displayProperties = displayProperties;
  }

  public PaymentWizardDataResponse termsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

   /**
   * Get termsAndConditions
   * @return termsAndConditions
  **/
  @ApiModelProperty(value = "")
  public TermsAndConditions getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(TermsAndConditions termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentWizardDataResponse paymentWizardDataResponse = (PaymentWizardDataResponse) o;
    return Objects.equals(this.requestedNumberOfInstallments, paymentWizardDataResponse.requestedNumberOfInstallments) &&
        Objects.equals(this.successExitURL, paymentWizardDataResponse.successExitURL) &&
        Objects.equals(this.errorExitURL, paymentWizardDataResponse.errorExitURL) &&
        Objects.equals(this.cancelExitURL, paymentWizardDataResponse.cancelExitURL) &&
        Objects.equals(this.successAsyncUrl, paymentWizardDataResponse.successAsyncUrl) &&
        Objects.equals(this.viewName, paymentWizardDataResponse.viewName) &&
        Objects.equals(this.isOpenedInIframe, paymentWizardDataResponse.isOpenedInIframe) &&
        Objects.equals(this.paymentFormMessage, paymentWizardDataResponse.paymentFormMessage) &&
        Objects.equals(this.showAddressElements, paymentWizardDataResponse.showAddressElements) &&
        Objects.equals(this.currencyDisplay, paymentWizardDataResponse.currencyDisplay) &&
        Objects.equals(this.forceDisplayImportantNotes, paymentWizardDataResponse.forceDisplayImportantNotes) &&
        Objects.equals(this.showShopperDetailsExpendedOnStart, paymentWizardDataResponse.showShopperDetailsExpendedOnStart) &&
        Objects.equals(this.showPaymentScheduleRequiredCredit, paymentWizardDataResponse.showPaymentScheduleRequiredCredit) &&
        Objects.equals(this.isShopperEmailMandatory, paymentWizardDataResponse.isShopperEmailMandatory) &&
        Objects.equals(this.isShopperPhoneMandatory, paymentWizardDataResponse.isShopperPhoneMandatory) &&
        Objects.equals(this.numberOfInstallmentsSelectionsOption, paymentWizardDataResponse.numberOfInstallmentsSelectionsOption) &&
        Objects.equals(this.addressIsReadonly, paymentWizardDataResponse.addressIsReadonly) &&
        Objects.equals(this.phoneIsReadOnly, paymentWizardDataResponse.phoneIsReadOnly) &&
        Objects.equals(this.emailIsReadOnly, paymentWizardDataResponse.emailIsReadOnly) &&
        Objects.equals(this.showLearnMore, paymentWizardDataResponse.showLearnMore) &&
        Objects.equals(this.showMobilePhone, paymentWizardDataResponse.showMobilePhone) &&
        Objects.equals(this.logoURL, paymentWizardDataResponse.logoURL) &&
        Objects.equals(this.privacyPolicyUrl, paymentWizardDataResponse.privacyPolicyUrl) &&
        Objects.equals(this.termsAndConditionsUrl, paymentWizardDataResponse.termsAndConditionsUrl) &&
        Objects.equals(this.learnMoreUrl, paymentWizardDataResponse.learnMoreUrl) &&
        Objects.equals(this.potentialCardTypes, paymentWizardDataResponse.potentialCardTypes) &&
        Objects.equals(this.potentialCardBrands, paymentWizardDataResponse.potentialCardBrands) &&
        Objects.equals(this.paymentFormMessages, paymentWizardDataResponse.paymentFormMessages) &&
        Objects.equals(this.displayProperties, paymentWizardDataResponse.displayProperties) &&
        Objects.equals(this.termsAndConditions, paymentWizardDataResponse.termsAndConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedNumberOfInstallments, successExitURL, errorExitURL, cancelExitURL, successAsyncUrl, viewName, isOpenedInIframe, paymentFormMessage, showAddressElements, currencyDisplay, forceDisplayImportantNotes, showShopperDetailsExpendedOnStart, showPaymentScheduleRequiredCredit, isShopperEmailMandatory, isShopperPhoneMandatory, numberOfInstallmentsSelectionsOption, addressIsReadonly, phoneIsReadOnly, emailIsReadOnly, showLearnMore, showMobilePhone, logoURL, privacyPolicyUrl, termsAndConditionsUrl, learnMoreUrl, potentialCardTypes, potentialCardBrands, paymentFormMessages, displayProperties, termsAndConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentWizardDataResponse {\n");
    
    
    sb.append("    requestedNumberOfInstallments: ").append(toIndentedString(requestedNumberOfInstallments)).append("\n");
    sb.append("    successExitURL: ").append(toIndentedString(successExitURL)).append("\n");
    sb.append("    errorExitURL: ").append(toIndentedString(errorExitURL)).append("\n");
    sb.append("    cancelExitURL: ").append(toIndentedString(cancelExitURL)).append("\n");
    sb.append("    successAsyncUrl: ").append(toIndentedString(successAsyncUrl)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
    sb.append("    isOpenedInIframe: ").append(toIndentedString(isOpenedInIframe)).append("\n");
    sb.append("    paymentFormMessage: ").append(toIndentedString(paymentFormMessage)).append("\n");
    sb.append("    showAddressElements: ").append(toIndentedString(showAddressElements)).append("\n");
    sb.append("    currencyDisplay: ").append(toIndentedString(currencyDisplay)).append("\n");
    sb.append("    forceDisplayImportantNotes: ").append(toIndentedString(forceDisplayImportantNotes)).append("\n");
    sb.append("    showShopperDetailsExpendedOnStart: ").append(toIndentedString(showShopperDetailsExpendedOnStart)).append("\n");
    sb.append("    showPaymentScheduleRequiredCredit: ").append(toIndentedString(showPaymentScheduleRequiredCredit)).append("\n");
    sb.append("    isShopperEmailMandatory: ").append(toIndentedString(isShopperEmailMandatory)).append("\n");
    sb.append("    isShopperPhoneMandatory: ").append(toIndentedString(isShopperPhoneMandatory)).append("\n");
    sb.append("    numberOfInstallmentsSelectionsOption: ").append(toIndentedString(numberOfInstallmentsSelectionsOption)).append("\n");
    sb.append("    addressIsReadonly: ").append(toIndentedString(addressIsReadonly)).append("\n");
    sb.append("    phoneIsReadOnly: ").append(toIndentedString(phoneIsReadOnly)).append("\n");
    sb.append("    emailIsReadOnly: ").append(toIndentedString(emailIsReadOnly)).append("\n");
    sb.append("    showLearnMore: ").append(toIndentedString(showLearnMore)).append("\n");
    sb.append("    showMobilePhone: ").append(toIndentedString(showMobilePhone)).append("\n");
    sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    termsAndConditionsUrl: ").append(toIndentedString(termsAndConditionsUrl)).append("\n");
    sb.append("    learnMoreUrl: ").append(toIndentedString(learnMoreUrl)).append("\n");
    sb.append("    potentialCardTypes: ").append(toIndentedString(potentialCardTypes)).append("\n");
    sb.append("    potentialCardBrands: ").append(toIndentedString(potentialCardBrands)).append("\n");
    sb.append("    paymentFormMessages: ").append(toIndentedString(paymentFormMessages)).append("\n");
    sb.append("    displayProperties: ").append(toIndentedString(displayProperties)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

