package program;

public class InsertElementIntoArray
{
	static void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
   
	static int[] insert(int ar[],int ele,int inx)
	{
		int res[]=new int[ar.length+1];
		for(int i=0;i<inx;i++)
		{
			res[i]=ar[i];
		}
		res[inx]=ele;
		for(int i=inx;i<ar.length;i++)
		{
			res[i+1]=ar[i];
		}
		return res;
	}

	
	public static void main(String[] args)
	{
	 int a[]={11,12,22,1,16,17,18};
	 display(a);
	 System.out.println(".........................");
	 a=insert(a,50,2);
	 display(a);
	 

	}

}
