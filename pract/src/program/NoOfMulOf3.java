package program;

public class NoOfMulOf3 {

	public static void main(String[] args) 
	{
		int  a[]={11,12,22,1,16,17,18};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
