package controller11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring11.DuplicateMemberException;
import spring11.MemberRegisterService;
import spring11.RegisterRequest;

@Controller
public class RegisterController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    private MemberRegisterService memberRegisterService;

    public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
        this.memberRegisterService = memberRegisterService;
    }

    @RequestMapping("/register/step1")
    public String handleStep1(/*@RequestParam(name = "agree", required = false) String agree*/) {
//        logger.info("check agree={}", agree);
        return "register/step1";
    }

    @PostMapping("/register/step2")
    public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree) {
        if (agree) {
            return "register/step2";
        }
        return "register/step1";
    }

    @GetMapping("/register/step2")
    public String handleStep2Get() {
        return "redirect:step1";
    }


    @PostMapping("/register/step3")
    public String handleStep3(RegisterRequest req) {
        try {
            memberRegisterService.regist(req);
            logger.info("req.name=", req.getName());
            return "register/step3";
        } catch (DuplicateMemberException e) {
            return "register/step2";
        }
    }

}
