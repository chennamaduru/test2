package collections;
import java.util.*;

public class LinkedEx {

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("red");
		ll.add("blue");
		ll.add("green");
		ll.add("white");
		ll.add("black");
		for(String e: ll)
		{
			System.out.println(e);
		}
		ListIterator lt=ll.listIterator();
	
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
			
		
		

	}

}
