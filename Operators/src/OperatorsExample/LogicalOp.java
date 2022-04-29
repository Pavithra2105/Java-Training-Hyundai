package OperatorsExample;

public class LogicalOp {

	public static void main(String[] args) {
		
		//&& || and , or 
		
		int a = 12;
		int b = 34;
		if( a>10 && b>10) {
			System.out.println("a and b both grater than 10");
		}else {
			System.out.println("both are less than 10");
		}
		
		if(a<10 && b++>10 ) { 
			System.out.println("a and b is grater than 10");
		}else {
			System.out.println(b);
		}

		if(a<10 && b++<10 ) { //it does considered both , once it finds false it will consider false
			System.out.println("a and b is grater than 10");
		}else {
			System.out.println(b);
		}
		
		if(a<10 || b++>10 ) { 
			System.out.println("a and b is grater than 10");
		}else {
			System.out.println(b);
	}
		if(a>10 || b++<10 ) { //it does not considered both , once it finds true it will consider true 
			System.out.println("a and b is grater than 10");
		}else {
			System.out.println(b);
	    }

	}
}
