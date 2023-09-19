package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Retriving")
public class Retriving extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
//		String name=request.getParameter("t1");
//		String value=request.getParameter("t2");
		
		Cookie c[] =request.getCookies();
		for(int i=0;i<c.length;i++) {
			String n = c[i].getName();
			String v = c[i].getValue();
			pw.println("Cookie name is :"+n +"\n Cookie Value is :"+v);
			pw.println("Cookie Retrived Successfully");
		}
		
	}

	

}