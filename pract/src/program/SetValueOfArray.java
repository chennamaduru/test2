package program;

public class SetValueOfArray 
{
	
	
	static void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
	static int[] set(int ar[],int ele,int inx)
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[inx]=ele;
		}
		return ar;
	}
	
	
	public static void main(String[] args)
	{
		int a[]={11,12,22,1,16,17,18};
		 display(a);
		 System.out.println(".........................");
		 a=set(a,50,2);
		 display(a);

	}

}
