package com.nekisse.web;

import com.nekisse.domain.ProductVO;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    public String doC(@ModelAttribute("msg") String msg) {

        logger.info("doC called................." + msg);

        return "result";
    }




    @RequestMapping("doD")
    public String doD(Model model) {
        ProductVO product = new ProductVO("Sample Product", 10000);
        logger.info("doD called.................");
        model.addAttribute(product);
        return "productDetail";
    }

    @RequestMapping("doJSON")
    public @ResponseBody ProductVO doJSON() {
        ProductVO vo = new ProductVO("샘플상품", 30000);
        return vo;

    }



    @RequestMapping("doE")
    public String doE(RedirectAttributes rttr) {
        logger.info("doE called.........");
        rttr.addFlashAttribute("msg", "This is the Message!! with redirect");
        return "redirect:/doC";
    }


    @RequestMapping("doY")
    public void doY(HttpServletResponse res) throws IOException {
        logger.info("doY called.................");
        res.sendRedirect("doC?msg=This is the Message!! with redirect by DoY");
    }


    @RequestMapping("doZ")
    public String doZ(@RequestParam  String msg1, ModelMap model) {

        logger.info("doZ called................." + msg1);
        model.addAttribute(msg1, "asdfasdf" + msg1);
        return "result";
    }

}
