
	<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
	try{
	Connection con=databasecon.getconnection();

	Statement stmt=con.createStatement();
	  
	String loginid=request.getParameter("loginid");
	String pass=request.getParameter("pass");

      ResultSet rs=stmt.executeQuery("select rollno,pass from regstable where rollno='"+loginid+"' and pass='"+pass+"'");
		if (rs.next())
		{
			 PreparedStatement ps=con.prepareStatement("insert into temp(loginid) values(?)");
		   ps.setString(1,loginid);
			    ps.executeUpdate();
			response.sendRedirect("loginpage.jsp");
			}
		
	 
	 
		
	 
	}
	catch(Exception e)
   {
	   
	   out.println("error:"+e);
   }
	
	
	%>
	
$("#A1").click(function(){ 
  $("#A1:first").val("booked");
  $("#A1").val("book");
  });
  List<String> list1=new ArrayList<String>();

 	<%--	list1=new ArrayList<String>(Arrays.asList(hseat.split(",")));--%>
	<%--String s=list1.get(1);--%>
<tr><td><button id="click_12"><input type="hidden" name="A12" id="A12"></button></td>
         <td><button id="click_13"><input type="hidden" name="A13" id="A13" ></button></td>
         <td><button id="click_14"><input type="hidden" name="A14" id="A14" ></button></td>
         <td><button id="click_15"><input type="hidden" name="A15" id="A15" ></button></td>
         <td><button id="click_16"><input type="hidden" name="A16" id="A16" ></button></td>
         <td><button id="click_17"><input type="hidden" name="A17" id="A17" ></button></td>
         <td><button id="click_18"><input type="hidden" name="A18" id="A18" ></button></td>
         <td><button id="click_19"><input type="hidden" name="A19" id="A19" ></button></td>
         <td><button id="click_20"><input type="hidden" name="A20" id="A20" ></button></td>
          <td><button id="click_21"><input type="hidden" name="A21" id="A21" ></button></td>
          <td><button id="click_22"><input type="hidden" name="A22" id="A22" ></button></td></tr>
 function gettime(){
  var currentTime=new Date();
  var currentHours=currentTime.getHours();
  var currentMinutes=currentTime.getMinutes();
  var currentSeconds=currentTime.getSeconds();
  currentMinutes=(currentMinutes<10?"0":"")+currentMinutes;
   currentSeconds=(currentSeconds<10?"0":"")+currentSeconds;
  
}
var currentTime=new Date();
  var currentHours=currentTime.setHours(1);
  var currentMinutes=currentTime.getMinutes(00);
  var currentSeconds=currentTime.getSeconds(00);
  var cTime=currentHours+":"+currentMinutes+":"+currentSeconds;