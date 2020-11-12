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
import com.splitit.sdk.model.InstallmentPlan;
import com.splitit.sdk.model.InstallmentPlanResponse;
import com.splitit.sdk.model.ResponseHeader;
import com.splitit.sdk.model.TransactionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InitiateInstallmentsPlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T16:25:05.667Z")
public class InitiateInstallmentsPlanResponse  {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("InstallmentPlan")
  private InstallmentPlan installmentPlan = null;

  @SerializedName("GatewayTransactionResults")
  private List<TransactionResult> gatewayTransactionResults = null;

  @SerializedName("CheckoutUrl")
  private String checkoutUrl = null;

  @SerializedName("ApprovalUrl")
  private String approvalUrl = null;

  @SerializedName("TermsAndConditionsUrl")
  private String termsAndConditionsUrl = null;

  @SerializedName("PrivacyPolicyUrl")
  private String privacyPolicyUrl = null;

  @SerializedName("InstallmentPlanInfoUrl")
  private String installmentPlanInfoUrl = null;

  @SerializedName("PublicToken")
  private String publicToken = null;

  @SerializedName("LearnMoreUrl")
  private String learnMoreUrl = null;

  public InitiateInstallmentsPlanResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(value = "")
  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public InitiateInstallmentsPlanResponse installmentPlan(InstallmentPlan installmentPlan) {
    this.installmentPlan = installmentPlan;
    return this;
  }

   /**
   * Get installmentPlan
   * @return installmentPlan
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlan getInstallmentPlan() {
    return installmentPlan;
  }

  public void setInstallmentPlan(InstallmentPlan installmentPlan) {
    this.installmentPlan = installmentPlan;
  }

  public InitiateInstallmentsPlanResponse gatewayTransactionResults(List<TransactionResult> gatewayTransactionResults) {
    this.gatewayTransactionResults = gatewayTransactionResults;
    return this;
  }

  public InitiateInstallmentsPlanResponse addGatewayTransactionResultsItem(TransactionResult gatewayTransactionResultsItem) {
    if (this.gatewayTransactionResults == null) {
      this.gatewayTransactionResults = new ArrayList<TransactionResult>();
    }
    this.gatewayTransactionResults.add(gatewayTransactionResultsItem);
    return this;
  }

   /**
   * Get gatewayTransactionResults
   * @return gatewayTransactionResults
  **/
  @ApiModelProperty(value = "")
  public List<TransactionResult> getGatewayTransactionResults() {
    return gatewayTransactionResults;
  }

  public void setGatewayTransactionResults(List<TransactionResult> gatewayTransactionResults) {
    this.gatewayTransactionResults = gatewayTransactionResults;
  }

  public InitiateInstallmentsPlanResponse checkoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
    return this;
  }

   /**
   * Get checkoutUrl
   * @return checkoutUrl
  **/
  @ApiModelProperty(value = "")
  public String getCheckoutUrl() {
    return checkoutUrl;
  }

  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  public InitiateInstallmentsPlanResponse approvalUrl(String approvalUrl) {
    this.approvalUrl = approvalUrl;
    return this;
  }

   /**
   * Get approvalUrl
   * @return approvalUrl
  **/
  @ApiModelProperty(value = "")
  public String getApprovalUrl() {
    return approvalUrl;
  }

  public void setApprovalUrl(String approvalUrl) {
    this.approvalUrl = approvalUrl;
  }

  public InitiateInstallmentsPlanResponse termsAndConditionsUrl(String termsAndConditionsUrl) {
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

  public InitiateInstallmentsPlanResponse privacyPolicyUrl(String privacyPolicyUrl) {
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

  public InitiateInstallmentsPlanResponse installmentPlanInfoUrl(String installmentPlanInfoUrl) {
    this.installmentPlanInfoUrl = installmentPlanInfoUrl;
    return this;
  }

   /**
   * Get installmentPlanInfoUrl
   * @return installmentPlanInfoUrl
  **/
  @ApiModelProperty(value = "")
  public String getInstallmentPlanInfoUrl() {
    return installmentPlanInfoUrl;
  }

  public void setInstallmentPlanInfoUrl(String installmentPlanInfoUrl) {
    this.installmentPlanInfoUrl = installmentPlanInfoUrl;
  }

  public InitiateInstallmentsPlanResponse publicToken(String publicToken) {
    this.publicToken = publicToken;
    return this;
  }

   /**
   * Get publicToken
   * @return publicToken
  **/
  @ApiModelProperty(value = "")
  public String getPublicToken() {
    return publicToken;
  }

  public void setPublicToken(String publicToken) {
    this.publicToken = publicToken;
  }

  public InitiateInstallmentsPlanResponse learnMoreUrl(String learnMoreUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInstallmentsPlanResponse initiateInstallmentsPlanResponse = (InitiateInstallmentsPlanResponse) o;
    return Objects.equals(this.responseHeader, initiateInstallmentsPlanResponse.responseHeader) &&
        Objects.equals(this.installmentPlan, initiateInstallmentsPlanResponse.installmentPlan) &&
        Objects.equals(this.gatewayTransactionResults, initiateInstallmentsPlanResponse.gatewayTransactionResults) &&
        Objects.equals(this.checkoutUrl, initiateInstallmentsPlanResponse.checkoutUrl) &&
        Objects.equals(this.approvalUrl, initiateInstallmentsPlanResponse.approvalUrl) &&
        Objects.equals(this.termsAndConditionsUrl, initiateInstallmentsPlanResponse.termsAndConditionsUrl) &&
        Objects.equals(this.privacyPolicyUrl, initiateInstallmentsPlanResponse.privacyPolicyUrl) &&
        Objects.equals(this.installmentPlanInfoUrl, initiateInstallmentsPlanResponse.installmentPlanInfoUrl) &&
        Objects.equals(this.publicToken, initiateInstallmentsPlanResponse.publicToken) &&
        Objects.equals(this.learnMoreUrl, initiateInstallmentsPlanResponse.learnMoreUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, installmentPlan, gatewayTransactionResults, checkoutUrl, approvalUrl, termsAndConditionsUrl, privacyPolicyUrl, installmentPlanInfoUrl, publicToken, learnMoreUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInstallmentsPlanResponse {\n");
    
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
    sb.append("    gatewayTransactionResults: ").append(toIndentedString(gatewayTransactionResults)).append("\n");
    sb.append("    checkoutUrl: ").append(toIndentedString(checkoutUrl)).append("\n");
    sb.append("    approvalUrl: ").append(toIndentedString(approvalUrl)).append("\n");
    sb.append("    termsAndConditionsUrl: ").append(toIndentedString(termsAndConditionsUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    installmentPlanInfoUrl: ").append(toIndentedString(installmentPlanInfoUrl)).append("\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    learnMoreUrl: ").append(toIndentedString(learnMoreUrl)).append("\n");
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

