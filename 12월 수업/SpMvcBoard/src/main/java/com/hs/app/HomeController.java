package com.hs.app;


import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	MvcDao dao;
	
	@Autowired
	MemDao mdao;
	
	@Autowired
	private ServletContext context;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
	@RequestMapping({"/","/main"})
	public String main(Model model) {		
		model.addAttribute("list", dao.selectAll());		
		return "main";
	}
	
	@RequestMapping("main2")
	public String boardList(PagingVO vo, Model model
			, @RequestParam(value="nowPage", required=false)String nowPage
			, @RequestParam(value="cntPerPage", required=false)String cntPerPage) {
		
		int total = dao.selectAllCnt();
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "5";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "5";
		}
		vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", vo);
		model.addAttribute("list", dao.selectAllP(vo));
		return "main2";
	}
	
	@RequestMapping({"/login"})
	public String login(MemDto dto, HttpServletRequest req, Model model) {
		int cnt = mdao.selectMemLoginCnt(dto);
		if(cnt>0) {//�α��� ����
			HttpSession session = req.getSession();
			session.setAttribute("loginInfo", mdao.selectMemOne(dto.getId()));
			return "redirect:/";
		}else {//�α��� ����
			model.addAttribute("memLoginCnt", cnt);
			return "main";
		}		
	}
	
	@RequestMapping({"/logout"})
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping({"/info"})
	public String logout(Model model, String id) {
		model.addAttribute("info", mdao.selectMemOne(id));		
		return "info";
	}
	
	
	
	@RequestMapping({"/regist"})
	public String regist(Model model) {
		model.addAttribute("memCnt", 0);
		return "regist";
	}
	
	@RequestMapping({"/registProc"})
	public String registProc(MemDto dto, Model model) {
		int cnt = mdao.selectMemCnt(dto);
		model.addAttribute("memCnt", cnt);		
		if(cnt>0) {
			return "regist";
		}else {
			mdao.insertMem(dto);
			return "redirect:/";
		}		
	}
	
	@RequestMapping({"/read"})
	public String read(Model model, int idx) {
		model.addAttribute("data", dao.selectOne(idx));
		return "read";
	}
	
	@RequestMapping({"/delete"})
	public String delete(int idx) {
		dao.delete(idx);
		return "redirect:/";
	}
	
	@RequestMapping({"/write"})
	public String write() {		
		return "write";
	}
	
	@RequestMapping({"/writeProc"})
	public String writeProc(MultipartHttpServletRequest mreq){
		
		// �Ѿ�� ���Ͽ��� �̸��̾Ƴ��� - filename
		MultipartFile file = mreq.getFile("filename");
		String filename=file.getOriginalFilename();
		System.out.println("�뷮 : "+file.getSize());
		
		// �Ѿ�� name �������� - getParameterNames�� �̿��ؼ� while�� ����
		String title=mreq.getParameter("title");		
		String writer=mreq.getParameter("writer");
		String content=mreq.getParameter("content");
		
		// �Ѿ�� mrequest�� ������ ���Ͼ��ε� ó��		
		String root_path=context.getRealPath("/");// ������Ʈ ������ ���
		String attach_path="resources\\upload\\"; // ������Ʈ ������ ���		
		if(file.getSize()>0) {
			try {
				//���Ͼ��ε� �޼���
				//file.transferTo(new File("����� ��ġ�� ������ ���ϸ�"));
				file.transferTo(new File(root_path+attach_path+filename));
				System.out.println(root_path+attach_path+filename+" : ���� ���ε� �Ϸ�!");
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(UUID.randomUUID().toString()+": �ַλ���ϴ� ������");
			// ���ϸ��� . �� �������� �ڸ��� ����� �������� ���ϸ����� . ������ Ȯ���ڸ� �ٿ��� �ߺ��� �ȵǴ� ���ϸ����� ����
		}
		
		dao.insert(new MvcDto(0, title, writer, content, null, filename));		
		return "redirect:/";
	}
	
	
	
	
	
}
