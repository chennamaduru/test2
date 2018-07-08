
public class IntStack {

	private int[] stack;
	private int size;
	private int top;
	public IntStack()
	{
		top=-1;
		size=50;
		stack= new int[50];
	}
	public IntStack(int size)
	{
		top=-1;
		size=this.size;
		stack= new int[this.size];
	}
	public boolean push(int item)
	{
		if(!isFull())
		{
		top++;
		stack[top]=item;
		return true;
		}
		else
		{
			return false;
		}
	}
	public int pop()
	{
		return stack[top--];
	}
	public boolean isFull()
	{
		return (top==stack.length-1);
	}
	public boolean isEmpty()
	{
		return (top==-1)
	}
}
