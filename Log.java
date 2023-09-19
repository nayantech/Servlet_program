package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Log")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		if(username.equals("admin") && password.equals("quastech"))
		{
			
//			pw.println("Login Successfully ");
			pw.print("<font color=green> Login Successfully ");
			pw.println("Welcome"+username);
		}
	
		else
		{
			pw.println("Login Failed");
		}
		
	}


	}