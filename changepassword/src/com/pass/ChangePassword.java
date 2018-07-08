package com.pass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
	   try 
	   {
		String no=req.getParameter("regNo");
		String opass=req.getParameter("pword"); 
		String npass=req.getParameter("npword");
		String npass2=req.getParameter("npword2");
		PrintWriter pw=res.getWriter();
		if((no.equals("123"))&&(opass.equals("abc")))
		{
			if((npass.equals(npass2)))
			{
				System.out.println("password changed");
			}
			else {
				System.out.println("password doesnt match");
			}
		}
		else
		{
			System.out.println("invalid usen name/password");
		}
		
		
		
		
	   }
	   catch(Exception e)
	   {
		   
	   }
		
	}

	
}
