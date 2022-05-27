/*
 * Camel REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Schema 2.0.2 Service 2.3.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.muenchendigital.digiwf.okewo.integration.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ZuzugdatenType
 */


public class ZuzugdatenType {
  @JsonProperty("zuzugEu")
  private java.time.LocalDateTime zuzugEu = null;

  @JsonProperty("zuzugSamtgemeinde")
  private java.time.LocalDateTime zuzugSamtgemeinde = null;

  @JsonProperty("zuzugOrtsteil")
  private java.time.LocalDateTime zuzugOrtsteil = null;

  @JsonProperty("zuzugBund")
  private java.time.LocalDateTime zuzugBund = null;

  @JsonProperty("zuzugLand")
  private java.time.LocalDateTime zuzugLand = null;

  @JsonProperty("zuzugRegierungsbezirk")
  private java.time.LocalDateTime zuzugRegierungsbezirk = null;

  @JsonProperty("zuzugKreis")
  private java.time.LocalDateTime zuzugKreis = null;

  @JsonProperty("zuzugGemeinde")
  private java.time.LocalDateTime zuzugGemeinde = null;

  @JsonProperty("mitHauptwohnungGemeldetSeit")
  private java.time.LocalDateTime mitHauptwohnungGemeldetSeit = null;

  public ZuzugdatenType zuzugEu(java.time.LocalDateTime zuzugEu) {
    this.zuzugEu = zuzugEu;
    return this;
  }

