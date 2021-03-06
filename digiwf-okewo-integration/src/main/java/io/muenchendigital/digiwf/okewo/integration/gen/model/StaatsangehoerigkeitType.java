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
 * StaatsangehoerigkeitType
 */


public class StaatsangehoerigkeitType {
  @JsonProperty("schluessel")
  private String schluessel = null;

  @JsonProperty("text")
  private String text = null;

  public StaatsangehoerigkeitType schluessel(String schluessel) {
    this.schluessel = schluessel;
    return this;
  }

   /**
   * Get schluessel
   * @return schluessel
  **/
  @Schema(description = "")
  public String getSchluessel() {
    return schluessel;
  }

  public void setSchluessel(String schluessel) {
    this.schluessel = schluessel;
  }

  public StaatsangehoerigkeitType text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaatsangehoerigkeitType staatsangehoerigkeitType = (StaatsangehoerigkeitType) o;
    return Objects.equals(this.schluessel, staatsangehoerigkeitType.schluessel) &&
        Objects.equals(this.text, staatsangehoerigkeitType.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schluessel, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaatsangehoerigkeitType {\n");
    
    sb.append("    schluessel: ").append(toIndentedString(schluessel)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
