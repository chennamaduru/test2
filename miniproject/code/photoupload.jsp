

<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css">
	<script type="text/javascript">

	 function validate()
      {
	    var u=document.productForm.img_file.value;
		if(u=="")
  		{
   		  alert( "Upload Image Here" );
    	  document.productForm.img_file.focus() ;
    	  return false;
        }
     }
</script>
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
<div  class="upload_pic">
      <form align="center" method="post"  name="productForm"  ENCTYPE="multipart/form-data" action="fileupload.jsp"  onSubmit="return validate()" >
          <table align="center" width="400" bgcolor="#FFFFFF" height="5" style="border-radius:10px;box-shadow:5px 5px 5px 5px #ccc;"  >
            <tr> 
              <td align="center" colspan=2   style="font-weight:bold;font-size:20pt;"> 
                <font color="#CC3300">Image Details</font></td>
            </tr>
            <tr> 
              <td align="center" colspan=2>&nbsp;</td>
            </tr>
			<tr> 
              <td align="center"><b style="font-size:16px;color:blue;">Login id: 
                </b></td>
              <td align="left"> <INPUT NAME="uname" TYPE="text">
              <td> </tr>
            <tr> 
              <td align="right"><b style="font-size:16px;color:blue;">Upload Photo: 
                </b></td>
              <td align="center"> <INPUT NAME="img_file" TYPE="file">
              <td> </tr>
            <tr> 
              <td align="center" colspan=2>&nbsp;</td>
            </tr>
            <tr> 
              <td></td>
              <td> <button  type="submit" name="send" >Upload 
                Image</button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				
				</tr>
				
				</table>
        </form>
		<h3 style="color:red;padding-left:20%">NOTE:</h3><h4 style="color:white;padding-left:20%">Your loginid  and image file name should be same otherwise it can't display,size should be lessthan 1000kb</h4>
	</div>	
</body>
</html>		
				
				
				
				
				
				
				
				
				