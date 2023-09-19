package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BypostServlet")
public class BypostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("t1");
		String pass=request.getParameter("t2");
		
		if(user.equals("admin") && pass.equals("quastech")) {
			pw.println("<font color=green> Login Successfully "+user);
		}
		else {
			pw.println("<font color=red> Login Failed");
		}
		
	}

	
}