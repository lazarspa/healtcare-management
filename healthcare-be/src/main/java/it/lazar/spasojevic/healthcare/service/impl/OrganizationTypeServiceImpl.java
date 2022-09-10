package it.lazar.spasojevic.healthcare.service.impl;

import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;
import it.lazar.spasojevic.healthcare.mapper.OrganizationTypeMapper;
import it.lazar.spasojevic.healthcare.persist.model.OrganizationTypeDO;
import it.lazar.spasojevic.healthcare.persist.repository.OrganizationTypeRepository;
import it.lazar.spasojevic.healthcare.service.OrganizationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrganizationTypeServiceImpl implements OrganizationTypeService {

    private final OrganizationTypeRepository organizationTypeRepository;

    private final OrganizationTypeMapper organizationTypeMapper;

    @Autowired
    public OrganizationTypeServiceImpl(OrganizationTypeRepository organizationTypeRepository, OrganizationTypeMapper organizationTypeMapper) {
        this.organizationTypeRepository = organizationTypeRepository;
        this.organizationTypeMapper = organizationTypeMapper;
    }

    @Override
    public List<OrganizationTypeDTO> findAll() {

        List<OrganizationTypeDO> results = organizationTypeRepository.findAll();

        return results.stream()
                .map(item -> organizationTypeMapper.toDTO(item))
                .collect(Collectors.toList());
    }
}
