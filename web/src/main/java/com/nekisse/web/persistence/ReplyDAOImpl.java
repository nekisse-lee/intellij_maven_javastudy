package com.nekisse.web.persistence;

import com.nekisse.web.domain.Criteria;
import com.nekisse.web.domain.ReplyVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

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

    public List<ReplyVO> listPage(int bno, Criteria cri) throws Exception {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("bno", bno);
        paramMap.put("cri", cri);

        return session.selectList("reply.listPage", paramMap);
    }

    public int count(Integer bno) throws Exception{

        return session.selectOne("reply.count",bno);
    }

}
