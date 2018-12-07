package com.nekisse.web.persistence;

import com.nekisse.web.domain.ReplyVO;

import java.util.List;

public interface ReplyDAO {

    public List<ReplyVO> list(Integer rno) throws Exception;

    public void create(ReplyVO vo) throws Exception;

    public void update(ReplyVO vo) throws Exception;

    public void delete(Integer rno) throws Exception;

    }
