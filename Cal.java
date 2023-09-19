package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cal")
public class Cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("t1"));
		int n2=Integer.parseInt(request.getParameter("t2"));
		String choice=request.getParameter("r1");
		if(choice.equals("add"))
		{
			int add=n1+n2;
			pw.println("Addition is "+add);
			
		}
		else if(choice.equals("sub"))
		{
			int sub=n1-n2;
			pw.println("Subtraction is "+sub);
		}
		else if(choice.equals("mul"))
		{
			int mul=n1*n2;
			pw.println("Multiplication is "+mul);
		}
		else if(choice.equals("div"))
		{
			int div=n1/n2;
			pw.println("Division is "+div);
		}
		else
		{
			int mod=n1%n2;
			pw.println("Modulus is "+mod);
		}
	}

	

}
