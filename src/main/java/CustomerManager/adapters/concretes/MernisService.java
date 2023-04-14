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
        mersinRequestSetup(r);
            return soap.TCKimlikNoDogrula(
                nationalityId,
                firstName,
                lastName,
                dateOfBirth
            );
    }

    private void mersinRequestSetup(CreateCustomerRequest r) {
        this.nationalityId = Long.parseLong(r.getNationalityId());
        this.firstName = r.getFirstName();
        this.lastName = r.getLastName();
        this.dateOfBirth = r.getDateOfBirth().getYear();
    }

 }
