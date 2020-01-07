package com.aliceFrame.web.dao;

import java.util.List;
import java.util.Map;

import com.aliceFrame.web.domain.Member;

/**
 * @author kkpark
 * 사용자 Dao
 */
public interface MemberDao {
	/*
	 * 사용자 목록
	 */
	public List<Member> getMemberList(Member pMember) throws Exception;
	
	/*
	 * 사용자 상세정보
	 */
	public Member getMemberDetail(Member pMember) throws Exception;
}
