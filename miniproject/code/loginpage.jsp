<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
	String loginid=null;
	
	String name=null;
	String dob=null;
	String phoneno=null;
	try{
	ResultSet rs=stmt.executeQuery("select * from temp");
	if(rs.next()){
	  loginid=rs.getString(1);
	}
	
	ResultSet rs1=stmt.executeQuery("SELECT fname,phoneno,dob FROM regstable where rollno='"+loginid+"'");
	 while(rs1.next()){
		 
	      name=rs1.getString("fname");
		  phoneno=rs1.getString("phoneno");
		  dob=rs1.getString("dob");
	 
	%>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css">
	</head>
<BODY background="images\loginback.jpg"><div class="corner"><a href="http:/www.facebook.com" target="_blank"><img src="images\fb.png"></a>&nbsp;<a href="http:/www.twitter.com"target="_blank"><img src="images\tw.png "></a></div>
<div id="img_1">
   <IMG SRC="images\header.png"  ></div>
    <div id="nav1">
		   <nav class="nav2">
			<div class="menu">
			<li><a href="loginpage.jsp" onClick="logout.jsp"><img src="images\home3.png">Home</a></li> 
			<li><a href="placementCell.html" onClick="logout.jsp"><img src="images\registration.png">PlacementCell</a></li>  
			<li><a href="downloadpage.html"><img src="images\download.png">Downloads</a></li>
			<li><a href="profiledetails.jsp" onClick="logout.jsp"><img src="images\about.png">ProfileDetails</a></li>      
		   </div>
		   </nav> 
	</div>
	<div class="controls">
	        <a href="sendmail.jsp">SEND&nbsp;MAIL</a> <br><br><br><br><br>
			<a href="inbox.jsp">INBOX</a><br><br><br><br><br>
			
			<a href="logout.jsp">LOGOUT</a><br><br>  <br>       
	
	</div>
	<div class="prof_pic">
	      
	      <img src="images\photoback.png"  height="35%"/>
		  <div class="prof_img"><img src="profilepics/<%=loginid%>.jpg" alt="filename and loginid is not same!!"  width="55%" height="25%">
		  </div>
	</div>
	<div class="details">
	     <img src="images\detailsbk.png" />
		 <div class="details_txt">
		       &nbsp;&nbsp;&nbsp; <u>Welcome</u><br><b>
				Name:<%=name%><br>
				DOB:<%=dob%><br>
				phoneno:<%=phoneno%><b>
		 </div>	 
	</div>
	 
<div id="login_wel"> <img src="images\welcome.png""  width="55%" height="60%">  </div>	
	</body>
</html>
	<%
	 }
	
	}
	catch(Exception e)
	{
		out.println(e);
	}
	%>	
	