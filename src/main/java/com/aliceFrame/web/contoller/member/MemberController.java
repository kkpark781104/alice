package com.aliceFrame.web.contoller.member;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliceFrame.web.domain.Member;
import com.aliceFrame.web.service.MemberService;

/**
 * @author kkpark
 * MemberController
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberSerivce;
	
	/**
	 * 화면 호출
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String memberRegister(Locale locale, Model model) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = (UserDetails) principal;
		
		
		
		return "member/register";
	}
	
	/**
	 * 목록
	 * @param request
	 * @param response
	 * @param commandMap
	 * @param pMember
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/register/list", method = {RequestMethod.POST, RequestMethod.GET})
	public Map<String, Object> memberRegisterList(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String, Object> commandMap, Member pMember) throws Exception {
		
		List<Member> resultList = memberSerivce.getMemberList(pMember);
		
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("success", true);
    	map.put("list", resultList);
    	return map;
	}
	
	/**
	 * 상세 
	 * @param request
	 * @param response
	 * @param commandMap
	 * @param pMember
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/register/detail", method = RequestMethod.POST)
	public Map<String, Object> memberRegisterDetail(HttpServletRequest request
			, HttpServletResponse response,@RequestParam Map<String, Object> commandMap, Member pMember) throws Exception {
		
		List<Member> resultList = memberSerivce.getMemberList(pMember);
		
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("success", true);
    	map.put("list", resultList);
    	return map;
	}
	
	/**
	 * CRUD 처리
	 * @param locale
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/register/crud", method = {RequestMethod.POST, RequestMethod.GET})
	public Map<String, Object> memberRegisterCRUD(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String, Object> commandMap) {
		Map<String, Object> map = new HashMap<String, Object>();
    	map.put("1", "111");
    	map.put("2", 222);
    	return map;
	}
}
