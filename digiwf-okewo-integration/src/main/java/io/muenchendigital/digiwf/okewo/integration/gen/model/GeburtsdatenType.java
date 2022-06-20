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
import io.muenchendigital.digiwf.okewo.integration.gen.model.GeburtsdatumType;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GeburtsdatenType
 */


public class GeburtsdatenType {
  @JsonProperty("datum")
  private GeburtsdatumType datum = null;

  @JsonProperty("ort")
  private String ort = null;

  @JsonProperty("staat")
  private String staat = null;

  public GeburtsdatenType datum(GeburtsdatumType datum) {
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @Valid
  @Schema(description = "")
  public GeburtsdatumType getDatum() {
    return datum;
  }

  public void setDatum(GeburtsdatumType datum) {
    this.datum = datum;
  }

  public GeburtsdatenType ort(String ort) {
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

  public GeburtsdatenType staat(String staat) {
    this.staat = staat;
    return this;
  }

   /**
   * Get staat
   * @return staat
  **/
  @Schema(description = "")
  public String getStaat() {
    return staat;
  }

  public void setStaat(String staat) {
    this.staat = staat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeburtsdatenType geburtsdatenType = (GeburtsdatenType) o;
    return Objects.equals(this.datum, geburtsdatenType.datum) &&
        Objects.equals(this.ort, geburtsdatenType.ort) &&
        Objects.equals(this.staat, geburtsdatenType.staat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum, ort, staat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeburtsdatenType {\n");
    
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
    sb.append("    ort: ").append(toIndentedString(ort)).append("\n");
    sb.append("    staat: ").append(toIndentedString(staat)).append("\n");
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
