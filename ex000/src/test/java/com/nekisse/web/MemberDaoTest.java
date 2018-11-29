package com.nekisse.web;


import com.nekisse.domain.MemberVO;
import com.nekisse.persistence.MemberDao;
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

    @Test
    public void testInsertMember() {
        MemberVO vo = new MemberVO("user02","user00","USER00","user00@aaa.com");
        dao.insertMember(vo);
    }
}
