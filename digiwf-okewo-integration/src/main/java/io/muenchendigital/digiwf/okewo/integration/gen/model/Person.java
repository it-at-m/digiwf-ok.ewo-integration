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
import io.muenchendigital.digiwf.okewo.integration.gen.model.AnschriftType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.FamilienstanddatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.GeburtsdatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.NamenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.StaatsangehoerigkeitType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SterbedatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.WaffenUndSprengstoffrechtlicheErlaubnisType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.WaffenbesitzVerbotType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Person
 */


public class Person {
  @JsonProperty("auskunftssperre")
  private String auskunftssperre = null;

  @JsonProperty("ordnungsmerkmal")
  private String ordnungsmerkmal = null;

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

  @JsonProperty("geburtsdaten")
  private GeburtsdatenType geburtsdaten = null;

  @JsonProperty("geschlecht")
  private String geschlecht = null;

  @JsonProperty("sterbedaten")
  private SterbedatenType sterbedaten = null;

  @JsonProperty("familienstanddaten")
  private FamilienstanddatenType familienstanddaten = null;

  @JsonProperty("namen")
  private NamenType namen = null;

  @JsonProperty("melderegisterAnschrift")
  private AnschriftType melderegisterAnschrift = null;

  @JsonProperty("sprengstoffrechtlicheErlaubnis")
  private WaffenUndSprengstoffrechtlicheErlaubnisType sprengstoffrechtlicheErlaubnis = null;

  @JsonProperty("waffenrechtlicheErlaubnis")
  private WaffenUndSprengstoffrechtlicheErlaubnisType waffenrechtlicheErlaubnis = null;

  @JsonProperty("waffenbesitzVerbot")
  private WaffenbesitzVerbotType waffenbesitzVerbot = null;

  @JsonProperty("staatsangehoerigkeiten")
  private List<StaatsangehoerigkeitType> staatsangehoerigkeiten = null;

  public Person auskunftssperre(String auskunftssperre) {
    this.auskunftssperre = auskunftssperre;
    return this;
  }

   /**
   * Get auskunftssperre
   * @return auskunftssperre
  **/
  @Schema(description = "")
  public String getAuskunftssperre() {
    return auskunftssperre;
  }

  public void setAuskunftssperre(String auskunftssperre) {
    this.auskunftssperre = auskunftssperre;
  }

