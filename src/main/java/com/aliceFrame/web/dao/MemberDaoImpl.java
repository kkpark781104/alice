package com.aliceFrame.web.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aliceFrame.web.domain.Member;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
    protected SqlSessionTemplate sqlSession;
	
	private String namespace = "memberMapper.";
	/*
	 * 사용자 목록
	 */
	@Override
	public List<Member> getMemberList(Member pMember) throws Exception{
		String mapperId = namespace+"getList";
		List<Member> memberList = sqlSession.selectList(mapperId, pMember);
		
		return memberList;
	}
	
	/*
	 * 사용자 상세정보
	 */
	@Override
	public Member getMemberDetail(Member pMember) throws Exception{
		Member member = new Member();
		
		return member;
	}
}
