package SuperClassExample;

import java.util.Scanner;

class Coach{
	String title;
	String name;
	int Salary;

	
	Coach(String t , String n){
		title = t;
		name = n;
	}
	
	void Display() {
		System.out.println(this.title+" : "+this.name);
	}
	}

class Trainer extends Coach{
	int age;
	Trainer(String t , String n ,int a){
		super(t,n);
		//this.name = name;
		age = a;
	}
	
	void Display() {
		System.out.println(this.title+" "+this.name+" Age = "+this.age);
	}
}

class MathTrainer extends Trainer{
	int Experiance;
	int  Bonus;
	MathTrainer(String t, String n, int a , int Exp , int Bon) {
		super(t, n, a);
		Experiance = Exp;
		Bonus = Bon;
	}
	
	void Calculation() {
		Salary = Experiance * Bonus; 
	}
	void Display(){
		System.out.println("Salary ="+Salary); 
	}
	
}


public class SuperConstuctor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String n_name = s.next();
		System.out.println("Enter Title = ");
		String b_Title = s.next();
		System.out.println("Enter your age = ");
		int a_age = s.nextInt();
		System.out.println("Enter your Experiance = ");
		int E_Exp = s.nextInt();
		System.out.println("Enter the Bonus = ");
		int B_Bon = s.nextInt();
		
		Coach obj = new Coach(n_name,b_Title);
		obj.Display();
		
		Trainer obj2 = new Trainer(n_name,b_Title,a_age);
		obj2.Display();
		
		MathTrainer obj3 = new MathTrainer(n_name,b_Title,a_age,E_Exp,B_Bon);
		obj3.Calculation();
		obj3.Display();
	}

}
