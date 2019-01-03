package controller11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import spring11.DuplicateMemberException;
import spring11.MemberRegisterService;
import spring11.RegisterRequest;
import spring11.WrongIdPasswordException;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private MemberRegisterService memberRegisterService;

    public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
        this.memberRegisterService = memberRegisterService;
    }

    @RequestMapping("/step1")
    public String handleStep1(/*@RequestParam(name = "agree", required = false) String agree*/) {
//        logger.info("check agree={}", agree);
        return "register/step1";
    }

    @PostMapping("/step2")
    public String handleStep2(
            @RequestParam(value = "agree", defaultValue = "false") Boolean agree/*, Model model*/, @ModelAttribute("regReq") RegisterRequest regReq) {
        if (agree) {
//            model.addAttribute("regReq", new RegisterRequest());
            return "register/step2";
        }

        return "register/step1";
    }

    @GetMapping("/step2")
    public String handleStep2Get() {
        return "redirect:/register/step1";
    }


    /*@PostMapping("/step3")
    public String handleStep3(@ModelAttribute("regReq") RegisterRequest req, Errors errors) {
        new RegisterRequestValidator().validate(req, errors);
        if (errors.hasErrors()) {
            return "register/step2";
        }
        try {
            memberRegisterService.regist(req);
//            logger.info("req.name={}", req.getName());
            return "register/step3";
        } catch (DuplicateMemberException e) {
            errors.rejectValue("email", "duplicate");
            return "register/step2";
        }
    }*/

    @PostMapping("/step3")
    public String handleStep3(@Valid @ModelAttribute("regReq") RegisterRequest req, Errors errors) {
        if (errors.hasErrors()) {
            return "register/step2";
        }
        try {
            memberRegisterService.regist(req);
            return "register/step3";
        } catch (DuplicateMemberException e) {
            errors.rejectValue("email", "duplicate");
            return "register/step2";
        } catch (WrongIdPasswordException e) {
            errors.rejectValue("password", "nomatch.confirmPassword");
            return "register/step2";
        }
    }


/*
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new RegisterRequestValidator());
    }
*/
}
