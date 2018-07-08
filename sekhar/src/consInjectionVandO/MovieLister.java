package consInjectionVandO;

public class MovieLister 
{
  private int year;
  private MovieFinder finder;
  public void movieLister(int year,MovieFinder finder)
  {
	  this.year=year;
	  this.finder=finder;
  }
  public void printShow()
  {
	  
  }
}
