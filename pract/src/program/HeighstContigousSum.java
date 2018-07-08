package program;

public class HeighstContigousSum {

	public static void main(String[] args)
	{ 
		int a[]={11,12,22,16,17,18,4};
		for(int i=1;i<a.length;i++ )
		{
			int bsum=a[0]+a[1];
			int in=0;
			for( i=1;i<a.length-1;i++)
			{
				if(bsum<a[i]+a[i+1])
				{
					bsum=a[i]+a[i+1];
					in=i;
				}
			}
			System.out.println(bsum);
			System.out.println(a[in]);
			System.out.println(a[in+1]);
		}
			

	}

}
