package com.program;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Fact")
public class Fact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter ps=response.getWriter();
		int n=Integer.parseInt(request.getParameter("t1"));

		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		ps.println("Number is : "+n);
		ps.println("Factorial is : "+fact);
		ps.close();

	
	}

}
