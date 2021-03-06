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
 * TeilbekanntesDatumType
 */


public class TeilbekanntesDatumType {
  @JsonProperty("jahr")
  private String jahr = null;

  @JsonProperty("jahrMonat")
  private String jahrMonat = null;

  @JsonProperty("datum")
  private String datum = null;

  public TeilbekanntesDatumType jahr(String jahr) {
    this.jahr = jahr;
    return this;
  }

   /**
   * Get jahr
   * @return jahr
  **/
  @Schema(description = "")
  public String getJahr() {
    return jahr;
  }

  public void setJahr(String jahr) {
    this.jahr = jahr;
  }

  public TeilbekanntesDatumType jahrMonat(String jahrMonat) {
    this.jahrMonat = jahrMonat;
    return this;
  }

   /**
   * Get jahrMonat
   * @return jahrMonat
  **/
  @Schema(description = "")
  public String getJahrMonat() {
    return jahrMonat;
  }

  public void setJahrMonat(String jahrMonat) {
    this.jahrMonat = jahrMonat;
  }

  public TeilbekanntesDatumType datum(String datum) {
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @Schema(description = "")
  public String getDatum() {
    return datum;
  }

  public void setDatum(String datum) {
    this.datum = datum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeilbekanntesDatumType teilbekanntesDatumType = (TeilbekanntesDatumType) o;
    return Objects.equals(this.jahr, teilbekanntesDatumType.jahr) &&
        Objects.equals(this.jahrMonat, teilbekanntesDatumType.jahrMonat) &&
        Objects.equals(this.datum, teilbekanntesDatumType.datum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jahr, jahrMonat, datum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeilbekanntesDatumType {\n");
    
    sb.append("    jahr: ").append(toIndentedString(jahr)).append("\n");
    sb.append("    jahrMonat: ").append(toIndentedString(jahrMonat)).append("\n");
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
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
