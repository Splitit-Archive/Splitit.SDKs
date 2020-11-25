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
import com.splitit.sdk.model.AddressData;
import com.splitit.sdk.model.CardData;
import com.splitit.sdk.model.CartData;
import com.splitit.sdk.model.ConsumerData;
import com.splitit.sdk.model.CreateInstallmentPlanRequest;
import com.splitit.sdk.model.EventsEndpoints;
import com.splitit.sdk.model.ExternalAuth;
import com.splitit.sdk.model.PaymentToken;
import com.splitit.sdk.model.PlanApprovalEvidence;
import com.splitit.sdk.model.PlanData;
import com.splitit.sdk.model.RedirectUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateInstallmentPlanRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-25T08:42:14.391Z")
public class UpdateInstallmentPlanRequest extends ModelWithHeader {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("PlanData")
  private PlanData planData = null;

  @SerializedName("CartData")
  private CartData cartData = null;

  @SerializedName("ConsumerData")
  private ConsumerData consumerData = null;

  @SerializedName("BillingAddress")
  private AddressData billingAddress = null;

  @SerializedName("CreditCardDetails")
  private CardData creditCardDetails = null;

  @SerializedName("PaymentToken")
  private PaymentToken paymentToken = null;

  @SerializedName("PlanApprovalEvidence")
  private PlanApprovalEvidence planApprovalEvidence = null;

  @SerializedName("RedirectUrls")
  private RedirectUrls redirectUrls = null;

  @SerializedName("EventsEndpoints")
  private EventsEndpoints eventsEndpoints = null;

  @SerializedName("ExternalAuth")
  private ExternalAuth externalAuth = null;

