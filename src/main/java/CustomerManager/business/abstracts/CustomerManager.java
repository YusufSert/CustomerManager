package CustomerManager.business.abstracts;

import CustomerManager.business.dto.request.CreateCustomerRequest;
import CustomerManager.business.dto.response.GetCustomerResponse;
import CustomerManager.entities.Customer;
import CustomerManager.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;


@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;

    public void add(CreateCustomerRequest request){
        Customer customer = mapper.map(request, Customer.class);
        repository.save(customer);
    }

    public GetCustomerResponse getById(int id) {
        Customer customer = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found !"));
        return mapper.map(customer, GetCustomerResponse.class);
    }
}
