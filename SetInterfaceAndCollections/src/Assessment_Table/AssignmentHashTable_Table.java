package Assessment_Table;

import java.util.*;
class Student{
	
	private static final boolean int = false;
	String Name;
	Integer StudentId; 
	String Course ;
	Integer score;
	
	
	void Student_Input() {
		Scanner in = new Scanner(System.in);
		 HashMap<String, Integer> hml = new HashMap<String, Integer>();	 
		 for (int i = 0; i <1; i++) {
			 System.out.println("Enter the Name  = ");
			  Name = in.next();
			  System.out.println("Enter the StudentId = ");
	          StudentId = in.nextInt();
	          System.out.println("Enter the Subject = ");
	          Course = in.next();
	          System.out.println("Enter Score = ");
	          score = in.nextInt();
	          
	          hml.put(Name, StudentId);
	          hml.put(Course,score);
	}
//		 System.out.println(" Name  = "+Name);
//         System.out.println(" Student Id  = "+StudentId);
		 
         
        
         for(String i:hml.keySet()){
         System.out.println(hml.get(Name)+" "+hml.get(StudentId));
         System.out.println(hml.get(Course)+" "+hml.get(score));
         }  
     }     
}

public class AssignmentHashTable_Table {
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.Student_Input();

	}

}
