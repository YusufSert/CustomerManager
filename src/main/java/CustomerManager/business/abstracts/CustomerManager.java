package CustomerManager.business.abstracts;

import CustomerManager.business.dto.request.CreateCustomerRequest;
import CustomerManager.business.dto.response.GetCustomerResponse;
import CustomerManager.entities.Customer;
import CustomerManager.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.modelmapper.ModelMapper;

@Getter
@AllArgsConstructor
//Think of the
//word “extends” as meaning, “I want
//to extend the functionality of the
//superclass”.
public abstract class CustomerManager {
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
