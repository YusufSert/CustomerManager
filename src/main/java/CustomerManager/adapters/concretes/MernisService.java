package CustomerManager.adapters.concretes;

import CustomerManager.adapters.abstracts.TCIdentityValidator;
import CustomerManager.adapters.mernis.VMFKPSPublicSoap;
import CustomerManager.business.dto.request.CreateCustomerRequest;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;


@Service
public class MernisService implements TCIdentityValidator {

    private final VMFKPSPublicSoap soap;
    MernisService(VMFKPSPublicSoap soap) {
        this.soap = soap;
    }

    long nationalityId ;
    String firstName;
    String lastName;
    int dateOfBirth;

    @Override
    public boolean isIdentityValid(CreateCustomerRequest r) throws Exception {
        initializeLocalVariables(r);
            return soap.TCKimlikNoDogrula(
                this.nationalityId,
                this.firstName,
                this.lastName,
                this.dateOfBirth
            );
    }

    private void initializeLocalVariables(CreateCustomerRequest r) {
        this.nationalityId = Long.parseLong(r.getNationalityId());
        this.firstName = r.getFirstName();
        this.lastName = r.getLastName();
        this.dateOfBirth = r.getDateOfBirth().getYear();
    }

 }
