package com.program;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Small")
public class Small extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		int m1=Integer.parseInt(request.getParameter("fi"));
		int m2=Integer.parseInt(request.getParameter("se"));
		int m3=Integer.parseInt(request.getParameter("thi"));
		pw.println("1st Entered Number is"+m1);
		pw.println("2nd Entered Number is"+m2);
		pw.println("3rd Entered Number is"+m3);
		if(m1<m2 && m1<m3) {
			pw.println("Amoung 3 smallest Number is "+m1);
		}
		if(m2<m1 && m2<m3) {
			pw.println("Amoung 3 smallest Number is "+m2);
		}
		if(m3<m1 && m3<m2) {
			pw.println("Amoung 3 smallest Number is "+m3);
		}
		
		
		
	}
	

	}
