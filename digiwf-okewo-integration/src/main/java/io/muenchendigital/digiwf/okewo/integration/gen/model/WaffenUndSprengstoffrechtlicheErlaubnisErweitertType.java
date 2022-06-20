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
 * WaffenUndSprengstoffrechtlicheErlaubnisErweitertType
 */


public class WaffenUndSprengstoffrechtlicheErlaubnisErweitertType {
  @JsonProperty("angelegtAm")
  private String angelegtAm = null;

  @JsonProperty("behoerde")
  private String behoerde = null;

  @JsonProperty("aktenzeichen")
  private String aktenzeichen = null;

  public WaffenUndSprengstoffrechtlicheErlaubnisErweitertType angelegtAm(String angelegtAm) {
    this.angelegtAm = angelegtAm;
    return this;
  }

   /**
   * Get angelegtAm
   * @return angelegtAm
  **/
  @Schema(description = "")
  public String getAngelegtAm() {
    return angelegtAm;
  }

  public void setAngelegtAm(String angelegtAm) {
    this.angelegtAm = angelegtAm;
  }

  public WaffenUndSprengstoffrechtlicheErlaubnisErweitertType behoerde(String behoerde) {
    this.behoerde = behoerde;
    return this;
  }

   /**
   * Get behoerde
   * @return behoerde
  **/
  @Schema(description = "")
  public String getBehoerde() {
    return behoerde;
  }

  public void setBehoerde(String behoerde) {
    this.behoerde = behoerde;
  }

  public WaffenUndSprengstoffrechtlicheErlaubnisErweitertType aktenzeichen(String aktenzeichen) {
    this.aktenzeichen = aktenzeichen;
    return this;
  }

   /**
   * Get aktenzeichen
   * @return aktenzeichen
  **/
  @Schema(description = "")
  public String getAktenzeichen() {
    return aktenzeichen;
  }

  public void setAktenzeichen(String aktenzeichen) {
    this.aktenzeichen = aktenzeichen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaffenUndSprengstoffrechtlicheErlaubnisErweitertType waffenUndSprengstoffrechtlicheErlaubnisErweitertType = (WaffenUndSprengstoffrechtlicheErlaubnisErweitertType) o;
    return Objects.equals(this.angelegtAm, waffenUndSprengstoffrechtlicheErlaubnisErweitertType.angelegtAm) &&
        Objects.equals(this.behoerde, waffenUndSprengstoffrechtlicheErlaubnisErweitertType.behoerde) &&
        Objects.equals(this.aktenzeichen, waffenUndSprengstoffrechtlicheErlaubnisErweitertType.aktenzeichen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(angelegtAm, behoerde, aktenzeichen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaffenUndSprengstoffrechtlicheErlaubnisErweitertType {\n");
    
    sb.append("    angelegtAm: ").append(toIndentedString(angelegtAm)).append("\n");
    sb.append("    behoerde: ").append(toIndentedString(behoerde)).append("\n");
    sb.append("    aktenzeichen: ").append(toIndentedString(aktenzeichen)).append("\n");
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
