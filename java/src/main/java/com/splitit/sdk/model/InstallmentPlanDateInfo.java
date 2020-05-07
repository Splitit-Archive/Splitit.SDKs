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
import com.splitit.sdk.model.InstallmentsPlanDateType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InstallmentPlanDateInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T22:13:41.756Z")
public class InstallmentPlanDateInfo   {
  @SerializedName("InstallmentsPlanDateType")
  private InstallmentsPlanDateType installmentsPlanDateType = null;

  @SerializedName("StartDate")
  private String startDate = null;

  @SerializedName("EndDate")
  private String endDate = null;

  @SerializedName("AllDates")
  private Boolean allDates = null;

  public InstallmentPlanDateInfo installmentsPlanDateType(InstallmentsPlanDateType installmentsPlanDateType) {
    this.installmentsPlanDateType = installmentsPlanDateType;
    return this;
  }

   /**
   * Get installmentsPlanDateType
   * @return installmentsPlanDateType
  **/
  @ApiModelProperty(required = true, value = "")
  public InstallmentsPlanDateType getInstallmentsPlanDateType() {
    return installmentsPlanDateType;
  }

  public void setInstallmentsPlanDateType(InstallmentsPlanDateType installmentsPlanDateType) {
    this.installmentsPlanDateType = installmentsPlanDateType;
  }

  public InstallmentPlanDateInfo startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public InstallmentPlanDateInfo endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public InstallmentPlanDateInfo allDates(Boolean allDates) {
    this.allDates = allDates;
    return this;
  }

   /**
   * Get allDates
   * @return allDates
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAllDates() {
    return allDates;
  }

  public void setAllDates(Boolean allDates) {
    this.allDates = allDates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanDateInfo installmentPlanDateInfo = (InstallmentPlanDateInfo) o;
    return Objects.equals(this.installmentsPlanDateType, installmentPlanDateInfo.installmentsPlanDateType) &&
        Objects.equals(this.startDate, installmentPlanDateInfo.startDate) &&
        Objects.equals(this.endDate, installmentPlanDateInfo.endDate) &&
        Objects.equals(this.allDates, installmentPlanDateInfo.allDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentsPlanDateType, startDate, endDate, allDates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanDateInfo {\n");
    
    sb.append("    installmentsPlanDateType: ").append(toIndentedString(installmentsPlanDateType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    allDates: ").append(toIndentedString(allDates)).append("\n");
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

