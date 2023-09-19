package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionCheck")
public class SessionCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession(true);
		Date d=(Date)hs.getAttribute("A");
		if(d!=null) {
			pw.println("Last Access : "+d);
		}
		d=new Date();
		pw.println("\nCurrent Date and Time is: "+d);
		hs.setAttribute("A", d);
				
	}

	

}