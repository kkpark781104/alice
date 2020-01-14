package com.aliceFrame.web.contoller.common;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	  @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST}) 
	  public String login(Locale locale, Model model) { 
		  String k=""; 
		  return "login/login"; 
	  }
	  
}
