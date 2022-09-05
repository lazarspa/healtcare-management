package it.lazar.spasojevic.healthcarebe.persist.repository;


import it.lazar.spasojevic.healthcarebe.persist.model.OrganizationDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationDO,Long>, JpaSpecificationExecutor<OrganizationDO> {

}
