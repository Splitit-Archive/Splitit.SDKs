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
import com.splitit.sdk.model.Schedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetInstallmentsScheduleResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-15T07:09:09.206Z")
public class GetInstallmentsScheduleResponse  {
  @SerializedName("ResponseHeader")
  private ResponseHeader responseHeader = null;

  @SerializedName("Schedules")
  private List<Schedule> schedules = null;

  @SerializedName("InstallmentsPicker")
  private String installmentsPicker = null;

  @SerializedName("Headline")
  private String headline = null;

  public GetInstallmentsScheduleResponse responseHeader(ResponseHeader responseHeader) {
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

  public GetInstallmentsScheduleResponse schedules(List<Schedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public GetInstallmentsScheduleResponse addSchedulesItem(Schedule schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<Schedule>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * Get schedules
   * @return schedules
  **/
  @ApiModelProperty(value = "")
  public List<Schedule> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<Schedule> schedules) {
    this.schedules = schedules;
  }

  public GetInstallmentsScheduleResponse installmentsPicker(String installmentsPicker) {
    this.installmentsPicker = installmentsPicker;
    return this;
  }

   /**
   * Get installmentsPicker
   * @return installmentsPicker
  **/
  @ApiModelProperty(value = "")
  public String getInstallmentsPicker() {
    return installmentsPicker;
  }

  public void setInstallmentsPicker(String installmentsPicker) {
    this.installmentsPicker = installmentsPicker;
  }

  public GetInstallmentsScheduleResponse headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @ApiModelProperty(value = "")
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInstallmentsScheduleResponse getInstallmentsScheduleResponse = (GetInstallmentsScheduleResponse) o;
    return Objects.equals(this.responseHeader, getInstallmentsScheduleResponse.responseHeader) &&
        Objects.equals(this.schedules, getInstallmentsScheduleResponse.schedules) &&
        Objects.equals(this.installmentsPicker, getInstallmentsScheduleResponse.installmentsPicker) &&
        Objects.equals(this.headline, getInstallmentsScheduleResponse.headline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, schedules, installmentsPicker, headline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInstallmentsScheduleResponse {\n");
    
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    installmentsPicker: ").append(toIndentedString(installmentsPicker)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
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

