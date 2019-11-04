package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Tg;
import com.service.ITgService;
import com.service.ITkService;
import com.tools.DL;

/**
 * Servlet implementation class Savetg
 */
@WebServlet("/savetg.jspx")
public class Savetg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ITgService ts;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Savetg() {
        super();
        // TODO Auto-generated constructor stub
        DL d=DL.getdl();
		this.ts=(ITgService) d.getobj("tgservice");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String gname=request.getParameter("gname");
		String gage=request.getParameter("gage");
		String gxb=request.getParameter("gxb");
		String ztype=request.getParameter("ztype");
		String znum=request.getParameter("znum");
		String kid=request.getParameter("kid");
		String kname=request.getParameter("kname");
		String gtype=request.getParameter("gtype");
		
		Tg t=new Tg();
		t.setGname(gname);
		t.setGage(Integer.parseInt(gage));
		t.setGxb(gxb);
		t.setZtype(ztype);
		t.setZnum(znum);
		t.setKid(Integer.parseInt(kid));
		t.setKname(kname);
		t.setGtype(gtype);
		
		String s=ts.save(t);
		response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		out.println(s);
		out.flush();
		out.close();
		
	}

}
