package io.muenchendigital.digiwf.okewo.integration.api.dto;

import io.muenchendigital.digiwf.okewo.integration.gen.model.SuchePersonAnfrage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SearchPersonRequestDto extends AbstractRequestDto {

    private SuchePersonAnfrage suchePersonAnfrage;

}
