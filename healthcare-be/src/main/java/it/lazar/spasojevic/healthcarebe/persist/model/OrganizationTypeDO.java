package it.lazar.spasojevic.healthcarebe.persist.model;

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
@Table(name = "ORGTYPE")
public class OrganizationTypeDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 7564398243197801334L;

    @Id
    @Column(name = "ORGTYPE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORGTYPE_NAME")
    private String name;
}




