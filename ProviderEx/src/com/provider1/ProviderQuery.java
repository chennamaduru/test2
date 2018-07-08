package com.provider1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class ProviderQuery
{
	@Path("/msg")
	@GET
	public String showMsg(
			@QueryParam("eid")int id,
			@QueryParam("ename")String nm,
			@QueryParam("esal")double sal)
	{		
	return "hello;"+id+","+nm+","+sal;
	
		
	}

}
