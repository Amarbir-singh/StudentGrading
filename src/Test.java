import java.util.LinkedList;

public class Test 
{
   public static void main(String[] args)
   {
	   LinkedList<Object> linkedList1 = new LinkedList<Object>();
	   Test2 t1 = new Test2(5);
	   System.out.print(linkedList1);
	   t1.set(54);
	   t1.set(4);
	   t1.set(546);
	   t1.set(545);
	   t1.set(544);
	   System.out.print(t1.linkedList1.get(3));
   }
}
