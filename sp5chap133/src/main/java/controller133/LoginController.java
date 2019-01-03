package controller133;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring133.AuthInfo;
import spring133.AuthService;
import spring133.WrongIdPasswordException;

@Controller
@RequestMapping("/login")
public class LoginController {

  private AuthService authService;

  public void setAuthService(AuthService authService) {
    this.authService = authService;
  }


  @GetMapping
  public String form(LoginCommand loginCommand) {
    return "login/loginForm";
  }

  @PostMapping
  public String submit(LoginCommand loginCommand, Errors errors) {
    new LoginCommandValidator().validate(loginCommand, errors);
    if (errors.hasErrors()) {
      return "login/loginForm";
    }
    try {
      AuthInfo authInfo = authService.authenticate(loginCommand.getEmail(), loginCommand.getPassword());
      return "login/loginSuccess";
    } catch (WrongIdPasswordException e) {
      errors.reject("idPasswordNotMatching");
      return "login/loginForm";
    }
  }
}
