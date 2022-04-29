package Abstraction;

abstract class Gomentry {
	
	
	abstract double perimeter();
	
	void display() {
		System.out.println("Perimeter is : ");
	}
}
class Circle extends Gomentry{
	int radius;
	double pmeter;
	
	double perimeter() {                       //method implementing 
		return pmeter = 2*3.1415*radius;
	}
	Circle(int rad){                           //constructor
		radius = rad;
	}
	
}
class Square extends Gomentry{
	int side;
	double pmeter;
	
	double perimeter() {                       //method implementing
		return pmeter = 4*side;
	}
	Square(int s){                              //constructor
		side = s;
	}

}

//pending

public class AbstractMethod {

	public static void main(String[] args) {
		Circle cr = new Circle(6);
		cr.display();
		System.out.println((cr.perimeter()));
		Square Sqr = new Square(5);
		System.out.println((Sqr.perimeter()));
		Sqr.display();

	}

}
