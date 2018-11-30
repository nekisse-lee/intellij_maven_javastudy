package com.nekisse.web;


import com.nekisse.domain.MemberVO;
import com.nekisse.persistence.MemberDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class MemberDaoTest {

    @Autowired
    private MemberDao dao;

    @Test
    public void testTime() {
        System.out.println(dao.getTime());
    }

    @Test @Ignore
    public void testInsertMember() {
        MemberVO vo = new MemberVO("user10","user10","USER10","user10@aaa.com");
        dao.insertMember(vo);
    }


    @Test
    public void readMember() throws Exception {
        MemberVO vo = dao.readMember("user10");
        System.out.println(vo.toString());
    }

    @Test
    public void readWithPW() throws Exception {
        MemberVO vo = dao.readWithPW("user10", "user10");
        System.out.println(vo.toString());
    }

}
