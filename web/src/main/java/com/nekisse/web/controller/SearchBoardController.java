package com.nekisse.web.controller;

import com.nekisse.web.domain.PageMaker;
import com.nekisse.web.domain.SearchCriteria;
import com.nekisse.web.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("sboard")
public class SearchBoardController {
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService service;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
        logger.info(cri.toString());
        model.addAttribute("list", service.listCriteria(cri));

        PageMaker pageMaker = new PageMaker();
        pageMaker.setCri(cri);
        pageMaker.setTotalCount(service.listCountCriteria(cri));

        model.addAttribute("pageMaker", pageMaker);
        return "sboard/list";
    }

}
