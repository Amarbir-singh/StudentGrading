import java.util.LinkedList;
import java.util.Scanner;

public class CourseAvailable 
{
	Scanner scanner = new Scanner(System.in);
     private String kd;
    
    
 	LinkedList<String> a0 = new LinkedList<String>();
  	LinkedList<String> a1 = new LinkedList<String>(); 
  	LinkedList<String> a2 = new LinkedList<String>(); 
  	LinkedList<String> a3 = new LinkedList<String>(); 
  	LinkedList<String> a4 = new LinkedList<String>(); 
  	LinkedList<String> a5 = new LinkedList<String>(); 
     public void getCourse()
	{
	
	  	a0.add(" No. ");
	  	a0.add("1.     ");
	  	a0.add("2.     ");
	  	a0.add("3.     ");
	  	a0.add("4.     ");
	  	a1.add("  Number        ");
	  	a1.add(" 201-1A5-MT     ");
	  	a1.add(" 420-ENH-MT     ");
	  	a1.add("  420-MT-ENJ    ");
	  	a1.add("  420-ENP-MT    ");
	  	a2.add("  gr     ");
	  	a2.add("  00305  ");
	  	a2.add("  00305  ");
	  	a2.add("  00305  ");
	  	a2.add("  00305  ");
	  	a3.add("Title of the course                 ");
	  	a3.add(" Mathematics                        ");
	  	a3.add(" Introduction to Mobile Programming ");
	  	a3.add(" Mobile Software Development        ");
	  	a3.add(" Object-oriented Programming        ");
	  	a4.add(" Teacher ");
	  	a4.add("pp       ");
	  	a4.add("pp       ");
	  	a4.add("pp       ");
	  	a4.add("pp       ");
	  	a5.add(" Hours");
	  	a5.add("x     ");
	  	a5.add("x     ");
	  	a5.add("x     ");
	  	a5.add("x     ");
	  	
			  display(a1.size());
	
		System.out.println("Enter 'a' to Add a subject\n or \n Enter 'd' to delete a subject");
         kd = scanner.next();		
		if(kd.equals("a"))
		{
			System.out.print("Enter the no. of the Subject:                   ");
			a1.add(scanner.next());
			System.out.print("Enter the  Number of the Subject:               ");
			a2.add(scanner.next());
			System.out.print("Enter the Title of the Subject of the Subject:  ");
			a3.add(scanner.next());
			System.out.print("Enter the Teacher of the Subject:               ");
			a4.add(scanner.next());
			System.out.print("Enter the hours of the Subject:                 ");
			a5.add(scanner.next());
			display(6);
		}
		else if(kd.equals("d"))
		{
			/*
			 * needed to go through try to give more time
			 * */
		}
		else
		{
			System.out.println("Only enter 'a' or 'd'");
		}
		
		scanner.close();
	}
	 public void display(int count)
     {
    	 for(int j=0;j<a1.size();j++)
		   {
			   System.out.print(a0.get(j)); 
				 System.out.print("    ");   
			 System.out.print(a1.get(j)); 
			 System.out.print("    "); 
			 System.out.print(a2.get(j)); 
			 System.out.print("    "); 
			 System.out.print(a3.get(j)); 
			 System.out.print("    "); 
			 System.out.print(a4.get(j)); 
			 System.out.print("    "); 
			 System.out.print(a5.get(j)); 
			 System.out.print("    "); 
			 System.out.println();  
			 
		   }
     }

}