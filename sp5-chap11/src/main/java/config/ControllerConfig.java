package config;

import controller.RegisterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import spring.MemberRegisterService;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Autowired
    public RegisterController registerController() {
        //        controller.setMemberRegisterService(memberRegSvc);
        return new RegisterController();
    }

/*
    @Bean
    public ServeyController serveyController() {
        return new ServeyController;
    }
*/


    }
