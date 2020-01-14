package com.aliceFrame.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/sample")
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String all(Locale locale, Model model) {
		
		return "/sample/all";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		
		return "/sample/member";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Locale locale, Model model) {
		
		return "/sample/admin";
	}
	
}
