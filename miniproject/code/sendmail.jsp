<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
	String loginid;
	
	String name=null;
	String dob=null;
	String phoneno=null;
	ResultSet rs=stmt.executeQuery("select * from temp");
	if(rs.next()){
	  loginid=rs.getString(1);
	
	ResultSet rs1=stmt.executeQuery("SELECT fname,phoneno,dob FROM regstable where rollno='"+loginid+"';");
	 while(rs1.next()){
		 
	      name=rs1.getString("fname");
		  phoneno=rs1.getString("phoneno");
		  dob=rs1.getString("dob");

	%>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css">
	<script type="text/javascript">
function validate()
{
  var f=document.form1.from.value;
  if(f=="")
  {
  alert("Enter from address");
   
  return false;
  }
  var p=document.form1.to.value;
  if(p=="")
  {
  alert("enter ");
    
  return false;
  }
}
</script>
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
		  <div class="prof_img"><img src="profilepics/<%=loginid%>.jpg" alt="filename and loginid is not same!!" width="55%" height="25%">
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
<div class="send_msg">
      <center>
	  <form method="post" name="form1" Onsubmit="return validate()" action="message.jsp">
	    <table align="center">
		<tr><td align="center" style="color:navyblue;font-size:20px">From:</td>
		<td align="center"><input type="text" name="from" size="60" maxlength="30" ></td>
		<tr><td align="center"style="color:navyblue;font-size:20px">To:</td>
		<td align="center"><input type="text" name="to" size="60" maxlength="30" placeholder="'All_students@skucet.com' for all Students" ></td>
		<tr><td align="center" colspan="2"><textarea rows="20" cols="80" name="text" style="color:blue">   </textarea></td>
		
		<tr><td align="right" colspan="2"><input type="submit" value="SEND"></td>
		
		
		
</table>
</form>
</center>
</div>
	
	</body>
</html>
	<%
	 }
	}
	%>	
<%




%>