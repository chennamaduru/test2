<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.zip.*"%>
<%@ page import="java.sql.*,databaseconnection.*,databasecon.*"%>
<%@ page language="java" import="javax.servlet.*"%>
<%@ page language="java" import="javax.servlet.http.*"%>
<%
String saveFile="";
String contentType = request.getContentType();
 if((contentType != null)&&(contentType.indexOf("multipart/form-data") >= 0))
  {
    DataInputStream in = new DataInputStream(request.getInputStream());
    int formDataLength = request.getContentLength();
    byte dataBytes[] = new byte[formDataLength];
    int byteRead = 0;
    int totalBytesRead = 0;
      while(totalBytesRead < formDataLength)
	  {
          byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
          totalBytesRead += byteRead;
        }
    String file = new String(dataBytes);
    saveFile = file.substring(file.indexOf("filename=\"") + 10);
    saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
    saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
	int lastIndex = contentType.lastIndexOf("=");
	String boundary = contentType.substring(lastIndex + 1,contentType.length());
	int pos;
	pos = file.indexOf("filename=\"");
	pos = file.indexOf("\n", pos) + 1;
	pos = file.indexOf("\n", pos) + 1;
	pos = file.indexOf("\n", pos) + 1;
	int boundaryLocation = file.indexOf(boundary, pos) - 4;
	int startPos = ((file.substring(0, pos)).getBytes()).length;
	int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
	File ff = new File(saveFile);
	FileOutputStream fileOut = new FileOutputStream(ff);
	fileOut.write(dataBytes, startPos, (endPos - startPos));
	fileOut.flush();
	fileOut.close();
	%>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css">
	</head>
<BODY background="images\ooo.jpg"><div class="corner"><a href="http:/www.facebook.com" target="_blank"><img src="images\fb.png"></a>&nbsp;<a href="http:/www.twitter.com"target="_blank"><img src="images\tw.png "></a></div>
<div id="img_1">
   <IMG SRC="images\header.png"  ></div>
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
<div class="middle">

<img src="images\SUCCESS.png"><br>
<h3 STYLE="font-face:Viner Hand ITC;color:Gold;padding-left:30%">YOUR REGISTRATION IS SUCCESSFULL....</H3>
<H4  STYLE="font-face:Segoe Script;color:white;padding-left:30%" >Thank you..</h4>
</div>                
</body>
</html>
<%
	 try
		{
	Connection con=databasecon.getconnection();
	Statement stmt=con.createStatement();
     String filename=request.getParameter("uname");
	  FileInputStream fis;
       
			File f = new File(saveFile);
			 PreparedStatement ps=con.prepareStatement("insert into fileinfo(filename,file) values(?,?)");
			ps.setString(1,filename);
			fis = new FileInputStream(f);
			ps.setBinaryStream(2, (InputStream)fis, (int)(f.length()));
            ps.executeUpdate();
		}	
	catch(Exception e)
	{
		e.printStackTrace();
		}

  }
 




  

%>