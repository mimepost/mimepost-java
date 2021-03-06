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
 * ApiResponseDomainsListData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T12:32:16.156+05:30")
public class ApiResponseDomainsListData {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("selector")
  private String selector = null;

  @SerializedName("instance_name")
  private String instanceName = null;

  @SerializedName("spf_verified")
  private Integer spfVerified = null;

  @SerializedName("dkim_verified")
  private Integer dkimVerified = null;

  @SerializedName("tracking_verified")
  private Integer trackingVerified = null;

  @SerializedName("verified")
  private Integer verified = null;

  @SerializedName("approved")
  private Integer approved = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAITING_APPROVA("WAITING_APPROVA"),
    
    NOT_VERIFIED("NOT_VERIFIED"),
    
    APPROVED("APPROVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("status_desc")
  private String statusDesc = null;

  @SerializedName("entered")
  private String entered = null;

  @SerializedName("active")
  private Integer active = null;

  public ApiResponseDomainsListData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApiResponseDomainsListData domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ApiResponseDomainsListData selector(String selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(value = "")
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public ApiResponseDomainsListData instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

   /**
   * Get instanceName
   * @return instanceName
  **/
  @ApiModelProperty(value = "")
  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }

  public ApiResponseDomainsListData spfVerified(Integer spfVerified) {
    this.spfVerified = spfVerified;
    return this;
  }

   /**
   * Get spfVerified
   * @return spfVerified
  **/
  @ApiModelProperty(value = "")
  public Integer getSpfVerified() {
    return spfVerified;
  }

  public void setSpfVerified(Integer spfVerified) {
    this.spfVerified = spfVerified;
  }

  public ApiResponseDomainsListData dkimVerified(Integer dkimVerified) {
    this.dkimVerified = dkimVerified;
    return this;
  }

   /**
   * Get dkimVerified
   * @return dkimVerified
  **/
  @ApiModelProperty(value = "")
  public Integer getDkimVerified() {
    return dkimVerified;
  }

  public void setDkimVerified(Integer dkimVerified) {
    this.dkimVerified = dkimVerified;
  }

  public ApiResponseDomainsListData trackingVerified(Integer trackingVerified) {
    this.trackingVerified = trackingVerified;
    return this;
  }

   /**
   * Get trackingVerified
   * @return trackingVerified
  **/
  @ApiModelProperty(value = "")
  public Integer getTrackingVerified() {
    return trackingVerified;
  }

  public void setTrackingVerified(Integer trackingVerified) {
    this.trackingVerified = trackingVerified;
  }

  public ApiResponseDomainsListData verified(Integer verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Integer getVerified() {
    return verified;
  }

  public void setVerified(Integer verified) {
    this.verified = verified;
  }

  public ApiResponseDomainsListData approved(Integer approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @ApiModelProperty(value = "")
  public Integer getApproved() {
    return approved;
  }

  public void setApproved(Integer approved) {
    this.approved = approved;
  }

  public ApiResponseDomainsListData status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiResponseDomainsListData statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * Get statusDesc
   * @return statusDesc
  **/
  @ApiModelProperty(value = "")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public ApiResponseDomainsListData entered(String entered) {
    this.entered = entered;
    return this;
  }

   /**
   * Get entered
   * @return entered
  **/
  @ApiModelProperty(example = "yyyy-mm-dd H:i:s", value = "")
  public String getEntered() {
    return entered;
  }

  public void setEntered(String entered) {
    this.entered = entered;
  }

  public ApiResponseDomainsListData active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseDomainsListData apiResponseDomainsListData = (ApiResponseDomainsListData) o;
    return Objects.equals(this.id, apiResponseDomainsListData.id) &&
        Objects.equals(this.domain, apiResponseDomainsListData.domain) &&
        Objects.equals(this.selector, apiResponseDomainsListData.selector) &&
        Objects.equals(this.instanceName, apiResponseDomainsListData.instanceName) &&
        Objects.equals(this.spfVerified, apiResponseDomainsListData.spfVerified) &&
        Objects.equals(this.dkimVerified, apiResponseDomainsListData.dkimVerified) &&
        Objects.equals(this.trackingVerified, apiResponseDomainsListData.trackingVerified) &&
        Objects.equals(this.verified, apiResponseDomainsListData.verified) &&
        Objects.equals(this.approved, apiResponseDomainsListData.approved) &&
        Objects.equals(this.status, apiResponseDomainsListData.status) &&
        Objects.equals(this.statusDesc, apiResponseDomainsListData.statusDesc) &&
        Objects.equals(this.entered, apiResponseDomainsListData.entered) &&
        Objects.equals(this.active, apiResponseDomainsListData.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, selector, instanceName, spfVerified, dkimVerified, trackingVerified, verified, approved, status, statusDesc, entered, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseDomainsListData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    spfVerified: ").append(toIndentedString(spfVerified)).append("\n");
    sb.append("    dkimVerified: ").append(toIndentedString(dkimVerified)).append("\n");
    sb.append("    trackingVerified: ").append(toIndentedString(trackingVerified)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    entered: ").append(toIndentedString(entered)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