   /**
   * Get zuzugEu
   * @return zuzugEu
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugEu() {
    return zuzugEu;
  }

  public void setZuzugEu(java.time.LocalDateTime zuzugEu) {
    this.zuzugEu = zuzugEu;
  }

  public ZuzugdatenType zuzugSamtgemeinde(java.time.LocalDateTime zuzugSamtgemeinde) {
    this.zuzugSamtgemeinde = zuzugSamtgemeinde;
    return this;
  }

   /**
   * Get zuzugSamtgemeinde
   * @return zuzugSamtgemeinde
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugSamtgemeinde() {
    return zuzugSamtgemeinde;
  }

  public void setZuzugSamtgemeinde(java.time.LocalDateTime zuzugSamtgemeinde) {
    this.zuzugSamtgemeinde = zuzugSamtgemeinde;
  }

  public ZuzugdatenType zuzugOrtsteil(java.time.LocalDateTime zuzugOrtsteil) {
    this.zuzugOrtsteil = zuzugOrtsteil;
    return this;
  }

   /**
   * Get zuzugOrtsteil
   * @return zuzugOrtsteil
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugOrtsteil() {
    return zuzugOrtsteil;
  }

  public void setZuzugOrtsteil(java.time.LocalDateTime zuzugOrtsteil) {
    this.zuzugOrtsteil = zuzugOrtsteil;
  }

  public ZuzugdatenType zuzugBund(java.time.LocalDateTime zuzugBund) {
    this.zuzugBund = zuzugBund;
    return this;
  }

   /**
   * Get zuzugBund
   * @return zuzugBund
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugBund() {
    return zuzugBund;
  }

  public void setZuzugBund(java.time.LocalDateTime zuzugBund) {
    this.zuzugBund = zuzugBund;
  }

  public ZuzugdatenType zuzugLand(java.time.LocalDateTime zuzugLand) {
    this.zuzugLand = zuzugLand;
    return this;
  }

   /**
   * Get zuzugLand
   * @return zuzugLand
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugLand() {
    return zuzugLand;
  }

  public void setZuzugLand(java.time.LocalDateTime zuzugLand) {
    this.zuzugLand = zuzugLand;
  }

  public ZuzugdatenType zuzugRegierungsbezirk(java.time.LocalDateTime zuzugRegierungsbezirk) {
    this.zuzugRegierungsbezirk = zuzugRegierungsbezirk;
    return this;
  }

   /**
   * Get zuzugRegierungsbezirk
   * @return zuzugRegierungsbezirk
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugRegierungsbezirk() {
    return zuzugRegierungsbezirk;
  }

  public void setZuzugRegierungsbezirk(java.time.LocalDateTime zuzugRegierungsbezirk) {
    this.zuzugRegierungsbezirk = zuzugRegierungsbezirk;
  }

  public ZuzugdatenType zuzugKreis(java.time.LocalDateTime zuzugKreis) {
    this.zuzugKreis = zuzugKreis;
    return this;
  }

   /**
   * Get zuzugKreis
   * @return zuzugKreis
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugKreis() {
    return zuzugKreis;
  }

  public void setZuzugKreis(java.time.LocalDateTime zuzugKreis) {
    this.zuzugKreis = zuzugKreis;
  }

  public ZuzugdatenType zuzugGemeinde(java.time.LocalDateTime zuzugGemeinde) {
    this.zuzugGemeinde = zuzugGemeinde;
    return this;
  }

   /**
   * Get zuzugGemeinde
   * @return zuzugGemeinde
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getZuzugGemeinde() {
    return zuzugGemeinde;
  }

  public void setZuzugGemeinde(java.time.LocalDateTime zuzugGemeinde) {
    this.zuzugGemeinde = zuzugGemeinde;
  }

  public ZuzugdatenType mitHauptwohnungGemeldetSeit(java.time.LocalDateTime mitHauptwohnungGemeldetSeit) {
    this.mitHauptwohnungGemeldetSeit = mitHauptwohnungGemeldetSeit;
    return this;
  }

   /**
   * Get mitHauptwohnungGemeldetSeit
   * @return mitHauptwohnungGemeldetSeit
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getMitHauptwohnungGemeldetSeit() {
    return mitHauptwohnungGemeldetSeit;
  }

  public void setMitHauptwohnungGemeldetSeit(java.time.LocalDateTime mitHauptwohnungGemeldetSeit) {
    this.mitHauptwohnungGemeldetSeit = mitHauptwohnungGemeldetSeit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZuzugdatenType zuzugdatenType = (ZuzugdatenType) o;
    return Objects.equals(this.zuzugEu, zuzugdatenType.zuzugEu) &&
        Objects.equals(this.zuzugSamtgemeinde, zuzugdatenType.zuzugSamtgemeinde) &&
        Objects.equals(this.zuzugOrtsteil, zuzugdatenType.zuzugOrtsteil) &&
        Objects.equals(this.zuzugBund, zuzugdatenType.zuzugBund) &&
        Objects.equals(this.zuzugLand, zuzugdatenType.zuzugLand) &&
        Objects.equals(this.zuzugRegierungsbezirk, zuzugdatenType.zuzugRegierungsbezirk) &&
        Objects.equals(this.zuzugKreis, zuzugdatenType.zuzugKreis) &&
        Objects.equals(this.zuzugGemeinde, zuzugdatenType.zuzugGemeinde) &&
        Objects.equals(this.mitHauptwohnungGemeldetSeit, zuzugdatenType.mitHauptwohnungGemeldetSeit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zuzugEu, zuzugSamtgemeinde, zuzugOrtsteil, zuzugBund, zuzugLand, zuzugRegierungsbezirk, zuzugKreis, zuzugGemeinde, mitHauptwohnungGemeldetSeit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZuzugdatenType {\n");
    
    sb.append("    zuzugEu: ").append(toIndentedString(zuzugEu)).append("\n");
    sb.append("    zuzugSamtgemeinde: ").append(toIndentedString(zuzugSamtgemeinde)).append("\n");
    sb.append("    zuzugOrtsteil: ").append(toIndentedString(zuzugOrtsteil)).append("\n");
    sb.append("    zuzugBund: ").append(toIndentedString(zuzugBund)).append("\n");
    sb.append("    zuzugLand: ").append(toIndentedString(zuzugLand)).append("\n");
    sb.append("    zuzugRegierungsbezirk: ").append(toIndentedString(zuzugRegierungsbezirk)).append("\n");
    sb.append("    zuzugKreis: ").append(toIndentedString(zuzugKreis)).append("\n");
    sb.append("    zuzugGemeinde: ").append(toIndentedString(zuzugGemeinde)).append("\n");
    sb.append("    mitHauptwohnungGemeldetSeit: ").append(toIndentedString(mitHauptwohnungGemeldetSeit)).append("\n");
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
