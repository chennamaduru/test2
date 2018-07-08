package com.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/context.xml");
		Object ob=ctx.getBean("id1");
		PnameSpace sp=(PnameSpace)ob;
		System.out.println(sp.getX());
		System.out.println(sp.getB().getY());
		

	}

}
