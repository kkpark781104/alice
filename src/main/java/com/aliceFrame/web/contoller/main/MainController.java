package com.aliceFrame.web.contoller.main;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aliceFrame.web.contoller.common.DefaultController;

@Controller
public class MainController extends DefaultController{

	/**
	 * 메인화면 호출
	 * @param locale
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/main", method = {RequestMethod.GET, RequestMethod.POST}) 
	public String main(Locale locale, Model model) { 
		System.out.println("메인");
		return "main/main"; 
	}
}