  public UpdateInstallmentPlanRequest installmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
    return this;
  }

   /**
   * Get installmentPlanNumber
   * @return installmentPlanNumber
  **/
  @ApiModelProperty(value = "")
  public String getInstallmentPlanNumber() {
    return installmentPlanNumber;
  }

  public void setInstallmentPlanNumber(String installmentPlanNumber) {
    this.installmentPlanNumber = installmentPlanNumber;
  }

  public UpdateInstallmentPlanRequest planData(PlanData planData) {
    this.planData = planData;
    return this;
  }

   /**
   * Get planData
   * @return planData
  **/
  @ApiModelProperty(value = "")
  public PlanData getPlanData() {
    return planData;
  }

  public void setPlanData(PlanData planData) {
    this.planData = planData;
  }

  public UpdateInstallmentPlanRequest cartData(CartData cartData) {
    this.cartData = cartData;
    return this;
  }

   /**
   * Get cartData
   * @return cartData
  **/
  @ApiModelProperty(value = "")
  public CartData getCartData() {
    return cartData;
  }

  public void setCartData(CartData cartData) {
    this.cartData = cartData;
  }

  public UpdateInstallmentPlanRequest consumerData(ConsumerData consumerData) {
    this.consumerData = consumerData;
    return this;
  }

   /**
   * Get consumerData
   * @return consumerData
  **/
  @ApiModelProperty(value = "")
  public ConsumerData getConsumerData() {
    return consumerData;
  }

  public void setConsumerData(ConsumerData consumerData) {
    this.consumerData = consumerData;
  }

  public UpdateInstallmentPlanRequest billingAddress(AddressData billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressData getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressData billingAddress) {
    this.billingAddress = billingAddress;
  }

  public UpdateInstallmentPlanRequest creditCardDetails(CardData creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
    return this;
  }

   /**
   * Get creditCardDetails
   * @return creditCardDetails
  **/
  @ApiModelProperty(value = "")
  public CardData getCreditCardDetails() {
    return creditCardDetails;
  }

  public void setCreditCardDetails(CardData creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
  }

  public UpdateInstallmentPlanRequest paymentToken(PaymentToken paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * Get paymentToken
   * @return paymentToken
  **/
  @ApiModelProperty(value = "")
  public PaymentToken getPaymentToken() {
    return paymentToken;
  }

  public void setPaymentToken(PaymentToken paymentToken) {
    this.paymentToken = paymentToken;
  }

  public UpdateInstallmentPlanRequest planApprovalEvidence(PlanApprovalEvidence planApprovalEvidence) {
    this.planApprovalEvidence = planApprovalEvidence;
    return this;
  }

   /**
   * Get planApprovalEvidence
   * @return planApprovalEvidence
  **/
  @ApiModelProperty(value = "")
  public PlanApprovalEvidence getPlanApprovalEvidence() {
    return planApprovalEvidence;
  }

  public void setPlanApprovalEvidence(PlanApprovalEvidence planApprovalEvidence) {
    this.planApprovalEvidence = planApprovalEvidence;
  }

  public UpdateInstallmentPlanRequest redirectUrls(RedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

   /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  @ApiModelProperty(value = "")
  public RedirectUrls getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(RedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public UpdateInstallmentPlanRequest eventsEndpoints(EventsEndpoints eventsEndpoints) {
    this.eventsEndpoints = eventsEndpoints;
    return this;
  }

   /**
   * Get eventsEndpoints
   * @return eventsEndpoints
  **/
  @ApiModelProperty(value = "")
  public EventsEndpoints getEventsEndpoints() {
    return eventsEndpoints;
  }

  public void setEventsEndpoints(EventsEndpoints eventsEndpoints) {
    this.eventsEndpoints = eventsEndpoints;
  }

  public UpdateInstallmentPlanRequest externalAuth(ExternalAuth externalAuth) {
    this.externalAuth = externalAuth;
    return this;
  }

   /**
   * Get externalAuth
   * @return externalAuth
  **/
  @ApiModelProperty(value = "")
  public ExternalAuth getExternalAuth() {
    return externalAuth;
  }

  public void setExternalAuth(ExternalAuth externalAuth) {
    this.externalAuth = externalAuth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInstallmentPlanRequest updateInstallmentPlanRequest = (UpdateInstallmentPlanRequest) o;
    return Objects.equals(this.installmentPlanNumber, updateInstallmentPlanRequest.installmentPlanNumber) &&
        Objects.equals(this.planData, updateInstallmentPlanRequest.planData) &&
        Objects.equals(this.cartData, updateInstallmentPlanRequest.cartData) &&
        Objects.equals(this.consumerData, updateInstallmentPlanRequest.consumerData) &&
        Objects.equals(this.billingAddress, updateInstallmentPlanRequest.billingAddress) &&
        Objects.equals(this.creditCardDetails, updateInstallmentPlanRequest.creditCardDetails) &&
        Objects.equals(this.paymentToken, updateInstallmentPlanRequest.paymentToken) &&
        Objects.equals(this.planApprovalEvidence, updateInstallmentPlanRequest.planApprovalEvidence) &&
        Objects.equals(this.redirectUrls, updateInstallmentPlanRequest.redirectUrls) &&
        Objects.equals(this.eventsEndpoints, updateInstallmentPlanRequest.eventsEndpoints) &&
        Objects.equals(this.externalAuth, updateInstallmentPlanRequest.externalAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, planData, cartData, consumerData, billingAddress, creditCardDetails, paymentToken, planApprovalEvidence, redirectUrls, eventsEndpoints, externalAuth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstallmentPlanRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    planData: ").append(toIndentedString(planData)).append("\n");
    sb.append("    cartData: ").append(toIndentedString(cartData)).append("\n");
    sb.append("    consumerData: ").append(toIndentedString(consumerData)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    creditCardDetails: ").append(toIndentedString(creditCardDetails)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    planApprovalEvidence: ").append(toIndentedString(planApprovalEvidence)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
    sb.append("    eventsEndpoints: ").append(toIndentedString(eventsEndpoints)).append("\n");
    sb.append("    externalAuth: ").append(toIndentedString(externalAuth)).append("\n");
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

