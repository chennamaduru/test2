<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="java.util.Calendar"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	try{
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
    String first = request.getParameter("first");
	String second = request.getParameter("second");
	String third= request.getParameter("third");
	String fourth= request.getParameter("fourth");
	String mv_name="";
	String theater_name=(String)session.getAttribute("theater_name1");
	String no_of_seats=(String)session.getAttribute("no_of_seats");
	String bkdate=(String)session.getAttribute("bkdate");
	String time=(String)session.getAttribute("time");
	int cost=80;
	int tcost=0;
	int servivetax=10;
	int internethandl=10;
	int seats=Integer.parseInt(no_of_seats);
	int subt=seats*cost;
	tcost=subt+servivetax+internethandl;
	if(first==""&&second==""&&third==""&&fourth=="")
	{out.println("please select seats...");}
else{
    session.setAttribute("seat_1",first);
	 session.setAttribute("seat_2",second);
	  session.setAttribute("seat_3",third);
	   session.setAttribute("seat_4",fourth);
     }
   %>
 <html>
<head>
<title>Seating</title>
<link rel="stylesheet" type="text/css" href="seat_1.css">
<style type="text/css">
      button{
	   margin:0;
	   padding:0;
	  }
	  .inbox_msgs{
		        width:300px;
				height:100px;
				text-align:center;
				background-color:#ffffff;
				border:1px solid black;
				opacity:0.5;
				color:red;
		
		}
		ul.d {list-style-type:square;}
</style>
<script src="jquery-2.1.4.min.js"></script> 
 <script src="seats.js"></script> 
</head>
<body>
<div>
  <header>
<p style="font-size:30pt;color:black;position:absolute">BIG CINEMAS</p>
    <span><a href="#">Login</a></span>
    <span><a href="#">Movies</a></span>
    <span><a href="big_cinemas.html">Home</a></span>
  </header>
</div>
</div><div id="or_txt">Order Summary
	</div><div id="line_bor_der"></div>
<div >
<table  id="order_sum">
       <tr><td align="left" ><b>Movie Name:</td><td align="left" width="150" ><%=mv_name%></td>
	   <td align="left" ><b>Sub Total:</td><td align="right" width="150"><b>Rs.<%=subt%>.00</b></td></tr>
 <tr><td align="left"><b>Theatre:</td><td align="left" width="150"><%=theater_name%></td>
   <td align="left" ><b>Internet Handl Fee:</td><td align="right" width="150">Rs.<%=internethandl%>.00</td>
  </tr>
<tr><td align="left" ><b>Location:</td><td align="left" width="150">Anantapur</td>
<td align="left" ><b>Service Tax:</td><td align="right"width="150">Rs.<%=servivetax%>.00</td>
</tr>	   
<tr><td align="left"><b>Show Timings:</td><td align="left" width="150"><%=bkdate%>,@<%=time%></td>
 <td align="left" ><b><h3>Amount Payable:</h3></b></td><td align="right" width="150">Rs.<%=tcost%>.00</td></tr>	   
<tr><td align="left" ><b>Class:</td><td align="left" width="150"></td></tr>	   
<tr><td align="left" ><b>Cost Per Ticket:</td><td align="left" width="150">Rs.<%=cost%>.00</td></tr>	   
<tr><td align="left" ><b>#Tickets:</td><td align="left" width="150"><%=no_of_seats%></td></tr>
<tr></tr>
 <tr> </tr>
	<tr></tr>
</tr>	   
<tr></tr>	  
	  </table>
</div>
<div style="margin-top:480px;margin-left:110px;position:absolute">
	<table >
	<caption>Terms and Conditions</caption>	
		<td style="font-weight:bold;color:blue" class="inbox_msgs">
		 <UL class="d" >
  <LI>Intimate the theater before 10mints of the show</LI>
  <LI>kindly CANCLE your tickets if you don't have interest.</LI>
  <LI>collect your booked tickets in the counter being alloted by theater.</LI>
</UL> </td>
	</table>
	</div><div id="line"></div>
	<div id="user_details">
<form name="id_phn_no" method="post" action="BookTicket.jsp" onsubmit="return check()">
						<table>
						<th colspan=2>Fill Details For Ticket</th>
						  <tr>
						  <td align="left">Name:<span id="mandetory">*</span></td>
						  </tr><tr><td><input type="text" name="u_name" size="25" placeholder=" Full Name."> </td>
						  </tr>
						  <tr>
						  <td align="left">Phone&nbsp;number:<span id="mandetory">*</span></td> </tr>
						  <tr><td><input type="text" name="ph_no" size="25" placeholder=" Mobileno."> </td></tr>
						 <tr> <td align="left">Email &nbsp;id:<span id="mandetory">*</span></td> </tr>
						 <tr><td><input type="text" name="email_id" size="25" placeholder=" Email Id."> </td></tr>
						 <tr><td><input type="checkbox" name="agree" value="yes"><font size="2px">  I agree to the <b>Terms and Conditions Given Below</b></font></td></td></tr>
						  <tr><td colspan=2 align="center"><input type="Submit" value="Get Ticket" style="background-color:Crimson;border-radius:10px;color:white;" />&emsp;
						 <input type="reset" value="Reset" style="font-size:15;background-color:Crimson;border-radius:10px;border-radius:10px;color:white;" /></td>
						  </tr>
						</table>
		
</form>
</div>
	</body>
</html>
   <%
	
	}
	catch(Exception e)
	{
		out.println(e);
	}
	%>