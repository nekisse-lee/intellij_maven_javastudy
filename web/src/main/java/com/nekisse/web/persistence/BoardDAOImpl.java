package com.nekisse.web.persistence;

import com.nekisse.web.domain.BoardVO;
import com.nekisse.web.domain.Criteria;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


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
    public void update(Map map) throws Exception {
        session.update("board.updatemap", map);
    }

    @Override
    public void delete(Integer bno) throws Exception {
        session.delete("board.delete", bno);
    }

    @Override
    public void delete(Map map) throws Exception {
        session.delete("board.deletemap", map);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return session.selectList("board.listAll");
    }

    @Override
    public List<BoardVO> listPage(int page) throws Exception {
        if (page <= 0) {
            page = 1;
        }
        page = (page - 1) * 10;
        return session.selectList("board.listPage", page);
    }

    @Override
    public List<BoardVO> listCriteria(Criteria cri) throws Exception {
        return session.selectList("board.listCriteria", cri);
    }

    @Override
    public int countPaging(Criteria cri) throws Exception {
        return session.selectOne("board.countPaging", cri);
    }
}
