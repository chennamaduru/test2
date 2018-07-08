package program;

public class FirstAndSecondLowest {

	public static void main(String[] args) 
	{
	 int a[]={12,1,5,8,23,16,15};
	 int fsmall=a[0];
	 int ssmall=a[1];
	 for(int i=1;i<a.length;i++)
	 {
	  if(fsmall>a[i])
	  {
		  ssmall=fsmall;
		  fsmall=a[i];
	  }
	  else if(ssmall>a[i])
	  {
		  ssmall=a[i];
	  }
	 }
     System.out.println(fsmall);
     System.out.println(ssmall);
	}

}
