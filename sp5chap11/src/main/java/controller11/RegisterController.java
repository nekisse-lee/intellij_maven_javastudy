package controller11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/register/step1")
    public String handleStep1(@RequestParam(name = "agree") String agree) {
        logger.debug("check agree={}", agree);
        return "register/step1";
    }

    @PostMapping("/register/step2")
    public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree) {
//        logger.info("check agree={}", agree);
        if (agree) {
            return "register/step2";
        }
        return "register/step1";
    }
}
