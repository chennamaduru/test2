package consInjectionVandO;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder
{	
 public List findMovies(int year)
 {
	 List moviesList=new ArrayList();
	 if(year==2018)
	 {
		 moviesList.add("rangasthalam");
		 moviesList.add("mahanati");
		 moviesList.add("kalii");
	 }
	 else
	 {
		 System.out.println("sorry collection nt found");
	 }
	 return moviesList;
 }
}
