package program;

public class Star {

	public static void main(String[] args)
	{
		int n=15;
		int spc=n/2;
		int str=1;
		for(int i=0;i<n;i++)
		{
			
		for(int j=0;j<spc;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<str;j++)
		{
			System.out.print("*");
		}
		if(i>=n/2)
		{
			spc++;
			str=str-2;
		}
		else
		{
		  str=str+2;
		  spc--;
			
		}
			System.out.println();
		}
	}
}
		