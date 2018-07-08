package venkatesh2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VLogin2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public VLogin2() {
        super();
       
    }

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	{ 
		try
		{
			ServletContext sc=getServletContext();
			String s1=req.getParameter("uname");
			String s2=req.getParameter("pword");
			if((s1.equals("abc"))&&(s2.equals("xyz")))
			{
			RequestDispatcher rd	=sc.getRequestDispatcher("/welcome");
			rd.forward(req, res);
			
			}
			else
			{
				PrintWriter pw=res.getWriter();
				pw.println("<html><body bgcolor=red text=yellow><h1>");
					pw.println("Invalid UserName/Password");
					pw.print("</h1></body></html>");
					RequestDispatcher rd	=sc.getRequestDispatcher("/Login.html");
				     rd.include(req, res);
			}
			
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}

	

}
