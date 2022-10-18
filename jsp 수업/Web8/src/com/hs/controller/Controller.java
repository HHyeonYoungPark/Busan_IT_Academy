package com.hs.controller;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.hs.bean.BoardDto;
import com.hs.db.BoardDao;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
		  maxFileSize = 1024 * 1024 * 10,      // 10 MB
		  maxRequestSize = 1024 * 1024 * 100   // 100 MB
		)
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(request,response);
	}
	
	private void makeDir(String location) {
		File Folder = new File(location);
		// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
		if (!Folder.exists()) {
			try{
			    Folder.mkdir(); //폴더 생성합니다.
			    System.out.println("폴더가 생성되었습니다.");
			    
		        } 
		        catch(Exception e){
			    e.getStackTrace();
			}        
	         }else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
	}
	
	
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String cmd = request.getRequestURI();
		cmd = cmd.substring(cmd.lastIndexOf("/")+1, cmd.indexOf("."));
				
		// 메서드 안에서 정의 하는 변수는 반드시 초기값을 가져야 한다.
		BoardDao dao = new BoardDao();
		Vector<BoardDto> v = null;
		String next = null;
		
		
		if(cmd.equals("main")){
			next = "main.jsp";
			v = dao.getDataAll();
			request.setAttribute("vd", v);			
		}else if(cmd.equals("write")) {
			next = "write.jsp";			
		}else if(cmd.equals("writeProc")) {
			next="index.jsp";
			
		String location = request.getSession().getServletContext().getRealPath("upload/");
		//실제 저장될 위치-가상서버에 저장됨
			System.out.println(location);
			makeDir(location);// 저장될 폴더 없으면 만들어 주기
			
			Part filePart = request.getPart("f");
			filePart.write(location+filePart.getSubmittedFileName());
			
			BoardDto dto = new BoardDto(
					request.getParameter("title"),
					request.getParameter("id"),
					request.getParameter("content"),
					filePart.getSubmittedFileName());
			
			int res = dao.insertData(dto);
		}else if(cmd.equals("view")) {
			next="view.jsp";
			int idx = Integer.parseInt(request.getParameter("idx"));
			BoardDto dto = dao.getDataOne(idx);
			request.setAttribute("dtod", dto);
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}




