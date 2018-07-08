package consInjectionVandO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext ("consInjectionVandO.xml");
          Object ob=ctx.getBean("movielister");
          MovieLister lister=(MovieLister)ob;
          lister.printShow();
	}

}
