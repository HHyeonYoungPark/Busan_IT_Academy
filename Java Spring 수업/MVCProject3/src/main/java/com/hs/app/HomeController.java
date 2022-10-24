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
	
	
	// �Է�
	@RequestMapping("/insert")
	public String insert(MVCDto dto) {
		int res = dao.insertData(dto);
		// if (res > 0){ ~~~ �̰� ���⿡ ���ϴ�.. 
		return "redirect:/main";
	}
	
	// ����
	@RequestMapping("/delete")
	public String delete(MVCDto dto) {
		int res = dao.deleteData(dto.getIdx());
		// �����δ� /main�� ó���Ǵ� �κ��̴�
		// ������ ���� ���߿� �־ return�� ������ �򰥸� �� �־
		// ��������� ���ο��� �̵��Ѵٴ� ������ redirect�� ����Ѵ�
		return "redirect:/main";
	}
	
	// ����
	@RequestMapping("/update")
	public String update(MVCDto dto) {
		int res = dao.updateData(dto.getIdx());
		
		return "redirect:/main";
	}
	
	
	
}
