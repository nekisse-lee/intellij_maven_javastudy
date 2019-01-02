package config11;

import controller11.RegisterController;
import controller11.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring11.MemberRegisterService;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;


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



}
