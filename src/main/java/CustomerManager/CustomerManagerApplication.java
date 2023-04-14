package CustomerManager;

import CustomerManager.business.abstracts.CustomerService;
import CustomerManager.business.concretes.NeroCustomerManager;
import CustomerManager.business.concretes.StarbucksCustomerManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagerApplication.class, args);
	}
}
