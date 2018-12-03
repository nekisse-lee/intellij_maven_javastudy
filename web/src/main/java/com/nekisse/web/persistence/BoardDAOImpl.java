package com.nekisse.web.persistence;

import com.nekisse.web.domain.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class BoardDAOImpl  implements BoardDAO{

    @Autowired
    private SqlSession session;

    @Override
    public void create(BoardVO vo) throws Exception {
        session.insert("board.create", vo);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return session.selectOne("board.read", bno);
    }

    @Override
    public void update(BoardVO vo) throws Exception {
        session.update("board.update", vo);
    }

    @Override
    public void delete(Integer bno) throws Exception {
        session.delete("board.delete", bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return session.selectList("board.listAll");
    }
}
