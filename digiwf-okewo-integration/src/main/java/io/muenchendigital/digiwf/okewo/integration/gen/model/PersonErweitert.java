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
import io.muenchendigital.digiwf.okewo.integration.gen.model.AbstractWohnungType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.FamilienstanddatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.FruehereNamenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.GeburtsdatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.KindType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.NamenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.OptionsDeutscherType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.PartnerType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.PassType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SperreType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.StaatsangehoerigkeitErweitertType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.SterbedatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.VertreterType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.WaffenUndSprengstoffrechtlicheErlaubnisErweitertType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.WaffenbesitzVerbotType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.WahldatenType;
import io.muenchendigital.digiwf.okewo.integration.gen.model.ZuzugdatenType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PersonErweitert
 */


public class PersonErweitert {
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

  @JsonProperty("doktorgradNachweis")
  private String doktorgradNachweis = null;

  @JsonProperty("sperren")
  private List<SperreType> sperren = null;

  @JsonProperty("religion")
  private String religion = null;

  @JsonProperty("wahldaten")
  private WahldatenType wahldaten = null;

  @JsonProperty("zuzugsdaten")
  private ZuzugdatenType zuzugsdaten = null;

  @JsonProperty("wohnungen")
  private List<AbstractWohnungType> wohnungen = null;

  @JsonProperty("passdaten")
  private List<PassType> passdaten = null;

  @JsonProperty("partner")
  private PartnerType partner = null;

  @JsonProperty("kinder")
  private List<KindType> kinder = null;

  @JsonProperty("vertreter")
  private List<VertreterType> vertreter = null;

  @JsonProperty("fruehereNamen")
  private FruehereNamenType fruehereNamen = null;

  @JsonProperty("waffenrechtlicheErlaubnisErweitert")
  private List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> waffenrechtlicheErlaubnisErweitert = null;

  @JsonProperty("sprengstoffrechtlicheErlaubnisErweitert")
  private List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> sprengstoffrechtlicheErlaubnisErweitert = null;

  @JsonProperty("waffenbesitzVerbot")
  private List<WaffenbesitzVerbotType> waffenbesitzVerbot = null;

  @JsonProperty("verlustDeutscheStaatsangehoerigkeit")
  private String verlustDeutscheStaatsangehoerigkeit = null;

  @JsonProperty("optionsDeutscherDaten")
  private OptionsDeutscherType optionsDeutscherDaten = null;

  @JsonProperty("artStaatsangehoerigkeit")
  private String artStaatsangehoerigkeit = null;

  @JsonProperty("frueheresOm")
  private String frueheresOm = null;

  @JsonProperty("zukuenftigesOm")
  private String zukuenftigesOm = null;

  @JsonProperty("staatsangehoerigkeiten")
  private List<StaatsangehoerigkeitErweitertType> staatsangehoerigkeiten = null;

