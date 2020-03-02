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
import com.splitit.sdk.model.Money;
import com.splitit.sdk.model.ResponseHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RefundInstallmentPlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-02T09:45:27.608Z")
public class RefundInstallmentPlanResponse   {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("InstallmentPlan")
  private InstallmentPlan installmentPlan = null;

  @SerializedName("CurrentRefundAmount")
  private Money currentRefundAmount = null;

  public RefundInstallmentPlanResponse responseHeader(ResponseHeader responseHeader) {
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

  public RefundInstallmentPlanResponse installmentPlan(InstallmentPlan installmentPlan) {
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

  public RefundInstallmentPlanResponse currentRefundAmount(Money currentRefundAmount) {
    this.currentRefundAmount = currentRefundAmount;
    return this;
  }

   /**
   * Get currentRefundAmount
   * @return currentRefundAmount
  **/
  @ApiModelProperty(value = "")
  public Money getCurrentRefundAmount() {
    return currentRefundAmount;
  }

  public void setCurrentRefundAmount(Money currentRefundAmount) {
    this.currentRefundAmount = currentRefundAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundInstallmentPlanResponse refundInstallmentPlanResponse = (RefundInstallmentPlanResponse) o;
    return Objects.equals(this.responseHeader, refundInstallmentPlanResponse.responseHeader) &&
        Objects.equals(this.installmentPlan, refundInstallmentPlanResponse.installmentPlan) &&
        Objects.equals(this.currentRefundAmount, refundInstallmentPlanResponse.currentRefundAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, installmentPlan, currentRefundAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundInstallmentPlanResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    installmentPlan: ").append(toIndentedString(installmentPlan)).append("\n");
    sb.append("    currentRefundAmount: ").append(toIndentedString(currentRefundAmount)).append("\n");
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

