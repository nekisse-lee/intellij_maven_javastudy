package controller16.changeController;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring14.AuthInfo;
import spring14.ChangePasswordService;
import spring14.WrongIdPasswordException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/edit/changePassword")
public class ChangePwdController {

  private ChangePasswordService changePasswordService;

  public void setChangePasswordService(ChangePasswordService changePasswordService) {
    this.changePasswordService = changePasswordService;
  }

  @GetMapping
  public String form(@ModelAttribute("command") ChangePwdCommand pwdCmd) {
    return "edit/changePwdForm";
  }

  @PostMapping
  public String submit(@ModelAttribute("command")@Valid ChangePwdCommand pwdCmd, Errors errors, HttpSession session) {
    new ChangePwdCommandValidator().validate(pwdCmd, errors);
    if (errors.hasErrors()) {
      return "edit/changePwdForm";
    }

    AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
    if (authInfo == null) {
      return "redirect:/login";
    }
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
