package config133;

import controller133.LoginController;
import controller133.RegisterController;
import controller133.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring133.AuthService;
import spring133.MemberRegisterService;

@Configuration
@ComponentScan(basePackages = "controller133")
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Autowired
    private AuthService authService;


    @Bean
    public RegisterController registerController() {
        RegisterController controller = new RegisterController();
        controller.setMemberRegisterService(memberRegSvc);
        return controller;
    }


    @Bean
    public TestController testController() {
        return new TestController();
    }

    @Bean
    public LoginController loginController() {

        LoginController controller = new LoginController();
        controller.setAuthService(authService);
        return controller;
    }



}
