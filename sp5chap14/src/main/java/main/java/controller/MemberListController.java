package main.java.controller;

import main.java.spring.Member;
import main.java.spring.MemberDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemberListController {

  private MemberDao memberDao;

  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @RequestMapping("/members")
  public String list(@ModelAttribute("cmd") ListCommand listCommand, Model model) {
    if (listCommand.getFrom() != null && listCommand.getTo() != null) {
      List<Member> members = memberDao.selectByRegdate(
          listCommand.getFrom(), listCommand.getTo());
      model.addAttribute("members", members);
    }
    return "member/memberList";

  }

}
