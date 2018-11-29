package com.nekisse.persistence;

import com.nekisse.domain.MemberVO;

public interface MemberDao {

    public String getTime();

    public void insertMember(MemberVO memberVO);

    public MemberVO readMember(String userid) throws Exception;

    public MemberVO readWithPW(String userid, String userpw) throws Exception;


}
