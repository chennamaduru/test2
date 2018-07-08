package program;
import java.util.Scanner;
public class StringConcatinationAlternativeWords {

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a first string");
		String s1=scr.nextLine();
		System.out.println("enter a second string");
		String s2=scr.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int i=0;
		String s3=" ";
		if(s1.length()>=s2.length())
		{
			for(i=0;i<s1.length();i++);
		  {
			s3=s3+s1.charAt(i);
			s3=s3+s2.charAt(i);
			
		    }
		}
		else if(s2.length()>=s1.length())
		{
			for(i=0;i<s2.length();i++)
			{
				s3=s3+s2.charAt(i);
				s3=s3+s1.charAt(i);
			}
		}
		
       System.out.println(s3);

	}
	

}
