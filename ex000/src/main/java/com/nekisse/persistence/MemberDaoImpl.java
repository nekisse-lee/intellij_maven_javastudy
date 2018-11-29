package com.nekisse.persistence;

import com.nekisse.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {

    @Autowired
    private SqlSession sqlSession;


    @Override
    public String getTime() {
        return sqlSession.selectOne("member.getTime");
    }

    @Override
    public void insertMember(MemberVO vo) {
        sqlSession.insert("member.insertMember", vo);
    }

    @Override
    public MemberVO readMember(String userid) throws Exception {
        return null;
    }

    @Override
    public MemberVO readWithPW(String userid, String userpw) throws Exception {
        return null;
    }
}
