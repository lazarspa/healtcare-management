package it.lazar.spasojevic.healthcare.controller;

import it.lazar.spasojevic.healthcare.common.OperationResult;
import it.lazar.spasojevic.healthcare.dto.GenericOutputDTO;
import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;
import it.lazar.spasojevic.healthcare.service.OrganizationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orgtype")
public class OrganizationTypeController {

    @Autowired
    private OrganizationTypeService organizationTypeService;

    @GetMapping("/_search")
    public OperationResult<List<OrganizationTypeDTO>> findAll(){

        List<OrganizationTypeDTO> results = organizationTypeService.findAll();

       return OperationResult.success(results);
    }

    @PostMapping("/upload")
    public OperationResult<GenericOutputDTO> upload(@RequestBody OrganizationTypeDTO inputDto){

        GenericOutputDTO outputDto = organizationTypeService.save(inputDto);

        if(!outputDto.isSuccess())
            return OperationResult.failure(outputDto.getErrorMessage());

        return OperationResult.success(outputDto);
    }

    @DeleteMapping("/delete/{id}")
    public OperationResult<GenericOutputDTO> upload(@PathVariable Long id){

        OrganizationTypeDTO inputDto = OrganizationTypeDTO.builder()
                .id(id)
                .build();

        GenericOutputDTO outputDto = organizationTypeService.delete(inputDto);

        if(!outputDto.isSuccess())
            return OperationResult.failure(outputDto.getErrorMessage());

        return OperationResult.success(outputDto);
    }
}
