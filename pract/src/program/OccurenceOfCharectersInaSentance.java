package program;

import java.util.Scanner;

public class OccurenceOfCharectersInaSentance 
{

	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scr.nextLine();
		char ch[]=str.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					int k=j;
					while(k<n-1)
					{		
						ch[k]=ch[k+1];      // decreasing "j" value
						k++;
					}
					
				}
				
			}
			System.out.println(ch[i] +"  occured  "+ count + "  times  ");
		}
		

	}

}
