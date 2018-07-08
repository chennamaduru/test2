package program;
import java.util.Scanner;

public class ReverseWordsSentance
{

	private static Scanner scr;

	public static void main(String[] args)
	{
		scr = new Scanner(System.in);
		System.out.println("enter a string");
		String str=scr.nextLine();
		char ch[]=str.toCharArray();
		str=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				
				str=str+ch[j];
				j++;
			}
			str=str+" ";
		}
		System.out.println(str);
			

	}

}
