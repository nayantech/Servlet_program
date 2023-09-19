package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;/
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Bygenric")

//Using By GenricServlet
//and by using xml
public class Bygenric extends GenericServlet {
	private static final long serialVersionUID = 1L;
       


	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("t1");
		String pass=request.getParameter("t2");
		
		if(user.equals("admin") && pass.equals("quastech")) {
			pw.println("<font color=green> Login Successfully :))))))))))))))))))"+user);
		}
		else {
			pw.println("<font color=red> Login Failed :((((((((((((((((((");
		}
	}

	

}