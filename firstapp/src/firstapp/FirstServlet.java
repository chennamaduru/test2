package firstapp;

import java.io.PrintWriter;
import javax.servlet.*;

public class FirstServlet extends GenericServlet
 {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req,ServletResponse res)
	 {
		 try
		 {
			PrintWriter pw=res.getWriter();
		    pw.println("<html><body bgcolor=yellow text=red><h1>");
		    pw.println("Welcome to sathya Technologies");
		    pw.println("</h1></body></html>");
		 }
		 catch(Exception e)
		 {
			 System.err.print(e);
		 }
	 }
 }