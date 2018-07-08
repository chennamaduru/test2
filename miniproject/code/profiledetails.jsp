<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
	String loginid=null;
	String roll=null;
	String name=null;
	String dob=null;
	String phoneno=null;
	String sex=null;
	String email=null;
	try{
	ResultSet rs=stmt.executeQuery("select * from temp");
	if(rs.next()){
	  loginid=rs.getString(1);
	}
	
	ResultSet rs1=stmt.executeQuery("SELECT rollno,fname,phoneno,sex,dob,email from regstable where rollno='"+loginid+"' ");
	 while(rs1.next()){
		   roll=rs1.getString("rollno");
	      name=rs1.getString("fname");
		  phoneno=rs1.getString("phoneno");
		  dob=rs1.getString("dob");
		  sex=rs1.getString("sex");
		  email=rs1.getString("email");
	 
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
	<div  class="p_deatils">
     
          <table align="center" width="400"  height="5" border="1" >
            <tr> 
              <td align="center"   colspan="2" style="font-weight:bold;font-size:20pt;"> 
                <font color="white" size="5" >Profile Details</font></td>
            </tr>
            <tr> 
              <td align="center" colspan=2>&nbsp;</td>
            </tr>
			<tr> 
              <td align="center"><b style="font-size:20px;color:blue;">Login id: 
                </b></td>
              <td align="left" style="font-size:20px;color:black;"> <%=roll%>
              <td> </tr>
            <tr> 
              <td align="right"><b style="font-size:20px;color:blue;">User name: 
                </b></td>
              <td align="center" style="font-size:20px;color:black;">  <%=name%>
              <td> </tr>
           <tr> 
              <td align="right"><b style="font-size:20px;color:blue;">Phoneno: 
                </b></td>
              <td align="center" style="font-size:20px;color:black;">  <%=phoneno%>
              <td> </tr>
			  <tr> 
              <td align="right"><b style="font-size:20px;color:blue;">Date of Birth: 
                </b></td>
              <td align="center" style="font-size:20px;color:black;">  <%=dob%>
              <td> </tr>
				<tr> 
              <td align="right"><b style="font-size:20px;color:blue;">Sex: 
                </b></td>
              <td align="center" style="font-size:20px;color:black;">  <%=sex%>
              <td> </tr>
			  <tr> 
              <td align="right"><b style="font-size:20px;color:blue;">Email id: 
                </b></td>
              <td align="center" style="font-size:20px;color:black;">  <%=email%>
              <td> </tr>
				</table>
	
	
	
	
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