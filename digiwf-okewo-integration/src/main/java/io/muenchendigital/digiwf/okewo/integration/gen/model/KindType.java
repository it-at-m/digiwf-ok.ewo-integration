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
import io.muenchendigital.digiwf.okewo.integration.gen.model.NamenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SperreType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SterbedatenType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * KindType
 */


public class KindType {
  @JsonProperty("namen")
  private NamenType namen = null;

  @JsonProperty("ordnungsmerkmal")
  private String ordnungsmerkmal = null;

  @JsonProperty("sperren")
  private List<SperreType> sperren = null;

  /**
   * Gets or Sets personstatus
   */
  public enum PersonstatusEnum {
    AKTUELLER_FESTER_EINWOHNER("AKTUELLER_FESTER_EINWOHNER"),
    AKTUELLER_SEEMANN("AKTUELLER_SEEMANN"),
    AKTUELLER_OFW("AKTUELLER_OFW"),
    AKTUELLER_NICHTMELDEPFLICHTIGER_FESTER_EINWOHNER("AKTUELLER_NICHTMELDEPFLICHTIGER_FESTER_EINWOHNER"),
    INAKTUELLER_FESTER_EINWOHNER("INAKTUELLER_FESTER_EINWOHNER"),
    INAKTUELLER_NICHTMELDEPFLICHTIGER_FESTER_EINWOHNER("INAKTUELLER_NICHTMELDEPFLICHTIGER_FESTER_EINWOHNER"),
    EXTERNE_PERSON("EXTERNE_PERSON"),
    JURISTISCHE_PERSON("JURISTISCHE_PERSON"),
    KEIN_STATUS("KEIN_STATUS");

    private String value;

    PersonstatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static PersonstatusEnum fromValue(String input) {
      for (PersonstatusEnum b : PersonstatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("personstatus")
  private PersonstatusEnum personstatus = null;

  @JsonProperty("geburtsdatum")
  private GeburtsdatumType geburtsdatum = null;

  @JsonProperty("sterbedaten")
  private SterbedatenType sterbedaten = null;

  @JsonProperty("geschlecht")
  private String geschlecht = null;

  public KindType namen(NamenType namen) {
    this.namen = namen;
    return this;
  }

   /**
   * Get namen
   * @return namen
  **/
  @Valid
  @Schema(description = "")
  public NamenType getNamen() {
    return namen;
  }

  public void setNamen(NamenType namen) {
    this.namen = namen;
  }

  public KindType ordnungsmerkmal(String ordnungsmerkmal) {
    this.ordnungsmerkmal = ordnungsmerkmal;
    return this;
  }

   /**
   * Get ordnungsmerkmal
   * @return ordnungsmerkmal
  **/
  @Schema(description = "")
  public String getOrdnungsmerkmal() {
    return ordnungsmerkmal;
  }

  public void setOrdnungsmerkmal(String ordnungsmerkmal) {
    this.ordnungsmerkmal = ordnungsmerkmal;
  }

  public KindType sperren(List<SperreType> sperren) {
    this.sperren = sperren;
    return this;
  }

  public KindType addSperrenItem(SperreType sperrenItem) {
    if (this.sperren == null) {
      this.sperren = new ArrayList<>();
    }
    this.sperren.add(sperrenItem);
    return this;
  }

   /**
   * Get sperren
   * @return sperren
  **/
  @Valid
  @Schema(description = "")
  public List<SperreType> getSperren() {
    return sperren;
  }

  public void setSperren(List<SperreType> sperren) {
    this.sperren = sperren;
  }

  public KindType personstatus(PersonstatusEnum personstatus) {
    this.personstatus = personstatus;
    return this;
  }

   /**
   * Get personstatus
   * @return personstatus
  **/
  @Schema(description = "")
  public PersonstatusEnum getPersonstatus() {
    return personstatus;
  }

  public void setPersonstatus(PersonstatusEnum personstatus) {
    this.personstatus = personstatus;
  }

  public KindType geburtsdatum(GeburtsdatumType geburtsdatum) {
    this.geburtsdatum = geburtsdatum;
    return this;
  }

   /**
   * Get geburtsdatum
   * @return geburtsdatum
  **/
  @Valid
  @Schema(description = "")
  public GeburtsdatumType getGeburtsdatum() {
    return geburtsdatum;
  }

  public void setGeburtsdatum(GeburtsdatumType geburtsdatum) {
    this.geburtsdatum = geburtsdatum;
  }

  public KindType sterbedaten(SterbedatenType sterbedaten) {
    this.sterbedaten = sterbedaten;
    return this;
  }

   /**
   * Get sterbedaten
   * @return sterbedaten
  **/
  @Valid
  @Schema(description = "")
  public SterbedatenType getSterbedaten() {
    return sterbedaten;
  }

  public void setSterbedaten(SterbedatenType sterbedaten) {
    this.sterbedaten = sterbedaten;
  }

  public KindType geschlecht(String geschlecht) {
    this.geschlecht = geschlecht;
    return this;
  }

   /**
   * Get geschlecht
   * @return geschlecht
  **/
  @Schema(description = "")
  public String getGeschlecht() {
    return geschlecht;
  }

  public void setGeschlecht(String geschlecht) {
    this.geschlecht = geschlecht;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KindType kindType = (KindType) o;
    return Objects.equals(this.namen, kindType.namen) &&
        Objects.equals(this.ordnungsmerkmal, kindType.ordnungsmerkmal) &&
        Objects.equals(this.sperren, kindType.sperren) &&
        Objects.equals(this.personstatus, kindType.personstatus) &&
        Objects.equals(this.geburtsdatum, kindType.geburtsdatum) &&
        Objects.equals(this.sterbedaten, kindType.sterbedaten) &&
        Objects.equals(this.geschlecht, kindType.geschlecht);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namen, ordnungsmerkmal, sperren, personstatus, geburtsdatum, sterbedaten, geschlecht);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KindType {\n");
    
    sb.append("    namen: ").append(toIndentedString(namen)).append("\n");
    sb.append("    ordnungsmerkmal: ").append(toIndentedString(ordnungsmerkmal)).append("\n");
    sb.append("    sperren: ").append(toIndentedString(sperren)).append("\n");
    sb.append("    personstatus: ").append(toIndentedString(personstatus)).append("\n");
    sb.append("    geburtsdatum: ").append(toIndentedString(geburtsdatum)).append("\n");
    sb.append("    sterbedaten: ").append(toIndentedString(sterbedaten)).append("\n");
    sb.append("    geschlecht: ").append(toIndentedString(geschlecht)).append("\n");
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
