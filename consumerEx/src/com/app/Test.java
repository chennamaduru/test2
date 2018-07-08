package com.app;

import org.codehaus.jackson.map.ObjectMapper;

public class Test 
{
	public static void main(String args[])
	{
		Address addr=new Address();
		addr.setAddrId(10);
		addr.setLoc("HYD");
		Employee emp=new Employee();
		emp.setEmpid(55);
		emp.setEmpName("AA");
		emp.setEmpSal(3.2);
		emp.setAddr(addr);
		try
		{
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(emp);
			System.out.println(json);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
