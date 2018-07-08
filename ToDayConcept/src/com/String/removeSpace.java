package com.String;

import java.util.Scanner;

public class removeSpace
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scr.nextLine();
		str=spaceRemove(str);
		System.out.println("after removespace "+str);
		
	}
	static String spaceRemove(String st)
	{
		
		char ch[]=st.toCharArray();
		st=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				st=st+ch[i];
			}
		}
		return st;
	}
}
