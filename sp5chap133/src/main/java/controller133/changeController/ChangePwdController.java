package controller133.changeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring133.AuthInfo;
import spring133.ChangePasswordService;
import spring133.WrongIdPasswordException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/edit/changePassword")
public class ChangePwdController {

  @Autowired
  private ChangePasswordService changePasswordService;


  @GetMapping
  public String form(@ModelAttribute("command") ChangePwdCommand pwdCmd) {
    return "edit/changePwdForm";
  }

  @PostMapping
  public String submmit(@ModelAttribute("command")@Valid ChangePwdCommand pwdCmd, Errors errors, HttpSession session) {
    new ChangePwdCommandValidator().validate(pwdCmd, errors);
    if (errors.hasErrors()) {
      return "edit/changePwdForm";
    }
    AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");

    try {
      changePasswordService.changePassword(
          authInfo.getEmail(),
          pwdCmd.getCurrentPassword(),
          pwdCmd.getNewPassword()
      );
      return "edit/changedPwd";
    } catch (WrongIdPasswordException e) {
      errors.rejectValue("currentPassword", "notMatching");
      return "edit/changePwdForm";
    }

  }

}
