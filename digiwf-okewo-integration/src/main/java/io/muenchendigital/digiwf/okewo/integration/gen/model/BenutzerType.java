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
 * BenutzerType
 */


public class BenutzerType {
  @JsonProperty("benutzerId")
  private String benutzerId = null;

  public BenutzerType benutzerId(String benutzerId) {
    this.benutzerId = benutzerId;
    return this;
  }

   /**
   * Get benutzerId
   * @return benutzerId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getBenutzerId() {
    return benutzerId;
  }

  public void setBenutzerId(String benutzerId) {
    this.benutzerId = benutzerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenutzerType benutzerType = (BenutzerType) o;
    return Objects.equals(this.benutzerId, benutzerType.benutzerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benutzerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenutzerType {\n");
    
    sb.append("    benutzerId: ").append(toIndentedString(benutzerId)).append("\n");
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
