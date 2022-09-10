package it.lazar.spasojevic.healthcare.service;

import it.lazar.spasojevic.healthcare.dto.GenericOutputDTO;
import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;

import java.util.List;

public interface OrganizationTypeService {

    List<OrganizationTypeDTO> findAll();

    GenericOutputDTO delete(OrganizationTypeDTO inputDto);
    GenericOutputDTO save(OrganizationTypeDTO inputDto);

}
