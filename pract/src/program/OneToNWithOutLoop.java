package program;

public class OneToNWithOutLoop
{

	
	static void display(int n)
	{
		if(n>1)
			display(n-1);
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		
display(10);
	}

}
