import java.util.LinkedList;

public class Test2 
{
	LinkedList<Object> linkedList1 = new LinkedList<Object>();
	public Test2(int m)
	{
		linkedList1.add(m);
	}
	public void set(int m )
	{
		linkedList1.add(m);
	}
	public LinkedList<Object>get()
	{
		return linkedList1;
	}
}
