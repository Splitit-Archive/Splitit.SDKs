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
import com.splitit.sdk.model.CardData;
import com.splitit.sdk.model.Money;
import com.splitit.sdk.model.ReferenceEntityBase;
import com.splitit.sdk.model.TransactionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Installment2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-02T10:18:45.756Z")
public class Installment2  {
  @SerializedName("InstallmentNumber")
  private Integer installmentNumber = null;

  @SerializedName("Amount")
  private Money amount = null;

  @SerializedName("OriginalAmount")
  private Money originalAmount = null;

  @SerializedName("RefundAmount")
  private Money refundAmount = null;

  @SerializedName("ProcessDateTime")
  private OffsetDateTime processDateTime = null;

  @SerializedName("IsRefund")
  private Boolean isRefund = null;

  @SerializedName("RequiredCredit")
  private Money requiredCredit = null;

  @SerializedName("CreatedDateTime")
  private OffsetDateTime createdDateTime = null;

  @SerializedName("Status")
  private ReferenceEntityBase status = null;

  @SerializedName("TransactionResults")
  private List<TransactionResult> transactionResults = null;

  @SerializedName("CardDetails")
  private CardData cardDetails = null;

  @SerializedName("Result")
  private Boolean result = null;

  public Installment2 installmentNumber(Integer installmentNumber) {
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

  public Installment2 amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public Installment2 originalAmount(Money originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * Get originalAmount
   * @return originalAmount
  **/
  @ApiModelProperty(value = "")
  public Money getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Money originalAmount) {
    this.originalAmount = originalAmount;
  }

  public Installment2 refundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  @ApiModelProperty(value = "")
  public Money getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
  }

  public Installment2 processDateTime(OffsetDateTime processDateTime) {
    this.processDateTime = processDateTime;
    return this;
  }

   /**
   * Get processDateTime
   * @return processDateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessDateTime() {
    return processDateTime;
  }

  public void setProcessDateTime(OffsetDateTime processDateTime) {
    this.processDateTime = processDateTime;
  }

  public Installment2 isRefund(Boolean isRefund) {
    this.isRefund = isRefund;
    return this;
  }

   /**
   * Get isRefund
   * @return isRefund
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsRefund() {
    return isRefund;
  }

  public void setIsRefund(Boolean isRefund) {
    this.isRefund = isRefund;
  }

  public Installment2 requiredCredit(Money requiredCredit) {
    this.requiredCredit = requiredCredit;
    return this;
  }

   /**
   * Get requiredCredit
   * @return requiredCredit
  **/
  @ApiModelProperty(value = "")
  public Money getRequiredCredit() {
    return requiredCredit;
  }

  public void setRequiredCredit(Money requiredCredit) {
    this.requiredCredit = requiredCredit;
  }

  public Installment2 createdDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Get createdDateTime
   * @return createdDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(OffsetDateTime createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public Installment2 status(ReferenceEntityBase status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getStatus() {
    return status;
  }

  public void setStatus(ReferenceEntityBase status) {
    this.status = status;
  }

  public Installment2 transactionResults(List<TransactionResult> transactionResults) {
    this.transactionResults = transactionResults;
    return this;
  }

  public Installment2 addTransactionResultsItem(TransactionResult transactionResultsItem) {
    if (this.transactionResults == null) {
      this.transactionResults = new ArrayList<TransactionResult>();
    }
    this.transactionResults.add(transactionResultsItem);
    return this;
  }

   /**
   * Get transactionResults
   * @return transactionResults
  **/
  @ApiModelProperty(value = "")
  public List<TransactionResult> getTransactionResults() {
    return transactionResults;
  }

  public void setTransactionResults(List<TransactionResult> transactionResults) {
    this.transactionResults = transactionResults;
  }

  public Installment2 cardDetails(CardData cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

   /**
   * Get cardDetails
   * @return cardDetails
  **/
  @ApiModelProperty(value = "")
  public CardData getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(CardData cardDetails) {
    this.cardDetails = cardDetails;
  }

  public Installment2 result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installment2 installment2 = (Installment2) o;
    return Objects.equals(this.installmentNumber, installment2.installmentNumber) &&
        Objects.equals(this.amount, installment2.amount) &&
        Objects.equals(this.originalAmount, installment2.originalAmount) &&
        Objects.equals(this.refundAmount, installment2.refundAmount) &&
        Objects.equals(this.processDateTime, installment2.processDateTime) &&
        Objects.equals(this.isRefund, installment2.isRefund) &&
        Objects.equals(this.requiredCredit, installment2.requiredCredit) &&
        Objects.equals(this.createdDateTime, installment2.createdDateTime) &&
        Objects.equals(this.status, installment2.status) &&
        Objects.equals(this.transactionResults, installment2.transactionResults) &&
        Objects.equals(this.cardDetails, installment2.cardDetails) &&
        Objects.equals(this.result, installment2.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentNumber, amount, originalAmount, refundAmount, processDateTime, isRefund, requiredCredit, createdDateTime, status, transactionResults, cardDetails, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installment2 {\n");
    
    
    sb.append("    installmentNumber: ").append(toIndentedString(installmentNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    processDateTime: ").append(toIndentedString(processDateTime)).append("\n");
    sb.append("    isRefund: ").append(toIndentedString(isRefund)).append("\n");
    sb.append("    requiredCredit: ").append(toIndentedString(requiredCredit)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionResults: ").append(toIndentedString(transactionResults)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

