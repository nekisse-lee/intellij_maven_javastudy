package com.nekisse.web.service;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;
import com.nekisse.web.domain.SearchCriteria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface BoardService {
    public void regist(BoardVO boardVO) throws Exception;

    public BoardVO read(int bno) throws Exception;

    public void modify(BoardVO boardVO) throws Exception;

    public void modify(Map map) throws Exception;

    public void remove(Integer bno) throws Exception;

    public void remove(Map map) throws Exception;

    public List<BoardVO> listAll() throws Exception;

    public List<BoardVO> listCriteria(Criteria cri) throws Exception;

    public int listCountCriteria(Criteria cri) throws Exception;

    public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;

    public int listSearchCount(SearchCriteria cri) throws Exception;

}
