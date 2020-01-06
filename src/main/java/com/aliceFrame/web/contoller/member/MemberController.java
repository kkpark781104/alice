package com.aliceFrame.web.contoller.member;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kkpark
 * MemberController
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	
	/**
	 * 화면 호출
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String memberRegister(Locale locale, Model model) {
		
		return "member/register";
	}
	
	/**
	 * CRUD 처리
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register/crud", method = {RequestMethod.GET, RequestMethod.POST})
	public String memberRegisterCRUD(Locale locale, Model model) {
		
		return "member/register";
	}
}
