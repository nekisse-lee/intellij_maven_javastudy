package com.nekisse.web;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;
import com.nekisse.web.persistence.BoardDAO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:root-context.xml")
public class BoardDAOTest {


    @Autowired
    private BoardDAO dao;

    private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

    @Test
    public void testCreate() throws Exception {
        BoardVO board = new BoardVO();
        board.setTitle("새로운 글을 넣습니다.");
        board.setContent("새로운 글을 넣습니다.");
        board.setWriter("user00");
        dao.create(board);

    }

    @Test
    public void testRead() throws Exception {
        logger.info(dao.read(2).toString());
    }

    @Test
    public void testUpdate() throws Exception {
        BoardVO board = new BoardVO();
        board.setBno(3);
        board.setTitle("수정된 글입니다.");
        board.setContent("수정 테스트");
        dao.update(board);
    }

    @Test
    public void testDelete() throws Exception {
        dao.delete(3);
    }

    @Test
    public void testListPage() throws Exception {
        Integer page = 2;

        List<BoardVO> list = dao.listPage(page);
        for (BoardVO boardVO : list) {
            logger.info(boardVO.getBno() + " : " + boardVO.getTitle() );
        }
    }


    @Test
    public void testListCriteria() throws Exception {
        Criteria cri = new Criteria();
        cri.setPage(2);
        cri.setPerPageNum(10);
        List<BoardVO> list = dao.listCriteria(cri);

        for (BoardVO boardVO : list) {
            logger.info(boardVO.getBno() + " : " + boardVO.getTitle());
        }
    }
}
