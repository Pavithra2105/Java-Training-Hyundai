package OOPsExample;

class OopsCon {
	int a;          //( member data )instance variable  - object variable
	int b;
	int c;
	String x;
	String y;
	
	
	void display() {
		System.out.println("Addition of "+a+" and "+b+" = "+(a+b));
		System.out.println(b+c);
		System.out.println(c-a);
	}
	
	void Show() {
		System.out.println(x);
		System.out.println(y);
	}
}
	
	public class OOPS01 {
		
	public static void main(String[] args) {
		
		OopsCon obj = new OopsCon();    //new is an keyword to create / instantiate an object    OopsCon() is adefault method called constructor
		obj.a = 3; 
		obj.b = 4;
		obj.c = 5;
		obj.display();	
		
		OopsCon obj1 = new OopsCon(); 
		obj.x = "Manoj";
		obj.y = "Kumar";
		obj.Show();                      
	
	}

}
	
	
	//Constructor create the space for the object
	//(.)dot operator to access data member and member method