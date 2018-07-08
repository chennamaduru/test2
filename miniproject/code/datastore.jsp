<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	
	Statement stmt=con.createStatement();
	
		String roll=request.getParameter("rollno");
	String fname=request.getParameter("fname");
	String pass=request.getParameter("pass");
	String sex=request.getParameter("sex");
	 String day=request.getParameter("dd");
		  String month=request.getParameter("mm");
		  String year=request.getParameter("yyyy");
	String email=request.getParameter("email");
	String dob=year+"/"+month+"/"+day;
	int i=0;
	String phoneno=request.getParameter("phoneno");
	try{
     
	 ResultSet rs=stmt.executeQuery("select rollno from regstable where rollno='"+roll+"'");
	 if (rs.next())
		{
	               response.sendRedirect("userexister.jsp");
		}
		else{
	PreparedStatement ps=con.prepareStatement("insert into regstable(rollno,fname,pass,phoneno,sex,dob,email) values(?,?,?,?,?,?,?)");
	            ps.setString(1,roll);
				ps.setString(3,pass);
				ps.setString(2,fname);
				ps.setString(4,phoneno);
				ps.setString(7,email);
				ps.setString(6,dob);
				ps.setString(5,sex);
			    ps.executeUpdate();
		if(i==0){
		             response.sendRedirect("photoupload.jsp");  
		        }
		}
	}
	catch(Exception e)
	{
		out.println(e);
	}
%>