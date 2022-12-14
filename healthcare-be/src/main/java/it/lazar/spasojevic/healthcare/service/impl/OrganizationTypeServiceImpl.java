package it.lazar.spasojevic.healthcare.service.impl;

import it.lazar.spasojevic.healthcare.dto.GenericOutputDTO;
import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;
import it.lazar.spasojevic.healthcare.mapper.OrganizationTypeMapper;
import it.lazar.spasojevic.healthcare.persist.model.OrganizationTypeDO;
import it.lazar.spasojevic.healthcare.persist.repository.OrganizationTypeRepository;
import it.lazar.spasojevic.healthcare.service.OrganizationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
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
    @Transactional(readOnly = true)
    public List<OrganizationTypeDTO> findAll() {

        List<OrganizationTypeDO> results = organizationTypeRepository.findAll();

        return results.stream()
                .map(item -> organizationTypeMapper.toDTO(item))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public GenericOutputDTO delete(OrganizationTypeDTO inputDto) {

        GenericOutputDTO genericOutputDTO =  new GenericOutputDTO();
        genericOutputDTO.setSuccess(true);

        Optional<OrganizationTypeDO> orgType = organizationTypeRepository.findById(inputDto.getId());

        if(orgType.isEmpty()) {
            genericOutputDTO.getErrorMessage().put("id","Organization type with ID: {" + inputDto.getId() + "} does not exist");
            genericOutputDTO.setSuccess(false);
        }

        return genericOutputDTO;
    }

    public GenericOutputDTO save(OrganizationTypeDTO inputDto) {

        GenericOutputDTO genericOutputDTO =  new GenericOutputDTO();
        genericOutputDTO.setSuccess(true);

            OrganizationTypeDO organizationTypeDO = organizationTypeMapper.toEntity(inputDto);
            organizationTypeDO.setId(null);
            organizationTypeRepository.save(organizationTypeDO);
        try{
        }
        catch (Exception e){
            genericOutputDTO.getErrorMessage().put("error","Error executing save operation ");
            genericOutputDTO.setSuccess(false);
            System.out.println("ERRORRRRRRRR" + e.getMessage());
        }

        return genericOutputDTO;
    }
}
