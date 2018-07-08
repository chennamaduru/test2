package program;

import java.util.Scanner;

public class StringPalindrom
{

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scr.next();
		char ch[]=str.toCharArray();
		int i=0;
		while(i<ch.length/2) 
		{
			if(ch[i]!=ch[ch.length-1-i])
			{
				break;
			}
		}
	if(i==ch.length/2)
		{
			System.out.println(str+" is  palindrome");
		}
		else
		{
			System.out.println(str+" not a palindrome");
		}
		

	}

}
