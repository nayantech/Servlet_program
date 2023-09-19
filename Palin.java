package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Palin")
public class Palin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		int num1,t,rev=0;
		num1=num;
		while(num!=0) {
			t=num%10;
			rev=(rev*10)+t;
			num=num/10;
		}
		if(num1==rev) {
			pw.println(num1+" Is a palindrome Number");
		}
		else {
			{
				pw.println(num1+" Is Not a palindrome Number");
			}
		}
	}

	
	

}