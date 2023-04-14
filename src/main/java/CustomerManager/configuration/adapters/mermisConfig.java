package CustomerManager.configuration.adapters;

import CustomerManager.adapters.mernis.VMFKPSPublicSoap;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mermisConfig {
    @Bean
    public VMFKPSPublicSoap getMernisSoap() {
        return new VMFKPSPublicSoap();
    }
}
