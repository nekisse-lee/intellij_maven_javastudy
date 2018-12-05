package com.nekisse.web.controller;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;
import com.nekisse.web.domain.PageMaker;
import com.nekisse.web.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
@RequestMapping("board")
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService service;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public void registerGET(BoardVO board, Model model) throws Exception {
        logger.info("register get...");
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String registerPOST(BoardVO board, Model model, RedirectAttributes ra) throws Exception {
        logger.info("register post...");
        logger.info(board.toString());

        service.regist(board);
        ra.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/board/listAll";

    }

/*
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public void registerPOST(BoardVO board, Model model, HttpServletRequest req, HttpServletResponse res) throws Exception {
        logger.info("register post...");
        logger.info(board.toString());

        service.regist(board);
//        model.addAttribute("result", "success");
        res.sendRedirect("/board/listAll");
    }
*/

    @RequestMapping(value = "listCri", method = RequestMethod.GET)
    public String listCri(Criteria cri, Model model) throws Exception {
        logger.info("show  Cri.....");
        model.addAttribute("list", service.listCriteria(cri));
        return ("board/listCri");
    }

    @RequestMapping(value = "listPage", method = RequestMethod.GET)
    public String listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
        logger.info(cri.toString());

        model.addAttribute("list", service.listCriteria(cri));
        PageMaker pageMaker = new PageMaker();
        pageMaker.setCri(cri);
//        pageMaker.setTotalCount(13);
        pageMaker.setTotalCount(service.listCountCriteria(cri));
        model.addAttribute("pageMaker", pageMaker);
        return "board/listPage";
    }


    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public void listAll(Model model) throws Exception {
        logger.info("show all list.....");
        model.addAttribute("list", service.listAll());
    }

    @RequestMapping(value = "readPage", method = RequestMethod.GET)
    public void read(
            @RequestParam("bno") Integer bno, Model model, @ModelAttribute("cri") Criteria cri) throws Exception {

        logger.info("read ....");
//        model.addAttribute("boardVO",service.read(bno));

        model.addAttribute(service.read(bno));
    }



    /*@RequestMapping(value = "remove", method = RequestMethod.POST)
    public String  remove(@RequestParam("bno") Integer bno, RedirectAttributes rttr) throws Exception {
        logger.info("remove....");
        service.remove(bno);
        return "redirect";
    }*/


    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String removemap(@RequestParam Map map, RedirectAttributes rttr) throws Exception {
        logger.info("remove....");
        service.remove(map);
        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "modify", method = RequestMethod.GET)
    public String modifyGET(@RequestParam Map map, Model model) throws Exception {
        model.addAttribute(service.read((Integer.parseInt((String) map.get("bno")))));
        return "board/modify";
    }

    @RequestMapping(value = "modify", method = RequestMethod.POST)
    public String modifyPOST(@RequestParam Map map, RedirectAttributes rttr) throws Exception {
        service.modify(map);
        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/board/listAll";
    }

    @RequestMapping(value = "removePage", method = RequestMethod.POST)
    public String removePage(@RequestParam Map map, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {
        service.remove(map);

        rttr.addFlashAttribute("page", cri.getPage());
        rttr.addFlashAttribute("perPageNum", cri.getPerPageNum());
        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/board/listPage";
    }

    @RequestMapping(value = "modifyPage", method = RequestMethod.GET)
    public String modifyPage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception {

        model.addAttribute("boardVO",service.read(bno));
//        model.addAttribute(service.read(bno));
        return "board/modifyPage";
    }
    @RequestMapping(value = "modifyPage", method = RequestMethod.POST)
    public String modifyPagePOST(@RequestParam Map map, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception {
        service.modify(map);

        rttr.addFlashAttribute("page", cri.getPage());
        rttr.addFlashAttribute("perPageNum", cri.getPerPageNum());
        rttr.addFlashAttribute("msg", "SUCCESS");
        return "redirect:/board/listPage";
    }

}
