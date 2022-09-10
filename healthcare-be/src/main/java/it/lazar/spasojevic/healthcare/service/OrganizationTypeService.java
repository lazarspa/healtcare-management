package it.lazar.spasojevic.healthcare.service;

import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;

import java.util.List;

public interface OrganizationTypeService {

    List<OrganizationTypeDTO> findAll();
}
