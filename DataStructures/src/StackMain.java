
public class StackMain {

	public static void main(String[] args) {
		IntStack intstack=new IntStack();
		if(!intstack.isFull())
		{
			intstack.push(2);
			intstack.push(4);
			intstack.push(6);
			intstack.push(8);
		}
System.out.print(intstack.pop());
	}

}
