package config;

import controller.RegisterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.MemberRegisterService;

@Configuration
public class ControllerConfig111 {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Bean
    public RegisterController registerController() {
        return  new RegisterController();
    }


}
