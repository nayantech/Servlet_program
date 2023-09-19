package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pri")
public class Pri extends HttpServlet {
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		int b=2;
		while(num%b!=0) {
			b++;
		}
		if(num==b) {
			pw.println(num+" Is a prime number");
		}
		else {
			pw.println(num+" It is not a prime number");
		}
	}

	

}