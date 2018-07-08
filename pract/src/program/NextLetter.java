package program;
import java.util.Scanner;

public class NextLetter {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String st=scr.nextLine();
		char  ch[]=st.toCharArray();
		st=" ";
		for(int i=0;i<ch.length;i++)
		{
			st= st+(char)(ch[i]+1);
		}
       System.out.println(st);
	}

}
