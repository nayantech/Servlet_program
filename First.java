package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	
		PrintWriter ps=res.getWriter();
		String name=req.getParameter("t1");
		ps.println("Welcome In Advanced Java Program :)"+name);
		ps.close();
	}



}