  public PersonErweitert auskunftssperre(String auskunftssperre) {
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

  public PersonErweitert ordnungsmerkmal(String ordnungsmerkmal) {
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

  public PersonErweitert personstatus(PersonstatusEnum personstatus) {
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

  public PersonErweitert geburtsdaten(GeburtsdatenType geburtsdaten) {
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

  public PersonErweitert geschlecht(String geschlecht) {
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

  public PersonErweitert sterbedaten(SterbedatenType sterbedaten) {
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

  public PersonErweitert familienstanddaten(FamilienstanddatenType familienstanddaten) {
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

  public PersonErweitert namen(NamenType namen) {
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

  public PersonErweitert doktorgradNachweis(String doktorgradNachweis) {
    this.doktorgradNachweis = doktorgradNachweis;
    return this;
  }

   /**
   * Get doktorgradNachweis
   * @return doktorgradNachweis
  **/
  @Schema(description = "")
  public String getDoktorgradNachweis() {
    return doktorgradNachweis;
  }

  public void setDoktorgradNachweis(String doktorgradNachweis) {
    this.doktorgradNachweis = doktorgradNachweis;
  }

  public PersonErweitert sperren(List<SperreType> sperren) {
    this.sperren = sperren;
    return this;
  }

  public PersonErweitert addSperrenItem(SperreType sperrenItem) {
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

  public PersonErweitert religion(String religion) {
    this.religion = religion;
    return this;
  }

   /**
   * Get religion
   * @return religion
  **/
  @Schema(description = "")
  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public PersonErweitert wahldaten(WahldatenType wahldaten) {
    this.wahldaten = wahldaten;
    return this;
  }

   /**
   * Get wahldaten
   * @return wahldaten
  **/
  @Valid
  @Schema(description = "")
  public WahldatenType getWahldaten() {
    return wahldaten;
  }

  public void setWahldaten(WahldatenType wahldaten) {
    this.wahldaten = wahldaten;
  }

  public PersonErweitert zuzugsdaten(ZuzugdatenType zuzugsdaten) {
    this.zuzugsdaten = zuzugsdaten;
    return this;
  }

   /**
   * Get zuzugsdaten
   * @return zuzugsdaten
  **/
  @Valid
  @Schema(description = "")
  public ZuzugdatenType getZuzugsdaten() {
    return zuzugsdaten;
  }

  public void setZuzugsdaten(ZuzugdatenType zuzugsdaten) {
    this.zuzugsdaten = zuzugsdaten;
  }

  public PersonErweitert wohnungen(List<AbstractWohnungType> wohnungen) {
    this.wohnungen = wohnungen;
    return this;
  }

  public PersonErweitert addWohnungenItem(AbstractWohnungType wohnungenItem) {
    if (this.wohnungen == null) {
      this.wohnungen = new ArrayList<>();
    }
    this.wohnungen.add(wohnungenItem);
    return this;
  }

   /**
   * Get wohnungen
   * @return wohnungen
  **/
  @Valid
  @Schema(description = "")
  public List<AbstractWohnungType> getWohnungen() {
    return wohnungen;
  }

  public void setWohnungen(List<AbstractWohnungType> wohnungen) {
    this.wohnungen = wohnungen;
  }

  public PersonErweitert passdaten(List<PassType> passdaten) {
    this.passdaten = passdaten;
    return this;
  }

  public PersonErweitert addPassdatenItem(PassType passdatenItem) {
    if (this.passdaten == null) {
      this.passdaten = new ArrayList<>();
    }
    this.passdaten.add(passdatenItem);
    return this;
  }

   /**
   * Get passdaten
   * @return passdaten
  **/
  @Valid
  @Schema(description = "")
  public List<PassType> getPassdaten() {
    return passdaten;
  }

  public void setPassdaten(List<PassType> passdaten) {
    this.passdaten = passdaten;
  }

  public PersonErweitert partner(PartnerType partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @Valid
  @Schema(description = "")
  public PartnerType getPartner() {
    return partner;
  }

  public void setPartner(PartnerType partner) {
    this.partner = partner;
  }

  public PersonErweitert kinder(List<KindType> kinder) {
    this.kinder = kinder;
    return this;
  }

  public PersonErweitert addKinderItem(KindType kinderItem) {
    if (this.kinder == null) {
      this.kinder = new ArrayList<>();
    }
    this.kinder.add(kinderItem);
    return this;
  }

   /**
   * Get kinder
   * @return kinder
  **/
  @Valid
  @Schema(description = "")
  public List<KindType> getKinder() {
    return kinder;
  }

  public void setKinder(List<KindType> kinder) {
    this.kinder = kinder;
  }

  public PersonErweitert vertreter(List<VertreterType> vertreter) {
    this.vertreter = vertreter;
    return this;
  }

  public PersonErweitert addVertreterItem(VertreterType vertreterItem) {
    if (this.vertreter == null) {
      this.vertreter = new ArrayList<>();
    }
    this.vertreter.add(vertreterItem);
    return this;
  }

   /**
   * Get vertreter
   * @return vertreter
  **/
  @Valid
  @Schema(description = "")
  public List<VertreterType> getVertreter() {
    return vertreter;
  }

  public void setVertreter(List<VertreterType> vertreter) {
    this.vertreter = vertreter;
  }

  public PersonErweitert fruehereNamen(FruehereNamenType fruehereNamen) {
    this.fruehereNamen = fruehereNamen;
    return this;
  }

   /**
   * Get fruehereNamen
   * @return fruehereNamen
  **/
  @Valid
  @Schema(description = "")
  public FruehereNamenType getFruehereNamen() {
    return fruehereNamen;
  }

  public void setFruehereNamen(FruehereNamenType fruehereNamen) {
    this.fruehereNamen = fruehereNamen;
  }

  public PersonErweitert waffenrechtlicheErlaubnisErweitert(List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> waffenrechtlicheErlaubnisErweitert) {
    this.waffenrechtlicheErlaubnisErweitert = waffenrechtlicheErlaubnisErweitert;
    return this;
  }

  public PersonErweitert addWaffenrechtlicheErlaubnisErweitertItem(WaffenUndSprengstoffrechtlicheErlaubnisErweitertType waffenrechtlicheErlaubnisErweitertItem) {
    if (this.waffenrechtlicheErlaubnisErweitert == null) {
      this.waffenrechtlicheErlaubnisErweitert = new ArrayList<>();
    }
    this.waffenrechtlicheErlaubnisErweitert.add(waffenrechtlicheErlaubnisErweitertItem);
    return this;
  }

   /**
   * Get waffenrechtlicheErlaubnisErweitert
   * @return waffenrechtlicheErlaubnisErweitert
  **/
  @Valid
  @Schema(description = "")
  public List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> getWaffenrechtlicheErlaubnisErweitert() {
    return waffenrechtlicheErlaubnisErweitert;
  }

  public void setWaffenrechtlicheErlaubnisErweitert(List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> waffenrechtlicheErlaubnisErweitert) {
    this.waffenrechtlicheErlaubnisErweitert = waffenrechtlicheErlaubnisErweitert;
  }

  public PersonErweitert sprengstoffrechtlicheErlaubnisErweitert(List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> sprengstoffrechtlicheErlaubnisErweitert) {
    this.sprengstoffrechtlicheErlaubnisErweitert = sprengstoffrechtlicheErlaubnisErweitert;
    return this;
  }

  public PersonErweitert addSprengstoffrechtlicheErlaubnisErweitertItem(WaffenUndSprengstoffrechtlicheErlaubnisErweitertType sprengstoffrechtlicheErlaubnisErweitertItem) {
    if (this.sprengstoffrechtlicheErlaubnisErweitert == null) {
      this.sprengstoffrechtlicheErlaubnisErweitert = new ArrayList<>();
    }
    this.sprengstoffrechtlicheErlaubnisErweitert.add(sprengstoffrechtlicheErlaubnisErweitertItem);
    return this;
  }

   /**
   * Get sprengstoffrechtlicheErlaubnisErweitert
   * @return sprengstoffrechtlicheErlaubnisErweitert
  **/
  @Valid
  @Schema(description = "")
  public List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> getSprengstoffrechtlicheErlaubnisErweitert() {
    return sprengstoffrechtlicheErlaubnisErweitert;
  }

  public void setSprengstoffrechtlicheErlaubnisErweitert(List<WaffenUndSprengstoffrechtlicheErlaubnisErweitertType> sprengstoffrechtlicheErlaubnisErweitert) {
    this.sprengstoffrechtlicheErlaubnisErweitert = sprengstoffrechtlicheErlaubnisErweitert;
  }

  public PersonErweitert waffenbesitzVerbot(List<WaffenbesitzVerbotType> waffenbesitzVerbot) {
    this.waffenbesitzVerbot = waffenbesitzVerbot;
    return this;
  }

  public PersonErweitert addWaffenbesitzVerbotItem(WaffenbesitzVerbotType waffenbesitzVerbotItem) {
    if (this.waffenbesitzVerbot == null) {
      this.waffenbesitzVerbot = new ArrayList<>();
    }
    this.waffenbesitzVerbot.add(waffenbesitzVerbotItem);
    return this;
  }

   /**
   * Get waffenbesitzVerbot
   * @return waffenbesitzVerbot
  **/
  @Valid
  @Schema(description = "")
  public List<WaffenbesitzVerbotType> getWaffenbesitzVerbot() {
    return waffenbesitzVerbot;
  }

  public void setWaffenbesitzVerbot(List<WaffenbesitzVerbotType> waffenbesitzVerbot) {
    this.waffenbesitzVerbot = waffenbesitzVerbot;
  }

  public PersonErweitert verlustDeutscheStaatsangehoerigkeit(String verlustDeutscheStaatsangehoerigkeit) {
    this.verlustDeutscheStaatsangehoerigkeit = verlustDeutscheStaatsangehoerigkeit;
    return this;
  }

   /**
   * Get verlustDeutscheStaatsangehoerigkeit
   * @return verlustDeutscheStaatsangehoerigkeit
  **/
  @Schema(description = "")
  public String getVerlustDeutscheStaatsangehoerigkeit() {
    return verlustDeutscheStaatsangehoerigkeit;
  }

  public void setVerlustDeutscheStaatsangehoerigkeit(String verlustDeutscheStaatsangehoerigkeit) {
    this.verlustDeutscheStaatsangehoerigkeit = verlustDeutscheStaatsangehoerigkeit;
  }

  public PersonErweitert optionsDeutscherDaten(OptionsDeutscherType optionsDeutscherDaten) {
    this.optionsDeutscherDaten = optionsDeutscherDaten;
    return this;
  }

   /**
   * Get optionsDeutscherDaten
   * @return optionsDeutscherDaten
  **/
  @Valid
  @Schema(description = "")
  public OptionsDeutscherType getOptionsDeutscherDaten() {
    return optionsDeutscherDaten;
  }

  public void setOptionsDeutscherDaten(OptionsDeutscherType optionsDeutscherDaten) {
    this.optionsDeutscherDaten = optionsDeutscherDaten;
  }

  public PersonErweitert artStaatsangehoerigkeit(String artStaatsangehoerigkeit) {
    this.artStaatsangehoerigkeit = artStaatsangehoerigkeit;
    return this;
  }

   /**
   * Get artStaatsangehoerigkeit
   * @return artStaatsangehoerigkeit
  **/
  @Schema(description = "")
  public String getArtStaatsangehoerigkeit() {
    return artStaatsangehoerigkeit;
  }

  public void setArtStaatsangehoerigkeit(String artStaatsangehoerigkeit) {
    this.artStaatsangehoerigkeit = artStaatsangehoerigkeit;
  }

  public PersonErweitert frueheresOm(String frueheresOm) {
    this.frueheresOm = frueheresOm;
    return this;
  }

   /**
   * Get frueheresOm
   * @return frueheresOm
  **/
  @Schema(description = "")
  public String getFrueheresOm() {
    return frueheresOm;
  }

  public void setFrueheresOm(String frueheresOm) {
    this.frueheresOm = frueheresOm;
  }

  public PersonErweitert zukuenftigesOm(String zukuenftigesOm) {
    this.zukuenftigesOm = zukuenftigesOm;
    return this;
  }

   /**
   * Get zukuenftigesOm
   * @return zukuenftigesOm
  **/
  @Schema(description = "")
  public String getZukuenftigesOm() {
    return zukuenftigesOm;
  }

  public void setZukuenftigesOm(String zukuenftigesOm) {
    this.zukuenftigesOm = zukuenftigesOm;
  }

  public PersonErweitert staatsangehoerigkeiten(List<StaatsangehoerigkeitErweitertType> staatsangehoerigkeiten) {
    this.staatsangehoerigkeiten = staatsangehoerigkeiten;
    return this;
  }

  public PersonErweitert addStaatsangehoerigkeitenItem(StaatsangehoerigkeitErweitertType staatsangehoerigkeitenItem) {
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
  public List<StaatsangehoerigkeitErweitertType> getStaatsangehoerigkeiten() {
    return staatsangehoerigkeiten;
  }

  public void setStaatsangehoerigkeiten(List<StaatsangehoerigkeitErweitertType> staatsangehoerigkeiten) {
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
    PersonErweitert personErweitert = (PersonErweitert) o;
    return Objects.equals(this.auskunftssperre, personErweitert.auskunftssperre) &&
        Objects.equals(this.ordnungsmerkmal, personErweitert.ordnungsmerkmal) &&
        Objects.equals(this.personstatus, personErweitert.personstatus) &&
        Objects.equals(this.geburtsdaten, personErweitert.geburtsdaten) &&
        Objects.equals(this.geschlecht, personErweitert.geschlecht) &&
        Objects.equals(this.sterbedaten, personErweitert.sterbedaten) &&
        Objects.equals(this.familienstanddaten, personErweitert.familienstanddaten) &&
        Objects.equals(this.namen, personErweitert.namen) &&
        Objects.equals(this.doktorgradNachweis, personErweitert.doktorgradNachweis) &&
        Objects.equals(this.sperren, personErweitert.sperren) &&
        Objects.equals(this.religion, personErweitert.religion) &&
        Objects.equals(this.wahldaten, personErweitert.wahldaten) &&
        Objects.equals(this.zuzugsdaten, personErweitert.zuzugsdaten) &&
        Objects.equals(this.wohnungen, personErweitert.wohnungen) &&
        Objects.equals(this.passdaten, personErweitert.passdaten) &&
        Objects.equals(this.partner, personErweitert.partner) &&
        Objects.equals(this.kinder, personErweitert.kinder) &&
        Objects.equals(this.vertreter, personErweitert.vertreter) &&
        Objects.equals(this.fruehereNamen, personErweitert.fruehereNamen) &&
        Objects.equals(this.waffenrechtlicheErlaubnisErweitert, personErweitert.waffenrechtlicheErlaubnisErweitert) &&
        Objects.equals(this.sprengstoffrechtlicheErlaubnisErweitert, personErweitert.sprengstoffrechtlicheErlaubnisErweitert) &&
        Objects.equals(this.waffenbesitzVerbot, personErweitert.waffenbesitzVerbot) &&
        Objects.equals(this.verlustDeutscheStaatsangehoerigkeit, personErweitert.verlustDeutscheStaatsangehoerigkeit) &&
        Objects.equals(this.optionsDeutscherDaten, personErweitert.optionsDeutscherDaten) &&
        Objects.equals(this.artStaatsangehoerigkeit, personErweitert.artStaatsangehoerigkeit) &&
        Objects.equals(this.frueheresOm, personErweitert.frueheresOm) &&
        Objects.equals(this.zukuenftigesOm, personErweitert.zukuenftigesOm) &&
        Objects.equals(this.staatsangehoerigkeiten, personErweitert.staatsangehoerigkeiten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auskunftssperre, ordnungsmerkmal, personstatus, geburtsdaten, geschlecht, sterbedaten, familienstanddaten, namen, doktorgradNachweis, sperren, religion, wahldaten, zuzugsdaten, wohnungen, passdaten, partner, kinder, vertreter, fruehereNamen, waffenrechtlicheErlaubnisErweitert, sprengstoffrechtlicheErlaubnisErweitert, waffenbesitzVerbot, verlustDeutscheStaatsangehoerigkeit, optionsDeutscherDaten, artStaatsangehoerigkeit, frueheresOm, zukuenftigesOm, staatsangehoerigkeiten);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonErweitert {\n");
    
    sb.append("    auskunftssperre: ").append(toIndentedString(auskunftssperre)).append("\n");
    sb.append("    ordnungsmerkmal: ").append(toIndentedString(ordnungsmerkmal)).append("\n");
    sb.append("    personstatus: ").append(toIndentedString(personstatus)).append("\n");
    sb.append("    geburtsdaten: ").append(toIndentedString(geburtsdaten)).append("\n");
    sb.append("    geschlecht: ").append(toIndentedString(geschlecht)).append("\n");
    sb.append("    sterbedaten: ").append(toIndentedString(sterbedaten)).append("\n");
    sb.append("    familienstanddaten: ").append(toIndentedString(familienstanddaten)).append("\n");
    sb.append("    namen: ").append(toIndentedString(namen)).append("\n");
    sb.append("    doktorgradNachweis: ").append(toIndentedString(doktorgradNachweis)).append("\n");
    sb.append("    sperren: ").append(toIndentedString(sperren)).append("\n");
    sb.append("    religion: ").append(toIndentedString(religion)).append("\n");
    sb.append("    wahldaten: ").append(toIndentedString(wahldaten)).append("\n");
    sb.append("    zuzugsdaten: ").append(toIndentedString(zuzugsdaten)).append("\n");
    sb.append("    wohnungen: ").append(toIndentedString(wohnungen)).append("\n");
    sb.append("    passdaten: ").append(toIndentedString(passdaten)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    kinder: ").append(toIndentedString(kinder)).append("\n");
    sb.append("    vertreter: ").append(toIndentedString(vertreter)).append("\n");
    sb.append("    fruehereNamen: ").append(toIndentedString(fruehereNamen)).append("\n");
    sb.append("    waffenrechtlicheErlaubnisErweitert: ").append(toIndentedString(waffenrechtlicheErlaubnisErweitert)).append("\n");
    sb.append("    sprengstoffrechtlicheErlaubnisErweitert: ").append(toIndentedString(sprengstoffrechtlicheErlaubnisErweitert)).append("\n");
    sb.append("    waffenbesitzVerbot: ").append(toIndentedString(waffenbesitzVerbot)).append("\n");
    sb.append("    verlustDeutscheStaatsangehoerigkeit: ").append(toIndentedString(verlustDeutscheStaatsangehoerigkeit)).append("\n");
    sb.append("    optionsDeutscherDaten: ").append(toIndentedString(optionsDeutscherDaten)).append("\n");
    sb.append("    artStaatsangehoerigkeit: ").append(toIndentedString(artStaatsangehoerigkeit)).append("\n");
    sb.append("    frueheresOm: ").append(toIndentedString(frueheresOm)).append("\n");
    sb.append("    zukuenftigesOm: ").append(toIndentedString(zukuenftigesOm)).append("\n");
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
