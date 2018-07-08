package com.exception;
public class Demo 
{
int x=20;
public void test()
   {
	System.out.print("running test()");
	
	}
}
class main
 {
	public static void main(String args[])
	{
		Demo d1=null;
		System.out.println("value of x is"+d1.x);
		d1.test();
		System.out.println("programends");
	}
	
	
 	}

