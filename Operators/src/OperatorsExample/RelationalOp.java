package OperatorsExample;

public class RelationalOp {

	public static void main(String[] args) {
		
		// > , < , <= , >= , == , != .... 
		
		int a = 13;
		int b = 15;
		System.out.println(a>b);
		System.out.println(b>a);
		
		
		
		if(a>b) {
			System.out.println("a is grater");
		}else {
			System.out.println("b is grater");
		}
		
		int c =13;
		if(a>=c) {
			System.out.println("a is grater than or equal to C");
		}else {
			System.out.println("a is less than c");
		}
		
		if( a == c ) {
			System.out.println("a is equal to C");
		}if( a!=b) {
			System.out.println("a is not equal to b");
		}
		
		//higher precidence
		if((a+b)>c) {
			System.out.println("a+b is grater than c");
		}
	}

}
