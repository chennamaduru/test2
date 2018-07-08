package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/config/context.xml");
		Mobile mob=(Mobile) ctx.getBean("mob");
		System.out.println(mob);
	}

}
