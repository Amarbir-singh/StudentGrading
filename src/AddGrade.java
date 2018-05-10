import java.util.*;

public class AddGrade 
{
	
	
	private String subject;
	 Grade g1= new Grade(75,80,80,78);
	 Scanner scanner = new Scanner(System.in);
	 private void loopMethod(String subject) 
	 {
			// TODO Auto-generated method stub
		 int loop=0;
		 System.out.println("No. of times you want to enter the marks for this subject");
		 loop = scanner.nextInt();
		 
		 for(int i=0;i<loop;i++)
		 {
			 System.out.print("Enter the  marks of the subject");
			 if(subject.equals("m"))
	           g1.setMath(scanner.nextInt());
			 if(subject.equals("e"))
				 g1.setEnglish(scanner.nextInt()); 
		    if(subject.equals("p"))
		    	g1.setPhysics(scanner.nextInt());	 
			if(subject.equals("c"))
				g1.setChemistry(scanner.nextInt());
		 }
		
		}
	 
	 public void setMarks()
	 {
		 subject=scanner.next();
		 
		 if(subject.equals("m"))
		 {
		       loopMethod("m");
		 }
		 if(subject.equals("e"))
		 {
			 loopMethod("e");
		 }
		 if(subject.equals("p"))
		 {
			 loopMethod("p");
		 }
		   
		 
		 if(subject.equals("c"))
		 {
			 loopMethod("c");		  
		 }
	 }
	 
	 
	public LinkedList<Object> getMarks()
	 {
		 System.out.println("To know the marks enter \nfor math 'm'\nfor english 'e\nfor physics 'p'\nfor chemistry 'c'");
		  subject =scanner.next();
		  
		  
		  if(subject.equals("m"))
		  {
			  return g1.getMath();
		  }
		  if(subject.equals("e"))
		  {
			  return  g1.getEnglish();
		  }
		  if(subject.equals("p"))
		  {
			  return g1.getPhysics();
		  }
		  if(subject.equals("c"))
		  {
			  return  g1.getChemistry();
		  }
		return null;
		 
	 }
     
}
