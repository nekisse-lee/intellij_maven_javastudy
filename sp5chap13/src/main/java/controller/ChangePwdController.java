package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.AuthInfo;
import spring.ChangePasswordService;
import spring.ChangePwdCommandValidator;
import spring.WrongIdPasswordException;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/edit")
public class ChangePwdController {

    @Autowired
    private ChangePasswordService changePasswordService;

    @GetMapping("/changePassword")
    public void form(@ModelAttribute("command") ChangePwdCommand pwdCmd) {

    }
    /*
    @GetMapping("/changePassword")
    public String form(@ModelAttribute("command") ChangePwdCommand pwdCmd) {
        return "edit/changePassword";
    }
*/


    @PostMapping("/changePassword")
    public String summit(@ModelAttribute("command") ChangePwdCommand pwdCmd, Errors errors, HttpSession session) {
        new ChangePwdCommandValidator().validate(pwdCmd, errors);
        if (errors.hasErrors()) {
            return "edit/changePassword";
        }
        AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");

        try {
            changePasswordService.changePassword(authInfo.getEmail(), pwdCmd.getCurrentPassword(), pwdCmd.getNewPassword());
            return "edit/changedPwd";
        } catch (WrongIdPasswordException e) {
            errors.rejectValue("currentPassword", "notMatching");
            return "edit/changePassword";
        }
    }


}
