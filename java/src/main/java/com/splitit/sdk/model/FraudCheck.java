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
import com.splitit.sdk.model.ReferenceEntityBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FraudCheck
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-06T08:50:26.379Z")
public class FraudCheck   {
  @SerializedName("FraudCheckResult")
  private ReferenceEntityBase fraudCheckResult = null;

  @SerializedName("ProviderResultCode")
  private String providerResultCode = null;

  @SerializedName("ProviderResultDesc")
  private String providerResultDesc = null;

  @SerializedName("ProviderReferenceId")
  private String providerReferenceId = null;

  public FraudCheck fraudCheckResult(ReferenceEntityBase fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
    return this;
  }

   /**
   * Get fraudCheckResult
   * @return fraudCheckResult
  **/
  @ApiModelProperty(value = "")
  public ReferenceEntityBase getFraudCheckResult() {
    return fraudCheckResult;
  }

  public void setFraudCheckResult(ReferenceEntityBase fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
  }

  public FraudCheck providerResultCode(String providerResultCode) {
    this.providerResultCode = providerResultCode;
    return this;
  }

   /**
   * Get providerResultCode
   * @return providerResultCode
  **/
  @ApiModelProperty(value = "")
  public String getProviderResultCode() {
    return providerResultCode;
  }

  public void setProviderResultCode(String providerResultCode) {
    this.providerResultCode = providerResultCode;
  }

  public FraudCheck providerResultDesc(String providerResultDesc) {
    this.providerResultDesc = providerResultDesc;
    return this;
  }

   /**
   * Get providerResultDesc
   * @return providerResultDesc
  **/
  @ApiModelProperty(value = "")
  public String getProviderResultDesc() {
    return providerResultDesc;
  }

  public void setProviderResultDesc(String providerResultDesc) {
    this.providerResultDesc = providerResultDesc;
  }

  public FraudCheck providerReferenceId(String providerReferenceId) {
    this.providerReferenceId = providerReferenceId;
    return this;
  }

   /**
   * Get providerReferenceId
   * @return providerReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getProviderReferenceId() {
    return providerReferenceId;
  }

  public void setProviderReferenceId(String providerReferenceId) {
    this.providerReferenceId = providerReferenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudCheck fraudCheck = (FraudCheck) o;
    return Objects.equals(this.fraudCheckResult, fraudCheck.fraudCheckResult) &&
        Objects.equals(this.providerResultCode, fraudCheck.providerResultCode) &&
        Objects.equals(this.providerResultDesc, fraudCheck.providerResultDesc) &&
        Objects.equals(this.providerReferenceId, fraudCheck.providerReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudCheckResult, providerResultCode, providerResultDesc, providerReferenceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudCheck {\n");
    
    sb.append("    fraudCheckResult: ").append(toIndentedString(fraudCheckResult)).append("\n");
    sb.append("    providerResultCode: ").append(toIndentedString(providerResultCode)).append("\n");
    sb.append("    providerResultDesc: ").append(toIndentedString(providerResultDesc)).append("\n");
    sb.append("    providerReferenceId: ").append(toIndentedString(providerReferenceId)).append("\n");
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

