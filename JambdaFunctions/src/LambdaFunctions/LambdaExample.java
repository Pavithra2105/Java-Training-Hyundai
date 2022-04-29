package LambdaFunctions;

interface DrawExample{
	void draw2(String Shape);
}

class DrawExample2 implements DrawExample{
	
	public void draw2(String Shape) {
			Shape = "Circle";
	}
}
public class LambdaExample {

	public static void main(String[] args) {
		
		DrawExample d1 =(Shape)-> {   //Lambda functions
				System.out.println("Drawing some shpes from Lambda Functions "+Shape);	
			};
			d1.draw2("Circle");
			
			
		DrawExample d2 =(Shape)-> {
			System.out.println("Draw  from Lambda Functions ********* "+Shape);
			};
			d2.draw2("Triangle");
			
		DrawExample d3 =(Shape)-> {
				System.out.println("Drawing shpes from Lambda Functions "+Shape);
			};
			d3.draw2("Rectangle");
		}

	}


