package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import spring.DuplicateMemberException;
import spring.MemberRegisterService;
import spring.RegisterRequest;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private MemberRegisterService memberRegisterService;

    @RequestMapping(value = "/step1", method = RequestMethod.GET)
    public String handleStep1() {
        return "register/step1";
    }

    @PostMapping("/step2")
    public String handleStep2(@RequestParam(value = "agree" ,defaultValue = "false") Boolean agree, Model model) {
        if (!agree) {
            return "register/step1";
        }
        model.addAttribute("registerRequest", new RegisterRequest());
        return "register/step2";
    }

    @PostMapping("/step3")
    public String handleStep3(@ModelAttribute("registerRequest") RegisterRequest regReq, Errors errors) {
        new RegisterRequestValidator().validate(regReq, errors);
        if (errors.hasErrors()) {
            return "register/step2";
        }
        try {
            memberRegisterService.regist(regReq);
            return "register/step3";
        } catch (DuplicateMemberException ex) {
            return "register/step2";
        }

    }


}
