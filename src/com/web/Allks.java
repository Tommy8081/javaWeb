package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ITgDao;
import com.service.ITkService;
import com.tools.DL;

/**
 * Servlet implementation class Allks
 */
@WebServlet("/allks.jspx")
public class Allks extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ITkService ts;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Allks() {
        super();
        // TODO Auto-generated constructor stub
        DL d=DL.getdl();
		this.ts= (ITkService) d.getobj("tkservice");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=ts.getall();
		response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		out.println(s);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
