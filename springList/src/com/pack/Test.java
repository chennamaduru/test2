package com.pack;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
  public static void main(String args[])
  {
	  ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/context.xml");
	  Object ob=ctx.getBean("demo");
	  ListDemo lis=(ListDemo)ob;
	  lis.show();
	  
	  
  }
}