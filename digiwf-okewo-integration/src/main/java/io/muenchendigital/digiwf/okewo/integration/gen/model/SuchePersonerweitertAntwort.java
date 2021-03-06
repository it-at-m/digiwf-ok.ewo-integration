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
import io.muenchendigital.digiwf.okewo.integration.gen.model.PersonErweitert;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SuchePersonerweitertAntwort
 */


public class SuchePersonerweitertAntwort {
  @JsonProperty("personen")
  private List<PersonErweitert> personen = null;

  public SuchePersonerweitertAntwort personen(List<PersonErweitert> personen) {
    this.personen = personen;
    return this;
  }

  public SuchePersonerweitertAntwort addPersonenItem(PersonErweitert personenItem) {
    if (this.personen == null) {
      this.personen = new ArrayList<>();
    }
    this.personen.add(personenItem);
    return this;
  }

   /**
   * Get personen
   * @return personen
  **/
  @Valid
  @Schema(description = "")
  public List<PersonErweitert> getPersonen() {
    return personen;
  }

  public void setPersonen(List<PersonErweitert> personen) {
    this.personen = personen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuchePersonerweitertAntwort suchePersonerweitertAntwort = (SuchePersonerweitertAntwort) o;
    return Objects.equals(this.personen, suchePersonerweitertAntwort.personen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuchePersonerweitertAntwort {\n");
    
    sb.append("    personen: ").append(toIndentedString(personen)).append("\n");
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
