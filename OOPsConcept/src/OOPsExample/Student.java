package OOPsExample;

import java.util.Scanner;

class Example {

	String StuName ;
	int StId ;
	String TeacherName;
	int marks;
	int[] nums = {56, 75, 90};
    int sum = 0;
    int average;
	

	void Display() {
		System.out.println("Student name :"+StuName);
		System.out.println("Student name :"+StId);
		System.out.println("Student name :"+TeacherName);
		
	}

	
	void calculate() {
		int i = 0;
		while(i < nums.length) {
            sum += nums[i];
            i++;
	 average = (sum / nums.length);
		}
		System.out.println("Average : "+average);
		
		if(average >= 70) {
			System.out.println("Grade A");
		}else if(average >= 50 || average <= 69){
			System.out.println("Grade B");
		}else if(average <= 50) {
			System.out.println("Grade C");
		}
	}
}


public class Student {
	
	public static void main(String[] args) {
		
		Example obj = new Example();
		obj.StuName = "Manoj";
		obj.StId = 2345; 
		obj.TeacherName ="Ananth sir";
		obj.Display();
		
		obj.calculate();
//		obj.StuName = obj.StuName + " R ";
//		obj.Display();

	}
}


//some thing went wrong need to check



