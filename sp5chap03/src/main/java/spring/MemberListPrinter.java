package spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;



public class MemberListPrinter {
    @Autowired
    private MemberDao memberDao;

    @Autowired
    private MemberPrinter printer;


    /*public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao = memberDao;
        this.printer = printer;
    }*/


    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(member -> printer.print(member));

    }
}
