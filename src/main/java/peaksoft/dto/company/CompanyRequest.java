package peaksoft.dto.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest {
    @NotNull
    private String companyName;
    private String locatedCountry;
}
