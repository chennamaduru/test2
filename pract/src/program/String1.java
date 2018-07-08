package program;
import java.util.Scanner;

public class String1 
{
	public static void main(String args[])  
	{
		Scanner scr=new Scanner(System.in);              /* string reverse*/
		System.out.println("enter a string");
		String str= scr.next();
		System.out.println("before reverse"+str);
		str=reverse(str);
		System.out.println("after reverse"+str);
		
	}
	static String reverse(String st)
	{
		char ch[]=st.toCharArray();
		st=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			st=st+ch[i];
		}
		return st;
	}
}
