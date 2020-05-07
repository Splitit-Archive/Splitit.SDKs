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
import com.splitit.sdk.model.AddressData2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-07T22:13:41.756Z")
public class AddressData   {
  @SerializedName("AddressLine")
  private String addressLine = null;

  @SerializedName("AddressLine2")
  private String addressLine2 = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("Country")
  private String country = null;

  @SerializedName("State")
  private String state = null;

  @SerializedName("Zip")
  private String zip = null;

  @SerializedName("FullAddressLine")
  private String fullAddressLine = null;

  public AddressData addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

   /**
   * Get addressLine
   * @return addressLine
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public AddressData addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AddressData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressData country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressData state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressData zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Get zip
   * @return zip
  **/
  @ApiModelProperty(value = "")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public AddressData fullAddressLine(String fullAddressLine) {
    this.fullAddressLine = fullAddressLine;
    return this;
  }

   /**
   * Get fullAddressLine
   * @return fullAddressLine
  **/
  @ApiModelProperty(value = "")
  public String getFullAddressLine() {
    return fullAddressLine;
  }

  public void setFullAddressLine(String fullAddressLine) {
    this.fullAddressLine = fullAddressLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressData addressData = (AddressData) o;
    return Objects.equals(this.addressLine, addressData.addressLine) &&
        Objects.equals(this.addressLine2, addressData.addressLine2) &&
        Objects.equals(this.city, addressData.city) &&
        Objects.equals(this.country, addressData.country) &&
        Objects.equals(this.state, addressData.state) &&
        Objects.equals(this.zip, addressData.zip) &&
        Objects.equals(this.fullAddressLine, addressData.fullAddressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, addressLine2, city, country, state, zip, fullAddressLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressData {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    fullAddressLine: ").append(toIndentedString(fullAddressLine)).append("\n");
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

