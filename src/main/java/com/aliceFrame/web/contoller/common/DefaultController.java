package com.aliceFrame.web.contoller.common;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aliceFrame.web.domain.Member;

@Controller
public class DefaultController {
	
	
	@ModelAttribute("member")
	public Member initData(HttpServletRequest req) {
		System.out.println("--- @ModelAttribute() ---");

		Member member = new Member();
		member.setId(1L);
		member.setUserName("test");
		
		return member;
	}


}
