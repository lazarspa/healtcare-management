package it.lazar.spasojevic.healthcare.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrganizationTypeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2151798366466507913L;

    @NotBlank
    private Long id;

    @NotBlank
    private String name;
}
