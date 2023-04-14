package CustomerManager.adapters.abstracts;

import CustomerManager.business.dto.request.CreateCustomerRequest;

public interface TCIdentityValidator {
    boolean isIdentityValid(CreateCustomerRequest r) throws Exception;
}
