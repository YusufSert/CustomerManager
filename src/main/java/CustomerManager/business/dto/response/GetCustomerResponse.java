package CustomerManager.business.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerResponse {
    private int id;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
