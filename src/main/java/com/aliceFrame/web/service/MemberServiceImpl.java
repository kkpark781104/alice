package com.aliceFrame.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliceFrame.web.dao.MemberDao;
import com.aliceFrame.web.domain.Member;

@Service("memberService")
public class MemberServiceImpl  implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	/*
	 * 사용자 목록
	 */
	@Override
	public List<Member> getMemberList(Member pMember) throws Exception{
		return memberDao.getMemberList(pMember);
	}
	
	/*
	 * 사용자 상세정보
	 */
	@Override
	public Member getMemberDetail(Member pMember) throws Exception{
		return memberDao.getMemberDetail(pMember);
	}
}
