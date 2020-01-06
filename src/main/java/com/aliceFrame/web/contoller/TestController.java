package com.aliceFrame.web.contoller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(Locale locale, Model model) {
		
		return "test/testList";
	}
}
