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

/**
 * Get3DSecureParametersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-06T08:50:26.379Z")
public class Get3DSecureParametersResponse   {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("IssuerRedirectUrl")
  private String issuerRedirectUrl = null;

  @SerializedName("PaReq")
  private String paReq = null;

  @SerializedName("Md")
  private String md = null;

  @SerializedName("TermUrl")
  private String termUrl = null;

  public Get3DSecureParametersResponse responseHeader(ResponseHeader responseHeader) {
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

  public Get3DSecureParametersResponse issuerRedirectUrl(String issuerRedirectUrl) {
    this.issuerRedirectUrl = issuerRedirectUrl;
    return this;
  }

   /**
   * Get issuerRedirectUrl
   * @return issuerRedirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getIssuerRedirectUrl() {
    return issuerRedirectUrl;
  }

  public void setIssuerRedirectUrl(String issuerRedirectUrl) {
    this.issuerRedirectUrl = issuerRedirectUrl;
  }

  public Get3DSecureParametersResponse paReq(String paReq) {
    this.paReq = paReq;
    return this;
  }

   /**
   * Get paReq
   * @return paReq
  **/
  @ApiModelProperty(value = "")
  public String getPaReq() {
    return paReq;
  }

  public void setPaReq(String paReq) {
    this.paReq = paReq;
  }

  public Get3DSecureParametersResponse md(String md) {
    this.md = md;
    return this;
  }

   /**
   * Get md
   * @return md
  **/
  @ApiModelProperty(value = "")
  public String getMd() {
    return md;
  }

  public void setMd(String md) {
    this.md = md;
  }

  public Get3DSecureParametersResponse termUrl(String termUrl) {
    this.termUrl = termUrl;
    return this;
  }

   /**
   * Get termUrl
   * @return termUrl
  **/
  @ApiModelProperty(value = "")
  public String getTermUrl() {
    return termUrl;
  }

  public void setTermUrl(String termUrl) {
    this.termUrl = termUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Get3DSecureParametersResponse get3DSecureParametersResponse = (Get3DSecureParametersResponse) o;
    return Objects.equals(this.responseHeader, get3DSecureParametersResponse.responseHeader) &&
        Objects.equals(this.issuerRedirectUrl, get3DSecureParametersResponse.issuerRedirectUrl) &&
        Objects.equals(this.paReq, get3DSecureParametersResponse.paReq) &&
        Objects.equals(this.md, get3DSecureParametersResponse.md) &&
        Objects.equals(this.termUrl, get3DSecureParametersResponse.termUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, issuerRedirectUrl, paReq, md, termUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get3DSecureParametersResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    issuerRedirectUrl: ").append(toIndentedString(issuerRedirectUrl)).append("\n");
    sb.append("    paReq: ").append(toIndentedString(paReq)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    termUrl: ").append(toIndentedString(termUrl)).append("\n");
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

