package controller11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @GetMapping("/register/step1")
    public String handleStep1() {
        return "register/step1";
    }

}
