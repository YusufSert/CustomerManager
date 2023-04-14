package CustomerManager.business.concretes;

import CustomerManager.business.abstracts.CustomerManager;

import CustomerManager.business.dto.response.GetCustomerResponse;
import CustomerManager.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@SuperBuilder
public class StarbucksCustomerManager extends CustomerManager {
}
