package it.lazar.spasojevic.healthcare.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.util.Pair;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericOutputDTO implements Serializable {

    private static final long serialVersionUID= 1279394198684406268L;

    private boolean success;

    private Map<String,String> errorMessage = new HashMap<>();

}
