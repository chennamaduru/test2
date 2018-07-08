package venkatesh2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Welcome() {
        super();
         }

	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		try{
		String s=req.getParameter("uname");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body bgcolor=blue text=grey><h1>");
		pw.println("welcome"+s);
		pw.println("</h1></body></html>");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

} 
