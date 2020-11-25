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
import com.splitit.sdk.model.GetResourcesRequestContext;
import com.splitit.sdk.model.SystemTextCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetResourcesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-25T08:42:14.391Z")
public class GetResourcesRequest extends ModelWithHeader {
  @SerializedName("SystemTextCategories")
  private List<SystemTextCategory> systemTextCategories = null;

  @SerializedName("RequestContext")
  private GetResourcesRequestContext requestContext = null;

  public GetResourcesRequest systemTextCategories(List<SystemTextCategory> systemTextCategories) {
    this.systemTextCategories = systemTextCategories;
    return this;
  }

  public GetResourcesRequest addSystemTextCategoriesItem(SystemTextCategory systemTextCategoriesItem) {
    if (this.systemTextCategories == null) {
      this.systemTextCategories = new ArrayList<SystemTextCategory>();
    }
    this.systemTextCategories.add(systemTextCategoriesItem);
    return this;
  }

   /**
   * Get systemTextCategories
   * @return systemTextCategories
  **/
  @ApiModelProperty(value = "")
  public List<SystemTextCategory> getSystemTextCategories() {
    return systemTextCategories;
  }

  public void setSystemTextCategories(List<SystemTextCategory> systemTextCategories) {
    this.systemTextCategories = systemTextCategories;
  }

  public GetResourcesRequest requestContext(GetResourcesRequestContext requestContext) {
    this.requestContext = requestContext;
    return this;
  }

   /**
   * Get requestContext
   * @return requestContext
  **/
  @ApiModelProperty(value = "")
  public GetResourcesRequestContext getRequestContext() {
    return requestContext;
  }

  public void setRequestContext(GetResourcesRequestContext requestContext) {
    this.requestContext = requestContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResourcesRequest getResourcesRequest = (GetResourcesRequest) o;
    return Objects.equals(this.systemTextCategories, getResourcesRequest.systemTextCategories) &&
        Objects.equals(this.requestContext, getResourcesRequest.requestContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemTextCategories, requestContext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResourcesRequest {\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    
    sb.append("    systemTextCategories: ").append(toIndentedString(systemTextCategories)).append("\n");
    sb.append("    requestContext: ").append(toIndentedString(requestContext)).append("\n");
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

