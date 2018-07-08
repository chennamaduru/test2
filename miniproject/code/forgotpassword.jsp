<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
	
	String result=null;
	String name=null;
	
	ResultSet rs;
	String phoneno=request.getParameter("phoneno");
	String loginid=request.getParameter("loginid");
	try{
		
     
	 rs=stmt.executeQuery("select rollno,fname,pass,phoneno from regstable where rollno='"+loginid+"'and phoneno='"+phoneno+"'");
	 while(rs.next()){
		 result=rs.getString("pass");
		 name=rs.getString("fname");
	 }
	 
	 
     if(result==null){
		  
		  result="you don't have an account please register!!!";
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
     <form class="form-horizontal" name="myform"  method="post" action="forgotpassword.jsp" onsubmit="return validate()">     
     <table align="center" align="center" bgcolor="#FFFFFF" width="400" style="border-radius:20px;box-shadow:5px 5px 5px 5px #ccc">
	 <tr><td align="center" colspan="2" style="font-face:arial;font-type:bold;font-size:30px;color:blue;" ><u>Enter Required Details</u></td></tr>
	 <tr></tr>
	 <tr align="center">
						  <td align="center" style="color:black;">LOGIN ID:&nbsp;<input type="text" name="loginid" size="25" value="<%=loginid%>" readonly> </td>
						  </tr>
	  
      <tr align="center">
						  <td align="center" style="color:black;">Name:&nbsp;<input type="text" name="" size="25" value="<%=name%>"  readonly> </td>
						  </tr>                  
    <tr align="center">	<td>
	<input type="text" maxlength="60" size="40" value="<%=result%>" readonly /></td>
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
	