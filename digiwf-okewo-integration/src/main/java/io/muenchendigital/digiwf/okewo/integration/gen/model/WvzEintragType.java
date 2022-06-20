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
 * WvzEintragType
 */


public class WvzEintragType {
  @JsonProperty("gebietskoerperschaft")
  private String gebietskoerperschaft = null;

  @JsonProperty("staat")
  private String staat = null;

  public WvzEintragType gebietskoerperschaft(String gebietskoerperschaft) {
    this.gebietskoerperschaft = gebietskoerperschaft;
    return this;
  }

   /**
   * Get gebietskoerperschaft
   * @return gebietskoerperschaft
  **/
  @Schema(description = "")
  public String getGebietskoerperschaft() {
    return gebietskoerperschaft;
  }

  public void setGebietskoerperschaft(String gebietskoerperschaft) {
    this.gebietskoerperschaft = gebietskoerperschaft;
  }

  public WvzEintragType staat(String staat) {
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
    WvzEintragType wvzEintragType = (WvzEintragType) o;
    return Objects.equals(this.gebietskoerperschaft, wvzEintragType.gebietskoerperschaft) &&
        Objects.equals(this.staat, wvzEintragType.staat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gebietskoerperschaft, staat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WvzEintragType {\n");
    
    sb.append("    gebietskoerperschaft: ").append(toIndentedString(gebietskoerperschaft)).append("\n");
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
