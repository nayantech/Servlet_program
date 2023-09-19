package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Great")
public class Great extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		int n1=Integer.parseInt(request.getParameter("f"));
		int n2=Integer.parseInt(request.getParameter("s"));
		int n3=Integer.parseInt(request.getParameter("t"));
		int n4=Integer.parseInt(request.getParameter("fo"));
		int i,sum=0;
//		for(i=1;i<=n1;i++) {
//			sum=sum+i;
//		}
		pw.println("1st Entered Number is"+n1);
		pw.println("2nd Entered Number is"+n2);
		pw.println("3rd Entered Number is"+n3);
		pw.println("4th Entered Number is"+n4);
		
		if(n1>n2 && n1>n3 && n1>n4) {
			pw.println("Greates Number amoung four Number is "+n1);
		}
		if(n2>n1 && n2>n3 && n2>n4) {
			pw.println("Greates Number amoung four Number is "+n2);
		}
		if(n3>n1 && n3>n2 && n3>n4) {
			pw.println("Greates Number amoung four Number is "+n3);
		}
		if(n4>n1 && n4>n2 && n4>n3) {
			pw.println("Greates Number amoung four Number is "+n4);
		}
		

		
	}

	
	}