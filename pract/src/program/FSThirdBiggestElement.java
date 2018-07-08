package program;

public class FSThirdBiggestElement {

	public static void main(String[] args)
	{
		int a[]={11,12,22,1,16,17,18};
        int fbig=a[0];
        int sbig=a[1];
        int tbig=a[2];
        for(int i=1;i<a.length;i++)
        {
        	if(fbig<a[i])
        	{
        		sbig=fbig;
        		tbig=sbig;
        		fbig=a[i];
        	}
        	else if(sbig<a[i])
        	{
        		tbig=sbig;
        		sbig=a[i];
        	}
        	else
        	{
        		tbig=a[i];
        	}
        }
        System.out.println(fbig);
        System.out.println(sbig);
        System.out.println(tbig);
	}
}
