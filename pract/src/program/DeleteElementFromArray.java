package program;

public class DeleteElementFromArray
{
	static void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
	static int[] delete(int ar[],int inx)
	{
		int res[]=new int [ar.length-1];
		for(int i=0;i<inx;i++)
		{
			res[i]=ar[i];
		}
		for(int i=inx+1;i<ar.length;i++)
		{
			res[i-1]=ar[i];
		}
		return res;
	}
	
	
	
	public static void main(String[] args)
	{
		int a[]={11,12,22,1,16,17,18};
		 display(a);
		 System.out.println(".........................");
		 a=delete(a,2);
		 display(a);

	}

}
