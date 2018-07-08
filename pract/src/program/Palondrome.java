package program;

 class Palondrome {
	public static void main(String args[])
	{
		
		int sum=0;
		int r;
		int temp;
		int n=454;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("given num is palondrome");
		}
		else
		{
			System.out.println("not palindrome.");
		}
	}

}
