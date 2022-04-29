package Abstraction;

class Employee{
	String name;
	int Basic_Salary ;
	int HRA;
	int MedReimburse;
	int convey;
	double gross_salary;
	
	Employee(String n , int BasSal , int hra , int MedRbs , int Con , double groSal){
		name = n;
		Basic_Salary = BasSal;
		HRA = hra;
		MedReimburse = MedRbs;
		convey = Con;
		gross_salary = groSal;
	}
	
	double salary() {
		double sal =  Basic_Salary + HRA + MedReimburse + convey ;
		return sal;
	}
	
	double salary(int bonus) {         //method over loading
		double sal =  Basic_Salary + HRA + MedReimburse + convey + bonus;
		return sal;
	}
	double salary(double varpay) {     //method over loading
		double sal =  Basic_Salary + HRA + MedReimburse + convey + varpay;
		return sal;
	}


	
}

public class Polymorphism {

	public static void main(String[] args) {
		Employee obj =  new Employee("MANOJ",1000,500,100,10, 5);
		Employee obj1 =  new Employee("HEAMENTH",2000,700,400,10, 5);
		Employee obj2 =  new Employee("KUMAR",8000,500,800,10, 5);
		
		double salary = obj.salary();
		System.out.println("Salary of software Engineer is : "+salary);
		salary = obj1.salary(1200.5);
		System.out.println("Salary of Team Leader is : "+salary);
		salary = obj2.salary(5000);
		System.out.println("Salary of Manager is : "+salary);
		System.out.println( 5 + 6 );    // + ADD TWO NUMBER 5 AND 6 ( integer )
		System.out.println( "5" + "6" );    // +
		System.out.println( "MANOJ" + "KUMAR" );
	}
}
