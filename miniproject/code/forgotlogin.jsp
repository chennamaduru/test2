<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
	ResultSet rs;
	String id=null;
	String semail=request.getParameter("email");
	try{
	 rs=stmt.executeQuery("select rollno,email from regstable where email='"+semail+"'");
	 while(rs.next()){
		 id=rs.getString("rollno");
	 }
	 
	 
     if(id==null){
		  
		  id=semail;
	  }
%>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css">
	</head>
<BODY background="images\ooo.jpg"><div class="corner"><a href="http:/www.facebook.com" target="_blank"><img src="images\fb.png"></a>&nbsp;<a href="http:/www.twitter.com"target="_blank"><img src="images\tw.png "></a></div>
<div id="img_1">
   <IMG SRC="images\header.png" ></div>
    <div id="nav1">
		   <nav class="nav2">
			<div class="menu">
			<li><a href="index.html"><img src="images\home3.png">Home</a></li> 
			<li><a href="confirm.html"><img src="images\registration.png">Registration</a></li> 
			<li><a href="Eventgallery.html"><img src="images\gallery1.png">Eventgallery</a></li>
			<li><a href="about.html"><img src="images\about.png">About Us</a></li>     
		   </div>
		   </nav> 
	</div>
<div class="forget_pass"> 
     <form >     
     <table align="center" align="center" bgcolor="#FFFFFF" width="400" style="border-radius:20px;box-shadow:5px 5px 5px 5px #ccc">
	 <tr><td align="center" colspan="2" style="font-face:arial;font-type:bold;font-size:30px;color:blue;" ><u>Enter Required Details</u></td></tr>
	 <tr></tr>          
    <tr align="center">	<td>LoginId:
	</td>
	<td>
	<input type="text" maxlength="60" size="40" value="<%=id%>" readonly /></td>
	</tr>
	<tr align="center">	<td colspan="2"><a href="index.html">Back</a>
	</td>
	</tr>
</table>
</div>	
</body>
</html>
<%
	}
   catch(Exception e)
   {
	   
	   out.println("error:"+e);
   }
%>
	