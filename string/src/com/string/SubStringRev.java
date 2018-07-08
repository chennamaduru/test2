package com.string;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class SubStringRev {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scr.nextLine();
		String s2="";
		for(int i=s1.length()/2;i>=0;i--)
		{
		 s2=s2+s1.charAt(i);
		}
       System.out.println(s2);

	}

}
