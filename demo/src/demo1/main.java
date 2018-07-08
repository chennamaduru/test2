package demo1;

public class main {

	public static void main(String[] args)
	{
		Employee e1=new Employee(13,"ramu",45612.00);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		e1.setSalary(98745.00);
		System.out.println(e1.getSalary());
		

	}

}
