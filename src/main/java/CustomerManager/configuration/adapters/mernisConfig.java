package CustomerManager.configuration.adapters;

import CustomerManager.adapters.mernis.VMFKPSPublicSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mernisConfig {
    @Bean
    public VMFKPSPublicSoap getMernisSoap() {
        return new VMFKPSPublicSoap();
    }
}
