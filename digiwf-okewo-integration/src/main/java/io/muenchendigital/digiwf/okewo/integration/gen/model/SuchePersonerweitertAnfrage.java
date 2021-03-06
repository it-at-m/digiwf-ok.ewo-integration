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
import io.muenchendigital.digiwf.okewo.integration.gen.model.BenutzerType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.PersonenSuchkriterienErweitertType;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SuchePersonerweitertAnfrage
 */


public class SuchePersonerweitertAnfrage {
  @JsonProperty("benutzer")
  private BenutzerType benutzer = null;

  @JsonProperty("suchkriterien")
  private PersonenSuchkriterienErweitertType suchkriterien = null;

  public SuchePersonerweitertAnfrage benutzer(BenutzerType benutzer) {
    this.benutzer = benutzer;
    return this;
  }

   /**
   * Get benutzer
   * @return benutzer
  **/
  @NotNull
  @Valid
  @Schema(required = true, description = "")
  public BenutzerType getBenutzer() {
    return benutzer;
  }

  public void setBenutzer(BenutzerType benutzer) {
    this.benutzer = benutzer;
  }

  public SuchePersonerweitertAnfrage suchkriterien(PersonenSuchkriterienErweitertType suchkriterien) {
    this.suchkriterien = suchkriterien;
    return this;
  }

   /**
   * Get suchkriterien
   * @return suchkriterien
  **/
  @NotNull
  @Valid
  @Schema(required = true, description = "")
  public PersonenSuchkriterienErweitertType getSuchkriterien() {
    return suchkriterien;
  }

  public void setSuchkriterien(PersonenSuchkriterienErweitertType suchkriterien) {
    this.suchkriterien = suchkriterien;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuchePersonerweitertAnfrage suchePersonerweitertAnfrage = (SuchePersonerweitertAnfrage) o;
    return Objects.equals(this.benutzer, suchePersonerweitertAnfrage.benutzer) &&
        Objects.equals(this.suchkriterien, suchePersonerweitertAnfrage.suchkriterien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benutzer, suchkriterien);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuchePersonerweitertAnfrage {\n");
    
    sb.append("    benutzer: ").append(toIndentedString(benutzer)).append("\n");
    sb.append("    suchkriterien: ").append(toIndentedString(suchkriterien)).append("\n");
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
