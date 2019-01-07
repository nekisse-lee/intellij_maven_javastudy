package config16;

import controller16.*;
import controller16.changeController.ChangePwdController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring16.AuthService;
import spring16.ChangePasswordService;
import spring16.MemberDao;
import spring16.MemberRegisterService;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegSvc;

    @Autowired
    private AuthService authService;

    @Autowired
    private ChangePasswordService changePasswordService;

    @Autowired
    private MemberDao memberDao;


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

    @Bean
    public MemberListController memberListController() {
        MemberListController controller = new MemberListController();
        controller.setMemberDao(memberDao);
        return controller;
    }


    @Bean
    public MemberDetailController memberDetailController() {
        MemberDetailController controller = new MemberDetailController();
        controller.setMemberDao(memberDao);
        return controller;
    }

    @Bean
    public CommonExceptionHandler handler() {
        return new CommonExceptionHandler();
    }


}
