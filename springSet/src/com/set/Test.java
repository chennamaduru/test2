package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/context.xml");
		Object ob=ctx.getBean("demo");
		SetDemo sdemo=(SetDemo)ob;
		sdemo.show();
	}

}
