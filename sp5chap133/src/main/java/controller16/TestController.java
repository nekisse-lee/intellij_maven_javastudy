package controller16;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public String  test() {
        return "vuejstest/test";
    }
}
