package com.nekisse.persistence;

import com.nekisse.domain.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

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
        MemberVO vo = sqlSession.selectOne("member.selectMember", userid);
        return vo;
    }

    @Override
    public MemberVO readWithPW(String userid, String userpw) throws Exception {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userid", userid);
        paramMap.put("userpw", userpw);

        return sqlSession.selectOne("member.readWithPW", paramMap);
    }
}
