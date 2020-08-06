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
import com.splitit.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConsumerData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-06T08:50:26.379Z")
public class ConsumerData   {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("FullName")
  private String fullName = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("CultureName")
  private String cultureName = null;

  @SerializedName("RoleName")
  private String roleName = null;

  @SerializedName("IsLocked")
  private Boolean isLocked = null;

  @SerializedName("IsDataRestricted")
  private Boolean isDataRestricted = null;

  public ConsumerData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsumerData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ConsumerData fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ConsumerData email(String email) {
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

  public ConsumerData phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ConsumerData cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * Get cultureName
   * @return cultureName
  **/
  @ApiModelProperty(value = "")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public ConsumerData roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ConsumerData isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public ConsumerData isDataRestricted(Boolean isDataRestricted) {
    this.isDataRestricted = isDataRestricted;
    return this;
  }

   /**
   * Get isDataRestricted
   * @return isDataRestricted
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsDataRestricted() {
    return isDataRestricted;
  }

  public void setIsDataRestricted(Boolean isDataRestricted) {
    this.isDataRestricted = isDataRestricted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerData consumerData = (ConsumerData) o;
    return Objects.equals(this.id, consumerData.id) &&
        Objects.equals(this.userName, consumerData.userName) &&
        Objects.equals(this.fullName, consumerData.fullName) &&
        Objects.equals(this.email, consumerData.email) &&
        Objects.equals(this.phoneNumber, consumerData.phoneNumber) &&
        Objects.equals(this.cultureName, consumerData.cultureName) &&
        Objects.equals(this.roleName, consumerData.roleName) &&
        Objects.equals(this.isLocked, consumerData.isLocked) &&
        Objects.equals(this.isDataRestricted, consumerData.isDataRestricted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, fullName, email, phoneNumber, cultureName, roleName, isLocked, isDataRestricted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isDataRestricted: ").append(toIndentedString(isDataRestricted)).append("\n");
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

