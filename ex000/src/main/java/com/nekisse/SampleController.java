package com.nekisse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    private static final Logger logger =
            LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("doA")
    public void doA() {

        logger.info("doA called.................");
    }

    @RequestMapping("doB")
    public void doB() {

        System.out.println("doB");
        logger.info("doB called.................");
    }

    @RequestMapping("doC")
    public String doC() {

        logger.info("doC called.................");
        return "result";
    }

}
