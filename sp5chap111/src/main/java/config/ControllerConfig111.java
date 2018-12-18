package config;

import controller.RegisterController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig111 {


    @Bean
    public RegisterController registerController() {
        return  new RegisterController();
    }
}
