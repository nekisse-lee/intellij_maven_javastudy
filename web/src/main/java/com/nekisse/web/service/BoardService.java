package com.nekisse.web.service;

import com.nekisse.web.domain.BoardVO;
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


}
