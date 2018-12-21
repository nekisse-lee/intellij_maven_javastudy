package config;

import controller.ChangePwdController;
import controller.RegisterController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.MemberRegisterService;

@Configuration
@ComponentScan(basePackages = {"survey", "spring","interceptor"})
public class ControllerConfig13 {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Bean
    public RegisterController registerController() {
        return new RegisterController();
    }

    @Bean
    public ChangePwdController changePwdController() {
        return new ChangePwdController();
    }


/*
    @Bean
    public SurveyController surveyController() {
        return  new SurveyController();
    }
*/
}
