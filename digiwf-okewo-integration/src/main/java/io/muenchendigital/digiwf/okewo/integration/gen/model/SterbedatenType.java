/*
 * Camel REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Schema 2.0.2 Service 2.2.0
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
 * SterbedatenType
 */


public class SterbedatenType {
  @JsonProperty("datum")
  private java.time.LocalDateTime datum = null;

  @JsonProperty("ort")
  private String ort = null;

  public SterbedatenType datum(java.time.LocalDateTime datum) {
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @Valid
  @Schema(description = "")
  public java.time.LocalDateTime getDatum() {
    return datum;
  }

  public void setDatum(java.time.LocalDateTime datum) {
    this.datum = datum;
  }

  public SterbedatenType ort(String ort) {
    this.ort = ort;
    return this;
  }

   /**
   * Get ort
   * @return ort
  **/
  @Schema(description = "")
  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    this.ort = ort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SterbedatenType sterbedatenType = (SterbedatenType) o;
    return Objects.equals(this.datum, sterbedatenType.datum) &&
        Objects.equals(this.ort, sterbedatenType.ort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum, ort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SterbedatenType {\n");
    
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
    sb.append("    ort: ").append(toIndentedString(ort)).append("\n");
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
