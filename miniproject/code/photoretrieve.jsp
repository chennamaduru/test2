<%@ page import="java.sql.*,databaseconnection.*"%>
<%@ page import="java.io.*"%>

<% Blob image = null;

Connection con = null;

byte[ ] imgData = null ;

Statement stmt = null;

ResultSet rs = null;
String loginid=null;



try {
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohan","root","1234");
stmt = con.createStatement();
ResultSet rs1=stmt.executeQuery("select * from temp");
	if(rs1.next()){
	  loginid=rs1.getString(1);
	}

rs = stmt.executeQuery("select filename,file from fileinfo where filename='"+loginid+"'");

while(rs.next()) {

image = rs.getBlob(2);

imgData = image.getBytes(2,(int)image.length());

} 

response.setContentType("image/jpeg");

OutputStream fid1 = response.getOutputStream();

fid1.write(imgData);


fid1.flush();

fid1.close();


} catch (Exception e) {

out.println("Unable To Display image");

out.println("Image Display Error=" + e.getMessage());

return;

} finally {

try {



stmt.close();

con.close();

} catch (SQLException e) {

e.printStackTrace();

}

}



%> 