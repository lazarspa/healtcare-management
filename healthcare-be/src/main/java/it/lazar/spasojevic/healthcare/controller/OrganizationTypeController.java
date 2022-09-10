package it.lazar.spasojevic.healthcare.controller;

import it.lazar.spasojevic.healthcare.common.OperationResult;
import it.lazar.spasojevic.healthcare.dto.OrganizationTypeDTO;
import it.lazar.spasojevic.healthcare.service.OrganizationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/orgtype")
public class OrganizationTypeController {

    @Autowired
    private OrganizationTypeService organizationTypeService;

    @GetMapping("_search")
    public OperationResult<List<OrganizationTypeDTO>> findAll(){

        List<OrganizationTypeDTO> results = organizationTypeService.findAll();

       return OperationResult.success(results);
    }
}
