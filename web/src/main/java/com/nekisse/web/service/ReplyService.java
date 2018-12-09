package com.nekisse.web.service;

import com.nekisse.web.domain.Criteria;
import com.nekisse.web.domain.ReplyVO;

import java.util.List;

public interface ReplyService {

    public void create(ReplyVO vo) throws Exception;

    public List<ReplyVO> listReply(Integer bno) throws Exception;

    public void update(ReplyVO vo) throws Exception;

    public void delete(int rno) throws Exception;

    public List<ReplyVO> listReplyPage(int bno, Criteria cri) throws Exception;

    public int count(int bno) throws Exception;



    }
