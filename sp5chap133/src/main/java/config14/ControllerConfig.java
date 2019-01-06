package config14;

import controller14.LoginController;
import controller14.LogoutController;
import controller14.RegisterController;
import controller14.changeController.ChangePwdController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring14.AuthService;
import spring14.ChangePasswordService;
import spring14.MemberRegisterService;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Autowired
    private AuthService authService;

    @Autowired
    private ChangePasswordService changePasswordService;


    @Bean
    public RegisterController registerController() {
        RegisterController controller = new RegisterController();
        controller.setMemberRegisterService(memberRegSvc);
        return controller;
    }


    /*@Bean
    public TestController testController() {
        return new TestController();
    }*/

    @Bean
    public LoginController loginController() {
        LoginController controller = new LoginController();
        controller.setAuthService(authService);
        return controller;
    }

    @Bean
    public LogoutController logoutController() {
        return new LogoutController();
    }

    @Bean
    public ChangePwdController changePwdController() {
        ChangePwdController controller = new ChangePwdController();
        controller.setChangePasswordService(changePasswordService);
        return controller;
    }


}
