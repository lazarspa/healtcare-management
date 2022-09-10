package it.lazar.spasojevic.healthcare.mapper;

import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;
import it.lazar.spasojevic.healthcare.persist.model.OrganizationTypeDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationTypeMapper {

    OrganizationTypeDO toEntity(OrganizationTypeDTO dto);

    OrganizationTypeDTO toDTO(OrganizationTypeDO entity);
}