  public Person ordnungsmerkmal(String ordnungsmerkmal) {
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

  public Person personstatus(PersonstatusEnum personstatus) {
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

  public Person geburtsdaten(GeburtsdatenType geburtsdaten) {
    this.geburtsdaten = geburtsdaten;
    return this;
  }

   /**
   * Get geburtsdaten
   * @return geburtsdaten
  **/
  @Valid
  @Schema(description = "")
  public GeburtsdatenType getGeburtsdaten() {
    return geburtsdaten;
  }

  public void setGeburtsdaten(GeburtsdatenType geburtsdaten) {
    this.geburtsdaten = geburtsdaten;
  }

  public Person geschlecht(String geschlecht) {
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

  public Person sterbedaten(SterbedatenType sterbedaten) {
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

  public Person familienstanddaten(FamilienstanddatenType familienstanddaten) {
    this.familienstanddaten = familienstanddaten;
    return this;
  }

   /**
   * Get familienstanddaten
   * @return familienstanddaten
  **/
  @Valid
  @Schema(description = "")
  public FamilienstanddatenType getFamilienstanddaten() {
    return familienstanddaten;
  }

  public void setFamilienstanddaten(FamilienstanddatenType familienstanddaten) {
    this.familienstanddaten = familienstanddaten;
  }

  public Person namen(NamenType namen) {
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

  public Person melderegisterAnschrift(AnschriftType melderegisterAnschrift) {
    this.melderegisterAnschrift = melderegisterAnschrift;
    return this;
  }

   /**
   * Get melderegisterAnschrift
   * @return melderegisterAnschrift
  **/
  @Valid
  @Schema(description = "")
  public AnschriftType getMelderegisterAnschrift() {
    return melderegisterAnschrift;
  }

  public void setMelderegisterAnschrift(AnschriftType melderegisterAnschrift) {
    this.melderegisterAnschrift = melderegisterAnschrift;
  }

  public Person sprengstoffrechtlicheErlaubnis(WaffenUndSprengstoffrechtlicheErlaubnisType sprengstoffrechtlicheErlaubnis) {
    this.sprengstoffrechtlicheErlaubnis = sprengstoffrechtlicheErlaubnis;
    return this;
  }

   /**
   * Get sprengstoffrechtlicheErlaubnis
   * @return sprengstoffrechtlicheErlaubnis
  **/
  @Valid
  @Schema(description = "")
  public WaffenUndSprengstoffrechtlicheErlaubnisType getSprengstoffrechtlicheErlaubnis() {
    return sprengstoffrechtlicheErlaubnis;
  }

  public void setSprengstoffrechtlicheErlaubnis(WaffenUndSprengstoffrechtlicheErlaubnisType sprengstoffrechtlicheErlaubnis) {
    this.sprengstoffrechtlicheErlaubnis = sprengstoffrechtlicheErlaubnis;
  }

  public Person waffenrechtlicheErlaubnis(WaffenUndSprengstoffrechtlicheErlaubnisType waffenrechtlicheErlaubnis) {
    this.waffenrechtlicheErlaubnis = waffenrechtlicheErlaubnis;
    return this;
  }

   /**
   * Get waffenrechtlicheErlaubnis
   * @return waffenrechtlicheErlaubnis
  **/
  @Valid
  @Schema(description = "")
  public WaffenUndSprengstoffrechtlicheErlaubnisType getWaffenrechtlicheErlaubnis() {
    return waffenrechtlicheErlaubnis;
  }

  public void setWaffenrechtlicheErlaubnis(WaffenUndSprengstoffrechtlicheErlaubnisType waffenrechtlicheErlaubnis) {
    this.waffenrechtlicheErlaubnis = waffenrechtlicheErlaubnis;
  }

  public Person waffenbesitzVerbot(WaffenbesitzVerbotType waffenbesitzVerbot) {
    this.waffenbesitzVerbot = waffenbesitzVerbot;
    return this;
  }

   /**
   * Get waffenbesitzVerbot
   * @return waffenbesitzVerbot
  **/
  @Valid
  @Schema(description = "")
  public WaffenbesitzVerbotType getWaffenbesitzVerbot() {
    return waffenbesitzVerbot;
  }

  public void setWaffenbesitzVerbot(WaffenbesitzVerbotType waffenbesitzVerbot) {
    this.waffenbesitzVerbot = waffenbesitzVerbot;
  }

  public Person staatsangehoerigkeiten(List<StaatsangehoerigkeitType> staatsangehoerigkeiten) {
    this.staatsangehoerigkeiten = staatsangehoerigkeiten;
    return this;
  }

  public Person addStaatsangehoerigkeitenItem(StaatsangehoerigkeitType staatsangehoerigkeitenItem) {
    if (this.staatsangehoerigkeiten == null) {
      this.staatsangehoerigkeiten = new ArrayList<>();
    }
    this.staatsangehoerigkeiten.add(staatsangehoerigkeitenItem);
    return this;
  }

   /**
   * Get staatsangehoerigkeiten
   * @return staatsangehoerigkeiten
  **/
  @Valid
  @Schema(description = "")
  public List<StaatsangehoerigkeitType> getStaatsangehoerigkeiten() {
    return staatsangehoerigkeiten;
  }

  public void setStaatsangehoerigkeiten(List<StaatsangehoerigkeitType> staatsangehoerigkeiten) {
    this.staatsangehoerigkeiten = staatsangehoerigkeiten;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.auskunftssperre, person.auskunftssperre) &&
        Objects.equals(this.ordnungsmerkmal, person.ordnungsmerkmal) &&
        Objects.equals(this.personstatus, person.personstatus) &&
        Objects.equals(this.geburtsdaten, person.geburtsdaten) &&
        Objects.equals(this.geschlecht, person.geschlecht) &&
        Objects.equals(this.sterbedaten, person.sterbedaten) &&
        Objects.equals(this.familienstanddaten, person.familienstanddaten) &&
        Objects.equals(this.namen, person.namen) &&
        Objects.equals(this.melderegisterAnschrift, person.melderegisterAnschrift) &&
        Objects.equals(this.sprengstoffrechtlicheErlaubnis, person.sprengstoffrechtlicheErlaubnis) &&
        Objects.equals(this.waffenrechtlicheErlaubnis, person.waffenrechtlicheErlaubnis) &&
        Objects.equals(this.waffenbesitzVerbot, person.waffenbesitzVerbot) &&
        Objects.equals(this.staatsangehoerigkeiten, person.staatsangehoerigkeiten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auskunftssperre, ordnungsmerkmal, personstatus, geburtsdaten, geschlecht, sterbedaten, familienstanddaten, namen, melderegisterAnschrift, sprengstoffrechtlicheErlaubnis, waffenrechtlicheErlaubnis, waffenbesitzVerbot, staatsangehoerigkeiten);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    auskunftssperre: ").append(toIndentedString(auskunftssperre)).append("\n");
    sb.append("    ordnungsmerkmal: ").append(toIndentedString(ordnungsmerkmal)).append("\n");
    sb.append("    personstatus: ").append(toIndentedString(personstatus)).append("\n");
    sb.append("    geburtsdaten: ").append(toIndentedString(geburtsdaten)).append("\n");
    sb.append("    geschlecht: ").append(toIndentedString(geschlecht)).append("\n");
    sb.append("    sterbedaten: ").append(toIndentedString(sterbedaten)).append("\n");
    sb.append("    familienstanddaten: ").append(toIndentedString(familienstanddaten)).append("\n");
    sb.append("    namen: ").append(toIndentedString(namen)).append("\n");
    sb.append("    melderegisterAnschrift: ").append(toIndentedString(melderegisterAnschrift)).append("\n");
    sb.append("    sprengstoffrechtlicheErlaubnis: ").append(toIndentedString(sprengstoffrechtlicheErlaubnis)).append("\n");
    sb.append("    waffenrechtlicheErlaubnis: ").append(toIndentedString(waffenrechtlicheErlaubnis)).append("\n");
    sb.append("    waffenbesitzVerbot: ").append(toIndentedString(waffenbesitzVerbot)).append("\n");
    sb.append("    staatsangehoerigkeiten: ").append(toIndentedString(staatsangehoerigkeiten)).append("\n");
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
