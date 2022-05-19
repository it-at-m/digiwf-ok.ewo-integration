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
 * NachnameType
 */


public class NachnameType {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("namensbestandteil")
  private String namensbestandteil = null;

  @JsonProperty("unstrukturierteSchreibweise")
  private String unstrukturierteSchreibweise = null;

  public NachnameType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NachnameType namensbestandteil(String namensbestandteil) {
    this.namensbestandteil = namensbestandteil;
    return this;
  }

   /**
   * Get namensbestandteil
   * @return namensbestandteil
  **/
  @Schema(description = "")
  public String getNamensbestandteil() {
    return namensbestandteil;
  }

  public void setNamensbestandteil(String namensbestandteil) {
    this.namensbestandteil = namensbestandteil;
  }

  public NachnameType unstrukturierteSchreibweise(String unstrukturierteSchreibweise) {
    this.unstrukturierteSchreibweise = unstrukturierteSchreibweise;
    return this;
  }

   /**
   * Get unstrukturierteSchreibweise
   * @return unstrukturierteSchreibweise
  **/
  @Schema(description = "")
  public String getUnstrukturierteSchreibweise() {
    return unstrukturierteSchreibweise;
  }

  public void setUnstrukturierteSchreibweise(String unstrukturierteSchreibweise) {
    this.unstrukturierteSchreibweise = unstrukturierteSchreibweise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NachnameType nachnameType = (NachnameType) o;
    return Objects.equals(this.name, nachnameType.name) &&
        Objects.equals(this.namensbestandteil, nachnameType.namensbestandteil) &&
        Objects.equals(this.unstrukturierteSchreibweise, nachnameType.unstrukturierteSchreibweise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namensbestandteil, unstrukturierteSchreibweise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NachnameType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namensbestandteil: ").append(toIndentedString(namensbestandteil)).append("\n");
    sb.append("    unstrukturierteSchreibweise: ").append(toIndentedString(unstrukturierteSchreibweise)).append("\n");
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
