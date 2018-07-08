package com.durga.exceptions;

public class ReturnFinally {

	public static void main(String[] args) 
	{
		try
		{
	       System.out.println("try");
	       return;
		   
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("final");
		}
	
          System.out.println();
	}

}
