package com.app.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/provider")
public class MessageProvider
{
   @Path("/msg")
   @GET
   public String showMessage()
       {
	     return "welcome to ReSt";
       }
 
   }
