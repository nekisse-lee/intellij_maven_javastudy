package com.nekisse.web.persistence;

import com.nekisse.web.domain.ReplyVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReplyDAOImpl implements ReplyDAO{

    @Autowired
    private SqlSession session;

   public List<ReplyVO> list(Integer rno) throws Exception {
       return session.selectList("reply.list", rno);
   }

    public void create(ReplyVO vo) throws Exception {
        session.insert("reply.create", vo);
    }

   public void update(ReplyVO vo) throws Exception {
       session.update("reply.update", vo);
   }

    public void delete(Integer rno) throws Exception {
        session.delete("reply.delete", rno);
    }


}
