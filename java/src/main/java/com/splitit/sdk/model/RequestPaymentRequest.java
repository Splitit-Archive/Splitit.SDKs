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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RequestPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T11:15:01.528Z")
public class RequestPaymentRequest extends ModelWithHeader {
  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("PaymentApprovalPhone")
  private String paymentApprovalPhone = null;

  @SerializedName("PaymentApprovalEmail")
  private String paymentApprovalEmail = null;

  public RequestPaymentRequest installmentPlanNumber(String installmentPlanNumber) {
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

  public RequestPaymentRequest paymentApprovalPhone(String paymentApprovalPhone) {
    this.paymentApprovalPhone = paymentApprovalPhone;
    return this;
  }

   /**
   * Get paymentApprovalPhone
   * @return paymentApprovalPhone
  **/
  @ApiModelProperty(value = "")
  public String getPaymentApprovalPhone() {
    return paymentApprovalPhone;
  }

  public void setPaymentApprovalPhone(String paymentApprovalPhone) {
    this.paymentApprovalPhone = paymentApprovalPhone;
  }

  public RequestPaymentRequest paymentApprovalEmail(String paymentApprovalEmail) {
    this.paymentApprovalEmail = paymentApprovalEmail;
    return this;
  }

   /**
   * Get paymentApprovalEmail
   * @return paymentApprovalEmail
  **/
  @ApiModelProperty(value = "")
  public String getPaymentApprovalEmail() {
    return paymentApprovalEmail;
  }

  public void setPaymentApprovalEmail(String paymentApprovalEmail) {
    this.paymentApprovalEmail = paymentApprovalEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPaymentRequest requestPaymentRequest = (RequestPaymentRequest) o;
    return Objects.equals(this.installmentPlanNumber, requestPaymentRequest.installmentPlanNumber) &&
        Objects.equals(this.paymentApprovalPhone, requestPaymentRequest.paymentApprovalPhone) &&
        Objects.equals(this.paymentApprovalEmail, requestPaymentRequest.paymentApprovalEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPlanNumber, paymentApprovalPhone, paymentApprovalEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPaymentRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    paymentApprovalPhone: ").append(toIndentedString(paymentApprovalPhone)).append("\n");
    sb.append("    paymentApprovalEmail: ").append(toIndentedString(paymentApprovalEmail)).append("\n");
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

