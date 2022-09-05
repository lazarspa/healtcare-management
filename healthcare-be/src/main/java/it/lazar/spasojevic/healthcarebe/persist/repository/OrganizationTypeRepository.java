package it.lazar.spasojevic.healthcarebe.persist.repository;

import it.lazar.spasojevic.healthcarebe.persist.model.OrganizationTypeDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationTypeRepository extends JpaRepository<OrganizationTypeDO,Long>, JpaSpecificationExecutor<OrganizationTypeDO> {

}
