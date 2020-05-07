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
import com.splitit.sdk.model.ResponseHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CreateInstallmentPlanLegacyResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T22:13:41.756Z")
public class CreateInstallmentPlanLegacyResponse   {
  @SerializedName("ApiKey")
  private String apiKey = null;

  @SerializedName("InstallmentPlanStatus")
  private Integer installmentPlanStatus = null;

  @SerializedName("Result")
  private Integer result = null;

  @SerializedName("PaymentGateway")
  private String paymentGateway = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("ConsumerFullName")
  private String consumerFullName = null;

  @SerializedName("ParamX")
  private String paramX = null;

  @SerializedName("InstallmentNumber")
  private Integer installmentNumber = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("CurrencyName")
  private String currencyName = null;

  @SerializedName("CurrencySymbol")
  private String currencySymbol = null;

  @SerializedName("InstallmentPlanNumber")
  private String installmentPlanNumber = null;

  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  public CreateInstallmentPlanLegacyResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public CreateInstallmentPlanLegacyResponse installmentPlanStatus(Integer installmentPlanStatus) {
    this.installmentPlanStatus = installmentPlanStatus;
    return this;
  }

   /**
   * Get installmentPlanStatus
   * @return installmentPlanStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getInstallmentPlanStatus() {
    return installmentPlanStatus;
  }

  public void setInstallmentPlanStatus(Integer installmentPlanStatus) {
    this.installmentPlanStatus = installmentPlanStatus;
  }

  public CreateInstallmentPlanLegacyResponse result(Integer result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public CreateInstallmentPlanLegacyResponse paymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
    return this;
  }

   /**
   * Get paymentGateway
   * @return paymentGateway
  **/
  @ApiModelProperty(value = "")
  public String getPaymentGateway() {
    return paymentGateway;
  }

  public void setPaymentGateway(String paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public CreateInstallmentPlanLegacyResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateInstallmentPlanLegacyResponse consumerFullName(String consumerFullName) {
    this.consumerFullName = consumerFullName;
    return this;
  }

   /**
   * Get consumerFullName
   * @return consumerFullName
  **/
  @ApiModelProperty(value = "")
  public String getConsumerFullName() {
    return consumerFullName;
  }

  public void setConsumerFullName(String consumerFullName) {
    this.consumerFullName = consumerFullName;
  }

  public CreateInstallmentPlanLegacyResponse paramX(String paramX) {
    this.paramX = paramX;
    return this;
  }

   /**
   * Get paramX
   * @return paramX
  **/
  @ApiModelProperty(value = "")
  public String getParamX() {
    return paramX;
  }

  public void setParamX(String paramX) {
    this.paramX = paramX;
  }

  public CreateInstallmentPlanLegacyResponse installmentNumber(Integer installmentNumber) {
    this.installmentNumber = installmentNumber;
    return this;
  }

   /**
   * Get installmentNumber
   * @return installmentNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getInstallmentNumber() {
    return installmentNumber;
  }

  public void setInstallmentNumber(Integer installmentNumber) {
    this.installmentNumber = installmentNumber;
  }

  public CreateInstallmentPlanLegacyResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CreateInstallmentPlanLegacyResponse currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }

   /**
   * Get currencyName
   * @return currencyName
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public CreateInstallmentPlanLegacyResponse currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CreateInstallmentPlanLegacyResponse installmentPlanNumber(String installmentPlanNumber) {
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

  public CreateInstallmentPlanLegacyResponse responseHeader(ResponseHeader responseHeader) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstallmentPlanLegacyResponse createInstallmentPlanLegacyResponse = (CreateInstallmentPlanLegacyResponse) o;
    return Objects.equals(this.apiKey, createInstallmentPlanLegacyResponse.apiKey) &&
        Objects.equals(this.installmentPlanStatus, createInstallmentPlanLegacyResponse.installmentPlanStatus) &&
        Objects.equals(this.result, createInstallmentPlanLegacyResponse.result) &&
        Objects.equals(this.paymentGateway, createInstallmentPlanLegacyResponse.paymentGateway) &&
        Objects.equals(this.email, createInstallmentPlanLegacyResponse.email) &&
        Objects.equals(this.consumerFullName, createInstallmentPlanLegacyResponse.consumerFullName) &&
        Objects.equals(this.paramX, createInstallmentPlanLegacyResponse.paramX) &&
        Objects.equals(this.installmentNumber, createInstallmentPlanLegacyResponse.installmentNumber) &&
        Objects.equals(this.amount, createInstallmentPlanLegacyResponse.amount) &&
        Objects.equals(this.currencyName, createInstallmentPlanLegacyResponse.currencyName) &&
        Objects.equals(this.currencySymbol, createInstallmentPlanLegacyResponse.currencySymbol) &&
        Objects.equals(this.installmentPlanNumber, createInstallmentPlanLegacyResponse.installmentPlanNumber) &&
        Objects.equals(this.responseHeader, createInstallmentPlanLegacyResponse.responseHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, installmentPlanStatus, result, paymentGateway, email, consumerFullName, paramX, installmentNumber, amount, currencyName, currencySymbol, installmentPlanNumber, responseHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstallmentPlanLegacyResponse {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    installmentPlanStatus: ").append(toIndentedString(installmentPlanStatus)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    consumerFullName: ").append(toIndentedString(consumerFullName)).append("\n");
    sb.append("    paramX: ").append(toIndentedString(paramX)).append("\n");
    sb.append("    installmentNumber: ").append(toIndentedString(installmentNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    installmentPlanNumber: ").append(toIndentedString(installmentPlanNumber)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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

