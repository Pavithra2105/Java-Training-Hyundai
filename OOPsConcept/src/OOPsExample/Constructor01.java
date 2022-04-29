package OOPsExample;

import java.util.Scanner;

class Collage{
	String name ;
	
	Collage(){                                            //constructor 1
		System.out.println("Object is created");
	}
	Collage(String n){                                    //constructor 2
		name = n;
	}
	void display() {
		System.out.println("The name of the collage is :"+name);
	}
}
public class Constructor01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Collage obj = new Collage();                        //OBJECT 1
		obj.name = "ZZZ TTT YYY";
		obj.display();
		
		Collage obj1 = new Collage("Manojkumar R");          //OBJECT 2
		obj1.display();
	}
}
