package CustomerManager.business.concretes;

import CustomerManager.adapters.abstracts.TCIdentityValidator;
import CustomerManager.business.abstracts.CustomerManager;
import CustomerManager.business.abstracts.CustomerService;
import CustomerManager.business.dto.request.CreateCustomerRequest;
import CustomerManager.repo.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;



@Service
//Nero "is a" CustomerManager
//Use super for repository accepts if you need
public class NeroCustomerManager extends CustomerManager implements CustomerService {
    private final TCIdentityValidator validator;

    public NeroCustomerManager(CustomerRepository repository, ModelMapper mapper, TCIdentityValidator validator){
        super(repository, mapper);
        this.validator = validator;
    }

    @Override
    public void add(CreateCustomerRequest request){
        try {
            if(validator.isIdentityValid(request))
                super.add(request);
        } catch (Exception e) {
            throw new RuntimeException("User can not be registered");
        }
    }

}
