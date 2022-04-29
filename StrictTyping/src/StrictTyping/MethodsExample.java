package StrictTyping;

public class MethodsExample {

	public static void main(String[] args) {
		int i = 12;
		int j = 15;;
		
		int a=23; 
		int b = 44;
		
	    int c = add(i,j);        //call method
	    int d = add(12,34);
	    int e = add(a,b);
	    int f = addInt(33,44,67);
	    
	   
	    display();
	    
	    
	System.out.println(c+" "+d+" "+e+" "+f);  
	}

	static int add(int a, int b ) {        //method defining
		return a+b;				       // method signature(int , int);
	}
	
	static int addInt(int a, int b) {        //method defining  it returned value a+b
		return a+b;				           // method signature(int , int);
	}
	static int addInt(int a, int b,int c) {
		return a+b+c;
		
	}
	
	
	public static void display() {
		System.out.println("All going good");
	}
}
