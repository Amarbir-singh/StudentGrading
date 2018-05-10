import java.util.Scanner;

public class ControlRoom 
{
	
   public static void main(String[] args)
   {
	     control();
	}
   public static void control()
   {
	   
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter\n'p' for personal information.\n'g' for viewing grade \n'c' for Course available ");
	   String pointer = scanner.next();
	   if(pointer.equals("p"))
	   {
		 PersonalInformation c2 = new PersonalInformation();
		   c2.getID();
	   }
	   else if(pointer.equals("g"))
	   {
		   String pointer1;
		   AddGrade ag1 = new AddGrade();
		   do
		   {
		    System.out.println("To enter the marks enter \nfor math 'm'\nfor english 'e'\nfor physics 'p'\nfor chemistry 'c'");
	        ag1.setMarks();
	        System.out.println("To set te marks of another subject\nEnter 'other'");
	        pointer1 = scanner.next();
		   }while(pointer1.equals("other"));
	       
	       System.out.println(ag1.getMarks());
	   }
	   else if(pointer.equals("c"))
	   {
		   CourseAvailable c1 = new CourseAvailable();
		   c1.getCourse();  
	   }
	   else
	   {
		   System.out.println("Only Enter 'p' or 'g' or 'c'");
	   }
	   scanner.close();
   }
  
}
