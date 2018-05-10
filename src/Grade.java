import java.util.LinkedList;

public class Grade 
{
    LinkedList<Object> linkedList1 = new LinkedList<Object>();
   public LinkedList<Object> linkedList2 = new LinkedList<Object>();
   public LinkedList<Object> linkedList3 = new LinkedList<Object>();
   public LinkedList<Object> linkedList4 = new LinkedList<Object>();
   
   
 
public Grade(int math, int english, int physics, int chemistry)
{
	// TODO Auto-generated constructor stub
	 linkedList1.add(math);
	  linkedList2.add(english);
	  linkedList3.add(physics);
	  linkedList4.add(chemistry);
}

  public LinkedList<Object> getMath()
  {
	  return linkedList1;
  }
  public LinkedList<Object> getPhysics()
  {
	  return linkedList3;
  }
  public LinkedList<Object> getEnglish()
  {
	  return linkedList2;
  }	
  public LinkedList<Object> getChemistry()
  {
	  return linkedList4;
  }
  public void setMath(int math)
  {
	  linkedList1.add(math);
  }
  public void setEnglish(int english)
  {
	  linkedList2.add(english);
  }
  public void setPhysics(int physics)
  {
	  linkedList3.add(physics);
  }
  public void setChemistry(int chemistry)
  {
	  linkedList4.add(chemistry);
  }
  public int totalMath()
  {
	  int total =0;
	 
	  for(int i=0;i<linkedList1.size();i++)
	  {
		  
		  total =total+(int) linkedList1.get(i);
	  }
	  return total;
  }
  public int totalEnglish()
  {
	  int total =0;
	 
	  for(int i=0;i<linkedList2.size();i++)
	  {
		  
		  total =total+(int) linkedList2.get(i);
	  }
	  return total;
  }
  public int totalPhysics()
  {
	  int total =0;
	 
	  for(int i=0;i<linkedList3.size();i++)
	  {
		  
		  total =total+(int) linkedList3.get(i);
	  }
	  return total;
  }
  public int totalChemistry()
  {
	  int total =0;
	 
	  for(int i=0;i<linkedList4.size();i++)
	  {
		  
		  total =total+(int) linkedList4.get(i);
	  }
	  return total;
  }
  
}
