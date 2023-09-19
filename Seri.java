package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Seri")
public class Seri extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		int num=Integer.parseInt(request.getParameter("n"));
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			
			sum=sum+i;
		}
		pw.println("Entered Number Sum of Number is "+num);
		pw.println("Sum Of Series Is "+sum);
		
	}


	

}
