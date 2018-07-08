package program;

public class MergeTwoArrays
{

	public static void main(String[] args)
	{
		 int a[]={11,12,22,1,16,17,18};
		 int b[]={10,12,18,9,5,22};
		 int res[]=new int[a.length+b.length];
		 int k=0;
		 for(int i=0;i<a.length&&i<b.length;i++)
		 {
			 res [k]=a[i];
			 k++;
			 res[k]=b[i];
			 k++;
		 }
		 System.out.println(res);

	}

}
