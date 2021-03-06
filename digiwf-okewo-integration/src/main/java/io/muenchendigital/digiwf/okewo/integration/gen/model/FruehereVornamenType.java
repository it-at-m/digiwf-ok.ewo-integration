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
import io.muenchendigital.digiwf.okewo.integration.gen.model.VornameType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FruehereVornamenType
 */


public class FruehereVornamenType {
  @JsonProperty("vorname")
  private List<VornameType> vorname = null;

  @JsonProperty("aenderungsdatum")
  private String aenderungsdatum = null;

  public FruehereVornamenType vorname(List<VornameType> vorname) {
    this.vorname = vorname;
    return this;
  }

  public FruehereVornamenType addVornameItem(VornameType vornameItem) {
    if (this.vorname == null) {
      this.vorname = new ArrayList<>();
    }
    this.vorname.add(vornameItem);
    return this;
  }

   /**
   * Get vorname
   * @return vorname
  **/
  @Valid
  @Schema(description = "")
  public List<VornameType> getVorname() {
    return vorname;
  }

  public void setVorname(List<VornameType> vorname) {
    this.vorname = vorname;
  }

  public FruehereVornamenType aenderungsdatum(String aenderungsdatum) {
    this.aenderungsdatum = aenderungsdatum;
    return this;
  }

   /**
   * Get aenderungsdatum
   * @return aenderungsdatum
  **/
  @Schema(description = "")
  public String getAenderungsdatum() {
    return aenderungsdatum;
  }

  public void setAenderungsdatum(String aenderungsdatum) {
    this.aenderungsdatum = aenderungsdatum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FruehereVornamenType fruehereVornamenType = (FruehereVornamenType) o;
    return Objects.equals(this.vorname, fruehereVornamenType.vorname) &&
        Objects.equals(this.aenderungsdatum, fruehereVornamenType.aenderungsdatum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vorname, aenderungsdatum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FruehereVornamenType {\n");
    
    sb.append("    vorname: ").append(toIndentedString(vorname)).append("\n");
    sb.append("    aenderungsdatum: ").append(toIndentedString(aenderungsdatum)).append("\n");
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
