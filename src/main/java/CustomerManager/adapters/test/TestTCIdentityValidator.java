package CustomerManager.adapters.test;

import CustomerManager.adapters.abstracts.TCIdentityValidator;
import CustomerManager.business.dto.request.CreateCustomerRequest;

public class TestTCIdentityValidator implements TCIdentityValidator {
    @Override
    public boolean isIdentityValid(CreateCustomerRequest r) {
        return true;
    }
}
