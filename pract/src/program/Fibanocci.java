package program;

public class Fibanocci {

	public static void main(String[] args)
	{
	int n=8;
	int f1=0;
	int f2=1;
	int f3=0;
	while(n>0)
	{
		System.out.print(f1);
		f3=f1+f2;
		f1=f2;
		f2=f3;
		n--;
	}

	}

}
