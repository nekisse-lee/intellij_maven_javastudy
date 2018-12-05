package com.nekisse.web.service;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;
import com.nekisse.web.persistence.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements  BoardService{
    @Autowired
    private BoardDAO dao;

    @Override
    public void regist(BoardVO boardVO) throws Exception {
        dao.create(boardVO);
    }

    @Override
    public BoardVO read(int bno) throws Exception {
        return dao.read(bno);
    }


    @Override
    public void modify(BoardVO boardVO) throws Exception {
        dao.update(boardVO);
    }

    @Override
    public void modify(Map map) throws Exception {
        dao.update(map);
    }

    @Override
    public void remove(Integer bno) throws Exception {
        dao.delete(bno);
    }

    @Override
    public void remove(Map map) throws Exception {
        dao.delete(map);
    }


    @Override
    public List<BoardVO> listAll() throws Exception {
        return dao.listAll();
    }

    @Override
    public List<BoardVO> listCriteria(Criteria cri) throws Exception {
        return dao.listCriteria(cri);
    }
}
