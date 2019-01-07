package controller16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring16.Member;
import spring16.MemberDao;
import spring16.MemberNotFoundException;

@Controller
public class MemberDetailController {

  private MemberDao memberDao;

  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @GetMapping("/members/{id}")
  public String detail(@PathVariable("id") Long memId, Model model) {
    Member member = memberDao.selectById(memId);
    if (member == null) {
      throw new MemberNotFoundException();
    }
    model.addAttribute("member", member);
    return "member/memberDetail";
  }


/*
  @ExceptionHandler(TypeMismatchException.class)
  public String handleTypeMismatchException() {
    return "member/invalidId";
  }
*/


  @ExceptionHandler(MemberNotFoundException.class)
  public String handleNotFoundException() {
    return "member/noMember";
  }

}
