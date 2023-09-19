package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Rev")
public class Rev extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		pw.println("Reverse of Number is "+num);
		
		int t;
		while(num!=0) {
			t=num%10;
			pw.print(t);
			num=num/10;
		}
		

	
	}
}