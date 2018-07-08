package Password;
import java.util.Scanner;

public class Stringdictory {

	public static void main(String[] args)
	{
		Scanner scr =new Scanner(System.in);
		System.out.println("enter a string");
		String st1=scr.nextLine();
		char ch[]=st1.toCharArray();
		String st=" ";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				st=st+ch[i];
				i--;
			}
			st=st+" ";
		}
		
     System.out.println(st);
	}

}
