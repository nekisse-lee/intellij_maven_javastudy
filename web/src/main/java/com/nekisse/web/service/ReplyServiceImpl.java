package com.nekisse.web.service;


import com.nekisse.web.domain.ReplyVO;
import com.nekisse.web.persistence.ReplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl  implements ReplyService{

    @Autowired
    private ReplyDAO dao;

    public void create(ReplyVO vo) throws Exception{
        dao.create(vo);
    }

    public List<ReplyVO> listReply(Integer bno) throws Exception {
        return dao.list(bno);
    }

    public void update(ReplyVO vo) throws Exception {
        dao.update(vo);
    }

    public void delete(int rno) throws Exception {
        dao.delete(rno);
    }



}
