package it.lazar.spasojevic.healthcare.test.repository;

import it.lazar.spasojevic.healthcare.persist.model.OrganizationTypeDO;
import it.lazar.spasojevic.healthcare.persist.repository.OrganizationTypeRepository;
import it.lazar.spasojevic.healthcare.test.config.DatasourceConfigTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@SpringBootTest(classes = {DatasourceConfigTest.class})
public class OrganizationTypeRepositoryTest {


    @Autowired
    private OrganizationTypeRepository organizationTypeRepository;

    @Test
    public void getById_OK(){


        Optional<OrganizationTypeDO> byId = organizationTypeRepository.findById(1L);


        assertTrue(!byId.isEmpty());
        assertEquals(1,byId.get().getId());


        Optional<OrganizationTypeDO> byId1 = organizationTypeRepository.findById(2L);

        assertEquals(2,byId1.get().getId());

        List<OrganizationTypeDO> all = organizationTypeRepository.findAll();
        System.out.println(all);
    }

}
