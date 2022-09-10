package it.lazar.spasojevic.healthcare.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrganizationTypeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2151798366466507913L;

    private Long id;

    private String name;
}
