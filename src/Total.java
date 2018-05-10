import java.util.LinkedList;
import java.util.Scanner;

public class Total
{
    Grade g1 = new Grade();
    Scanner scanner = new Scanner(System.in);
    public int getTotal()
    {
    	String subject;
    	String pointer;
    	do
    	{
            System.out.println("To get the total of math = 'm\nfor english ='e'\nfor physics ='p\n for chemistry = 'c''");
            subject = scanner.next();
            if(subject.equals("m"))
              return g1.totalMath();
		    if(subject.equals("e"))
		    	return g1.totalEnglish(); 
	        if(subject.equals("p"))
	         return g1.totalPhysics();	 
		    if(subject.equals("c"))
		     return g1.totalChemistry();
		    System.out.println("To get the total of another subject\nenter 'other'");
    	       pointer =scanner.next();
    	}while(pointer.equals("other"));
    	return 0;
    }
}
