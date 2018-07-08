package com.durgasoft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		out.println("<html><body>");
		out.println("<font  color='red' size='6'");
		out.println("<br><br>");
		if(uname.equals("durga")&&upwd.equals("durga"))
		{
			out.println("login sucess");
		}
		else
		{
			out.println("login failure");
		}
		out.println("<br><br>");
		out.println("<a href='/loginform.html'>loginpage</a>");
		out.println("</font></body></html>");
		
		
	
	}

}
