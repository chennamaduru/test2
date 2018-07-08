<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
Statement stmt=con.createStatement();
ResultSet rs = null;
try {
	
	
	stmt.executeUpdate("truncate temp;"); 
		response.sendRedirect("index.html");
con.close();
		
		} 





catch (Exception e) {

out.println("Unable To Display image");

out.println("Image Display Error=" + e.getMessage());

return;

} 



%>