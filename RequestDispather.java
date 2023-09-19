package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispather")
public class RequestDispather extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		if(s1.equals("admin") && s2.equals("pass")) {
			RequestDispatcher rd=request.getRequestDispatcher("success");
			rd.forward(request,response);
		}
		else {
//			RequestDispatcher rd2=request.getRequestDispatcher("input.html");
			RequestDispatcher rd2=request.getRequestDispatcher("Failed");
			rd2.include(request,response);
		}
		
	}

	

}