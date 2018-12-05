package com.nekisse.web.persistence;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;

import java.util.List;
import java.util.Map;

public interface BoardDAO {

    public void create(BoardVO vo) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public void update(BoardVO vo) throws Exception;

    public void update(Map map) throws Exception;

    public void delete(Integer bno) throws Exception;

    public void delete(Map map) throws Exception;

    public List<BoardVO> listAll() throws Exception;

    public List<BoardVO> listPage(int page) throws Exception;

    public List<BoardVO> listCriteria(Criteria cri) throws Exception;


}
