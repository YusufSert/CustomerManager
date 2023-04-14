package CustomerManager.business.concretes;

import CustomerManager.business.abstracts.CustomerManager;

import CustomerManager.repo.CustomerRepository;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;


public class StarbucksCustomerManager extends CustomerManager{
    public StarbucksCustomerManager(CustomerRepository repository, ModelMapper mapper) {
        super(repository, mapper);
    }
}
