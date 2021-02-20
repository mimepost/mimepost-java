/*
 * MimePost API Reference (Beta)
 * MimePost API for sending email.  You can find out more about MimePost at [https://mimepost.com](http://mimepost.com). For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: support@mimepost.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mimepost.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T12:32:16.156+05:30")
public class AccountProfile {
  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("skype_id")
  private String skypeId = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("twitter_handle")
  private String twitterHandle = "";

  @SerializedName("linkedin")
  private String linkedin = null;

  @SerializedName("billing_name")
  private String billingName = null;

  @SerializedName("billing_company_name")
  private String billingCompanyName = null;

  @SerializedName("billing_address")
  private String billingAddress = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("email")
  private String email = null;

  public AccountProfile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @ApiModelProperty(example = "Joe", value = "First name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountProfile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @ApiModelProperty(example = "doe", value = "Last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountProfile address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "245, Highway Street", value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AccountProfile city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "New York", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountProfile country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "USA", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountProfile phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "1111 2222 3333", value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AccountProfile skypeId(String skypeId) {
    this.skypeId = skypeId;
    return this;
  }

   /**
   * Get skypeId
   * @return skypeId
  **/
  @ApiModelProperty(example = "mime_post", value = "")
  public String getSkypeId() {
    return skypeId;
  }

  public void setSkypeId(String skypeId) {
    this.skypeId = skypeId;
  }

  public AccountProfile companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(example = "Your Company, LLP", value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public AccountProfile website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "example.com", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public AccountProfile twitterHandle(String twitterHandle) {
    this.twitterHandle = twitterHandle;
    return this;
  }

   /**
   * Get twitterHandle
   * @return twitterHandle
  **/
  @ApiModelProperty(example = "@mime_post", value = "")
  public String getTwitterHandle() {
    return twitterHandle;
  }

  public void setTwitterHandle(String twitterHandle) {
    this.twitterHandle = twitterHandle;
  }

  public AccountProfile linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Get linkedin
   * @return linkedin
  **/
  @ApiModelProperty(value = "")
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public AccountProfile billingName(String billingName) {
    this.billingName = billingName;
    return this;
  }

   /**
   * Get billingName
   * @return billingName
  **/
  @ApiModelProperty(value = "")
  public String getBillingName() {
    return billingName;
  }

  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }

  public AccountProfile billingCompanyName(String billingCompanyName) {
    this.billingCompanyName = billingCompanyName;
    return this;
  }

   /**
   * Get billingCompanyName
   * @return billingCompanyName
  **/
  @ApiModelProperty(value = "")
  public String getBillingCompanyName() {
    return billingCompanyName;
  }

  public void setBillingCompanyName(String billingCompanyName) {
    this.billingCompanyName = billingCompanyName;
  }

  public AccountProfile billingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AccountProfile username(String username) {
    this.username = username;
    return this;
  }

   /**
   * username
   * @return username
  **/
  @ApiModelProperty(example = "mimepost_username", value = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Account email address
   * @return email
  **/
  @ApiModelProperty(example = "joe@example.com", value = "Account email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountProfile accountProfile = (AccountProfile) o;
    return Objects.equals(this.firstName, accountProfile.firstName) &&
        Objects.equals(this.lastName, accountProfile.lastName) &&
        Objects.equals(this.address, accountProfile.address) &&
        Objects.equals(this.city, accountProfile.city) &&
        Objects.equals(this.country, accountProfile.country) &&
        Objects.equals(this.phoneNumber, accountProfile.phoneNumber) &&
        Objects.equals(this.skypeId, accountProfile.skypeId) &&
        Objects.equals(this.companyName, accountProfile.companyName) &&
        Objects.equals(this.website, accountProfile.website) &&
        Objects.equals(this.twitterHandle, accountProfile.twitterHandle) &&
        Objects.equals(this.linkedin, accountProfile.linkedin) &&
        Objects.equals(this.billingName, accountProfile.billingName) &&
        Objects.equals(this.billingCompanyName, accountProfile.billingCompanyName) &&
        Objects.equals(this.billingAddress, accountProfile.billingAddress) &&
        Objects.equals(this.username, accountProfile.username) &&
        Objects.equals(this.email, accountProfile.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, city, country, phoneNumber, skypeId, companyName, website, twitterHandle, linkedin, billingName, billingCompanyName, billingAddress, username, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountProfile {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    skypeId: ").append(toIndentedString(skypeId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    twitterHandle: ").append(toIndentedString(twitterHandle)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    billingCompanyName: ").append(toIndentedString(billingCompanyName)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
