package program;

public class CommanElementsInTwoArrays 
{

	public static void main(String[] args)
	{
	 int a[]={11,12,22,1,16,17,18};
	 int b[]={10,12,18,9,5,22};
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<b.length;j++)
		 {
			 if(a[i]==b[j])
			 {
				 System.out.println(a[i]);
				 break;
			 }
		 }
			 
	 }

	}

}
