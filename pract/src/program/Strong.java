package program;
import java.util.Scanner;

public class Strong {
	static boolean isString(int n)
	{
		int t=n;
		int sum=0;
		while(t>0)
		{
			int r=t%10;
			sum=sum+fact(r);
			t=t/r;
		}
		if (sum==n)
		return true;
		else 
			return false;
	}
	static int fact(int r)
	{
		int fact=1;
		while(r>0)
		{
			fact=fact*r;
			r--;
		}
		return fact;
		
	}

	public static void main(String[] args)
	{
	 Scanner scr =new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=scr.nextInt();
	 Strong s=new Strong();
	 boolean b=Strong.isString(n);
	 if(b==true)
	 {
		System.out.println("strong"); 
	 }
	 

	}

}
