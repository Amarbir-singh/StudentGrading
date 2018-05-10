import java.util.Scanner;

public class PersonalInformation 
{
	ControlRoom cr1 = new ControlRoom();
	Scanner scanner = new Scanner(System.in);
	void getID()
	{
		do
		{
	      System.out.print("For the address -\n Enter 'A'\n Email Adress 'E' -\nSocial Security Number 'S'- ");
	      String pe = scanner.next();
	      if(pe.equals("a"))
	      {
	        	System.out.println("App: 25 \n649 jarry west\nH3N1G3\nMontreal,Quebec.");
	      }
	      else if(pe.equals("e"))
	      {
	    	System.out.println("The email address is: amargill.r@gmail.com");
	      }
	      else if(pe.equals("s"))
	      {
	        	System.out.println("The Social Security Number is 939333231");
	      }
	      else
	      {
	    	return;//use go to statement here later to go to back to the main program 
	      }
	      
	      
	      System.out.println("For more information enter 'next'");
	      System.out.println("To return back to main window enter 'back'");
	      String pointer = scanner.next();
	      if(pointer.equals("back"))
	    	 ControlRoom.control();
		}while(scanner.next().equals("next"));
	}
}
