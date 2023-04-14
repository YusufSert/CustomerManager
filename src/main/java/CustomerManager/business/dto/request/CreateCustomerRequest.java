package CustomerManager.business.dto.request;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequest {
    private String nationalityId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}
