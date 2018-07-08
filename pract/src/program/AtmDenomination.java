package program;
import java.util.Scanner;


public class AtmDenomination {

	private static Scanner scr;

	public static void main(String[] args)
	{
		scr = new Scanner(System.in);
		System.out.println("enter amount");
		int amt=scr.nextInt();
		if(amt > 0)
        {
            int x = amt % 10;
            
            if(x!=0){
            	System.out.println("Invalid amount..");
            }
            else{
        

		int n10=0,n20=0,n50=0,n100=0,n500 = 0, n2000=0, count=0;
		if(amt>1&&amt<50000)
		{
			while(amt>=2000)
			{
				n2000=amt/2000;
				amt=amt%2000;
				System.out.println("noof 2000 notes are:"+n2000);
				break;
			}
			while(amt>=500)
			{
				n500=amt/500;
				amt=amt%500;
				System.out.println("noof 500 notes are:"+n500);
				break;
			}
			while(amt>=100)
			{
				n100=amt/100;
				amt=amt%100;
				System.out.println("noof 100 notes are:"+n100);
				break;
			}
			while(amt>=50)
			{
				n50=amt/50;
				amt=amt%50;
				System.out.println("noof 50 notes are:"+n50);
				break;
			}
			while(amt>=20)
			{
				n20=amt/20;
				amt=amt%20;
				System.out.println("noof 20 notes are:"+n20);
				break;
			}
			while(amt>=10)
			{
				n10=amt/10;
				amt=amt%10;
				System.out.println("noof 10 notes are:"+n10);
				
			}
			if(amt==0)
			{
				count=n2000+n500+n100+n50+n20+n10;
				System.out.println("total no of minimal notes:" +count);
			}
			else
			{
				System.out.println(-1);
			}
		}
            }
			
		}
	}
    
}
