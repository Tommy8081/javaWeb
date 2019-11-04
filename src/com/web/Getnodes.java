package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.ITnodeService;
import com.tools.*;

/**
 * Servlet implementation class Getnodes
 */
@WebServlet("/getnodes.jspx")
public class Getnodes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ITnodeService ts;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getnodes() {
        super();
        // TODO Auto-generated constructor stub
        this.ts=(ITnodeService) DL.getdl().getobj("tnodeservice");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid=request.getParameter("uid");
		String s=ts.getbyuid(uid);
		
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
