package com.hs.app;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private MVCDao dao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping({"/", "/main"})
	public String home(Locale locale, Model model) {
		
		List<MVCDto> list = dao.selectDataAll();
		model.addAttribute("list", list);
		
		return "main";			
	}
	
	
	// 입력
	@RequestMapping("/insert")
	public String insert(MVCDto dto) {
		int res = dao.insertData(dto);
		// if (res > 0){ ~~~ 이게 여기에 들어갑니다.. 
		return "redirect:/main";
	}
	
	// 삭제
	@RequestMapping("/delete")
	public String delete(MVCDto dto) {
		int res = dao.deleteData(dto.getIdx());
		// 실제로는 /main이 처리되는 부분이다
		// 하지만 향후 개발에 있어서 return의 내용이 헷갈릴 수 있어서
		// 명시적으로 내부에서 이동한다는 뜻으로 redirect를 사용한다
		return "redirect:/main";
	}
	
	// 수정
	@RequestMapping("/update")
	public String update(MVCDto dto) {
		int res = dao.updateData(dto.getIdx());
		
		return "redirect:/main";
	}
	
	
	
}
