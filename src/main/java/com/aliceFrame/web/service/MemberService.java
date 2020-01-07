package com.aliceFrame.web.service;

import java.util.List;

import com.aliceFrame.web.domain.Member;

public interface MemberService {
	/*
	 * 사용자 목록
	 */
	public List<Member> getMemberList(Member pMember) throws Exception;
	/*
	 * 사용자 상세정보
	 */
	public Member getMemberDetail(Member pMember) throws Exception;
}
