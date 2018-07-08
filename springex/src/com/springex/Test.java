package com.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
public static void main(String args[])
    {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	Object ob=ctx.getBean("empObj");
	Employee e=(Employee) ob;
	System.out.println(e.toString());
	System.out.println(e.getEName());
	System.out.println(e.getEId());
	System.out.println(e.getAddress());

	}
}

