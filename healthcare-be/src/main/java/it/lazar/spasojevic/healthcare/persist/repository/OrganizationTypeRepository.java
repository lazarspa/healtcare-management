package it.lazar.spasojevic.healthcare.persist.repository;

import it.lazar.spasojevic.healthcare.persist.model.OrganizationTypeDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface OrganizationTypeRepository extends JpaRepository<OrganizationTypeDO,Long>, JpaSpecificationExecutor<OrganizationTypeDO> {

    Optional<OrganizationTypeDO> findById(Long id);

}
