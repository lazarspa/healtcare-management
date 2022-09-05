package it.lazar.spasojevic.healthcare.persist.model;

import it.lazar.spasojevic.healthcare.persist.model.enumeration.Gender;
import it.lazar.spasojevic.healthcare.persist.model.enumeration.PractitionerQualification;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "PRACT")
public class PractitionerDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1114367789023404448L;

    @Id
    @Column(name = "PRACT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRACT_IDENT")
    private String identifier;

    @Column(name = "PRACT_ACTIVE")
    private Boolean active = true;

    @Column(name = "PRACT_NAME")
    private String name;

    @Column(name = "PRACT_SURN")
    private String surname;

    @Column(name = "PRACT_GEND")
    private Gender gender;

    @Column(name = "PRACT_BDAY")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "PRACT_ADDRESS")
    private String address;

    @Column(name = "PRACT_PHONE")
    private String phone;

    @Column(name = "PRACT_EMAIL")
    private String email;

    @Column(name = "PRACT_QUALI")
    private PractitionerQualification qualification;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRACT_ORG",referencedColumnName = "ORG_ID")
    private OrganizationDO organization;

    //TODO avoid using many to many -> create assocaiation class
//    @ManyToMany(mappedBy = "practitioners")
//    @JsonIgnore
//    private List<Examination> examinations = new ArrayList<>();
}
