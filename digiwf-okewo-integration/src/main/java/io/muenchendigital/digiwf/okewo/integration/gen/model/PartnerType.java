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
import io.muenchendigital.digiwf.okewo.integration.gen.model.AnschriftErweitertType;
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
 * PartnerType
 */


public class PartnerType {
  @JsonProperty("namen")
  private NamenType namen = null;

  /**
   * Gets or Sets art
   */
  public enum ArtEnum {
    VH("VH"),
    LP("LP");

    private String value;

    ArtEnum(String value) {
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
    public static ArtEnum fromValue(String input) {
      for (ArtEnum b : ArtEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("art")
  private ArtEnum art = null;

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

  @JsonProperty("geschlecht")
  private String geschlecht = null;

  @JsonProperty("anschrift")
  private AnschriftErweitertType anschrift = null;

  @JsonProperty("sterbedaten")
  private SterbedatenType sterbedaten = null;

  public PartnerType namen(NamenType namen) {
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

  public PartnerType art(ArtEnum art) {
    this.art = art;
    return this;
  }

   /**
   * Get art
   * @return art
  **/
  @Schema(description = "")
  public ArtEnum getArt() {
    return art;
  }

  public void setArt(ArtEnum art) {
    this.art = art;
  }

  public PartnerType ordnungsmerkmal(String ordnungsmerkmal) {
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

  public PartnerType sperren(List<SperreType> sperren) {
    this.sperren = sperren;
    return this;
  }

  public PartnerType addSperrenItem(SperreType sperrenItem) {
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

  public PartnerType personstatus(PersonstatusEnum personstatus) {
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

  public PartnerType geburtsdatum(GeburtsdatumType geburtsdatum) {
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

  public PartnerType geschlecht(String geschlecht) {
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

  public PartnerType anschrift(AnschriftErweitertType anschrift) {
    this.anschrift = anschrift;
    return this;
  }

   /**
   * Get anschrift
   * @return anschrift
  **/
  @Valid
  @Schema(description = "")
  public AnschriftErweitertType getAnschrift() {
    return anschrift;
  }

  public void setAnschrift(AnschriftErweitertType anschrift) {
    this.anschrift = anschrift;
  }

  public PartnerType sterbedaten(SterbedatenType sterbedaten) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerType partnerType = (PartnerType) o;
    return Objects.equals(this.namen, partnerType.namen) &&
        Objects.equals(this.art, partnerType.art) &&
        Objects.equals(this.ordnungsmerkmal, partnerType.ordnungsmerkmal) &&
        Objects.equals(this.sperren, partnerType.sperren) &&
        Objects.equals(this.personstatus, partnerType.personstatus) &&
        Objects.equals(this.geburtsdatum, partnerType.geburtsdatum) &&
        Objects.equals(this.geschlecht, partnerType.geschlecht) &&
        Objects.equals(this.anschrift, partnerType.anschrift) &&
        Objects.equals(this.sterbedaten, partnerType.sterbedaten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namen, art, ordnungsmerkmal, sperren, personstatus, geburtsdatum, geschlecht, anschrift, sterbedaten);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerType {\n");
    
    sb.append("    namen: ").append(toIndentedString(namen)).append("\n");
    sb.append("    art: ").append(toIndentedString(art)).append("\n");
    sb.append("    ordnungsmerkmal: ").append(toIndentedString(ordnungsmerkmal)).append("\n");
    sb.append("    sperren: ").append(toIndentedString(sperren)).append("\n");
    sb.append("    personstatus: ").append(toIndentedString(personstatus)).append("\n");
    sb.append("    geburtsdatum: ").append(toIndentedString(geburtsdatum)).append("\n");
    sb.append("    geschlecht: ").append(toIndentedString(geschlecht)).append("\n");
    sb.append("    anschrift: ").append(toIndentedString(anschrift)).append("\n");
    sb.append("    sterbedaten: ").append(toIndentedString(sterbedaten)).append("\n");
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
