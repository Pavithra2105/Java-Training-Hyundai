package LambdaFunctions;

interface Drawable {
	
	void draw();
}

class Draw1 implements Drawable {
	
	public void  draw() {
		System.out.println("Drawing some shapes");
	}
	
}

public class WithoutLambdaExample {

	public static void main(String[] args) {
		
		Drawable d1 = new Draw1();  //object reference to the interface
		d1.draw();
		
		Drawable d2 = new Drawable(){        //anonymous class
			public void draw() {
				System.out.println("Drawing some another shapes");
			}
		};
		d2.draw();
		
	}

}
