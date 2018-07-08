package program;

import java.util.Scanner;

public class StringAnagram
{

	public static void main(String[] args)
	{
		 Scanner scr=new Scanner(System.in);
		 System.out.println("enter a string");
		 String str1=scr.nextLine();
		 System.out.println("enter a second string");
		 String str2=scr.nextLine();
		 str1=removeSpace(str1);
		 str2=removeSpace(str2);
		 if(str1.length()!=str2.length())
		 {
			 System.out.println("these two strings are not anagrams");
			 return;
		 }
		 str1=toUpper(str1);
		 str2=toUpper(str2);
		 char ch1[]=sort(str1);
		 char ch2[]=sort(str2);
		 for(int i=0;i<ch2.length;i++)
		 {
			 if(ch1[i]!=ch2[i])
			 {
				 System.out.println("thesev two strings are not an anagrams");
				 return;
			 }
			 else
			 {
				 System.out.println("these two strings are anagrams");
			 }
		 }

	}

	static String removeSpace(String st)
	{
		char ch[]=st.toCharArray();
		st=" ";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				st=st+ch[i];
			}
		
		}
		return st;
	}
	
	static String toUpper(String st)
	{
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
           {
        	   if(ch[i]>=97&&ch[i]<=122)
        	   {
        		   st=st+(char)(ch[i]-32);
        	   }
        	   else
        	   {
        		   st=st+ch[i];
        	   }
           }
		return st;

	}
	
	static char[] sort(String st)
	{
		char  ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		return ch;
	}
	
	
	
	

}
