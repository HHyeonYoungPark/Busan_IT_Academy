package com.hs.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

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
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/in")
	public String input() {
		
		return "test";
	}
	
	@RequestMapping(value = "/sample")
	public String home(Model model, HttpServletRequest request) { // model�� ������ �Ű������� �޾ƿ;� �Ѵ�
		
		String str = request.getParameter("id");
		model.addAttribute("serverTime", str );
		// request.setAttribute�� ������������ model�� ��ģ��
		
		return "home";
	}
	
	
	
}
