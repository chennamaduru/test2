<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
try{
	Connection con=databasecon.getconnection();
	String sender=request.getParameter("from");
	String receiver=request.getParameter("to");
	String text=request.getParameter("text");
	PreparedStatement ps=con.prepareStatement("insert into messagetable(sender,receiver,text) values(?,?,?)");
	            ps.setString(1,sender);
				ps.setString(2,receiver);
				ps.setString(3,text);
				ps.executeUpdate();
				out.println("successfull");
}
catch(Exception e)
{
	out.println(e);
}
%>				