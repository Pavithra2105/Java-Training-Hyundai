
/*Method overriding*/

package InHeritanvce;

class Shape{                          //parent class
	
	Shape(){						  //constructor will not over ridden 
		System.out.println("An obj of shape is created");
	}
	
	void drawShape() {				  //methods can over ridden
		System.out.println("I am inside the shape class");
		System.out.println("I am drawing ashape");
	}
	void showsShape() {
		System.out.println("MyShape is Displayed !!!");
	}
}

class Rectangle extends Shape {          //sub class
	
	void drawShape() {
		System.out.println("I am inside the Rectangle class");
		System.out.println("I am drawing ashape - call me Rectangle class");
		}
		void showsShape() {
			System.out.println("MyRectangle is Displayed !!!");
		}
}

class Circle extends Shape {          //sub class
	
	void drawShape() {
	System.out.println("I am inside the Circle class");
	System.out.println("I am drawing ashape - call me circle class");
	}
	void showsShape() {
		System.out.println("MyCircle is Displayed !!!");
	}
}
	
public class Inheritance01 {
	
	public static void main(String[] args) {
		System.out.println("OBJECT OF THE SHAPE CLASS  !!!");
		Shape obj = new Shape();
		obj.drawShape();
		obj.showsShape();
		System.out.println("\n");
		
		System.out.println("OBJECT OF THE RECTANGLE CLASS  !!!");
		Rectangle rect = new Rectangle();
		rect.drawShape();
		rect.showsShape();
		System.out.println("\n");
		
		System.out.println("OBJECT OF THE CIRCLLE CLASS  !!!");
		Circle cir = new Circle();
		cir.drawShape();
		cir.showsShape();
	}


}
