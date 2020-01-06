package com.aliceFrame.web.contoller.member;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value = "/register/crud", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView memberRegisterCRUD(HttpServletRequest request, HttpServletResponse response,@RequestParam Map<String, Object> commandMap) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jsonView");

		mv.addObject("data","test");
		
		return mv;
	}
}
