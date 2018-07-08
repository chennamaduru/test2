  package program;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scr.nextLine();
		char ch[]=str.toCharArray();
		str=" ";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
            while(i<ch.length&& ch[i]!=' ')
            {
				i++;
			}
            int j=i-1;
            while(j>=k)
            {
            	str=str+ch[j];
            	j--;
            }
          str=str+" ";
		}
		
       System.out.println(str);
	}

}
