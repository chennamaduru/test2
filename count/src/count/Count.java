package count;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Count extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count=0;
       
    
    public Count() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		count++;
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text=blue><h1>");
		pw.println("THis page has been accesed"+count+"times");
		pw.println("</h1></body></html>");
		
		
	}

	

}
