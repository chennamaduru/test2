package program;

import java.util.Scanner;

public class ShortestDistance {

	public static void main(String[] args) 
	{
	   int d1;
	   int d2;
		int d3;
	   int min=0;
	   Scanner scr=new Scanner(System.in);
	   d1=scr.nextInt();
	   d2=scr.nextInt();
	   d3=scr.nextInt();
	   if(d1<d2)
	   {
		   min=min+d1;
		   if(d2<d3)
		   {
			   min=min+d1;
			   min=min+(2*d2);
			   System.out.println("min");
		   }
		   else if(d3<=d1)
		   {
			  min=min+d3;
			  if(d3<d2)
			  {
				  min=min+min;
				  System.out.println("min");
			  }
			  
		   }
		   
	   }
	 //  else(d2<d1)
	   {
		  min=min+d2;
		   if(d3<=d1)
		   {
			   min=min+d3;
			   min=2*min;
			   System.out.println(min);
		   }
		 //  else(d1<d3)
		   {
			 min=min+d2;
			 min=min+(2*d1);
			 System.out.println(min);
		   }
	   }

	}

}
