package program;

public class FirstAnaSecondBiggest {

	public static void main(String[] args) 
	{
        int a[]={11,12,22,1,16,17,18};
        int fbig=a[0];
        int sbig=a[1];
       for(int i=1;i<a.length;i++)
       {
    	   if(fbig<a[i])
    	   {
    		   sbig=fbig;
    		   fbig=a[i];
    	   }
    	   else if(sbig<a[i])
    	   {
    		 sbig=a[i]; 
    	   }
       }
        System.out.println(fbig);
        System.out.println(sbig);
	}

}
