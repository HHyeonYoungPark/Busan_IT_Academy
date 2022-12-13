package com.hs.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*

use spdb;

create table reboard(
	idx int primary key auto_increment,
	title varchar(200),
	id varchar(50),
	pw varchar(200),
	content text,
	replycnt int default 0
);

create table replay(
	idx int primary key auto_increment,
	boardidx int,
	id varchar(50),
	pw varchar(200),
	content text
);

 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BDao dao;
	
	@Autowired
	RDao rdao;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping({"main","/"})	
	public String boardList(PagingVO vo, Model model
			, @RequestParam(value="nowPage", required=false)String nowPage
			, @RequestParam(value="cntPerPage", required=false)String cntPerPage) {
		
		cntPerPage = "5";
		
		int total = dao.selectAllCnt();
		
		if(total<1) total=1; // total의 값이 0일 경우 계산이 잘못되어 에러남. 0일 경우 강제로 1로 변경
		
		if (nowPage == null) {
			nowPage = "1";			
		}
		
		vo = new PagingVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", vo);
		model.addAttribute("list", dao.selectAllP(vo));
		return "main";
	}
	
	@RequestMapping("write")
	public String write() {
		return "write";
	}
	
	@RequestMapping("writeProc")
	public String writeProc(BDto dto) {
		dao.insertData(dto);
		return "redirect:/main";
	}
	
	@RequestMapping("read")
	public String read(Model model, int idx, @RequestParam(value="res", required=false)String res, @RequestParam(value="reres", required=false)String reres) {
		if(res != null) {
			model.addAttribute("res", res);
		}
		if(reres != null) {
			model.addAttribute("reres", reres);
		}
		
		model.addAttribute("data", dao.selectOne(idx));
		model.addAttribute("reply", rdao.selectReply(idx));//리플 가져오기
		
		return "read";
	}
	
	@RequestMapping("chkPw")
	public String chkPw(Model model, BDto dto) {
		model.addAttribute("data", dto);
		return "chkpw";
	}
	
	@RequestMapping("deleteData")
	public String deleteData(Model model, BDto dto) {
		int res = dao.deleteData(dto);
		if(res>0) {
			return "redirect:/main";
		}else {
			
			return "redirect:/read?res=false&idx="+dto.getIdx();
		}		
	}
	
	@RequestMapping("updateData")
	public String updateData(int idx) {
		//구현해 보세요
		return "update";				
	}
	
	
	/////////////// reply /////////////////////////
	@RequestMapping("writeReply")
	public String writeReply(RDto dto) {
		rdao.insertReply(dto);
		dao.updateReplyCntPlus(dto.getBoardidx());
		return "redirect:/read?idx="+dto.getBoardidx();				
	}
	
	@RequestMapping("delReply")
	public String delReply(RDto dto) {
		int reres = rdao.deleteReply(dto);
		if(reres>0) {
			dao.updateReplyCntMinus(dto.getBoardidx());
			return "redirect:/read?idx="+dto.getBoardidx();			
		}else {
			
			return "redirect:/read?reres=false&idx="+dto.getBoardidx();
		}	
		
						
	}
	
	
}
