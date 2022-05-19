package io.muenchendigital.digiwf.okewo.integration.domain.mapper;

import io.muenchendigital.digiwf.okewo.integration.api.dto.QueriesDto;
import io.muenchendigital.digiwf.okewo.integration.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.okewo.integration.domain.model.QueriesModel;
import org.mapstruct.Mapper;

@Mapper(config = MapstructConfiguration.class)
public interface QueriesMapper {

    QueriesModel dto2Model(final QueriesDto dto);

}
