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
 * VornameType
 */


public class VornameType {
  @JsonProperty("vorname")
  private String vorname = null;

  @JsonProperty("rufname")
  private Boolean rufname = null;

  public VornameType vorname(String vorname) {
    this.vorname = vorname;
    return this;
  }

   /**
   * Get vorname
   * @return vorname
  **/
  @Schema(description = "")
  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public VornameType rufname(Boolean rufname) {
    this.rufname = rufname;
    return this;
  }

   /**
   * Get rufname
   * @return rufname
  **/
  @Schema(description = "")
  public Boolean isRufname() {
    return rufname;
  }

  public void setRufname(Boolean rufname) {
    this.rufname = rufname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VornameType vornameType = (VornameType) o;
    return Objects.equals(this.vorname, vornameType.vorname) &&
        Objects.equals(this.rufname, vornameType.rufname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vorname, rufname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VornameType {\n");
    
    sb.append("    vorname: ").append(toIndentedString(vorname)).append("\n");
    sb.append("    rufname: ").append(toIndentedString(rufname)).append("\n");
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
