package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Arm")
public class Arm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		int num1,t,sum=0;
		num1=num;
		while(num1!=0) {
			t=num1%10;
			sum=sum+(t*t*t);
			num1=num1/10;
		}
		if(num==sum) {
			pw.println(num+" is a Armstrong number ");
		}
		else {
			pw.println(num+" is Not a Armstrong number");
		}
	}

	

}
