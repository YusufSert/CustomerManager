package CustomerManager.business.abstracts;

import CustomerManager.business.dto.request.CreateCustomerRequest;
import CustomerManager.business.dto.response.GetCustomerResponse;


public interface CustomerService {
    void add(CreateCustomerRequest r);
    GetCustomerResponse getById(int id);
}
