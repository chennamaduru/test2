

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LoginServlet extends GenericServlet implements Servlet
{
	private static final long serialVersionUID = 1L;
  
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException  
	{
		try
		{
		String s1=req.getParameter("uname");
		String s2=req.getParameter("pword");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body bgcolor=yuellow text=red ><h1>");
		    if((s1.equals("abc"))&&(s2.equals("xyz")))
		       {
			     pw.println("welcome to "+s1);
		       }
	       	else
		       {
			      pw.println("Invalid username/Password");
		       }
		     pw.println("</h1></body></html>");
		// TODO Auto-generated method stub
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
