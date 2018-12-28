package config11;

import controller11.RegisterController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Bean
    public RegisterController registerController() {
        return new RegisterController();
    }
}
