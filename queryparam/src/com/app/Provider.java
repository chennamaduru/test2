package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/home")
public class Provider 
{
	@Path("/msg")
	@GET
	public String showMsg(
			@QueryParam("eid")int empId,
			@QueryParam("ename")String empName,
			@QueryParam("esal")double empSal)
	{
		return  "hello:"+empId+","+empName+","+empSal;
	
	}
			
	

}
