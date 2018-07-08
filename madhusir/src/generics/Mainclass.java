package generics;

import java.util.ArrayList;

public class Mainclass 
{
   public static void main(String args[])
   {
	   ArrayList<String> al=new ArrayList<String>();
	   al.add("hello");
	   al.add(new object()); //compile time error
   }
}
