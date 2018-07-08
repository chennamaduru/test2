package program;

public class Distinct
{

	public static void main(String[] args)
	{
		 int a[]={11,12,22,1,16,17,18};
		 int b[]={10,12,18,9,5,22};
		 for(int i=0;i<a.length;i++)
		 {
			 int find=0;
			 for(int j=0;j<b.length;j++)
			 {
				 if(a[i]==b[j])
				 {
					 find=1;
					 break;
				 }
			 }
			 if(find==0)
			 {
				 System.out.println(a[i]);
			 }
		 }
		 for(int i=0;i<b.length;i++)
		 {
			 int find=0;
			 for(int j=0;j<a.length;j++)
			 {
				 if(b[i]==a[j])
				 {
					 find=1;
					 break;
				 }
			 }
			 if(find==0)
			 {
				 System.out.println(b[i]);
			 }
		 }

	}

}
