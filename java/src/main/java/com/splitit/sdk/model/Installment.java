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
import com.splitit.sdk.model.MoneyWithCurrencyCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Installment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-06T08:50:26.379Z")
public class Installment   {
  @SerializedName("Date")
  private OffsetDateTime date = null;

  @SerializedName("Amount")
  private MoneyWithCurrencyCode amount = null;

  @SerializedName("HeldAmount")
  private BigDecimal heldAmount = null;

  public Installment date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Installment amount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public MoneyWithCurrencyCode getAmount() {
    return amount;
  }

  public void setAmount(MoneyWithCurrencyCode amount) {
    this.amount = amount;
  }

  public Installment heldAmount(BigDecimal heldAmount) {
    this.heldAmount = heldAmount;
    return this;
  }

   /**
   * Get heldAmount
   * @return heldAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHeldAmount() {
    return heldAmount;
  }

  public void setHeldAmount(BigDecimal heldAmount) {
    this.heldAmount = heldAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installment installment = (Installment) o;
    return Objects.equals(this.date, installment.date) &&
        Objects.equals(this.amount, installment.amount) &&
        Objects.equals(this.heldAmount, installment.heldAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, amount, heldAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    heldAmount: ").append(toIndentedString(heldAmount)).append("\n");
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

