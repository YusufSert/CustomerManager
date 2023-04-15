package CustomerManager.business.concretes;

import CustomerManager.business.abstracts.CustomerManager;

import CustomerManager.business.abstracts.CustomerService;
import CustomerManager.repo.CustomerRepository;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;


public class StarbucksCustomerManager extends CustomerManager implements CustomerService {
    public StarbucksCustomerManager(CustomerRepository repository, ModelMapper mapper) {
        super(repository, mapper);
    }
}
