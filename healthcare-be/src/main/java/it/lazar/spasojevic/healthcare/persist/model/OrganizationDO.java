package it.lazar.spasojevic.healthcare.persist.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "ORG")
public class OrganizationDO implements Serializable {

    @Serial
    private static final long serialVersionUID = -5737278032282660300L;

    @Id
    @Column(name = "ORG_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORG_IDENT")
    private String identifier;

    @Column(name = "ORG_ACTIVE")
    private Boolean active = true;

    @Column(name = "ORG_NAME")
    private String name;

    @Column(name = "ORG_ADDRESS")
    private String address;

    @Column(name = "ORG_PHONE")
    private String phone;

    @Column(name = "ORG_EMAIL")
    private String email;

    @JoinColumn(name = "ORG_TYPE",referencedColumnName = "ORGTYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrganizationTypeDO type;
}
